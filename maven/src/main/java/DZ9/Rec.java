package DZ9;

import java.util.Arrays;

public class Rec {
    public static void main(String[] args) {
        
        int[] numbers = {12,22,17,14,18,33,54,69,34,23,2,5,68,99};
        System.out.println(Arrays.toString(numbers));
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        System.out.println(Arrays.toString(output(numbers, 20)));
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

    static int[] output(int[] array, int n){
        int count =0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<n){
                count++;
            }
        }
        int[] newNunbers=new int[count];
        for (int i = 0; i < newNunbers.length; i++) {
           if(array[i]<n){
            newNunbers[i] = array[i];
           }
        }
        return newNunbers;
    }
}
