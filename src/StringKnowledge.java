import java.util.Scanner;

public class StringKnowledge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a starting string: ");
        String a = in.nextLine();
        a = a.toLowerCase();
        Scanner secondIn = new Scanner(System.in);
        System.out.print("Enter a second string: ");
        String b = secondIn.nextLine();
        b = b.toLowerCase();
        System.out.println(endOther(a, b));
        Scanner thirdIn = new Scanner(System.in);
        System.out.println("Enter a String to check if a substring of length equal to or more than 2 repeats:");
        String toTest = thirdIn.nextLine();
        toTest = toTest.toLowerCase();
        System.out.println(findRepeats(toTest));
    }

    public static boolean endOther(String a, String b) {
        int lengthOfStartingString = a.length();
        int lengthOfSecondString = b.length();
        if (lengthOfSecondString <= lengthOfStartingString) {
            if (lengthOfStartingString - lengthOfSecondString == a.indexOf(b)) {
                if (a.contains(b)) {
                    return true;
                }
            }
        }
        if (lengthOfStartingString < lengthOfSecondString) {
            if (lengthOfSecondString - lengthOfStartingString == b.indexOf(a)) {
                if (b.contains(a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean findRepeats(String toTest) {
        int count = 0;
        String comparisonString = "";
        String secondComparisonString = "";
        for (int i = 0; i < toTest.length(); i++) {
            for (int j = i + 1; j < toTest.length(); j++) {
                comparisonString = toTest.substring(i, j + 1);
                if (comparisonString.equals(toTest)) {
                    break;
                }
                for (int a = 0; a < toTest.length(); a++) {
                    for (int b = a + 1; b < toTest.length(); b++) {
                        secondComparisonString = toTest.substring(a, b + 1);
                    }
                    if (comparisonString.equals(secondComparisonString)) {
                        if (comparisonString.length() > 2) {
                            count = count + 1;
                        }
                    }
                }
            }
        }
        if (count >= 2) {
            return true;
        }
        return false;
    }
}