package application;

import java.util.Scanner;
import services.PrintService;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        /*Instanciação do tipo (Integer utilizando Generics)
        para criação de listas com variáveis de outros tipos
        trocar Integer pela outro tipo*/
        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
