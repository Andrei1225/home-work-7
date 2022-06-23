package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // Задание 2

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        // Задание 3
        String fullName2 = "Иванов Семён Семёнович";
        String fullName3 = fullName2.replace('ё', 'е');
        String[] words = fullName3.split(" ");
        System.out.print("Данные ФИО сотрудника — ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");

        }

    }
}
