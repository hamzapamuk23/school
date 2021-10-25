package com.example.school.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "school")
public class School
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false,length = 6 ,unique = true)
    private String code;
 
    @Column(columnDefinition="boolean default false",nullable = false)
    private boolean active;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "school")
    private List<Student> student;
}
