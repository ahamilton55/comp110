public class EqualateralTriangle extends Shapes {
    public EqualateralTriangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return 0.5 * this.width * this.height;
    }
}