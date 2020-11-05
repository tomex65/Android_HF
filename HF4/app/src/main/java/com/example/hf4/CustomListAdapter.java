package com.example.hf4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pali on 10/5/2017.
 */

public class CustomListAdapter extends ArrayAdapter {

    private final Activity context;
    private final String[] currencyArray;
    private final String[] infoArray;
    private final String[] vetelArray;
    private final String[] eladasArray;

    public CustomListAdapter(Activity context, String[] currencyArrayParam, String[] infoArrayParam, String[] vetelArrayParam, String[] eladasArrayParam){

        super(context, R.layout.listviewrow, currencyArrayParam);
        this.context=context;
        this.currencyArray = currencyArrayParam;
        this.infoArray = infoArrayParam;
        this.vetelArray = vetelArrayParam;
        this.eladasArray = eladasArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listviewrow, null,true);

        TextView currency = (TextView) rowView.findViewById(R.id.penz);
        TextView info = (TextView) rowView.findViewById(R.id.info);
        TextView vetel = (TextView) rowView.findViewById(R.id.vetel);
        TextView eladas = (TextView) rowView.findViewById(R.id.eladas);

        currency.setText(currencyArray[position]);
        info.setText(infoArray[position]);
        vetel.setText(vetelArray[position]);
        eladas.setText(eladasArray[position]);

        return rowView;

    }
}

