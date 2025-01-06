package Ex.myLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addFirst(30);
        myLinkedList.addFirst(40);
        myLinkedList.addFirst(50);


        System.out.println("Các phần tử: " + myLinkedList.toString());


        myLinkedList.addLast(30);
        myLinkedList.addLast(50);


        myLinkedList.add(3, 30);
        System.out.println("Danh sách sau khi thêm phần tử: " + myLinkedList.toString());

        myLinkedList.removeFirst();
        System.out.println("Danh sách sau khi xóa phần tử đầu tiền: " + myLinkedList.toString());

        myLinkedList.removeLast();
        System.out.println("Danh sách sau khi xóa phần tử cuối cùng: " + myLinkedList.toString());

        myLinkedList.remove(4);
        System.out.println("Danh sách sau khi xóa phần tử ở vị trí thứ 4: " + myLinkedList.toString());

        Integer firstElement = myLinkedList.getFirst();
        System.out.println("Phần tử đầu tiên trong danh sách: " + firstElement);

        Integer lastElement = myLinkedList.getLast();
        System.out.println("Phần tử cuối cùng trong danh sách: " + lastElement);

        Integer elementAtIndex = myLinkedList.get(3);
        System.out.println("Phần tử thứ 3 trong danh sách: " + elementAtIndex);

        myLinkedList.set(2, 22);
        System.out.println("Danh sách sau khi thay đổi phần tử thứ 3 thành 11: " + myLinkedList.toString());

        Integer indexOfElement = myLinkedList.indexOf(10);
        System.out.println("Vị trí index của phần tử 10 là: " + indexOfElement);

        Integer lastIndexOfElement = myLinkedList.lastIndexOf(20);
        System.out.println("Vị trí index cuối cùng của phần tử 20 là: " + lastIndexOfElement);
    }
}
