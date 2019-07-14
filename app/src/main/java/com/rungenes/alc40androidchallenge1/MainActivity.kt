package com.rungenes.alc40androidchallenge1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button_one = findViewById<Button>(R.id.button_one)

        val button_two = findViewById<Button>(R.id.button_two)

        button_one.setOnClickListener {
            val intentAboutAlc = Intent(this,About_ALC::class.java)

            startActivity(intentAboutAlc)
        }

        button_two.setOnClickListener {

            val intentMyProfile = Intent(this,MY_PROFILE::class.java)

            startActivity(intentMyProfile)

        }
    }
}
