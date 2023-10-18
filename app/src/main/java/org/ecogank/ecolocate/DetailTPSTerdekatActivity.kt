package org.ecogank.ecolocate

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import org.ecogank.ecolocate.Model.TPSTerdekatData
import org.ecogank.ecolocate.databinding.ActivityDetailTpsterdekatBinding

class DetailTPSTerdekatActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailTpsterdekatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailTpsterdekatBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.appbarBacaanTpsDetail.setNavigationOnClickListener {
            onBackPressed()
        }

        binding.appbarBacaanTpsDetail.setOnMenuItemClickListener { menuItem ->
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

        binding.btnGotoGmaps.setOnClickListener{
            val koordinatTempat = intent.getParcelableExtra<TPSTerdekatData>("detailtpsterdekat")
            openGoogleMaps(koordinatTempat?.latitude, koordinatTempat?.longitude)
        }

        val detailTPS = intent.getParcelableExtra<TPSTerdekatData>("detailtpsterdekat")
        if (detailTPS != null) {
            binding.tvNamaTpsDetail.text = detailTPS.namaTPS
            binding.ivTpsDetailBeranda.setImageResource(detailTPS.image)
            binding.tvJenisTpsDetail.text = detailTPS.jenisTPS
            binding.tvAlamatTpsDetail.text = detailTPS.alamatTPS
            binding.tvHariTpsDetail.text = detailTPS.hariOperasionalTPS
            binding.tvJamTpsDetail.text = detailTPS.jamBukaTPS
            binding.tvJenisSampahDetail.text = detailTPS.jenisSampah
            binding.tvWaTpsDetail.text = detailTPS.waTPS
            binding.tvEmailTpsDetail.text = detailTPS.emailTPS
        }
    }

    private fun openGoogleMaps(latitude: Double?, longitude: Double?) {
        var mapUri: Uri = Uri.parse("https://maps.google.com/maps/search/" + latitude + "," + longitude)
        val intent = Intent(Intent.ACTION_VIEW, mapUri)
        startActivity(intent)
    }

}