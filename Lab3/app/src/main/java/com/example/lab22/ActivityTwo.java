package com.example.lab22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        final EditText email = findViewById(R.id.email);
        email.setText(getIntent().getStringExtra("email"));

        Button gomb2 = findViewById(R.id.gomb2);

        gomb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("asd")){
                    Intent intent = new Intent(getApplicationContext(), ActivityThree.class);
                    startActivity(intent);
                }
                else Toast.makeText(getApplicationContext(),"Nem jo",Toast.LENGTH_SHORT).show();
            }
        });
    }
}