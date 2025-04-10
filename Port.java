package Puerto;

import java.util.ArrayList;
import java.util.Scanner;

public class Port {
	
    // Atributos
	
    private ArrayList<Amarrament> amarraments;
    private ArrayList<Vaixell> vaixellsPendents;

    // Constructores
    
    public Port() {
        this.amarraments = new ArrayList<>();
        this.vaixellsPendents = new ArrayList<>();
    }
    
    public Port(ArrayList<Amarrament> amarraments, ArrayList<Vaixell> vaixellsPendents) {
        this.amarraments = amarraments;
        this.vaixellsPendents = vaixellsPendents;
    }
    
    public Port(Port altre) {
        this.amarraments = new ArrayList<>(altre.amarraments);
        this.vaixellsPendents = new ArrayList<>(altre.vaixellsPendents);
    }
    
    // Metodos
   
    public void afegirAmarrament(double longitud, double calada, String tipus) {
        Amarrament nou = new Amarrament(longitud, calada, tipus);
        amarraments.add(nou);
        System.out.println("Amarrament afegit: " + nou);
    }
    
    
    public void afegirVaixell(String matricula, double longitud, double calada, String tipus) {
        for (Vaixell v : vaixellsPendents) {
            if (v.getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println("Ja existeix un vaixell amb aquesta matrícula.");
                return;
            }
        }
        Vaixell nou;
        Scanner sc = new Scanner(System.in);
        if (tipus.equalsIgnoreCase("comercial")) {
            System.out.print("Introduce la peligrosidad del vaixell comercial (0 al 10): ");
            double perillositat = sc.nextDouble();
            sc.nextLine(); 
            nou = new VaixellComercial(matricula, longitud, calada, perillositat);
        } else if (tipus.equalsIgnoreCase("recreatiu")) {
            nou = new VaixellRecreatiu(matricula, longitud, calada);
        } else {
            System.out.println("Tipus de vaixell no reconegut.");
            return;
        }
        vaixellsPendents.add(nou);
        System.out.println("Vaixell afegit a la llista de pendents: " + nou);
    }

    


    public void assignarAmarrament() {
        ArrayList<Vaixell> assignats = new ArrayList<>();
        VaixellComercial ultimPerillós = null;
        for (Vaixell v : vaixellsPendents) {
            for (Amarrament a : amarraments) {
                if (a.getAssignat() == null && a.getTipus().equalsIgnoreCase(v.getTipus())) {
                    if (a.getLongitud() >= v.getLongitud() && a.getCalada() >= v.getCalada()) {
                        if (v instanceof VaixellComercial) {
                            VaixellComercial vc = (VaixellComercial) v;
                            if (vc.getPerillositat() > 7.0) {
                                if (ultimPerillós != null && ultimPerillós.getPerillositat() > 7.0) {
                                    continue; 
                                } else {
                                    a.setAssignat(v);
                                    assignats.add(v);
                                    ultimPerillós = vc;
                                    break;
                                }
                            }
                        }
                        a.setAssignat(v);
                        assignats.add(v);
                        break;
                    }
                }
            }
        }
        vaixellsPendents.removeAll(assignats);
        System.out.println(" Assignació realitzada. S'han assignat " + assignats.size() + " vaixells.");
    }
    
    public void alliberarAmarrament(String matricula) {
        boolean alliberat = false;
        for (Amarrament a : amarraments) {
            if (a.getAssignat() != null && a.getAssignat().getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println("Vaixell " + a.getAssignat().getMatricula() + " ha marxat.");
                a.setAssignat(null);
                alliberat = true;
                break;
            }
        }
        if (!alliberat) {
            System.out.println(" No s'ha trobat cap vaixell amb aquesta matrícula assignat a cap amarrament.");
        }
    }
  
    public void mostrarEstatAmarraments() {
        System.out.println("===== Estat d'Amarraments =====");
        for (Amarrament a : amarraments) {
            System.out.println(a);
        }
        System.out.println("\n===== Vaixells en espera d'assignació =====");
        if (vaixellsPendents.isEmpty()) {
            System.out.println("No hi ha vaixells pendents.");
        } else {
            for (Vaixell v : vaixellsPendents) {
                System.out.println(v);
            }
        }
    }
    
    // Getters i Setters
    public ArrayList<Amarrament> getAmarraments() {
        return amarraments;
    }
    public void setAmarraments(ArrayList<Amarrament> amarraments) {
        this.amarraments = amarraments;
    }
    
    public ArrayList<Vaixell> getVaixellsPendents() {
        return vaixellsPendents;
    }
    public void setVaixellsPendents(ArrayList<Vaixell> vaixellsPendents) {
        this.vaixellsPendents = vaixellsPendents;
    }
}
