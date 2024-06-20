package ru.netology.services.cycles.vacation.services;

public class VacationService {
    public int calcVacationMonths(int income, int expenses, int threshold) {
        int money = 0;
        int vacationMonths = 0;
        for (int i = 0; i < 12; i++) {
            if (money < threshold) {
                money += income;// money = money + income
                money -= expenses;
            } else {
                money -= expenses;
                money = money / 3;
                vacationMonths++;
            }
        }
        return vacationMonths;
    }
}
