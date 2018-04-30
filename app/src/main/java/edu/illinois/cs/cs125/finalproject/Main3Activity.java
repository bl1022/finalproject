package edu.illinois.cs.cs125.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void open4(View view) {
        Intent broseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.stubhub.com/camila-cabello-tickets/performer/100271305/?keyword=1000948450_c&gcid=C12289X486&creative=254069853298&gclid=CPijsraY4toCFVmAxQIdrx4PgA&gclsrc=ds"));
        startActivity(broseIntent);
    }
    public void open5(View view) {
        Intent broseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCio_FVgKVgqcHrRiXDpnqbw"));
        startActivity(broseIntent);
    }
}
