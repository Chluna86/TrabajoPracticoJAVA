import java.util.*;

public class Tomadatos {
    public static void datos() {
        System.out.println("Ingrese su Nombre:");
        Scanner entradaNombre = new Scanner(System.in);
        String nombre = entradaNombre.nextLine();

        System.out.println("Ingrese su Apellido:");
        Scanner entradaApellido = new Scanner(System.in);
        String apellido = entradaApellido.nextLine();

        System.out.println("Ingrese su Edad:");
        Scanner entradaEdad= new Scanner(System.in);
        int edad = entradaEdad.nextInt();

        System.out.println("Ingrese su Hobbie:");
        Scanner entradaHobbie= new Scanner(System.in);
        String hobbie = entradaHobbie.nextLine();

        System.out.println("Ingrese su editor de codigo preferido:");
        Scanner entradaEditor= new Scanner(System.in);
        String editor = entradaEditor.nextLine();

        System.out.println("Ingrese el SO que utiliza:");
        Scanner entradaSo= new Scanner(System.in);
        String so = entradaSo.nextLine();

        System.out.println("Su nombre es " + nombre);
        System.out.println("Su apellido es "+ apellido);
        System.out.println("Su edad es " + edad);
        System.out.println("Su hobbie es " + hobbie);
        System.out.println("Su su editor de codigo preferido es " + editor);
        System.out.println("El SO que utiliza es " + so);
    }
}
