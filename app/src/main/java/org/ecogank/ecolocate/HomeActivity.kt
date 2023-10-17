package org.ecogank.ecolocate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment
import org.ecogank.ecolocate.databinding.ActivityHomeBinding


class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val windowInsetsControllerCompat = WindowInsetsControllerCompat(
            window, window.decorView
        )
        windowInsetsControllerCompat.isAppearanceLightNavigationBars = true

        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        replaceFragment(BerandaFragment())

        binding.bottomNavBar.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> replaceFragment(BerandaFragment())
                R.id.temukan -> replaceFragment(TemukanFragment())
                R.id.pojokedu -> replaceFragment(PojokEdukasiFragment())
                R.id.profil -> replaceFragment(ProfilFragment())
//                R.id.profil -> replaceFragment(ProfilEditFragment())
                else -> {

                }
            }

            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }
}