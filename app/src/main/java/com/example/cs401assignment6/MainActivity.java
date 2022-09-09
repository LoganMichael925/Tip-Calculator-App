package com.example.cs401assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button calculateButton;
    private EditText tipPercentage;
    private EditText mealAmount;
    private TextView tipResultTextView;
    private TextView totalTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculateButton = (Button) findViewById(R.id.calculate_button);
        tipPercentage = (EditText) findViewById(R.id.tip_percentage);
        mealAmount = (EditText) findViewById(R.id.cost_of_meal);
        tipResultTextView = (TextView) findViewById(R.id.calculation_result);
        totalTextView = (TextView) findViewById(R.id.calculationTotal_result);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tip = Integer.parseInt(tipPercentage.getText().toString());
                double amount = Integer.parseInt(mealAmount.getText().toString());
                double tipResult = ((tip * .01) * amount);
                double totalAmountWithTip = tipResult + amount;
                tipResultTextView.setText(String.valueOf(tipResult));
                totalTextView.setText(String.valueOf(totalAmountWithTip));
            }
        });

    }

}