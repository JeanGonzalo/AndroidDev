package com.example.platzigram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.platzigram.views.ContainerActivity;
import com.example.platzigram.views.Programador;
import com.example.platzigram.views.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);

    }

    public void goLogin(View view){

        EditText user,pass;
        Button login;
        int counter = 3;
        user = findViewById(R.id.idUsername);
        pass = findViewById(R.id.idPassword);
        login = findViewById(R.id.idLogin);

        if(user.getText().toString().equals("admin") &&
                    pass.getText().toString().equals("admin")) {
                Toast.makeText(getApplicationContext(),
                        "Redirecting...",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, ContainerActivity.class);
            startActivity(intent);

            }
        else if(user.getText().toString().equals("programador") &&
                pass.getText().toString().equals("programador")) {
            Toast.makeText(getApplicationContext(),
                    "Redirecting...",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Programador.class);
            startActivity(intent);
        }

        else{
                Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                        user.setVisibility(View.VISIBLE);
                counter--;

                if (counter == 0) {
                    login.setEnabled(false);
                }
            }
        }
    }
/*
    public void goLogin(View view){
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }*/

