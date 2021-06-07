package com.bugtracker.services;

import com.bugtracker.model.groups.Group;
import com.bugtracker.model.users.Status;
import com.bugtracker.model.users.User;

import java.util.List;
import java.util.Optional;

public class UserServices {

    public void createNewUser(User user){}

    public void removeUserById(Integer ID){}

    public void removeUser(User user){}

    public User findUserByID(Integer ID){
        return null;
    }

    public User findUserByEmail(String email){
        return null;
    }

    public User findUserByLogin(String login){
        return null;
    }

    public List<User> findUserByFamily(String family){
        return null;
    }

    public List<User> findUserByDepartment(String department){
        return null;
    }

    public List<User> findUserBySex(char sex){
        return null;
    }

    public List<User> findUserByStatus(Status status){
        return null;
    }

    public List<User> findUserByState(boolean state){
        return null;
    }

    public List<Group> getGroupsByUser(User user){
        return null;
    }

}
