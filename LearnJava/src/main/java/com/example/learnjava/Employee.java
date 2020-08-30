package com.example.learnjava;

import java.util.Locale;

public class Employee extends Person
{
    private int idNumber;
    private double annualSalary;

    public String getIdNumber()
    {
        return String.format(Locale.getDefault(),"%04d", idNumber);
    }

    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }

    public double getAnnualSalary()
    {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString()
    {
        return getFirstName()
                + " (ID): "
                + getIdNumber()
                + " | Gross Salary: " + getAnnualSalary();
    }
}
