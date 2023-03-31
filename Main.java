import java.util.Scanner;

import service.Service;

public class Main {

    static Service service = new Service();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        menu();
    }


    private static void menu() {
        while(true) {
            System.out.println("1 - Loading the Tire ");
            System.out.println("2 - UnLoading the Tire ");
            System.out.println("3 - sair");

            System.out.print( "\n >>> : " );

            switch(scanner.nextInt() ) {
                case 1:
                    service.loading();
                    break;
                case 2:    
                    service.unloading();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
    
}
