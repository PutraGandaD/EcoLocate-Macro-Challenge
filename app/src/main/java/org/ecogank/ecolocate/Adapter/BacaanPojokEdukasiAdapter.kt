package org.ecogank.ecolocate.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.ecogank.ecolocate.Model.BacaanBeranda
import org.ecogank.ecolocate.R

class BacaanPojokEdukasiAdapter (private val bacaanList : ArrayList<BacaanBeranda>) :
    RecyclerView.Adapter<BacaanPojokEdukasiAdapter.bacaanPojokViewHolder>(){

    var onItemClick: ((BacaanBeranda) -> Unit)? = null

    inner class bacaanPojokViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgBacaan : ImageView = itemView.findViewById(R.id.iv_bc_1_pojok)
        val judulBacaan : TextView = itemView.findViewById(R.id.tv_bc_1_pojok)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bacaanPojokViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_1_pojokedukasi, parent, false)
        return bacaanPojokViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bacaanList.size
    }

    override fun onBindViewHolder(holder: bacaanPojokViewHolder, position: Int) {
        val bacaanBeranda = bacaanList[position]

        holder.imgBacaan.setImageResource(bacaanBeranda.image)
        holder.judulBacaan.text = bacaanBeranda.judul

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(bacaanBeranda)
        }

    }
}