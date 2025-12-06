package com.Joro.audioplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer

class MainActivity : AppCompatActivity() {
    
    private var player: ExoPlayer? = null
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Simple test
        player = ExoPlayer.Builder(this).build()
        
        // Test audio URL
        val mediaItem = MediaItem.fromUri(
            "https://www.soundhelix.com/examples/mp3/SoundHelix-Song-1.mp3"
        )
        
        player?.setMediaItem(mediaItem)
        player?.prepare()
        player?.play()
    }
    
    override fun onDestroy() {
        super.onDestroy()
        player?.release()
    }
}
