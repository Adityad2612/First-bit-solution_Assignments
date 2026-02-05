package dec_24;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction; 

public class UsingForkJoin {

    public static void main(String[] args) {

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

        // -------- TIME START --------
        long startTime = System.nanoTime();

        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new ForkJoinTask(arr, start, end));

        // -------- TIME END --------
        long endTime = System.nanoTime();

        System.out.println("After sorting array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        long timeTaken = endTime - startTime;
        System.out.println("\nTime taken (nanoseconds): " + timeTaken);
        System.out.println("Time taken (milliseconds): " + (timeTaken / 1_000_000.0));
    }

    // -------- UNCHANGED LOGIC --------
    static void dividingPoint(int[] arr, int start, int end) {
        if (start < end) {
            int d = quickSort(arr, start, end);
            dividingPoint(arr, start, d - 1);
            dividingPoint(arr, d + 1, end);
        }
    }

    // -------- ONLY static visibility change --------
    static int quickSort(int[] arr, int start, int end) {

        int pivot = arr[start];
        int i = start + 1;
        int j = end;
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

/* ---------------- REQUIRED ADDITION ---------------- */
class ForkJoinTask extends RecursiveAction {

    int[] arr;
    int start, end;

    ForkJoinTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() { //0.0027993 seconds

        if (start < end) {
            int d = UsingForkJoin.quickSort(arr, start, end);

            ForkJoinTask left = new ForkJoinTask(arr, start, d - 1);
            ForkJoinTask right = new ForkJoinTask(arr, d + 1, end);

            invokeAll(left, right); // 🔥 fork + join
        }
    }
}
