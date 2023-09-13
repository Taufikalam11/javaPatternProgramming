package com.example.javapatternprogram;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context pContext;

    List<Pattern_java> ListPattern;

     public  RecyclerViewAdapter(Context pContext,List<Pattern_java> listPattern){
       this.pContext = pContext;
       this.ListPattern = listPattern;

     }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

         View view;
         view = LayoutInflater.from(pContext).inflate(R.layout.item_pattern,parent,false);

         MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {


         holder.patternName.setText(ListPattern.get(position).getNameOfPattern());
        holder.imgPattern.setImageResource(ListPattern.get(position).patternImage);


    }

    @Override
    public int getItemCount() {
        return ListPattern.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

       private TextView patternName;
       private ImageView imgPattern;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            patternName = itemView.findViewById(R.id.t1);
            imgPattern  = itemView.findViewById(R.id.img1);

        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Pattern_java item = ListPattern.get(position);
            Intent detailsScreenData = new Intent(pContext,PatternDetail.class);
            detailsScreenData.putExtra("Image",item.getPatternImage());
            detailsScreenData.putExtra("desc",item.getCodingPattern());
            detailsScreenData.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            pContext.startActivity(detailsScreenData);

        }
    }
}
