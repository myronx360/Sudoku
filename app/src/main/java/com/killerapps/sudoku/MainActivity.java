package com.killerapps.sudoku;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/** Does everything except generate default number in a way that is guaranteed win-able */

public class MainActivity extends AppCompatActivity {
    private TextView currTile;
    private TextView prevTile;
    private String TAG = "HELPME";

    TextView a1;
    TextView a2;
    TextView a3;
    TextView a4;
    TextView a5;
    TextView a6;
    TextView a7;
    TextView a8;
    TextView a9;

    TextView b1;
    TextView b2;
    TextView b3;
    TextView b4;
    TextView b5;
    TextView b6;
    TextView b7;
    TextView b8;
    TextView b9;

    TextView c1;
    TextView c2;
    TextView c3;
    TextView c4;
    TextView c5;
    TextView c6;
    TextView c7;
    TextView c8;
    TextView c9;

    TextView d1;
    TextView d2;
    TextView d3;
    TextView d4;
    TextView d5;
    TextView d6;
    TextView d7;
    TextView d8;
    TextView d9;

    TextView e1;
    TextView e2;
    TextView e3;
    TextView e4;
    TextView e5;
    TextView e6;
    TextView e7;
    TextView e8;
    TextView e9;

    TextView f1;
    TextView f2;
    TextView f3;
    TextView f4;
    TextView f5;
    TextView f6;
    TextView f7;
    TextView f8;
    TextView f9;

    TextView g1;
    TextView g2;
    TextView g3;
    TextView g4;
    TextView g5;
    TextView g6;
    TextView g7;
    TextView g8;
    TextView g9;

    TextView h1;
    TextView h2;
    TextView h3;
    TextView h4;
    TextView h5;
    TextView h6;
    TextView h7;
    TextView h8;
    TextView h9;

    TextView i1;
    TextView i2;
    TextView i3;
    TextView i4;
    TextView i5;
    TextView i6;
    TextView i7;
    TextView i8;
    TextView i9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        a1 = (TextView) findViewById(R.id.txtA1);
        a2 = (TextView) findViewById(R.id.txtA2);
        a3 = (TextView) findViewById(R.id.txtA3);
        a4 = (TextView) findViewById(R.id.txtA4);
        a5 = (TextView) findViewById(R.id.txtA5);
        a6 = (TextView) findViewById(R.id.txtA6);
        a7 = (TextView) findViewById(R.id.txtA7);
        a8 = (TextView) findViewById(R.id.txtA8);
        a9 = (TextView) findViewById(R.id.txtA9);

        b1 = (TextView) findViewById(R.id.txtB1);
        b2 = (TextView) findViewById(R.id.txtB2);
        b3 = (TextView) findViewById(R.id.txtB3);
        b4 = (TextView) findViewById(R.id.txtB4);
        b5 = (TextView) findViewById(R.id.txtB5);
        b6 = (TextView) findViewById(R.id.txtB6);
        b7 = (TextView) findViewById(R.id.txtB7);
        b8 = (TextView) findViewById(R.id.txtB8);
        b9 = (TextView) findViewById(R.id.txtB9);

        c1 = (TextView) findViewById(R.id.txtC1);
        c2 = (TextView) findViewById(R.id.txtC2);
        c3 = (TextView) findViewById(R.id.txtC3);
        c4 = (TextView) findViewById(R.id.txtC4);
        c5 = (TextView) findViewById(R.id.txtC5);
        c6 = (TextView) findViewById(R.id.txtC6);
        c7 = (TextView) findViewById(R.id.txtC7);
        c8 = (TextView) findViewById(R.id.txtC8);
        c9 = (TextView) findViewById(R.id.txtC9);

        d1 = (TextView) findViewById(R.id.txtD1);
        d2 = (TextView) findViewById(R.id.txtD2);
        d3 = (TextView) findViewById(R.id.txtD3);
        d4 = (TextView) findViewById(R.id.txtD4);
        d5 = (TextView) findViewById(R.id.txtD5);
        d6 = (TextView) findViewById(R.id.txtD6);
        d7 = (TextView) findViewById(R.id.txtD7);
        d8 = (TextView) findViewById(R.id.txtD8);
        d9 = (TextView) findViewById(R.id.txtD9);

        e1 = (TextView) findViewById(R.id.txtE1);
        e2 = (TextView) findViewById(R.id.txtE2);
        e3 = (TextView) findViewById(R.id.txtE3);
        e4 = (TextView) findViewById(R.id.txtE4);
        e5 = (TextView) findViewById(R.id.txtE5);
        e6 = (TextView) findViewById(R.id.txtE6);
        e7 = (TextView) findViewById(R.id.txtE7);
        e8 = (TextView) findViewById(R.id.txtE8);
        e9 = (TextView) findViewById(R.id.txtE9);

        f1 = (TextView) findViewById(R.id.txtF1);
        f2 = (TextView) findViewById(R.id.txtF2);
        f3 = (TextView) findViewById(R.id.txtF3);
        f4 = (TextView) findViewById(R.id.txtF4);
        f5 = (TextView) findViewById(R.id.txtF5);
        f6 = (TextView) findViewById(R.id.txtF6);
        f7 = (TextView) findViewById(R.id.txtF7);
        f8 = (TextView) findViewById(R.id.txtF8);
        f9 = (TextView) findViewById(R.id.txtF9);

        g1 = (TextView) findViewById(R.id.txtG1);
        g2 = (TextView) findViewById(R.id.txtG2);
        g3 = (TextView) findViewById(R.id.txtG3);
        g4 = (TextView) findViewById(R.id.txtG4);
        g5 = (TextView) findViewById(R.id.txtG5);
        g6 = (TextView) findViewById(R.id.txtG6);
        g7 = (TextView) findViewById(R.id.txtG7);
        g8 = (TextView) findViewById(R.id.txtG8);
        g9 = (TextView) findViewById(R.id.txtG9);

        h1 = (TextView) findViewById(R.id.txtH1);
        h2 = (TextView) findViewById(R.id.txtH2);
        h3 = (TextView) findViewById(R.id.txtH3);
        h4 = (TextView) findViewById(R.id.txtH4);
        h5 = (TextView) findViewById(R.id.txtH5);
        h6 = (TextView) findViewById(R.id.txtH6);
        h7 = (TextView) findViewById(R.id.txtH7);
        h8 = (TextView) findViewById(R.id.txtH8);
        h9 = (TextView) findViewById(R.id.txtH9);

        i1 = (TextView) findViewById(R.id.txtI1);
        i2 = (TextView) findViewById(R.id.txtI2);
        i3 = (TextView) findViewById(R.id.txtI3);
        i4 = (TextView) findViewById(R.id.txtI4);
        i5 = (TextView) findViewById(R.id.txtI5);
        i6 = (TextView) findViewById(R.id.txtI6);
        i7 = (TextView) findViewById(R.id.txtI7);
        i8 = (TextView) findViewById(R.id.txtI8);
        i9 = (TextView) findViewById(R.id.txtI9);

        fillBoard();

//        currTile = null;

//
//        for (int i = 1; i < 10; i++){
//            String txtView = "R.id.txtA";
//            txtView = txtView.concat(Integer.toString(i));
//            Log.d(TAG, "onCreate: " + txtView);
//            findViewById(txtView).setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
////                    currTile = (TextView) findViewById(Integer.parseInt(txtView));
//                }
//            });
//
//        }

        ///////////////// Row set 1 \\\\\\\\\\\\\\\\\\\\\\\\\
        ///////////////// Tile set A \\\\\\\\\\\\\\\\\\\\\\\\\
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtA1);
                highlightTile(currTile);
            }
        });

       a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtA2);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtA3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtA3);
                highlightTile(currTile);
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtA4);
                highlightTile(currTile);
            }
        });

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtA5);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtA6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtA6);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtA7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtA7);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtA8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtA8);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtA9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtA9);
                highlightTile(currTile);
            }
        });
        ///////////////// Tile set B \\\\\\\\\\\\\\\\\\\\\\\\\
        findViewById(R.id.txtB1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtB1);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtB2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtB2);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtB3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtB3);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtB4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtB4);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtB5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtB5);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtB6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtB6);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtB7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtB7);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtB8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtB8);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtB9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtB9);
                highlightTile(currTile);
            }
        });
        ///////////////// Tile set C \\\\\\\\\\\\\\\\\\\\\\\\\
        findViewById(R.id.txtC1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtC1);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtC2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtC2);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtC3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtC3);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtC4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtC4);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtC5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtC5);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtC6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtC6);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtC7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtC7);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtC8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtC8);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtC9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtC9);
                highlightTile(currTile);
            }
        });
        ///////////////// Row set 2 \\\\\\\\\\\\\\\\\\\\\\\\\
        ///////////////// Tile set D \\\\\\\\\\\\\\\\\\\\\\\\\
        findViewById(R.id.txtD1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtD1);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtD2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtD2);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtD3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtD3);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtD4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtD4);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtD5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtD5);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtD6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtD6);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtD7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtD7);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtD8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtD8);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtD9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtD9);
                highlightTile(currTile);
            }
        });
        ///////////////// Tile set E \\\\\\\\\\\\\\\\\\\\\\\\\
        findViewById(R.id.txtE1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtE1);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtE2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtE2);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtE3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtE3);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtE4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtE4);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtE5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtE5);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtE6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtE6);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtE7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtE7);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtE8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtE8);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtE9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtE9);
                highlightTile(currTile);

            }
        });
        ///////////////// Tile set F \\\\\\\\\\\\\\\\\\\\\\\\\
        findViewById(R.id.txtF1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtF1);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtF2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtF2);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtF3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtF3);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtF4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtF4);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtF5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtF5);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtF6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtF6);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtF7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtF7);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtF8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtF8);
            }
        });

        findViewById(R.id.txtF9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtF9);
                highlightTile(currTile);
            }
        });

        ///////////////// Row set 3 \\\\\\\\\\\\\\\\\\\\\\\\\
        ///////////////// Tile set G \\\\\\\\\\\\\\\\\\\\\\\\\
        findViewById(R.id.txtG1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtG1);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtG2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtG2);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtG3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtG3);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtG4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtG4);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtG5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtG5);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtG6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtG6);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtG7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtG7);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtG8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtG8);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtG9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtG9);
                highlightTile(currTile);
            }
        });
        ///////////////// Tile set H \\\\\\\\\\\\\\\\\\\\\\\\\
        findViewById(R.id.txtH1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtH1);
                highlightTile(currTile);

            }
        });

        findViewById(R.id.txtH2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtH2);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtH3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtH3);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtH4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtH4);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtH5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtH5);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtH6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtH6);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtH7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtH7);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtH8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtH8);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtH9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtH9);
                highlightTile(currTile);
            }
        });
        ///////////////// Tile set I \\\\\\\\\\\\\\\\\\\\\\\\\
        findViewById(R.id.txtI1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtI1);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtI2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtI2);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtI3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtI3);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtI4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtI4);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtI5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtI5);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtI6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtI6);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtI7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtI7);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtI8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtI8);
                highlightTile(currTile);
            }
        });

        findViewById(R.id.txtI9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile = (TextView) findViewById(R.id.txtI9);
                highlightTile(currTile);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////

        findViewById(R.id.btn0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                currTile.setText("0");
                if(checkWin()){
                    Toast.makeText(MainActivity.this, "Winner", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Lose", Toast.LENGTH_SHORT).show();
                }
            }
        });

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile.setText("1");
            }
        });

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile.setText("2");
            }
        });

        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile.setText("3");
            }
        });

        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile.setText("4");
            }
        });

        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile.setText("5");
            }
        });

        findViewById(R.id.btn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile.setText("6");
            }
        });

        findViewById(R.id.btn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile.setText("7");
            }
        });

        findViewById(R.id.btn8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile.setText("8");
            }
        });

        findViewById(R.id.btn9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile.setText("9");
            }
        });

        findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currTile.setText("");
            }
        });


    }

    private void highlightTile(TextView t){

            if(prevTile != null){
                prevTile.setBackgroundResource(android.R.drawable.editbox_dropdown_light_frame);
            }
        currTile.setBackgroundResource(android.R.drawable.editbox_dropdown_dark_frame);

        prevTile = currTile;
    }

// choose random block then choose random spot
    public void fillBoard(){
        Random r = new Random();
        int defaultSpaces = 23;
        int tilePos =  r.nextInt(defaultSpaces);


        ArrayList<TextView> tileList = new ArrayList<>();
        ArrayList<Integer> tilePosList = new ArrayList<>();
        HashMap<TextView, Integer> defaultTiles = new HashMap<>();



        tileList.add(a1);tileList.add(a2);tileList.add(a3);tileList.add(a4);tileList.add(a5);tileList.add(a6);tileList.add(a7);tileList.add(a8);tileList.add(a9);
        tileList.add(b1);tileList.add(b2);tileList.add(b3);tileList.add(b4);tileList.add(b5);tileList.add(b6);tileList.add(b7);tileList.add(b8);tileList.add(b9);
        tileList.add(c1);tileList.add(c2);tileList.add(c3);tileList.add(c4);tileList.add(c5);tileList.add(c6);tileList.add(c7);tileList.add(c8);tileList.add(c9);
        tileList.add(d1);tileList.add(d2);tileList.add(d3);tileList.add(d4);tileList.add(d5);tileList.add(d6);tileList.add(d7);tileList.add(d8);tileList.add(d9);
        tileList.add(e1);tileList.add(e2);tileList.add(e3);tileList.add(e4);tileList.add(e5);tileList.add(e6);tileList.add(e7);tileList.add(e8);tileList.add(e9);
        tileList.add(f1);tileList.add(f2);tileList.add(f3);tileList.add(f4);tileList.add(f5);tileList.add(f6);tileList.add(f7);tileList.add(f8);tileList.add(f9);
        tileList.add(g1);tileList.add(g2);tileList.add(g3);tileList.add(g4);tileList.add(g5);tileList.add(g6);tileList.add(g7);tileList.add(g8);tileList.add(g9);
        tileList.add(h1);tileList.add(h2);tileList.add(h3);tileList.add(h4);tileList.add(h5);tileList.add(h6);tileList.add(h7);tileList.add(h8);tileList.add(h9);
        tileList.add(i1);tileList.add(i2);tileList.add(i3);tileList.add(i4);tileList.add(i5);tileList.add(i6);tileList.add(i7);tileList.add(i8);tileList.add(i9);




//        tilePos = r.nextInt(9);
//        tilePosList.add(tilePos);

        // Make a list of random ordered tile positions
        for (int i = 0; i < defaultSpaces; i++) {
            // Get new tilePos
            while (tilePosList.size() < defaultSpaces ) {

                if (!tilePosList.contains(tilePos)) {
                    tilePosList.add(tilePos);
                    Log.i(TAG, "tilePos, " + tilePos);
                }else{
                    tilePos = r.nextInt(defaultSpaces);
                }

            }
        }

        Log.i(TAG,  "tilePosLists, "+ tilePosList.toString());

        for (int i = 0; i < defaultSpaces; i++) {

            int num = (r.nextInt(9)) + 1;
            int pos = tilePosList.get(i);
            TextView tile = tileList.get(tilePosList.get(i));
            tile.setText(Integer.toString(num));
            Log.i(TAG, "i: " + i + "tilePos, "+ tilePosList.get(i)+"   "+ num);
            // @return false if number already in path, return true if tile is empty or not repeated
            // check win paths
            //  if num already there, get new num
//            if(tilePosList.get(i) == 0){
//                while (!fillBlockA() && !fillRow1() && !fillCol1()){
//                    num = r.nextInt(9) + 1;
//                }
//                tile.setText(Integer.toString(num));
//                tile.setTextColor(Color.BLUE);
//            }
            for (int j = 0; j < defaultSpaces; j++){
                Log.i(TAG, "Tilelist: "+j+": " + tileList.get(j).getText().toString() +"");
            }


            Log.i(TAG, "Fill 1: " + !fillBlockA() +" : "+ !fillRow1() +" : "+ !fillCol1());
            Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
            Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
            switch (tilePosList.get(i)){
                default:
                    Log.i(TAG, "default: NUM" + num + "; tilePos, "+ tilePosList.get(i));
                case 0:
                    while ( !fillBlockA() || !fillRow1() || !fillCol1()){// !fillBlockA() || || !fillCol1()never true
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockA() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 1:
                    while ( !fillBlockA() || !fillRow1() ||!fillCol2()){ //|| !fillBlockA() ||!fillCol2()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockA() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 2:
                    while ( !fillBlockA() || !fillRow1()  || !fillCol3()){ // !fillBlockA() || || !fillCol3()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockA() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 3:
                    while ( !fillBlockA() ||  !fillRow2() || !fillCol1()){ // !fillBlockA()  || || !fillRow2() !fillCol1() ||
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockA() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 4:
                    while ( !fillBlockA() || !fillRow2() || !fillCol2() ){ // !fillBlockA() || !fillRow2() || !fillCol2()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockA() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 5:
                    while (!fillBlockA() || !fillRow2()  || !fillCol3()){ //!fillBlockA() || !fillRow2() || !fillCol3()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockA() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 6:
                    while ( !fillBlockA() || !fillRow3() || !fillCol1()){ // !fillBlockA() || !fillCol1()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockA() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 7:
                    while (!fillBlockA() || !fillRow3() || !fillCol2()){ // !fillBlockA() || || !fillCol2()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockA() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 8:
                    while (!fillBlockA() || !fillRow3() || !fillCol3()){ // !fillBlockA() || || !fillCol3()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockA() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 9:
                    while (!fillBlockB() ||  !fillRow1() ){// !fillBlockA() || || !fillCol1()never true
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockB() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 10:
                    while (!fillBlockB() ||  !fillRow1() ){ //|| !fillBlockA() ||!fillCol2()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockB() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 11:
                    while (!fillBlockB() || !fillRow1()  ){ // !fillBlockA() || || !fillCol3()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockB() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 12:
                    while ( !fillBlockB() || !fillRow2()){ // !fillBlockA()  || || !fillRow2() !fillCol1() ||
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockB() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 13:
                    while ( !fillBlockB() || !fillRow2()  ){ // !fillBlockA() || !fillRow2() || !fillCol2()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockB() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 14:
                    while (!fillBlockB() || !fillRow2()  ){ //!fillBlockA() || !fillRow2() || !fillCol3()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockB() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 15:
                    while ( !fillBlockB() || !fillRow3() ){ // !fillBlockA() || !fillCol1()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockB() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 16:
                    while (!fillBlockB() || !fillRow3() ){ // !fillBlockA() || || !fillCol2()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockB() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 17:
                    while (!fillBlockB() || !fillRow3() ){ // !fillBlockA() || || !fillCol3()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockB() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 18:
                    while ( !fillBlockC() || !fillRow1() ){// !fillBlockA() || || !fillCol1()never true
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockC() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 19:
                    while ( !fillBlockC() || !fillRow1() ){ //|| !fillBlockA() ||!fillCol2()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockC() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 20:
                    while ( !fillBlockC() || !fillRow1()  ){ // !fillBlockA() || || !fillCol3()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockB() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 21:
                    while (  !fillBlockC() || !fillRow2()){ // !fillBlockA()  || || !fillRow2() !fillCol1() ||
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockC() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 22:
                    while ( !fillBlockC() || !fillRow2()  ){ // !fillBlockA() || !fillRow2() || !fillCol2()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockC() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 23:
                    while (!fillBlockC() || !fillRow2()  ){ //!fillBlockA() || !fillRow2() || !fillCol3()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockC() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 24:
                    while ( !fillBlockC() || !fillRow3() ){ // !fillBlockA() || !fillCol1()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockC() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 25:
                    while (!fillBlockC() || !fillRow3() ){ // !fillBlockA() || || !fillCol2()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockC() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockA() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockA() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;
                case 26:
                    while (!fillBlockC() || !fillRow3() ){ // !fillBlockA() || || !fillCol3()
                        num = r.nextInt(9) + 1;
                        tile.setText(Integer.toString(num));
                        Log.i(TAG, "num: " + num + "; tilePos, "+ tilePosList.get(i));
                        Log.i(TAG, "Fill 1: " + !fillBlockC() +" : "+ !fillRow1() +" : "+ !fillCol1());
                        Log.i(TAG, "Fill 2: " + !fillBlockC() +" : "+ !fillRow2() +" : "+ !fillCol2());
                        Log.i(TAG, "Fill: 3 " + !fillBlockC() +" : "+ !fillRow3() +" : "+ !fillCol3());
                    }
                    break;

            }
            if(r.nextBoolean()) {
                tile.setText(Integer.toString(num));
                tile.setTextColor(Color.BLUE);
            }else{
                tile.setText("");
            }

//         while (
//                 (((defaultTiles.containsKey(a1) && defaultTiles.get(a1) == num) || (defaultTiles.containsKey(a2) && defaultTiles.get(a2) == num) || (defaultTiles.containsKey(a3) && defaultTiles.get(a3) == num) ||
//                         (defaultTiles.containsKey(a4) && defaultTiles.get(a4) == num) || (defaultTiles.containsKey(a5) && defaultTiles.get(a5) == num) || (defaultTiles.containsKey(a6) && defaultTiles.get(a6) == num) ||
//                         (defaultTiles.containsKey(a7) &&  defaultTiles.get(a7) == num) || (defaultTiles.containsKey(a8) && defaultTiles.get(a8) == num) || (defaultTiles.containsKey(a9) && defaultTiles.get(a9) == num))
//                 )
////                 (((defaultTiles.containsKey(a1) && defaultTiles.get(a1) == num) || (defaultTiles.containsKey(a2) && defaultTiles.get(a2) == num) || (defaultTiles.containsKey(a3) && defaultTiles.get(a3) == num) ||
////                    (defaultTiles.containsKey(a4) && defaultTiles.get(a4) == num) || (defaultTiles.containsKey(a5) && defaultTiles.get(a5) == num) || (defaultTiles.containsKey(a6) && defaultTiles.get(a6) == num) ||
////                    (defaultTiles.containsKey(a7) &&  defaultTiles.get(a7) == num) || (defaultTiles.containsKey(a8) && defaultTiles.get(a8) == num) || (defaultTiles.containsKey(a9) && defaultTiles.get(a9) == num))
////                 )
//
////               && (((defaultTiles.containsKey(b1) && defaultTiles.get(b1) == num) || (defaultTiles.containsKey(b2) && defaultTiles.get(b2) == num) || (defaultTiles.containsKey(b3) && defaultTiles.get(b3) == num) ||
////                        (defaultTiles.containsKey(b4) && defaultTiles.get(b4) == num) || (defaultTiles.containsKey(b5) && defaultTiles.get(b5) == num) || (defaultTiles.containsKey(b6) && defaultTiles.get(b6) == num) ||
////                        (defaultTiles.containsKey(b7) &&  defaultTiles.get(b7) == num) || (defaultTiles.containsKey(b8) && defaultTiles.get(b8) == num) || (defaultTiles.containsKey(b9) && defaultTiles.get(b9) == num))
////                  )
//                 )
//
//                {
//                Log.i(TAG, "checkBlockA: " + checkBlockA() + " POS: " + tilePosList.get(i) + ", " + num);
//                num = r.nextInt(9) + 1;
//            }


//            while ((aBlockDefaultTiles.containsKey(a1) && aBlockDefaultTiles.get(a1) == num) || (aBlockDefaultTiles.containsKey(a2) && aBlockDefaultTiles.get(a2) == num) || (aBlockDefaultTiles.containsKey(a3) && aBlockDefaultTiles.get(a3) == num) ||
//                    (aBlockDefaultTiles.containsKey(a4) && aBlockDefaultTiles.get(a4) == num) || (aBlockDefaultTiles.containsKey(a5) && aBlockDefaultTiles.get(a5) == num) || (aBlockDefaultTiles.containsKey(a6) && aBlockDefaultTiles.get(a6) == num) ||
//                    (aBlockDefaultTiles.containsKey(a7) &&  aBlockDefaultTiles.get(a7) == num) || (aBlockDefaultTiles.containsKey(a8) && aBlockDefaultTiles.get(a8) == num) || (aBlockDefaultTiles.containsKey(a9) && aBlockDefaultTiles.get(a9) == num)) {
//
//                Log.i(TAG, "checkBlockA: " + checkBlockA() + " POS: " + tilePosList.get(i) + ", " + num);
//                num = r.nextInt(9) + 1;
//            }

//            while ((defaultTiles.containsKey(b1) && defaultTiles.get(b1) == num) || (defaultTiles.containsKey(b2) && defaultTiles.get(b2) == num) || (defaultTiles.containsKey(b3) && defaultTiles.get(b3) == num) ||
//                    (defaultTiles.containsKey(b4) && defaultTiles.get(b4) == num) || (defaultTiles.containsKey(b5) && defaultTiles.get(b5) == num) || (defaultTiles.containsKey(b6) && defaultTiles.get(b6) == num) ||
//                    (defaultTiles.containsKey(b7) &&  defaultTiles.get(b7) == num) || (defaultTiles.containsKey(b8) && defaultTiles.get(b8) == num) || (defaultTiles.containsKey(b9) && defaultTiles.get(b9) == num)) {
//
//                Log.i(TAG, "checkBlockB: " + checkBlockB() + " POS: " + tilePosList.get(i) + ", " + num);
//                num = r.nextInt(9) + 1;
//            }


//            tile.setText(Integer.toString(num));
//            tile.setTextColor(Color.BLUE);
//            defaultTiles.put(tile, num);

        }
// foreach square check win paths
        // check if tile alread has a #
        // interate thur list if tilePos #s
// goto every sqare and place a # }} " "
    }

////////////////////////////////////////////////////////////////////////////////////////////////////

    private boolean isTileEmpty(TextView tile){
        return tile.getText().toString().isEmpty();
    }

    // @return false if number already in path, return true if tile is empty or not repeated
    private boolean fillBlockA(){
    ArrayList<String> blockA = new ArrayList<>();
    blockA.clear();
    if (!isTileEmpty(a1)) {
        if (blockA.contains(a1.getText().toString()))
            return false;
        else
            blockA.add(a1.getText().toString());
    }
    if (!isTileEmpty(a2)) {
        if (blockA.contains(a2.getText().toString()))
            return false;
        else
            blockA.add(a2.getText().toString());
    }
    if (!isTileEmpty(a3)) {
        if (blockA.contains(a3.getText().toString()))
            return false;
        else
            blockA.add(a3.getText().toString());
    }
    if (!isTileEmpty(a4)) {
        if (blockA.contains(a4.getText().toString()))
            return false;
        else
            blockA.add(a4.getText().toString());
    }
    if (!isTileEmpty(a5)) {
        if (blockA.contains(a5.getText().toString()))
            return false;
        else
            blockA.add(a5.getText().toString());
    }
    if (!isTileEmpty(a6)) {
        if (blockA.contains(a6.getText().toString()))
            return false;
        else
            blockA.add(a6.getText().toString());
    }
    if (!isTileEmpty(a7)) {
        if (blockA.contains(a7.getText().toString()))
            return false;
        else
            blockA.add(a7.getText().toString());
    }
    if (!isTileEmpty(a8)) {
        if (blockA.contains(a8.getText().toString()))
            return false;
        else
            blockA.add(a8.getText().toString());
    }
    if (!isTileEmpty(a9)) {
        if (blockA.contains(a9.getText().toString()))
            return false;
        else
            blockA.add(a9.getText().toString());
    }
        blockA.clear();
    return true;
}
    private boolean fillBlockB(){
        ArrayList<String> blockB = new ArrayList<>();
        blockB.clear();
        if (!isTileEmpty(b1)) {
            if (blockB.contains(b1.getText().toString()))
                return false;
            else
                blockB.add(b1.getText().toString());
        }
        if (!isTileEmpty(b2)) {
            if (blockB.contains(b2.getText().toString()))
                return false;
            else
                blockB.add(b2.getText().toString());
        }
        if (!isTileEmpty(b3)) {
            if (blockB.contains(b3.getText().toString()))
                return false;
            else
                blockB.add(b3.getText().toString());
        }
        if (!isTileEmpty(b4)) {
            if (blockB.contains(b4.getText().toString()))
                return false;
            else
                blockB.add(b4.getText().toString());
        }
        if (!isTileEmpty(b5)) {
            if (blockB.contains(b5.getText().toString()))
                return false;
            else
                blockB.add(b5.getText().toString());
        }
        if (!isTileEmpty(b6)) {
            if (blockB.contains(b6.getText().toString()))
                return false;
            else
                blockB.add(b6.getText().toString());
        }
        if (!isTileEmpty(b7)) {
            if (blockB.contains(b7.getText().toString()))
                return false;
            else
                blockB.add(b7.getText().toString());
        }
        if (!isTileEmpty(b8)) {
            if (blockB.contains(b8.getText().toString()))
                return false;
            else
                blockB.add(b8.getText().toString());
        }
        if (!isTileEmpty(b9)) {
            if (blockB.contains(b9.getText().toString()))
                return false;
            else
                blockB.add(b9.getText().toString());
        }
        blockB.clear();
        return true;
    }
    private boolean fillBlockC(){
        ArrayList<String> blockC = new ArrayList<>();
        blockC.clear();
        if (!isTileEmpty(c1)) {
            if (blockC.contains(c1.getText().toString()))
                return false;
            else
                blockC.add(c1.getText().toString());
        }
        if (!isTileEmpty(c2)) {
            if (blockC.contains(c2.getText().toString()))
                return false;
            else
                blockC.add(c2.getText().toString());
        }
        if (!isTileEmpty(c3)) {
            if (blockC.contains(c3.getText().toString()))
                return false;
            else
                blockC.add(c3.getText().toString());
        }
        if (!isTileEmpty(c4)) {
            if (blockC.contains(c4.getText().toString()))
                return false;
            else
                blockC.add(c4.getText().toString());
        }
        if (!isTileEmpty(c5)) {
            if (blockC.contains(c5.getText().toString()))
                return false;
            else
                blockC.add(c5.getText().toString());
        }
        if (!isTileEmpty(c6)) {
            if (blockC.contains(c6.getText().toString()))
                return false;
            else
                blockC.add(c6.getText().toString());
        }
        if (!isTileEmpty(c7)) {
            if (blockC.contains(c7.getText().toString()))
                return false;
            else
                blockC.add(c7.getText().toString());
        }
        if (!isTileEmpty(c8)) {
            if (blockC.contains(c8.getText().toString()))
                return false;
            else
                blockC.add(c8.getText().toString());
        }
        if (!isTileEmpty(c9)) {
            if (blockC.contains(c9.getText().toString()))
                return false;
            else
                blockC.add(c9.getText().toString());
        }
        blockC.clear();
        return true;
    }

    private boolean fillRow1(){
        ArrayList<String> row1 = new ArrayList<>();
        row1.clear();
        if (!isTileEmpty(a1)) {
            if (row1.contains(a1.getText().toString()))
                return false;
            else
                row1.add(a1.getText().toString());
        }
        if (!isTileEmpty(a2)) {
            if (row1.contains(a2.getText().toString()))
                return false;
            else
                row1.add(a2.getText().toString());
        }
        if (!isTileEmpty(a3)) {
            if (row1.contains(a3.getText().toString()))
                return false;
            else
                row1.add(a3.getText().toString());
        }
        if (!isTileEmpty(b1)) {
            if (row1.contains(b1.getText().toString()))
                return false;
            else
                row1.add(b1.getText().toString());
        }
        if (!isTileEmpty(b2)) {
            if (row1.contains(b2.getText().toString()))
                return false;
            else
                row1.add(b2.getText().toString());
        }
        if (!isTileEmpty(b3)) {
            if (row1.contains(b3.getText().toString()))
                return false;
            else
                row1.add(b3.getText().toString());
        }
        if (!isTileEmpty(c1)) {
            if (row1.contains(c1.getText().toString()))
                return false;
            else
                row1.add(c1.getText().toString());
        }
        if (!isTileEmpty(c2)) {
            if (row1.contains(c2.getText().toString()))
                return false;
            else
                row1.add(c2.getText().toString());
        }
        if (!isTileEmpty(c3)) {
            if (row1.contains(c3.getText().toString()))
                return false;
            else
                row1.add(c3.getText().toString());
        }
        row1.clear();
        return true;
    }
    private boolean fillRow2(){
        ArrayList<String> row = new ArrayList<>();
        row.clear();
        if (!isTileEmpty(a4)) {
            if (row.contains(a4.getText().toString()))
                return false;
            else
                row.add(a4.getText().toString());
        }
        if (!isTileEmpty(a5)) {
            if (row.contains(a5.getText().toString()))
                return false;
            else
                row.add(a5.getText().toString());
        }
        if (!isTileEmpty(a6)) {
            if (row.contains(a6.getText().toString()))
                return false;
            else
                row.add(a6.getText().toString());
        }
        if (!isTileEmpty(b4)) {
            if (row.contains(b4.getText().toString()))
                return false;
            else
                row.add(b4.getText().toString());
        }
        if (!isTileEmpty(b5)) {
            if (row.contains(b5.getText().toString()))
                return false;
            else
                row.add(b5.getText().toString());
        }
        if (!isTileEmpty(b6)) {
            if (row.contains(b6.getText().toString()))
                return false;
            else
                row.add(b6.getText().toString());
        }
        if (!isTileEmpty(c4)) {
            if (row.contains(c4.getText().toString()))
                return false;
            else
                row.add(c4.getText().toString());
        }
        if (!isTileEmpty(c5)) {
            if (row.contains(c5.getText().toString()))
                return false;
            else
                row.add(c5.getText().toString());
        }
        if (!isTileEmpty(c6)) {
            if (row.contains(c6.getText().toString()))
                return false;
            else
                row.add(c6.getText().toString());
        }
        row.clear();
        return true;
    }
    private boolean fillRow3(){
        ArrayList<String> row = new ArrayList<>();
        row.clear();

        if (!isTileEmpty(a7)) {
            if (row.contains(a7.getText().toString()))
                return false;
            else
                row.add(a7.getText().toString());
        }
        if (!isTileEmpty(a8)) {
            if (row.contains(a8.getText().toString()))
                return false;
            else
                row.add(a8.getText().toString());
        }

        if (!isTileEmpty(a9)) {
            if (row.contains(a9.getText().toString()))
                return false;
            else
                row.add(a9.getText().toString());
        }
        if (!isTileEmpty(b7)) {
            if (row.contains(b7.getText().toString()))
                return false;
            else
                row.add(b7.getText().toString());
        }

        if (!isTileEmpty(b8)) {
            if (row.contains(b8.getText().toString()))
                return false;
            else
                row.add(b8.getText().toString());
        }
        if (!isTileEmpty(b9)) {
            if (row.contains(b9.getText().toString()))
                return false;
            else
                row.add(b9.getText().toString());
        }
        if (!isTileEmpty(c7)) {
            if (row.contains(c7.getText().toString()))
                return false;
            else
                row.add(c7.getText().toString());
        }
        if (!isTileEmpty(c8)) {
            if (row.contains(c8.getText().toString()))
                return false;
            else
                row.add(c8.getText().toString());
        }
        if (!isTileEmpty(c9)) {
            if (row.contains(c9.getText().toString()))
                return false;
            else
                row.add(c9.getText().toString());
        }
        row.clear();
        return true;
    }

    private boolean fillCol1(){
        ArrayList<String> col = new ArrayList<>();
        col.clear();
        if (!isTileEmpty(a1)) {
            if (col.contains(a1.getText().toString()))
                return false;
            else
                col.add(a1.getText().toString());
        }
        if (!isTileEmpty(a4)) {
            if (col.contains(a4.getText().toString()))
                return false;
            else
                col.add(a4.getText().toString());
        }
        if (!isTileEmpty(a7)) {
            if (col.contains(a7.getText().toString()))
                return false;
            else
                col.add(a7.getText().toString());
        }
        if (!isTileEmpty(d1)) {
            if (col.contains(d1.getText().toString()))
                return false;
            else
                col.add(d1.getText().toString());
        }
        if (!isTileEmpty(d4)) {
            if (col.contains(d4.getText().toString()))
                return false;
            else
                col.add(d4.getText().toString());
        }
        if (!isTileEmpty(d7)) {
            if (col.contains(d7.getText().toString()))
                return false;
            else
                col.add(d7.getText().toString());
        }
        if (!isTileEmpty(g1)) {
            if (col.contains(g1.getText().toString()))
                return false;
            else
                col.add(g1.getText().toString());
        }
        if (!isTileEmpty(g4)) {
            if (col.contains(g4.getText().toString()))
                return false;
            else
                col.add(g4.getText().toString());
        }
        if (!isTileEmpty(g7)) {
            if (col.contains(g7.getText().toString()))
                return false;
            else
                col.add(g7.getText().toString());
        }
        col.clear();
        return true;
    }
    private boolean fillCol2(){
        ArrayList<String> col = new ArrayList<>();
        col.clear();

        if (!isTileEmpty(a2)) {
            if (col.contains(a2.getText().toString()))
                return false;
            else
                col.add(a2.getText().toString());
        }
        if (!isTileEmpty(a5)) {
            if (col.contains(a5.getText().toString()))
                return false;
            else
                col.add(a5.getText().toString());
        }
        if (!isTileEmpty(a8)) {
            if (col.contains(a8.getText().toString()))
                return false;
            else
                col.add(a8.getText().toString());
        }
        if (!isTileEmpty(d2)) {
            if (col.contains(d2.getText().toString()))
                return false;
            else
                col.add(d2.getText().toString());
        }
        if (!isTileEmpty(d5)) {
            if (col.contains(d5.getText().toString()))
                return false;
            else
                col.add(d5.getText().toString());
        }
        if (!isTileEmpty(d8)) {
            if (col.contains(d8.getText().toString()))
                return false;
            else
                col.add(d8.getText().toString());
        }
        if (!isTileEmpty(g2)) {
            if (col.contains(g2.getText().toString()))
                return false;
            else
                col.add(g2.getText().toString());
        }

        if (!isTileEmpty(g5)) {
            if (col.contains(g5.getText().toString()))
                return false;
            else
                col.add(g5.getText().toString());
        }

        if (!isTileEmpty(g8)) {
            if (col.contains(g8.getText().toString()))
                return false;
            else
                col.add(g8.getText().toString());
        }
        col.clear();
        return true;
    }
    private boolean fillCol3(){
        ArrayList<String> col = new ArrayList<>();
        col.clear();

        if (!isTileEmpty(a3)) {
            if (col.contains(a3.getText().toString()))
                return false;
            else
                col.add(a3.getText().toString());
        }
        if (!isTileEmpty(a6)) {
            if (col.contains(a6.getText().toString()))
                return false;
            else
                col.add(a6.getText().toString());
        }
        if (!isTileEmpty(a9)) {
            if (col.contains(a9.getText().toString()))
                return false;
            else
                col.add(a9.getText().toString());
        }
        if (!isTileEmpty(d3)) {
            if (col.contains(d3.getText().toString()))
                return false;
            else
                col.add(d3.getText().toString());
        }
        if (!isTileEmpty(d6)) {
            if (col.contains(d6.getText().toString()))
                return false;
            else
                col.add(d6.getText().toString());
        }
        if (!isTileEmpty(d9)) {
            if (col.contains(d9.getText().toString()))
                return false;
            else
                col.add(d9.getText().toString());
        }
        if (!isTileEmpty(g3)) {
            if (col.contains(g3.getText().toString()))
                return false;
            else
                col.add(g3.getText().toString());
        }
        if (!isTileEmpty(g6)) {
            if (col.contains(g6.getText().toString()))
                return false;
            else
                col.add(g6.getText().toString());
        }
        if (!isTileEmpty(g9)) {
            if (col.contains(g9.getText().toString()))
                return false;
            else
                col.add(g9.getText().toString());
        }
        col.clear();
        return true;
    }



    // return false if wrong answer occurs
    private boolean checkBlockA(){
        ArrayList<String> blockA = new ArrayList<>();
        blockA.clear();
        if(blockA.contains(a1.getText().toString()))
            return false;
        else
            blockA.add(a1.getText().toString());

        if(blockA.contains(a2.getText().toString()))
            return false;
        else
            blockA.add(a2.getText().toString());

        if(blockA.contains(a3.getText().toString()))
            return false;
        else
            blockA.add(a3.getText().toString());

        if(blockA.contains(a4.getText().toString()))
            return false;
        else
            blockA.add(a4.getText().toString());

        if(blockA.contains(a5.getText().toString()))
            return false;
        else
            blockA.add(a5.getText().toString());

        if(blockA.contains(a6.getText().toString()))
            return false;
        else
            blockA.add(a6.getText().toString());

        if(blockA.contains(a7.getText().toString()))
            return false;
        else
            blockA.add(a7.getText().toString());

        if(blockA.contains(a8.getText().toString()))
            return false;
        else
            blockA.add(a8.getText().toString());

        if(blockA.contains(a9.getText().toString()))
            return false;
        else
            blockA.add(a9.getText().toString());

        return true;
    }
    private boolean checkBlockB(){
        ArrayList<String> blockB = new ArrayList<>();
        blockB.clear();
        if(blockB.contains(b1.getText().toString()))
            return false;
        else
            blockB.add(b1.getText().toString());

        if(blockB.contains(b2.getText().toString()))
            return false;
        else
            blockB.add(b2.getText().toString());

        if(blockB.contains(b3.getText().toString()))
            return false;
        else
            blockB.add(b3.getText().toString());

        if(blockB.contains(b4.getText().toString()))
            return false;
        else
            blockB.add(b4.getText().toString());

        if(blockB.contains(b5.getText().toString()))
            return false;
        else
            blockB.add(b5.getText().toString());

        if(blockB.contains(b6.getText().toString()))
            return false;
        else
            blockB.add(b6.getText().toString());

        if(blockB.contains(b7.getText().toString()))
            return false;
        else
            blockB.add(b7.getText().toString());

        if(blockB.contains(b8.getText().toString()))
            return false;
        else
            blockB.add(b8.getText().toString());

        if(blockB.contains(b9.getText().toString()))
            return false;
        else
            blockB.add(b9.getText().toString());

        return true;
    }
    private boolean checkBlockC(){
        ArrayList<String> blockC = new ArrayList<>();
        blockC.clear();
        if(blockC.contains(c1.getText().toString()))
            return false;
        else
            blockC.add(c1.getText().toString());

        if(blockC.contains(c2.getText().toString()))
            return false;
        else
            blockC.add(c2.getText().toString());

        if(blockC.contains(c3.getText().toString()))
            return false;
        else
            blockC.add(c3.getText().toString());

        if(blockC.contains(c4.getText().toString()))
            return false;
        else
            blockC.add(c4.getText().toString());

        if(blockC.contains(c5.getText().toString()))
            return false;
        else
            blockC.add(c5.getText().toString());

        if(blockC.contains(c6.getText().toString()))
            return false;
        else
            blockC.add(c6.getText().toString());

        if(blockC.contains(c7.getText().toString()))
            return false;
        else
            blockC.add(c7.getText().toString());

        if(blockC.contains(c8.getText().toString()))
            return false;
        else
            blockC.add(c8.getText().toString());

        if(blockC.contains(c9.getText().toString()))
            return false;
        else
            blockC.add(c9.getText().toString());

        return true;
    }
    private boolean checkBlockD(){
        ArrayList<String> blockD = new ArrayList<>();
        blockD.clear();
        if(blockD.contains(d1.getText().toString()))
            return false;
        else
            blockD.add(d1.getText().toString());

        if(blockD.contains(d2.getText().toString()))
            return false;
        else
            blockD.add(d2.getText().toString());

        if(blockD.contains(d3.getText().toString()))
            return false;
        else
            blockD.add(d3.getText().toString());

        if(blockD.contains(d4.getText().toString()))
            return false;
        else
            blockD.add(d4.getText().toString());

        if(blockD.contains(d5.getText().toString()))
            return false;
        else
            blockD.add(d5.getText().toString());

        if(blockD.contains(d6.getText().toString()))
            return false;
        else
            blockD.add(d6.getText().toString());

        if(blockD.contains(d7.getText().toString()))
            return false;
        else
            blockD.add(d7.getText().toString());

        if(blockD.contains(d8.getText().toString()))
            return false;
        else
            blockD.add(d8.getText().toString());

        if(blockD.contains(d9.getText().toString()))
            return false;
        else
            blockD.add(d9.getText().toString());

        return true;
    }
    private boolean checkBlockE(){
        ArrayList<String> blockE = new ArrayList<>();
        blockE.clear();
        if(blockE.contains(e1.getText().toString()))
            return false;
        else
            blockE.add(e1.getText().toString());

        if(blockE.contains(e2.getText().toString()))
            return false;
        else
            blockE.add(e2.getText().toString());

        if(blockE.contains(e3.getText().toString()))
            return false;
        else
            blockE.add(e3.getText().toString());

        if(blockE.contains(e4.getText().toString()))
            return false;
        else
            blockE.add(e4.getText().toString());

        if(blockE.contains(e5.getText().toString()))
            return false;
        else
            blockE.add(e5.getText().toString());

        if(blockE.contains(e6.getText().toString()))
            return false;
        else
            blockE.add(e6.getText().toString());

        if(blockE.contains(e7.getText().toString()))
            return false;
        else
            blockE.add(e7.getText().toString());

        if(blockE.contains(e8.getText().toString()))
            return false;
        else
            blockE.add(e8.getText().toString());

        if(blockE.contains(e9.getText().toString()))
            return false;
        else
            blockE.add(e9.getText().toString());

        return true;
    }
    private boolean checkBlockF(){
        ArrayList<String> blockF = new ArrayList<>();
        blockF.clear();
        if(blockF.contains(f1.getText().toString()))
            return false;
        else
            blockF.add(f1.getText().toString());

        if(blockF.contains(f2.getText().toString()))
            return false;
        else
            blockF.add(f2.getText().toString());

        if(blockF.contains(f3.getText().toString()))
            return false;
        else
            blockF.add(f3.getText().toString());

        if(blockF.contains(f4.getText().toString()))
            return false;
        else
            blockF.add(f4.getText().toString());

        if(blockF.contains(f5.getText().toString()))
            return false;
        else
            blockF.add(f5.getText().toString());

        if(blockF.contains(f6.getText().toString()))
            return false;
        else
            blockF.add(f6.getText().toString());

        if(blockF.contains(f7.getText().toString()))
            return false;
        else
            blockF.add(f7.getText().toString());

        if(blockF.contains(f8.getText().toString()))
            return false;
        else
            blockF.add(f8.getText().toString());

        if(blockF.contains(f9.getText().toString()))
            return false;
        else
            blockF.add(f9.getText().toString());

        return true;
    }
    private boolean checkBlockG(){
        ArrayList<String> blockG = new ArrayList<>();
        blockG.clear();
        if(blockG.contains(g1.getText().toString()))
            return false;
        else
            blockG.add(g1.getText().toString());

        if(blockG.contains(g2.getText().toString()))
            return false;
        else
            blockG.add(g2.getText().toString());

        if(blockG.contains(g3.getText().toString()))
            return false;
        else
            blockG.add(g3.getText().toString());

        if(blockG.contains(g4.getText().toString()))
            return false;
        else
            blockG.add(g4.getText().toString());

        if(blockG.contains(g5.getText().toString()))
            return false;
        else
            blockG.add(g5.getText().toString());

        if(blockG.contains(g6.getText().toString()))
            return false;
        else
            blockG.add(g6.getText().toString());

        if(blockG.contains(g7.getText().toString()))
            return false;
        else
            blockG.add(g7.getText().toString());

        if(blockG.contains(g8.getText().toString()))
            return false;
        else
            blockG.add(g8.getText().toString());

        if(blockG.contains(g9.getText().toString()))
            return false;
        else
            blockG.add(g9.getText().toString());

        return true;
    }
    private boolean checkBlockH(){
        ArrayList<String> blockH = new ArrayList<>();
        blockH.clear();
        if(blockH.contains(h1.getText().toString()))
            return false;
        else
            blockH.add(h1.getText().toString());

        if(blockH.contains(h2.getText().toString()))
            return false;
        else
            blockH.add(h2.getText().toString());

        if(blockH.contains(h3.getText().toString()))
            return false;
        else
            blockH.add(h3.getText().toString());

        if(blockH.contains(h4.getText().toString()))
            return false;
        else
            blockH.add(h4.getText().toString());

        if(blockH.contains(h5.getText().toString()))
            return false;
        else
            blockH.add(h5.getText().toString());

        if(blockH.contains(h6.getText().toString()))
            return false;
        else
            blockH.add(h6.getText().toString());

        if(blockH.contains(h7.getText().toString()))
            return false;
        else
            blockH.add(h7.getText().toString());

        if(blockH.contains(h8.getText().toString()))
            return false;
        else
            blockH.add(h8.getText().toString());

        if(blockH.contains(h9.getText().toString()))
            return false;
        else
            blockH.add(h9.getText().toString());

        return true;
    }
    private boolean checkBlockI(){
        ArrayList<String> blockI = new ArrayList<>();
        blockI.clear();
        if(blockI.contains(i1.getText().toString()))
            return false;
        else
            blockI.add(i1.getText().toString());

        if(blockI.contains(i2.getText().toString()))
            return false;
        else
            blockI.add(i2.getText().toString());

        if(blockI.contains(i3.getText().toString()))
            return false;
        else
            blockI.add(i3.getText().toString());

        if(blockI.contains(i4.getText().toString()))
            return false;
        else
            blockI.add(i4.getText().toString());

        if(blockI.contains(i5.getText().toString()))
            return false;
        else
            blockI.add(i5.getText().toString());

        if(blockI.contains(i6.getText().toString()))
            return false;
        else
            blockI.add(i6.getText().toString());

        if(blockI.contains(i7.getText().toString()))
            return false;
        else
            blockI.add(i7.getText().toString());

        if(blockI.contains(i8.getText().toString()))
            return false;
        else
            blockI.add(i8.getText().toString());

        if(blockI.contains(i9.getText().toString()))
            return false;
        else
            blockI.add(i9.getText().toString());

        return true;
    }

    private boolean checkRow1(){
        ArrayList<String> row1 = new ArrayList<>();
        row1.clear();

        if(row1.contains(a1.getText().toString()))
            return false;
        else
            row1.add(a1.getText().toString());

        if(row1.contains(a2.getText().toString()))
            return false;
        else
            row1.add(a2.getText().toString());

        if(row1.contains(a3.getText().toString()))
            return false;
        else
            row1.add(a3.getText().toString());

        if(row1.contains(b1.getText().toString()))
            return false;
        else
            row1.add(b1.getText().toString());

        if(row1.contains(b2.getText().toString()))
            return false;
        else
            row1.add(b2.getText().toString());

        if(row1.contains(b3.getText().toString()))
            return false;
        else
            row1.add(b3.getText().toString());

        if(row1.contains(c1.getText().toString()))
            return false;
        else
            row1.add(c1.getText().toString());

        if(row1.contains(c2.getText().toString()))
            return false;
        else
            row1.add(c2.getText().toString());

        if(row1.contains(c3.getText().toString()))
            return false;
        else
            row1.add(c3.getText().toString());

        return true;
    }
    private boolean checkRow2(){
        ArrayList<String> row = new ArrayList<>();
        row.clear();

        if(row.contains(a4.getText().toString()))
            return false;
        else
            row.add(a4.getText().toString());

        if(row.contains(a5.getText().toString()))
            return false;
        else
            row.add(a5.getText().toString());

        if(row.contains(a6.getText().toString()))
            return false;
        else
            row.add(a6.getText().toString());

        if(row.contains(b4.getText().toString()))
            return false;
        else
            row.add(b4.getText().toString());

        if(row.contains(b5.getText().toString()))
            return false;
        else
            row.add(b5.getText().toString());

        if(row.contains(b6.getText().toString()))
            return false;
        else
            row.add(b6.getText().toString());

        if(row.contains(c4.getText().toString()))
            return false;
        else
            row.add(c4.getText().toString());

        if(row.contains(c5.getText().toString()))
            return false;
        else
            row.add(c5.getText().toString());

        if(row.contains(c6.getText().toString()))
            return false;
        else
            row.add(c6.getText().toString());

        return true;
    }
    private boolean checkRow3(){
        ArrayList<String> row = new ArrayList<>();
        row.clear();

        if(row.contains(a7.getText().toString()))
            return false;
        else
            row.add(a7.getText().toString());

        if(row.contains(a8.getText().toString()))
            return false;
        else
            row.add(a8.getText().toString());

        if(row.contains(a9.getText().toString()))
            return false;
        else
            row.add(a9.getText().toString());

        if(row.contains(b7.getText().toString()))
            return false;
        else
            row.add(b7.getText().toString());

        if(row.contains(b8.getText().toString()))
            return false;
        else
            row.add(b8.getText().toString());

        if(row.contains(b9.getText().toString()))
            return false;
        else
            row.add(b9.getText().toString());

        if(row.contains(c7.getText().toString()))
            return false;
        else
            row.add(c7.getText().toString());

        if(row.contains(c8.getText().toString()))
            return false;
        else
            row.add(c8.getText().toString());

        if(row.contains(c9.getText().toString()))
            return false;
        else
            row.add(c9.getText().toString());

        return true;
    }
    private boolean checkRow4(){
        ArrayList<String> row = new ArrayList<>();
        row.clear();

        if(row.contains(d1.getText().toString()))
            return false;
        else
            row.add(d1.getText().toString());

        if(row.contains(d2.getText().toString()))
            return false;
        else
            row.add(d2.getText().toString());

        if(row.contains(d3.getText().toString()))
            return false;
        else
            row.add(d3.getText().toString());

        if(row.contains(e1.getText().toString()))
            return false;
        else
            row.add(e1.getText().toString());

        if(row.contains(e2.getText().toString()))
            return false;
        else
            row.add(e2.getText().toString());

        if(row.contains(e3.getText().toString()))
            return false;
        else
            row.add(e3.getText().toString());

        if(row.contains(f1.getText().toString()))
            return false;
        else
            row.add(f1.getText().toString());

        if(row.contains(f2.getText().toString()))
            return false;
        else
            row.add(f2.getText().toString());

        if(row.contains(f3.getText().toString()))
            return false;
        else
            row.add(f3.getText().toString());

        return true;
    }
    private boolean checkRow5(){
        ArrayList<String> row = new ArrayList<>();
        row.clear();

        if(row.contains(d4.getText().toString()))
            return false;
        else
            row.add(d4.getText().toString());

        if(row.contains(d5.getText().toString()))
            return false;
        else
            row.add(d5.getText().toString());

        if(row.contains(d6.getText().toString()))
            return false;
        else
            row.add(d6.getText().toString());

        if(row.contains(e4.getText().toString()))
            return false;
        else
            row.add(e4.getText().toString());

        if(row.contains(e5.getText().toString()))
            return false;
        else
            row.add(e5.getText().toString());

        if(row.contains(e6.getText().toString()))
            return false;
        else
            row.add(e6.getText().toString());

        if(row.contains(f4.getText().toString()))
            return false;
        else
            row.add(f4.getText().toString());

        if(row.contains(f5.getText().toString()))
            return false;
        else
            row.add(f5.getText().toString());

        if(row.contains(f6.getText().toString()))
            return false;
        else
            row.add(f6.getText().toString());

        return true;
    }
    private boolean checkRow6(){
        ArrayList<String> row = new ArrayList<>();
        row.clear();

        if(row.contains(d7.getText().toString()))
            return false;
        else
            row.add(d7.getText().toString());

        if(row.contains(d8.getText().toString()))
            return false;
        else
            row.add(d8.getText().toString());

        if(row.contains(d9.getText().toString()))
            return false;
        else
            row.add(d9.getText().toString());

        if(row.contains(e7.getText().toString()))
            return false;
        else
            row.add(e7.getText().toString());

        if(row.contains(e8.getText().toString()))
            return false;
        else
            row.add(e8.getText().toString());

        if(row.contains(e9.getText().toString()))
            return false;
        else
            row.add(e9.getText().toString());

        if(row.contains(f7.getText().toString()))
            return false;
        else
            row.add(f7.getText().toString());

        if(row.contains(f8.getText().toString()))
            return false;
        else
            row.add(f8.getText().toString());

        if(row.contains(f9.getText().toString()))
            return false;
        else
            row.add(f9.getText().toString());

        return true;
    }
    private boolean checkRow7(){
        ArrayList<String> row = new ArrayList<>();
        row.clear();

        if(row.contains(g1.getText().toString()))
            return false;
        else
            row.add(g1.getText().toString());

        if(row.contains(g2.getText().toString()))
            return false;
        else
            row.add(g2.getText().toString());

        if(row.contains(g3.getText().toString()))
            return false;
        else
            row.add(g3.getText().toString());

        if(row.contains(h1.getText().toString()))
            return false;
        else
            row.add(h1.getText().toString());

        if(row.contains(h2.getText().toString()))
            return false;
        else
            row.add(h2.getText().toString());

        if(row.contains(h3.getText().toString()))
            return false;
        else
            row.add(h3.getText().toString());

        if(row.contains(i1.getText().toString()))
            return false;
        else
            row.add(i1.getText().toString());

        if(row.contains(i2.getText().toString()))
            return false;
        else
            row.add(i2.getText().toString());

        if(row.contains(i3.getText().toString()))
            return false;
        else
            row.add(i3.getText().toString());

        return true;
    }
    private boolean checkRow8(){
        ArrayList<String> row = new ArrayList<>();
        row.clear();

        if(row.contains(g4.getText().toString()))
            return false;
        else
            row.add(g4.getText().toString());

        if(row.contains(g5.getText().toString()))
            return false;
        else
            row.add(g5.getText().toString());

        if(row.contains(g6.getText().toString()))
            return false;
        else
            row.add(g6.getText().toString());

        if(row.contains(h4.getText().toString()))
            return false;
        else
            row.add(h4.getText().toString());

        if(row.contains(h5.getText().toString()))
            return false;
        else
            row.add(h5.getText().toString());

        if(row.contains(h6.getText().toString()))
            return false;
        else
            row.add(h6.getText().toString());

        if(row.contains(i4.getText().toString()))
            return false;
        else
            row.add(i4.getText().toString());

        if(row.contains(i5.getText().toString()))
            return false;
        else
            row.add(i5.getText().toString());

        if(row.contains(i6.getText().toString()))
            return false;
        else
            row.add(i6.getText().toString());

        return true;
    }
    private boolean checkRow9(){
        ArrayList<String> row = new ArrayList<>();
        row.clear();

        if(row.contains(g7.getText().toString()))
            return false;
        else
            row.add(g7.getText().toString());

        if(row.contains(g8.getText().toString()))
            return false;
        else
            row.add(g8.getText().toString());

        if(row.contains(g9.getText().toString()))
            return false;
        else
            row.add(g9.getText().toString());

        if(row.contains(h7.getText().toString()))
            return false;
        else
            row.add(h7.getText().toString());

        if(row.contains(h8.getText().toString()))
            return false;
        else
            row.add(h8.getText().toString());

        if(row.contains(h9.getText().toString()))
            return false;
        else
            row.add(h9.getText().toString());

        if(row.contains(i7.getText().toString()))
            return false;
        else
            row.add(i7.getText().toString());

        if(row.contains(i8.getText().toString()))
            return false;
        else
            row.add(i8.getText().toString());

        if(row.contains(i9.getText().toString()))
            return false;
        else
            row.add(i9.getText().toString());

        return true;
    }

    private boolean checkCol1(){
        ArrayList<String> col = new ArrayList<>();
        col.clear();

        if(col.contains(a1.getText().toString()))
            return false;
        else
            col.add(a1.getText().toString());

        if(col.contains(a4.getText().toString()))
            return false;
        else
            col.add(a4.getText().toString());

        if(col.contains(a7.getText().toString()))
            return false;
        else
            col.add(a7.getText().toString());

        if(col.contains(d1.getText().toString()))
            return false;
        else
            col.add(d1.getText().toString());

        if(col.contains(d4.getText().toString()))
            return false;
        else
            col.add(d4.getText().toString());

        if(col.contains(d7.getText().toString()))
            return false;
        else
            col.add(d7.getText().toString());

        if(col.contains(g1.getText().toString()))
            return false;
        else
            col.add(g1.getText().toString());

        if(col.contains(g4.getText().toString()))
            return false;
        else
            col.add(g4.getText().toString());

        if(col.contains(g7.getText().toString()))
            return false;
        else
            col.add(g7.getText().toString());

        return true;
    }
    private boolean checkCol2(){
        ArrayList<String> col = new ArrayList<>();
        col.clear();

        if(col.contains(a2.getText().toString()))
            return false;
        else
            col.add(a2.getText().toString());

        if(col.contains(a5.getText().toString()))
            return false;
        else
            col.add(a5.getText().toString());

        if(col.contains(a8.getText().toString()))
            return false;
        else
            col.add(a8.getText().toString());

        if(col.contains(d2.getText().toString()))
            return false;
        else
            col.add(d2.getText().toString());

        if(col.contains(d5.getText().toString()))
            return false;
        else
            col.add(d5.getText().toString());

        if(col.contains(d8.getText().toString()))
            return false;
        else
            col.add(d8.getText().toString());

        if(col.contains(g2.getText().toString()))
            return false;
        else
            col.add(g2.getText().toString());

        if(col.contains(g5.getText().toString()))
            return false;
        else
            col.add(g5.getText().toString());

        if(col.contains(g8.getText().toString()))
            return false;
        else
            col.add(g8.getText().toString());

        return true;
    }
    private boolean checkCol3(){
        ArrayList<String> col = new ArrayList<>();
        col.clear();

        if(col.contains(a3.getText().toString()))
            return false;
        else
            col.add(a3.getText().toString());

        if(col.contains(a6.getText().toString()))
            return false;
        else
            col.add(a6.getText().toString());

        if(col.contains(a9.getText().toString()))
            return false;
        else
            col.add(a9.getText().toString());

        if(col.contains(d3.getText().toString()))
            return false;
        else
            col.add(d3.getText().toString());

        if(col.contains(d6.getText().toString()))
            return false;
        else
            col.add(d6.getText().toString());

        if(col.contains(d9.getText().toString()))
            return false;
        else
            col.add(d9.getText().toString());

        if(col.contains(g3.getText().toString()))
            return false;
        else
            col.add(g3.getText().toString());

        if(col.contains(g6.getText().toString()))
            return false;
        else
            col.add(g6.getText().toString());

        if(col.contains(g9.getText().toString()))
            return false;
        else
            col.add(g9.getText().toString());

        return true;
    }
    private boolean checkCol4(){
        ArrayList<String> col = new ArrayList<>();
        col.clear();

        if(col.contains(b1.getText().toString()))
            return false;
        else
            col.add(b1.getText().toString());

        if(col.contains(b4.getText().toString()))
            return false;
        else
            col.add(b4.getText().toString());

        if(col.contains(b7.getText().toString()))
            return false;
        else
            col.add(b7.getText().toString());

        if(col.contains(e1.getText().toString()))
            return false;
        else
            col.add(e1.getText().toString());

        if(col.contains(e4.getText().toString()))
            return false;
        else
            col.add(e4.getText().toString());

        if(col.contains(e7.getText().toString()))
            return false;
        else
            col.add(e7.getText().toString());

        if(col.contains(h1.getText().toString()))
            return false;
        else
            col.add(h1.getText().toString());

        if(col.contains(h4.getText().toString()))
            return false;
        else
            col.add(h4.getText().toString());

        if(col.contains(h7.getText().toString()))
            return false;
        else
            col.add(h7.getText().toString());

        return true;
    }
    private boolean checkCol5(){
        ArrayList<String> col = new ArrayList<>();
        col.clear();

        if(col.contains(b2.getText().toString()))
            return false;
        else
            col.add(b2.getText().toString());

        if(col.contains(b5.getText().toString()))
            return false;
        else
            col.add(b5.getText().toString());

        if(col.contains(b8.getText().toString()))
            return false;
        else
            col.add(b8.getText().toString());

        if(col.contains(e2.getText().toString()))
            return false;
        else
            col.add(e2.getText().toString());

        if(col.contains(e5.getText().toString()))
            return false;
        else
            col.add(e5.getText().toString());

        if(col.contains(e8.getText().toString()))
            return false;
        else
            col.add(e8.getText().toString());

        if(col.contains(h2.getText().toString()))
            return false;
        else
            col.add(h2.getText().toString());

        if(col.contains(h5.getText().toString()))
            return false;
        else
            col.add(h5.getText().toString());

        if(col.contains(h8.getText().toString()))
            return false;
        else
            col.add(h8.getText().toString());

        return true;
    }
    private boolean checkCol6(){
        ArrayList<String> col = new ArrayList<>();
        col.clear();

        if(col.contains(b3.getText().toString()))
            return false;
        else
            col.add(b3.getText().toString());

        if(col.contains(b6.getText().toString()))
            return false;
        else
            col.add(b6.getText().toString());

        if(col.contains(b9.getText().toString()))
            return false;
        else
            col.add(b9.getText().toString());

        if(col.contains(e3.getText().toString()))
            return false;
        else
            col.add(e3.getText().toString());

        if(col.contains(e6.getText().toString()))
            return false;
        else
            col.add(e6.getText().toString());

        if(col.contains(e9.getText().toString()))
            return false;
        else
            col.add(e9.getText().toString());

        if(col.contains(h3.getText().toString()))
            return false;
        else
            col.add(h3.getText().toString());

        if(col.contains(h6.getText().toString()))
            return false;
        else
            col.add(h6.getText().toString());

        if(col.contains(h9.getText().toString()))
            return false;
        else
            col.add(h9.getText().toString());

        return true;
    }
    private boolean checkCol7(){
        ArrayList<String> col = new ArrayList<>();
        col.clear();

        if(col.contains(c1.getText().toString()))
            return false;
        else
            col.add(c1.getText().toString());

        if(col.contains(c4.getText().toString()))
            return false;
        else
            col.add(c4.getText().toString());

        if(col.contains(c7.getText().toString()))
            return false;
        else
            col.add(c7.getText().toString());

        if(col.contains(f1.getText().toString()))
            return false;
        else
            col.add(f1.getText().toString());

        if(col.contains(f4.getText().toString()))
            return false;
        else
            col.add(f4.getText().toString());

        if(col.contains(f7.getText().toString()))
            return false;
        else
            col.add(f7.getText().toString());

        if(col.contains(i1.getText().toString()))
            return false;
        else
            col.add(i1.getText().toString());

        if(col.contains(i4.getText().toString()))
            return false;
        else
            col.add(i4.getText().toString());

        if(col.contains(i7.getText().toString()))
            return false;
        else
            col.add(i7.getText().toString());

        return true;
    }
    private boolean checkCol8(){
        ArrayList<String> col = new ArrayList<>();
        col.clear();

        if(col.contains(c2.getText().toString()))
            return false;
        else
            col.add(c2.getText().toString());

        if(col.contains(c5.getText().toString()))
            return false;
        else
            col.add(c5.getText().toString());

        if(col.contains(c8.getText().toString()))
            return false;
        else
            col.add(c8.getText().toString());

        if(col.contains(f2.getText().toString()))
            return false;
        else
            col.add(f2.getText().toString());

        if(col.contains(f5.getText().toString()))
            return false;
        else
            col.add(f5.getText().toString());

        if(col.contains(f8.getText().toString()))
            return false;
        else
            col.add(f8.getText().toString());

        if(col.contains(i2.getText().toString()))
            return false;
        else
            col.add(i2.getText().toString());

        if(col.contains(i5.getText().toString()))
            return false;
        else
            col.add(i5.getText().toString());

        if(col.contains(i8.getText().toString()))
            return false;
        else
            col.add(i8.getText().toString());

        return true;
    }
    private boolean checkCol9(){
        ArrayList<String> col = new ArrayList<>();
        col.clear();

        if(col.contains(c3.getText().toString()))
            return false;
        else
            col.add(c3.getText().toString());

        if(col.contains(c6.getText().toString()))
            return false;
        else
            col.add(c6.getText().toString());

        if(col.contains(c9.getText().toString()))
            return false;
        else
            col.add(c9.getText().toString());

        if(col.contains(f3.getText().toString()))
            return false;
        else
            col.add(f3.getText().toString());

        if(col.contains(f6.getText().toString()))
            return false;
        else
            col.add(f6.getText().toString());

        if(col.contains(f9.getText().toString()))
            return false;
        else
            col.add(f9.getText().toString());

        if(col.contains(i3.getText().toString()))
            return false;
        else
            col.add(i3.getText().toString());

        if(col.contains(i6.getText().toString()))
            return false;
        else
            col.add(i6.getText().toString());

        if(col.contains(i9.getText().toString()))
            return false;
        else
            col.add(i9.getText().toString());

        return true;
    }

    private boolean checkWin(){

        Log.i(TAG,"????: " + b1.getText().toString());
        if(!checkBlockA()){
            Toast.makeText(MainActivity.this, "BlockA",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"BA");
        }
        if(!checkBlockB()){
            Toast.makeText(MainActivity.this, "CheckBlockB",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"CheckBlockB");
        }
        if(!checkBlockC()){
            Toast.makeText(MainActivity.this, "CheckBlockC",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"CheckBlockC");
        }
        if(!checkBlockD()){
            Toast.makeText(MainActivity.this, "checkBlockD",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkBlockD");
        }
        if(!checkBlockE()){
            Toast.makeText(MainActivity.this, "checkBlockE",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkBlockE");
        }
        if(!checkBlockF()){
            Toast.makeText(MainActivity.this, "checkBlockF",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkBlockF");
        }
        if(!checkBlockG()){
            Toast.makeText(MainActivity.this, "checkBlockG",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkBlockG");
        }
        if(!checkBlockH()){
            Toast.makeText(MainActivity.this, "checkBlockH",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkBlockH");
        }
        if(!checkBlockI()){
            Toast.makeText(MainActivity.this, "checkBlockI",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkBlockI");
        }
        if(!checkRow1()){
            Toast.makeText(MainActivity.this, "checkRow1",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkRow1");
        }
        if(!checkRow2()){
            Toast.makeText(MainActivity.this, "checkRow2",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkRow2");
        }
        if(!checkRow3()){
            Toast.makeText(MainActivity.this, "checkRow3",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkRow3");
        }
        if(!checkRow4()){
            Toast.makeText(MainActivity.this, "checkRow4",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkRow4");
        }
        if(!checkRow5()){
            Toast.makeText(MainActivity.this, "checkRow5",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkRow5");
        }
        if(!checkRow6()){
            Toast.makeText(MainActivity.this, "checkRow6",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkRow6");
        }
        if(!checkRow7()){
            Toast.makeText(MainActivity.this, "checkRow7",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkRow7");
        }
        if(!checkRow8()){
            Toast.makeText(MainActivity.this, "checkRow8",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkRow8");
        }
        if(!checkRow9()){
            Toast.makeText(MainActivity.this, "checkRow9",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkRow9");
        }
        if(!checkCol1()){
            Toast.makeText(MainActivity.this, "checkCol1",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkCol1");
        }
        if(!checkCol2()){
            Toast.makeText(MainActivity.this, "checkCol2",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkCol2");
        }
        if(!checkCol3()){
            Toast.makeText(MainActivity.this, "checkCol3",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkCol3");
        }
        if(!checkCol4()){
            Toast.makeText(MainActivity.this, "checkCol4",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkCol4");
        }
        if(!checkCol5()){
            Toast.makeText(MainActivity.this, "checkCol5",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkCol5");
        }
        if(!checkCol6()){
            Toast.makeText(MainActivity.this, "checkCol6",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkCol6");
        }
        if(!checkCol7()){
            Toast.makeText(MainActivity.this, "checkCol7",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkCol7");
        }
        if(!checkCol8()){
            Toast.makeText(MainActivity.this, "checkCol8",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkCol8");
        }
        if(!checkCol9()){
            Toast.makeText(MainActivity.this, "checkCol9",Toast.LENGTH_SHORT).show();
            Log.i(TAG,"checkCol9");
        }



        return checkBlockA() && checkBlockB() && checkBlockC() && checkBlockD() && checkBlockE() && checkBlockF() && checkBlockG() && checkBlockH() && checkBlockI() &&
                checkRow1() && checkRow2() && checkRow3() && checkRow4() && checkRow5() && checkRow6() && checkRow7() && checkRow8() && checkRow9() &&
                checkCol1() && checkCol2() && checkCol3() && checkCol4() && checkCol5() && checkCol6() && checkCol7() && checkCol8() && checkCol9();
    }

////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
