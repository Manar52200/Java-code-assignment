package Day2;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = this.width  = 0;
    }
    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    public double calculateArea(){
        return this.width * this.length;
    }
    public double calculatePerimeter(){
        return (this.length * 2) +  (this.width * 2);
    }
}
