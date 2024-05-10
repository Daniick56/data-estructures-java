import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int salario = 0;
        double descuento = 0;
        int estrato = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa tu Estrato: ");
        estrato = Integer.parseInt(input.nextLine());

        System.out.println("Ingresa tu Salario");
        salario = Integer.parseInt(input.nextLine());

        if (estrato < 0 || salario < 0){
            System.out.println("No se puede ingresar datos negativos");
        } else{

//        POR METODO CONDICIONALES
//            if (estrato >= 1 && estrato <= 2) {
//                descuento = 0.02;
//            } else if (estrato >= 3 && estrato <= 4){
//                descuento = 0.04;
//            } else if (estrato == 5){
//                descuento = 0.08;
//            } else if (estrato == 6){
//                descuento = 0.1;
//            } else {
//                System.out.println("Ese estrato no esta contemplado.");
//            }

            //        POR METODO SWITCH CASE:
            switch (estrato) {
                case 1:
                    //
                case 2:
                    descuento = 0.02;
                    break;
                case 3:
                    descuento = 0.04;
                    break;
                case 4:
                    //
                case 5:
                    descuento = 0.05;
                    break;
                case 6:
                    descuento = 0.1;
                    break;
                default:
                    System.out.println("Estrato no válido");
            }
            if (estrato >= 1 && estrato <= 6) {
                System.out.println("Tu descuento es del : " + Math.round(descuento * 100) + " Porciento" + "\nEso quiere decir que se te descuentan: "+ Math.round(salario*descuento));
            }
        }
    }
}