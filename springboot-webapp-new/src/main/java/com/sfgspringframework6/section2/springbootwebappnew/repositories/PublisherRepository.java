package com.sfgspringframework6.section2.springbootwebappnew.repositories;

import com.sfgspringframework6.section2.springbootwebappnew.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
