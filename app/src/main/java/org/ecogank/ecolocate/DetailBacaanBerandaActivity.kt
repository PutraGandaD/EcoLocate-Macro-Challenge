package org.ecogank.ecolocate

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.ecogank.ecolocate.Model.BacaanBeranda
import org.ecogank.ecolocate.databinding.ActivityDetailBacaanBerandaBinding
import org.ecogank.ecolocate.databinding.ActivityHomeBinding

class DetailBacaanBerandaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBacaanBerandaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBacaanBerandaBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.appbarBacaanBeranda.setNavigationOnClickListener {
            onBackPressed()
        }

        binding.appbarBacaanBeranda.setOnMenuItemClickListener { menuItem ->
            when(menuItem.itemId) {
                R.id.menu_more -> {
                    Toast.makeText(this, "More button clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.menu_save -> {
                    Toast.makeText(this, "Save button clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.menu_share -> {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Your text to share goes here")

                    // Start the activity for sharing
                    startActivity(Intent.createChooser(shareIntent, "Share via"))

                    true
                }
                else -> false
            }
        }


        val bacaan = intent.getParcelableExtra<BacaanBeranda>("bacaanberanda")
        val bacaan2 = intent.getParcelableExtra<BacaanBeranda>("bacaanpojok")
        val bacaan3 = intent.getParcelableExtra<BacaanBeranda>("bacaanpojokdua")
        if (bacaan != null) {
            val judulBacaan : TextView = findViewById(R.id.tv_judul_bacaan_beranda)
            val isiBacaan: TextView = findViewById(R.id.tv_isi_bacaan_beranda)
            val imgBacaan: ImageView = findViewById(R.id.iv_isi_bacaan_beranda)

            judulBacaan.text = bacaan.judul
            isiBacaan.text = bacaan.isiBacaan
            imgBacaan.setImageResource(bacaan.image)
        }

        if (bacaan2 != null) {
            val judulBacaan : TextView = findViewById(R.id.tv_judul_bacaan_beranda)
            val isiBacaan: TextView = findViewById(R.id.tv_isi_bacaan_beranda)
            val imgBacaan: ImageView = findViewById(R.id.iv_isi_bacaan_beranda)

            judulBacaan.text = bacaan2.judul
            isiBacaan.text = bacaan2.isiBacaan
            imgBacaan.setImageResource(bacaan2.image)
        }

        if (bacaan3 != null) {
            val judulBacaan : TextView = findViewById(R.id.tv_judul_bacaan_beranda)
            val isiBacaan: TextView = findViewById(R.id.tv_isi_bacaan_beranda)
            val imgBacaan: ImageView = findViewById(R.id.iv_isi_bacaan_beranda)

            judulBacaan.text = bacaan3.judul
            isiBacaan.text = bacaan3.isiBacaan
            imgBacaan.setImageResource(bacaan3.image)
        }
    }
}