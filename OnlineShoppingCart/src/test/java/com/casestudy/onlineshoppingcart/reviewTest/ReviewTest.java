package com.casestudy.onlineshoppingcart.reviewTest;

import com.casestudy.onlineshoppingcart.model.Review;
import com.casestudy.onlineshoppingcart.repository.ReviewRepo;
import com.casestudy.onlineshoppingcart.service.ReviewService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReviewTest {


    @Autowired
    private ReviewService reviewService;
    @MockBean
    private ReviewRepo reviewRepo;

    @Test
    public void getAllReviewsTest() {
        when(reviewRepo.findAll()).thenReturn(Stream.of(
                new Review(3,"Samsung Edge","Dealer","ssadjhcb","scbshdc","Too Good"),
                new Review(4,"Samsung Edge","Dealer","ssadjhcb","scbshdc","Too Good"),
                new Review(5,"Samsung Edge","Dealer","ssadjhcb","scbshdc","Too Good")        )
                .collect(Collectors.toList()));

        assertEquals(3,reviewService.getAll().size());
    }

    @Test
    public void addReviewsTest() {
        Review review = new Review(3,"Samsung Edge","Dealer","ssadjhcb","scbshdc","Too Good");
        when(reviewRepo.insert(review)).thenReturn(review);
        assertEquals(review,reviewService.addReview(review));

    }

    @Test
    public void updateReviewsTest() {
        Review review = new Review(3,"Samsung Edge","Dealer","ssadjhcb","scbshdc","Too Good");
        when(reviewRepo.save(review)).thenReturn(review);
        assertEquals(review,reviewService.updateReview(review));

    }

    @Test
    public void deleteReviewsTest() {
        Review review = new Review(3,"Samsung Edge","Dealer","ssadjhcb","scbshdc","Too Good");
        reviewService.deleteReview(3);
        verify(reviewRepo,times(1)).deleteById(3);
    }
    @Test
    public void getReviewTest() {
        Review review = new Review(3,"Samsung Edge","Dealer","ssadjhcb","scbshdc","Too Good");
        reviewService.getReview(3);
        verify(reviewRepo,times(1)).findById(3);
    }
}
