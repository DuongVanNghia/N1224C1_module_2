package ss4.phone;

import java.util.Scanner;

public class NewPhone extends Phone{
    private int quantity;
    public NewPhone(){

    }

    public NewPhone(int id, String name, int sell, String manufacturer, int quantity) {
        super(id, name, sell, manufacturer);
        this.quantity = quantity;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter quantity: ");
        this.quantity = Integer.parseInt(sc.nextLine());

    }
    public void output(){
        super.output();
        System.out.println("Quantity: " + this.quantity);
    }
}
