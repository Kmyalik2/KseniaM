import org.w3c.dom.css.Rect;

public class Main {
    public static void main(String[] args) {
        Rectangle r0 = new Rectangle(3,4, "First");
        Rectangle r1 = new Rectangle(5, "Second");
        Rectangle r2 = new Rectangle(4,3, "Third");


        r0.rectangleParamsPrint();
        r1.rectangleParamsPrint();
        r2.rectangleParamsPrint();

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