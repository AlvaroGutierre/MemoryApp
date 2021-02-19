package com.diego_saez.memory.classes;

import android.os.Handler;
import android.widget.ImageButton;

import com.diego_saez.memory.R;

import java.util.ArrayList;

public class Table {

    ArrayList<String> cards;
    ArrayList<ImageButton> imageButtons;
    int clicked1Position, clicked2Position, numOfClicked11, numOfClicked22, numOfCards;
    String numOfClicked1, numOfClicked2, tag1, tag2;
    ImageButton card1, card2;
    boolean isFirstCard, isGameWon;
    
    public Table(ArrayList<ImageButton> imageButtons){
        ArrayList<String> tmpCards = new ArrayList<String>();
        int sizeOfButtonsList, positionToAdd;
        String positionToAddToString;
        sizeOfButtonsList = (imageButtons.size() + 1);
        positionToAdd = 100;

        //Lista de numeros que iran asociados a las diferentes cartas para compararlo con sus imagenes
        for(int i = 1;i<sizeOfButtonsList;i++){
            positionToAdd++;
            if(i < (sizeOfButtonsList/2)+1){
                positionToAddToString = Integer.toString(positionToAdd);
                tmpCards.add(positionToAddToString);
            }else if(i == (sizeOfButtonsList/2)+1){
                positionToAddToString = "201";
                tmpCards.add(positionToAddToString);
                positionToAdd = 201;
            }else{
                positionToAddToString = Integer.toString(positionToAdd);
                tmpCards.add(positionToAddToString);
            }
        }

        this.cards = tmpCards;

        for(int i=0;i<imageButtons.size();i++){
            imageButtons.get(i).setTag(this.cards.get(i));
        }

        this.imageButtons = imageButtons;
        isFirstCard = true;
        numOfCards = this.cards.size();
        isGameWon = false;

    }

    public void setImageWithTag(ImageButton btn, int positionClicked){
        boolean isEnabled = btn.isEnabled();
        if(isEnabled) {

            if (numOfCards == 12) {
                if (this.cards.get(positionClicked).equals("101") || this.cards.get(positionClicked).equals("201") ) { imageButtons.get(positionClicked).setImageResource(R.drawable.abeja);
                } else if (this.cards.get(positionClicked).equals("102") || this.cards.get(positionClicked).equals("202")) { imageButtons.get(positionClicked).setImageResource(R.drawable.conejo);
                } else if (this.cards.get(positionClicked).equals("103") || this.cards.get(positionClicked).equals("203")) { imageButtons.get(positionClicked).setImageResource(R.drawable.elefante);
                } else if (this.cards.get(positionClicked).equals("104") || this.cards.get(positionClicked).equals("204")) { imageButtons.get(positionClicked).setImageResource(R.drawable.erizo);
                } else if (this.cards.get(positionClicked).equals("105") || this.cards.get(positionClicked).equals("205")) { imageButtons.get(positionClicked).setImageResource(R.drawable.flamenco);
                } else if (this.cards.get(positionClicked).equals("106") || this.cards.get(positionClicked).equals("206")) { imageButtons.get(positionClicked).setImageResource(R.drawable.pajaro);
                }
            } else if (numOfCards == 16) {
                if (this.cards.get(positionClicked).equals("101") || this.cards.get(positionClicked).equals("201") ) { imageButtons.get(positionClicked).setImageResource(R.drawable.abeja);
                } else if (this.cards.get(positionClicked).equals("102") || this.cards.get(positionClicked).equals("202")) { imageButtons.get(positionClicked).setImageResource(R.drawable.conejo);
                } else if (this.cards.get(positionClicked).equals("103") || this.cards.get(positionClicked).equals("203")) { imageButtons.get(positionClicked).setImageResource(R.drawable.elefante);
                } else if (this.cards.get(positionClicked).equals("104") || this.cards.get(positionClicked).equals("204")) { imageButtons.get(positionClicked).setImageResource(R.drawable.erizo);
                } else if (this.cards.get(positionClicked).equals("105") || this.cards.get(positionClicked).equals("205")) { imageButtons.get(positionClicked).setImageResource(R.drawable.flamenco);
                } else if (this.cards.get(positionClicked).equals("106") || this.cards.get(positionClicked).equals("206")) { imageButtons.get(positionClicked).setImageResource(R.drawable.pajaro);
                } else if (this.cards.get(positionClicked).equals("107") || this.cards.get(positionClicked).equals("207")) { imageButtons.get(positionClicked).setImageResource(R.drawable.rana);
                } else if (this.cards.get(positionClicked).equals("108") || this.cards.get(positionClicked).equals("208")) { imageButtons.get(positionClicked).setImageResource(R.drawable.vaca);
                }
            } else if (numOfCards == 20) {
                if (this.cards.get(positionClicked).equals("101") || this.cards.get(positionClicked).equals("201") ) { imageButtons.get(positionClicked).setImageResource(R.drawable.abeja);
                } else if (this.cards.get(positionClicked).equals("102") || this.cards.get(positionClicked).equals("202")) { imageButtons.get(positionClicked).setImageResource(R.drawable.conejo);
                } else if (this.cards.get(positionClicked).equals("103") || this.cards.get(positionClicked).equals("203")) { imageButtons.get(positionClicked).setImageResource(R.drawable.elefante);
                } else if (this.cards.get(positionClicked).equals("104") || this.cards.get(positionClicked).equals("204")) { imageButtons.get(positionClicked).setImageResource(R.drawable.erizo);
                } else if (this.cards.get(positionClicked).equals("105") || this.cards.get(positionClicked).equals("205")) { imageButtons.get(positionClicked).setImageResource(R.drawable.flamenco);
                } else if (this.cards.get(positionClicked).equals("106") || this.cards.get(positionClicked).equals("206")) { imageButtons.get(positionClicked).setImageResource(R.drawable.pajaro);
                } else if (this.cards.get(positionClicked).equals("107") || this.cards.get(positionClicked).equals("207")) { imageButtons.get(positionClicked).setImageResource(R.drawable.rana);
                } else if (this.cards.get(positionClicked).equals("108") || this.cards.get(positionClicked).equals("208")) { imageButtons.get(positionClicked).setImageResource(R.drawable.vaca);
                } else if (this.cards.get(positionClicked).equals("109") || this.cards.get(positionClicked).equals("209")) { imageButtons.get(positionClicked).setImageResource(R.drawable.koala);
                } else if (this.cards.get(positionClicked).equals("110") || this.cards.get(positionClicked).equals("210")) { imageButtons.get(positionClicked).setImageResource(R.drawable.gato);
                }
            }

            if (isFirstCard) {
                card1 = this.imageButtons.get(positionClicked);
                numOfClicked1 = this.cards.get(positionClicked);
                numOfClicked11 = Integer.parseInt(numOfClicked1);
                if (numOfClicked11 > 200) {
                    numOfClicked11 = numOfClicked11 - 100;
                }
                numOfClicked1 = Integer.toString(numOfClicked11);
                card1.setTag(numOfClicked1);
                isFirstCard = false;
                clicked1Position = positionClicked;
                // para que no se pueda clickar mientras esta visible
                this.imageButtons.get(clicked1Position).setEnabled(false);

            } else {

                setPossibleWin();

                card2 = this.imageButtons.get(positionClicked);
                numOfClicked2 = this.cards.get(positionClicked);
                numOfClicked22 = Integer.parseInt(numOfClicked2);
                if (numOfClicked22 > 200) {
                    numOfClicked22 = numOfClicked22 - 100;
                }
                numOfClicked2 = Integer.toString(numOfClicked22);
                card2.setTag(numOfClicked2);
                isFirstCard = true;
                clicked2Position = positionClicked;

                for (ImageButton btnElement : this.imageButtons) {
                    btnElement.setEnabled(false);
                }

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        checkCard();
                    }
                }, 1000);
            }
        }
    }

    private void checkCard(){

        tag1 = (String) card1.getTag();
        tag2 = (String) card2.getTag();
        if(tag1.equals(tag2)){
            //imageButtons.get(clicked1Position).setImageResource(R.drawable.success);
            //imageButtons.get(clicked2Position).setImageResource(R.drawable.success);
            imageButtons.get(clicked1Position).setEnabled(false);
            imageButtons.get(clicked2Position).setEnabled(false);
            imageButtons.get(clicked1Position).setTag((String)"out");
            imageButtons.get(clicked2Position).setTag((String)"out");
        }else{
            imageButtons.get(clicked1Position).setImageResource(R.drawable.hueso);
            imageButtons.get(clicked2Position).setImageResource(R.drawable.hueso);
        }

        for (ImageButton btnElement:this.imageButtons) {
            if (!btnElement.getTag().equals("out")){
                btnElement.setEnabled(true);
            }
        }

    }

    private void setPossibleWin(){
        int cntSuccess = 0;

        for (ImageButton btnElement:this.imageButtons) {
            if (btnElement.getTag().equals("out")){
                cntSuccess++;
            }else{
                btnElement.setEnabled(true);
            }
        }

        if (cntSuccess == (this.imageButtons.size()-2)){
            isGameWon = true;
        }
    }

    public boolean isGameWon(){
        if (isGameWon){
            return true;
        }else{
            return false;
        }
    }
}