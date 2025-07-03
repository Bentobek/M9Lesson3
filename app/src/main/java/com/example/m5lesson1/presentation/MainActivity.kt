package com.example.m5lesson1.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.m5lesson1.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val adapter = CharactersAdapter()


//    private val viewModel: MainViewModel by viewModels()
    private val viewModel2: CharacterViewmodel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            binding.rvLotti.adapter = adapter

            lifecycleScope.launchWhenStarted {
                viewModel2.characters.collect { list ->
                    adapter.submitList(list)
                }
            }

            viewModel2.loadCharacters()
        }



        }
//            btnIncrement.setOnClickListener {
//                viewModel.increment()
//            }
//            btnDecrement.setOnClickListener {
//                viewModel.decrement()
//            }
//
//        }
//        viewModel.uiCountData.observe(this){ data ->
//            binding.tvCount.text = "${data}"
//            binding.btnIncrement.text = data.operationType
//    }
    }

