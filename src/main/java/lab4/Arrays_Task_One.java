package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Task_One extends Greeter{
    public Arrays_Task_One() {
        name = "The class that does the first array task";
    }

    public void Calculate() {
        int pairsNumber = 0, negSum = 0, sum = 0, negativeCount = 0, maxValue;

        System.out.print("Сколько целых чисел вы собираетесь ввести? ");

        Scanner in = new Scanner(System.in);
        int size = 1;
        try {
            size = in.nextInt();
        } catch (Exception e) {
            System.out.print("Неправилиный ввод.");
            System.exit(0);
        }
        if (size == 0) {
            System.out.print("Программа завершена.");
            System.exit(0);
        }
        int[] sourceNumbers = new int[size];
        System.out.print("Введите целые числа через пробел "
                + "и нажмите <Enter>: ");
        try {
            for (int i = 0; i < size; i++) {
                sourceNumbers[i] = in.nextInt();
            }
        } catch (Exception e) {
            System.out.print("Неправилиный ввод.");
            System.exit(0);
        }

        //Находим пары чисел
        for (int i = 0; i < sourceNumbers.length-1; i++){
            if (sourceNumbers[i] == sourceNumbers[i+1]) {
                pairsNumber++;
            }
        }
        System.out.print("Пар чисел: " + pairsNumber);

        //Находим сумму элементов больше чем число 3
        for(int i = 0; i < sourceNumbers.length; i++){
            sum+=sourceNumbers[i];
        }
        System.out.println("\nСумма чисел * 3: " + sum*3);

        //Вывод разницы между минимумом и максимумом
        System.out.println("Разница между минимумом и максимумом: "
                + (Arrays.stream(sourceNumbers).max().getAsInt()-Arrays.stream(sourceNumbers).min().getAsInt()));

        //Ср Ариф
        System.out.println("Средние арифметическое: " + sum/sourceNumbers.length);

        //Вывод суммы минимума и максимума
        for(int i = 0; i < sourceNumbers.length; i++){
            if(sourceNumbers[i]<0)negSum=negSum+sourceNumbers[i];
        }
        System.out.println("Сумма минимума и максимума: "
                + (Arrays.stream(sourceNumbers).max().getAsInt()+Arrays.stream(sourceNumbers).min().getAsInt()));

        maxValue = sourceNumbers[0];
        for(int i = 0; i < sourceNumbers.length; i++){
            if(Math.abs(sourceNumbers[i]) > Math.abs(maxValue)){
                maxValue = sourceNumbers[i];
            }
        }
        System.out.println("Максимальное по модулю: " + maxValue);
    }
}