public class Main {
    public static void main(String[] args) {

        Point firstPoint = new Point(3.5, 4.5);//Створюємо першу точку
        Point secondPoint = (Point)firstPoint.Clone();//Клонуємо першу точку

        Circle firstCircle = new Circle(2.5, 3.1, 2.2);//створюємо коло
        Circle secondCircle = new Circle(1.4, 2.6, 3.1);//створюємо друге коло

        System.out.println("First point(x, y) = " + firstPoint.toString());//виводимо першу точку
        System.out.println("Second point(x, y) = " + secondPoint.toString());//виводимо другу точку
        System.out.println("Is equals = " + firstPoint.equals(secondPoint));//перевіряємо точки на рівність

        System.out.println("First circle(x;y) : " + firstCircle.toString() + "\nRadius = " + firstCircle.getR());//Виводимо перше коло
        System.out.println("Second circle(x;y) : " + secondCircle.toString() + "\nRadius = " + secondCircle.getR());//Виводимо друге коло
        System.out.println("Is equals = " + firstCircle.equals(secondCircle));//перевіряємо кола на рівність
        System.out.println("First circle square = " + firstCircle.square());//виводимо площу першого кола
    }
}