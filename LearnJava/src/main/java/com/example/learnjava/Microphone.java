package com.example.learnjava;

public class Microphone
{
    //  Instance variables |or| Properties |or| Fields
    String name;
    String color;
    int model;

    public Microphone(String name, String color, int model)
    {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public void turnOn()
    {
        System.out.println(this.name + " is turned On");
    }
    public void turnOff()
    {
        System.out.println(this.name + "is turned Off");
    }
    public void setVolume()
    {
        System.out.println("Setting volume...");
    }
    public String showDescription()
    {
        return "Microphone name " + name + " with the color " + color + " and the model number " + model;
    }
}
