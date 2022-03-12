package com.bugtracker.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "comment")
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private LocalDateTime createDate;

    @Column(name = "user_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    private String title;
    private String description;
}
