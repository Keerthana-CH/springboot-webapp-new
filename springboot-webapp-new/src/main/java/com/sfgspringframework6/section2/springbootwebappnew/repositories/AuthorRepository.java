package com.sfgspringframework6.section2.springbootwebappnew.repositories;

import com.sfgspringframework6.section2.springbootwebappnew.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
