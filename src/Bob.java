public class Bob implements Runnable {
@Override     
    public void run(){
    Turtle bob = new Turtle(60,60);
    bob.penColor("black");
    bob.width(5);
    bob.speed(2);
    for(int i=0; i<400; i++){
        bob.forward(i/50);
        bob.left(5);
    }
}
}

