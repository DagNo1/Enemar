package tg.dagno2.enemar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null) {
            supportActionBar?.hide()
        }
        setContentView(R.layout.activity_main)
        val home = Home()
        val video = Video()
        val documents = Documents()
        val setting = Setting()
        setCurrentFragment(home)
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        // handle navigation selection
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> setCurrentFragment(home)
                R.id.video -> setCurrentFragment(video)
                R.id.documents -> setCurrentFragment(documents)
                R.id.setting -> setCurrentFragment(setting)
            }
            true
        }
    }
    private fun setCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.main_fragment,fragment)
            commit()
        }
    }
}