package ss4.phone;

import java.util.Scanner;

public class OldPhone extends Phone {
    private String statusPin;
    private String furtherDescription;
    public OldPhone(){

    }

    public OldPhone(int id, String name, int sell, String manufacturer) {
        super(id, name, sell, manufacturer);
        this.statusPin = statusPin;
        this.furtherDescription = furtherDescription;

    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("nhap tinh trang Pin: ");
        statusPin = sc.nextLine();
        System.out.println("nhap thong tin them: ");
        furtherDescription = sc.nextLine();

    }
    public void output(){
        super.output();
        System.out.println("tinh trang Pin: " + statusPin);
        System.out.println("thong tin them: " + furtherDescription);
    }

    public String getStatusPin() {
        return statusPin;
    }

    public void setStatusPin(String statusPin) {
        this.statusPin = statusPin;
    }

    public String getFurtherDescription() {
        return furtherDescription;
    }

    public void setFurtherDescription(String furtherDescription) {
        this.furtherDescription = furtherDescription;
    }
}
