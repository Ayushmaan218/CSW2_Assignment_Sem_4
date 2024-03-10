//Write a program to create a Car class with member variables model, color,
//        and speed. Add the respective method and constructor to it. Create a
//driver class in that class and create two car objects. Compare the car
//objects according to their speed and print the details of the car that has
//a greater speed.
//        Note: Overload compareTo method of Comparable interface.
package sem_4_Assignments.Assignment_2;

public class CarDriver {
}
class car implements Comparable<car>{
    private String model;
    private String color;
    private int Speed;
    public void Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.Speed = speed;
    }

    @Override
    public int compareTo(car o) {
        return 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }
}