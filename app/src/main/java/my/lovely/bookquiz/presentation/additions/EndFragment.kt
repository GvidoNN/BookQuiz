package my.lovely.bookquiz.presentation.additions

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import my.lovely.bookquiz.Const
import my.lovely.bookquiz.R

class EndFragment : Fragment(R.layout.fragment_end) {

    lateinit var tvEndScore: TextView
    lateinit var btTryAgain: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvEndScore = requireView().findViewById(R.id.tvEndScore)
        btTryAgain = requireView().findViewById(R.id.btTryAgain)

        val score = arguments?.getInt(Const.SCORE) ?: 0
        tvEndScore.text = "$score / 10"


        btTryAgain.setOnClickListener {
            findNavController().navigate(R.id.action_endFragment_to_startFragment)
        }

    }
}