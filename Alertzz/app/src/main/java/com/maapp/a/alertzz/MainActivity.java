package com.maapp.a.alertzz;
import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.DialogInterface;
import android.app.AlertDialog.Builder;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    Button f, s, t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f = (Button) findViewById(R.id.button);
        s = (Button) findViewById(R.id.button2);
        t = (Button) findViewById(R.id.button3);

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog builder1 = new AlertDialog.Builder(MainActivity.this).create();
                builder1.setMessage("please press ok");
                builder1.setButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(), "ok is pressed", Toast.LENGTH_LONG).show();

                    }
                });


                builder1.show();


            }


        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog builder2 = new AlertDialog.Builder(MainActivity.this).create();
                builder2.setMessage("please press ok or cancel");
                builder2.setButton(DialogInterface.BUTTON_POSITIVE,"ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(), "ok is pressed", Toast.LENGTH_LONG).show();

                    }
                });

                builder2.setButton(DialogInterface.BUTTON_NEGATIVE,"Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(), "cancel is pressed", Toast.LENGTH_LONG).show();

                    }
                });

                builder2.show();


            }


        });
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog builder3 = new AlertDialog.Builder(MainActivity.this).create();
                builder3.setMessage("press a button");
                builder3.setButton(DialogInterface.BUTTON_POSITIVE,"No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(), "No is pressed", Toast.LENGTH_LONG).show();

                    }
                });

                builder3.setButton(DialogInterface.BUTTON_NEUTRAL,"Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(), "yes is pressed", Toast.LENGTH_LONG).show();

                    }
                });
                builder3.setButton(DialogInterface.BUTTON_NEGATIVE,"Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(), "cancel is pressed", Toast.LENGTH_LONG).show();

                    }
                });

                builder3.show();


            }


        });


    }



}

