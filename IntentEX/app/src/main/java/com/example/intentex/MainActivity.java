package com.example.intentex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button);
        final EditText text = findViewById(R.id.editText);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                String msg = text.getText().toString();
                intent.putExtra("msg", msg);
                startActivity(intent);*/
                Intent intent = new Intent(Intent.ACTION_SEND);
                String msg= text.getText().toString();
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, msg);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(Intent.createChooser(intent, "Choose app"));
                }
            }
        });
    }



}
