package com.example.yoga;


import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ResultActivity extends AppCompatActivity{
    public String uid;
    public String MState;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        String message = intent.getStringExtra(QuestionActivity.results);
        TextView tx =  findViewById(R.id.ResultTextView);
        tx.setText(message);
        TextView mindstat =  findViewById(R.id.MindStatus);
        String mstat = "null";
        final String total = message;

        // total = Integer.valueOf(message.toString());
        //total = Integer.parseInt(message.toString());


        if (total.equals("5") || total.equals("6") || total.equals("7") || total.equals("8") || total.equals("9")) {
            mstat = "Mild Depression";
            MState = "Mild Depression";
            //mindstat.setTextColor(Color.parseColor("#00a0d1"));
            mindstat.setText(mstat);
        } else if (total.equals("10") || total.equals("11") || total.equals("12") || total.equals("13") || total.equals("14")) {
            mstat = "Moderate Depression";
            MState = "Moderate Depression";

            //mindstat.setTextColor(Color.parseColor("#a100ff"));

            mindstat.setText(mstat);

        } else if (total.equals("15") || total.equals("16") || total.equals("17") || total.equals("18") || total.equals("19")) {
            mstat = "Moderate to Severe Depression";
            MState = "Moderate to \n Severe Depression";

            //mindstat.setTextColor(Color.parseColor("#ffb710"));

            mindstat.setText(mstat);
        } else if (total.equals("0") || total.equals("1") || total.equals("2") || total.equals("3") || total.equals("4")) {
            mstat = "Healthy Mindset and not depressed";
            MState = "Healthy Mindset \n and not depressed";
            //mindstat.setTextColor(Color.parseColor("#0dc900"));

            mindstat.setText(mstat);
        } else {
            //mindstat.setTextColor(Color.parseColor("#ff0000"));

            mstat = "Severe Depression";
            MState = "Severe Depression";

            mindstat.setText(mstat);
        }
    }


}