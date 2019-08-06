package com.codegym.service;

import java.util.List;

public interface BlogService<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T model);

    void remove(Long id);


}
