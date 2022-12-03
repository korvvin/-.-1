public class Main {
    public static void main(String[] args) {
        int age = 17;
        System.out.println("ДЗ 1");
        System.out.println("Задание 1");
        if (age < 18) {
            System.out.println("возраст совершеннолетия ещё не наступил");
        }
        if (age >= 18) {
            System.out.println("поздравляем вам есть 18");
        }
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("человек окончил университет и ему пора искать работу");
        }
        System.out.println("задание 3");
        int people = 40;
        if (people < 60) {
            System.out.println("сидячие места есть");
        }
        if (people >= 60 && people < 102) {
            System.out.println("сидячи102х мест нет");
        }
        if (people >= 102) {
            System.out.println("мест в вагоне нет");
        }

        System.out.println("ДЗ 2");
        System.out.println("Задание 1");
        if (age < 18) {
            System.out.println("возраст совершеннолетия ещё не наступил");
        } else {
            System.out.println("поздравляем вам есть 18");
        }
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("ребенок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        } else {
            System.out.println("человек окончил университет и ему пора искать работу");
        }
        System.out.println("задание 3");
        int people1 = 40;
        if (people1 < 60) {
            System.out.println("сидячие места есть");
        } else if (people1 >= 60 && people1 < 102) {
            System.out.println("сидячи102х мест нет");
        } else {
            System.out.println("мест в вагоне нет");
        }
        System.out.println("ДЗ 3");
        System.out.println("Задание 1");
        //задать возраст можно в начале на 3 строчке,спасибо
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        }
        System.out.println("Задание 2");
        boolean parent = false;
        byte ageChild = 14;
        if (ageChild >= 14 || ageChild >= 5 && parent == true) {
            System.out.println("может кататься на аттракционе");
        } else {
            System.out.println("не может кататься на аттракицоне");
        }
        System.out.println("Задание 3");
        int one = 5;
        int two = 2;
        int three = 3;
        if (one>two&&one>three){
            System.out.println("первое число больше всех оно равно "+one);
        }
        else if (two>one&&two>three){
            System.out.println("второе число больше всех оно равно "+two);
        }
        else if (three>one&&three>two){
            System.out.println("третье число больше всех оно равно "+three);
        }
        else {
            System.out.println("Введите разные числа");
        }



    }

}
