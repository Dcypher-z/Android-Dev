package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    TextView t1;
    double num1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // a public method to get the input numbers
    public boolean getNumbers() {

        // defining the edit text 1 to e1
        e1 = (EditText) findViewById(R.id.num1);



        // defining the text view to t1
        t1 = (TextView) findViewById(R.id.result);

        // taking input from text box 1
        String s1 = e1.getText().toString();



        // condition to check if box is not empty
        if ((s1.equals(null))
                || (s1.equals(""))) {

            String result = "Please enter a value";
            t1.setText(result);

            return false;
        } else {
            // converting string to int.
            num1 = Double.parseDouble(s1);
        }

        return true;
    }

    // a public method to perform addition
    public void Dollar(View v) {

        // get the input numbers
        if (getNumbers()) {
            double sum = num1*76.73;
            t1.setText(Double.toString(sum));
        }
    }

    // a public method to perform power function
    public void Euro(View v) {

        // get the input numbers
        if (getNumbers()) {
            double sum = num1*82.37;
            t1.setText(Double.toString(sum));
        }
    }

    // a public method to perform subtraction
    public void Yen(View v) {

        // get the input numbers
        if (getNumbers()) {
            double sum = num1*0.60;
            t1.setText(Double.toString(sum));
        }
    }

    // a public method to perform multiplication
    public void Pound(View v) {

        // get the input numbers
        if (getNumbers()) {
            double sum = num1 * 97.95;
            t1.setText(Double.toString(sum));
        }
    }

    // a public method to perform Division
    public void Rouble(View v) {

        // get the input numbers
        if (getNumbers()) {

            // displaying the text in text view assigned as t1
            double sum = num1*0.98;
            t1.setText(Double.toString(sum));
        }
    }

}
