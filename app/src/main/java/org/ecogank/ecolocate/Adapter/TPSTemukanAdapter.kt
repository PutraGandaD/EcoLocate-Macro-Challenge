package org.ecogank.ecolocate.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.ecogank.ecolocate.Model.TPSTerdekatData
import org.ecogank.ecolocate.R

class TPSTemukanAdapter (private val tpsTemukanList: ArrayList<TPSTerdekatData>) :
    RecyclerView.Adapter<TPSTemukanAdapter.tpsTemukanViewHolder>(){

    inner class tpsTemukanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val namaTPS : TextView = itemView.findViewById(R.id.tv_nama_tps)
        val jenisTPS : TextView = itemView.findViewById(R.id.tv_tag_tps)
        val imgTPS : ImageView = itemView.findViewById(R.id.iv_img_tps_temukan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tpsTemukanViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tpstemukan, parent, false)
        return tpsTemukanViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tpsTemukanList.size
    }

    override fun onBindViewHolder(holder: tpsTemukanViewHolder, position: Int) {
        val tpsTemukan = tpsTemukanList[position]

        holder.namaTPS.text = tpsTemukan.namaTPS
        holder.jenisTPS.text = tpsTemukan.jenisTPS
        holder.imgTPS.setImageResource(tpsTemukan.image)
    }


}