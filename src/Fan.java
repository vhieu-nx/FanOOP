public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5; //Bán kính quạt
    private String color = "blue";

    public Fan() {

    }

    public static int getSLOW() {
        return SLOW;
    }

    public static int getMEDIUM() {
        return MEDIUM;
    }

    public static int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if (on){
            return "speed: " + speed  + ", color: " + color + ", radius: " + radius + " fan is on ";
        }
        return "fan is off";
    }

    public static void main(String[] args) {
            Fan fan1 = new Fan();
            fan1.setSpeed(getFAST());
            fan1.setRadius(10);
            fan1.setColor("yellow");
            fan1.setOn(true);
            Fan fan2 = new Fan();
            fan2.setSpeed(getMEDIUM());
            fan2.setRadius(5);
            fan2.setColor("blue");
            fan2.setOn(false);
            System.out.println("Quạt 1: " + fan1);
            System.out.println("Quạt 2: " + fan2);
    }

}
