package com.example.accounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumberToPass;
    private EditText editTextPercentage;
    private Button buttonGetResult;
    private TextView viewTheResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumberToPass = findViewById(R.id.editTextTextPersonName2);
        editTextPercentage = findViewById(R.id.editTextTextPersonName3);
        buttonGetResult = findViewById(R.id.button);
        viewTheResult = findViewById(R.id.textViewResult);

        buttonGetResult.setOnClickListener(view -> {
            if (editTextNumberToPass.getText().toString().length() == 0) {
                editTextNumberToPass.setText("0");
            }

            if (editTextPercentage.getText().toString().length() == 0) {
                editTextPercentage.setText("0");
            }

            double numberPassed = Double.parseDouble(editTextNumberToPass.getText().toString());
            double numberPercentage = Double.parseDouble(editTextPercentage.getText().toString());
            double result = (numberPassed * 100) / (100 - numberPercentage);
            String resultFormatted = String.format("%.2f", result);

            viewTheResult.setText(resultFormatted);
        });

    }
}