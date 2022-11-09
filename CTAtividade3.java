public class CTAtividade3 {
    public static void main(String[] args){
        int[] notas = {10, 9, 8, 7, 7, 3, 4, 5, 9, 3};
        int soma = 0;
        for (int nota = 0; nota<notas.length; nota++){
            soma += notas[nota];
        }

        double media = soma/notas.length;

        int notasAcima = 0;
        int notasAbaixo = 0;
        for (int nota = 0; nota<notas.length; nota++){
            if(notas[nota] > media){
                notasAcima += 1;
            } else if (notas[nota] < media){
                notasAbaixo += 1;
            }
        }
        System.out.println("A média é " + media + ", " + notasAcima + " foram acima da média e " + notasAbaixo + " foram abaixo da média");
    }
}
