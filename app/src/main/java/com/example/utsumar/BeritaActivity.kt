package com.example.utsumar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_berita.*
import java.util.ArrayList

class BeritaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "Daftar Berita"

            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        val arrayList = ArrayList<BeritaModel>()

        arrayList.add(BeritaModel("Gatot Tak Hadir Tapi Mau Terima Bintang Jasa Jokowi", "Indonesia", R.drawable.gatot))
        arrayList.add(BeritaModel("Gerindra Bela Anies Temui Rizieq: Kenapa Jadi Ribet Gitu Ya", "Indonesia", R.drawable.anies))
        arrayList.add(BeritaModel("Megawati Heran Anak Muda di Era Internet Lebih Percaya Hoaks", "Indonesia", R.drawable.megawati))
        arrayList.add(BeritaModel("BI Minta Bank Genjot Kredit", "Indonesia", R.drawable.bi))
        arrayList.add(BeritaModel("Gatot Tak Hadir Tapi Mau Terima Bintang Jasa Jokowi", "Indonesia", R.drawable.gatot))
        arrayList.add(BeritaModel("Gerindra Bela Anies Temui Rizieq: Kenapa Jadi Ribet Gitu Ya", "Indonesia", R.drawable.anies))
        arrayList.add(BeritaModel("Megawati Heran Anak Muda di Era Internet Lebih Percaya Hoaks", "Indonesia", R.drawable.megawati))
        arrayList.add(BeritaModel("BI Minta Bank Genjot Kredit", "Indonesia", R.drawable.bi))


        val myAdapter = BeritaAdapter(arrayList, this)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}


