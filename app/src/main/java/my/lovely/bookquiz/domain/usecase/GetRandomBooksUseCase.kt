package my.lovely.bookquiz.domain.usecase

import my.lovely.bookquiz.domain.model.Book
import my.lovely.bookquiz.domain.repository.BookRepository
import javax.inject.Inject

class GetRandomBooksUseCase @Inject constructor(private val bookRepository: BookRepository) {

    fun getThreeBook(): ArrayList<Book> {

        val data = bookRepository.getBooks().shuffled()
        var threeBooks = arrayListOf<Book>()

        for(i in 0..2){
            threeBooks.add(data[i])
        }

        return threeBooks
    }




}