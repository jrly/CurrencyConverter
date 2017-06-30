package com.example.jimmy.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertpound(View view) {

        EditText input1 = (EditText) findViewById(R.id.input);
        //created a variable 'in' which is equal to our textfield input
        Log.i("input: ", input1.getText().toString());              //convert text to string and show in log
        Double input2 = Double.parseDouble(input1.getText().toString());
        //gets 'input1' and converts 'input1' into a string then into a double and stores it in input2

        Double pound = input2 * 0.65;               //easy enough

        Toast.makeText(getApplicationContext(), "£ " + pound.toString(), Toast.LENGTH_LONG).show();
        //shows as a toast
    }
    public void convertusd(View view) {

        EditText input1 = (EditText) findViewById(R.id.input);

        Double input2 = Double.parseDouble(input1.getText().toString());

            Double usd = input2 * .76;

        Toast.makeText(getApplicationContext(), usd.toString() + " USD", Toast.LENGTH_LONG).show();
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
