package com.bugtracker.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "projects")
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String name;

    @Enumerated(EnumType.ORDINAL)
    private ProjectType type;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    private String description;
    private int rating;

}
