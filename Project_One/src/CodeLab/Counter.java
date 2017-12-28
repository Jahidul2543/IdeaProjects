package CodeLab;

public class Counter {
    private int counter;
    private int counterID;
    private static int nCounters = 0;

    public Counter(int x){
        counter = x;
        nCounters++;
        counterID = nCounters ;
    }
    public void increment(){
        counter++;
    }
    public void decrement(){
        counter--;
    }

    public int getValue() {

        return counter;
    }

    public int getCounterID() {
        return counterID;

    }

}

