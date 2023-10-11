package org.ecogank.ecolocate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import org.ecogank.ecolocate.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        supportActionBar?.hide()

        setContentView(binding.root)

        val btnLogin: Button = binding.btnLogin
        btnLogin.setOnClickListener(this)

        val btnRegister: Button = binding.btnRegister
        btnRegister.setOnClickListener(this)

        val btnLoginGuest: Button = binding.btnLoginGuest
        btnLoginGuest.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_login -> {
                val intent = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_register -> {
                val intent = Intent(this@MainActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_login_guest -> {
                val intent = Intent(this@MainActivity, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}