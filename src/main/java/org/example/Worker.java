package org.example;

public class Worker implements Observer {
    private String name;
    private String requiredVacancy = "Разнорабочий"; // искомая вакансия
    private int salary = 10000;

    public Worker(String name) {
        this.name = name;
//        this.requiredVacancy = requiredVacancy;
//        this.salary = salary;
    }
    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy, int salary) {
        if (this.salary <= salary && this.requiredVacancy.equals(vacancy.getName())){
            System.out.printf("Рабочий %s: Эта работа мне подходит! (Компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Рабочий %s: Эта работа не для меня! (Компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
        }
    }
}

