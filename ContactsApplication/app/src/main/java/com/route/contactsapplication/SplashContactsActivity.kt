package com.route.contactsapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler
import com.route.contactsapplication.databinding.ActivityContactsSplashBinding


class SplashContactsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContactsSplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactsSplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            val intent = Intent(this@SplashContactsActivity, MainContactsActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}