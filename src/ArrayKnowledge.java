import java.util.Arrays;
import java.util.Scanner;

public class ArrayKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputOfString = in.nextLine();
        stringToArray(inputOfString);
        char[] charArray = stringToArray(inputOfString);
        System.out.println(Arrays.toString(charArray));

        Scanner secondIn = new Scanner(System.in);
        System.out.print("Enter a start integer: ");
        int start = secondIn.nextInt();
        Scanner thirdIn = new Scanner(System.in);
        System.out.print("Enter a end integer: ");
        int end = thirdIn.nextInt();
        Scanner fourthIn = new Scanner(System.in);
        System.out.print("Enter a step integer: ");
        int step = fourthIn.nextInt();
        int[] anArrayForArrayWithBounds = generateArrayWithBounds(start, end, step);
        System.out.println(Arrays.toString(anArrayForArrayWithBounds));


    }

    public static char[] stringToArray(String inputOfString) {
        char[] charArray = inputOfString.toCharArray();
        return charArray;
    }

    public static int[] generateArrayWithBounds(int start, int end, int step) {
        int count = 0;
        for (int i = start; i < end; i = i + step) {
            count = count + 1;
        }
        int[] anArrayForArrayWithBounds = new int[count];
        for (int j = 0; j < count; j = j + 1) {
            anArrayForArrayWithBounds[j] = start;
            start = start + step;
        }
        return anArrayForArrayWithBounds;
    }
}
