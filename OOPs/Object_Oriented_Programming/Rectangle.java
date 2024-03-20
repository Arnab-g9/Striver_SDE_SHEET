package Object_Oriented_Programming;

class Reactangle_Template{
    int length;
    int bredth;

    public int area(){
        return length*bredth;
    }
    public int perimeter(){
        return 2*(length+bredth);
    }
    public boolean isSquare(){
        return length==bredth;
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Reactangle_Template rt1 = new Reactangle_Template();
        rt1.length = 5;
        rt1.bredth = 5;
        System.out.println(rt1.area());
        System.out.println(rt1.perimeter());
        System.out.println(rt1.isSquare());
    }
}
