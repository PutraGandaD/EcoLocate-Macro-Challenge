package org.ecogank.ecolocate.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.ecogank.ecolocate.Model.BacaanBeranda
import org.ecogank.ecolocate.R

class BacaanBerandaAdapter (private val bacaanList : ArrayList<BacaanBeranda>) :
    RecyclerView.Adapter<BacaanBerandaAdapter.bacaanBerandaViewHolder>(){

    var onItemClick: ((BacaanBeranda) -> Unit)? = null

    inner class bacaanBerandaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgBacaan : ImageView = itemView.findViewById(R.id.iv_bacaan_beranda)
        val judulBacaan : TextView = itemView.findViewById(R.id.tv_bacaan_beranda)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bacaanBerandaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_bacaanberanda, parent, false)
        return bacaanBerandaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bacaanList.size
    }

    override fun onBindViewHolder(holder: bacaanBerandaViewHolder, position: Int) {
        val bacaanBeranda = bacaanList[position]

        holder.imgBacaan.setImageResource(bacaanBeranda.image)
        holder.judulBacaan.text = bacaanBeranda.judul

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(bacaanBeranda)
        }

    }
}