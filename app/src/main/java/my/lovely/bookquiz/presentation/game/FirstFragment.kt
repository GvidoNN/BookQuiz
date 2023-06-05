package my.lovely.bookquiz.presentation.game

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import my.lovely.bookquiz.R
import my.lovely.bookquiz.data.BookRepositoryImpl

class FirstFragment : Fragment(R.layout.fragment_first) {

    private val bookRepositoryImpl by lazy {BookRepositoryImpl()}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




    }


}