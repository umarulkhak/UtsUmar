package com.example.utsumar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hasil.*
import kotlinx.android.synthetic.main.activity_kal.*

class KalActivity : AppCompatActivity() {
    private val Logikane=Logika()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kal)
        setSupportActionBar(toolbar2)
        supportActionBar?.apply {
            title = "Kalkulator"

            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        val num1 = id_num1.text
        val num2 = id_num2.text

        btn_kali.setOnClickListener {
            val hasil = Logikane.kali(num1.toString().toDouble(), num2.toString().toDouble())
            val intent = Intent(this, HasilActivity::class.java)
            intent.putExtra("HASIL", hasil.toString())
            startActivity(intent)
        }
        btn_tambah.setOnClickListener{
            val hasil=Logikane.tambah(num1.toString().toDouble(), num2.toString().toDouble())
            val intent = Intent(this, HasilActivity::class.java)
            intent.putExtra("HASIL", hasil.toString())
            startActivity(intent)
        }

        btn_kurang.setOnClickListener{
            val hasil=Logikane.kurang(num1.toString().toDouble(), num2.toString().toDouble())
            val intent = Intent(this, HasilActivity::class.java)
            intent.putExtra("HASIL", hasil.toString())
            startActivity(intent)
        }

        btn_bagi.setOnClickListener{
            val hasil=Logikane.bagi(num1.toString().toDouble(), num2.toString().toDouble())
            val intent = Intent(this, HasilActivity::class.java)
            intent.putExtra("HASIL", hasil.toString())
            startActivity(intent)
        }

        btn_hapus.setOnClickListener {
            num1.clear()
            num2.clear()
        }

    }
    class Logika {
        var result = 0.0

        fun kali(p: Double, l: Double): Double {
            this.result = p * l
            return p * l
        }
        fun tambah(p: Double, l: Double): Double {
            this.result = p + l
            return p + l
        }
        fun bagi(p: Double, l: Double): Double {
            this.result = p / l
            return p / l
        }
        fun kurang(p: Double, l: Double): Double {
            this.result = p - l
            return p - l
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
