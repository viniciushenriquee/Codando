import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        int[] vet = new int[n];

         System.out.println("Digite os numeros: ");
            for (int i = 0; i < n; i++){
            vet[i] = sc.nextInt();
        }

        System.out.println("Negativos: ");
        for(int i = 0; i < n; i++){
            if(vet[i] < 0 ){
                System.out.println(vet[i]);
            }
        }
        sc.close();
    }
}
