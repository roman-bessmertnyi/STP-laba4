package lab4;

import Sorters.*;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.say_Hello();

        Arrays_Task_One First_Task = new Arrays_Task_One();
        First_Task.say_Hello();
        First_Task.Calculate();

        Arrays_Task_Two Second_Task = new Arrays_Task_Two();
        Second_Task.say_Hello();
        Second_Task.Calculate();

        Sorter_Timer Final_Task = new Sorter_Timer();
        Final_Task.say_Hello();
        Final_Task.Calculate();
    }
}
