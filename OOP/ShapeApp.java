public class ShapeApp {
    public static void main(String[] args) {
        

        var shape = new Shape();
        System.out.println(shape.getCorner()); // parent

        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner()); // child (override)
        System.out.println(rectangle.getParentCorner()); // akses parent class yg udah di override pakai super keyword

    }
}
