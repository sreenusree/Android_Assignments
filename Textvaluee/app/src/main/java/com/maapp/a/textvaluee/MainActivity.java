package com.maapp.a.textvaluee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.onClick;
import static android.view.View.*;

public class MainActivity extends AppCompatActivity {
    TextView txt1;
    Button btn1;
    EditText edit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (TextView) findViewById(R.id.textView);
        btn1 = (Button) findViewById(R.id.button);
        edit1 = (EditText) findViewById(R.id.editText);

    btn1.setOnClickListener(new View.OnClickListener()  {
        public void onClick(View view) {

            String name=edit1.getText().toString();
            txt1.setText(name);

        }


    }); }}

