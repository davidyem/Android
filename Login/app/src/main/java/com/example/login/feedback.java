package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class feedback extends AppCompatActivity {

    RadioGroup speciality;
    CheckBox lections;
    CheckBox practice;
    CheckBox laborate;
    Spinner subjects;
    TextView greetings;
    TextView yourchoose;
    String firstname;
    String secondname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        speciality = findViewById(R.id.radioGroup);
        lections = findViewById(R.id.checkBox);
        practice = findViewById(R.id.checkBox2);
        laborate = findViewById(R.id.checkBox3);
        subjects = findViewById(R.id.spinner);
        greetings = findViewById(R.id.textView2);
        yourchoose = findViewById(R.id.textView3);
        firstname = getIntent().getStringExtra("firstname");
        secondname = getIntent().getStringExtra("secondname");

        int radiobuttonid = speciality.getCheckedRadioButtonId();
        RadioButton radio = findViewById(radiobuttonid);

        String firstquest = getResources().getString(R.string.pastename);
        String secondquest = getResources().getString(R.string.pastecourse);


        greetings.setText(firstquest+ firstname);
        yourchoose.setText(String.format(secondquest, radio.getText()));


    }

    public void sendresult(View view) {
        Intent send = new Intent(this, receive.class);
        int radiobuttonid = speciality.getCheckedRadioButtonId();
        RadioButton radio = findViewById(radiobuttonid);
        send.putExtra("speciality", radio.getText());
        send.putExtra("subjects", subjects.getSelectedItem().toString());
        if (lections.isChecked()){
            send.putExtra("lections", lections.getText());
        }
        if (practice.isChecked()){
            send.putExtra("practice", practice.getText());
        }
        if (laborate.isChecked()){
            send.putExtra("laborate", laborate.getText());
        }

        send.putExtra("firstname", firstname);
        send.putExtra("secondname", secondname);
        startActivity(send);

    }
}
