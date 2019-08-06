package com.codegym.reposytory;

import java.util.List;

public interface BlogRepository<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T model);

    void remove(Long id);

}
