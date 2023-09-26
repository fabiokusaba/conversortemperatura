package com.fabiokusaba.conversortemperatura

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fabiokusaba.conversortemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            if (!binding.editCelsius.text.toString().isEmpty()) {
                val celsius = binding.editCelsius.text.toString().toDouble()
                val fahrenheit = String.format("%.2f", celsius * 1.8 + 32)

                binding.textResultado.text = "$fahrenheit ºF"
            } else {
                binding.textResultado.text = "Temperatura inválida"
            }
        }
    }
}