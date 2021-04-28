

public class BeautifulNumberB implements MInimumNumberInterface {

    public  int minimumNumber(int n) {
        int resultado;
        if (n < 1000 || n > 9000) {
            return 0;
        } else {

            if (isAllDifferentNumbers(n) == true) {
                resultado = n;
            } else {
                resultado = minimumNumber(n + 1);
            }
            //salida
            return resultado;

        }
    }

    private  boolean isAllDifferentNumbers(int n) {
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

}
