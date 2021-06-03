package com.bugtracker.model.roles;

public class Developer extends AbstractRole implements Role{

    private Integer ID;
    private String name;
    private boolean status;
    private String description;

    @Override
    public String getRoleName() {
        return name;
    }
}
