package org.ecogank.ecolocate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_view, navbar())
            .commit()

        if (savedInstanceState == null) {
            val fragment = SwipeCardFragment()

            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }

    }
}