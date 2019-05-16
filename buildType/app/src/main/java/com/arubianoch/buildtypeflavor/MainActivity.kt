package com.arubianoch.buildtypeflavor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


//https://www.cuelogic.com/blog/how-to-create-and-configure-android-build-variants
class MainActivity : AppCompatActivity() {

    companion object {
        const val value = "sandbox"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
