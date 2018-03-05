public class Guest {

    String name;
    double budget;

    public Guest(String name, double budget){
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return this.name;
    }

    public double getBudget() {
        return budget;
    }

    public void dockBudget(double price) {
        this.budget -= price;
    }
}
