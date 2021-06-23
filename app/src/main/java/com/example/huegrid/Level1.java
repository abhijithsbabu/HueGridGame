package com.example.huegrid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Level1 extends AppCompatActivity {

    ImageView nextpage;
    TextView b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
    boolean firstpage = true;
    ArrayList<TextView> levelButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        nextpage = findViewById(R.id.nextpage);
        b1 = findViewById(R.id.b13);
        b2 = findViewById(R.id.b14);
        b3 = findViewById(R.id.b15);
        b4 = findViewById(R.id.b16);
        b5 = findViewById(R.id.b17);
        b6 = findViewById(R.id.b18);
        b7 = findViewById(R.id.b19);
        b8 = findViewById(R.id.b20);
        b9 = findViewById(R.id.b21);
        b10 = findViewById(R.id.b22);
        b11 = findViewById(R.id.b23);
        b12 = findViewById(R.id.b24);
        b13 = findViewById(R.id.b25);
        levelButtons = new ArrayList<TextView>();
        levelButtons.add(b1);
        levelButtons.add(b2);
        levelButtons.add(b3);
        levelButtons.add(b4);
        levelButtons.add(b5);
        levelButtons.add(b6);
        levelButtons.add(b7);
        levelButtons.add(b8);
        levelButtons.add(b9);
        levelButtons.add(b10);
        levelButtons.add(b11);
        levelButtons.add(b12);

        for (int i = 0; i<12;i++)
        {
            int finalI = i;
            levelButtons.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(firstpage)
                    {
                        gotoLevel(finalI +1);
                    }
                    else
                    {
                        gotoLevel(finalI + 13);
                    }

                }
            });
        }


        nextpage.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                b1.setText("13");
                b2.setText("14");
                b3.setText("15");
                b4.setText("16");
                b5.setText("17");
                b6.setText("18");
                b7.setText("19");
                b8.setText("20");
                b9.setText("21");
                b10.setText("22");
                b11.setText("23");
                b12.setText("24");
                b13.setText("25");
                firstpage = false;

                b13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        gotoLevel(25);
                    }
                });

                View namebar = view.findViewById(R.id.nextpage);
                ViewGroup parent = (ViewGroup) namebar.getParent();
                if (parent != null) {
                    parent.removeView(namebar);
                }



            }
        });

    }

    public void gotoLevel(int i) {
        Toast.makeText(this, "Starting level " + i, Toast.LENGTH_SHORT).show();
        Static1.chosen_level = i;
        if(i>0 && i<=20)
        {
            Intent im = new Intent(getApplicationContext(), square.class);
            startActivity(im);
            finish();

        }

    }
}
