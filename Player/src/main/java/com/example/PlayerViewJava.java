package com.example;

import android.content.Context;
import android.view.LayoutInflater;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;

import com.example.player.R;

public class PlayerViewJava extends PlayerView {
    public PlayerViewJava(Context context) {
        super(context);
        init();
    }

    private void init() {

        // Use LayoutInflater to inflate the layout into the custom view
        LayoutInflater inflater = LayoutInflater.from(getContext());
        inflater.inflate(R.layout.dhplayer_view, this, true);
    }

    public void playVideoByUrl(Context context, String url) {

        ExoPlayer exoPlayer = new ExoPlayer.Builder(context).build();
        PlayerView playerView = findViewById(R.id.video_view);

        exoPlayer = new ExoPlayer.Builder(context).build();
        playerView = findViewById(R.id.video_view);
        playerView.setPlayer(exoPlayer);

        MediaItem mediaItem = MediaItem.fromUri(url);

        exoPlayer.setMediaItem(mediaItem);
        exoPlayer.prepare();
        exoPlayer.play();

    }
}
