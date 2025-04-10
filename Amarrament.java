package Puerto;

public class Amarrament {
	
    // Atributos
	
    private static int idNext = 1;
    private int id;
    private double longitud;
    private double calada;
    private String tipus;
    private Vaixell assignat; 
    
    // Constructores
    
    public Amarrament() {
        this(0.0, 0.0, ""); 
    }
    
    public Amarrament(double longitud, double calada, String tipus) {
        this.id = idNext++;
        this.longitud = longitud;
        this.calada = calada;
        this.tipus = tipus;
        this.assignat = null;
    }
    
    public Amarrament(Amarrament altre) {
        this.id = altre.id;
        this.longitud = altre.longitud;
        this.calada = altre.calada;
        this.tipus = altre.tipus;
        this.assignat = altre.assignat;
    }
    
    @Override
    public String toString() {
        String estat = (assignat == null) ? "Lliure" : "Ocupat per: " + assignat;
        return "Amarrament [ID=" + id + ", Longitud=" + longitud + ", Calada=" + calada +
               ", Tipus=" + tipus + ", Estat=" + estat + "]";
    }
    
    // Getters i Setters
    public int getId() {
        return id;
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
        return tipus;
    }
    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
    
    public Vaixell getAssignat() {
        return assignat;
    }
    public void setAssignat(Vaixell assignat) {
        this.assignat = assignat;
    }
}
