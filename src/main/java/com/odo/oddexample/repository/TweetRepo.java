package com.odo.oddexample.repository;

import com.odo.oddexample.model.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepo extends JpaRepository<Tweet, Long> {
}
