package main;

interface ProjectInterface {
    int cockPrice = 5;
    int henPrice = 3;
    void computation(int budget);
}


public class InterfaceAndAbstractModule implements ProjectInterface{
    public static void main(String[] args) {
        int prodPcs = 100;
        int budget = 100;
        int totalCost = 0;
        int totalPcs = 0;
        System.out.println("-----Problem 1 ------");
        System.out.println("Here are the List of possible scenarios to get 100PCS of items and cost 100 Yuan");
        for (int cockPiece = 0; cockPiece <= 20; cockPiece++) {
            for (int henPiece = 0; henPiece <= 33; henPiece++) {
                int chickenPiece = 100 - cockPiece - henPiece;
                totalCost = (cockPrice * cockPiece) + (henPrice * henPiece) + (chickenPiece / 3);
                totalPcs = cockPiece + henPiece + chickenPiece;
                if (totalCost == budget && totalPcs == prodPcs && chickenPiece % 3 == 0) {
                    System.out.println("Cock: " + cockPiece + "pcs " + "Hen: " + henPiece + "pcs " + "Chicken: " + chickenPiece + "pcs");
                }
            }
        }
        System.out.println("-----Problem 2 ------");
        InterfaceAndAbstractModule total = new InterfaceAndAbstractModule();
        total.computation(500);
    }

    @Override
    public void computation(int budget) {
        if(budget >= 300){
            System.out.println("Has budget for Bus transportation");
        }
        if(budget >= 400){
            System.out.println("Has budget for Train transportation");
        }
        if(budget >=500){
            System.out.println("Has budget for Driving transportation");
        }
        if (budget >=1000){
            System.out.println("Has budget for Plane transportation");
        }
    }
}


