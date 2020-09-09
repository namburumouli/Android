package com.example.quizzapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button answer1,answer2,answer3,answer4;

    TextView score,question;

    private  questions mquestions=new questions();

    private String mAnswer;
    private int mscore=0;
    private int mquestionsLength=mquestions.mquestions.length;
    Random r;
    private int countquestions=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r=new Random();

        answer1=(Button) findViewById(R.id.answer1);
        answer2=(Button) findViewById(R.id.answer2);
        answer3=(Button) findViewById(R.id.answer3);
        answer4=(Button) findViewById(R.id.answer4);

        score=(TextView) findViewById(R.id.score);
        question=(TextView) findViewById(R.id.question);


        score.setText("Score:"+mscore);

        updatequestion(r.nextInt(mquestionsLength));


        answer1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                countquestions++;
                if(answer1.getText() == mAnswer){
                    mscore++;
                    score.setText("Score:"+mscore);
                    exit(countquestions);
                    updatequestion(r.nextInt(mquestionsLength));
                }/*if (mquestionsLength==countquestions+1){
                    gameover();
                }*/
                else{
                    updatequestion(r.nextInt(mquestionsLength));
                    exit(countquestions);
                }

            }

        });

        answer2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                countquestions++;
                if(answer2.getText() == mAnswer){
                    mscore++;
                    score.setText("Score:"+mscore);
                    exit(countquestions);

                    updatequestion(r.nextInt(mquestionsLength));
                }/*if (mquestionsLength==countquestions+1){
                    gameover();
                }*/
                else{
                    updatequestion(r.nextInt(mquestionsLength));
                    exit(countquestions);
                }


            }

        });

        answer3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                countquestions++;
                if(answer3.getText() == mAnswer){
                    mscore++;
                    score.setText("Score:"+mscore);
                    exit(countquestions);
                    updatequestion(r.nextInt(mquestionsLength));
                }/*if (mquestionsLength==countquestions+1){
                    gameover();
                }*/
                else{
                    updatequestion(r.nextInt(mquestionsLength));
                    exit(countquestions);
                }

            }

        });


        answer4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                countquestions++;
                if(answer4.getText() == mAnswer){
                    mscore++;
                    score.setText("Score:"+mscore);
                    exit(countquestions);
                    updatequestion(r.nextInt(mquestionsLength));
                }/*if (mquestionsLength==countquestions+1){
                    gameover();
                }*/
                else{
                    updatequestion(r.nextInt(mquestionsLength));
                    exit(countquestions);
                }

            }

        });

    }

    private void updatequestion(int num) {
        question.setText(mquestions.getQuestions(num));
        answer1.setText(mquestions.getChoice1(num));
        answer2.setText(mquestions.getChoice2(num));
        answer3.setText(mquestions.getChoice3(num));
        answer4.setText(mquestions.getChoice4(num));

        mAnswer=mquestions.getCorrectAnswer(num);
    }

    private void exit(int num){
        if(countquestions == 6){ // select no of questions to display
                gameover();

        }
    }

    private void gameover(){
        AlertDialog.Builder alertDialogBuilder =new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage("Gameover !your score is " + mscore + " points ")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }
                        })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                    finish();
                            }
                        });
        AlertDialog alertDialog =alertDialogBuilder.create();
        alertDialog.show();
    }
}