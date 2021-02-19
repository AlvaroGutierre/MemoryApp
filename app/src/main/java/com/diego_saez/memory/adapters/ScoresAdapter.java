package com.diego_saez.memory.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.diego_saez.memory.classes.Scores;
import com.diego_saez.memory.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import io.realm.RealmResults;

public class ScoresAdapter extends RecyclerView.Adapter<ScoresAdapter.ScoreHolder> {
    private RealmResults<Scores> scoreList;

    public ScoresAdapter(RealmResults<Scores> listaPuntuaciones){
        this.scoreList = listaPuntuaciones;
    }

    @NonNull
    @Override
    public ScoreHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_score, parent, false);
        return new ScoreHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ScoreHolder holder, final int position) {
        holder.assignData(scoreList.get(position));
    }

    @Override
    public int getItemCount() {

        return scoreList.size();
    }

    public class ScoreHolder extends RecyclerView.ViewHolder {

        TextView name, score;

        public ScoreHolder(@NonNull  View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.txtItemName);
            score = (TextView) itemView.findViewById(R.id.txtItemScore);
        }

        public void assignData( Scores score) {
            this.name.setText(score.getName());
            this.score.setText(score.getScore().toString());
        }

    }
}
