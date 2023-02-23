package com.odo.oddexample.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Table(name = "facility_table")
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facilityId;

    @Column(name = "facility_name")
    private String name;

    @Column(name = "facility_address")
    private String address;

//    @ManyToMany
//    private Set<Decagon> facility;
//    @ManyToOne
//    private Decagon decagon;
}
