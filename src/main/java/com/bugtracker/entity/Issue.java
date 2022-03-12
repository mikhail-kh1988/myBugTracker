package com.bugtracker.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "issue")
public class Issue implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    @Column(name = "external_ID")
    private String externalID;

    private String title;
    private String describe;

    @Column( name = "assign_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private User assignee;

    @Enumerated(EnumType.STRING)
    private IssueStatus status;

    @Enumerated(EnumType.STRING)
    private IssueType type;

    @Enumerated(EnumType.STRING)
    private IssuePriority priority;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @Column(name = "close_date")
    private LocalDateTime closeDate;

    @Column(name = "last_modify_date")
    private LocalDateTime lastModifyDate;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Project project;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Version version;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Category category;

}
