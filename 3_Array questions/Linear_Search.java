// Time complexity :->  O(n)

public class Linear_Search {

    public static int linearsearch(int number[], int key) {

        for(int i=0; i<number.length; i++){
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int xyz[] = {2,4,6,8,10,12,14,16};
        int key = 10;
       int index = linearsearch(xyz, key);

       if (index == 1) {
        System.out.println("KEY NOT FOUND");
       }
       else {

        System.out.println("Key is at index : " + index);
       }
    }
}