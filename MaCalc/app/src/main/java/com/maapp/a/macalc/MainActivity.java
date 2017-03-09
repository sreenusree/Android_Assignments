package com.maapp.a.macalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {
 Button btn1,btn2,btn3,btn4;
    EditText txt1,txt2;
    TextView t1,operator;

    Double sum,sub,div,mul,num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
        btn2=(Button) findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        t1 = (TextView) findViewById(R.id.textView3);
        txt1 = (EditText) findViewById(R.id.editText);
        txt2 = (EditText) findViewById(R.id.editText2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 num1=Double.parseDouble(txt1.getText().toString());
                num2=Double.parseDouble(txt2.getText().toString());
                sum=num1+num2;
                t1.setText(Double.toString(sum));

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(txt1.getText().toString());
                num2=Double.parseDouble(txt2.getText().toString());
                sub=num1-num2;
                t1.setText(Double.toString(sub));

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(txt1.getText().toString());
                num2=Double.parseDouble(txt2.getText().toString());
                mul=num1*num2;
                t1.setText(Double.toString(mul));

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(txt1.getText().toString());
                num2=Double.parseDouble(txt2.getText().toString());
                div=num1/num2;
                t1.setText(Double.toString(div));

            }
        });

    }  }


