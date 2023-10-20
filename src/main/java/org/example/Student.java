package org.example;

public class Student implements Observer{
    private String name;
    private String requiredVacancy = "Курьер"; // искомая вакансия
    private int salary = 5000;

    public Student(String name) {
        this.name = name;
//        this.requiredVacancy = requiredVacancy;
//        this.salary = salary;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy, int salary) {
        if (this.salary <= salary && this.requiredVacancy.equals(vacancy.getName())){
            System.out.printf("Студент %s: Эта вакансия мне подходит! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Эта вакансия не для меня! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
        }
    }
}
