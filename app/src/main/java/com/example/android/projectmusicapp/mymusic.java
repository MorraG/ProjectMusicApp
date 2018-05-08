package com.example.android.projectmusicapp;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class mymusic extends MainActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mymusic);

     //Declaration of Array of String
        ArrayList<Song> songs = new ArrayList<Song>();
     // inizialization of elements into the arrayList:
        songs.add(new Song("Drake", "Nice for what", "single record", R.drawable.coversample ));
        songs.add(new Song("Dua Lipa Feat Calvin Harris", "One Kiss", "single record", R.drawable.coversample ));
        songs.add(new Song("Jess Glynne, Macklemore and Dan Caplen", "These Days", "single record", R.drawable.coversample ));
        songs.add(new Song("George Ezra", "Paradise", "Staying at Tamara's", R.drawable.coversample ));
        songs.add(new Song("Sigala", "Lullaby", "single record", R.drawable.coversample ));
        songs.add(new Song("Bebe Rexha feat. Florida Georgia Line", "Meant to Be", "All Your Fault: Pt. 2", R.drawable.coversample ));
        songs.add(new Song("Portugal. The Man", "Feel It Still", "Woodstock", R.drawable.coversample ));
        songs.add(new Song("Marshmello feat. Anne-Marie", "FRIENDS", "single record", R.drawable.coversample ));
        songs.add(new Song("David Guetta feat. Sia ", "Flames", "Woodstock", R.drawable.coversample ));
        songs.add(new Song("Lo stato sociale", "Una Vita In Vacanza", "single record", R.drawable.coversample ));
        songs.add(new Song("Annalisa", "Il Mondo Prima di Te", "Bye Bye", R.drawable.coversample ));
        songs.add(new Song("Cesare Cremonini", "Nessuno Vuole Essere Robin", "Possibili scenari", R.drawable.coversample ));
        songs.add(new Song("Jovanotti", "Le Canzoni", "Oh, vita!", R.drawable.coversample ));
        songs.add(new Song("Ermal Meta & Fabrizio Moro", "Non mi avete fatto niente", "Sanremo2018", R.drawable.coversample ));
        songs.add(new Song("Laura Pausini", "Non è detto", "Fatti sentire", R.drawable.coversample ));
        songs.add(new Song("Pink Panda feat. Nyanda", "Love It Like That", "Love It Like", R.drawable.coversample ));
        songs.add(new Song("Ravitez", "I am not the one", "I'm not the one", R.drawable.coversample));
        songs.add(new Song("Armin van Buuren feat. James Newman", "Therapy", "Therapy", R.drawable.coversample ));
        songs.add(new Song("Ummet Ozcan x Laurell", "Change My Heart", "Therapy", R.drawable.coversample ));
        songs.add(new Song("Cristian Marchi Feat. Block", "Baker Street", "single record", R.drawable.coversample ));

        // Create an ArrayAdapter}, whose data source is a list of Strings named songs above. The
        // adapter knows how to create layouts for each item in the list

        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}
