package my.lovely.bookquiz.presentation.game

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import my.lovely.bookquiz.R
import my.lovely.bookquiz.databinding.FragmentFirstBindin

@AndroidEntryPoint
class FirstFragment : Fragment(R.layout.fragment_first) {

    private val firstViewModel: FirstViewModel by viewModels()
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firstViewModel.showBooks()
        firstViewModel.threeBooks.observe(viewLifecycleOwner){ result ->
            result.forEach{
                Log.d("MyLog", it.toString())
            }
        }

    }


}