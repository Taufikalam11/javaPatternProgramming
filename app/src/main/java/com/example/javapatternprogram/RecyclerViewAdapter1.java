package com.example.javapatternprogram;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter1 extends RecyclerView.Adapter<RecyclerViewAdapter1.ViewHolder1> {

    Context context;
    List<Pattern_java2> ListPattern2;
    public  RecyclerViewAdapter1(Context context ,List<Pattern_java2>listPattern2){
        this.context = context;
        this.ListPattern2 = listPattern2;

    }
    @NonNull
    @Override



    public RecyclerViewAdapter1.ViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view;
        view = LayoutInflater.from(context).inflate(R.layout.itme_patter2,parent,false);

        ViewHolder1 viewHolder1 = new ViewHolder1(view);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter1.ViewHolder1 holder, int position) {
        holder.textView .setText(ListPattern2.get(position).getNameOfCode());


    }

    @Override
    public int getItemCount() {
        return ListPattern2.size();
    }

    public class ViewHolder1 extends RecyclerView.ViewHolder implements View.OnClickListener{
         private TextView textView;
         private  TextView textDesc;

        public ViewHolder1(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

          textView = itemView.findViewById(R.id.textNmae);
          textDesc = itemView.findViewById(R.id.textPatternDesc);


        }

        @Override
        public void onClick(View view) {

            int position = getAdapterPosition();
            Pattern_java2 item = ListPattern2.get(position);
            Intent detailScrreenData = new Intent(context,Pattern2Detail.class);
            detailScrreenData.putExtra("NameCode",item.getNameOfCode());
            detailScrreenData.putExtra("textDesc",item.getCodeDesc());
            detailScrreenData.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(detailScrreenData);


        }
    }
}
