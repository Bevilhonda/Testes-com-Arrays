public class Contarzeros {
    public static void main(String[] args) {
        int [] num = {0,1,4,17,0,35,34,67,45,35,0,1,6,4,200,0};
        int meunumero=0;
        int contar = 0;
        for (int i = 0 ; i < num.length;i++){
            if (num[i] == meunumero){
                contar++;
            }
        }
        System.out.println(contar);
    }
}
