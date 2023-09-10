package BasicCoffeeMachine;

public class Order {
    private Coffee coffee;

    private boolean addMilk;

    private boolean sugar;

    private int howmychsugar;

    private String dimension;

    public void setAddMilk(boolean addMilk) {
        this.addMilk = addMilk;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public void setHowmychsugar(int howmychsugar) {
        this.howmychsugar = howmychsugar;
    }

    public void setDimesion(String dimension) {
        this.dimension = dimension;
    }

    public Order(Coffee coffee){
        this.coffee=coffee;
    }
    // Kahvenin hazırlanması
    public void hazirla (){
        System.out.println(coffee.getAd()+dimension+"Hazırlanıyor...");
        if (addMilk){
            System.out.println("Süt ekleniyor");
        }
    }

}
