package ua.lvlup.homework;


public class Homework_3 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int counter = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = counter;
            counter++;
        }

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = counter - 1;
            counter--;
        }

        int[][] arr2 = new int[][] {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}, {11, 12 ,13 ,14, 15}};

    }
}
