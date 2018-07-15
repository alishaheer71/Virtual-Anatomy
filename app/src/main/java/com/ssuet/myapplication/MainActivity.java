package com.ssuet.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText etName,etPass;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etPass = findViewById(R.id.etPass);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etName.getText().toString();
                String pass = etPass.getText().toString();
                if(name.equals(Constants.name))
                {
                    if(pass.equals(Constants.pass))
                    {
                        Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this,VideoScreen.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Login UnSuccessfull",Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Login UnSuccessfull",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
