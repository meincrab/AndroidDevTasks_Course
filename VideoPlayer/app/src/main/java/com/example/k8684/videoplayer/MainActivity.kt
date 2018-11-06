package com.example.k8684.videoplayer

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.youtube.player.YouTubePlayer

class MainActivity : YouTubeBaseActivity() {

    lateinit var youtubePlayerInit: YouTubePlayer.OnInitializedListener

    lateinit var textFromField : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val youtubeApiKey = "There was a key one Day, but not anymore."
        val playButton = findViewById<Button>(R.id.playButton)
        val getLinkButton = findViewById<Button>(R.id.getLinkButton)

        getLinkButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                textFromField = findViewById<EditText>(R.id.addressInput)
                //Toast.makeText(getApplicationContext(), textFromField.text, Toast.LENGTH_LONG).show()
                var videoCode = textFromField.getText().toString()
                if (videoCode.length < 30) {
                    videoCode = videoCode.substring(17)
                }
                else {
                    videoCode = videoCode.substring(32)
                }

                Toast.makeText(getApplicationContext(), videoCode, Toast.LENGTH_LONG).show()

                activatePlayer(videoCode)
            }
        })

        playButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                youtubePlayer.initialize(youtubeApiKey, youtubePlayerInit)
            }
        })
    }
    fun activatePlayer(videoCode : String) {

        youtubePlayerInit = object: YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(p0: YouTubePlayer.Provider?, youtubePlayer: YouTubePlayer?, p2: Boolean) {
                youtubePlayer?.loadVideo(videoCode)
            }

            override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }




    }
}