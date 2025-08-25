package za.ac.cput.factory;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.domain.Review;
import za.ac.cput.factory.ReviewFactory;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class ReviewFactoryTest {

    private Review testReview;


    // Creates basic review object to be used in tests
    @BeforeEach
    void setUp() {
        testReview = ReviewFactory.createReview(
                10,
                "Best service, will come again!"
        );
    }


    @Test
    @Order(1)
    public void testNotNull() {
        assertNotNull(testReview);
        System.out.println(testReview.toString());
    }

    @Test
    @Order(2)
    public void testReview() {

        assertEquals(10, testReview.getReviewRating());
        assertEquals("Best service, will come again!", testReview.getReviewComments());

        System.out.println(testReview.toString());
    }


    @Test
    @Order(3)
    public void testInvalidRating() {
        System.out.println("\nTesting invalid review rating...");

        String invalidRating = "bopapeep";


        assertThrows(NumberFormatException.class, () -> {
            int rating = Integer.parseInt(invalidRating);

            ReviewFactory.createReview(rating, "Great!");
        }
        );
    }


        @Test
        @Order(4)
        public void testInvalidComment () {
            // Test that null comment is handled without breaking
            Review review = ReviewFactory.createReview(5, null);
            assertNotNull(review); // Factory should handle null comment
            System.out.println(review);
        }

        @Test
        @Order(5)
        void testEquality () {
            System.out.println("\nTest Equality within: (Review Factory)");

            Review obj1 = ReviewFactory.createReview(3, "Bad food");
            Review obj2 = ReviewFactory.createReview(3, "Ugly-mannered chef. I hate Kaapstad restaurants!");

            System.out.println(obj1.hashCode());
            System.out.println(obj2.hashCode());

            assertNotEquals(obj1, obj2, "Objects are equal");
        }

    }



//         System.out.println(basicReview.toString());