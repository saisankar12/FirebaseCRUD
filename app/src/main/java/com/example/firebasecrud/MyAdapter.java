package com.example.firebasecrud;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    List<MyModel> myModels;

    public MyAdapter(ReadActivity readActivity, List<MyModel> modelList) {
        context = readActivity;
        myModels = modelList;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.design, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder myViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return myModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView r_name, r_mail, r_phone, r_gender, r_tech, r_college, r_branch;
        Button r_update, r_delete;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            r_name = itemView.findViewById(R.id.r_name);
            r_mail = itemView.findViewById(R.id.r_gmail);
            r_phone = itemView.findViewById(R.id.r_phone);
            r_gender = itemView.findViewById(R.id.r_gender);
            r_tech = itemView.findViewById(R.id.r_tech);
            r_college = itemView.findViewById(R.id.r_college);
            r_branch = itemView.findViewById(R.id.r_branch);

            r_update = itemView.findViewById(R.id.update);

            r_update.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            r_delete = itemView.findViewById(R.id.delete);

            r_delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
