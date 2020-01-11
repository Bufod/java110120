package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // стало
    public static <T extends Drink> void out(List<T> dinkList){
        T drink;
        for (int i = 0; i < dinkList.size(); i++) {
            drink = dinkList.get(i);
            System.out.println((i + 1) + ") " + drink);
        }
    }

    // было
    public static void outCoffee(List<Coffee> coffeeList) {
        Coffee coffee;
        for (int i = 0; i < coffeeList.size(); i++) {
            coffee = coffeeList.get(i);
            System.out.println((i + 1) + ") " + coffee);
        }
    }

    // было
    public static void outTea(List<Tea> coffeeList) {
        Tea tea;
        for (int i = 0; i < coffeeList.size(); i++) {
            tea = coffeeList.get(i);
            System.out.println((i + 1) + ") " + tea);
        }
    }

    // было
    public static void outCompote(List<Compote> compoteList) {
        Compote compote;
        for (int i = 0; i < compoteList.size(); i++) {
            compote = compoteList.get(i);
            System.out.println((i + 1) + ") " + compote);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Tea> teaList = new ArrayList<>();
        teaList.add(new Tea("Эрл-грей",
                "Нормальный чай, все берут",
                25));
        teaList.add(new Tea("Молочный-улун",
                "Легкие нотки улуна (чтобы это не было)",
                30));

        List<Coffee> coffeeList = new ArrayList<>();
        coffeeList.add(new Coffee("Эспрессо",
                "Нормальный кофе, все берут",
                30));
        coffeeList.add(new Coffee("Айриш",
                "Виски + взбитые сливки, что еще нужно?",
                100));

        List<Compote> compoteList = new ArrayList<>();
        compoteList.add(new Compote("Яблочный",
                "Как у бабушки",
                15));

        System.out.println("Вас приветствует вендинговый" +
                " автомат \"Ароматный напиток\"");
        System.out.println("Выберите из списка:\n" +
                "\t1) Чай" +
                "\t2) Кофе" +
                "\t3) Компот");

        int n = in.nextInt();
        switch (n) {
            case 1:
                out(teaList);
                break;
            case 2:
                out(coffeeList);
                break;
            case 3:
                out(compoteList);
                break;
            default:
                System.out.println("Некорректный ввод!");
        }

    }
}
