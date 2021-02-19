package com.diego_saez.memory.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.diego_saez.memory.R;
import com.diego_saez.memory.adapters.ScoresAdapter;
import com.diego_saez.memory.classes.Scores;
import com.diego_saez.memory.fragments.CardsFFragment;

import java.util.Timer;
import java.util.TimerTask;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    Button btnPlay;
    Button btnLevel;
    Button btnCredits;
    String levelText;

    RecyclerView scoreRecycler;
    ScoresAdapter scoresAdapter;
    Realm realm;
    RealmResults<Scores> scoresList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnLevel = (Button) findViewById(R.id.btnLevel);
        btnCredits = (Button) findViewById(R.id.btnCredits);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                levelText = btnLevel.getText().toString();
                if (levelText == getString(R.string.btn_NivelF)) {
                    intent = new Intent(MainActivity.this, GameFActivity.class);
                    startActivity(intent);
                } else if(levelText == getString(R.string.btn_NivelN)) {
                    intent = new Intent(MainActivity.this, GameNActivity.class);
                    startActivity(intent);
                } else {
                    intent = new Intent(MainActivity.this, GameDActivity.class);
                    startActivity(intent);
                }
            }
        });

        realm = Realm.getDefaultInstance();

        scoresList = realm.where(Scores.class).findAll();

        scoresAdapter = new ScoresAdapter(scoresList);
        Context context = getApplicationContext();
        scoreRecycler = (RecyclerView) findViewById(R.id.rvScores);
        scoreRecycler.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false));
        scoreRecycler.setAdapter(scoresAdapter);

        scoresList.addChangeListener(new RealmChangeListener<RealmResults<Scores>>() {
            @Override
            public void onChange(RealmResults<Scores> score) {

                scoresAdapter.notifyDataSetChanged();
            }
        });

        btnLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnLevel.getText() == getString(R.string.btn_NivelF)){
                    btnLevel.setText(getString(R.string.btn_NivelN));
                }else if(btnLevel.getText() == getString(R.string.btn_NivelN)){
                    btnLevel.setText(getString(R.string.btn_NivelD));
                } else{
                    btnLevel.setText(getString(R.string.btn_NivelF));
                }
            }
        });

        btnCredits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToCredits = new Intent(MainActivity.this, CreditsActivity.class);
                startActivity(intentToCredits);
            }
        });

    }



}