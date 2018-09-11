package com.example.k8684.basiccontrols;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AutoCompleteTextView actv; // add stings to control
        actv = (AutoCompleteTextView)
                findViewById(R.id.login);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[]
                        {"Pasi","Juha","Kari","Jouni","Esa","Hannu"});
        actv.setAdapter(aa);
    }

    EditText loginInput;
    EditText passwordInput;

    public void loginButtonClicked(View view) {
        loginInput = (EditText) findViewById(R.id.login);
        String loginText = loginInput.getText().toString();
        passwordInput = (EditText) findViewById(R.id.password);
        String passwordText = passwordInput.getText().toString();
        String together = loginText + ", " + passwordText;
        Toast.makeText(getApplicationContext(), together, Toast.LENGTH_SHORT).show();

    }




}
