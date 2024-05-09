package com.maxwen.springKotlinPlayground.controllers

import com.maxwen.springKotlinPlayground.repositories.AuthorRepository
import com.maxwen.springKotlinPlayground.repositories.BookRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class AuthorController(val authorRepository: AuthorRepository) {

    @RequestMapping("/authors")
    fun getAuthors(model: Model): String {
        model.addAttribute("authors", authorRepository.findAll())

        return "authors"
    }
}
