package com.example.myproekt

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ShopActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_shop)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val costRon = 50
        val imageRon = findViewById<ImageView>(R.id.imageRon)
        val costMessi = 80
        val imageMessi = findViewById<ImageView>(R.id.imageMessi)
        val costMaguir = 1000
        val imageMaguir = findViewById<ImageView>(R.id.imageMaguir)
        val costR9 = 20
        val imageR9 = findViewById<ImageView>(R.id.imageR9)
        val costYashin = 100
        val imageYashin = findViewById<ImageView>(R.id.imageYashin)
        val costVanBasten = 30
        val imageVanBasten = findViewById<ImageView>(R.id.imageVanBasten)

    }
}