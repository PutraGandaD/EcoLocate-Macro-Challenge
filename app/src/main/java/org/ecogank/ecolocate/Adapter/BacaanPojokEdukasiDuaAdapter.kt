package org.ecogank.ecolocate.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.ecogank.ecolocate.Model.BacaanBeranda
import org.ecogank.ecolocate.R

class BacaanPojokEdukasiDuaAdapter (private val bacaanList : ArrayList<BacaanBeranda>) :
    RecyclerView.Adapter<BacaanPojokEdukasiDuaAdapter.bacaanPojokViewHolder>(){

    var onItemClick: ((BacaanBeranda) -> Unit)? = null

    inner class bacaanPojokViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgBacaan : ImageView = itemView.findViewById(R.id.iv_bc_2_pojok)
        val judulBacaan : TextView = itemView.findViewById(R.id.tv_bc_2_pojok)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): bacaanPojokViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_2_pojokedukasi, parent, false)
        return bacaanPojokViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bacaanList.size
    }

    override fun onBindViewHolder(holder: bacaanPojokViewHolder, position: Int) {
        val bacaanBerandaDua = bacaanList[position]

        holder.imgBacaan.setImageResource(bacaanBerandaDua.image)
        holder.judulBacaan.text = bacaanBerandaDua.judul

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(bacaanBerandaDua)
        }

    }
}