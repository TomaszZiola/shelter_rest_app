//package com.ziola.shelter_rest_app.workers.domain;
//
//import com.ziola.shelter_rest_app.animals.domain.Animal;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Size;
//import java.util.List;
//
//@Entity
//@Table(name = "worker")
//@NoArgsConstructor
//public class Worker {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "workersId")
//    private Integer id;
//    @Column(name = "workersEmail")
//    @Email
//    @NotEmpty
//    private String email;
//    @Column(name = "workersPassword")
//    @Size(min = 5)
//    @NotEmpty
//    private String password;
//    @Column(name = "workersName")
//    @NotEmpty
//    private String name;
//    @Column(name = "workersLastName")
//    @NotEmpty
//    private String lastName;
//    @Column(name = "workersActive")
//    private boolean active;
//
//    @ManyToOne
//    @JoinColumn(name = "role_id", nullable = false)
//    private Role role;
//
//    @OneToMany(mappedBy = "worker")
//    private List<Animal> animals;
//}
