package com.bugtracker.model.roles;

public class Manager extends AbstractRole implements Role{

    private Integer ID;
    private String nameRole;
    private boolean status;
    private String description;

    @Override
    public String getRoleName() {
        return nameRole;
    }

}
