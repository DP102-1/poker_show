package com.example.poker_show;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
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
    int num = 0;
    List<Integer> poker_d = new ArrayList<>();
    List<Integer> poker_s = new ArrayList<>();
    List<Integer> poker_h = new ArrayList<>();
    List<Integer> poker_c = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image_poker = findViewById(R.id.imagePoker);
        poker_text = findViewById(R.id.textView);
        number = findViewById(R.id.number);
        sb = findViewById(R.id.seekBar);
        setPoker_d();
        setPoker_s();
        setPoker_h();
        setPoker_c();



        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar,
                                          int progress,
                                          boolean fromUser) {
                num =+ progress;
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
        switch (flower) {
                case "方塊":
                image_poker.setImageResource(poker_d.get(num));
                break;
                case "黑桃":
                image_poker.setImageResource(poker_s.get(num));
                break;
                case "紅心":
                image_poker.setImageResource(poker_h.get(num));
                break;
                case "梅花":
                image_poker.setImageResource(poker_c.get(num));
                break;
        }

        poker_text.setText(flower + num);
    }

        public void setPoker_d(){
        poker_d.add(R.drawable.d1);
        poker_d.add(R.drawable.d2);
        poker_d.add(R.drawable.d3);
        poker_d.add(R.drawable.d4);
        poker_d.add(R.drawable.d5);
        poker_d.add(R.drawable.d6);
        poker_d.add(R.drawable.d7);
        poker_d.add(R.drawable.d8);
        poker_d.add(R.drawable.d9);
        poker_d.add(R.drawable.d10);
        poker_d.add(R.drawable.d11);
        poker_d.add(R.drawable.d12);
        poker_d.add(R.drawable.d13);
    }
    public void setPoker_s(){
        poker_d.add(R.drawable.s1);
        poker_d.add(R.drawable.s2);
        poker_d.add(R.drawable.s3);
        poker_d.add(R.drawable.s4);
        poker_d.add(R.drawable.s5);
        poker_d.add(R.drawable.s6);
        poker_d.add(R.drawable.s7);
        poker_d.add(R.drawable.s8);
        poker_d.add(R.drawable.s9);
        poker_d.add(R.drawable.s10);
        poker_d.add(R.drawable.s11);
        poker_d.add(R.drawable.s12);
        poker_d.add(R.drawable.s13);
    }
    public void setPoker_c(){
        poker_d.add(R.drawable.c1);
        poker_d.add(R.drawable.c2);
        poker_d.add(R.drawable.c3);
        poker_d.add(R.drawable.c4);
        poker_d.add(R.drawable.c5);
        poker_d.add(R.drawable.c6);
        poker_d.add(R.drawable.c7);
        poker_d.add(R.drawable.c8);
        poker_d.add(R.drawable.c9);
        poker_d.add(R.drawable.c10);
        poker_d.add(R.drawable.c11);
        poker_d.add(R.drawable.c12);
        poker_d.add(R.drawable.c13);
    }
    public void setPoker_h(){
        poker_d.add(R.drawable.h1);
        poker_d.add(R.drawable.h2);
        poker_d.add(R.drawable.h3);
        poker_d.add(R.drawable.h4);
        poker_d.add(R.drawable.h5);
        poker_d.add(R.drawable.h6);
        poker_d.add(R.drawable.h7);
        poker_d.add(R.drawable.h8);
        poker_d.add(R.drawable.h9);
        poker_d.add(R.drawable.h10);
        poker_d.add(R.drawable.h11);
        poker_d.add(R.drawable.h12);
        poker_d.add(R.drawable.h13);
    }
}
