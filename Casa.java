import org.w3c.dom.ls.LSOutput;

public class Casa {

    public static void main(String[] args) {

        // Encontrar quantas veses a String casa aparece na String frase
        // fazer um print toda vez que aparece um caractere.
        // fazer um print toda vez que aparecer uma palavra

        String palavra = "casa";
        String frase = "A casa da quadra de cima tem teto verde. " +
                       "E o casarao do vizinho tem teto marrom. Tem casa bonita e tem casa feia.";
        String palavra_temporaria = "";
        String resposta = "";
        int contar = 0;

        for (int i=0;i<frase.length();i++) {

            if (frase.charAt(i) == ' ' || frase.charAt(i) == '.') {
                System.out.println("Achei uma Palavra que é á   " + palavra_temporaria);

                if (palavra_temporaria.equals(palavra)){
                    System.out.println("Achei a palavra que eu procurava   " + palavra_temporaria);
                    resposta = palavra_temporaria;
                    contar++;
                }
                palavra_temporaria = "";

            }
            else {
                System.out.println("Achei um caractere que é     " + frase.charAt(i));
                palavra_temporaria = palavra_temporaria.concat(String.valueOf(frase.charAt(i)));
            }
        }
        System.out.println(contar);
        System.out.println(resposta);
    }
}
