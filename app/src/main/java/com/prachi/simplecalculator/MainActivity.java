package com.prachi.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View v){
        EditText year = findViewById(R.id.birthYear);
        TextView ageText = findViewById(R.id.yourAge);
        int birthYear=Integer.parseInt(year.getText().toString());
        int currentYear=Calendar.getInstance().get(Calendar.YEAR);
        if(currentYear>=birthYear) {
            int age = currentYear - birthYear;
            ageText.setText(age + " Years Old ");
        }
        else{
            ageText.setText("Invalid Year ");
        }

    }
}