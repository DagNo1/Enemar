package tg.dagno2.enemar.login_signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tg.dagno2.enemar.databinding.ActivityRegisterBinding
import tg.dagno2.enemar.tutorial.UserPref

class Register : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null) {
            supportActionBar?.hide()
        }
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.getStartedBtn.setOnClickListener {
            startActivity(Intent(this, UserPref::class.java))
        }
        binding.loginBtn.setOnClickListener {
            startActivity(Intent(this, LogIn::class.java))
        }
    }

}