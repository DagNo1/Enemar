package tg.dagno2.enemar.tutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.core.view.isVisible
import tg.dagno2.enemar.MainActivity
import tg.dagno2.enemar.R
import tg.dagno2.enemar.databinding.ActivityRegisterBinding
import tg.dagno2.enemar.databinding.ActivityUserPrefBinding

class UserPref : AppCompatActivity() {

    private lateinit var binding: ActivityUserPrefBinding
    private lateinit var langs :MutableList<View>
    private lateinit var checkboxs :MutableList<ImageView>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null) {
            supportActionBar?.hide()
        }
        binding = ActivityUserPrefBinding.inflate(layoutInflater)
        setContentView(binding.root)
        langs = mutableListOf(binding.am, binding.or, binding.sm, binding.sm, binding.tg, binding.af)
        checkboxs = mutableListOf(binding.amc, binding.orc, binding.smc, binding.smc, binding.tgc, binding.afc)
        binding.yes.setOnClickListener {
            changePage()
        }
        binding.no.setOnClickListener {
            changePage()
        }
        binding.am.setOnClickListener { check(binding.am) }
        binding.or.setOnClickListener { check(binding.or) }
        binding.sm.setOnClickListener { check(binding.sm) }
        binding.tg.setOnClickListener { check(binding.tg) }
        binding.af.setOnClickListener { check(binding.af) }
        binding.ctnBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun check(lang: View) {
        for (i in 0..5) {
            if (langs[i] != lang) checkboxs[i].setImageResource(R.drawable.uncheck)
            else checkboxs[i].setImageResource(R.drawable.checked)
        }
    }

    private fun changePage() {
        binding.question.isVisible = false
        binding.lang.isVisible = true
    }
}