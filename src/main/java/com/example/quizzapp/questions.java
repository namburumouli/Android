package com.example.quizzapp;

public class questions {
    public String  mquestions[] ={
            "which is first planet in solar system",
            "who is the fifth president of india",
            "what is cpu",
            "In the given below which is called as star",
            "How many countries share their land bourder with india",
            "Name the capital of bhutan",
            "If a computer has more than one processor then it is know as",
            "mancintosh an os is a product of "

    };

    private String mchoice[][]={

            {"mercury","venus","mars","saturn"},
            {"ZakirHussain","Rajendra prasad","v.v.Giri","Fakhruddin Ali Ahmed"},
            {"central park unit","cental playing club","central processing unit","central processing unity"},
            {"babay","venus","u35n","nova"},
            {"5","6","7","4"},
            {"rhrimp","Thimphu","thumbu","thrimp"},
            {"uniprocess","multithreaded","multiprocessor","multiprogramming"},
            {"microsoft","apple","intel","google"}


    };

    private String mCorrectAnswers[]={"mercury","Fakhruddin Ali Ahmed","central processing unit","nova","7","Thimphu","multiprocessor","apple"};


    public String getQuestions(int a){
        String question=mquestions[a];
        return  question;
    }

    public String getChoice1(int a){
        String choice=mchoice[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice=mchoice[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice=mchoice[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice=mchoice[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer=mCorrectAnswers[a];
        return answer;
    }

}
