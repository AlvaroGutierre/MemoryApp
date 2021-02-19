package com.diego_saez.memory.classes;

import com.diego_saez.memory.MyApplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Scores extends RealmObject {
    @PrimaryKey
    private int id;
    @Required
    private Integer score;
    @Required
    private String name;

    public Scores() {}

    public Scores(Integer score, String name) {
        this.id = MyApplication.scoreId.incrementAndGet();
        this.score = score;
        this.name = name;
    }

    public Scores(Integer score) {
        this.id = MyApplication.scoreId.incrementAndGet();
        this.score = score;
        this.name = "Anonymous";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getScore() {
        return this.score;
    }

    public String getName() {
        return this.name;
    }

}
