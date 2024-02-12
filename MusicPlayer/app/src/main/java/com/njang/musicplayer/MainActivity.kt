package com.njang.musicplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.njang.musicplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var  mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Initializes MediaPlayer.
        mediaPlayer = MediaPlayer.create(this, R.raw.song1)

        binding.playButton.setOnClickListener {
            if(!mediaPlayer.isPlaying) {
                mediaPlayer.start()
            }
        }

        binding.pauseButton.setOnClickListener {
            if(mediaPlayer.isPlaying) {
                mediaPlayer.pause()
            }
        }

        binding.stopButton.setOnClickListener {
            if(mediaPlayer.isPlaying) {
                mediaPlayer.stop()
                mediaPlayer.prepare()
                mediaPlayer.seekTo(0)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}