package com.example.android.projectmusicapp;

public class Song
{

    //STATE
    // m perchè membri privati di questa classe, per convenzione.
    private String mAutore;
    private String mCanzone;
    private String mAlbum;
    private int imgid;

    // CONSTRUCTOR composto da tre parametri string.
    // Esteticamente è come la dichiarazione di un metodo col nome che deve corrispondere esattamente alla classe (Word)
    // non ha un return value
    public Song (String Autore, String Canzone, String Album, int id ){
        mAutore = Autore;
        mCanzone = Canzone;
        mAlbum = Album;
        imgid = id;
    }

    // METHODS
    // due metodi pubblici così che le altre classi possano accedere a questi metodi della classe WORD
    // prendono i dati delle canzoni

    public String getmAutore(){
        return mAutore;
    }
    public String getmCanzone(){
        return mCanzone;
    }
    public String getmAlbum() { return mAlbum; }
    public int  getImgid() { return imgid;}
}
