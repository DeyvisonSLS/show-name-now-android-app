package com.example.learnjava;

public class Manager extends Employee
{
    private double bonus = 1000;
    @Override
    public double getAnnualSalary()
    {
        return super.getAnnualSalary() + bonus;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    @Override
    public String toString()
    {
        return getFirstName()
                + " (ID): "
                + getIdNumber()
                + " | "
                + " Base Salary: " + super.getAnnualSalary()
                + " | Gross Salary: " + getAnnualSalary()
                + " | Bonus: " + bonus;
    }
}
