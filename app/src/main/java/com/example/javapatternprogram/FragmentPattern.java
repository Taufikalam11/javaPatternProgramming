package com.example.javapatternprogram;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FragmentPattern extends Fragment {

  Context pContext;
  List<Pattern_java> ListPattern;
  RecyclerView recyclerView;
  RecyclerViewAdapter recyclerViewAdapter;
  FragmentManager fragmentManager;
  View rootView;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pContext = getActivity().getApplicationContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       rootView= inflater.inflate(R.layout.fragment_pattern, container, false);
        recyclerView = rootView .findViewById(R.id.recyclerViewPattern1);
        ListPattern = new ArrayList<>();
        fragmentManager = getActivity().getSupportFragmentManager();

        ListPattern.add(new Pattern_java("Square Star Pattern ",getString(R.string.code),R.drawable.s1));
        ListPattern.add(new Pattern_java("Hollow Square Star Pattern ",getString(R.string.Hollow_square_star),R.drawable.s2));
        ListPattern.add(new Pattern_java("Right Triangle Star Pattern ",getString(R.string.Right_Triangle_Star_Pattern),R.drawable.s3));
        ListPattern.add(new Pattern_java("Hollow Right Triangle Star Pattern ",getString(R.string.Hollow_Right_Triangle_Star_Pattern),R.drawable.s4));
        ListPattern.add(new Pattern_java("Inverted Right Triangle Star Pattern ",getString(R.string.Inverted_Right_Triangle_Star_Pattern),R.drawable.s5));
        ListPattern.add(new Pattern_java("Hollow Inverted Right Triangle Star Pattern ",getString(R.string.Hollow_Inverted_Right_Triangle_Star_Pattern),R.drawable.s6));
        ListPattern.add(new Pattern_java("Inverted Left Triangle Star Pattern ",getString(R.string.Inverted_Left_Triangle_Star_Pattern),R.drawable.s7));
        ListPattern.add(new Pattern_java("Hollow Inverted Left Triangle Star Pattern ",getString(R.string.Hollow_Inverted_Left_Triangle_Star_Pattern),R.drawable.s8));
        ListPattern.add(new Pattern_java("Diamond Star Pattern ",getString(R.string.Diamond_Star_Pattern),R.drawable.s9));
        ListPattern.add(new Pattern_java("Hollow Diamond Star Pattern ",getString(R.string.Hollow_Diamond_Star_Pattern),R.drawable.s10));
        ListPattern.add(new Pattern_java("Hourglass Star Pattern",getString(R.string.Hourglass_Star_Pattern),R.drawable.s11));
        ListPattern.add(new Pattern_java("Hollow Hourglass Star Pattern",getString(R.string.Hollow_Hourglass_Star_Pattern),R.drawable.s12));
        ListPattern.add(new Pattern_java("Rhombus Star Pattern",getString(R.string.Rhombus_Star_Pattern),R.drawable.s13));
        ListPattern.add(new Pattern_java("Hollow Rhombus Star Pattern",getString(R.string.Hollow_RhombusStar_Pattern),R.drawable.s14));
        ListPattern.add(new Pattern_java("Pyramid Star Pattern",getString(R.string.Pyramid_Star_Pattern),R.drawable.s15));
        ListPattern.add(new Pattern_java("Inverted Pyramid Star Pattern ",getString(R.string.Inverted_Pyramid_Star_Pattern),R.drawable.s38 ));
        ListPattern.add(new Pattern_java("Hollow Inverted Pyramid Star Pattern ",getString(R.string.Hollow_Inverted_Pyramid_Star_Pattern),R.drawable.s39 ));
        ListPattern.add(new Pattern_java("Half Diamond Star Pattern ",getString(R.string.Half_Diamond_Star_Pattern),R.drawable.s40 ));
        ListPattern.add(new Pattern_java("Hollow Half Diamond Star Pattern",getString(R.string.Hollow_Half_Diamond_Star_Pattern),R.drawable.s41 ));
        ListPattern.add(new Pattern_java("Half Diamond Pattern ",getString(R.string.Half_Diamond_Pattern),R.drawable.s42 ));
        ListPattern.add(new Pattern_java("Hollow Half Diamond Pattern",getString(R.string.Hollow_Half_Diamond_Pattern),R.drawable.s43 ));
        ListPattern.add(new Pattern_java("Hollow Pyramid Star Pattern",getString(R.string.Hollow_Pyramid_Star_Pattern),R.drawable.s16));
        ListPattern.add(new Pattern_java("Chessboard Star Pattern ",getString(R.string.Chessboard_Star_Pattern),R.drawable.s17));
        ListPattern.add(new Pattern_java("Hollow Chessboard Star Pattern ",getString(R.string.Hollow_Chessboard_Star_Pattern),R.drawable.s2));
        ListPattern.add(new Pattern_java("Swirl Star Pattern ",getString(R.string.Swirl_Star_Pattern),R.drawable.s19));
        ListPattern.add(new Pattern_java("Hollow Swirl Star Pattern ",getString(R.string.Hollow_Swirl_Star_Pattern),R.drawable.s20));
        ListPattern.add(new Pattern_java("Circle Star Pattern ",getString(R.string.Circle_Star_Pattern),R.drawable.s21 ));
        ListPattern.add(new Pattern_java("Oval Star Pattern ",getString(R.string.Oval_Star_Pattern),R.drawable.s22 ));
        ListPattern.add(new Pattern_java("Hexagon Star Pattern ",getString(R.string.Hexagon_Star_Pattern),R.drawable.s23 ));
        ListPattern.add(new Pattern_java("Hollow Hexagon Star Pattern ",getString(R.string.Hollow_Hexagon_Star_Pattern),R.drawable.s24 ));
        ListPattern.add(new Pattern_java("Snowman Star Pattern ",getString(R.string.Snowman_Star_Pattern),R.drawable.s25 ));
        ListPattern.add(new Pattern_java("Hollow Snowman Star Pattern ",getString(R.string.Hollow_Snowman_Star_Pattern),R.drawable.s26 ));
        ListPattern.add(new Pattern_java("Ice Cream Star Pattern ",getString(R.string.Ice_Cream_Star_Pattern),R.drawable.s27 ));
        ListPattern.add(new Pattern_java("Hollow Ice Cream Star Pattern ",getString(R.string.Hollow_Ice_Cream_Star_Pattern),R.drawable.s28 ));
        ListPattern.add(new Pattern_java("Balloon Star Pattern ",getString(R.string.Balloon_Star_Pattern),R.drawable.s29 ));
        ListPattern.add(new Pattern_java("Hollow Balloon Star Pattern",getString(R.string.Hollow_Balloon_Star_Pattern),R.drawable.s30 ));
        ListPattern.add(new Pattern_java("Butterfly Star Pattern",getString(R.string.Butterfly_Star_Pattern),R.drawable.s31 ));
        ListPattern.add(new Pattern_java("Hollow Butterfly Star Pattern",getString(R.string.Hollow_Butterfly_Star_Pattern),R.drawable.s32 ));
        ListPattern.add(new Pattern_java("Dragon Star Pattern",getString(R.string.Dragon_Star_Pattern),R.drawable.s33 ));
        ListPattern.add(new Pattern_java("Hollow Dragon Star Pattern",getString(R.string.Hollow_Dragon_Star_Pattern),R.drawable.s34 ));
        ListPattern.add(new Pattern_java("Rocket Star Pattern",getString(R.string.Rocket_Star_Pattern),R.drawable.s35 ));
        ListPattern.add(new Pattern_java("Hollow Rocket Star Pattern",getString(R.string.Hollow_Rocket_Star_Pattern),R.drawable.s36 ));
        ListPattern.add(new Pattern_java("Heart Star pattern",getString(R.string.Heart_Star_pattern),R.drawable.s37 ));
        ListPattern.add(new Pattern_java("Left Arrow Star Pattern",getString(R.string.Left_Arrow_Star_Pattern),R.drawable.s44 ));
        ListPattern.add(new Pattern_java("Cross or X Star Pattern",getString(R.string.Cross_or_X_Star_Pattern),R.drawable.s47 ));
        ListPattern.add(new Pattern_java("Hollow Diamond Star Pattern ",getString(R.string.Hollow_Diamond_Pattern),R.drawable.s48 ));
        ListPattern.add(new Pattern_java("Christmas Tree Star Pattern  ",getString(R.string.Christmas_Tree_Star_Pattern),R.drawable.s49 ));
        ListPattern.add(new Pattern_java("A Star Pattern",getString(R.string.A_Star_Pattern),R.drawable.s51 ));
        ListPattern.add(new Pattern_java("B Star Pattern",getString(R.string.B_Star_Pattern),R.drawable.s50 ));
        ListPattern.add(new Pattern_java("C Star Pattern",getString(R.string.C_Star_Pattern),R.drawable.s52 ));
        ListPattern.add(new Pattern_java("D Star Pattern",getString(R.string.D_Star_Pattern),R.drawable.s53 ));
        ListPattern.add(new Pattern_java("E Star Pattern",getString(R.string.E_Star_Pattern),R.drawable.s54 ));
        ListPattern.add(new Pattern_java("F Star Pattern",getString(R.string.F_Star_Pattern),R.drawable.s55 ));
        ListPattern.add(new Pattern_java("G Star Pattern",getString(R.string.G_Star_Pattern),R.drawable.s56 ));
        ListPattern.add(new Pattern_java("H Star Pattern",getString(R.string.H_Star_Pattern),R.drawable.s57 ));
        ListPattern.add(new Pattern_java("I Star Pattern",getString(R.string.I_Star_Pattern),R.drawable.s58 ));
        ListPattern.add(new Pattern_java("J Star Pattern",getString(R.string.J_Star_Pattern),R.drawable.s59 ));
        ListPattern.add(new Pattern_java("K Star Pattern",getString(R.string.K_Star_Pattern),R.drawable.s60 ));
        ListPattern.add(new Pattern_java("L Star Pattern",getString(R.string.L_Star_Pattern),R.drawable.s61 ));
        ListPattern.add(new Pattern_java("M Star Pattern",getString(R.string.M_Star_Pattern),R.drawable.s62 ));
        ListPattern.add(new Pattern_java("N Star Pattern",getString(R.string.N_Star_Pattern),R.drawable.s63 ));
        ListPattern.add(new Pattern_java("O Star Pattern",getString(R.string.O_Star_Pattern),R.drawable.s64 ));
        ListPattern.add(new Pattern_java("P Star Pattern",getString(R.string.P_Star_Pattern),R.drawable.s65 ));
        ListPattern.add(new Pattern_java("Q Star Pattern",getString(R.string.Q_Star_Pattern),R.drawable.s66 ));
        ListPattern.add(new Pattern_java("R Star Pattern",getString(R.string.R_Star_Pattern),R.drawable.s67 ));
        ListPattern.add(new Pattern_java("S Star Pattern",getString(R.string.S_Star_Pattern),R.drawable.s68 ));
        ListPattern.add(new Pattern_java("T Star Pattern",getString(R.string.T_Star_Pattern),R.drawable.s69 ));
        ListPattern.add(new Pattern_java("U Star Pattern",getString(R.string.U_Star_Pattern),R.drawable.s70 ));
        ListPattern.add(new Pattern_java("V Star Pattern",getString(R.string.V_Star_Pattern),R.drawable.s71 ));
        ListPattern.add(new Pattern_java("W Star Pattern",getString(R.string.W_Star_Pattern),R.drawable.s72 ));
        ListPattern.add(new Pattern_java("X Star Pattern",getString(R.string.X_Star_Pattern),R.drawable.s73 ));
        ListPattern.add(new Pattern_java("Y Star Pattern",getString(R.string.Y_Star_Pattern),R.drawable.s74));
        ListPattern.add(new Pattern_java("Z Star Pattern",getString(R.string.Z_Star_Pattern),R.drawable.s75));






        //Number pattern

        ListPattern.add(new Pattern_java("Square Number Pattern",getString(R.string.Square_Number_Pattern),R.drawable.n1));
        ListPattern.add(new Pattern_java("Hollow Square Number Pattern",getString(R.string.Hollow_Square_Number_Pattern),R.drawable.n2));
        ListPattern.add(new Pattern_java("Half Diamond Number Pattern",getString(R.string.Half_Diamond_Number_Pattern),R.drawable.n42));
        ListPattern.add(new Pattern_java("Hollow Half Diamond Number Pattern",getString(R.string.Hollow_Half_Diamond_Number_Pattern),R.drawable.n43));
        ListPattern.add(new Pattern_java("Right Half Diamond Number Pattern",getString(R.string.Right_Half_Diamond_Number_Pattern),R.drawable.n44));
        ListPattern.add(new Pattern_java("Hollow Right Half Diamond Number",getString(R.string.Hollow_Right_Half_Diamond_Number_Pattern),R.drawable.n45));
        ListPattern.add(new Pattern_java("Pyramid Number Pattern",getString(R.string.Pyramid_Number_Pattern),R.drawable.n3));
        ListPattern.add(new Pattern_java("Diamond Number Pattern ",getString(R.string.Diamond_Number_Pattern),R.drawable.n4));
        ListPattern.add(new Pattern_java(" Hollow Pyramid Number Pattern",getString(R.string.Hollow_Pyramid_Number_Pattern),R.drawable.n5));
        ListPattern.add(new Pattern_java(" Hollow Diamond Number Pattern",getString(R.string.Hollow_Diamond_Number_Pattern),R.drawable.n6));
        ListPattern.add(new Pattern_java(" Right Triangle Number Pattern",getString(R.string.Right_Triangle_Number_Pattern),R.drawable.n7));
        ListPattern.add(new Pattern_java(" Left Triangle Number Pattern",getString(R.string.Left_Triangle_Number_Pattern),R.drawable.n8));
        ListPattern.add(new Pattern_java("Reverse Right Triangle Number Pattern",getString(R.string.Right_Triangle_Number_Pattern),R.drawable.n9));
        ListPattern.add(new Pattern_java("Hollow Right Triangle Number Pattern",getString(R.string.Hollow_Right_Triangle_Number_Pattern),R.drawable.n11));
        ListPattern.add(new Pattern_java("Hollow Reverse Right Triangle Number Pattern",getString(R.string.Hollow_Reverse_Right_Triangle_Number_Pattern),R.drawable.n12));
        ListPattern.add(new Pattern_java("Floyd's Triangle Number Pattern",getString(R.string.Floyds_Triangle_Number_Pattern),R.drawable.n13));
        ListPattern.add(new Pattern_java("Pascal's Triangle Number Pattern",getString(R.string.Pascals_Triangle_Number_Pattern),R.drawable.n14));
        ListPattern.add(new Pattern_java("Hollow Floyd's Triangle Number Pattern",getString(R.string.Hollow_Floyds_Triangle_Number_Pattern),R.drawable.n15));
        ListPattern.add(new Pattern_java("Hollow Pascal's Triangle Number Pattern",getString(R.string.Hollow_Pascals_Triangle_Number_Pattern),R.drawable.n16));
        ListPattern.add(new Pattern_java("Prime Number Pattern",getString(R.string.Prime_Number_Pattern),R.drawable.n17));
        ListPattern.add(new Pattern_java("Fibonacci Number Pattern",getString(R.string.Fibonacci_Number_Pattern),R.drawable.n18));
        ListPattern.add(new Pattern_java("Even Number Pattern",getString(R.string.Even_Number_Pattern),R.drawable.n19));
        ListPattern.add(new Pattern_java("Odd Number Pattern",getString(R.string.Odd_Number_Pattern),R.drawable.n20));
        ListPattern.add(new Pattern_java("Palindrome Number Pattern",getString(R.string.Palindrome_Number_Pattern),R.drawable.n21));
        ListPattern.add(new Pattern_java("Armstrong Number Pattern",getString(R.string.Armstrong_Number_Pattern),R.drawable.n22));
        ListPattern.add(new Pattern_java("Perfect Number Pattern",getString(R.string.Perfect_Number_Pattern),R.drawable.n23));
        ListPattern.add(new Pattern_java("Abundant Number Pattern",getString(R.string.Abundant_Number_Pattern),R.drawable.n24));
        ListPattern.add(new Pattern_java("Deficient Number Pattern",getString(R.string.Deficient_Number_Pattern),R.drawable.n25));
        ListPattern.add(new Pattern_java("Harshad Number Pattern",getString(R.string.Harshad_Number_Pattern),R.drawable.n26));
        ListPattern.add(new Pattern_java("Neon Number Pattern",getString(R.string.Neon_Number_Pattern),R.drawable.n27));
        ListPattern.add(new Pattern_java("Happy Number Pattern",getString(R.string.Happy_Number_Pattern),R.drawable.n28));
        ListPattern.add(new Pattern_java("Magic Number Pattern",getString(R.string.Magic_Number_Pattern),R.drawable.n29));
        ListPattern.add(new Pattern_java("Catalan Number Pattern",getString(R.string.Catalan_Number_Pattern),R.drawable.n31));
        ListPattern.add(new Pattern_java("Bell Number Pattern",getString(R.string.Bell_Number_Pattern),R.drawable.n32));
        ListPattern.add(new Pattern_java("Triangular Number Pattern",getString(R.string.Triangular_Number_Pattern),R.drawable.n33));
        ListPattern.add(new Pattern_java("Pentagonal Number Pattern",getString(R.string.Pentagonal_Number_Pattern),R.drawable.n34));
        ListPattern.add(new Pattern_java("Amicable Number Pattern",getString(R.string.Amicable_Number_Pattern),R.drawable.n35));
        ListPattern.add(new Pattern_java("Pronic Number Pattern",getString(R.string.Pronic_Number_Pattern),R.drawable.n37));
        ListPattern.add(new Pattern_java("Lucas Number Pattern",getString(R.string.Lucas_Number_Pattern),R.drawable.n38));



        // Alphabetic
     ListPattern.add(new Pattern_java("Square Alphabet Pattern",getString(R.string.Square_Alphabet_Pattern),R.drawable.a1));
     ListPattern.add(new Pattern_java("Hollow Square Alphabet Pattern",getString(R.string.Hollow_Square_Alphabet_Pattern),R.drawable.a2));
     ListPattern.add(new Pattern_java("Right Triangle Alphabet Pattern",getString(R.string.Right_Triangle_Alphabet_Pattern),R.drawable.a3));
     ListPattern.add(new Pattern_java("Hollow Right Triangle Alphabet",getString(R.string.Hollow_Right_Triangle_Alphabet),R.drawable.a4));
     ListPattern.add(new Pattern_java("Inverted Right Triangle Alphabet",getString(R.string.Inverted_Right_Triangle_Alphabet),R.drawable.a5));
     ListPattern.add(new Pattern_java("Hollow Inverted RightTriangle",getString(R.string.Hollow_Inverted_Right_Triangle_Alphabet),R.drawable.a6));
     ListPattern.add(new Pattern_java("Left Triangle Alphabet",getString(R.string.Left_Triangle_Alphabet),R.drawable.a7));
     ListPattern.add(new Pattern_java("Hollow Left Triangle Alphabet",getString(R.string.Hollow_Left_Triangle_Alphabet),R.drawable.a8));
     ListPattern.add(new Pattern_java("Inverted Left Triangle Alphabet",getString(R.string.Inverted_Left_Triangle_Alphabet),R.drawable.a9));
     ListPattern.add(new Pattern_java("Hollow Inverted Left Triangle Alphabet",getString(R.string.Hollow_Inverted_Left_Triangle_Alphabet),R.drawable.a10));
     ListPattern.add(new Pattern_java("Pyramid Alphabet Pattern",getString(R.string.Pyramid_Alphabet_Pattern),R.drawable.a11));
     ListPattern.add(new Pattern_java("Hollow Pyramid Alphabet Pattern",getString(R.string.Hollow_Pyramid_Alphabet_Pattern),R.drawable.a12));
     ListPattern.add(new Pattern_java("Reverse Pyramid Alphabet Pattern",getString(R.string.Reverse_Pyramid_Alphabet_Pattern),R.drawable.a13));
     ListPattern.add(new Pattern_java("Hollow Reverse Pyramid Alphabet Pattern",getString(R.string.Hollow_Reverse_Pyramid_Alphabet_Pattern),R.drawable.a14));
     ListPattern.add(new Pattern_java("Triangle Alphabet Pattern",getString(R.string.Triangle_Alphabet_Pattern),R.drawable.a15));
     ListPattern.add(new Pattern_java("Hollow Triangle Alphabet Pattern",getString(R.string.Hollow_Triangle_Alphabet_Pattern),R.drawable.a16));
     ListPattern.add(new Pattern_java("Diamond Alphabet Pattern",getString(R.string.Diamond_Alphabet_Pattern),R.drawable.a18));
     ListPattern.add(new Pattern_java("Hollow Diamond Alphabet Pattern",getString(R.string.Hollow_Diamond_Alphabet_Pattern),R.drawable.a19));
     ListPattern.add(new Pattern_java("Half Diamond Alphabet Pattern",getString(R.string.Half_Diamond_Alphabet_Pattern),R.drawable.a20));
     ListPattern.add(new Pattern_java("Hollow Half Diamond Alphabet",getString(R.string.Hollow_Half_Diamond_Alphabet),R.drawable.a21));
     ListPattern.add(new Pattern_java("Left Half Diamond Alphabet",getString(R.string.Left_Half_Diamond_Alphabet),R.drawable.a22));
     ListPattern.add(new Pattern_java("Rhombus Alphabet Pattern",getString(R.string.Rhombus_Alphabet_Pattern),R.drawable.a23));
     ListPattern.add(new Pattern_java("Sandglass Alphabet Pattern",getString(R.string.Sandglass_Alphabet_Pattern),R.drawable.a24));
     ListPattern.add(new Pattern_java("Left K Alphabet Pattern",getString(R.string.Left_K_Alphabet_Pattern),R.drawable.a25));
     ListPattern.add(new Pattern_java("k Shape Alphabet Pattern",getString(R.string.k_Shape_Alphabet_Pattern),R.drawable.a26));
     ListPattern.add(new Pattern_java("ButterFly Alphabet Pattern",getString(R.string.ButterFly_Alphabetic_Pattern),R.drawable.a27));






        
        recyclerViewAdapter = new RecyclerViewAdapter(getContext(),ListPattern);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),1));

        recyclerView.setAdapter(recyclerViewAdapter);
       return  rootView;
    }
}