package za.ac.cput.domain;
/**
 Leslie 230453260 - Review entity
 */
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;




@Entity
@Table(name = "Review")
public class Review {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewID;


    @NotBlank(message = "Rating cannot be empty")
    private int reviewRating;


    private String reviewComments;



//    @OneToOne (mappedBy = "bookingID", cascade = CascadeType.ALL)
//    @ForeignKey bookingID;
//
//

  public Review(){}
    public Review( int reviewRating, String reviewComments) {
        this.reviewRating = reviewRating;
        this.reviewComments = reviewComments;
    }

    private Review(ReviewBuilder builder) {
        this.reviewRating = builder.buildReviewRating;
        this.reviewComments = builder.buildReviewComments;
    }

    // Get

    public int getReviewID() { return reviewID; }
    public int getReviewRating() { return reviewRating; }
    public String getReviewComments() { return reviewComments; }


    @Override
    public String toString() {
        if (this.reviewID == 0) {
            return null;
        }
        return "Review{" +
                "reviewID=" + reviewID +
                ", Rating='" + reviewRating + '\'' +
                ", Comments='" + reviewComments + '\'' +
                '}';
    }


    //////////////////////////////BUILDER/////////////////////////////////

    public static class ReviewBuilder {
        private String buildDay;
        private int buildReviewRating;
        private String buildReviewComments;


        public ReviewBuilder(){}


        public ReviewBuilder(
                int reviewRating,
                String reviewComments
        ) {

            this.buildReviewRating = reviewRating;
            this.buildReviewComments = reviewComments;
        }


        public ReviewBuilder setReviewRating(int reviewRating) {

            this.buildReviewRating = reviewRating;
            return this;
        }

        public ReviewBuilder setReviewComments(String reviewComments) {
            this.buildReviewComments = reviewComments;
            return this;
        }
        // Copy
        public ReviewBuilder copy(Review review) {
            this.buildReviewRating = review.getReviewRating();
            this.buildReviewComments = review.getReviewComments();
            return this;
        }
public Review build() {
            return new Review(this);
        }
    }
}