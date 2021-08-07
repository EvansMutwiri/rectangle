public class Rectangle {
    private int width;
    private int length;

    public static void main(String[] args) {

    }

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;

    }

    public int getLength() {
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }

    public boolean isSquare() {
        return this.length==this.width;
    }
}