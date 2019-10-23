package com.example.wordcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText)findViewById(R.id.input);
        result = (TextView) findViewById(R.id.result);
    }

    public void calculate(View view){



        String s = input.getText().toString();
        if(s.length()!= 0) {
            List<String> myList = new ArrayList<String>(Arrays.asList(s.split(" ")));
            result.setTextSize(150);
            result.setText(Integer.toString(myList.size()));
        }

        else if(s.length() == 0){
            result.setTextSize(100);
            result.setText("0");
        }



    }

    public void clear(View view){

        input.setText("");
        result.setText("");
        result.setTextSize(20);
    }
}
