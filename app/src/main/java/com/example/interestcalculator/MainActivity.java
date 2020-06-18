package com.example.interestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText SavingsAmountET;
    EditText TenureET;
    EditText InterestRateET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SavingsAmountET.findViewById(R.id.EditTv1);
        TenureET.findViewById(R.id.EditTv2);
        InterestRateET.findViewById(R.id.EditTv3);


        String Amount = SavingsAmountET.toString();
        String Tenure = TenureET.toString();
        String InterestRate = InterestRateET.toString();




        if (Amount.trim().isEmpty()){
            Toast.makeText(this, "Please insert an Amount", Toast.LENGTH_SHORT).show();

        }else if (Tenure.trim().isEmpty()) {
            Toast.makeText(this, "Please insert a Tenure", Toast.LENGTH_SHORT).show();
        }else if (InterestRate.trim().isEmpty()) {
            Toast.makeText(this, "Please insert an InterestRate", Toast.LENGTH_SHORT).show();
        }else {
//            Intent intent = new Intent(getApplicationContext(), NextActivity.class);
        }


    }





}
