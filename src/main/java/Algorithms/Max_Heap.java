package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Max_Heap
{
    private Integer[] arr;
    int size = 0;
    public int maxSize;

    public Max_Heap(int Maxsize)
    {
        this.maxSize = Maxsize+1;
        this.arr = new Integer[this.maxSize];
    }

    public Max_Heap(Integer[] v)
    {
        this(v.length);
        this.BUILD_MAX_HEAP(v);
    }

    private void DoubleSize()
    {
        int newmaxSize = this.maxSize*2;
        Integer[] newarr = new Integer[newmaxSize];

        for (int i = 1; i <= this.size; i++)
            newarr[i] = this.arr[i];
        this.arr = newarr;
        this.maxSize = newmaxSize;
    }

    public void BUILD_MAX_HEAP(Integer[] v)
    {
        while (this.maxSize <= v.length)
            this.DoubleSize();
        this.size = v.length;
        for (int i = 0; i < this.size; i++)
            arr[i + 1] = v[i];
        for (int i = this.size; i >= 1; i--)
            heapifydown(i);
    }

    public Integer[] getSortedArrayAndEmptyHeap()
    {
        this.Sort();
        Integer[] ans = this.getArr();
        this.emptyHeap();
        return ans;
    }

    public List<List<Integer>> Sort()
    {
        List<List<Integer>> results = new ArrayList<>();
        int oldSize = this.size;
        while (this.size > 0)
            this.removeTopElement(results);
        this.size = oldSize;
        this.ReverseArray(this.arr, this.size);
        return results;
    }

    public Integer[] getArr()
    {
        Integer[] v = new Integer[this.size];
        for (int i = 0; i < this.size; i++)
            v[i] = this.arr[i+1];
        return v;
    }

    public void emptyHeap()
    {
        this.size = 0;
    }

    public void MAX_HEAP_INSERT(int value)
    {
        if (this.size == this.maxSize-1)
            this.DoubleSize();
        arr[++size] = value;
        this.MAX_HEAPIFY(this.size);
    }

    public int HEAP_EXTRACT_MAX()
    {
        if(this.size == 0)
            return this.arr[-1];
        return this.arr[1];
    }

    public boolean removeTopElement(List<List<Integer>> results)
    {
        if (this.size == 0)
            return false;

        int temp = arr[1];
        arr[1] = arr[this.size];
        arr[this.size] = temp;
        this.size--;
        heapifydown(1);
        results.add( new ArrayList<>(Arrays.asList(arr)));
        return true;
    }

    private void MAX_HEAPIFY(int index)
    {
        if (index == 1) return;
        int up = index / 2;
        if (arr[up] > arr[index]) return;
        this.swap(index, up);
        MAX_HEAPIFY(up);
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

    private void ReverseArray(Integer[] v, int n)
    {
        for (int i = 1; i <= n/2; i++)
        {
            int j = n - i+1;
            int temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
    }
}