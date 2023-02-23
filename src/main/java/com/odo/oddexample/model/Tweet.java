package com.odo.oddexample.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tweet_table")
@Entity
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tweetId;
    private String post;
    private String reaction;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "tweetUserId",
            referencedColumnName = "appUserid"
    )
    private AppUser appUser;
}
