package com.naresh.datastructures;

public class BinarySearch {
    public static void main(String[] args) {
        int sortedArray[] = {2,3,5,8,9,10,15,20,36,45,46,47,52,55,58};
        int findElement = 20;
        int findedIndex = binarySearch(sortedArray.length,findElement, sortedArray);
        System.out.println("Location will be:::"+findedIndex);
    }

    private static int binarySearch(int length, int findElement, int[] sortedArray) {
        int low = 0;
        int high = length-1;
        int mid = (low + high)/2;
        System.out.println("Length value is:::"+low+"::"+mid+":::"+high);
        while(low<=high){
            System.out.println("Mid value is:::"+mid);
            if(sortedArray[mid] == findElement){
                System.out.println("Found element at:::"+mid);
                return mid;
            }
            else if(findElement > sortedArray[mid]){
                low = mid+1;
            }else if(findElement < sortedArray[mid]){
                high = mid-1;
            }
            mid = (low + high)/2;
            System.out.println("Mid value is:hhh::"+mid);
        }

    return -1;

    }
}
