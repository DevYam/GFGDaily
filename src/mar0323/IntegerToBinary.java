package mar0323;

import java.util.Scanner;

/**
 * This is a java program that converts a given integer
 * value to its binary equivalent using Integer.toBinaryString
 * built in method
 */
public class IntegerToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to convert to binary");

        String providedValue = sc.next();
        int providedValueAsInt = Integer.parseInt(providedValue);

        String provideValueAsBinary = Integer.toBinaryString(providedValueAsInt);
        System.out.println("Binary equivalent for " + providedValue + " = " + provideValueAsBinary);
    }
}
