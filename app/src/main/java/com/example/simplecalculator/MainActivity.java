package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public boolean checkInputs(){
        EditText input1 = findViewById(R.id.input1);
        EditText input2 = findViewById(R.id.input2);

        String value1 = input1.getText().toString();
        String value2 = input2.getText().toString();

        if (value1.isEmpty() || value2.isEmpty())
            return false;
        else
            return true;
    }
    public void add(View v){
        EditText input1 = findViewById(R.id.input1);
        EditText input2 = findViewById(R.id.input2);
        EditText output = findViewById(R.id.output);

        if (checkInputs()){
            Float value1 = Float.parseFloat(input1.getText().toString());
            Float value2 = Float.parseFloat(input2.getText().toString());
            float result = value1 + value2;

            output.setText(Float.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Enter the values", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void sub(View v){
        EditText input1 = findViewById(R.id.input1);
        EditText input2 = findViewById(R.id.input2);
        EditText output = findViewById(R.id.output);

        if (checkInputs()){
            Float value1 = Float.parseFloat(input1.getText().toString());
            Float value2 = Float.parseFloat(input2.getText().toString());
            float result = value1 - value2;

            output.setText(Float.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Enter the values", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void div(View v){
        EditText input1 = findViewById(R.id.input1);
        EditText input2 = findViewById(R.id.input2);
        EditText output = findViewById(R.id.output);

        if (checkInputs()){
            Float value1 = Float.parseFloat(input1.getText().toString());
            Float value2 = Float.parseFloat(input2.getText().toString());
            float result = value1 / value2;

            output.setText(Float.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Enter the values", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void mul(View v){
        EditText input1 = findViewById(R.id.input1);
        EditText input2 = findViewById(R.id.input2);
        EditText output = findViewById(R.id.output);

        if (checkInputs()){
            Float value1 = Float.parseFloat(input1.getText().toString());
            Float value2 = Float.parseFloat(input2.getText().toString());
            float result = value1 * value2;

            output.setText(Float.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Enter the values", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}