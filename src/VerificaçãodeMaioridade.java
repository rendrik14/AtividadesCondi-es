import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class VerificaçãodeMaioridade {
    public static void main(String[] args) {
        Integer idade = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Maior idade");
        }
        else if (idade < 18) {
            System.out.println("Menor idade");
        }
    }
}
