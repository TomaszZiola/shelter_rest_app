package com.ziola.shelter_rest_app.animals.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "animalsPlaces")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AnimalsPlaces {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "placeId")
    private Integer id;

    @Column(name = "freePlaces")
    private int numberOfFreePlaces;

    @Column(name = "freePlacesVip")
    private int numberOfFreePlacesVip;
}
