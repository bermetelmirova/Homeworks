package com.company.entity;

import lombok.*;

import javax.persistence.*;

@Table(name = "championship_team")
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class ChampionshipTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "championship_id")
    private Championship championship;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Teams team;
}