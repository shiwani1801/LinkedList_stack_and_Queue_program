package com.bridgelabz.stack;

public class StackNode<T>
{
    T data;
    StackNode<T> next;

    //generating default constructor
    public StackNode()
    {
        super();
    }

    //generating getters and setters
    public T getData()
    {
        return data;
    }
    public void setData(T data)
    {
        this.data = data;
    }
    public StackNode<T> getNext()
    {
        return next;
    }
    public void setNext(StackNode<T> next)
    {
        this.next = next;
    }


}
