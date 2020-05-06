package com.example.dotsboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public int Box1=0,Box2=0,Box3=0,Box4=0;

    int turn=0,scoreA=0,scoreB=0,turn2A=0,turn2B=0,box1Filled=0,box2Filled=0,box3Filled=0,box4Filled=0;

    public TextView scoreBox1,scoreBox2,scoreBox3,scoreBox4;

    public TextView colorBox1,colorBox2,colorBox3,colorBox4;

    public TextView wonText,turnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final int[] clickFinder = new int[12];

        for(int i=0;i<12;i++){

            clickFinder[i]=0;

        }

        scoreBox1 = findViewById(R.id.box1);
        scoreBox2 = findViewById(R.id.box2);
        scoreBox3 = findViewById(R.id.box3);
        scoreBox4 = findViewById(R.id.box4);

        colorBox1 = findViewById(R.id.colorBox1);
        colorBox2 = findViewById(R.id.colorBox2);
        colorBox3 = findViewById(R.id.colorBox3);
        colorBox4 = findViewById(R.id.colorBox4);

        wonText = findViewById(R.id.wonView);

        final TextView buttonH1,buttonH2,buttonH3,buttonH4,buttonH5,buttonH6,buttonV1,buttonV2,buttonV3,buttonV4,buttonV5,buttonV6;

        buttonH1 = findViewById(R.id.buttonH1);
        buttonH2 = findViewById(R.id.buttonH2);
        buttonH3 = findViewById(R.id.buttonH3);
        buttonH4 = findViewById(R.id.buttonH4);
        buttonH5 = findViewById(R.id.buttonH5);
        buttonH6 = findViewById(R.id.buttonH6);

        buttonV1 = findViewById(R.id.buttonV1);
        buttonV2 = findViewById(R.id.buttonV2);
        buttonV3 = findViewById(R.id.buttonV3);
        buttonV4 = findViewById(R.id.buttonV4);
        buttonV5 = findViewById(R.id.buttonV5);
        buttonV6 = findViewById(R.id.buttonV6);

        turnView = findViewById(R.id.turnView);

        buttonH1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                if(clickFinder[0]==0){
                    Box1++;
                    clickFinder[0]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonH1.setAlpha(1.0f);
                        buttonH1.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonH1.setAlpha(1.0f);
                        buttonH1.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonH2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[1]==0){
                    Box1++;
                    Box2++;
                    clickFinder[1]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonH2.setAlpha(1.0f);
                        buttonH2.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonH2.setAlpha(1.0f);
                        buttonH2.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonH3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[2]==0){
                    Box2++;
                    clickFinder[2]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonH3.setAlpha(1.0f);
                        buttonH3.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonH3.setAlpha(1.0f);
                        buttonH3.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonH4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[3]==0){
                    Box3++;
                    clickFinder[3]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonH4.setAlpha(1.0f);
                        buttonH4.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonH4.setAlpha(1.0f);
                        buttonH4.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonH5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[4]==0){
                    Box3++;
                    Box4++;
                    clickFinder[4]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonH5.setAlpha(1.0f);
                        buttonH5.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonH5.setAlpha(1.0f);
                        buttonH5.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonH6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[5]==0){
                    Box4++;
                    clickFinder[5]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonH6.setAlpha(1.0f);
                        buttonH6.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonH6.setAlpha(1.0f);
                        buttonH6.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[6]==0){
                    Box1++;
                    clickFinder[6]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonV1.setAlpha(1.0f);
                        buttonV1.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonV1.setAlpha(1.0f);
                        buttonV1.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonV2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[7]==0){
                    Box2++;
                    clickFinder[7]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonV2.setAlpha(1.0f);
                        buttonV2.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonV2.setAlpha(1.0f);
                        buttonV2.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[8]==0){
                    Box1++;
                    Box3++;
                    clickFinder[8]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonV3.setAlpha(1.0f);
                        buttonV3.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonV3.setAlpha(1.0f);
                        buttonV3.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonV4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[9]==0){
                    Box2++;
                    Box4++;
                    clickFinder[9]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonV4.setAlpha(1.0f);
                        buttonV4.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonV4.setAlpha(1.0f);
                        buttonV4.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonV5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[10]==0){
                    Box3++;
                    clickFinder[10]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonV5.setAlpha(1.0f);
                        buttonV5.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonV5.setAlpha(1.0f);
                        buttonV5.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonV6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[11]==0){
                    Box4++;
                    clickFinder[11]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonV6.setAlpha(1.0f);
                        buttonV6.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonV6.setAlpha(1.0f);
                        buttonV6.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

    }

    public void boxFilled(){

        if(Box1==4 && turn==1 && box1Filled==0){
            scoreBox1.setText("A");
            box1Filled=1;
            colorBox1.setBackgroundColor(getResources().getColor(R.color.red));
            scoreA++;
            turn2A++;
        }
        else if(Box1==4 && turn==0 && box1Filled==0){
            scoreBox1.setText("B");
            box1Filled=1;
            colorBox1.setBackgroundColor(getResources().getColor(R.color.green));
            scoreB++;
            turn2B++;
        }

        if(Box2==4 && turn==1 && box2Filled==0){
            scoreBox2.setText("A");
            box2Filled=1;
            colorBox2.setBackgroundColor(getResources().getColor(R.color.red));
            scoreA++;
            turn2A++;
        }
        else if(Box2==4 && turn==0 && box2Filled==0){
            scoreBox2.setText("B");
            box2Filled=1;
            colorBox2.setBackgroundColor(getResources().getColor(R.color.green));
            scoreB++;
            turn2B++;
        }

        if(Box3==4 && turn==1 && box3Filled==0){
            scoreBox3.setText("A");
            box3Filled=1;
            colorBox3.setBackgroundColor(getResources().getColor(R.color.red));
            scoreA++;
            turn2A++;
        }
        else if(Box3==4 && turn==0 && box3Filled==0){
            scoreBox3.setText("B");
            box3Filled=1;
            colorBox3.setBackgroundColor(getResources().getColor(R.color.green));
            scoreB++;
            turn2B++;
        }

        if(Box4==4 && turn==1 && box4Filled==0){
            scoreBox4.setText("A");
            box4Filled=1;
            colorBox4.setBackgroundColor(getResources().getColor(R.color.red));
            scoreA++;
            turn2A++;
        }
        else if(Box4==4 && turn==0 && box4Filled==0){
            scoreBox4.setText("B");
            box4Filled=1;
            colorBox4.setBackgroundColor(getResources().getColor(R.color.green));
            scoreB++;
            turn2B++;
        }

        if(turn2A>=1){
            turn=0;
            turnView.setText("TURN : A");
            turn2A=0;
        }
        else if(turn2B>=1){
            turn=1;
            turnView.setText("TURN : B");
            turn2B=0;
        }

        if(box1Filled==1 && box2Filled==1 && box3Filled==1 && box4Filled==1){
            turnView.setText("");
            turnView.setEms(0);
            if(scoreA > scoreB){
                wonText.setText("'A' has won");
                wonText.setEms(7);
            }
            else if(scoreB > scoreA){
                wonText.setText("'B' has won");
                wonText.setEms(7);
            }
            else {
                wonText.setText("Oops! Draw");
                wonText.setEms(7);
            }
        }

    }
}
