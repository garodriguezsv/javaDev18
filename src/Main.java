import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 100;
        int n2,n3;
         n2 = ++n1;
         n3 = n1++ + --n2;

//        System.out.println("My first Java program at IntelliJ!");
        System.out.println("Digitar nuevo saludo personalizado");
        String saludo = sc.nextLine();
        /*
        * Esto es un comentario
        * */

        System.out.println("Cual es tu edad?");
        int dateOfBirth = sc.nextInt();
        System.out.println(saludo);
        System.out.println("Tu edad es: " + dateOfBirth);

        System.out.println("Primero n1 vale: " + n1);
        System.out.println("Primero n2 vale: " + n2);
        System.out.println("Primero n3 vale: " + n3);



    }
}