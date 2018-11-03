package com.example.k8684.imagelibaries

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstImageBtn = findViewById(R.id.imageButton) as  Button
        firstImageBtn.setOnClickListener {
            val uri = "https://i.imgur.com/eiR04mR.jpg"
            Glide
                .with(this)
                .load(uri)
                .into(findViewById(R.id.imageView))

            }

        val gifImageBtn = findViewById(R.id.gifButton) as Button
        gifImageBtn.setOnClickListener {
            val uri2 = "http://img0.joyreactor.cc/pics/post/Anime-%D0%93%D0%B8%D1%84%D0%BA%D0%B8-Anime-show-by-rock%21%21-Animal-Ears-4146324.gif"
            Glide
                .with(this)
                .load(uri2)
                .into(findViewById(R.id.imageView2))
        }
        }

    }


