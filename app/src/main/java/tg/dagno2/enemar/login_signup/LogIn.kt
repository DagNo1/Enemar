package tg.dagno2.enemar.login_signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tg.dagno2.enemar.databinding.ActivityLogInBinding
import tg.dagno2.enemar.tutorial.UserPref

class LogIn : AppCompatActivity() {
    private lateinit var binding: ActivityLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null) {
            supportActionBar?.hide()
        }
        binding = ActivityLogInBinding.inflate(layoutInflater)
            setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            startActivity(Intent(this, UserPref::class.java))
        }
        binding.register.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
    }
}