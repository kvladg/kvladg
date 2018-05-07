package com.example.vlad.vldtst;
public class main{
    public static void main(String[] args) {
    Person undef = new Person("Vasia");
    undef.displayInfo();
    Person tom = new Person("Tom",35);
    tom.displayInfo();
        Shape s1 = new Circle (5.0);
        Shape s2 = new Rectangle (7.0,9.0);
        Shape larger = getLargerShape(s1,s2);
        System.out.println("The area of the larger shape is: "+larger.area());
}
    public static Shape getLargerShape(Shape s1, Shape s2) {
        if(s1.area() > s2.area())
            return  s1;
        else
            return s2;
    }
}
class Shape {
    public double area ()
    {
        return 0;
    }
}
class Circle extends Shape {  // ключевое слово "extends" означает наследование

    private static final double PI = Math.PI;   // константа
    private double diameter; //любое число, представляющее диаметр этого круга
    public Circle(double diameter) { // конструктор
        this.diameter = diameter;
    }
    public double area(){
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }
}
class Rectangle extends Shape{
        private double visot;
        private double sirin;
        public Rectangle(double wih, double hie){
        this.visot = wih;
        this.sirin = hie;
}
    public double area(){
        return visot * sirin;
        }
}
class Person{
    String name;    // имя
    int age;        // возраст
    /*начало блока инициализатора*/
    {
        name = "Undefined";
        age = 18;
    }
    /*конец блока инициализатора*/
    Person(){
    }
    Person(String name){
        this.name = name;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
