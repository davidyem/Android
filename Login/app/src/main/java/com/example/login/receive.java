package com.example.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class receive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve);
        String firstanme = getIntent().getStringExtra("firstname");
        String secondname = getIntent().getStringExtra("secondname");

        String lections = getIntent().getStringExtra("lectiosn");
        String practice = getIntent().getStringExtra("practice");
        String laborate = getIntent().getStringExtra("laborate");
        String radio = getIntent().getStringExtra("subjects");
        String subjects = getIntent().getStringExtra("subjects");

        
        String action = "";
        String fullname = firstanme + " " + secondname;

        if (lections != null)
            action += lections + " ";
        if (practice != null)
            action += practice + " ";
        if (laborate != null)
            action += laborate + " ";

        TextView resulttext = findViewById(R.id.textView5);
        String resText = getResources().getString(R.string.text_result);

        resulttext.setText(String.format(resText, fullname, radio, action, subjects));
    }
}

