package com.example.myproekt

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var count = 0
        var multiple = 1

        val textCount = findViewById<TextView>(R.id.textView5)
        val imageLevel1 = findViewById<ImageView>(R.id.imageView11)
        imageLevel1.setOnClickListener {
            count += Plus(multiple)
            textCount.setText("№"+count.toString())

        }

        val shopButton = findViewById<ImageView>(R.id.shopButton)
        val shopIntent = Intent(this,ShopActivity::class.java)
        shopButton.setOnClickListener { startActivity(shopIntent) }

    }
    fun Plus(multiple: Int): Int {
        return 1*multiple
    }
}