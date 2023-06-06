package my.lovely.bookquiz.presentation.additions

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import my.lovely.bookquiz.R

class StartFragment : Fragment(R.layout.fragment_start) {

    lateinit var btPlay: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btPlay = requireView().findViewById(R.id.btPlay)
        btPlay.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_firstFragment)
        }
    }

}