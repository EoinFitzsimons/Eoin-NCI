package arrayindexoutofboundsexception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionEG {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int[] array = getArray();
        
        // Prompt the user to enter the index of the array
        System.out.print("Enter the index you want the number of: ");
        
        try {
            System.out.println("The element value is " + array[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds.");
        }
    }

    public static int[] getArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        return array;
    }
}
