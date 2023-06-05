package my.lovely.bookquiz.domain.repository

interface BookRepository {


    fun getBooks(): Map<String, String>
}