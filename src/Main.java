import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        int sum = calculateSum(numbers, 0);
        System.out.println("Sum of the numbers: " + sum);
    }
    public static int calculateSum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + calculateSum(arr, index + 1);
    }
}
