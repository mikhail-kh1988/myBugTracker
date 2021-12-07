package com.bugtracker.configuration.hibernate;

import java.util.List;

public interface GenericDAO <T, ID>{
    T findByID(long id);
    T findByName(String name);
    T save(T entity);
    List<T> findAll();
    long getCount();
    void delete(T entity);
}