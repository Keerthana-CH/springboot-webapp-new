package com.sfgspringframework6.section2.springbootwebappnew.services;

import com.sfgspringframework6.section2.springbootwebappnew.domain.Book;
import com.sfgspringframework6.section2.springbootwebappnew.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
