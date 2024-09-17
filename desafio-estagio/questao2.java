import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();
        
        int a = 0, b = 1;
        boolean pertence = false;

        if (numero == 0 || numero == 1) {
            pertence = true;
        } else {
            while (b <= numero) {
                int temp = b;
                b = a + b;
                a = temp;
                if (b == numero) {
                    pertence = true;
                    break;
                }
            }
        }

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
