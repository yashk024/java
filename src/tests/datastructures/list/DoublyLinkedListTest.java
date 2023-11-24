package tests.datastructures.list;

import com.datastructures.list.DoublyLinkedList;

public class DoublyLinkedListTest {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        // add(element) -> adda an element at the last
        doublyLinkedList.add(20);
        // addFirst(element)
        doublyLinkedList.addFirst(10);
        // addLast(element)
        doublyLinkedList.addLast(30);
        // add(index, element)
        doublyLinkedList.add(1, 15);

        // prints doublyLinkedList
        System.out.println(doublyLinkedList);

        // search(element)
        System.out.println(doublyLinkedList.search(12));
        System.out.println(doublyLinkedList.search(15));

        // remove() -> removes element at index 0.
        System.out.println(doublyLinkedList.remove());
        // remove(index)
        System.out.println(doublyLinkedList.remove(1));

        // get(index)
        System.out.println(doublyLinkedList.get(1));

        // set(index, element)
        doublyLinkedList.set(1, 45);

        // prints doublyLinkedList
        System.out.println(doublyLinkedList);

        // reverse()
        doublyLinkedList.reverse();

        // prints doublyLinkedList
        System.out.println(doublyLinkedList);

        // size()
        System.out.println(doublyLinkedList.size());
    }

}
