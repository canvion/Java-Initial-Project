package Puerto;

public class VaixellRecreatiu extends Vaixell {
    public VaixellRecreatiu(String matricula, double longitud, double calada) {
        super(matricula, longitud, calada);
    }
    
    // Constructores
    
    public VaixellRecreatiu(VaixellRecreatiu altre) {
        super(altre);
    }
    
    @Override
    public String toString() {
        return "Vaixell Recreatiu [Matricula=" + getMatricula() + ", Longitud=" + getLongitud() + 
               ", Calada=" + getCalada() + "]";
    }
    
    @Override
    public String getTipus() {
        return "Recreatiu";
    }
}
