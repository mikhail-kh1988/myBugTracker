package com.bugtracker.model.roles;

public class Manager extends AbstractRole implements Role{


    @Override
    public String getRoleName() {
        return super.getName();
    }

}
