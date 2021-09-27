package com.company.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "championship")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Championship {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Countries countryId;
    @Column(nullable = false, unique = true)
    private String championship;
    @ManyToOne
    @JoinColumn(name = "sport_id")
    private TypeOfSport sportId;
}
