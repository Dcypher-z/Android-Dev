package com.example.electrictariff;

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

        Button tariff = (Button) findViewById(R.id.btn_tariff);


        tariff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ename = (EditText) findViewById(R.id.Txt_name);
                EditText eaccno = (EditText) findViewById(R.id.Txt_accno);
                EditText unit = (EditText) findViewById(R.id.Txt_unit);
                TextView result = (TextView) findViewById(R.id.textView2);
                Double u = Double.parseDouble(unit.getText().toString());
                if(u<100) {
                    result.setText(Double.toString(u*1.1));
                }
                else if(u>100 && u<100)
                {
                    result.setText(Double.toString(u*1.2));
                }
                else
                {
                    result.setText(Double.toString(u*1.3));
                }
            }
        });




        }
    }

