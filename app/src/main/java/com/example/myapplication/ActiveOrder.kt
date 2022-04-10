package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityActiveOrderBinding

class ActiveOrder : AppCompatActivity() {
    lateinit var binding: ActivityActiveOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityActiveOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onGetLastOrders()
    }

    fun onGetLastOrders() {
        for (i in 0..Constance.LastArrOrdersDec.size-1) {
            binding.LastOrder.text = "\n" + "Заказ №" + Constance.LastArrOrdersDec[i]
        }

        for (i in 0..Constance.LastArrOrdersAcc.size-1) {
            binding.LastOrder.text = "\n" + "Заказ №" + Constance.LastArrOrdersDec[i]
        }
    }

    fun goBack(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }



}