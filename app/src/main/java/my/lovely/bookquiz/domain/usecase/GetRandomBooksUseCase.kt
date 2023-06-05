package my.lovely.bookquiz.domain.usecase

import android.util.Log
import my.lovely.bookquiz.domain.repository.BookRepository
import javax.inject.Inject

class GetRandomBooksUseCase @Inject constructor(private val bookRepository: BookRepository) {

    fun getThreeBook(){
        val data = bookRepository.getBooks()

        val names = mutableListOf<String>()

        for(i in data.keys){
            names.add(i)
            Log.d("MyLog",i)
        }
    }


}