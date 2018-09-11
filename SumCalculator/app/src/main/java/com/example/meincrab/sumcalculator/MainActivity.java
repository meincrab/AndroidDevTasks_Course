package com.example.meincrab.sumcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCalc(View view) {
        Toast.makeText(getApplicationContext(), "Hello World", Toast.LENGTH_SHORT).show();
        EditText num1 = (EditText)findViewById(R.id.number1);
        EditText num2 = (EditText)findViewById(R.id.number2);
        TextView calcText = (TextView)findViewById(R.id.output);

        float number1 = Float.parseFloat(num1.getText().toString());
        float number2 = Float.parseFloat(num2.getText().toString());
        float result = number1 + number2;
        calcText.setText(Float.toString(result));
        Toast.makeText(getApplicationContext(), Float.toString(result), Toast.LENGTH_SHORT).show();
    }
}
