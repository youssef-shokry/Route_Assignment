package week_4.objective2;

public class Triangle implements Shape{
    private int base;
    private int height;

    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea(){
        return (0.5 * base * height);
    }

    @Override
    public String toString() {
        return "base = " + base + " & " + "Height = " + height;
    }
}
