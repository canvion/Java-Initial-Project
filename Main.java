package Puerto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Port port = new Port();
        
        int opcio;
        do {
            System.out.println("\n MENÚ PRINCIPAL DEL PORT ");
            System.out.println("1. Afegir amarrament");
            System.out.println("2. Afegir vaixell");
            System.out.println("3. Assignar amarraments");
            System.out.println("4. Alliberar amarrament");
            System.out.println("5. Mostrar estat d'amarraments");
            System.out.println("6. Sortir");
            System.out.print("Tria una opció: ");
            opcio = sc.nextInt();
            sc.nextLine();
            
            switch (opcio) {
                case 1:
                    System.out.print("Longitud de l'amarrament: ");
                    double longA = sc.nextDouble();
                    System.out.print("Calada de l'amarrament: ");
                    double calA = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Tipus d'amarrament (Comercial/Recreatiu): ");
                    String tipusA = sc.nextLine();
                    port.afegirAmarrament(longA, calA, tipusA);
                    break;
                case 2:
                    System.out.print("Matricula del vaixell: ");
                    String matricula = sc.nextLine();
                    System.out.print("Longitud del vaixell: ");
                    double longV = sc.nextDouble();
                    System.out.print("Calada del vaixell: ");
                    double calV = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Tipus de vaixell (Comercial/Recreatiu): ");
                    String tipusV = sc.nextLine();
                    port.afegirVaixell(matricula, longV, calV, tipusV);
                    break;
                case 3:
                    port.assignarAmarrament();
                    break;
                case 4:
                    System.out.print("Introdueix la matricula del vaixell que surt: ");
                    String matSortida = sc.nextLine();
                    port.alliberarAmarrament(matSortida);
                    break;
                case 5:
                    port.mostrarEstatAmarraments();
                    break;
                case 6:
                    System.out.println(" Sortint...");
                    break;
                default:
                    System.out.println("Opció invàlida.");
            }
        } while (opcio != 0);
        sc.close();
    }
}

