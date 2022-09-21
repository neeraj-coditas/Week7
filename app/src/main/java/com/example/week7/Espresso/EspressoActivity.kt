package com.example.week7.Espresso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.week7.R
import com.example.week7.databinding.ActivityEspressoBinding

class EspressoActivity : AppCompatActivity() {
    lateinit var binding: ActivityEspressoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_espresso)

        binding.btnEspressoActivity.setOnClickListener{
            startActivity(Intent(this,AnotherActivity::class.java))
        }

    }
}