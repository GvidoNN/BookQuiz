package my.lovely.bookquiz.data

import my.lovely.bookquiz.domain.repository.BookRepository

class BookRepositoryImpl: BookRepository {

    override fun getBooks(): Map<String, String> {
        return mapOf(
            "little_prince" to "Once when I was six years old I saw a magnificent picture in a book, called True Stories from Nature, about the primeval forest.",
            "cell" to "The event that came to be known as The Pulse began at 3:03 p.m., eastern standard time, on the afternoon of October 1",
            "harry_potter" to "Harry Potter was a highly unusual boy in many ways.",
            "paper_town" to "The way I figure it, everyone gets a miracle."
        )
    }
}