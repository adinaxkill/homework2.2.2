package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Printable print[] = {createObject("firsObj"), createObject("secondObj"),
                createObject("thirdObj")};
        for (Printable printable : print) {
            printable.print();
        }
    }

    public static Printable createObject(String className) {


        switch (className) {
            case "firstObj":
                Cat cat = new Cat(4, "Мурка", "Мурчать");
                return cat;

            case "secondObj":
                Dog dog = new Dog(10, "Рекс", "Кусать");
                return dog;

            case "thirdObj":
                Donkey donkey = new Donkey(6, "Барсик", "Пинать");
                return donkey;
        }
        return null;
    }
}
