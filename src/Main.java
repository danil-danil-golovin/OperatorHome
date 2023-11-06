public class Main {
    public static void main(String[] args) {

        int age = 20;
        if (age > 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }


        int temp = 14;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
        if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }


        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }


        int ages = 21;
        if (ages > 2 && ages < 6) {
            System.out.println("Если возраст человека равен " + ages + ", то ему нужно ходить в детский сад");
        }
        if (ages > 7 && ages < 17) {
            System.out.println("Если возраст человек равен " + ages + ", то ему нужно ходить в школу");
        }
        if (ages >= 18 && ages <= 24) {
            System.out.println("Если возраст человек равен " + ages + ", то ему нужно ходить в университет");
        }
        if (ages > 24) {
            System.out.println("Если возраст человек равен " + ages + ", то ему нужно ходить на работу");
        }


        int child = 15;
        if (child < 5){
            System.out.println("Если возраст ребенка равен " + child + ", то ему нельзя кататься на аттракционе");
        }
        if (child > 5 && child < 14) {
            System.out.println("Если возраст ребенка равен " + child + ", то можно кататься на аттракционе в сопровождении");
        }
        if (child > 14) {
            System.out.println("Если возраст ребенка равен " + child + ", то можно кататься на аттракционе без сопровождения");
        }


        int human = 20;
        if (human <=60) {
            System.out.println("В вагоне осталось сидячих " + (60-human) + " мест и стоячих мест осталось 42");
        }
        else if (human > 60 && human <=102){
            System.out.println("В вагоне закончились сидячие места, остались только стоячих " + (102-human) + " места");
        }
        else {
            System.out.println("Вагон полностью забит, переполнен на " + -(102-human) + " человек");
        }
        int one = 9;
        int two = 6;
        int three = 3;
        if (one > two) {
            System.out.println("Большее число one");
        }
        else if (two > three) {
            System.out.println("Большее число two");
        }
        else {
            System.out.println("Большее число three");
        }
    }
        }

