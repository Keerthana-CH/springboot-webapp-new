package com.sfgspringframework6.section2.springbootwebappnew.services;

import com.sfgspringframework6.section2.springbootwebappnew.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
