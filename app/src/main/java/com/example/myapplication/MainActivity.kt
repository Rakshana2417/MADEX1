package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val layout: LinearLayout =findViewById(R.id.layout)
            val tv1: TextView =findViewById(R.id.tv1)
            val btn1: Button =findViewById(R.id.btn1)
            val btn2:Button=findViewById(R.id.btn2)
            val btn3:Button=findViewById(R.id.btn3)
            var size =10f
            var a =0
            var b =0

            btn1.setOnClickListener {
                tv1.textSize = size
                size=(size+10)%80
            }
            btn2.setOnClickListener {
                when(a%3){
                    0->tv1.setTextColor(Color.CYAN)
                    1->tv1.setTextColor(Color.MAGENTA)
                    2->tv1.setTextColor(Color.BLACK)
                }
                a+=1
            }
            btn3.setOnClickListener {
                when(b%3){
                    0->layout.setBackgroundColor(Color.LTGRAY)
                    1->layout.setBackgroundColor(Color.MAGENTA)
                    2->layout.setBackgroundColor(Color.YELLOW)
                }
                b+=1
            }
        }
    }
