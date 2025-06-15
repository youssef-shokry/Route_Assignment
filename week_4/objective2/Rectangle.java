package week_4.objective2;

public class Rectangle implements Shape {
    private final int length;
    private final int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (length * width);
    }

    @Override
    public String toString() {
        return "Length = " + length + " & " + "Width = " + width;
    }
}
