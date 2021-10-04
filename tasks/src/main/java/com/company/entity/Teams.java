package com.company.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "teams")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Teams {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private String team;
    @Column(nullable = false, unique = true)
    private String logoURL;
    @Column(nullable = false, unique = true)
    private String webSiteURL;
    @ManyToOne
    @JoinColumn(name = "sport_id")
    private TypeOfSport sportId;
}
