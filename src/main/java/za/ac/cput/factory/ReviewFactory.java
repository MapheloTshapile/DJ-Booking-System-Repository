package za.ac.cput.factory;

import za.ac.cput.domain.Review;


public class ReviewFactory {

    public static Review createReview(

           // bookingid
        int rRating,
        String rComments
                )
    {

        return new Review.ReviewBuilder()

                .setReviewRating(rRating)
                .setReviewComments(rComments)
                .build();

    }


}



