public class Main {
    public static void main(String[] args) {
        Rectangle r0 = new Rectangle(3,4, "First", true);
        Rectangle.printRectanglesCount();
        Rectangle r1 = new Rectangle(5, "Second", false );
        Rectangle.printRectanglesCount();
        Rectangle r2 = new Rectangle(4,3, "Third", true);
        Rectangle.printRectanglesCount();
        System.out.println();

        r0.rectangleParamsPrint();
        r0.printClassName(r0.printInRussian);
        System.out.println();

        r1.rectangleParamsPrint();
        r1.printClassName(r1.printInRussian);
        System.out.println();

        r2.rectangleParamsPrint();
        r2.printClassName(r2.printInRussian);
        System.out.println();

        r0.calculateArea();
        r1.calculateArea();
        r2.calculateArea();

        r0.printArea();
        r1.printArea();
        r2.printArea();

        r0.printRectangleKind();
        r1.printRectangleKind();
        r2.printRectangleKind();


        System.out.println("Is the rectangle r0 = r1? " + r0.isTheSameRectangle(r1));
        System.out.println("Is the rectangle r1 = r2? " + r1.isTheSameRectangle(r2));
        System.out.println("Is the rectangle r0 = r2? " + r0.isTheSameRectangle(r2));

    }
}