package org.example.java_core.homework.HomeWork10;

public class CustomLinkedList {
    private Node head;

    private int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    public void print() {
        if(head != null) {
            Node currentNode = head;
            System.out.print("[");
            while (currentNode.getNextNode() != null) {
                System.out.print(currentNode.getData() + ", ");
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getData() + "]");
        } else {
            System.out.println("[]");
        }
    }

    public void add(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node newNode = new Node(data);
        if (index == 0) {
            newNode.setNextNode(head);
            head = newNode;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNextNode();
            }
            newNode.setNextNode(currentNode.getNextNode());
            currentNode.setNextNode(newNode);
        }
        size++;
    }

    public void remove(int data) {
        Node currentNode = head;
        if(currentNode.getData() == data) {
            removeFirst();
            return;
        }
        while (currentNode.getNextNode() != null) {
            if(currentNode.getNextNode().getData() == data) {
                break;
            }
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        size--;

    }

    public void removeFirst() {
        head = head.getNextNode();
        size--;
    }

    public void add(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
        } else {
            Node currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(node);
        }
        size++;
    }
}
