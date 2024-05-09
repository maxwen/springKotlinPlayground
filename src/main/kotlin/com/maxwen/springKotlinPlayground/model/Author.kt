package com.maxwen.springKotlinPlayground.model

import jakarta.persistence.*

@Entity
class Author(
    val firstName: String,
    val lastName: String,

    @ManyToMany(mappedBy = "authors")
    var books: MutableSet<Book> = HashSet(),

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false

        val author = other as Author

        return if (id != null) id == author.id else author.id == null
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}'
    }
}