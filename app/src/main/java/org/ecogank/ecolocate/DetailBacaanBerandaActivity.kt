package org.ecogank.ecolocate

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.ecogank.ecolocate.Model.BacaanBeranda

class DetailBacaanBerandaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_bacaan_beranda)

        val bacaan = intent.getParcelableExtra<BacaanBeranda>("bacaanberanda")
        if (bacaan != null) {
            val judulBacaan : TextView = findViewById(R.id.tv_judul_bacaan_beranda)
            val isiBacaan: TextView = findViewById(R.id.tv_isi_bacaan_beranda)
            val imgBacaan: ImageView = findViewById(R.id.iv_isi_bacaan_beranda)

            judulBacaan.text = bacaan.judul
            isiBacaan.text = bacaan.isiBacaan
            imgBacaan.setImageResource(bacaan.image)
        }
    }
}