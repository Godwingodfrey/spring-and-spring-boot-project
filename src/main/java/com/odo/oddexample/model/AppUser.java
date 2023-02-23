package com.odo.oddexample.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tweeter_user_table")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appUserId;

    @Column(name = "tweeter_handle")
    private String name;
    private Integer age;

//    @OneToMany(
//            cascade = CascadeType.ALL
//    )
//    private List <Tweet> tweet;
}
