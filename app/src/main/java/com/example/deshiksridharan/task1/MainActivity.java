package com.example.deshiksridharan.task1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    RelativeLayout activity_main;
    Button RED;
    Button BLUE;
    Button GREEN;
    TextView Red;
    TextView Blue;
    TextView Green;
    int r=0,g=0,b=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_main =(RelativeLayout) findViewById(R.id.activity_main);
        RED = (Button) findViewById(R.id.RED);
        Red = (TextView) findViewById(R.id.Red);
           RED.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view)
               {
                   r=r+25;
                   if(r>255)
                   {
                       r=0;
                   }
                   activity_main.setBackgroundColor(Color.rgb(r,g,b));
                   Red.setText(String.valueOf(r));

               }
           }

           );
        BLUE = (Button) findViewById(R.id.BLUE);
        Blue=(TextView) findViewById(R.id.Blue);
        BLUE.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view)
                                   {
                                       b=b+25;
                                       if(b>255)
                                       {
                                           b=0;
                                       }
                                       activity_main.setBackgroundColor(Color.rgb(r,g,b));
                                       Blue.setText(String.valueOf(b));
                                   }
                               }

        );
        GREEN = (Button) findViewById(R.id.GREEN);
        Green=(TextView) findViewById(R.id.Green);
        GREEN.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view)
                                    {
                                        g=g+25;
                                        if(g>255)
                                        {
                                            g=0;
                                        }

                                        activity_main.setBackgroundColor(Color.rgb(r,g,b));
                                        Green.setText(String.valueOf(g));
                                    }
                                }

        );


    }

}