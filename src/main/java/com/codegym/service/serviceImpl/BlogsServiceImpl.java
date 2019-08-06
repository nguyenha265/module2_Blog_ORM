package com.codegym.service.serviceImpl;

import com.codegym.model.Blog;
import com.codegym.reposytory.BlogRepositoryImpl;
import com.codegym.service.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogsServiceImpl implements BlogServiceImpl {

    @Autowired
    private BlogRepositoryImpl blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.remove(id);
    }


}
