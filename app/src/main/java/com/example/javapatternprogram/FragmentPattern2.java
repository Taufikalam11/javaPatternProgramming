package com.example.javapatternprogram;

import android.annotation.SuppressLint;
import android.app.ActionBar;
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


public class FragmentPattern2 extends Fragment {

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

        rootView= inflater.inflate(R.layout.fragment_pattern2, container, false);
        recyclerView = rootView .findViewById(R.id.recyclerViewPattern2);

        ListPattern2 = new ArrayList<>();
        fragmentManager = getActivity().getSupportFragmentManager();



        ListPattern2.add(new Pattern_java2("1> Positive or Negative number",getString(R.string.Positive_or_Negative_number)));
        ListPattern2.add(new Pattern_java2("2> Even or Odd number ",getString(R.string.Even_or_Odd_number)));
        ListPattern2.add(new Pattern_java2("3> Sum of First N Natural numbers ",getString(R.string.Sum_of_First_N_Natural_numbers)));
        ListPattern2.add(new Pattern_java2("4> Sum of N natural numbers ",getString(R.string.Sum_of_N_natural_numbers)));
        ListPattern2.add(new Pattern_java2("5> Sum of numbers in a given range ",getString(R.string.Sum_of_numbers_in_a_given_range)));
        ListPattern2.add(new Pattern_java2("6> Greatest of two numbers ",getString(R.string.Greatest_of_two_numbers)));
        ListPattern2.add(new Pattern_java2("7> Greatest of the Three numbers ",getString(R.string.Greatest_of_the_Three_numbers)));
        ListPattern2.add(new Pattern_java2("8> Leap year or not ",getString(R.string.Leap_year_or_not)));
        ListPattern2.add(new Pattern_java2("9> Prime number",getString(R.string.Prime_number)));
        ListPattern2.add(new Pattern_java2("10> Prime number within a given range",getString(R.string.Prime_number_within_a_give_range)));
        ListPattern2.add(new Pattern_java2("11> Sum of digits of a number",getString(R.string.Sum_of_digits_of_a_number)));
        ListPattern2.add(new Pattern_java2("12> Reverse of a number",getString(R.string.Reverse_of_a_number)));
        ListPattern2.add(new Pattern_java2("13> Palindrome number",getString(R.string.Palindrome_number)));
        ListPattern2.add(new Pattern_java2("14> Armstrong number",getString(R.string.Armstrong_number)));
        ListPattern2.add(new Pattern_java2("15> Armstrong number in a given range",getString(R.string.Armstrong_number_in_a_given_range)));
        ListPattern2.add(new Pattern_java2("16> Fibonacci Series upto nth term",getString(R.string.Fibonacci_Series_upto_nth_term)));
        ListPattern2.add(new Pattern_java2("17> Factorial of a number",getString(R.string.Factorial_of_a_number)));
        ListPattern2.add(new Pattern_java2("18>Power of a number",getString(R.string.Power_of_a_number)));
        ListPattern2.add(new Pattern_java2("19>Factor of a number",getString(R.string.Factor_of_a_number)));
        ListPattern2.add(new Pattern_java2("20>Strong number",getString(R.string.Strong_number)));
        ListPattern2.add(new Pattern_java2("21>Perfect number",getString(R.string.Perfect_number)));
        ListPattern2.add(new Pattern_java2("22>Automorphic number",getString(R.string.Automorphic_number)));
        ListPattern2.add(new Pattern_java2("23>Harshad number",getString(R.string.Harshad_number)));
        ListPattern2.add(new Pattern_java2("24>Abundant number",getString(R.string.Abundant_number)));
        ListPattern2.add(new Pattern_java2("25>Friendly pair",getString(R.string.Friendly_pair)));
        ListPattern2.add(new Pattern_java2("26>Working with Numbers",""));
        ListPattern2.add(new Pattern_java2("27>Highest Common Factor(HCF)",getString(R.string.Highest_Common_Factor_HCF)));
        ListPattern2.add(new Pattern_java2("28>Lowest Common Multiple (LCM)",getString(R.string.Lowest_Common_Multiple_LCM)));
        ListPattern2.add(new Pattern_java2("29>Greatest Common Divisor",getString(R.string.Greatest_Common_Divisor)));
        ListPattern2.add(new Pattern_java2("30>Binary to Decimal to conversion",getString(R.string.Binary_to_Decimal_to_conversion)));
        ListPattern2.add(new Pattern_java2("31>Octal to Decimal conversion ",getString(R.string.Octal_to_Decimal_conversion)));
        ListPattern2.add(new Pattern_java2("32>Hexadecimal to Decimal conversion",getString(R.string.Hexadecimal_to_Decimal_conversion)));
        ListPattern2.add(new Pattern_java2("33>Decimal to Binary conversion",getString(R.string.Decimal_to_Binary_conversion)));
        ListPattern2.add(new Pattern_java2("34>Decimal to Octal Conversion",getString(R.string.Decimal_to_Octal_Conversion)));
        ListPattern2.add(new Pattern_java2("35>Decimal to Hexadecimal Conversion",getString(R.string.Decimal_to_Hexadecimal_Conversion)));
        ListPattern2.add(new Pattern_java2("36>Binary to Octal conversion",getString(R.string.Binary_to_Octal_conversion)));
        ListPattern2.add(new Pattern_java2("37>Octal to Binary conversion ",getString(R.string.Octal_to_Binary_conversion)));
        ListPattern2.add(new Pattern_java2("38>Quadrants in which a given coordinate lies ",getString(R.string.Quadrants_in_which_a_given_coordinate_lies)));
        ListPattern2.add(new Pattern_java2("39>Permutations in which n people can occupy r seats in a classroom",getString(R.string.Permutations)));
        ListPattern2.add(new Pattern_java2("40>Maximum number of handshakes",getString(R.string.Maximum_number_of_handshakes)));
        ListPattern2.add(new Pattern_java2("41>Addition of two fractions",getString(R.string.Addition_of_two_fractions)));
        ListPattern2.add(new Pattern_java2("43> Can a number be expressed as a sum of two prime numbers",getString(R.string.Can_a_number)));
        ListPattern2.add(new Pattern_java2("44>Count possible decoding of a given digit sequence",getString(R.string.Count_possible)));
        ListPattern2.add(new Pattern_java2("45>Find the prime numbers between 1 to 100",getString(R.string.Find_the_prime)));
        ListPattern2.add(new Pattern_java2("46>Calculate the number of digits in an integer ",getString(R.string.Calculate_the_number)));
        ListPattern2.add(new Pattern_java2("47>Counting number of days in a given month of a year",getString(R.string.Counting_number_of_days)));
        ListPattern2.add(new Pattern_java2("48>Finding Number of times x digit occurs in a given input ",getString(R.string.Finding_Number_of_times)));
        ListPattern2.add(new Pattern_java2("49>Finding number of integers which has exactly x divisors",getString(R.string.Finding_number_of_integers)));
        ListPattern2.add(new Pattern_java2("50>Finding Roots of a quadratic equation",getString(R.string.Finding_number_of_integers)));
        ListPattern2.add(new Pattern_java2("51>Finding Roots of a quadratic equation",getString(R.string.Finding_Roots_of_a_quadratic_equation)));
        ListPattern2.add(new Pattern_java2("Recursion",""));
        ListPattern2.add(new Pattern_java2("1>Power of a Number ",getString(R.string.Power_of_a_Number)));
        ListPattern2.add(new Pattern_java2("2>Prime Number",getString(R.string.Prime_Number)));
        ListPattern2.add(new Pattern_java2("3>Largest element in an array",getString(R.string.Largest_element_in_an_array)));
        ListPattern2.add(new Pattern_java2("4>Smallest element in an array",getString(R.string.Smallest_element_in_an_array)));
        ListPattern2.add(new Pattern_java2("5>Reversing a Number",getString(R.string.Reverse_of_a_number)));
        ListPattern2.add(new Pattern_java2("6> HCF of two numbers",getString(R.string.HCF_of_two_numbers)));
        ListPattern2.add(new Pattern_java2("7> LCM of two numbers",getString(R.string.LCM_of_two_numbers)));
        ListPattern2.add(new Pattern_java2("8>Program to calculate length of the string using recursion",getString(R.string.Program_to_calculate)));
        ListPattern2.add(new Pattern_java2("9>Print All Permutations of a String",getString(R.string.Print_All_Permutations)));
        ListPattern2.add(new Pattern_java2("10>Given an integer N the task is to print the F(N)th term",getString(R.string.Given_an_integer_N)));
        ListPattern2.add(new Pattern_java2("11>Given a list arr of N integers, print sums of all subsets in it",getString(R.string.Given_a_list_arr_of_N)));
        ListPattern2.add(new Pattern_java2("12>Last non-zero digit in factorial",getString(R.string.Last_non_zero_digit_in_factorial)));
        ListPattern2.add(new Pattern_java2("13>Given a positive integer N, return the Nth row of pascal’s triangle",getString(R.string.Given_a_positive_integer_N)));
        ListPattern2.add(new Pattern_java2("14>Find the Factorial of a number using recursion",getString(R.string.Find_the_Factorial)));
        ListPattern2.add(new Pattern_java2("15>Find all possible Palindromic partitions of the given String ",getString(R.string.Find_all_possible_Palindromic)));
        ListPattern2.add(new Pattern_java2("16>Find all the N bit binary numbers having more than or equal 1’s than 0’s",getString(R.string.Find_all_the_N_bit_binary_numbers)));
        ListPattern2.add(new Pattern_java2("17> Remove all its adjacent duplicate characters recursively ",getString(R.string.Remove_all_its_adjacent_duplicate)));
        ListPattern2.add(new Pattern_java2("Codes related to Arrays",""));
        ListPattern2.add(new Pattern_java2("1>Find Largest element in an array",getString(R.string.Find_Largest_element_in_an_array)));
        ListPattern2.add(new Pattern_java2("2>Find Smallest Element in an Array",getString(R.string.Find_Smallest_Element_in_an_Array)));
        ListPattern2.add(new Pattern_java2("3>Find the Smallest and largest element in an array ",getString(R.string.Find_the_Smallest_and_largest)));
        ListPattern2.add(new Pattern_java2("4>Find Second Smallest Element in an Array ",getString(R.string.Find_Second_Smallest_Element_in_an_Array)));
        ListPattern2.add(new Pattern_java2("5>Calculate the sum of elements in an array ",getString(R.string.Calculate_the_sum_of_elements_in_an_array)));
        ListPattern2.add(new Pattern_java2("6>Reverse an Array ",getString(R.string.Reverse_an_Array)));
        ListPattern2.add(new Pattern_java2("7>Sort first half in ascending order and second half in descending ",getString(R.string.Sort_first_half_in_ascending)));
        ListPattern2.add(new Pattern_java2("8>Sort the elements of an array",getString(R.string.Sort_the_elements_of_an_array)));
        ListPattern2.add(new Pattern_java2("9>Finding the frequency of elements in an array",getString(R.string.Finding_the_frequency_of_elements_in_an_array)));
        ListPattern2.add(new Pattern_java2("10>Sorting elements of an array by frequency",getString(R.string.Sorting_elements_of_an_array_by_frequency)));
        ListPattern2.add(new Pattern_java2("11>Finding the Longest Palindrome in an Array",getString(R.string.Finding_the_Longest_Palindrome_in_an_Array)));
        ListPattern2.add(new Pattern_java2("12>Counting Distinct Elements in an Array",getString(R.string.Counting_Distinct_Elements_in_an_Array)));
        ListPattern2.add(new Pattern_java2("13>Finding  Repeating elements in an Array ",getString(R.string.Finding_Repeating_elements_in_an_Array)));
        ListPattern2.add(new Pattern_java2("14>Finding Non Repeating elements in an Array",getString(R.string.Finding_Non_Repeating_elements_in_an_Array)));
        ListPattern2.add(new Pattern_java2("15>Removing Duplicate elements from an array",getString(R.string.Removing_Duplicate_elements_from_an_array)));
        ListPattern2.add(new Pattern_java2("16>Finding Minimum scalar product of two vectors",getString(R.string.Finding_Minimum_scalar_product_of_two_vectors)));
        ListPattern2.add(new Pattern_java2("17>Finding Maximum scalar product of two vectors in an array ",getString(R.string.Finding_Maximum_scalar)));
        ListPattern2.add(new Pattern_java2("18>Counting the number of even and odd elements in an array",getString(R.string.Counting_the_number)));
        ListPattern2.add(new Pattern_java2("19>Find maximum product sub-array in a given array",getString(R.string.Find_maximum_product_sub_array)));
        ListPattern2.add(new Pattern_java2("20>Finding Arrays are disjoint or not",getString(R.string.Finding_Arrays_are_disjoint_or_not)));
        ListPattern2.add(new Pattern_java2("21>Determine Array is a subset of another array or not",getString(R.string.Determine_Array_is_a_subset)));
        ListPattern2.add(new Pattern_java2("22>Determine can all numbers of an array be made equal",getString(R.string.Determine_can_all_numbers_of_an)));
        ListPattern2.add(new Pattern_java2("23>Finding Minimum sum of absolute difference of given array",getString(R.string.Finding_Minimum_sum_of_absolute)));
        ListPattern2.add(new Pattern_java2("24>Sort an array according to the order defined by another array",getString(R.string.Sort_an_array_according_to_the_order)));
        ListPattern2.add(new Pattern_java2("25>Replace each element of the array by its rank in the array",getString(R.string.Replace_each_element_of_the_array)));
        ListPattern2.add(new Pattern_java2("26>Finding equilibrium index of an array",getString(R.string.Finding_equilibrium_index_of_an_array)));
        ListPattern2.add(new Pattern_java2("27>Rotation of elements of array- left and right",getString(R.string.Rotation_of_elements_of_array_left_and_right)));
        ListPattern2.add(new Pattern_java2("28>Block swap algorithm for array rotation",getString(R.string.Block_swap_algorithm_for_array_rotation)));
        ListPattern2.add(new Pattern_java2("29>Finding Circular rotation of an array by K positions",getString(R.string.Finding_Circular_rotation_of_an_array_by_K_positions)));
        ListPattern2.add(new Pattern_java2("Operation On String "," "));
        ListPattern2.add(new Pattern_java2("1>Check whether a character is a vowel or consonant",getString(R.string.Check_whether_a_character)));
        ListPattern2.add(new Pattern_java2("2>Check whether a character is a alphabet or not ",getString(R.string.Check_whether_a_character_is_a_alphabet_or_not)));
        ListPattern2.add(new Pattern_java2("3>Find the ASCII value of a character ",getString(R.string.Find_the_ASCII_value_of_a_character)));
        ListPattern2.add(new Pattern_java2("4>Length of the string without using strlen() function",getString(R.string.Length_of_the_string_without)));
        ListPattern2.add(new Pattern_java2("5>Toggle each character in a string",getString(R.string.Toggle_each_character_in_a_string)));
        ListPattern2.add(new Pattern_java2("6>Count the number of vowels",getString(R.string.Count_the_number_of_vowels)));
        ListPattern2.add(new Pattern_java2("7>Remove the vowels from a String ",getString(R.string.Remove_the_vowels_from_a_String)));
        ListPattern2.add(new Pattern_java2("8>Check if the given string is Palindrome or not",getString(R.string.Check_if_the_given_string_is_Palindrome_or_not)));
        ListPattern2.add(new Pattern_java2("9>Print the given string in reverse order ",getString(R.string.Print_the_given_string_in_reverse_order)));
        ListPattern2.add(new Pattern_java2("10>Remove all characters from string except alphabets",getString(R.string.Remove_all_characters_from_string_except_alphabets)));
        ListPattern2.add(new Pattern_java2("11>Remove spaces from a string ",getString(R.string.Remove_spaces_from_a_string)));
        ListPattern2.add(new Pattern_java2("12>Remove brackets from an algebraic expression ",getString(R.string.Remove_brackets_from)));
        ListPattern2.add(new Pattern_java2("13>Count the sum of numbers in a string",getString(R.string.Count_the_sum_of_numbers_in_a_string)));
        ListPattern2.add(new Pattern_java2("15>Calculate frequency of characters in a string",getString(R.string.Calculate_frequency_of_characters_in_a_string)));
        ListPattern2.add(new Pattern_java2("16>Find non-repeating characters in a string ",getString(R.string.Find_non_repeating_characters_in_a_string)));
        ListPattern2.add(new Pattern_java2("17>Check if two strings are Anagram or not",getString(R.string.Check_if_two_strings_are_Anagram_or_no)));
        ListPattern2.add(new Pattern_java2("18>Replace a sub-string in a string",getString(R.string.Replace_a_sub_string_in_a_string)));
        ListPattern2.add(new Pattern_java2("19>Replacing a particular word with another word in a string",getString(R.string.Replacing_a_particular_word)));
        ListPattern2.add(new Pattern_java2("Advanced Codes related to Arrays"," "));
        ListPattern2.add(new Pattern_java2("1>Replacing a particular word with another word in a string",getString(R.string.Replacing_a_particular_word)));
        ListPattern2.add(new Pattern_java2("2>Find the “Kth” max and min element of an array",getString(R.string.Find_the_Kth_max_and_min_element_of_an_array)));
        ListPattern2.add(new Pattern_java2("3>Move all the negative elements to one side of the array",getString(R.string.Move_all_the_negative)));
        ListPattern2.add(new Pattern_java2("4>Find the Union and Intersection of the two sorted arrays",getString(R.string.Find_the_Union_and_Intersection)));
        ListPattern2.add(new Pattern_java2("5>Find Largest sum contiguous Subarray",getString(R.string.Find_largest_sum_contiguous_Subarray)));
        ListPattern2.add(new Pattern_java2("6>Minimize the maximum difference between heights",getString(R.string.Minimize_the_maximum_difference_between_heights)));
        ListPattern2.add(new Pattern_java2("7>Minimum no. of Jumps to reach the end of an array",getString(R.string.Minimum_no_of_Jumps_to_reach_the_end_of_an_array)));
        ListPattern2.add(new Pattern_java2("8>Find duplicate in an array of N+1 Integers",getString(R.string.Find_duplicate_in_an_array_of_N_Integers)));
        ListPattern2.add(new Pattern_java2("9>Merge 2 sorted arrays without using extra space.",getString(R.string.Merge_2_sorted_arrays_without_using_extra_space_)));
        ListPattern2.add(new Pattern_java2("10>Kadane’s Algorithm",getString(R.string.Kadanes_Algorithm)));
        ListPattern2.add(new Pattern_java2("11>Merge Intervals",getString(R.string.Merge_Intervals)));
        ListPattern2.add(new Pattern_java2("12>Count Inversion",getString(R.string.Count_Inversion)));
        ListPattern2.add(new Pattern_java2("13>Find if there is any subarray with sum equal to 0",getString(R.string.Find_if_there_is_any_subarray)));
        ListPattern2.add(new Pattern_java2("14>Find factorial of a Large Number",getString(R.string.Find_factorial_of_a_Large_Number)));
        ListPattern2.add(new Pattern_java2("15>Find common elements In 3 sorted arrays",getString(R.string.Find_common_elements_In_3_sorted_arrays)));
        ListPattern2.add(new Pattern_java2("16>Maximum profit by buying and selling a share atmost twice ",getString(R.string.Maximum_profit_by_buying)));
        ListPattern2.add(new Pattern_java2("17>Find longest consecutive subsequence",getString(R.string.Find_longest_consecutive_subsequence)));
        ListPattern2.add(new Pattern_java2("18>Trapping Rain water problem",getString(R.string.Trapping_Rain_water_problem)));
        ListPattern2.add(new Pattern_java2("19>Smallest Subarray with sum greater than a given value",getString(R.string.Smallest_Subarray_with_sum_greater)));
        ListPattern2.add(new Pattern_java2("20>Three way partitioning of an array around a given value",getString(R.string.Three_way_partitioning)));
        ListPattern2.add(new Pattern_java2("21>Median of 2 sorted arrays of equal size",getString(R.string.Median_of_2_sorted_arrays_of_equal_size)));
        ListPattern2.add(new Pattern_java2("22>Median of 2 sorted arrays of different size",getString(R.string.Median_of_2_sorted_arrays_of_different_size)));
        ListPattern2.add(new Pattern_java2("Matrix"," "));
        ListPattern2.add(new Pattern_java2("1>Spiral traversal on a Matrix",getString(R.string.Spiral_traversal_on_a_Matrix)));
        ListPattern2.add(new Pattern_java2("2>Search an element in a matrix",getString(R.string.Search_an_element_in_a_matrix)));
        ListPattern2.add(new Pattern_java2("3>Find median in a row wise sorted matrix",getString(R.string.Find_median_in_a_row_wise_sorted_matrix)));
        ListPattern2.add(new Pattern_java2("4>Find row with maximum no. of 1’s",getString(R.string.Find_row_with_maximum_no__of_1s)));
        ListPattern2.add(new Pattern_java2("5>Print elements in sorted order using row-column wise sorted matrix",getString(R.string.Print_elements_in_sorted_order)));
        ListPattern2.add(new Pattern_java2("6>Find a specific pair in matrix",getString(R.string.Find_a_specific_pair_in_matrix)));
        ListPattern2.add(new Pattern_java2("7>Rotate matrix by 90 degrees",getString(R.string.Rotate_matrix_by_90_degrees)));
        ListPattern2.add(new Pattern_java2("8>Common elements in all rows of a given matrix ",getString(R.string.Common_elements_in_all_rows_of_a_given_matrix)));


        recyclerViewAdapter1 = new RecyclerViewAdapter1(getContext(),ListPattern2);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),1));
        recyclerView.setAdapter(recyclerViewAdapter1);


        return  rootView;
    }
}