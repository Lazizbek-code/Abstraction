public class AbstractionTest {
    public static void main(String[] args) {
        Shape circle = new Circle(12);
        Shape rectangle = new Rectangle(5,6);

        System.out.printf("%f%n",circle.square());
        System.out.println(rectangle.square());
    }
}
