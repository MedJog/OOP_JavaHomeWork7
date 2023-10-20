package org.example;

import java.util.Random;

public class Company  {
    private Random random = new Random();

    private String name;

    private Publisher jobAgency;

    private int maxSalary;
    private Vacancy vacancy;

    public Company(String name, Publisher jobAgency, Vacancy vacancy, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.vacancy = vacancy;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, vacancy, salary);
    }
}
