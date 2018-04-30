package edu.illinois.cs.cs125.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {
    ImageButton androidImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        androidImageButton = (ImageButton) findViewById(R.id.imageButton6);
        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.imageButton6:
                        Intent intentLoadNewActivity = new Intent(Main2Activity.this, Main6Activity.class);
                        startActivity(intentLoadNewActivity);
                        break;
                }
            }

        });
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
