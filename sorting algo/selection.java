import java.util.Scanner;

public class selection {

    public static void selectionSort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            int minPos = i;
            for (int j=i+1; j<arr.length-1; j++){
                if (arr[minPos] > arr[j]) {
                    minPos = j; 
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
        selectionSort(arr);
        printarr(arr);     
    }
}