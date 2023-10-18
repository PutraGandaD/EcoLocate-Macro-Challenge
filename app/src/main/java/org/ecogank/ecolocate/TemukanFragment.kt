package org.ecogank.ecolocate

import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.location.Location
import android.net.Uri
import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.PackageManagerCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import org.ecogank.ecolocate.Model.MapsTPSData
import org.ecogank.ecolocate.R
import java.util.function.DoubleBinaryOperator

class TemukanFragment : Fragment() {

    private var locationArrayList : ArrayList<MapsTPSData>? = null

    private val callback = OnMapReadyCallback { googleMap ->
        for (i in locationArrayList!!.indices) {
            googleMap.addMarker(MarkerOptions().position(LatLng(locationArrayList!![i].latitude, locationArrayList!![i].longitude)).title(locationArrayList!![i].placeName).snippet(locationArrayList!![i].placeAddress))
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(locationArrayList!![2].latitude, locationArrayList!![2].longitude), 14.0f))
            googleMap.animateCamera(CameraUpdateFactory.zoomTo(12.0f), 2000, null)
            googleMap.mapType = GoogleMap.MAP_TYPE_NORMAL
            googleMap.setOnMarkerClickListener {
                it.showInfoWindow()

                showBottomSheet(it.title, it.snippet, it.position.latitude, it.position.longitude)
                true
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_temukan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mapFragment = childFragmentManager.findFragmentById(R.id.fragment_maps) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)

        locationArrayList = ArrayList()
        locationArrayList!!.add(MapsTPSData(-2.9534786880569577, 104.79121366680495, "Instalasi TPS 3R Kalidoni", "2QWR+HC6, Kalidoni, Palembang City, South Sumatra 30163"))
        locationArrayList!!.add(MapsTPSData(-2.956556431723062, 104.79389538952213, "Bank Sampah KGS", "no. 2819, Jl. Sersan Zaini No.rt. 27, 2 Ilir, Kec. Ilir Tim. II, Kota Palembang, Sumatera Selatan 30163"))
        locationArrayList!!.add(MapsTPSData(-2.929984017974914, 104.73827710656293, "Bank Sampah Induk Kota Palembang", "3P8H+GXQ, Jl. Sukarela, Sukarami, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30961"))
        locationArrayList!!.add(MapsTPSData(-2.925914591477192, 104.78770742055981, "TPS Sampah Pasar Sako Mandiri", "3QCP+QWX, Sako, Palembang City, South Sumatra 30961"))
        locationArrayList!!.add(MapsTPSData(-2.953805591495924, 104.80210474365232, "TPS Pasundan Kalidoni", "Jl. Pasundan No.32, Kalidoni, Kec. Kalidoni, Kota Palembang, Sumatera Selatan 30163"))
        locationArrayList!!.add(MapsTPSData(-2.9487353872091036, 104.73318792173534, "TPS Kota Baru", "2PWM+R9Q, Lrg. Kota Baru, Srijaya, Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan"))
        locationArrayList!!.add(MapsTPSData(-2.967651497386037, 104.7475436183853, "Bank Sampah Kamboja", "2PWM+R9Q, Lrg. Kota Baru, Srijaya, Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan"))
    }

    private fun showBottomSheet(placeName: String?, placeAddress: String?, latitude: Double?, longitude: Double?) {
        var view = layoutInflater.inflate(R.layout.bottomsheet_maps, null)
        var dialog = BottomSheetDialog(requireContext())

        val tvPlaceName : TextView = view.findViewById(R.id.tv_placeName)
        val tvPlaceAddress : TextView = view.findViewById(R.id.tv_placeAddress)
        val tvLatitude: TextView = view.findViewById(R.id.tv_latitude)
        val tvLongitude: TextView = view.findViewById(R.id.tv_longitude)
        val btnGoogleMaps: Button = view.findViewById(R.id.btn_gmaps)

        tvPlaceName.text = placeName
        tvPlaceAddress.text = placeAddress
        tvLatitude.setText(latitude.toString())
        tvLongitude.setText(longitude.toString())

        btnGoogleMaps.setOnClickListener() {
            openGoogleMaps(latitude, longitude)
        }

        dialog.setContentView(view)
        dialog.show()
    }

    private fun openGoogleMaps(latitude: Double?, longitude: Double?) {
        var mapUri: Uri = Uri.parse("https://maps.google.com/maps/search/" + latitude + "," + longitude)
        val intent = Intent(Intent.ACTION_VIEW, mapUri)
        startActivity(intent)
    }

}
