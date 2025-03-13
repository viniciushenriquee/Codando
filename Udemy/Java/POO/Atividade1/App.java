import java.util.*;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Retangulo rec = new Retangulo();

        System.out.println("Digite altura e largura: ");
        rec.height = input.nextDouble();
        rec.width = input.nextDouble();

        System.out.printf("Area = %.2f%n", rec.area());
        System.out.printf("perimetro = %.2f%n", rec.perimetro());
        System.out.printf("diagonal = %.2f%n", rec.diagonal());
        input.close();
    }
}
