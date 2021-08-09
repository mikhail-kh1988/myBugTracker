package com.bugtracker.services;

import com.bugtracker.model.groups.Group;
import com.bugtracker.model.users.User;

import java.util.List;

public class GroupServices {

    public void crateGroup(Group group){}

    public void removeGroup(Group group){}

    public void changeNameGroup(Group group, String newName){}

    public void addUserInGroup(Group group, User user){}

    public Group findGroupByID(Integer ID){
        return null;
    }

    public List<Group> findGroupByName(String name){
        return null;
    }

    public List<Group> findGroupByStatus(boolean status){
        return null;
    }

    public List<User> getListUserByGroup(Group group){
        return null;
    }
}
