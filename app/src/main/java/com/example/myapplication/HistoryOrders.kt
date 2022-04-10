package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityHistoryOrdersBinding

class HistoryOrders : AppCompatActivity() {
    lateinit var binding: ActivityHistoryOrdersBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryOrdersBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }



}