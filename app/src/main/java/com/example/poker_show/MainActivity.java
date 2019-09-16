package com.example.poker_show;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private TextView poker_text,number;
    private ImageView image_poker;
    private SeekBar sb;
    String flower = "方塊";
    int num = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_poker = findViewById(R.id.imagePoker);
        poker_text = findViewById(R.id.textView);
        number = findViewById(R.id.number);
        sb = findViewById(R.id.seekBar);
        List<Integer> poker = new ArrayList<Integer>();


        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar,
                                          int progress,
                                          boolean fromUser) {
                num =+ progress;
                num++;
                poker_show();
                number.setText(num);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public void onDiamondClick(View view) {
        flower = "方塊";
        poker_show();
    }
    public void onSpadesClick(View view) {
        flower = "黑桃";
        poker_show();
    }
    public void onHeartClick(View view) {
        flower = "紅心";
        poker_show();
    }
    public void onClubClick(View view) {
        flower = "梅花";
        poker_show();
    }
    public void poker_show(){
        String setDrawable = "R.drawable.";
        switch (flower) {
                case "方塊":
                image_poker.setImageResource(Integer.parseInt(setDrawable + "d" + num));
                break;
                case "黑桃":
                image_poker.setImageResource(R.drawable.s1);
                break;
                case "紅心":
                image_poker.setImageResource(R.drawable.h1);
                break;
                case "梅花":
                image_poker.setImageResource(R.drawable.c1);
                break;
        }

        poker_text.setText(flower + num);
    }

}
