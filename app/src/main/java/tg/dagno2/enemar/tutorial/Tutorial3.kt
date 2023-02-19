package tg.dagno2.enemar.tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tg.dagno2.enemar.databinding.ActivityTutorial3Binding

class Tutorial3 : AppCompatActivity() {
    private lateinit var binding: ActivityTutorial3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null) {
            supportActionBar?.hide()
        }
        binding = ActivityTutorial3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ctnBtn.setOnClickListener {
            startActivity(Intent(this, Tutorial4::class.java))
        }


    }
}