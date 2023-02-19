package tg.dagno2.enemar
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import tg.dagno2.enemar.databinding.HomeBinding
import tg.dagno2.enemar.tutorial.Tutorial0

class Home : Fragment(R.layout.home) {

    private lateinit var binding: HomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = HomeBinding.bind(view)
        binding.learnNow.setOnClickListener {
            val intent = Intent(activity, Tutorial0::class.java)
            startActivity(intent)
        }
    }
}