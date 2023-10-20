package org.example;

public class Master implements Observer{

    private String name;
    private int salary = 80000;
    private String requiredVacancy = "Руководитель группы"; // искомая вакансия

    public Master(String name) {
        this.name = name;
        //this.requiredVacancy = requiredVacancy;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy, int salary) {
        if (this.salary <= salary && this.requiredVacancy.equals(vacancy.getName())){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
        }
    }
}
