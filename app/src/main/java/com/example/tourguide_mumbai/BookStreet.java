package com.example.tourguide_mumbai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookStreet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_layout);

        ImageView mainImageView = findViewById(R.id.main_image_view);
        TextView mainTextView = findViewById(R.id.main_text_view);
        TextView descriptionTextView = findViewById(R.id.description_text_view);

        mainImageView.setImageResource(R.drawable.bookmarketmarket);
        mainTextView.setText(R.string.book_street);
        descriptionTextView.setText(R.string.book_street_description);
    }
}
