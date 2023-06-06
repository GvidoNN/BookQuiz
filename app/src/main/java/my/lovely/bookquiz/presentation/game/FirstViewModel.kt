package my.lovely.bookquiz.presentation.game

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import my.lovely.bookquiz.domain.model.Book
import my.lovely.bookquiz.domain.usecase.GetRandomBooksUseCase
import javax.inject.Inject


@HiltViewModel
class FirstViewModel @Inject constructor(
    private val getRandomBooksUseCase: GetRandomBooksUseCase
) : ViewModel() {

    private val threeBooksLiveData = MutableLiveData<ArrayList<Book>>()
    private val chooseBookLiveData = MutableLiveData<Book>()


    val threeBooks: LiveData<ArrayList<Book>>
        get() = threeBooksLiveData

    val chooseBook: LiveData<Book>
        get() = chooseBookLiveData

    fun showBooks() {
        val books = getRandomBooksUseCase.getThreeBook()
        threeBooksLiveData.value = books
        val choosenBook = books[(0..2).random()]
        chooseBookLiveData.value = choosenBook

    }


}