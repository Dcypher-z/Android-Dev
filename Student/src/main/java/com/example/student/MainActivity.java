package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

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
        Button avg = (Button) findViewById(R.id.btn_calc);
        Button print = (Button) findViewById(R.id.btn_calc2);
        Button reenter = (Button) findViewById(R.id.btn_calc3);
        avg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText m1 = (EditText) findViewById(R.id.txtm1);
                EditText m2 = (EditText) findViewById(R.id.txtm2);
                EditText m3 = (EditText) findViewById(R.id.txtm3);
                EditText m4 = (EditText) findViewById(R.id.txtm4);
                double d1,d2,d3,d4;
                d1 = Double.parseDouble(m1.getText().toString());
                d2 = Double.parseDouble(m2.getText().toString());
                d3 = Double.parseDouble(m3.getText().toString());
                d4 = Double.parseDouble(m4.getText().toString());

                double avg = (d1+d2+d3+d4)/4;

                TextView result = (TextView) findViewById(R.id.textView8);

                result.setText(Double.toString(avg));
            }
        });
        print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText regno = (EditText) findViewById(R.id.txtregno);
                EditText name = (EditText) findViewById(R.id.Txtname);
                EditText m1 = (EditText) findViewById(R.id.txtm1);
                EditText m2 = (EditText) findViewById(R.id.txtm2);
                EditText m3 = (EditText) findViewById(R.id.txtm3);
                EditText m4 = (EditText) findViewById(R.id.txtm4);
                TextView avg = (TextView) findViewById(R.id.textView8);

                TextView t1 = (TextView) findViewById(R.id.textView);
                TextView t2 = (TextView) findViewById(R.id.textView2);
                TextView t3 = (TextView) findViewById(R.id.textView3);
                TextView t4 = (TextView) findViewById(R.id.textView4);
                TextView t5 = (TextView) findViewById(R.id.textView5);
                TextView t6 = (TextView) findViewById(R.id.textView6);
                TextView t7 = (TextView) findViewById(R.id.textView7);

                t1.setText(name.getText().toString());
                t2.setText(regno.getText().toString());
                t3.setText(m1.getText().toString());
                t4.setText(m2.getText().toString());
                t5.setText(m3.getText().toString());
                t6.setText(m4.getText().toString());
                t7.setText(avg.getText().toString());


            }
        });
    }
}