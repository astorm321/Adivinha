package com.example.adivinha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val random = Random()
    val randomnr = (0..11).random()

    fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }
}