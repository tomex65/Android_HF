package com.example.valuta;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {


    private final Activity context;

    private final Integer[] imageIDarray;

    private final String[] countryCurrency;

    private final String[] currencyDescription;

    private final String[] selling;

    private final String[] buying;

    public CustomListAdapter(Activity context, Integer[] imageIDarray, String[] countryCurrency, String[] currencyDescription, String[] selling, String[] buying) {

        super(context, R.layout.listview_row, countryCurrency);

        this.context = context;
        this.imageIDarray = imageIDarray;
        this.countryCurrency = countryCurrency;
        this.currencyDescription = currencyDescription;
        this.selling = selling;
        this.buying = buying;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();


        View rowWiew = inflater.inflate(R.layout.listview_row,null,true);

        ImageView image = (ImageView) rowWiew.findViewById(R.id.imageView);
        TextView countryCurrency1 = (TextView) rowWiew.findViewById(R.id.textView);
        TextView currencyDescription1 = (TextView) rowWiew.findViewById(R.id.textView2);
        TextView selling1 = (TextView) rowWiew.findViewById(R.id.textView4);
        TextView buying1 = (TextView) rowWiew.findViewById(R.id.textView5);

        image.setImageResource(imageIDarray[position]);
        countryCurrency1.setText(countryCurrency[position]);
        currencyDescription1.setText(currencyDescription[position]);
        selling1.setText(selling[position]);
        buying1.setText(buying[position]);

        return rowWiew;

    }

}