package com.example.prakt_onee;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        Button detailButton1 = findViewById(R.id.detail_button_1);
        detailButton1.setOnClickListener(v -> {
            Intent intent = new Intent(CardActivity.this, DetailActivity.class);

            intent.putExtra("title", "Porsche 718 Cayman GT4");
            intent.putExtra("price", "$200,000");
            intent.putExtra("imageResId", R.drawable.posche1);
            intent.putExtra("description", "Это Porsche 718 Cayman GT4 — спортивный автомобиль с отличной управляемостью и мощным двигателем.");

            startActivity(intent);
        });

        Button detailButton2 = findViewById(R.id.detail_button_2);
        detailButton2.setOnClickListener(v -> {
            Intent intent = new Intent(CardActivity.this, DetailActivity.class);

            intent.putExtra("title", "Porsche 911 GT3");
            intent.putExtra("price", "$420,000");
            intent.putExtra("imageResId", R.drawable.posche2);
            intent.putExtra("description", "Porsche 911 GT3 — это настоящая икона в мире спортивных автомобилей, сочетающая скорость и комфорт.");

            startActivity(intent);
        });

        Button detailButton3 = findViewById(R.id.detail_button_3);
        detailButton3.setOnClickListener(v -> {
            Intent intent = new Intent(CardActivity.this, DetailActivity.class);


            intent.putExtra("title", "Porsche Boxster");
            intent.putExtra("price", "$150,000");
            intent.putExtra("imageResId", R.drawable.posche3);
            intent.putExtra("description", "Porsche Boxster: Лёгкий и маневренный родстер с центральным расположением двигателя, идеален для динамичных поездок с открытым верхом.");

            startActivity(intent);
        });

        Button detailButton4 = findViewById(R.id.detail_button_4);
        detailButton4.setOnClickListener(v -> {
            Intent intent = new Intent(CardActivity.this, DetailActivity.class);

            intent.putExtra("title", "Porsche 991");
            intent.putExtra("price", "$300,000");
            intent.putExtra("imageResId", R.drawable.posche4);
            intent.putExtra("description", "Porsche 991: Легендарный спорткар с классическим дизайном, сочетающий невероятную мощность и современные технологии.");

            startActivity(intent);
        });

        Button detailButton5 = findViewById(R.id.detail_button_5);
        detailButton5.setOnClickListener(v -> {
            Intent intent = new Intent(CardActivity.this, DetailActivity.class);

            intent.putExtra("title", "Porsche Cayman");
            intent.putExtra("price", "$120,000");
            intent.putExtra("imageResId", R.drawable.posche5);
            intent.putExtra("description", "Porsche Cayman: Компактное купе с отличной управляемостью и впечатляющей динамикой, предлагающее идеальный баланс для спортивного вождения.");

            startActivity(intent);
        });
    }
}
