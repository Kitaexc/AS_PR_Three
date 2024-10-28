package com.example.prakt_onee;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String price = intent.getStringExtra("price");
        int imageResId = intent.getIntExtra("imageResId", R.drawable.posche0);
        String description = intent.getStringExtra("description");

        ImageView detailImage = findViewById(R.id.detail_image);
        TextView detailTitle = findViewById(R.id.detail_title);
        TextView detailPrice = findViewById(R.id.detail_price);
        TextView detailDescription = findViewById(R.id.detail_description);

        detailImage.setImageResource(imageResId);
        detailTitle.setText(title);
        detailPrice.setText(price);
        detailDescription.setText(description);
    }
}
