package com.sfgspringframework6.section2.springbootwebappnew.services;

import com.sfgspringframework6.section2.springbootwebappnew.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
 }
