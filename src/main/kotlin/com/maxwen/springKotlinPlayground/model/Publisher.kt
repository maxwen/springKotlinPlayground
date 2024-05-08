package com.maxwen.springKotlinPlayground.model

import jakarta.persistence.*

@Entity
class Publisher(
    val name: String,
    val address: String,

    @OneToMany
    @JoinColumn(name = "publisher_id")
    var books: MutableSet<Book> = HashSet(),

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false

        val publisher = other as Publisher

        return if (id != null) id == publisher.id else publisher.id == null
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}'
    }
}
