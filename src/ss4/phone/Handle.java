package ss4.phone;

import java.util.ArrayList;
import java.util.Scanner;

public class Handle extends Phone {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<NewPhone> NewPhones = new ArrayList<>();
    static ArrayList<OldPhone> Oldphones = new ArrayList<>();

    public static void showAllPhone()
    {
        ShowNewPhone();
        showPhoneOld();
    }
    public static void ShowNewPhone()
    {
        System.out.println("===== Thong Tin Dien Thoai Moi =====");
        for (int i = 0; i < NewPhones.size(); i++)
        {
            NewPhones.get(i).output();
        }
    }
    public static void showPhoneOld()
    {
        System.out.println("===== Thong Tin Dien Thoai Cu =====");
        for (int i = 0; i < Oldphones.size(); i++)
        {
            Oldphones.get(i).output();
        }
    }

    //2
    // them moi dien thoai moi
    public static void addPhoneNew()
    {
        NewPhone newPhone = new NewPhone();
        newPhone.input();
        NewPhones.add(newPhone);
    }
    // them moi dien thoa cu
    public static void addPhoneOld()
    {
        OldPhone phoneCu = new OldPhone();
        phoneCu.input();
        Oldphones.add(phoneCu);
    }

    //3
    public static void updatePhone()
    {
        System.out.print("Nhap ID can sua: ");
        String id=sc.nextLine();
        if(id.startsWith("DTM"))
        {
            for (int i = 0; i < NewPhones.size(); i++)
            {
                if(NewPhones.get(i).getId().equalsIgnoreCase(id))
                {
                    NewPhones.get(i).input();
                    break;
                }else {
                    System.out.println("ID khong hop le!");
                }
            }
        }else if (id.startsWith("DTC"))
        {
            for (int i = 0; i < Oldphones.size(); i++)
            {
                if(Oldphones.get(i).getId().equalsIgnoreCase(id))
                {
                    Oldphones.get(i).input();
                    break;
                }else {
                    System.out.println("ID khong hop le!");
                }
            }
        }else{
            System.out.println("ID khong hop le!");
        }
    }
    //4
    public static void remotePhone()
    {
        System.out.print("Nhap ID can xoa: ");
        String id=sc.nextLine();
        if(id.startsWith("DTM"))
        {
            for (int i = 0; i < NewPhones.size(); i++)
            {
                if(NewPhones.get(i).getId().equalsIgnoreCase(id))
                {
                    System.out.print("Nhap 'Yes' de xoa: ");
                    if("yes".equalsIgnoreCase(sc.nextLine()))
                    {
                        NewPhones.remove(i);
                        System.out.println("Da xoa");
                        break;
                    }
                }else {
                    System.out.println("ID khong hop le!");
                }
            }
        }else if(id.startsWith("DTC"))
        {
            for (int i = 0; i < Oldphones.size(); i++)
            {
                if(Oldphones.get(i).getId().equalsIgnoreCase(id))
                {
                    System.out.print("Nhap 'Yes' de xoa: ");
                    if("yes".equalsIgnoreCase(sc.nextLine()))
                    {
                        Oldphones.remove(i);
                        System.out.println("Da xoa");
                        break;
                    }
                }else {
                    System.out.println("ID khong hop le!");
                }
            }
        }else{
            System.out.println("ID khong hop le!");
        }
    }


}
