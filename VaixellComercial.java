package Puerto;

public class VaixellComercial extends Vaixell {
    private double perillositat; 

    //Constructores
    
    public VaixellComercial(String matricula, double longitud, double calada, double perillositat) {
        super(matricula, longitud, calada);
        this.perillositat = perillositat;
    }
    
    public VaixellComercial(VaixellComercial altre) {
        super(altre);
        this.perillositat = altre.perillositat;
    }
    
    @Override
    public String toString() {
        return "Vaixell Comercial [Matricula=" + getMatricula() + ", Longitud=" + getLongitud() + 
               ", Calada=" + getCalada() + ", Perillositat=" + perillositat + "]";
    }
    
    @Override
    public String getTipus() {
        return "Comercial";
    }
    
    // Getters i Setters
    
    public double getPerillositat() {
        return perillositat;
    }
    public void setPerillositat(double perillositat) {
        this.perillositat = perillositat;
    }
}
