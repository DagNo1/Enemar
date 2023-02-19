package tg.dagno2.enemar.tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tg.dagno2.enemar.MainActivity
import tg.dagno2.enemar.databinding.ActivityTutorial0Binding
import tg.dagno2.enemar.databinding.ActivityTutorial1Binding

class Tutorial1 : AppCompatActivity() {
    private lateinit var binding: ActivityTutorial1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null) {
            supportActionBar?.hide()
        }
        binding = ActivityTutorial1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.nxtBtn.setOnClickListener {
            startActivity(Intent(this, Tutorial3::class.java))
        }
    }
}