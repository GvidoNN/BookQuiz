package my.lovely.bookquiz.domain.repository

import my.lovely.bookquiz.domain.model.Book

interface BookRepository {

    fun getBooks(): ArrayList<Book>
}