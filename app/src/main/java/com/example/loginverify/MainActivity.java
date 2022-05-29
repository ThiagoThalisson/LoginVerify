package com.example.loginverify;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    public Button loginBtn;
    public String email = "";
    public String password = "";

    private EditText email_element;
    private EditText password_element;
    private TextView error_element;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getComponents();
        getValues();

        loginBtn.setOnClickListener(v -> {
            error_element.setText("");
            getValues();
            if (Objects.equals(email, "") || Objects.equals(password, "")) {
                Log.d("OURLOG", "Cannot follow tho.");
                error_element.setText("Data Is Missing.");
            } else {
                Intent welcomeScreen = new Intent(getApplicationContext(), WelcomeScreen.class);

                startActivity(welcomeScreen);
            }

        });
    }

    public void getComponents() {
        loginBtn = findViewById(R.id.loginBtn);
        email_element = findViewById(R.id.email);
        password_element = findViewById(R.id.password);
        error_element = findViewById(R.id.error);
    }

    public void getValues() {
        email = email_element.getText().toString();
        password = password_element.getText().toString();
    }

}
