package Puerto;

public class Vaixell {
	
    // Atributos
	
    private String matricula;
    private double longitud;
    private double calada;
    
    // Constructores
    
    public Vaixell(String matricula, double longitud, double calada) {
        this.matricula = matricula;
        this.longitud = longitud;
        this.calada = calada;
    }
    
    public Vaixell(Vaixell altre) {
        this(altre.matricula, altre.longitud, altre.calada);
    }
    
    @Override
    public String toString() {
        return "Vaixell [Matricula=" + matricula + ", Longitud=" + longitud + ", Calada=" + calada + "]";
    }
    
    // Getters i Setters
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    public double getCalada() {
        return calada;
    }
    public void setCalada(double calada) {
        this.calada = calada;
    }
    
    public String getTipus() {
        return "Indefinido";
    }
}
