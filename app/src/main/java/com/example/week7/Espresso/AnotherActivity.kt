package com.example.week7.Espresso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.week7.R
import com.example.week7.databinding.ActivityAnotherBinding

class AnotherActivity : AppCompatActivity() {
    lateinit var binding: ActivityAnotherBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_another)

        binding.btnAnotherActivity.setOnClickListener{
            //startActivity(Intent(this,EspressoActivity::class.java))
            onBackPressed()
        }
    }
}