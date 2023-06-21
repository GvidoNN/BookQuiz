package my.lovely.bookquiz.presentation.additions

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.rewarded.RewardedAd
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import my.lovely.bookquiz.R

class LoadingFragment : Fragment(R.layout.fragment_loading) {

    private lateinit var progressBar: ProgressBar
    private var rewardedAd: RewardedAd? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        progressBar = requireView().findViewById(R.id.progressBar)
        progressBar.progress = 0
        lifecycleScope.launch {
            for (i in (0..100)) {
                delay(10)
                progressBar.progress = i
            }
            findNavController().navigate(R.id.action_loadingFragment_to_startFragment)
        }

    }

}