package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(v: View) {
        val el1: EditText = findViewById(R.id.Num1)
        val el2: EditText = findViewById(R.id.Num2)
        val resText: TextView = findViewById(R.id.Result)

        val num1: Int = Integer.parseInt(el1.text.toString())
        val num2: Int = Integer.parseInt(el2.text.toString())
        val result = num1 + num2
        resText.text = result.toString()
    }

    fun onClick(c: View) {
        val el1: EditText = findViewById(R.id.Num1)
        val el2: EditText = findViewById(R.id.Num2)
        val resText: TextView = findViewById(R.id.Result)

        val num1: Int = Integer.parseInt(el1.text.toString())
        val num2: Int = Integer.parseInt(el2.text.toString())
        val result = num1 - num2
        resText.text = result.toString()
    }
    fun onUmn(u: View){
        val el1: EditText = findViewById(R.id.Num1)
        val el2: EditText = findViewById(R.id.Num2)
        val resText: TextView = findViewById(R.id.Result)

        val num1: Int = Integer.parseInt(el1.text.toString())
        val num2: Int = Integer.parseInt(el2.text.toString())
        val result = num1 * num2
        resText.text = result.toString()
    }
    fun onDel(d: View){
        val el1: EditText = findViewById(R.id.Num1)
        val el2: EditText = findViewById(R.id.Num2)
        val resText: TextView = findViewById(R.id.Result)

        val num1: Int = Integer.parseInt(el1.text.toString())
        val num2: Int = Integer.parseInt(el2.text.toString())
        val result = num1 / num2
        resText.text = result.toString()
    }
}
