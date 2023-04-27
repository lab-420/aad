package com.example.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button but;
    RadioGroup rgroup;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but=(Button) findViewById(R.id.button);
        rgroup=(RadioGroup) findViewById(R.id.radiogrp);
        but.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                int selected=rgroup.getCheckedRadioButtonId();
                RadioButton radio=(RadioButton) findViewById(selected);
                Toast.makeText(MainActivity.this,"You selected : "+radio.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
