package com.example.activity_example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextname = findViewById(R.id.edTxt_name);
        final EditText editTextsurname = findViewById(R.id.edTxt_surname);


        Button btn = findViewById(R.id.btn_changeActivity);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myTextname = editTextname.getText().toString();
                String myTextsurname = editTextsurname.getText().toString();


                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("text1", myTextname);
                intent.putExtra("text2", myTextsurname);

                startActivity(intent);

//                finish();
            }
        });
    }
}
