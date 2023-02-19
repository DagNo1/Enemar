package tg.dagno2.enemar.FirstTime

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import tg.dagno2.enemar.R
import tg.dagno2.enemar.databinding.ActivityBoardingScreenBinding
import tg.dagno2.enemar.login_signup.LogIn

class BoardingScreen : AppCompatActivity() {
    private var slidePosition = 0

    private val farmer = "Grasp real world skills to benefit your economic needs"
    private val seminar= "High quality lectures and unlimited questions"
    private val imagesList = mutableListOf<Int>(R.drawable.farmer_bro_1,R.drawable.seminar_bro_1)
    private val headerTextList = mutableListOf(farmer, seminar)
    private lateinit var binding: ActivityBoardingScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null) {
            supportActionBar?.hide()
        }
        binding = ActivityBoardingScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.nxtBtn.setOnClickListener {
            nextSlide()
        }
        binding.getStartedBtn.setOnClickListener {
            //change the first time
            val sharedPreferences = getSharedPreferences("LoadUp", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.apply {
                putBoolean("first_time",false)
                apply()
            }
            startActivity(Intent(this, LogIn::class.java))
        }
    }

    private fun nextSlide(){
        binding.slideImage.setImageResource(imagesList[slidePosition])
        binding.header.text = headerTextList[slidePosition].toString()
        if (slidePosition == 0){
            binding.ci1.setImageResource(R.drawable.circular_indicator_color_unselected)
            binding.ci2.setImageResource(R.drawable.circular_indicator_color)
            binding.ci3.setImageResource(R.drawable.circular_indicator_color_unselected)
        }
        if (slidePosition == 1){
            binding.ci3.setImageResource(R.drawable.circular_indicator_color)
            binding.ci2.setImageResource(R.drawable.circular_indicator_color_unselected)
        }
        slidePosition++
        if (slidePosition == 2) {
            binding.nxtBtn.isVisible = false
            binding.getStartedBtn.isVisible = true
        }
    }
}