package com.example.lab22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText email = findViewById(R.id.email);
        final EditText password = findViewById(R.id.password);
        Button gomb1 = findViewById(R.id.button);

        gomb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("asd") && password.getText().toString().equals("123")) {
                    Intent intent = new Intent(getApplicationContext(), ActivityTwo.class);
                    intent.putExtra("Email: ", email.getText().toString());
                    startActivity(intent);
                }
                else Toast.makeText(getApplicationContext(),"Nem jo",Toast.LENGTH_SHORT).show();
            }
        });
    }
}