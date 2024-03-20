package Object_Oriented_Programming;

class Circle_Template{
    public double radius;

    public double area(){
        return radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}

class Circle{
    public static void main(String[] args) {
        Circle_Template ct1=  new Circle_Template();
        ct1.radius = 5;
        System.out.println(ct1.area()+" "+ct1.circumference());
    }
}