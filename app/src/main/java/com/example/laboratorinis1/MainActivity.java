package com.example.laboratorinis1;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain=(TextView)findViewById(R.id.tvMain); //this kviecia globalu
        this.tvMain.setText("Pagrindinis langas - Labas");
    }

    public void onBtnMainClick(View view) {
        this.tvMain.setText("Paspausta");
    }


        public void Color(View view) {
        tvMain.setTextColor(Color.rgb(200,240,200));

    }
}