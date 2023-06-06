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
): ViewModel() {

    private val threeBooksLiveData = MutableLiveData<ArrayList<Book>>()
    private var deletedBooksLiveData = MutableLiveData<ArrayList<Book>>()

    val threeBooks: LiveData<ArrayList<Book>>
        get() = threeBooksLiveData

    val deletedBooks: LiveData<ArrayList<Book>>
        get() = deletedBooksLiveData


    fun showBooks(){
        threeBooksLiveData.value = getRandomBooksUseCase.getThreeBook()
    }




}