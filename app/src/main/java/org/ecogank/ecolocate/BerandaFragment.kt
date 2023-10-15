package org.ecogank.ecolocate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.ecogank.ecolocate.Adapter.BacaanBerandaAdapter
import org.ecogank.ecolocate.Model.BacaanBeranda

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BerandaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BerandaFragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beranda, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var recyclerView : RecyclerView = view.findViewById(R.id.rv_bacaan_beranda)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val bacaanBerandaList = ArrayList<BacaanBeranda>()

        bacaanBerandaList.add(BacaanBeranda(R.drawable.img_bacaanberanda01, "Kenali jenis-jenis TPS yang ada di Indonesia", "dhfgdfgdfgdjfbdjfbdhbfhdfdhfhdfhdgfhdgfedhfgdhgfdgfdhgfdhgfdjkgfdjkfgdfhdgfdhf"))
        bacaanBerandaList.add(BacaanBeranda(R.drawable.img_bacaanberanda01, "Kenali jenis-jenis TPS yang ada di Indonesia", "dhfgdfgdfgdjfbdjfbdhbfhdfdhfhdfhdgfhdgfedhfgdhgfdgfdhgfdhgfdjkgfdjkfgdfhdgfdhf"))
        bacaanBerandaList.add(BacaanBeranda(R.drawable.img_bacaanberanda01, "Kenali jenis-jenis TPS yang ada di Indonesia", "dhfgdfgdfgdjfbdjfbdhbfhdfdhfhdfhdgfhdgfedhfgdhgfdgfdhgfdhgfdjkgfdjkfgdfhdgfdhf"))
        bacaanBerandaList.add(BacaanBeranda(R.drawable.img_bacaanberanda01, "Kenali jenis-jenis TPS yang ada di Indonesia", "dhfgdfgdfgdjfbdjfbdhbfhdfdhfhdfhdgfhdgfedhfgdhgfdgfdhgfdhgfdjkgfdjkfgdfhdgfdhf"))

        val bacaanBerandaAdapter = BacaanBerandaAdapter(bacaanBerandaList)
        recyclerView.adapter = bacaanBerandaAdapter
    }
}