package com.srcodex.msa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    AppCompatButton btnSub;
    TextView tvRated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        btnSub = findViewById(R.id.btnSub);
        tvRated = findViewById(R.id.tvRated);

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float userrating = ratingBar.getRating();

                if (userrating == 0){
                    Toast.makeText(MainActivity.this, "Rating Bar is Empty", Toast.LENGTH_SHORT).show();

                } else {

                    tvRated.setText("Rate: "+userrating);

                }

            }
        });

    }
}