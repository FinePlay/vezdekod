package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.FragmentSwipeCardBinding
import kotlin.random.Random

const val ARG_OBJECT = "object"

class NumberFragment : Fragment() {
    var counter : Int = 0
    var counter2 : Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_swipe_card, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            onGenerateRandomCardValue()

            var AOrder : Button = view.findViewById(R.id.AcceptOrder)
            AOrder.setOnClickListener { onAccepted() }
            var COrder : Button = view.findViewById(R.id.CancleOrder)
            COrder.setOnClickListener { onClanceOrder() }

            var lOrder : TextView = view.findViewById(R.id.Order)
            lOrder.text = Constance.lastOrder

            var lAdress : TextView = view.findViewById(R.id.AdressOrder)
            lAdress.text = Constance.lastAddress
        }
    }

    fun onAccepted() {
        Constance.LastArrOrdersAcc.add(counter, (Constance.lastOrder!! + "принят"))
        counter += 1
    }

    fun onClanceOrder() {
        Constance.LastArrOrdersDec.add(counter2, (Constance.lastOrder!!+ "отклонён"))
        counter2 += 1
    }

    fun onGenerateRandomCardValue() {
        Constance.lastOrder = "Заказ №" + Random.nextInt(0, 30000).toString()
        Constance.lastAddress = "Адресс: " + Constance.adresses[Random.nextInt(0, Constance.adresses.size - 1)]
    }
}