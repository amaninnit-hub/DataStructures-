/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

public class BinarySearch {
    
    public static int search(int[] array, int target){
        int low = 0; 
        int high = array.length - 1;
        
        while(low <= high){
            int mid = (low + high) / 2;
            
            if (array[mid] == target){
                return mid;
            } else if (array[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}


