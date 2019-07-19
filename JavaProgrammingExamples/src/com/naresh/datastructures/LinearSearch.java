package com.naresh.datastructures;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,4,7,4,9,3,10,8,33};
        int findElement = 34;
        int index = findElement(arr, findElement);
        if(index == -1){
            System.out.println("Element not found");
        }
    }

    private static int findElement(int[] arr, int findElement) {
        int i=0;
        while(i<arr.length){
            if(arr[i] == findElement){
                System.out.println("Found element:::"+i);
                return i;
            }
           i++;
        }
        return -1;
    }
}
