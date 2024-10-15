package br.com.braga;

import java.util.LinkedList;

public class HashMap {

    private static final int SIZE = 10;

    private LinkedList<Entry>[] table;

    public HashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private static class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        LinkedList<Entry> entries = table[index];

        for (Entry entry : entries) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        entries.add(new Entry(key, value));
    }

    public void delete(int key) {
        int index = hash(key);
        LinkedList<Entry> entries = table[index];

        Entry toRemove = null;
        for (Entry entry : entries) {
            if (entry.key == key) {
                toRemove = entry;
                break;
            }
        }

        if (toRemove != null) {
            entries.remove(toRemove);
            System.out.println("Entrada com chave " + key + " removida.");
        } else {
            System.out.println("Chave " + key + " não encontrada.");
        }
    }

    public void printMap() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Índice " + i + ": ");
            for (Entry entry : table[i]) {
                System.out.print("[" + entry.key + " -> " + entry.value + "] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();

        hashMap.put(1, 10);
        hashMap.put(11, 20);
        hashMap.put(2, 30);
        hashMap.put(12, 40);

        hashMap.printMap();

        hashMap.delete(11);

        hashMap.printMap();
    }
}