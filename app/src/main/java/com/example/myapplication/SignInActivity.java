package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class SignInActivity extends AppCompatActivity {

    TextInputLayout login_layout;
    TextInputEditText inputLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        login_layout = findViewById(R.id.inptlog);
        inputLogin = findViewById(R.id.EditLogin);


    }

    public void CreateNewAccount(View view){

        Intent intent = new Intent(this,SignUpActivity.class);
        startActivity(intent);

    }

    public void SignInAct(View view){

        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);

    }

    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            if(s.toString().isEmpty()){
                login_layout.setErrorEnabled(true);
            }

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            login_layout.setErrorEnabled(false);
        }
    };
}