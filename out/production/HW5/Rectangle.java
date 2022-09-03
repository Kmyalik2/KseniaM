public class Rectangle {
    double x;
    double y;
    String rectangleName;

    private static int createdRectangles;
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";
    public boolean printInRussian;

    public Rectangle (double x, double y, String rectangleName, boolean printInRussian) {
        this.x = x;
        this.y = y;
        this.rectangleName = rectangleName;
        this.printInRussian = printInRussian;
        createdRectangles++;
    }

    public Rectangle (double x, String rectangleName, boolean printInRussian) {
        this.x = x;
        this.y = x;
        this.rectangleName = rectangleName;
        this.printInRussian = printInRussian;
        createdRectangles++;
    }

    public double calculateArea () {
        return x*y;
    }

    public void printArea () {
        System.out.println("Square:" + calculateArea());
    }

    public void printRectangleKind () {
        if (x/y == 1) {
            System.out.println("This is square");
        }
        else System.out.println("This is rectangle");
    }

    public boolean isTheSameRectangle (Rectangle rectangle) {
        return (this.x == rectangle.x && this.y == rectangle.y) || (this.x == rectangle.y && this.y == rectangle.x);
    }

    public void rectangleParamsPrint () {
        System.out.println( this.rectangleName + ": x = " + this.x + "; y = " + this.y);
    }

    static void printRectanglesCount() {
        if (createdRectangles == 1) {
            System.out.println("There was " + createdRectangles + " rectangles created.");
        }
        else System.out.println("There were " + createdRectangles + " rectangles created.");
    }

    static void printClassName (boolean printInRussian) {
        if (printInRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        }
        else System.out.println(ENGLISH_CLASS_NAME);
    }
}
