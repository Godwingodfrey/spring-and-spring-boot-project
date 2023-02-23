package com.odo.oddexample.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Table(name = "decagon_table")
public class Decagon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long decagonId;

    @Column(name = "deca_name")
    private String name;

    @Column(name = "deca_email")
    private String email;

    @ManyToMany
    private Set<Facility> facility;
//    @OneToMany
//    private List<Facility> facility;

//    @OneToOne
//    private Facility facility;
}
