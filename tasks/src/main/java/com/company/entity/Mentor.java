package com.company.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "mentor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
