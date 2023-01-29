public class multithread{
    public static void main(String[] args){
        multithreadingThing thing = new multithreadingThing();
        multithreadingThing thing2 = new multithreadingThing();

        thing.start();
        thing2.start();
    }
}