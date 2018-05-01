package edu.illinois.cs.cs125.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class Main6Activity extends YouTubeBaseActivity {
    private static final String TAG = "activity_main6";
    YouTubePlayerView mYouTubePlayerView;
    Button btnplayer;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Log.d(TAG, "onCreate:Starting");
        btnplayer = (Button) findViewById(R.id.btmplay);
        mYouTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlayer1);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.d(TAG, "onClick: Done initializing.");
//                List<String> videoList = new ArrayList<>();
//                videoList.add("UqyT8IEBkvY");
//                videoList.add("OPf0YbXqDm0");
                youTubePlayer.loadPlaylist("PL2gNzJCL3m_8dI4Jl2_nVvFyTqMQigckS");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.d(TAG, "onClick: failed to initialize.");
            }
        };
        btnplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Intializing Youtube Player");
                mYouTubePlayerView.initialize(youtube111.getApiKey(), mOnInitializedListener);
            }
        });
    }
        public void open222(View view) {
            Intent broseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vividseats.com/concerts/bruno-mars-tickets.html?utm_source=google&utm_medium=cpc&utm_campaign=Concerts+AB&utm_term=bruno+mars+tickets&vkid=7730077&gclid=Cj0KCQjw_ZrXBRDXARIsAA8KauTCyllJnqJxfxKlOP722jfdSM6MR8QRHqr3H8jfwnntIeIAoGl0D0kaApXSEALw_wcB"));
            startActivity(broseIntent);
        }
    }
