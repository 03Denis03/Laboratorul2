import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemSolver {

    // Gasiti elementele comune din 2 siruri
    public static List<String> findCommonElements(String[] a, String[] b) {
        List<String> commonElements = new ArrayList<>();
        for (String elementA : a) {
            for (String elementB : b) {
                if (elementA.equals(elementB)) {
                    commonElements.add(elementA);
                    break;
                }
            }
        }
        return commonElements;
    }

    // Afisati numerele prime dintr-un sir de numere intregi
    public static void printPrimeNumbers(int[] numbers) {
        System.out.println("Numerele prime din sir sunt:");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    // Verifica daca un numar este prim
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Afisati sirul Fibonacci pana la numarul N
    public static void printFibonacciSequence(int N) {
        int a = 0, b = 1;
        System.out.println("Sirul Fibonacci pana la " + N + " este:");
        while (a <= N) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    // Verifica daca un cuvant este palindrom
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

