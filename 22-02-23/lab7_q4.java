class Plate {
    int length;
    int width;
    
    public Plate(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called");
    }
}

class Box extends Plate {
    int height;
    
    public Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor called");
    }
}

class WoodBox extends Box {
    int thick;
    
    public WoodBox(int length, int width, int height, int thick) {
        super(length, width, height);
        this.thick = thick;
        System.out.println("WoodBox constructor called");
    }
}

public class lab7_q4 {
    public static void main(String[] args) {
      //  WoodBox woodBox = new WoodBox(10, 20, 30, 5);
    }
}
