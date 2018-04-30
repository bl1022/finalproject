package edu.illinois.cs.cs125.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void open1(View view) {
        Intent broseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vividseats.com/concerts/taylor-swift-tickets.html?utm_source=google&utm_medium=cpc&utm_campaign=Concerts+ST&utm_term=taylor+swift+tickets&vkid=18431341&gclid=Cj0KCQjw_ZrXBRDXARIsAA8KauTuY19NkxtgsFkAAW4br91q1yzyv3ACU5VP7lacqxPeOlz2h0G2CtIaAnQ9EALw_wcB"));
        startActivity(broseIntent);
    }
    public void open2(View view) {
        Intent broseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCqECaJ8Gagnn7YCbPEzWH6g"));
        startActivity(broseIntent);
    }
}
