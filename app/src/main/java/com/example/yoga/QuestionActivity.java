package com.example.yoga;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity extends AppCompatActivity {


    public final static String results = "";
    public final static String totalscore = "";

    int c2;
    int c3;
    int c4;
    int total;
    String q;
    String Q1 = "1. Little interest or pleasure in doing things";
    String Q2 = "2. Feeling down, depressed or hopeless";
    String Q3 = "3. Trouble falling or staying asleep, or sleeping too much";
    String Q4 = "4. Feeling tired or having little energy";
    String Q5 = "5. Poor appetite or Over eating";
    String Q6 = "6. Feeling bad about yourself or that you are a failure or have let yourself or your family down";
    String Q7 = "7. Trouble concentrating on thing, such as reading the newspaper or watching television";
    String Q8 = "8. Moving or speaking so slowly that other people could have noticed? or the opposite - being so fidgety or restless that you have been moving around a lot more than usual?";
    String Q9 = "9. Thoughts that you would be better off dead or of hurting yourself in some way?";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phq9questionnaire);

        Intent intent = new Intent();
        startActivity(intent);



        //q = "1";
        //TextView question = findViewById(R.id.QuestionTextView);

        //ProgressBar p = (ProgressBar) findViewById(R.id.progressBar);

        /*if (q.equals(null) || q.equals("1")) {
            question.setText(Q1);
            //p.setProgress(10);

        }

        c2 = 0;
        c3 = 0;
        c4 = 0;


    }
    public void a1 (View view) {
        TextView question =  findViewById(R.id.textView);



        LinearLayout ll1 = findViewById(R.id.LinearViewQuestion);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        ll1.startAnimation(animation1);


        if (q.equals("1")) {
            q = "2";
            question.setText(Q2);

            //pgno.setText(q + "/9");


        } else if (q.equals("2")) {
            q = "3";
            question.setText(Q3);

            //pgno.setText(q + "/9");


        } else if (q.equals("3")) {
            q = "4";
            question.setText(Q4);

            //pgno.setText(q + "/9");


        } else if (q.equals("4")) {
            q = "5";
            question.setText(Q5);

            //pgno.setText(q + "/9");


        } else if (q.equals("5")) {
            q = "6";
            question.setText(Q6);

            //pgno.setText(q + "/9");


        } else if (q.equals("6")) {
            q = "7";
            question.setText(Q7);

            //pgno.setText(q + "/9");


        } else if (q.equals("7")) {
            q = "8";
            question.setText(Q8);

            //pgno.setText(q + "/9");


        } else if (q.equals("8")) {
            q = "9";
            question.setText(Q9);

            //pgno.setText(q + "/9");


        } else if (q.equals("9")) {

            //pgno.setText(q + "/9");

            total = c2 + c3 + c4;
            String t = String.valueOf(total);
            Intent intent = new Intent(this, ResultActivity.class);

            String totalphq9 = t;
              //String resultof = "phq9";
              //intent.putExtra(results, resultof);

            intent.putExtra(totalscore, totalphq9);

            startActivity(intent);

            finish();

        }
    }


    public void a2 (View view) {
        TextView question = (TextView) findViewById(R.id.QuestionTextView);
        //ProgressBar p = (ProgressBar) findViewById(R.id.progressBar);


        LinearLayout ll1 = (LinearLayout) findViewById(R.id.LinearViewQuestion);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        ll1.startAnimation(animation1);

        if (q.equals("1")) {
            q = "2";
            question.setText(Q2);
            //p.setProgress(20);

            c2 = c2 + 1;

        } else if (q.equals("2")) {
            q = "3";
            question.setText(Q3);
            //p.setProgress(30);

            c2 = c2 + 1;

        } else if (q.equals("3")) {
            q = "4";
            question.setText(Q4);
            //p.setProgress(40);

            c2 = c2 + 1;

        } else if (q.equals("4")) {
            q = "5";
            question.setText(Q5);
            //p.setProgress(50);

            c2 = c2 + 1;

        } else if (q.equals("5")) {
            q = "6";
            question.setText(Q6);
            //p.setProgress(60);

            c2 = c2 + 1;

        } else if (q.equals("6")) {
            q = "7";
            question.setText(Q7);
            //p.setProgress(70);

            c2 = c2 + 1;

        } else if (q.equals("7")) {
            q = "8";
            question.setText(Q8);
            //p.setProgress(80);

            c2 = c2 + 1;

        } else if (q.equals("8")) {
            q = "9";
            question.setText(Q9);
            //p.setProgress(90);

            c2 = c2 + 1;

        } else if (q.equals("9")) {
            //p.setProgress(100);
            c2 = c2 + 1;

            total = c2 + c3 + c4;
            String t = String.valueOf(total);
            Intent intent = new Intent(this, ResultActivity.class);


            String totalphq9 = t;
            //  String resultof = "phq9";
            //   intent.putExtra(results, resultof);
            intent.putExtra(totalscore, totalphq9);

            startActivity(intent);

            finish();

        }

    }

    public void a3 (View view) {

        TextView question =  findViewById(R.id.QuestionTextView);
        ProgressBar p =  findViewById(R.id.progressBar);


        LinearLayout ll1 = (LinearLayout) findViewById(R.id.LinearViewQuestion);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        ll1.startAnimation(animation1);

        if (q.equals("1")) {
            q = "2";
            question.setText(Q2);
            p.setProgress(20);

            c3 = c3 + 2;

        } else if (q.equals("2")) {
            q = "3";
            question.setText(Q3);
            p.setProgress(30);

            c3 = c3 + 2;

        } else if (q.equals("3")) {
            q = "4";
            question.setText(Q4);
            p.setProgress(40);

            c3 = c3 + 2;
        } else if (q.equals("4")) {
            q = "5";
            question.setText(Q5);
            p.setProgress(50);

            c3 = c3 + 2;
        } else if (q.equals("5")) {
            q = "6";
            question.setText(Q6);
            p.setProgress(60);

            c3 = c3 + 2;
        } else if (q.equals("6")) {
            q = "7";
            question.setText(Q7);
            p.setProgress(70);

            c3 = c3 + 2;
        } else if (q.equals("7")) {
            q = "8";
            question.setText(Q8);
            p.setProgress(80);

            c3 = c3 + 2;
        } else if (q.equals("8")) {
            q = "9";
            question.setText(Q9);
            p.setProgress(90);

            c3 = c3 + 2;
        } else if (q.equals("9")) {
            p.setProgress(100);
            c3 = c3 + 2;
            total = c2 + c3 + c4;
            String t = String.valueOf(total);
            Intent intent = new Intent(this, ResultActivity.class);


            String totalphq9 = t;
            //  String resultof = "phq9";
            //   intent.putExtra(results, resultof);
            intent.putExtra(totalscore, totalphq9);

            startActivity(intent);

            finish();
        }
    }

    public void a4 (View view) {
        TextView question = (TextView) findViewById(R.id.QuestionTextView);
        ProgressBar p = (ProgressBar) findViewById(R.id.progressBar);


        LinearLayout ll1 = (LinearLayout) findViewById(R.id.LinearViewQuestion);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        ll1.startAnimation(animation1);

        if (q.equals("1")) {
            q = "2";
            question.setText(Q2);
            p.setProgress(20);

            c4 = c4 + 3;

        } else if (q.equals("2")) {
            q = "3";
            question.setText(Q3);
            p.setProgress(30);

            c4 = c4 + 3;
        } else if (q.equals("3")) {
            q = "4";
            question.setText(Q4);
            p.setProgress(40);

            c4 = c4 + 3;

        } else if (q.equals("4")) {
            q = "5";
            question.setText(Q5);
            p.setProgress(50);

            c4 = c4 + 3;

        } else if (q.equals("5")) {
            q = "6";
            question.setText(Q6);
            p.setProgress(60);

            c4 = c4 + 3;

        } else if (q.equals("6")) {
            q = "7";
            question.setText(Q7);
            p.setProgress(70);

            c4 = c4 + 3;

        } else if (q.equals("7")) {
            q = "8";
            question.setText(Q8);
            p.setProgress(80);

            c4 = c4 + 3;

        } else if (q.equals("8")) {
            q = "9";
            question.setText(Q9);
            p.setProgress(90);

            c4 = c4 + 3;

        } else if (q.equals("9")) {
            p.setProgress(100);


            c4 = c4 + 3;

            total = c2 + c3 + c4;
            String t = String.valueOf(total);
            Intent intent = new Intent(this, ResultActivity.class);


            String totalphq9 = t;
            //  String resultof = "phq9";
            //   intent.putExtra(results, resultof);
            intent.putExtra(totalscore, totalphq9);



            startActivity(intent);

            finish();

        }
    }

         */

}}