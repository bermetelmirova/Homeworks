package com.company.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "student_group")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
}
