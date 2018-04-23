package com.example.adrianch.spinner3;

import android.app.Activity;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Adrian Ch on 13/02/2018.
 */

public class AdapterAnimales extends ArrayAdapter {
    private Activity context;
    ArrayList<Animales> animales;
    private int resource;

    public AdapterAnimales(@NonNull Activity context, int resource, ArrayList<Animales> animales) {
        super(context, resource, animales);
        this.context = context;
        this.animales = animales;
        this.resource = resource;
    }


    @Override
    public int getCount() {
        return animales.size();
    }

    @Override
    public Object getItem(int position) {
        return animales.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder ();
        if(convertView == null) {
            if (context != null) {
                convertView = context.getLayoutInflater().inflate(resource, null);
                holder.txtItem = (TextView) convertView.findViewById(R.id.txtItem);
                convertView.setTag(holder);
            }
        }else{
            holder = (ViewHolder)convertView.getTag();

        }
        Animales animales = this.animales.get(position);
        holder.txtItem.setText(animales.getTipos());
        holder.txtItem.setBackgroundColor(Color.BLUE);
        return  convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if(convertView == null){
            if(context != null){
                convertView=context.getLayoutInflater().inflate(resource,null);
                holder.txtItem = (TextView)convertView.findViewById(R.id.txtItem);
                convertView.setTag(holder);
            }
        }else{
            holder = (ViewHolder)convertView.getTag();
        }
        Animales animales = this.animales.get(position);
        holder.txtItem.setBackgroundColor(Color.GREEN);
        holder.txtItem.setText(animales.getTipos());
        holder.txtItem.setBackgroundColor(Color.BLUE);

        return convertView;
    }


    static class ViewHolder{
        private TextView txtItem;
    }
}

