package com.example.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        if (name.getText().length() != 0)
        send.putExtra("firstname", name.getText().toString());
        else{
            Toast.makeText(this, "Ви не заповнили поле з іменем", Toast.LENGTH_SHORT).show();
            return;
        }

        if (surname.getText().length() != 0)
        send.putExtra("secondname", surname.getText().toString());
        else{
            Toast.makeText(this, "Ви не заповнили поле з призвіщем", Toast.LENGTH_SHORT).show();
            return;
        }
        startActivity(send);
    }
}
