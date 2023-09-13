package com.example.javapatternprogram;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class FragmentPattern3 extends Fragment {

  Context context;
  List<Pattern_java2> ListPattern2;
  RecyclerView recyclerView;
  RecyclerViewAdapter1 recyclerViewAdapter1;
  FragmentManager fragmentManager;
  View rootView;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        context = getActivity().getApplicationContext();
    }

    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       rootView= inflater.inflate(R.layout.fragment_pattern3, container, false);
        recyclerView = rootView .findViewById(R.id.recyclerViewPattern3);
        ListPattern2 = new ArrayList<>();
        fragmentManager = getActivity().getSupportFragmentManager();

        ListPattern2.add(new Pattern_java2("Searching",getString(R.string.Searching)));
        ListPattern2.add(new Pattern_java2("Linear Search",getString(R.string.Linear_Search)));
        ListPattern2.add(new Pattern_java2("Binary Search ",getString(R.string.Binary_Search)));
        ListPattern2.add(new Pattern_java2("Sorting",getString(R.string.Sorting)));
        ListPattern2.add(new Pattern_java2("Bubble Sort",getString(R.string.Bubble_Sort)));
        ListPattern2.add(new Pattern_java2("Insertion Sort",getString(R.string.Insertion_Sort)));
        ListPattern2.add(new Pattern_java2("Selection Sort",getString(R.string.Selection_Sort)));
        ListPattern2.add(new Pattern_java2("Merge Sort",getString(R.string.Merge_Sort)));
        ListPattern2.add(new Pattern_java2("Quick Sort ",getString(R.string.Quick_Sort)));
        ListPattern2.add(new Pattern_java2("Counting Sort",getString(R.string.Counting_Sort)));
        ListPattern2.add(new Pattern_java2("Radix Sort ",getString(R.string.Radix_Sort)));
        ListPattern2.add(new Pattern_java2("Heap Sort ",getString(R.string.Heap_Sort)));
        ListPattern2.add(new Pattern_java2("Linked List",getString(R.string.Linked_List)));
        ListPattern2.add(new Pattern_java2("Linked List",getString(R.drawable.asci)));





        recyclerViewAdapter1 = new RecyclerViewAdapter1(getContext(),ListPattern2);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),1));
        recyclerView.setAdapter(recyclerViewAdapter1);
       return  rootView;
    }
}