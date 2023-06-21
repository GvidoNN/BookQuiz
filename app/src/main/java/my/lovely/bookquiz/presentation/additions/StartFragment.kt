package my.lovely.bookquiz.presentation.additions

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.gms.ads.*
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import my.lovely.bookquiz.R

class StartFragment : Fragment(R.layout.fragment_start) {

    lateinit var btPlay: Button
    lateinit var btMoney1: ImageButton
    lateinit var btMoney2: ImageButton
    private var rewardedAd: RewardedAd? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        MobileAds.initialize(requireContext()){}
        btPlay = requireView().findViewById(R.id.btPlay)
        btMoney1 = requireView().findViewById(R.id.imBtMoney1)
        btMoney2 = requireView().findViewById(R.id.imBtMoney2)
        loadAd()

        btPlay.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_firstFragment)
        }

        btMoney2.setOnClickListener {
            rewardedAd?.show(requireActivity()){
                Log.d("MyLog","${it.amount}")
            }
        }

        btMoney1.setOnClickListener {
            rewardedAd?.show(requireActivity()){
                Log.d("MyLog","${it.amount}")
            }
        }
    }

    private fun loadAd(){
        var adRequest = AdRequest.Builder().build()
        RewardedAd.load(requireContext(),"ca-app-pub-7592888554989577/9624342333", adRequest, object : RewardedAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                Log.d("MyLog", "${adError?.toString()}")
                rewardedAd = null
            }

            override fun onAdLoaded(ad: RewardedAd) {
                Log.d("MyLog", "Ad was loaded.")
                rewardedAd = ad
                rewardedAd?.fullScreenContentCallback = adListener()
            }
        })
    }

    private fun adListener() = object: FullScreenContentCallback(){
        override fun onAdDismissedFullScreenContent() {
            rewardedAd = null
            loadAd()
        }

        override fun onAdFailedToShowFullScreenContent(p0: AdError) {
            rewardedAd = null
            loadAd()
        }
    }

}