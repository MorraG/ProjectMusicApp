package com.example.android.projectmusicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter {

    public SongAdapter(Context context, ArrayList<Song> pWords) {
        super(context,0, pWords);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song local_song= (Song) getItem(position);
        TextView autoreTextView = (TextView) listItemView.findViewById(R.id.autore_text_view);
        autoreTextView.setText(local_song.getmAutore());
        TextView canzoneTextView = (TextView) listItemView.findViewById(R.id.canzone_text_view);
        canzoneTextView.setText(local_song.getmCanzone());
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_text_view);
        albumTextView.setText(local_song.getmCanzone());

        return listItemView;
    }
}