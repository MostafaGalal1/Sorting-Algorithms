package Algorithms;

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
        this.build(v);
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

    public void build(Integer[] v)
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
        Integer[] v = new Integer[this.size];
        int index = 0;

        while (this.size > 0)
        {
            v[index++] = this.peek();
            this.removeTopElement();
        }
        return v;
    }

//    public void emptyHeap()
//    {
//        this.size = 0;
//    }

    public void add(int value)
    {
        if (this.size == this.maxSize-1)
            this.DoubleSize();
        arr[++size] = value;
        this.heapifyUp(this.size);
    }

    public int peek()
    {
        return this.arr[1];
    }

    public boolean removeTopElement()
    {
        if (this.size == 0)
            return false;
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