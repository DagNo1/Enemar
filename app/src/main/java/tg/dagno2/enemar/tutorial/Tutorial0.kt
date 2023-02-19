package tg.dagno2.enemar.tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import tg.dagno2.enemar.MainActivity
import tg.dagno2.enemar.databinding.ActivityTutorial0Binding

class Tutorial0 : AppCompatActivity() {
    private lateinit var binding: ActivityTutorial0Binding
    var thought = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null) {
            supportActionBar?.hide()
        }
        binding = ActivityTutorial0Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.constraintLayout4.setOnClickListener {
            if (!thought) changePage() else startActivity(Intent(this, Tutorial::class.java))
        }
        binding.constraintLayout5.setOnClickListener { changePage() }
        binding.constraintLayout6.setOnClickListener { changePage() }
        binding.constraintLayout7.setOnClickListener { changePage() }

    }
    private fun changePage(){
        thought = true
        binding.t00.isVisible = true
        binding.t01.isVisible = false
    }
}