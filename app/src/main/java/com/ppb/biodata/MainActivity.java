package com.ppb.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openLocation(View view) {
        // Parse the location and create the intent.
        Uri addressUri = Uri.parse("geo:0,0?q=Boja, Kendal");
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        // Find an activity to handle the intent, and start that activity.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Tak ada aplikasi yang mendukung aksi ini!");
        }
    }

    public void openDialer(View view) {
        // Parse the number and create the intent.
        Uri addressUri = Uri.parse("tel:083838045550");
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        // Find an activity to handle the intent, and start that activity.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Tak ada aplikasi yang mendukung aksi ini!");
        }
    }

    public void openEmail(View view) {
        // Parse the email and create the intent.
        Uri addressUri = Uri.parse("mailto:" + Uri.encode("uliarizki@gmail.com"));
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        // Find an activity to handle the intent, and start that activity.
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Tak ada aplikasi yang mendukung aksi ini!");
        }
    }
}
