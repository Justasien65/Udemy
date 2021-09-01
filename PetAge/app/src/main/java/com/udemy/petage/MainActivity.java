package com.udemy.petage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Year;

public class MainActivity extends AppCompatActivity {

    EditText ageInput;
    Button btnSubmit, btnClear;
    TextView txtAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    public void findViews()
    {
        ageInput = findViewById(R.id.ageInput);
        btnClear = findViewById(R.id.btnClear);
        btnSubmit = findViewById(R.id.btnSubmit);
        txtAnswer = findViewById(R.id.realAge);
    }

    public void calculateAgeButtonClicked(View view)
    {

            int year = Integer.parseInt(Year.now().toString());
            int ageEntered = Integer.parseInt(ageInput.getText().toString());
            int currentAge = year - ageEntered;
            String answerString = "Your Pet is " + currentAge + " years old";
            txtAnswer.setText(answerString);
            Log.i("year", answerString);
    }

}