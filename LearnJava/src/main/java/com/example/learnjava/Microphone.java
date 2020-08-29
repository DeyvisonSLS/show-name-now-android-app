package com.example.learnjava;

public class Microphone
{
    //  Instance variables |or| Properties |or| Fields
    private String name;
    private String color;
    private int model;

    public Microphone(){}

    public Microphone(String name, String color, int model)
    {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public Microphone(String name, int model)
    {
        this.name = name;
        this.model = model;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getModel()
    {
        return model;
    }

    public void setModel(int model)
    {
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
