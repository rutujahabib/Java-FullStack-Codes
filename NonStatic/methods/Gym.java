public class Gym {
    String name;
    String type;
    int Price;
    boolean personalTrainerAvailable;
    boolean dietplan;
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + Price);
    }
    public void showPersonalTrainer(){
        System.out.println("Is personal trainer available? " + personalTrainerAvailable);
    }
    public void showDietPlan(){
        System.out.println("Is diet plan available? " + dietplan);
    }
    public static void main(String[] args) {
        Gym myGym = new Gym();
        myGym.name = "FitLife";
        myGym.type = "Fitness Center";
        myGym.Price = 50;
        myGym.personalTrainerAvailable = true;
        myGym.dietplan = true;

        myGym.displayDetails();
        myGym.showPersonalTrainer();
        myGym.showDietPlan();

        System.out.println("*************************");

        Gym anotherGym = new Gym();
        anotherGym.name = "PowerHouse";
        anotherGym.type = "Bodybuilding Gym";
        anotherGym.Price = 70;
        anotherGym.personalTrainerAvailable = false;
        anotherGym.dietplan = false;
        anotherGym.displayDetails();
        anotherGym.showPersonalTrainer();
        anotherGym.showDietPlan();

    }
}
