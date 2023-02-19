package tg.dagno2.enemar.tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tg.dagno2.enemar.databinding.ActivityTutorialBinding
import tg.dagno2.enemar.databinding.ActivityUserPrefBinding

class Tutorial : AppCompatActivity() {

    private lateinit var binding: ActivityTutorialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null) {
            supportActionBar?.hide()
        }
        binding = ActivityTutorialBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView5.setOnClickListener {
            startActivity(Intent(this, Tutorial0::class.java))
        }
        binding.ctnBtn.setOnClickListener {
            startActivity(Intent(this, Tutorial1::class.java))
        }

    }
}