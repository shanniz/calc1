package com.example.calc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button mButtonAdd;

    EditText mEditTextNum1;
    EditText mEditTextNum2;
    EditText mEditTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextNum1 = findViewById(R.id.editTextTextPersonName);
        mEditTextNum2 = findViewById(R.id.editTextTextPersonName2);
        mEditTextResult = findViewById(R.id.editTextNumber);


        mButtonAdd = findViewById(R.id.button);
        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1= Integer.parseInt(mEditTextNum1.getText().toString());
                int num2= Integer.parseInt(mEditTextNum2.getText().toString());

                int sum = num1+num2;
                mEditTextResult.setText( ""+sum );
            }
        });

    }
}