import java.util.Scanner;

public class CBBAtividadePratica6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int i = 0;
        int[] arrayNum = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            arrayNum[i] = num.nextInt();
        }

        int j = 0;

        System.out.println("\n\nNúmeros Digitados");
        while (j < arrayNum.length) {
            System.out.print(arrayNum[j] + " ");
            j++;
        }

        int k = 0;
        int max = arrayNum[k];
        int min = arrayNum[k];

        do {

            if(arrayNum[k] > max){
                max = arrayNum[k];
            }

            if(arrayNum[k] < min){
                min = arrayNum[k];
            }

            k++;

        } while (k < arrayNum.length);

        System.out.println("\n\nMaior valor: " + max + " Menor valor: " + min);

        num.close();
    }
}