package edu.illinois.cs.cs125.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void open2(View view) {
        Intent broseIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vividseats.com/concerts/bruno-mars-tickets.html?utm_source=google&utm_medium=cpc&utm_campaign=Concerts+AB&utm_term=bruno+mars+tickets&vkid=7730077&gclid=Cj0KCQjw_ZrXBRDXARIsAA8KauT2PtwcbyQLr-WxVMci-n-XCGm_kuzvEKBbD2U7BvpyvBPNxpZpD70aAjdWEALw_wcB"));
        startActivity(broseIntent2);
    }

    public void open3(View view) {
        Intent broseIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCoUM-UJ7rirJYP8CQ0EIaHA"));
        startActivity(broseIntent3);
    }
}
