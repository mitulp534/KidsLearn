package com.example.hp.com.kidslearn;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class abcdAdapter extends ArrayAdapter<abcd_main> {

    public abcdAdapter(Activity context, ArrayList<abcd_main>abcd_mains){
        super(context,0,abcd_mains);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        abcd_main currentAlphabet = getItem(position);

        TextView alpabetTextView = (TextView) listItemView.findViewById(R.id.abcd_default_view);
        alpabetTextView.setText(currentAlphabet.getDefaultAlphabet());

        TextView prounanceTextView = (TextView)listItemView.findViewById(R.id.abcd_prounance_view);
        prounanceTextView.setText(currentAlphabet.getNamedAlphabet());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentAlphabet.getImageResourceID());
        return listItemView;
    }
}
