package com.programersma.projectbaru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.programersma.projectbaru.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var angkaBerubah = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button3.setOnClickListener {
            angkaBerubah = 0
            binding.bebas.text = angkaBerubah.toString()
            Toast.makeText(this@MainActivity,"Anda telah mereset Angka",Toast.LENGTH_LONG).show()
        }
        binding.tombol2.setOnClickListener {
            angkaBerubah++
            binding.bebas.text = angkaBerubah.toString()
        }
        binding.tombol1.setOnClickListener {
            angkaBerubah--
            binding.bebas.text = angkaBerubah.toString()
        }
    }
//
    }
