public class Circle extends Point{
    private double r;

    public double getR() {
        return r;
    }

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }
    public Object Clone(){
        Circle c = new Circle(x, y, r);
        return c;
    }
    public boolean equals(Circle circle){
        if(this.x == circle.x && this.y == circle.y && this.r == circle.r){
            return true;
        }else{
            return false;
        }
    }
    public double square(){
        double s;
        s = 3.14 * r * r;
        return s;
    }
    public String toString(){
        return "(" + x + ";" + y + ")";
    }
}
