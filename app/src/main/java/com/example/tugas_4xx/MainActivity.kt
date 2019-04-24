package com.example.tugas_4xx

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun panggil(view: View) {
        val nomor = "0"
        val panggil = Intent(Intent.ACTION_DIAL)
        panggil.data = Uri.fromParts("tel", nomor, null)
        startActivity(panggil)
    }

    fun buka(view: View) {
        val url = "https://Google.com"
        val bukabrowser = Intent(Intent.ACTION_VIEW)
        bukabrowser.data = Uri.parse(url)
        startActivity(bukabrowser)
    }
    fun tentang(view: View) {
        val tentang = Intent(this@MainActivity, Tentang::class.java)
        startActivity(tentang)
    }

     fun camera(view: View) {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
         startActivity(intent)
    }
}
