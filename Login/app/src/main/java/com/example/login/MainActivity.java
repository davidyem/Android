package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editText);
        surname = findViewById(R.id.editText2);
    }

    public void sendsubjects(View view) {
        Intent send = new Intent(this, feedback.class);
        send.putExtra("firstname", name.getText().toString());
        send.putExtra("secondname", surname.getText().toString());
        startActivity(send);
    }
}
