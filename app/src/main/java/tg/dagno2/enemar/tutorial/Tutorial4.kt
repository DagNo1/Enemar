package tg.dagno2.enemar.tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import tg.dagno2.enemar.databinding.ActivityTutorial3Binding
import tg.dagno2.enemar.databinding.ActivityTutorial4Binding
import tg.dagno2.enemar.phone.Phonecourse

class Tutorial4 : AppCompatActivity() {
    private lateinit var binding: ActivityTutorial4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null) {
            supportActionBar?.hide()
        }
        binding = ActivityTutorial4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ctnBtn.setOnClickListener {
            binding.secondScreen.isVisible = true
            binding.cl0.isVisible = false
            binding.cl1.isVisible = false
            binding.cl02.isVisible = false
            binding.cl03.isVisible = false
            binding.ctnBtn.isVisible = false
        }
        binding.okayBtn.setOnClickListener {
//            startActivity(Intent(this, Phonecourse::class.java))
        }
    }
}