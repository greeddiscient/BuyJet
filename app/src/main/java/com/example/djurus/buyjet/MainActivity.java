package com.example.djurus.buyjet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int balance;
    private Button spentButton;
    private Button depositButton;
    private EditText depositET;
    private EditText spendingET;
    private TextView amountLeft;
    private TextView avgLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountLeft = (TextView)findViewById(R.id.amountleft);
        avgLabel = (TextView)findViewById(R.id.avgLabel);
        depositET = (EditText)findViewById(R.id.deposits);
        spendingET = (EditText)findViewById(R.id.spending);
        depositButton = (Button)findViewById(R.id.depositButton);
        spentButton = (Button)findViewById(R.id.spentButton);

        depositButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int deposits = Integer.valueOf(depositET.getText().toString());
                balance+= deposits;
                amountLeft.setText("$"+balance);
        }});

        spentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int spending = Integer.valueOf(spendingET.getText().toString());
                balance-= spending;
                amountLeft.setText("$"+balance);
            }});

    }
}
