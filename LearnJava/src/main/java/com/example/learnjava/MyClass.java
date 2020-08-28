package com.example.learnjava;

public class MyClass
{
    public static void main(String[] args)
    {
        Microphone microphone = new Microphone("Xingling00","Red", 12345);
//        microphone.color = "Red";
//        microphone.name = "Samsung A10";
//        microphone.model = 2345;

        microphone.turnOn();
        microphone.setVolume();
        microphone.turnOff();

        System.out.println(microphone.showDescription());

        System.out.println(Sum(1,2,3,4));
    }
    public static int Sum(int... numbers)
    {
        int total = 0;
        for (int number : numbers)
        {
            total += number;
        }
        return total;
    }
}