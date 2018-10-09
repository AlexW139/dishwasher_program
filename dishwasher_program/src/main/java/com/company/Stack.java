package com.company;

public class Stack {
    private String stck[]; // stack to store number of plates
    int tos; // top of stack

    // Construct an empty stack given its size
    Stack(int size) {
        stck = new String[size];
        for(int i=0; i<size; i++) stck[i] = "empty";
        tos = 0;
    }

    // Construct a stack from a stack
    Stack(Stack ob) {
        tos = ob.tos;
        stck = new String[ob.stck.length];

        // copy elements
        for(int i=0; i<tos; i++) {
            stck[i] = ob.stck[i];
        }
    }

    // Construct a stack with initial values
    Stack(String a[]) {
        stck = new String[a.length];

        for(int i=0; i<a.length; i++) {
            try {
                push(a[i]);
            } catch(StackFullException exc) {
                System.out.println(exc);
            }
        }
    }

    // Push an integer onto the stack
    void push(String plates) throws StackFullException {
        if(tos==stck.length) {
            throw new StackFullException(stck.length);
        }
        stck[tos] = plates;
        tos++;
    }

    // Pop an integer from the stack
    String pop() throws StackEmptyException {
        if(tos==0) {
            throw new StackEmptyException();
        } tos--;
        stck[tos] = "empty";
        return stck[tos];
    }

    // Get an entry from the stack
    public String getEntry(int i) {
        return stck[i];
    }

    // Set an entry in the stack
    public void setEntry(int i, String str) {
        stck[i] = str;
    }

    // Get the length
    public int getLength() {
        return stck.length;
    }
}