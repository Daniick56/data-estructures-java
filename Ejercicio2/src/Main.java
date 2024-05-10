import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int categoria = 0;
        double salario = 0;
        double bonificacion = 0;
        double descuento = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa tu categoría: ");
        categoria = Integer.parseInt(input.nextLine());

        System.out.println("Ingresa tu sueldo: ");
        salario = Integer.parseInt(input.nextLine());


        if (categoria >= 1 && categoria <= 4){
            switch (categoria) {
                case 1:
                    bonificacion = 0.15;
                    descuento = 0.02;
                    break;
                case 2:
                    bonificacion  = 0.1;
                    descuento = 0.015;
                    break;
                case 3:
                    bonificacion  = 0.08;
                    descuento = 0.01;
                    break;
                case 4:
                    bonificacion  = 0;
                    descuento = 0;
                    break;
                default:
                    System.out.println("Valor fuera del rango");
            }
            salario = salario + (salario * bonificacion) - (salario * descuento);
            System.out.println("Tu salario queda en: " + Math.round(salario));

        } else{
            System.out.println("Rango de categoria no disponible.");
        }
    }
}