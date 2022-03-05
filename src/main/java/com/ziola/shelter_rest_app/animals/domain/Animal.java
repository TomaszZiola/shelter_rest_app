package com.ziola.shelter_rest_app.animals.domain;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "animal")
@NoArgsConstructor
@Getter
@Setter
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "animalId")
    private Integer id;

    @Size(min = 2, max = 20)
    @Column(name = "animalsName")
    private String name;

    @Column(name = "animalsAge")
    @NotNull
    private int age;

    @NotNull
    @Column(name = "animalsSpecie")
    private String specie;

    @Size(max = 450)
    @NotNull
    @Column(name = "animalsDescription")
    private String description;

    @Size(max = 150)
    @Column(name = "animalsHealth")
    @NotNull
    private String health;

    @Size(max = 45)
    @Column(name = "animalsRace")
    @NotNull
    private String race;

    @Size(max = 45)
    @Column(name = "animalsSex")
    @NotNull
    private String sex;

    @Size(max = 20)
    @Column(name = "animalsCity")
    @NotNull
    private String city;

//    @ManyToOne
//    @JoinColumn(name = "workers_id", nullable = false)
//    private Worker worker;
}
