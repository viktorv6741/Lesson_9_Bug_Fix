package bug_5;

public class RectanglePlus implements Relatable {  // key world "abstract" was removed
    public int width = 0;
    public int height = 0;
    public Point origin;

//////////////////////////////////////////////////////////////////////////////////////////////

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }
    public RectanglePlus(Point p) {
        origin = p;
    }
    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

//////////////////////////////////////////////////////////////////////////////////////////////

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing
    // the area of the rectangle
    public int getArea() {
        return width * height;
    }

    // a method required to implement
    // the Relatable interface
    public int isLarger(Relatable other) {    //  Name of this method was corrected

        RectanglePlus otherRect = (RectanglePlus)other;

        if (this.getArea() < otherRect.getArea()) return -1;
        else if (this.getArea() > otherRect.getArea()) return 1;
        else return 0;
    }


//////////////////////////////////////////////////////////////////////////////////////////////


    public static void main(String[] args) {
        // TODO code application logic here

        RectanglePlus rectangle_0 = new RectanglePlus(4, 7);
        RectanglePlus rectangle_1 = new RectanglePlus(2, 5);

        System.out.println(rectangle_0.isLarger(rectangle_1));


    }
}



///////////////////////////////////////////////////////////////////////////



class Point {
    int top;
    int left;
    int x;
    int y;

    public Point(int t, int l) {
        this.top = t;
        this.left = l;
    }
}
