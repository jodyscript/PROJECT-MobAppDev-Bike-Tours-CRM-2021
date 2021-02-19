package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button showButton;
    private TextView nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showButton = findViewById(R.id.button);
        nameText = findViewById(R.id.textView);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameText.setText("Hello Jody!");
            }
        });
    }
}
