package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

public class SignUpActivity extends AppCompatActivity {

    TextInputEditText editLog;
    TextInputEditText editMail;
    TextInputEditText editPass;
    TextInputEditText editrptpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editLog = findViewById(R.id.EditLogin);
        editMail = findViewById(R.id.editMail);
        editPass = findViewById(R.id.editPass);
        editrptpass = findViewById(R.id.rptpassedit);
    }




    public void SignInAct(View view){



        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("name",editLog.getText().toString());
        intent.putExtra("mail",editMail.getText().toString());
        intent.putExtra("pass",editPass.getText().toString());
        startActivity(intent);

    }



}