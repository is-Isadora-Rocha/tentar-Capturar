package tentarCapturar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TentarCapturar {

    public static void main(String[] args) {
        metodo1();
        System.out.println("Fim do programa!");

    }

    public static void metodo1(){
        System.out.println("Método 1 start");
        metodo2();
        System.out.println("Método 1 end");

    }

    public static void metodo2() {
        System.out.println("Método 2 start");
        Scanner sc = new Scanner(System.in);

        try {
            String [] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inválida!");
            e.printStackTrace();
            sc.next();
        }
        catch (InputMismatchException e){
            System.out.println("Erro de Input");
        }

        sc.close();
        System.out.println("Método 2 end");
    }
}
