import java.util.Scanner;

public class LogicKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = in.nextInt();
        Scanner secondIn = new Scanner(System.in);
        System.out.print("Enter a second string: ");
        int b = secondIn.nextInt();
        Scanner thirdIn = new Scanner(System.in);
        System.out.print("Enter a third integer: ");
        int c = thirdIn.nextInt();
        System.out.println(greenTicket(a, b, c));

        Scanner fourthIn = new Scanner(System.in);
        System.out.print("Enter a number of small chocolates: ");
        int small = fourthIn.nextInt();
        Scanner fifthIn = new Scanner(System.in);
        System.out.print("Enter a number of large chocolates: ");
        int large = fifthIn.nextInt();
        Scanner sixthIn = new Scanner(System.in);
        System.out.print("Enter a goal of chocolates: ");
        int goal = sixthIn.nextInt();
        System.out.println(makeChocolate(small, large, goal));
    }

    public static int greenTicket(int a, int b, int c) {
        int count = 0;
        if (a == b && a == c & c == b) {
            count = 20;
        } else if (b == a || b == c || c == a) {
            count = 10;
        } else {
            count = 0;
        }
        return count;
    }

    public static int makeChocolate(int small, int large, int goal) {
        int countForSmallChocolate = 0;
        while (goal - 5 > 0) {
            large = large - 1;
            goal = goal - 5;
        }
        while (goal > 0 && small > 0) {
            small = small - 1;
            goal = goal - 1;
            countForSmallChocolate = countForSmallChocolate + 1;
        }
        if (small == 0 && goal != 0) {
            return -1;
        } else {
            return countForSmallChocolate;
        }
    }
}
