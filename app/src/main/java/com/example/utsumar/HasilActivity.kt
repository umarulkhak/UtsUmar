package com.example.utsumar

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_hasil.*

class HasilActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "Hasil"

            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        var Tampil = intent
        val hasil = Tampil.getStringExtra("HASIL")

        val hasil_akhir = findViewById<TextView>(R.id.txt_hasil)
        hasil_akhir.text = "Hasil : $hasil"

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
