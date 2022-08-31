import org.w3c.dom.css.Rect;

public class Rectangle {
    double x;
    double y;
    String rectangleName;

    public Rectangle (double x, double y, String rectangleName) {
        this.x = x;
        this.y = y;
        this.rectangleName = rectangleName;
    }

    public Rectangle (double x, String rectangleName) {
        this.x = x;
        this.y = x;
        this.rectangleName = rectangleName;
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
}
