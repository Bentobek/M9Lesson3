package com.example.m5lesson1.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.m5lesson1.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }


    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            btnIncrement.setOnClickListener {
                viewModel.increment()
            }
            btnDecrement.setOnClickListener {
                viewModel.decrement()
            }
        }
        viewModel.uiCountData.observe(this){ data ->
            binding.tvCount.text = "${data}"
            binding.btnIncrement.text = data.operationType
    }
    }

}