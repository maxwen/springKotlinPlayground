package com.maxwen.springKotlinPlayground.repositories

import com.maxwen.springKotlinPlayground.model.Book
import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<Book?, Long?>