package com.example.utsumar

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*
import kotlin.system.exitProcess

class MyAdapter(val arrayList: ArrayList<Model>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(model: Model){
            itemView.titleTV.text = model.title
            itemView.imgView.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)

        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener {
            if (position == 0){
                val hello = Intent(context, BeritaActivity::class.java)
                context.startActivities(arrayOf(hello))
            }
            if (position == 1){
                val hello = Intent(context, KalActivity::class.java)
                context.startActivities(arrayOf(hello))
            }
            if (position == 2){
                val hello = Intent(context, AboutActivity::class.java)
                context.startActivities(arrayOf(hello))
            }

            if (position == 3){
                exitProcess(-1)
            }

        }
    }


}