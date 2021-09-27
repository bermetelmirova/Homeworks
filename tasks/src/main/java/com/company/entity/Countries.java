package com.company.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "countries")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private String country;
}
