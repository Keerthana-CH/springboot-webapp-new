package com.sfgspringframework6.section2.springbootwebappnew.services;

import com.sfgspringframework6.section2.springbootwebappnew.domain.Author;
import com.sfgspringframework6.section2.springbootwebappnew.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
