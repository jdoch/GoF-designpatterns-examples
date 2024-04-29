package Decorator;

public class DecoratorTest {
    public static void main(String[] args){
        Shape circle = new Circle();
        Shape redCircle = new GreenShapeDecorator(new Circle());
        Shape redRectangle = new GreenShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}
