package br.com.braga;

public class ListaEncadeada {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public ListaEncadeada() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void push(Node node) {
        if (this.tail == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        size++;
    }

    public Node pop() {
        if (this.head == null) {
            return null;
        }

        if (this.head == this.tail) {
            Node temp = this.head;
            this.head = null;
            this.tail = null;
            size--;
            return temp;
        }

        Node current = this.head;
        while (current.next != this.tail) {
            current = current.next;
        }

        Node temp = this.tail;
        current.next = null;
        this.tail = current;
        size--;
        return temp;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }

        if (index == 0) {
            node.next = head;
            head = node;
            if (size == 0) {
                tail = node;
            }
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;

            if (node.next == null) {
                tail = node;
            }
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }

        if (index == 0) {
            head = head.next;
            if (size == 1) {
                tail = null;
            }
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            if (current.next == null) {
                tail = current;
            }
        }
        size--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    
    public int size() {
        return size;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
