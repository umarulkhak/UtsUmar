package com.example.utsumar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rowberita.view.*

class BeritaAdapter(val arrayList: ArrayList<BeritaModel>, val context: Context) :
    RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(model: BeritaModel){
            itemView.titleTV.text = model.title
            itemView.txt_tempat.text = model.tempat
            itemView.imgView.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.rowberita, parent, false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: BeritaAdapter.ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {
            if (position == 0){
                Toast.makeText(context,"You clicked Gatot", Toast.LENGTH_SHORT).show()
            }
            if (position == 1){
                Toast.makeText(context,"You clicked Gerindra", Toast.LENGTH_SHORT).show()
            }
            if (position == 2){
                Toast.makeText(context,"You clicked Megawati", Toast.LENGTH_SHORT).show()
            }
            if (position == 3){
                Toast.makeText(context,"You clicked BI", Toast.LENGTH_SHORT).show()
            }
            if (position == 4){
                Toast.makeText(context,"You clicked Gatot", Toast.LENGTH_SHORT).show()
            }
            if (position == 5){
                Toast.makeText(context,"You clicked Gerindra", Toast.LENGTH_SHORT).show()
            }
            if (position == 6){
                Toast.makeText(context,"You clicked Megawati", Toast.LENGTH_SHORT).show()
            }
            if (position == 7){
                Toast.makeText(context,"You clicked BI", Toast.LENGTH_SHORT).show()
            }
        }
    }

}