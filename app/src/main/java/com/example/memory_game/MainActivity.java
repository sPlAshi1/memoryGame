package com.example.memory_game;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView[] img;
    ArrayList<Integer> array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = new ImageView[6];
        img[0] = findViewById(R.id.imageView4);
        img[1] = findViewById(R.id.imageView5);
        img[2] = findViewById(R.id.imageView7);
        img[3] = findViewById(R.id.imageView8);
        img[4] = findViewById(R.id.imageView9);
        img[5] = findViewById(R.id.imageView10);
    }
}