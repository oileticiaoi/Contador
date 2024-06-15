package app;

import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Le os dois numeros inteiros
        System.out.println("Digite o primeiro numero"); int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero"); int num2 = scanner.nextInt();

        //imprime os  numeros incrementados se num1 <= num2
        if (num1 <= num2){ for (int i = num1; i <= num2; i++) { System.out.println("O primeiro numero deve ser menor ou igual ao segundo numero");


        }

            scanner.close();
        }
   }
}
