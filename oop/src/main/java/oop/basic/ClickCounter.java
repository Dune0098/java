package oop.basic;

public class ClickCounter {
    private int count = 0;

    public int getValue(){
        return count;
    }

    public void undo(){
        if(count > 0) {
            count--;
        }
    }

    public void reset(){
        count = 0;
    }

    public void click(){
        count++;
    }
}
