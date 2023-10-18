package org.ecogank.ecolocate.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.ecogank.ecolocate.Model.TPSTerdekatData
import org.ecogank.ecolocate.R

class TPSTerdekatAdapter (private val tpsTerdekatList: ArrayList<TPSTerdekatData>) :
    RecyclerView.Adapter<TPSTerdekatAdapter.tpsTerdekatViewHolder>(){

    inner class tpsTerdekatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgTPS : ImageView = itemView.findViewById(R.id.iv_tps)
        val namaTPS : TextView = itemView.findViewById(R.id.tv_nama_tps)
        val jenisTPS : TextView = itemView.findViewById(R.id.tv_tag_tps)
        val alamatTPS : TextView = itemView.findViewById(R.id.tv_alamat_tps)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tpsTerdekatViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_tpsterdekat, parent, false)
        return tpsTerdekatViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tpsTerdekatList.size
    }

    override fun onBindViewHolder(holder: tpsTerdekatViewHolder, position: Int) {
        val tpsTerdekat = tpsTerdekatList[position]

        holder.imgTPS.setImageResource(tpsTerdekat.image)
        holder.namaTPS.text = tpsTerdekat.namaTPS
        holder.jenisTPS.text = tpsTerdekat.jenisTPS
        holder.alamatTPS.text = tpsTerdekat.alamatTPS
    }


}