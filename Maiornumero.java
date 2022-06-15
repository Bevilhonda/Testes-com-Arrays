import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Maiornumero {

    public static void main(String[] args) {
        int [] numeros = {0,200,4,9,23,45,909,230,447,1002,900,1200};
        int numeromaior = mostrarmaior(numeros);
        System.out.println(numeromaior);

        ArrayList<Integer> resultados_na_ordem = new ArrayList<>();
    }
    public static int mostrarmaior(int[] numeros) {
        int maior =0;
        for (int i = 0;i < numeros.length ; i++) {

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }
}
