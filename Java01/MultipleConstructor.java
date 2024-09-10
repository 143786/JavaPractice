package Java01;

public class MultipleConstructor {
    private int hour = 1;
    private int minute = 2;
    private int second = 3;

    public MultipleConstructor (){
        this(0,0,0);
    }
    // Overloading

    public MultipleConstructor(int h){
        this(h,0,0);
    }

    public MultipleConstructor(int h, int m){
        this(h,m,0);
    }

    public MultipleConstructor(int h, int m, int s){

        setMultiple(h, m, s);
        
    }

    private void setMultiple(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);

    }

    public MultipleConstructor setHour(int hour) {
        this.hour = hour;
        return this;
    }

    public MultipleConstructor setMinute(int minute) {
        this.minute = minute;
        return this;
    }

    public MultipleConstructor setSecond(int second) {
        this.second = second;
        return this;
    }
}
