package com.odo.oddexample.repository;

import com.odo.oddexample.model.AppUser;
import com.odo.oddexample.model.Tweet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppUserRepoTest {

    @Autowired
    private AppUserRepo appUserRepo;

    @Autowired
    private TweetRepo tweetRepo;

    @Test
    public void userMakeATweet(){
        AppUser newHandle = new AppUser(1L,"Godwin", 19);
        appUserRepo.save(newHandle);
        Tweet newTweet = new Tweet(1L, "Hello World","Smiley",newHandle);
        Tweet newTweet2 = new Tweet(2L, "I don show","Smiley",newHandle);
        Tweet newTweet3 = new Tweet(3L, "Dem don suspend my account oo","Sad",newHandle);

        List<Tweet> newTweets = List.of(newTweet, newTweet2, newTweet3);
        tweetRepo.saveAll(newTweets);

        assertTrue(tweetRepo.saveAll(newTweets).isEmpty());
    }

}