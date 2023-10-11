package org.ecogank.ecolocate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val splashScreenDuration = 2500L
        val mainActivityIntent = Intent(this, MainActivity::class.java)

        Thread {
            Thread.sleep(splashScreenDuration)
            startActivity(mainActivityIntent)
            finish()
        }.start()
    }
}
