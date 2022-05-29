package com.example.loginverify;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public Button loginBtn;
    public EditText email = null;
    public EditText password = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText() == null || password.getText() == null) {
                    System.out.println("Something's not right");
                } else {
                    Intent welcomeScreen = new Intent(getApplicationContext(), WelcomeScreen.class);

                    startActivity(welcomeScreen);
                }

            }
        });
    }

}
