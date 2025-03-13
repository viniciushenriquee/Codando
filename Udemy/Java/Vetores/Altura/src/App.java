import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int [] idades = new int[n];
        double[] altura = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("nome: ");
            nomes[i] = sc.next();
            System.out.print("idade: ");
            idades[i] = sc.nextInt();
            System.out.print("altura: ");
            altura[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for(int i = 0; i < n; i++){
            soma = soma + altura[i];
        }
         double mediaAltura = soma / n;
        
        
        System.out.printf("Altura media:  %.2f%n", mediaAltura);

        int cont = 0;
        for(int i = 0; i < n; i++){
            if (idades[i] < 16) {
                cont = cont + 1;
            }
        }

        double porcent = cont * 100 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcent);


        for(int i = 0; i < n; i++){
            if(idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }

}