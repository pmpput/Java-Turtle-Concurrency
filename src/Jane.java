public class Jane  implements Runnable{
    @Override
    public void run(){
    Turtle jane = new Turtle(-100,-30);
    jane.penColor("red");
    jane.width(5);
    jane.speed(2);
    jane.forward(150);
    jane.right(135);
    jane.forward(150);
    jane.right(110);
    jane.forward(120);
}
}
