package com.example.k8684.launchmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showMap(View view) {
        EditText latitudeDataStr = (EditText) findViewById(R.id.latitudeData);
        EditText longtitudeDataStr = (EditText) findViewById(R.id.longtitudeData);
        String firstNumber = latitudeDataStr.getText().toString();
        String secondNumber = longtitudeDataStr.getText().toString();

        double lat = Double.parseDouble(firstNumber);
        double lng = Double.parseDouble(secondNumber);
        //Showing map

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:"+lat+","+lng));
        startActivity(intent);
    }
}
