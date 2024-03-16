public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5);
        Cat cat2 = new Cat("Vasya", 23);
        Plate plate = new Plate(12);
        plate.info();
        plate.addFood(12);
        cat1.eat(plate);
        plate.info();
        cat2.eat(plate);
        plate.info();


        Cat[] cats = {
                new Cat("Буся", 10),
                new Cat("Рыжик", 7),
                new Cat("Соня", 12),
                new Cat("Пупс", 17),
                new Cat("Кузя", 5),
                new Cat("Мурка", 11)
        };
        Plate plate2 = new Plate(40);

        for (Cat cat : cats){
            cat.eat(plate2);
            if (cat.isSatiety()){
                System.out.println(cat.getName() + " покушал и теперь сыт");
            }
            else {
                System.out.println(cat.getName() + " не смог поесть и всё еще голоден");

            }
        }


    }
}
