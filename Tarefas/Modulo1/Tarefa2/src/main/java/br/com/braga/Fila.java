package br.com.braga;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Fila {

        private LinkedList<Integer> fila;

        public Fila() {
            fila = new LinkedList<>();
        }

        public void enqueue(int valor) {
            fila.addLast(valor);
        }

        public int dequeue() {
            if (fila.isEmpty()) {
                throw new NoSuchElementException("A fila está vazia.");
            }
            return fila.removeFirst();
        }

        public int front() {
            if (fila.isEmpty()) {
                throw new NoSuchElementException("A fila está vazia.");
            }
            return fila.getFirst();
        }

        public int rear() {
            if (fila.isEmpty()) {
                throw new NoSuchElementException("A fila está vazia.");
            }
            return fila.getLast();
        }

        public int size() {
            return fila.size();
        }

        public boolean isEmpty() {
            return fila.isEmpty();
        }

}