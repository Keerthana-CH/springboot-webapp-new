package com.sfgspringframework6.section2.springbootwebappnew.bootstrap;

import com.sfgspringframework6.section2.springbootwebappnew.domain.Author;
import com.sfgspringframework6.section2.springbootwebappnew.domain.Book;
import com.sfgspringframework6.section2.springbootwebappnew.repositories.AuthorRepository;
import com.sfgspringframework6.section2.springbootwebappnew.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author author1 = new Author();
        author1.setFirstName("Rod");
        author1.setLastName("Johnson");

        Book book1 = new Book();
        book1.setTitle("J2EE Development without EJB");
        book1.setIsbn("12400");

        Author savedAuthor1 = authorRepository.save(author1);
        Book savedBook1 = bookRepository.save(book1);

        Author author2 = new Author();
        author2.setFirstName("APJ");
        author2.setLastName("Kalaam");

        Book book2 = new Book();
        book2.setTitle("Wings Of Fire");
        book2.setIsbn("54200");

        Author savedAuthor2 = authorRepository.save(author2);
        Book savedBook2 = bookRepository.save(book2);

        savedAuthor1.getBooks().add(savedBook1);
        savedAuthor2.getBooks().add(savedBook2);

        authorRepository.save(savedAuthor1);
        bookRepository.save(savedBook1);
        authorRepository.save(savedAuthor2);
        bookRepository.save(savedBook2);

        System.out.println("In Bootstrap");
        System.out.println("Author Count : " + authorRepository.count());
        System.out.println("Book Count : " + bookRepository.count());

    }
}
