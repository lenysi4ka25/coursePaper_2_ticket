import java.util.*;

import static java.util.Collections.max;

//        Дан класс User, который содержит поля с именем и возрастом. Необходимо реализовать следующий метод:
//        1. На входе коллекция пользователей
//        2. Необходимо удалить все дубли (одинаковое имя и возраст)
//        3. Отсортировать по возрасту и имени
//        4. Вернуть самого старого пользователя

public class User implements Comparable<User> {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Пользователь: " +
                "Имя - " + name + " Возраст - " + age;
    }

    @Override
    public int compareTo(User user) {
        return this.age - user.getAge();
    }


    public static void main(String[] args) {


//        Дан класс User, который содержит поля с именем и возрастом. Необходимо реализовать следующий метод:
//        1. На входе коллекция пользователей
//        2. Необходимо удалить все дубли (одинаковое имя и возраст)
//        3. Отсортировать по возрасту и имени
//        4. Вернуть самого старого пользователя

        Map<String, User> users = new HashMap<>();

        User user1 = new User("Alex", 30);
        users.put(user1.getName(), user1);
        User user2 = new User("Vova", 33);
        users.put(user2.getName(), user2);
        User user3 = new User("Dima", 32);
        users.put(user3.getName(), user3);
        User user4 = new User("Anton", 38);
        users.put(user4.getName(), user4);
        User user5 = new User("Anton", 38);
        users.put(user5.getName(), user5);
        User user6 = new User("Vova", 33);
        users.put(user6.getName(), user6);


        List<String> employeeByKey = new ArrayList<>(users.keySet());
        Collections.sort(employeeByKey);
        for (String employeeByKeys : employeeByKey) {
            System.out.println(employeeByKeys);
        }
        System.out.println("Задача 1");
        System.out.println("------------------------------------------------");

        List<User> employeeByValues = new ArrayList<>(users.values());
        Collections.sort(employeeByValues);
        for (User employeeByValue : employeeByValues) {
            System.out.println(employeeByValue);
        }

        System.out.println("------------------------------------------------");

        String key = max(users.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(key);

        System.out.println("------------------------------------------------");


        //Напишите программу на Java для подсчета количества конкретных слов в строке, используя HashMap.

//        Stream<String> words = Stream.of("сыр", "сыр", "сыр", "сыр", "сыр", "сыр", "молоко");
//        words.map(w -> w.split(" ")).flatMap(Arrays::stream)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .forEach((word, count) -> System.out.println(word + " " + count));

        String words = "сыр сыр квас сыр сыр сыр молоко квас";
        String[] arrayWords = words.split(" ");
        Map<String, Integer> mapWords = new HashMap<>();

        for (int i = 0; i < arrayWords.length; i++) {
            int count = 0;

            for (int j = 0; j < arrayWords.length; j++) {
                if (arrayWords[i].equals(arrayWords[j])) {
                    count++;
                }
            }
            mapWords.put(arrayWords[i], count);
        }
        System.out.println("Задача 2");
        System.out.println(mapWords);


    }
}