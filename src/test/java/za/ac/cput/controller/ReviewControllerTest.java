package za.ac.cput.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import za.ac.cput.domain.Date;
import za.ac.cput.domain.Review;
import za.ac.cput.factory.ReviewFactory;


import static org.junit.jupiter.api.Assertions.*;





@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class ReviewControllerTest {


    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    private static Review review;

    private String BASE_URL;

    //  private static final String BASE_URL = "http://localhost:8080/review";


    @BeforeAll
    public static void setUp() {
        review = ReviewFactory.createReview(4, "ITS ehhhhhhhhhhhh, yes ITS!");
    }

    @BeforeEach
    void init() {
        BASE_URL = "http://localhost:" + port + "/review";
    }

    @Test
    @Order(1)
    void createTest() {
        String url = BASE_URL + "/create";
        Review createdReview = this.restTemplate.postForObject(url, review, Review.class);

        assertNotNull(createdReview);
        assertEquals(review.getReviewComments(), createdReview.getReviewComments());

        System.out.println("Created: " + createdReview);
    }

    @Test
    @Order(2)
    void read() {
        String url = BASE_URL + "/read/" + review.getReviewID();

        Review readReview = this.restTemplate.getForObject(url, Review.class);
        assertNotNull(readReview);
        assertEquals(review.getReviewID(), readReview.getReviewID());
        System.out.println("Read: " + readReview);
    }

    @Test
    @Order(3)
    void updateTest() {
        String url = BASE_URL + "/update";

        Review updatedReview = new Review.ReviewBuilder().copy(review).setReviewComments("Sad bread.").build();
        this.restTemplate.put(url, updatedReview);
        Review readUpdatedReview = this.restTemplate.getForObject(url + review.getReviewID(), Review.class);
        assertNotNull(readUpdatedReview);
        assertNotEquals(review.getReviewComments(), readUpdatedReview.getReviewComments());
        System.out.println("Updated test is succesful if null: " + readUpdatedReview);
    }

    @Test
    @Order(3)
    void deleteTest() {
        String url = BASE_URL + "/delete/";

        this.restTemplate.delete((url) + review.getReviewID());

        Review deletedReview = this.restTemplate.getForObject(BASE_URL + "/read/" + review.getReviewID(), Review.class);
        assertNotNull(deletedReview);
        System.out.println("Deletedtest is succesful if null:"+ deletedReview);


    }


    @Test
    @Order(4)
    void getAllReviewsTest() {
        String url = BASE_URL + "/getall";
        Review[] reviews = this.restTemplate.getForObject(url, Review[].class);
        assertNotNull(reviews);
        System.out.println("All Reviews: ");
        for (Review r : reviews) {
            System.out.println(r);
        }
    }
}