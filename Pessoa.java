import java.util.InputMismatchException;
import java.util.Scanner;

public class Pessoa {
    static String nome;
    static double peso;
    static double altura;
    static double imc;
    static double resultado;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        do{
            try{
                System.out.println("Digite seu nome: ");
                nome = sc.nextLine();
                System.out.println("Digite o número doseu peso arredondado: ");
                peso = sc.nextDouble();
                System.out.println("Digite o número da sua altura em cm: ");
                altura = sc.nextDouble();

                imc = peso/(altura*altura);
                resultado = imc * 10000;

                System.out.println(nome + " o número de seu IMC é: " + Math.round(resultado));
                loop = false;

            }
            catch(InputMismatchException e){
                System.err.println("################################# \nExceção gerada: " + e + "\nNão foi possível armazenar esse dado!"+
                        "\nO programa irá reiniciar");
                sc.nextLine();
                System.out.println("#################################");
                loop = true;

            }
            catch(ArithmeticException e){
                System.err.println("---------------------------------- \nExceção gerada: " + e + "\nInforme um valor maior que zero!"+
                        "\nO programa irá reiniciar");

                System.out.println("----------------------------------");

            }
        } while (loop);
    }
}