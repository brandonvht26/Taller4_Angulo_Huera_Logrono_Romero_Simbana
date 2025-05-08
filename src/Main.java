import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la velocidad: ");
        float velocidad = sc.nextFloat();
        sc.nextLine();
        System.out.println("Ingrese el modelo: ");
        String  modelo= sc.nextLine();

        // Crear Objeto

        Vehiculo vehiculo1= new Vehiculo(velocidad, modelo);

        String mensaje = vehiculo1.controlarVelocidad(velocidad); // Tomar el valor del método en una variable

        System.out.println("\nDel vehiculo " + modelo + ":\n");
        System.out.println(mensaje);

        sc.close();

    }

}
