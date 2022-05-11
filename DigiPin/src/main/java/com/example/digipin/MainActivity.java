package com.example.digipin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button[] btnArr = new Button[9];
    Button show, ok, cancel;

    String pass = "";
    boolean hidden = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        show = findViewById(R.id.show);
        ok = findViewById(R.id.ok);
        cancel = findViewById(R.id.cancel);

        int[] ids = {R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9};

        for (int i = 0; i < 9; i++) {
            btnArr[i] = findViewById(ids[i]);
            int num = i + 1;
            btnArr[i].setOnClickListener(view -> {
                if (pass.length() < 4)
                    pass += (num);
                String str = "";
                if (hidden) {
                    for (int j = 0; j < pass.length(); j++)
                        str += "*";
                } else
                    str = pass;
                text.setText(str);
            });
        }

        show.setOnClickListener(view -> {
            hidden = !hidden;
            if (show.getText().toString().equals("SHOW")) {
                text.setText(pass);
                show.setText("HIDE");
            } else {
                String str = "";
                for (int j = 0; j < pass.length(); j++)
                    str += "*";
                text.setText(str);
                show.setText("SHOW");
            }
        });

        ok.setOnClickListener(view -> {
            if(pass.length() != 4)
                Toast.makeText(this, "Password must be of length4", Toast.LENGTH_SHORT).show();
            else {
                if(pass.equals("1234"))
                    Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
            }
        });

        cancel.setOnClickListener(view -> {
            pass = "";
            text.setText(pass);
        });

    }
}