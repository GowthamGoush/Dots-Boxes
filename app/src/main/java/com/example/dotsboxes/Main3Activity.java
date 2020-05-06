package com.example.dotsboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    public int Box1=0,Box2=0,Box3=0,Box4=0,Box5=0,Box6=0,Box7=0,Box8=0,Box9=0;

    int turn=0,scoreA=0,scoreB=0,turn2A=0,turn2B=0,box1Filled=0,box2Filled=0,box3Filled=0,box4Filled=0,box5Filled=0,box6Filled=0,box7Filled=0,box8Filled=0,box9Filled=0;

    public TextView scoreBox1,scoreBox2,scoreBox3,scoreBox4,scoreBox5,scoreBox6,scoreBox7,scoreBox8,scoreBox9;

    public TextView colorBox1,colorBox2,colorBox3,colorBox4,colorBox5,colorBox6,colorBox7,colorBox8,colorBox9;

    public TextView wonText,turnView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final int[] clickFinder = new int[24];

        for(int i=0;i<24;i++){

            clickFinder[i]=0;

        }

        turnView = findViewById(R.id.turnView);

        wonText = findViewById(R.id.wonView);

        scoreBox1 = findViewById(R.id.box1);
        scoreBox2 = findViewById(R.id.box2);
        scoreBox3 = findViewById(R.id.box3);
        scoreBox4 = findViewById(R.id.box4);
        scoreBox5 = findViewById(R.id.box5);
        scoreBox6 = findViewById(R.id.box6);
        scoreBox7 = findViewById(R.id.box7);
        scoreBox8 = findViewById(R.id.box8);
        scoreBox9 = findViewById(R.id.box9);

        colorBox1 = findViewById(R.id.colorBox1);
        colorBox2 = findViewById(R.id.colorBox2);
        colorBox3 = findViewById(R.id.colorBox3);
        colorBox4 = findViewById(R.id.colorBox4);
        colorBox5 = findViewById(R.id.colorBox5);
        colorBox6 = findViewById(R.id.colorBox6);
        colorBox7 = findViewById(R.id.colorBox7);
        colorBox8 = findViewById(R.id.colorBox8);
        colorBox9 = findViewById(R.id.colorBox9);

        final TextView leftBtn1,leftBtn2,leftBtn3,leftBtn4,centerBtn1,centerBtn2,centerBtn3,centerBtn4,rightBtn1,rightBtn2,rightBtn3,rightBtn4;

        leftBtn1 = findViewById(R.id.leftBtn1);
        leftBtn2 = findViewById(R.id.leftBtn2);
        leftBtn3 = findViewById(R.id.leftBtn3);
        leftBtn4 = findViewById(R.id.leftBtn4);

        centerBtn1 = findViewById(R.id.buttonH1);
        centerBtn2 = findViewById(R.id.buttonH2);
        centerBtn3 = findViewById(R.id.buttonH3);
        centerBtn4 = findViewById(R.id.buttonH4);

        rightBtn1 = findViewById(R.id.rightBtn1);
        rightBtn2 = findViewById(R.id.rightBtn2);
        rightBtn3 = findViewById(R.id.rightBtn3);
        rightBtn4 = findViewById(R.id.rightBtn4);

        final TextView buttonV1,buttonV2,buttonV3,buttonV4,buttonV5,buttonV6,buttonV7,buttonV8,buttonV9,buttonV10,buttonV11,buttonV12;

        buttonV1 = findViewById(R.id.buttonV1);
        buttonV2 = findViewById(R.id.buttonV2);
        buttonV3 = findViewById(R.id.buttonV3);
        buttonV4 = findViewById(R.id.buttonV4);
        buttonV5 = findViewById(R.id.buttonV5);
        buttonV6 = findViewById(R.id.buttonV6);
        buttonV7 = findViewById(R.id.buttonV7);
        buttonV8 = findViewById(R.id.buttonV8);
        buttonV9 = findViewById(R.id.buttonV9);
        buttonV10 = findViewById(R.id.buttonV10);
        buttonV11 = findViewById(R.id.buttonV11);
        buttonV12 = findViewById(R.id.buttonV12);

        leftBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[0]==0){
                    Box1++;
                    clickFinder[0]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        leftBtn1.setAlpha(1.0f);
                        leftBtn1.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        leftBtn1.setAlpha(1.0f);
                        leftBtn1.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        leftBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[1]==0){
                    Box1++;
                    Box2++;
                    clickFinder[1]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        leftBtn2.setAlpha(1.0f);
                        leftBtn2.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        leftBtn2.setAlpha(1.0f);
                        leftBtn2.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        leftBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[2]==0){
                    Box2++;
                    Box3++;
                    clickFinder[2]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        leftBtn3.setAlpha(1.0f);
                        leftBtn3.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        leftBtn3.setAlpha(1.0f);
                        leftBtn3.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        leftBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[3]==0){
                    Box3++;
                    clickFinder[3]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        leftBtn4.setAlpha(1.0f);
                        leftBtn4.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        leftBtn4.setAlpha(1.0f);
                        leftBtn4.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        centerBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[4]==0){
                    Box4++;
                    clickFinder[4]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        centerBtn1.setAlpha(1.0f);
                        centerBtn1.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        centerBtn1.setAlpha(1.0f);
                        centerBtn1.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        centerBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[5]==0){
                    Box4++;
                    Box5++;
                    clickFinder[5]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        centerBtn2.setAlpha(1.0f);
                        centerBtn2.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        centerBtn2.setAlpha(1.0f);
                        centerBtn2.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        centerBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[6]==0){
                    Box5++;
                    Box6++;
                    clickFinder[6]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        centerBtn3.setAlpha(1.0f);
                        centerBtn3.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        centerBtn3.setAlpha(1.0f);
                        centerBtn3.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        centerBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[7]==0){
                    Box6++;
                    clickFinder[7]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        centerBtn4.setAlpha(1.0f);
                        centerBtn4.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        centerBtn4.setAlpha(1.0f);
                        centerBtn4.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        rightBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[8]==0){
                    Box7++;
                    clickFinder[8]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        rightBtn1.setAlpha(1.0f);
                        rightBtn1.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        rightBtn1.setAlpha(1.0f);
                        rightBtn1.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        rightBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[9]==0){
                    Box7++;
                    Box8++;
                    clickFinder[9]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        rightBtn2.setAlpha(1.0f);
                        rightBtn2.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        rightBtn2.setAlpha(1.0f);
                        rightBtn2.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        rightBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[10]==0){
                    Box8++;
                    Box9++;
                    clickFinder[10]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        rightBtn3.setAlpha(1.0f);
                        rightBtn3.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        rightBtn3.setAlpha(1.0f);
                        rightBtn3.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        rightBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[11]==0){
                    Box9++;
                    clickFinder[11]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        rightBtn4.setAlpha(1.0f);
                        rightBtn4.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        rightBtn4.setAlpha(1.0f);
                        rightBtn4.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[12]==0){
                    Box1++;
                    clickFinder[12]=1;
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
                if(clickFinder[13]==0){
                    Box2++;
                    clickFinder[13]=1;
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
                if(clickFinder[14]==0){
                    Box3++;
                    clickFinder[14]=1;
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
                if(clickFinder[15]==0){
                    Box1++;
                    Box4++;
                    clickFinder[15]=1;
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
                if(clickFinder[16]==0){
                    Box2++;
                    Box5++;
                    clickFinder[16]=1;
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
                if(clickFinder[17]==0){
                    Box3++;
                    Box6++;
                    clickFinder[17]=1;
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

        buttonV7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[18]==0){
                    Box4++;
                    Box7++;
                    clickFinder[18]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonV7.setAlpha(1.0f);
                        buttonV7.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonV7.setAlpha(1.0f);
                        buttonV7.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonV8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[19]==0){
                    Box5++;
                    Box8++;
                    clickFinder[19]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonV8.setAlpha(1.0f);
                        buttonV8.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonV8.setAlpha(1.0f);
                        buttonV8.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonV9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[20]==0){
                    Box6++;
                    Box9++;
                    clickFinder[20]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonV9.setAlpha(1.0f);
                        buttonV9.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonV9.setAlpha(1.0f);
                        buttonV9.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonV10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[21]==0){
                    Box7++;
                    clickFinder[21]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonV10.setAlpha(1.0f);
                        buttonV10.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonV10.setAlpha(1.0f);
                        buttonV10.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonV11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[22]==0){
                    Box8++;
                    clickFinder[22]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonV11.setAlpha(1.0f);
                        buttonV11.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonV11.setAlpha(1.0f);
                        buttonV11.setBackgroundColor(getResources().getColor(R.color.green));
                    }
                    boxFilled();
                }
            }
        });

        buttonV12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickFinder[23]==0){
                    Box9++;
                    clickFinder[23]=1;
                    if(turn==0){
                        turn=1;
                        turnView.setText("TURN : B");
                        buttonV12.setAlpha(1.0f);
                        buttonV12.setBackgroundColor(getResources().getColor(R.color.red));
                    }
                    else {
                        turn=0;
                        turnView.setText("TURN : A");
                        buttonV12.setAlpha(1.0f);
                        buttonV12.setBackgroundColor(getResources().getColor(R.color.green));
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

        if(Box5==4 && turn==1 && box5Filled==0){
            scoreBox5.setText("A");
            box5Filled=1;
            colorBox5.setBackgroundColor(getResources().getColor(R.color.red));
            scoreA++;
            turn2A++;
        }
        else if(Box5==4 && turn==0 && box5Filled==0){
            scoreBox5.setText("B");
            box5Filled=1;
            colorBox5.setBackgroundColor(getResources().getColor(R.color.green));
            scoreB++;
            turn2B++;
        }

        if(Box6==4 && turn==1 && box6Filled==0){
            scoreBox6.setText("A");
            box6Filled=1;
            colorBox6.setBackgroundColor(getResources().getColor(R.color.red));
            scoreA++;
            turn2A++;
        }
        else if(Box6==4 && turn==0 && box6Filled==0){
            scoreBox6.setText("B");
            box6Filled=1;
            colorBox6.setBackgroundColor(getResources().getColor(R.color.green));
            scoreB++;
            turn2B++;
        }

        if(Box7==4 && turn==1 && box7Filled==0){
            scoreBox7.setText("A");
            box7Filled=1;
            colorBox7.setBackgroundColor(getResources().getColor(R.color.red));
            scoreA++;
            turn2A++;
        }
        else if(Box7==4 && turn==0 && box7Filled==0){
            scoreBox7.setText("B");
            box7Filled=1;
            colorBox7.setBackgroundColor(getResources().getColor(R.color.green));
            scoreB++;
            turn2B++;
        }

        if(Box8==4 && turn==1 && box8Filled==0){
            scoreBox8.setText("A");
            box8Filled=1;
            colorBox8.setBackgroundColor(getResources().getColor(R.color.red));
            scoreA++;
            turn2A++;
        }
        else if(Box8==4 && turn==0 && box8Filled==0){
            scoreBox8.setText("B");
            box8Filled=1;
            colorBox8.setBackgroundColor(getResources().getColor(R.color.green));
            scoreB++;
            turn2B++;
        }

        if(Box9==4 && turn==1 && box9Filled==0){
            scoreBox9.setText("A");
            box9Filled=1;
            colorBox9.setBackgroundColor(getResources().getColor(R.color.red));
            scoreA++;
            turn2A++;
        }
        else if(Box9==4 && turn==0 && box9Filled==0){
            scoreBox9.setText("B");
            box9Filled=1;
            colorBox9.setBackgroundColor(getResources().getColor(R.color.green));
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

        if(box1Filled==1 && box2Filled==1 && box3Filled==1 && box4Filled==1 && box5Filled==1 && box6Filled==1 && box7Filled==1 && box8Filled==1 && box9Filled==1){
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
        }

    }

}
