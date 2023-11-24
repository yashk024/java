package tests.datastructures.list;

import com.datastructures.list.SinglyLinkedList;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        // add(element) -> adda an element at the last
        singlyLinkedList.add(20);
        // addFirst(element)
        singlyLinkedList.addFirst(10);
        // addLast(element)
        singlyLinkedList.addLast(30);
        // add(index, element)
        singlyLinkedList.add(1, 15);

        // prints singlyLinkedList
        System.out.println(singlyLinkedList);

        // search(element)
        System.out.println(singlyLinkedList.search(12));
        System.out.println(singlyLinkedList.search(15));

        // remove() -> removes element at index 0.
        System.out.println(singlyLinkedList.remove());
        // remove(index)
        System.out.println(singlyLinkedList.remove(1));

        // get(index)
        System.out.println(singlyLinkedList.get(1));

        // set(index, element)
        singlyLinkedList.set(1, 45);

        // prints singlyLinkedList
        System.out.println(singlyLinkedList);

        // reverse()
        singlyLinkedList.reverse();

        // prints singlyLinkedList
        System.out.println(singlyLinkedList);

        // size()
        System.out.println(singlyLinkedList.size());
    }

}
