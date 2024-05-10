import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tipoVehiculo = 0;
        int antiguedad = 0;
        int anioActual = 2024;
        int modelo = 0;
        final double HAS_AUMENTO = 1.2;
        int sizeVehiculo = 0;
        int valorAPagar = 0;

        Scanner input = new Scanner(System.in);

        // Pidiendo tipo de vehiculo:
        do{
            System.out.println("Ingresa tu tipo de vehiculo:\n1: Automovil.\n2: Campero.\n3: Camioneta.");
            tipoVehiculo = Integer.parseInt(input.nextLine());
            if (tipoVehiculo <= 0 || tipoVehiculo >= 4){
                System.out.println("TIPO DE VEHICULO NO VALIDO.");
            }
        } while (tipoVehiculo <= 0 || tipoVehiculo >= 4);

        //pidiendo el modelo:
        do {
            System.out.println("Ingresa el modelo de tu vehiculo: ");
            modelo = Integer.parseInt(input.nextLine());
            antiguedad = anioActual - modelo;
            if (modelo < 0) {
                System.out.println("NO SE ACEPTAN VALORES NEGATIVOS.");
            }
        } while (modelo < 0);

        //haciendo la logica para condicionar el valor a pagar:
        switch (tipoVehiculo) {
            case 1:
                System.out.println("Ingresa el tamaño de tu vehiculo:\n 1: pequeño.\n 2: Mediano.\n 3: De lujo.");
                sizeVehiculo = Integer.parseInt(input.nextLine());
                // condicionando el tamaño en caso 1:
                switch (sizeVehiculo) {
                    case 1:
                        valorAPagar = 4000;
                        break;
                    case 2:
                        valorAPagar = 5000;
                        break;
                    case 3:
                        valorAPagar = 6000;
                        break;
                    default:
                        System.out.println("No existe el tamaño definido");
                }
                break;
            case 2:
                System.out.println("Ingresa el tamaño de tu vehiculo:\n 1: sencillo.\n 2: De lujo.");
                sizeVehiculo = Integer.parseInt(input.nextLine());
                // condicionando el tamaño en caso 2:
                switch (sizeVehiculo) {
                    case 1:
                        valorAPagar = 5000;
                        break;
                    case 2:
                        valorAPagar = 8000;
                        break;
                    default:
                        System.out.println("No existe el tamaño definido");
                }
                break;
            case 3:
                System.out.println("Ingresa el tamaño de tu vehiculo:\n 1: Cabina sencilla.\n 2: Doble Cabina.");
                sizeVehiculo = Integer.parseInt(input.nextLine());
                // condicionando el tamaño en caso 2:
                switch (sizeVehiculo) {
                    case 1:
                        valorAPagar = 6000;
                        break;
                    case 2:
                        valorAPagar = 8000;
                        break;
                    default:
                        System.out.println("No existe el tamaño definido");
                }

        }
        if(antiguedad >= 8){
            System.out.println("El valor de tu lavado es de: " + Math.round((valorAPagar * HAS_AUMENTO)));
        } else {
            System.out.println("El valor de tu lavado es de: " + valorAPagar);
        }
    }
}