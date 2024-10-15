package br.com.braga;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<Integer>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        System.out.println(pilha);

        pilha.pop();
        System.out.println(pilha);
    }
}