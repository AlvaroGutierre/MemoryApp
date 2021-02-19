package com.diego_saez.memory.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.diego_saez.memory.R;
import com.diego_saez.memory.classes.Scores;
import com.diego_saez.memory.classes.Table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;

import io.realm.Realm;
import io.realm.RealmResults;

public class GameNActivity extends AppCompatActivity {

    Realm realm;
    RealmResults<Scores> realmScores;

    Table table;

    TextView tvTimer;
    int time;

    ImageButton btn1, btn2, btn3, btn4,
                btn5, btn6, btn7, btn8,
                btn9, btn10, btn11, btn12,
                btn13, btn14, btn15, btn16;
    ArrayList<ImageButton> imageButtons;
    ArrayList<Integer> cardsList;

    Intent intentMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_n);


        realm = Realm.getDefaultInstance();
        realmScores = realm.where(Scores.class).findAll();

        intentMain = new Intent(this,MainActivity.class);

        timer();

        cardsList = new ArrayList<Integer>(Arrays.asList(
                R.id.card200,R.id.card201,R.id.card202,R.id.card203,
                R.id.card210,R.id.card211,R.id.card212,R.id.card213,
                R.id.card220,R.id.card221,R.id.card222,R.id.card223,
                R.id.card230,R.id.card231,R.id.card232,R.id.card233));

        Collections.shuffle(cardsList);

        btn1 = (ImageButton) findViewById(cardsList.get(0));
        btn2 = (ImageButton) findViewById(cardsList.get(1));
        btn3 = (ImageButton) findViewById(cardsList.get(2));
        btn4 = (ImageButton) findViewById(cardsList.get(3));
        btn5 = (ImageButton) findViewById(cardsList.get(4));
        btn6 = (ImageButton) findViewById(cardsList.get(5));
        btn7 = (ImageButton) findViewById(cardsList.get(6));
        btn8 = (ImageButton) findViewById(cardsList.get(7));
        btn9 = (ImageButton) findViewById(cardsList.get(8));
        btn10 = (ImageButton) findViewById(cardsList.get(9));
        btn11 = (ImageButton) findViewById(cardsList.get(10));
        btn12 = (ImageButton) findViewById(cardsList.get(11));
        btn13 = (ImageButton) findViewById(cardsList.get(12));
        btn14 = (ImageButton) findViewById(cardsList.get(13));
        btn15 = (ImageButton) findViewById(cardsList.get(14));
        btn16 = (ImageButton) findViewById(cardsList.get(15));

        imageButtons = new ArrayList<ImageButton>(Arrays.asList(
                btn1, btn2, btn3, btn4,
                btn5, btn6, btn7, btn8,
                btn9, btn10, btn11, btn12,
                btn13, btn14, btn15, btn16));

        table = new Table(imageButtons);

        imageButtons.get(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(0), 0);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(1), 1);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(2), 2);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(3), 3);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(4), 4);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(5), 5);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(6), 6);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(7), 7);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(8), 8);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(9), 9);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(10), 10);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(11),11);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(12),12);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(13),13);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(14),14);
                if (table.isGameWon()){ setWin(); }
            }
        });
        imageButtons.get(15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setImageWithTag(imageButtons.get(15),15);
                if (table.isGameWon()){ setWin(); }
            }
        });

    }

    private void timer() {
        tvTimer = (TextView) findViewById(R.id.txtTimerN);
        time = 0;
        Timer T = new Timer();
        T.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        tvTimer.setText(Integer.toString(time));
                        time++;
                    }
                });
            }
        }, 1000, 1000);
    }

    private void setWin(){
        String score = (tvTimer.getText().toString());
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.text_winTitle);

        View viewInflated = LayoutInflater.from(this).inflate(R.layout.contextmenu_end, null);
        builder.setView(viewInflated);

        final EditText etName = (EditText) viewInflated.findViewById((R.id.etName));
        final TextView tvFinalScore = (TextView) viewInflated.findViewById(R.id.tvFinalScore);

        // Establezco puntuación final
        int finalScore = (1000 / (Integer.parseInt(score)) * 100);
        tvFinalScore.setText(Integer.toString(finalScore));

        Editable name = etName.getText();

        builder.setNeutralButton(R.string.text_winSaveRecord, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {

                Scores score;
                realm.beginTransaction();
                if(name.toString() == ""){
                    score = new Scores(finalScore);
                }else{
                    score = new Scores(finalScore, name.toString());
                }

                realm.copyToRealm(score);
                realm.commitTransaction();

                startActivity(intentMain);
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();

    }

}