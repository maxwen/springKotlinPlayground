package com.maxwen.springKotlinPlayground.repositories

import com.maxwen.springKotlinPlayground.model.Author
import org.springframework.data.repository.CrudRepository

interface AuthorRepository : CrudRepository<Author?, Long?>
