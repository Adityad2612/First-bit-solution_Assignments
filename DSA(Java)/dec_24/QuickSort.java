package dec_24;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) { //0.000017

        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter size of array");
        size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0, end = size - 1;

        // -------- START TIME --------
        long startTime = System.nanoTime();

        quickSort(arr, start, end);
        dividingPoint(arr, start, end);

        // -------- END TIME --------
        long endTime = System.nanoTime();

        System.out.println("After sorting array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        long timeTaken = endTime - startTime;
        System.out.println("\nTime taken (nanoseconds): " + timeTaken);
        System.out.println("Time taken (milliseconds): " + (timeTaken / 1_000_000.0));
    }

    private static void dividingPoint(int[] arr, int start, int end) {
        if (start < end) {
            int d = quickSort(arr, start, end);
            dividingPoint(arr, start, d - 1);
            dividingPoint(arr, d + 1, end);
        }
    }

    private static int quickSort(int[] arr, int start, int end) {

        int pivot = arr[start];
        int i, j;
        j = end;
        i = start + 1;
        int temp;

        while (i <= j) {
            while (i <= end && arr[i] < pivot)
                i++;
            while (j >= 0 && arr[j] > pivot)
                j--;
            if (i < j) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        temp = arr[start];
        arr[start] = arr[j];
        arr[j] = temp;

        return j;
    }
}
