package com.drakkens.hellotoast;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    int countValue = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Patata", String.valueOf(countValue));


        TextView textView = findViewById(R.id.show_count);

        Button count = findViewById(R.id.button_count);
        count.setOnClickListener(v -> {
            countValue++;
            textView.setText(String.valueOf(countValue));
        });

        Button toastButton = findViewById(R.id.button_toast);
        toastButton.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(),"CountValue = " + countValue, Toast.LENGTH_LONG).show();
        });



    }


}
