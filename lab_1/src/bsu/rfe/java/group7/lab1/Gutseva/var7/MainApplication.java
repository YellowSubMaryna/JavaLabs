package bsu.rfe.java.group7.lab1.Gutseva.var7;

public class MainApplication {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[args.length];
        for (int i = 0; i < args.length; i++) {
            String[] parts = args[i].split("/");
            if (parts[0].equals("Сыр")) {
                breakfast[i] = new Cheese();
            } else if (parts[0].equals("Яблоко")) {
                breakfast[i] = new Apple(parts[1]);
            } else if (parts[0].equals("Мороженное")) {
                breakfast[i] = new IceCream(parts[1]);
            }
        }
        for (Food item : breakfast) {
            item.consume();
        }
        Food cheese = new Cheese();
        System.out.println("Сыр: " + countFoods(breakfast, cheese));

        System.out.println("Всего хорошего!");
    }

    static Integer countFoods(Food[] breakfast, Food food) {
        Integer count = 0;
        for (int i = 0; i < breakfast.length; i++) {
            if (food.equals(breakfast[i])) {
                count++;
            }
        }
        return count;
    }
}