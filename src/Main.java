import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProblemSolver ps = new ProblemSolver();

        String[] arrayA = {"java", "test", "university"};
        String[] arrayB = {"car", "university", "plane"};
        List<String> commonElements = ps.findCommonElements(arrayA, arrayB);
        System.out.println("Elementele comune sunt: " + commonElements);

        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        ps.printPrimeNumbers(numbers);

        System.out.print("Introduceti un numar pentru sirul Fibonacci: ");
        int N = scanner.nextInt();
        ps.printFibonacciSequence(N);


        System.out.print("Introduceti un cuvant pentru a verifica daca este palindrom: ");
        scanner.nextLine();
        String word = scanner.nextLine();
        boolean isPalindrom = ps.isPalindrome(word);
        if (isPalindrom) {
            System.out.println("Cuvantul este palindrom.");
        } else {
            System.out.println("Cuvantul nu este palindrom.");
        }

        scanner.close();
    }
}