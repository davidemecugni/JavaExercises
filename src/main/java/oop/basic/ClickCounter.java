package oop.basic;

public class ClickCounter {
    int value;

    public ClickCounter() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void click(){
        this.value += 1;
    }

    public void undo(){
        if(this.value > 0){
            this.value -= 1;
        }
    }

    public void reset(){
        this.value = 0;
    }
}
