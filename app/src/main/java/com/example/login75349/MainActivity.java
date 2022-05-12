package com.example.login75349;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txthelp, signin;
    EditText name , email , password ;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        txthelp = findViewById(R.id.help);
        signin = findViewById(R.id.onsingin);
        name = findViewById(R.id.editname);
        email = findViewById(R.id.editmail);
        password = findViewById(R.id.editpassword);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View custom = inflater.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.clayout));
                TextView txtm = custom.findViewById(R.id.text);
                txtm.setText(" Sign Successful!");
                Toast mToast = new Toast(getApplicationContext());
                mToast.setDuration(Toast.LENGTH_LONG);
                mToast.setView(custom);
                mToast.show();

            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SignIn.class);
                startActivity(intent);
            }
        });















        // INK #d7488c
        //LIGHT COLOR #dfd5d9
        //BLACK 292a32
        // SHOWDOW RED 811629
        // LETTER COLOR #999697
    }
}