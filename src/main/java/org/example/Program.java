package org.example;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, new Vacancy("Курьер"), 12000);
        Company yandex = new Company("Yandex", jobAgency, new Vacancy("Разработчик"),95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, new Vacancy("Руководитель группы"),100000);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Worker worker1 = new Worker("Рабочий #1");


        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(worker1);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }

}
