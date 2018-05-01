package edu.illinois.cs.cs125.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;
    ImageButton androidImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
//                startActivity(homeIntent);
//                finish();
//            }
//
//        },SPLASH_TIME_OUT);
        ImageButton button1 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton button2 = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton button3 = (ImageButton) findViewById(R.id.imageButton12);
        ImageButton button4 = (ImageButton) findViewById(R.id.imageButton16);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Intent int1 = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(int1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(int2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(int3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(int4);
            }
        });
//        androidImageButton = (ImageButton) findViewById(R.id.imageButton8);
//        androidImageButton = (ImageButton) findViewById(R.id.imageButton10);
//        androidImageButton = (ImageButton) findViewById(R.id.imageButton12);
//        androidImageButton = (ImageButton) findViewById(R.id.imageButton16);
//        androidImageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.id.imageButton8:
//                    Intent intentLoadNewActivity = new Intent(MainActivity.this, Main2Activity.class);
//                    startActivity(intentLoadNewActivity);
//                    break;
//                    case R.id.imageButton10:
//                        Intent intentLoadNewActivity1 = new Intent(MainActivity.this, Main3Activity.class);
//                        startActivity(intentLoadNewActivity1);
//                        break;
//                    case R.id.imageButton12:
//                        Intent intentLoadNewActivity2 = new Intent(MainActivity.this, Main4Activity.class);
//                        startActivity(intentLoadNewActivity2);
//                        break;
//                    case R.id.imageButton16:
//                        Intent intentLoadNewActivity3 = new Intent(MainActivity.this, Main5Activity.class);
//                        startActivity(intentLoadNewActivity3);
//                        break;
//                }
//            }
//
//        });
    }
    public void open(View view) {
        Intent broseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=2Vv-BfVoq4g&list=PLI_7Mg2Z_-4I-W_lI55D9lBUkC66ftHMg"));
        startActivity(broseIntent);
    }
}
