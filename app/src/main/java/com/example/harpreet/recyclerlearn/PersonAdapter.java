package com.example.harpreet.recyclerlearn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.viewHolder> {

    public interface itemClicked{
        void onItemClicked(int index);
    }

    itemClicked activity;

    ArrayList<Person> people;
    public PersonAdapter(Context context,ArrayList<Person> list)
    {
        activity = (itemClicked) context;
        people = list;
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView ivpref;
        TextView tvname;
        TextView tvsurname;

        public viewHolder(@NonNull final View itemView) {
            super(itemView);

            ivpref = itemView.findViewById(R.id.ivpref);
            tvname = itemView.findViewById(R.id.tvname);
            tvsurname = itemView.findViewById(R.id.tvsurname);

            ivpref.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    activity.onItemClicked(people.indexOf(itemView.getTag()));//tag is used here
                }
            });

        }
    }

    @NonNull
    @Override
    public PersonAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list,viewGroup,false);

        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.viewHolder viewHolder, int i) {

        viewHolder.itemView.setTag(people.get(i));//this tag is been used to select different items

        viewHolder.tvname.setText(people.get(i).getName());
        viewHolder.tvsurname.setText(people.get(i).getSurname());
        if(people.get(i).getPreference()=="plane")
        {
            viewHolder.ivpref.setImageResource(R.drawable.plane);
        }
        else
        {
            viewHolder.ivpref.setImageResource(R.drawable.bus);
        }
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
