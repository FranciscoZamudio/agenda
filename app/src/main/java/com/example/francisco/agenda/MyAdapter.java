package com.example.francisco.agenda;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by francisco on 19/09/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] names = {"Pango Lopez",
            "Lionel Messi",
            "Juan Perez",
            "Naruto Uzumaki",
            "Eli Moralez",
            "Javier Hernendez",
            "Edgar Merenguez",
            "Laura Rodriguez"};

    private String[] phonenumbers = {"4428136869",
            "4428132867", "4428136869",
            "5528139869", "4425136563",
            "4198136869", "4428030861",
            "4428176866"};

    private String[] emails = {"pango33@gmail.com",
            "mvp10@gmail.com", "juanwhatsup@itq.com",
            "kubininetails@gmail.com", "sdfh@gmail.com",
            "ert@yahoo.com", "laulau@hotmail.com",
            "lalala@gmail.com"};


    class ViewHolder extends RecyclerView.ViewHolder{

        public int currentItem;
        public TextView itemName;
        public TextView itemPhoneNumber;
        public TextView itemEmail;


        public ViewHolder(View itemView) {
            super(itemView);
            itemName = (TextView)itemView.findViewById(R.id.tvName);
            itemPhoneNumber = (TextView)itemView.findViewById(R.id.tvPhone);
            itemEmail = (TextView)itemView.findViewById(R.id.tvEmail);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

                    Snackbar.make(v, "Click detected on item " + position,
                            Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();

                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemName.setText(names[i]);
        viewHolder.itemPhoneNumber.setText(phonenumbers[i]);
        viewHolder.itemEmail.setText(emails[i]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }
}
