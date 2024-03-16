public class Cat {
    private String name;

    private int appetite;

    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }


    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }


    public void eat(Plate plate) {
        if (plate.getFood() >= appetite){
            plate.setFood(plate.getFood() - appetite);
            satiety = true;
            System.out.println(name + " Вкусно покушал :)");
        }
        else{
            System.out.println("В тарелке недостаточно еды чтобы накормить " + name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }


}
