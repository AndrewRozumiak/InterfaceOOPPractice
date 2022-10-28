public class Point implements ICloneable, IEquatable{
    protected double x;
    protected double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public Object Clone(){
        Point p = new Point(x, y);
        return p;
    }
    @Override
    public boolean equals(Point p2){
        if(this.x == p2.x && this.y == p2.y){
            return true;
        }else{
            return false;
        }
    }
    public boolean equals(Circle c){
        return false;
    }
    public String toString(){
        return "(" + x + ";" + y + ")";
    }
}
