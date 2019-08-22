package com.company;


public class Dequeue {
    int size;
    int head;
    int tail;
    char[] charArray;

    Dequeue(int size){
        charArray = new char[this.size = size];
    }

    void pushBack(char c){
        if(++tail == size){
            tail = 0;
        }
        charArray[tail] = c;
    }

    int popBack(){
        int ret = charArray[tail];
        if(--tail<0){
            tail = size-1;
        }
        return ret;
    }

    int popFront(){
        if(++head==size){
            head = 0;
        }
        return charArray[head];
    }

    void pushFront(char c){
        charArray[head] = c;
        if(--head<0){
            head = size-1;
        }
    }

    boolean isEmpty(){
        return head==tail;
    }

    void print(){
        char[] array;
        array = this.charArray.clone();
        //System.out.println();

        for (int i = 1; i < size; i++) {
            System.out.print(array[i]);
        }
        System.out.print(array[0]);
    }

    void printRightOrder(){
        char[] array;
        array = this.charArray.clone();
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
        }

    }



}
