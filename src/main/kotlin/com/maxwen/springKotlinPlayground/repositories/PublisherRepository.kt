package com.maxwen.springKotlinPlayground.repositories

import com.maxwen.springKotlinPlayground.model.Author
import com.maxwen.springKotlinPlayground.model.Publisher
import org.springframework.data.repository.CrudRepository

interface PublisherRepository : CrudRepository<Publisher?, Long?>
