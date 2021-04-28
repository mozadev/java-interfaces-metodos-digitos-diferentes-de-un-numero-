

public class SuperBeautifulNumber {

    // de la clase BeautifulNumber A =================================================
    public static int minimumNumberA(int n) {
        if (n < 1000 || n > 9000) {
            return 0;
        } else {

            boolean tieneNumdif;
            int contadorCoincidencias = 0;
            String numeroCadena = Integer.toString(n);
            for (int i = 0; i < numeroCadena.length() - 1; i++) {
                for (int j = 1; j < numeroCadena.length() - i; j++) {
                    if (numeroCadena.charAt(i) == numeroCadena.charAt(j + i)) {
                        contadorCoincidencias = contadorCoincidencias + 1;
                    }

                }
            }
            if (contadorCoincidencias > 0) {
                tieneNumdif = false;
            } else {
                tieneNumdif = true;
            }

            int resultado;
            if (tieneNumdif == true) {
                resultado = n;
            } else {
                resultado = minimumNumberA(n + 1);
            }
            //salida
            return resultado;

        }
    }

    // de la clase BeautifulNumber B ===============================================
    public static int minimumNumberB(int n) {
        int resultado;
        if (n < 1000 || n > 9000) {
            return 0;
        } else {

            if (isAllDifferentNumbers(n) == true) {
                resultado = n;
            } else {
                resultado = minimumNumberB(n + 1);
            }
            //salida
            return resultado;

        }
    }

    private static boolean isAllDifferentNumbers(int n) {
        boolean tieneNumdif;
        int contadorCoincidencias = 0;
        String numeroCadena = Integer.toString(n);
        for (int i = 0; i < numeroCadena.length() - 1; i++) {
            for (int j = 1; j < numeroCadena.length() - i; j++) {
                if (numeroCadena.charAt(i) == numeroCadena.charAt(j + i)) {
                    contadorCoincidencias = contadorCoincidencias + 1;
                }

            }
        }
        if (contadorCoincidencias > 0) {
            tieneNumdif = false;
        } else {
            tieneNumdif = true;
        }
        return tieneNumdif;
    }
    // de la clase BeautifulNumber C ===========================================
    
    public static int minimumNumberC(int n) {
        int resultado;
        if (n < 1000 || n > 9000) {
            return 0;
        } else {

            if (isAllDifferentNumbers(n) == true) {
                resultado = n;
            } else {
                resultado = minimumNumberB(n + 1);
            }
            //salida
            return resultado;

        }
    }

    // de la clase BeautifulNumber D ===============================================
    public static int minimumNumberD(int n) {
        int resultado;
        if (n < 10 || n > 99 ) {
            return 0;
        } else {

            if (isAllDifferentNumbers(n) == true && isValidPotencialtwoNumber(n)>=n ) {
                resultado = n;
            } else {
                resultado = minimumNumberB(n + 1);
            }
            //salida
            return resultado;

        }
    }

    private static double isValidPotencialtwoNumber(int x) {
        double resultado;
        int a = x / 10;
        int b = x % 10;
        resultado = Math.pow(a, b);

        return resultado;

    }

   

    // de la clase BeautifulNumber E ========================================
    public static int minimumNumberE(int n) {
        int resultado;
        if (n < 100 || n > 999) {
            return 0;}
      

         else {

            if (isAllDifferentNumbers(n) == true && isValidPotencialthreeNumber(n)>=n) {
                resultado = n;
            } else {
                resultado = minimumNumberB(n + 1);
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
}
