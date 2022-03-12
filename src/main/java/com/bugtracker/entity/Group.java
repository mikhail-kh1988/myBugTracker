package com.bugtracker.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "groups")
public class Group implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String name;
    private boolean status;
    private String description;

    @Column(name = "admin_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private User adminGroup;

    @ManyToOne(cascade = CascadeType.ALL)
    private List<User> userList;
}
