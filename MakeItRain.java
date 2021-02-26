package com.example.make_it_rain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TextView moneyTxt;
    private int moneyCounter;
    private View bg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bg = findViewById(R.id.mainBg);
        moneyTxt = findViewById(R.id.txt_money);
    }

    public void makeItRain(View view) {

        if (moneyCounter >= 5000) bg.setBackgroundColor(Color.parseColor("#AED581"));
        // To format numbers
        NumberFormat numToDollar = NumberFormat.getCurrencyInstance();
        moneyCounter += 500;
        moneyTxt.setText(String.valueOf((numToDollar.format(moneyCounter))));
    }

    public void showInfo(View view) {
        //Log.d("from:MAIN", "Show Info");
        // OLDER Toast.makeText(MainActivity.this,R.string.app_info, Toast.LENGTH_SHORT).show();
        Snackbar.make(moneyTxt, R.string.app_info, Snackbar.LENGTH_LONG)
                .setAction("RESET BG COLOR", v -> {
                    Log.d("Snack Bar: ", "INFO PRESSED");
                    bg.setBackgroundColor(Color.parseColor("#B39DDB"));
                })
                .show();
    }

}
