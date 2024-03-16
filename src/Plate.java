public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public Plate(){}

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void addFood(int add){
        this.food = food + add;
    }

    public void setFood(int food) {
        if (food >= 0){
            this.food = food;
        }
        else{
            System.out.println("Нельзя положить в тарелку отрицательное количество еды");
        }
    }
}
