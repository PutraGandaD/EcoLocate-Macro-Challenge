package org.ecogank.ecolocate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import org.ecogank.ecolocate.Model.MapsTPSData


/**
 * A simple [Fragment] subclass.
 * Use the [TemukanFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TemukanFragment : Fragment() {
    private var locationArrayList : ArrayList<MapsTPSData>? = null

    private val callback = OnMapReadyCallback { googleMap ->
        for (i in locationArrayList!!.indices) {
            googleMap.addMarker(MarkerOptions().position(LatLng(locationArrayList!![i].latitude, locationArrayList!![i].longitude)).title(locationArrayList!![i].placeName).snippet(locationArrayList!![i].placeAddress))
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(locationArrayList!![2].latitude, locationArrayList!![2].longitude), 15.0f))
            googleMap.animateCamera(CameraUpdateFactory.zoomTo(14.0f), 2000, null)
            googleMap.mapType = GoogleMap.MAP_TYPE_NORMAL
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_temukan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mapFragment = childFragmentManager.findFragmentById(R.id.fragment_maps) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)

        locationArrayList = ArrayList()
        locationArrayList!!.add(MapsTPSData(-2.961700781169533, 104.74892014785055, "Location 1", "Jalan Taqwa 1"))
        locationArrayList!!.add(MapsTPSData(-2.9831295839366834, 104.74686021144464, "Location 2", "Jalan Taqwa 2"))
        locationArrayList!!.add(MapsTPSData(-2.9814152950450232, 104.77484101429141, "Location 3", "Jalan Taqwa 3"))
    }
}