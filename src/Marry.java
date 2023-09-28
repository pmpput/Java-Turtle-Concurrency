public class Marry implements Runnable{
 @Override
 public void run(){
    Turtle Marry = new Turtle(-100,60);
    Marry.penColor("black");
    Marry.width(5);
    Marry.speed(2);
    for(int i=0; i<400; i++){
        Marry.forward(i/50);
        Marry.left(5);
    }
}
    
}
