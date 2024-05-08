package com.maxwen.springKotlinPlayground.bootstrap

import com.maxwen.springKotlinPlayground.model.Author
import com.maxwen.springKotlinPlayground.model.Book
import com.maxwen.springKotlinPlayground.model.Publisher
import com.maxwen.springKotlinPlayground.repositories.AuthorRepository
import com.maxwen.springKotlinPlayground.repositories.BookRepository
import com.maxwen.springKotlinPlayground.repositories.PublisherRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class BootStrapData(
    val authorRepository: AuthorRepository,
    val bookRepository: BookRepository,
    val publisherRepository: PublisherRepository
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        val publisher: Publisher = Publisher("foo", "12th Street, LA")
        publisherRepository.save(publisher)

        //Eric
        val eric: Author = Author("Eric", "Evans")
        val ddd: Book = Book("Domain Driven Design", "1234", publisher)
        eric.books.add(ddd)
        ddd.authors.add(eric)

        authorRepository.save(eric)
        bookRepository.save(ddd)
        publisherRepository.save(publisher)


        //Rod
        val rod: Author = Author("Rod", "Johnson")
        val noEJB: Book = Book("J2EE Development without EJB", "23444", publisher)
        rod.books.add(noEJB)
        noEJB.authors.add(rod)

        authorRepository.save(rod)
        bookRepository.save(noEJB)
        publisherRepository.save(publisher)

        println("BootStrapData books = " + bookRepository.count());
        println("BootStrapData publisher books = " + publisher.books.size);

    }
}