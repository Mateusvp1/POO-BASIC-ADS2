//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Scanner;

public class exemplo5 {
    public exemplo5() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList();
        System.out.println("Digite o primeiro numero:");
        int num = Integer.parseInt(scanner.nextLine());
        nums.add(num);
        System.out.println("Digite o segundo numero:");
        int num2 = Integer.parseInt(scanner.nextLine());
        nums.add(num2);

        try {
            int soma = num + num2;
            int subtraçao = num - num2;
            int divisao = num / num2;
            int mult = num * num2;
            System.out.println("Resultado: " + soma);
            System.out.println("Resultado: " + subtraçao);
            System.out.println("Resultado: " + divisao);
            System.out.println("Resultado: " + mult);
        } catch (ArithmeticException var9) {
            System.out.println("Erro: ArithmeticException - Divisão por zero não é permitida.");
        }

    }
}
