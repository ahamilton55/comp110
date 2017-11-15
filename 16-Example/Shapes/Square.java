public class Square extends Shapes {
    public Square(int s) {
        width = s;
        height = s;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (2 * width) + (2 * height);
    }

    public void add(Square sq) {
        width += sq.width;
        height += sq.height;
    }

    public static void main(String[] args) {
        Shapes shape = new Square(4);
        Square sq = new Square(5);
        System.out.println("Area " + shape.area());
        Square sq2 = (Square)shape;
        System.out.println("Perimeter " + sq2.perimeter());
        sq2.add(sq2);
        System.out.println("Perimeter " + sq2.perimeter());
        
        shape = new EqualateralTriangle(4, 5);
        System.out.println("Area " + shape.area());
        System.out.println("Perimeter " + sq.perimeter());

    }
}