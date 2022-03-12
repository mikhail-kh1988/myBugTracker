package com.bugtracker.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "version")
public class Version implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column(name = "external_id")
    private String externalID;
    private String name;
    private String description;

    @Column(name = "create_date")
    private LocalDateTime createDate;

}
