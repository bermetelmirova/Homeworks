package com.company.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "type_of_sport")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TypeOfSport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private String sport;
}
