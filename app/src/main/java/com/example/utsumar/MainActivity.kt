package com.example.utsumar

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preferences = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)

        val nama = preferences.getString("NAMA","")
        txt_nama.text = nama
        val nim = preferences.getInt("NIM", 0)
        txt_nim.text = ""+nim



        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Berita", R.drawable.news))
        arrayList.add(Model("Kakulaor",  R.drawable.calculator))
        arrayList.add(Model("Tentang UTS",  R.drawable.abouticon))
        arrayList.add(Model("Keluar Aplikasi", R.drawable.exiticon))

        val myAdapter = MyAdapter(arrayList, this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }
}

