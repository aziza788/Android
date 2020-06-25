package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView azza = findViewById(R.id.azza);
        final Button  btn7 = findViewById(R.id.btn7);
        final Button btn8 = findViewById(R.id.btn8);
        final Button btn9 = findViewById(R.id.btn9);
        final Button btndiv = findViewById(R.id.btndiv);
        final Button btn4 = findViewById(R.id.btn4);
        final Button btn5 = findViewById(R.id.btn5);
        final Button btn6 = findViewById(R.id.btn6);
        final Button btnmul = findViewById(R.id.btnmul);
        final Button btn1 = findViewById(R.id.btn1);
        final Button btn2 = findViewById(R.id.btn2);
        final Button btn3 = findViewById(R.id.btn3);
        final Button btnadd = findViewById(R.id.btnadd);
        final Button btn0 = findViewById(R.id.btn0);
        final Button btneql = findViewById(R.id.btneql);
        final Button btnsub = findViewById(R.id.btnsub);

        final View.OnClickListener azzaClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();

                switch (id){
                    case R.id.btn7:
                        azza.append("7");
                        break;
                    case R.id.btn8:
                        azza.append("8");
                        break;
                    case R.id.btn9:
                        azza.append("9");
                        break;
                    case R.id.btndiv:
                        break;
                    case R.id.btn4:
                        azza.append("4");
                        break;
                    case R.id.btn5:
                        azza.append("5");
                        break;
                    case R.id.btn6:
                        azza.append("6");
                        break;
                    case R.id.btnmul:
                        break;
                    case R.id.btn1:
                        azza.append("1");
                        break;
                    case R.id.btn2:
                        azza.append("2");
                        break;
                    case R.id.btn3:
                        azza.append("3");
                        break;
                    case R.id.btnadd:
                        break;
                    case R.id.btnclr:
                        break;
                    case R.id.btn0:
                        azza.append("0");
                        break;
                    case R.id.btneql:
                        break;
                    case R.id.btnsub:
                        break;


                }

            }
        };
        btn7.setOnClickListener(azzaClickListener);
        btn8.setOnClickListener(azzaClickListener);
        btn9.setOnClickListener(azzaClickListener);
        btndiv.setOnClickListener(azzaClickListener);
        btn4.setOnClickListener(azzaClickListener);
        btn5.setOnClickListener(azzaClickListener);
        btn6.setOnClickListener(azzaClickListener);
        btnmul.setOnClickListener(azzaClickListener);
        btn1.setOnClickListener(azzaClickListener);
        btn2.setOnClickListener(azzaClickListener);
        btn3.setOnClickListener(azzaClickListener);
        btnadd.setOnClickListener(azzaClickListener);
        btn0.setOnClickListener(azzaClickListener);
        btneql.setOnClickListener(azzaClickListener);
        btnsub.setOnClickListener(azzaClickListener);

        final Button btnclr = findViewById(R.id.btnclr);
        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String displayedElements = azza.getText().toString();
                int length = displayedElements.length();
                if (length > 0){
                    displayedElements = displayedElements.substring(0,length-1);
                    azza.setText(displayedElements);
                }

            }
        });

    }
}