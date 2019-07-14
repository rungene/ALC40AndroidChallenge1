package com.rungenes.alc40androidchallenge1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MY_PROFILE : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my__profile)

        supportActionBar!!.title="My Profile"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
