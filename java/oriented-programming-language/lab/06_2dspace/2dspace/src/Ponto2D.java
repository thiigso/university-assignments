public class Ponto2D {

    private double x;
    private double y;

    public Ponto2D(){
        this.x = 0;
        this.y = 0;
    }
    
    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distancia(Ponto2D point){
        double dx = point.x - x;
        double dy = point.y - y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}