package day_ninth;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza firstOrder = new Pizza("small",1,0,5);
        Pizza secondOrder = new Pizza("large",2,5,1);
        Pizza thirdOrder = new Pizza("medium",2,5,5);
        Pizza forthOrder = new Pizza("small",1,5,1);

        System.out.println(firstOrder.getDescription() +"  "+ firstOrder.calCost());
        System.out.println(secondOrder.getDescription() +"  "+ secondOrder.calCost());
        System.out.println(thirdOrder.getDescription() +"  "+ thirdOrder.calCost());
        System.out.println(forthOrder.getDescription() +"  "+ forthOrder.calCost());
    }
}
