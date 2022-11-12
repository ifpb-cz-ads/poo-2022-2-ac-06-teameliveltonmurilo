public class CBBAtividadePratica5{
    public static void main(String[] args) {
        String[] diasSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        int i = 0;

        System.out.println("Implementação com While\n");
        while(i < diasSemana.length){
            System.out.println(diasSemana[i]);
            i++;
        }

        int k = 0;

        System.out.println("\nImplementação com Do while\n");
        do{
            System.out.println(diasSemana[k]);
            k++;
        }while(k < diasSemana.length);

        int j = 0;
        System.out.println("\nImplementação com for\n");
        for(j = 0; j < diasSemana.length; j++){
            System.out.println(diasSemana[j]);
        }
    }
}