package arr;
import java.util.*;

public class FoodOrder {

    Scanner scanner=new Scanner(System.in);

    int coffeeCost=100;
    int teaCost=100;
    int idlyCost=50;
    int vadaCost=50;
    long totalCost;
    String toContinue;
    long grandTotal;
    String nextCustomer;
    int billNumber=0;
    static int coffee=0;
    static int tea=0;
    static int idly=0;
    static int vada=0;
    int max=0;
    int min =0;
    boolean coffeeFlag=true;
    boolean teaFlag=true;
    boolean idlyFlag=true;
    boolean vadaFlag=true;


    HashMap<Integer,Long> hashTotalBill=new HashMap<>();


    public FoodOrder() {
        Long finalTotal=0L;





        System.out.println("id- menus");
        System.out.println("1-Coffee");
        System.out.println("2-Tea");
        System.out.println("3-Idly");
        System.out.println("4-Vada");
        do{

            billNumber++;
            System.out.println("Bill number :"+billNumber);

        do {
            System.out.println("Enter the menu id with in 1 to 4 : ");
            int id = scanner.nextInt();
            System.out.println("The menu item for id  " + id);
            System.out.println("Enter the count of items ");
            int count = scanner.nextInt();
            System.out.println("The count is " + count);

            if (id == 1) {
                totalCost = count * coffeeCost;
                coffee += count;
                System.out.println("coffee"+coffee);

            } else if (id == 2) {
                totalCost = count * teaCost;
                tea += count;
                System.out.println("tea"+tea);
            } else if (id == 3) {
                totalCost = count * idlyCost;
                idly += count;
                System.out.println("idly"+idly);
            } else if (id == 4) {
                totalCost = count * vadaCost;
                vada += count;
                System.out.println("vada"+vada);
            } else {
                System.out.println("Please enter the correct item id ");
            }

            System.out.println("The total amount is " + totalCost);
            grandTotal+=totalCost;
            hashTotalBill.put(billNumber,grandTotal);
            System.out.println("Do you want to continue Y/N :");
            toContinue= scanner.next();
            System.out.println("Yes Or No " + toContinue);

        }while(toContinue.equals("Y"));


        System.out.println("The total cost will be "+grandTotal);
        System.out.println("Want to continue with another customer: ");
        nextCustomer= scanner.next();


        }while(nextCustomer.equals("Y"));



        //System.out.println(hashTotalBill);
        Set<Integer> key=hashTotalBill.keySet();


        for (Integer k : key) {
            //System.out.println("Key "+ key);
            System.out.println("TotalAmount for customer " + k + " is: " + hashTotalBill.get(k));
            finalTotal += hashTotalBill.get(k);
        }
        //ArrayList<Long> totalAmount =(ArrayList<Long>) hashTotalBill.values();

        System.out.println("Total no of customers: "+hashTotalBill.size());
        System.out.println("Total values: "+finalTotal);
        max= coffee;
        int maxCount=1;
        if(max < tea )
        {
            max=tea;
            maxCount=2;

        }
        if(max < idly )
        {
            max=idly;
            maxCount=3;
        }
        if(max < vada)
        {
            max=vada;
            maxCount=4;
        }
        System.out.println("Maximum ordered item "+ max);

        min= coffee;
        if(min > tea ) min=tea;
        if(min > idly ) min=idly;
        if(min > vada) min=vada;
        System.out.println("Minimum ordered item "+ min);

        if(maxCount==1)
        {
            System.out.println("Maximum order item is coffee");
        } else if (maxCount==2) {
            System.out.println("Maximun order item is tea");
        }
        else if(maxCount==3)
        {
            System.out.println("Maximun ordered item is idly");
        }else
        {
            System.out.println("Maximum order item is vada");
        }
        if(coffeeCost > teaCost)
        {

            System.out.println("Minimum order item is tes");
        } else if (coffeeCost > idlyCost) {
            System.out.println("Minimum order item is idly");
        }
        else if(coffeeCost > vadaCost)
        {
            System.out.println("Minimum ordered item is vada");
        }else
        {
            System.out.println("Minimum order item is coffee");
        }


        // System.out.println("The total of customer will be "+overAllCustomer);
        System.out.println("Thank you for coming!!");
        // tea - 2 count 2 - 200
        //idly -3 count 1 - 50
    }

    public static void main(String[] args) {
        FoodOrder order = new FoodOrder();

    }
}
