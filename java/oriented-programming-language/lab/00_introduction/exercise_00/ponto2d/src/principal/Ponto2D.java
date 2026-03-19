package principal;

public class Ponto2D {

    private double x;
    private double y;
    
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distancia(Ponto2D outro) {
        double dx = this.x - outro.x;
        double dy = this.y - outro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
