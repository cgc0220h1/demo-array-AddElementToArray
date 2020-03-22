import java.util.Scanner;

public class NumberArray {
    public static int[] addElement(int[] array, int position, int value) {
        for (int index = array.length - 1; index > position; index--) {
            array[index] = array[index - 1];
        }
        array[position] = value;
        return array;
    }

    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] demoArray = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        boolean isValid = false;
        System.out.println("We got a demo array: ");
        displayArray(demoArray);
        System.out.println();

        System.out.print("Enter number you want to add: ");
        int input = scanner.nextInt();
        int position;

        do {
            System.out.print("Enter position you want to add: ");
            position = scanner.nextInt();
            if (position >= 0 && position < demoArray.length) {
                isValid = true;
            } else {
                System.out.printf("Invalid input. Please enter number in range (0 - %d)! \n", demoArray.length - 1);
            }
        } while (!isValid);

        System.out.println("Adding number to array ...");
        int[] resultArray = addElement(demoArray, position, input);
        System.out.println("New array: ");
        displayArray(resultArray);
    }
}
