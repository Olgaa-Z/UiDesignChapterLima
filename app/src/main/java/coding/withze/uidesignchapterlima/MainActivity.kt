package coding.withze.uidesignchapterlima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coding.withze.uidesignchapterlima.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.main2.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }

        binding.btnId.setOnClickListener {
            setLocale("id")
        }

        binding.btnEn.setOnClickListener {
            setLocale("en")
        }
    }

    fun setLocale(lang: String?) {
        val myLocale = Locale(lang)
        val res = resources
        val conf = res.configuration
        conf.locale = myLocale
        res.updateConfiguration(conf, res.displayMetrics)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }


//    https://github.com/AndroidCodility/MultipleLanguageInApp

}