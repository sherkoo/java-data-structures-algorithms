package com.example.bubblesort;

public class HelloApplication {

    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};

        // do this as long as int is greater than zero, and decrement
        // we use -1 to sort the last item in the array
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = 0; i < lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i + 1);
                }
            }
        }

        // print array
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}