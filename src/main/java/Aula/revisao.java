package Aula;
// Antony
import java.util.Scanner;

public class revisao {

    public static void main(String[] args) {
        //variavel
        double height, Weight, imc, age;
        String name;
        //scanner
        Scanner entrada = new Scanner(System.in);
        //Sistema
        System.out.println("Qual o seu nome ?");
        name = entrada.nextLine();
        System.out.println("Qual o seu peso ?(Ex:66,00) ");
        Weight = entrada.nextDouble();
        System.out.println("Qual sua altura? (Ex: 1,90) ");
        height = entrada.nextDouble();
        System.out.println("Qual sua idade? ");
        age = entrada.nextDouble();
        //calculo imc
        imc = Weight / (height * height);
        //codigo que fala sua situação atual
        if (imc <= 18.5) {
            System.out.println("Olá " + name + ", seu Estado de Classificação atual é de Magreza, procure uma nutricionista.");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Olá " + name + ", Parabéns, sua Classificação Está Dentro do Normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Olá " + name + ", seu Estado de Classificação atual é de Sobrepeso I, procure uma nutricionista.");
        } else if (imc >= 30.0 && imc <= 39.9) {
            System.out.println("Olá " + name + ", seu Estado de Classificação atual é Obesidade II, procure uma nutricionista logo.");
        } else if (imc >= 40.0) {
            System.out.println("Olá " + name + ", seu Estado de Classificação atual é Obesidade Grave III, procure uma nutricionista URGENTE!!");
        }
        if (age <= 17) {
            System.out.println("Você ainda é menor de idade, comunique seus respónsaveis.");
        }

    }
}
