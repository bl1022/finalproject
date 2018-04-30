package edu.illinois.cs.cs125.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void open1(View view) {
        Intent broseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vividseats.com/concerts/eminem-tickets.html?utm_source=google&utm_medium=cpc&utm_campaign=Concerts+EH&utm_term=eminem+tickets&vkid=20303817&gclid=Cj0KCQjw_ZrXBRDXARIsAA8KauTNd4FYSJSdiK3L6IVRSkwIKjPCZhNosT5s20CLqGYjF4V49z9qAbIaAqJHEALw_wcB"));
        startActivity(broseIntent);
    }

    public void open2(View view) {
        Intent broseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCfM3zsQsOnfWNUppiycmBuw"));
        startActivity(broseIntent);
    }
}