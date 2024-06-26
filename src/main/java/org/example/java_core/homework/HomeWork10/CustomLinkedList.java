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

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getData();
    }

    public int getFirst() {
        if (head == null) {
            throw new IllegalStateException("The list is empty");
        }
        return head.getData();
    }

    public int getLast() {
        if (head == null) {
            throw new IllegalStateException("The list is empty");
        }
        Node currentNode = head;
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getData();
    }

    public boolean contains(int data) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                return true;
            }
            currentNode = currentNode.getNextNode();
        }
        return false;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int indexOf(int data) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                return index;
            }
            currentNode = currentNode.getNextNode();
            index++;
        }
        return -1;
    }

    public void removeByValue(int data) {
        if (head == null)
            return;

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

    public void removeByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(currentNode.getNextNode().getNextNode());
            size--;
        }
    }

    public void removeFirst() {
        head = head.getNextNode();
        size--;
    }

    public void removeLast() {
        if (head == null) {
            throw new IllegalStateException("The list is empty");
        }
        if (size == 1) {
            head = null;
        } else {
            Node currentNode = head;
            while (currentNode.getNextNode().getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(null);
        }
        size--;
    }

    public void set(int index, int data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setData(data);
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            array[index++] = currentNode.getData();
            currentNode = currentNode.getNextNode();
        }
        return array;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
