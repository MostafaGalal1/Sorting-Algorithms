package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Max_Heap
{
    private Integer[] arr;
    int size = 0;
    int maxSize;

    public Max_Heap(int Maxsize)
    {
        this.maxSize = Maxsize+1;
        this.arr = new Integer[this.maxSize];
    }

    public void build(Integer[] v)
    {
        this.size = v.length;
        for (int i = 0; i < this.size; i++)
            arr[i + 1] = v[i];
        for (int i = this.size; i >= 1; i--)
            heapifydown(i);
    }

    public Integer[] getSortedArrayAndEmptyHeap()
    {
        Integer[] v = new Integer[this.size];
        int index = 0;

        while (this.size > 0)
        {
            v[index++] = this.peek();
            this.delete();
        }
        return v;
    }

//    public void emptyHeap()
//    {
//        this.size = 0;
//    }

    public boolean add(int value)
    {
        if (this.size == this.maxSize-1) return false;
        arr[++size] = value;
        this.heapifyUp(this.size);
        return true;
    }

    public int peek()
    {
        return this.arr[1];
    }

    public boolean delete()
    {
        if (this.size == 0) return false;
        arr[1] = arr[this.size--];
        heapifydown(1);
        return true;
    }

    private void heapifyUp(int index)
    {
        if (index == 1) return;
        int up = index / 2;
        if (arr[up] > arr[index]) return;
        this.swap(index, up);
        heapifyUp(up);
    }

    private void heapifydown(int index)
    {
        int left = index * 2, right = index * 2 + 1;
        if (left > this.size) return;

        if (left == this.size || arr[left] > arr[right])
        {
            if (arr[left] > arr[index])
            {
                swap(left, index);
                heapifydown(left);
            }
        }
        else
        {
            if (arr[right] > arr[index])
            {
                swap(right, index);
                heapifydown(right);
            }
        }

    }

    private void swap(int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public int getSize()
    {
        return this.size;
    }
}