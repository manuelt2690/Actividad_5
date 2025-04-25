import java.util.Scanner;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CALCULADORA GEOMÉTRICA");
        System.out.println("Figuras disponibles:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.println("4. Rectángulo");
        System.out.println("5. Pentágono");
        System.out.print("Elija una figura (1-5): ");

        int figura = input.nextInt();

        System.out.println("\nOperaciones:");
        System.out.println("1. Calcular área");
        System.out.println("2. Calcular perímetro");
        System.out.print("Elija operación (1-2): ");
        int operacion = input.nextInt();

        double resultado = 0;

        switch (figura) {
            case 1: // Círculo
                System.out.print("Ingrese el radio: ");
                double radio = input.nextDouble();
                if (operacion == 1) {
                    resultado = Math.PI * radio * radio;
                    System.out.println("Área del círculo: " + resultado);
                } else {
                    resultado = 2 * Math.PI * radio;
                    System.out.println("Perímetro del círculo: " + resultado);
                }
                break;

            case 2: // Cuadrado
                System.out.print("Ingrese el lado: ");
                double lado = input.nextDouble();
                if (operacion == 1) {
                    resultado = lado * lado;
                    System.out.println("Área del cuadrado: " + resultado);
                } else {
                    resultado = 4 * lado;
                    System.out.println("Perímetro del cuadrado: " + resultado);
                }
                break;

            case 3: // Triángulo
                System.out.print("Ingrese la base: ");
                double base = input.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = input.nextDouble();
                if (operacion == 1) {
                    resultado = (base * altura) / 2;
                    System.out.println("Área del triángulo: " + resultado);
                } else {
                    System.out.print("Ingrese los 3 lados (separados por espacio): ");
                    double l1 = input.nextDouble();
                    double l2 = input.nextDouble();
                    double l3 = input.nextDouble();
                    resultado = l1 + l2 + l3;
                    System.out.println("Perímetro del triángulo: " + resultado);
                }
                break;

            case 4: // Rectángulo
                System.out.print("Ingrese la base: ");
                double b = input.nextDouble();
                System.out.print("Ingrese la altura: ");
                double h = input.nextDouble();
                if (operacion == 1) {
                    resultado = b * h;
                    System.out.println("Área del rectángulo: " + resultado);
                } else {
                    resultado = 2 * (b + h);
                    System.out.println("Perímetro del rectángulo: " + resultado);
                }
                break;

            case 5: // Pentágono
                System.out.print("Ingrese el lado: ");
                double l = input.nextDouble();
                if (operacion == 1) {
                    System.out.print("Ingrese la apotema: ");
                    double apotema = input.nextDouble();
                    resultado = (5 * l * apotema) / 2;
                    System.out.println("Área del pentágono: " + resultado);
                } else {
                    resultado = 5 * l;
                    System.out.println("Perímetro del pentágono: " + resultado);
                }
                break;

            default:
                System.out.println("Opción no válida");
        }

        input.close();
    }
}