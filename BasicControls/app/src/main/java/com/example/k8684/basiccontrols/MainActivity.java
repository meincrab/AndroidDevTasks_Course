package com.example.k8684.basiccontrols;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectButtonClicked(View view) {
        RadioGroup rg = (RadioGroup) findViewById(R.id.FirstRadioGroup);
        int id = rg.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(id);
        String text = (String) rb.getText();
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
