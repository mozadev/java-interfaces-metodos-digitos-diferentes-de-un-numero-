
import java.util.Scanner;


public class BeautifulNumberE {

    public static void main(String[] args) {
        // declaracion de variables
        int n;
        int resultado;
       

        boolean tieneNumDiff;
        // ingreso de variables
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el n: ");
        n = entrada.nextInt();

        // proceso
        resultado = minimumNumber(n);
        tieneNumDiff = isAllDifferentNumbers(n);
       
        
        // resultado
        System.out.println("minimo numero: " + resultado);
        System.out.println("tiene todos los numeros diferentes: " + tieneNumDiff);
        
    }

    public static int minimumNumber(int n) {
        int resultado;
        if (n < 100 || n > 999) {
            return 0;}
      

         else {

            if (isAllDifferentNumbers(n) == true && isValidPotencialthreeNumber(n)>=n) {
                resultado = n;
            } else {
                resultado = minimumNumber(n + 1);
            }
            // salida
            return resultado;

        }
    }

    private static double isValidPotencialthreeNumber(int x) {
        double resultado;
        double potencia;
        // (0<=a,b,c<=9)
        double a = x / 100; // obteniendo digito de las centenas
        double b = (x % 100) / 10; // obteniendo digito de las decenas
        double c = (x % 100) % 10; // obteniendo digito de las unidades
        potencia=Math.pow(b, c);
        resultado = Math.pow(a, potencia);// a elevado a la potencia de b elevado a la potencia de

        return resultado;

    }

    private static boolean isAllDifferentNumbers(int n) {
        boolean tieneNumDif;
        int contadorCoincidencias = 0;
        String numeroCadena = Double.toString(n);
        for (int i = 0; i < numeroCadena.length() - 1; i++) {
            for (int j = 1; j < numeroCadena.length() - i; j++) {
                if (numeroCadena.charAt(i) == numeroCadena.charAt(j + i)) {
                    contadorCoincidencias = contadorCoincidencias + 1;
                }

            }
        }
        if (contadorCoincidencias > 0) {
            tieneNumDif = false;
        } else {
            tieneNumDif = true;
        }
        return tieneNumDif;
    }

}
