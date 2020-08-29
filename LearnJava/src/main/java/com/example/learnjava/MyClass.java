package com.example.learnjava;

public class MyClass
{
    public static void main(String[] args)
    {
        Microphone microphone = new Microphone("Xingling00","Red", 12345);
        microphone.setColor("Red");
        microphone.setName("MyPhoneChingLing");
        microphone.setModel(77777);
        //
        microphone.turnOn();
        microphone.setVolume();
        microphone.turnOff();
        System.out.println(microphone.showDescription());

        //  Line separator
        System.out.println(System.getProperty("line.separator"));
        //

        Microphone newMic = new Microphone();
        newMic.setColor("Blue");
        newMic.setName("BlueMic");
        newMic.setModel(192837);
        //
        newMic.turnOn();
        newMic.setVolume();
        newMic.turnOff();
        System.out.println(newMic.showDescription());

        //  Line separator
        System.out.println(System.getProperty("line.separator"));
        //

        Microphone otherMic = new Microphone("myOtherMic", 8219);
        otherMic.turnOn();
        otherMic.setVolume();
        otherMic.turnOff();
        System.out.println(otherMic.showDescription());

//        System.out.println(Sum(1,2,3,4));
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