package ss4.phone;

import java.util.Scanner;

public class Phone {
    private String id;
    private String name;
    private int sell;
    private String warrantyPeriod;
    private String manufacturer;

    public Phone(){

    }
    public Phone(int id, String name, int sell, String manufacturer) {
        this.id = String.valueOf(id);
        this.name = name;
        this.sell = sell;
        this.warrantyPeriod = warrantyPeriod;
        this.manufacturer = manufacturer;
    }

    public String getId() {
        return id;
    }

    public void setId(int id) {
        this.id = String.valueOf(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id= String.valueOf(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter name: ");
        name=sc.nextLine();
        System.out.print("Enter sell: ");
        sell=Integer.parseInt(sc.nextLine());
        System.out.print("Enter warranty period: ");
        warrantyPeriod=sc.nextLine();
        System.out.print("Enter manufacturer: ");
        manufacturer=sc.nextLine();

    }
    public void output(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Sell: "+sell);
        System.out.println("Warranty Period: "+warrantyPeriod);
        System.out.println("Manufacturer: "+manufacturer);
    }

}
