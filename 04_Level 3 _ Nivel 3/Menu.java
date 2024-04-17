import java.util.Scanner;
public class Menu{
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[]args){
        while(menu()!=3){}
    }
    public static int menu(){
        System.out.println("\nOpciones:");
        System.out.print("1.Uno\n2.Dos\n3.Tres (Acaba el programa.)\n\nElección: ");
        int option=scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1:
                System.out.println("Eligió la opción 1");
                return 1;
            case 2:
                System.out.println("Eligió la opción 2");
                return 2;
            case 3:
                System.out.println("Eligió la opción 3");
                return 3;
            default:
                System.out.println("Eligió una opción fuera del rango (1-3): " + option);
                return option;
        }
    }
}