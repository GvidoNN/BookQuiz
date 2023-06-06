package my.lovely.bookquiz.presentation.game

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import my.lovely.bookquiz.Const
import my.lovely.bookquiz.R
import my.lovely.bookquiz.databinding.FragmentSecondBinding

@AndroidEntryPoint
class SecondFragment : Fragment(R.layout.fragment_second) {

    private val firstViewModel: FirstViewModel by viewModels()
    private lateinit var binding: FragmentSecondBinding
    private lateinit var bundle: Bundle

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val step = arguments?.getInt(Const.STEP) ?: 1
        val score = arguments?.getInt(Const.SCORE) ?: 0

        if (step > 10) {
            bundle = Bundle()
            bundle.putInt(Const.SCORE, score)
            findNavController().navigate(R.id.action_firstFragment_to_endFragment, bundle)
        }

        firstViewModel.showBooks()
        firstViewModel.threeBooks.observe(viewLifecycleOwner) { result ->
            firstViewModel.chooseBook.observe(viewLifecycleOwner) { book ->

                binding.tvBookSubject.text = book.bookSubject
                binding.tvTextStep.text = "$step / 10"

                binding.imBook1.setImageResource(result[0].bookTitle)
                binding.imBook2.setImageResource(result[1].bookTitle)
                binding.imBook3.setImageResource(result[2].bookTitle)


                binding.imBook1.setOnClickListener {
                    checkBook(
                        name1 = book.bookName,
                        name2 = result[0].bookName,
                        score = score,
                        step = step
                    )
                }

                binding.imBook2.setOnClickListener {
                    checkBook(
                        name1 = book.bookName,
                        name2 = result[1].bookName,
                        score = score,
                        step = step
                    )
                }

                binding.imBook3.setOnClickListener {
                    checkBook(
                        name1 = book.bookName,
                        name2 = result[2].bookName,
                        score = score,
                        step = step
                    )
                }
            }
        }
    }

    fun checkBook(name1: String, name2: String, score: Int, step: Int) {
        bundle = Bundle()
        bundle.putInt(Const.STEP, step + 1)
        if (name1 == name2) {
            bundle.putInt(Const.SCORE, score + 1)
            Toast.makeText(requireContext(),"Great!", Toast.LENGTH_SHORT).show()
        } else {
            bundle.putInt(Const.SCORE, score)
            Toast.makeText(requireContext(),"Try more!", Toast.LENGTH_SHORT).show()
        }
        findNavController().navigate(R.id.action_secondFragment_to_firstFragment, bundle)
    }


}