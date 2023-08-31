package com.sfgspringframework6.section2.springbootwebappnew.repositories;

import com.sfgspringframework6.section2.springbootwebappnew.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
