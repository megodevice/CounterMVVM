package com.example.countermvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.countermvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()
        observe()
    }

    private fun observe() {
        viewModel.count.observe(this) {count ->
            binding.tvCount.text = count.toString()
        }
    }

    private fun initListeners() {
        binding.apply {
            btInc.setOnClickListener { viewModel.inc() }
            btDec.setOnClickListener { viewModel.dec() }
        }
    }
}