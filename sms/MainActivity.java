package com.example.sms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText phone=findViewById(R.id.phonenumber);
                EditText msg=findViewById(R.id.msg);
                SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage(phone.getText().toString(),null,msg.getText().toString(),null,null);


            }
        });

    }
}
