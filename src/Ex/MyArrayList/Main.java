package Ex.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);
        myArrayList.add(40);
        myArrayList.add(50);

        System.out.println("Damh sach ban dau " + myArrayList.toString());


        myArrayList.add(3, 10);
        System.out.println("Damh sach sau khi them 10 vào vi tri 3: " + myArrayList.toString());


        myArrayList.thayThe(5, 20);
        System.out.println("Danh sach sau khi thay theô vi tri bang 5 la 3: " + myArrayList.toString());

        int elementAtIndex = myArrayList.traPhanTu(3);
        System.out.println("Phan tu tai vi tri thu 3 la: " + elementAtIndex);

        int elementToFind = 20;
        int indexOfElement = myArrayList.indexOf(elementToFind);
        if (indexOfElement != -1) {
            System.out.println("Vi tri index cua phan tu: " + elementToFind + "la: " + indexOfElement);
        } else {
            System.out.println("Khong tim thay phan tu" + elementToFind + "trong danh sach.");
        }

        int lastIndexOfElement = myArrayList.lastIndexOf(elementToFind);
        if (lastIndexOfElement != -1) {
            System.out.println("Vi tri index cua phan tu: " + elementToFind + "la: " + lastIndexOfElement);
        } else {
            System.out.println("khoong tim thay phan tu" + elementToFind + "trong danh sach.");
        }

        myArrayList.remove(1);
        System.out.println("danh sach sau khi xoa phan tu dau tien: " + myArrayList.toString());

        myArrayList.removeElement(20);
        System.out.println("Danh sach sau khi xoa cac phan tu co gia tri 20: " + myArrayList.toString());
    }
}
