import Algorithms.Max_Heap;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.Random;

public class Heap_Test
{
//    private Max_Heap heap;
    @Test
    public void Test_Sorting()
    {
        Max_Heap heap = new Max_Heap(6);
        heap.add(1);
        heap.add(3);
        heap.add(2);

        Integer[] sorted_array = heap.getSortedArrayAndEmptyHeap();
        Integer[] expected_array = new Integer[]{3, 2, 1};
        Assertions.assertArrayEquals(expected_array, sorted_array);
    }

    // inserts 10 words and checks to see if they are sorted inside the heap
    @Test
    public void test_insert10NumbersAndCheckIfSorted()
    {
        Max_Heap heap = new Max_Heap(10);
        Random random = new Random();
        Integer[] numbers = new Integer[10];
        for(int i = 0; i < 10; i++){
            numbers[i] = random.nextInt(100);
            heap.add(numbers[i]);
        }

        Integer[] result = heap.getSortedArrayAndEmptyHeap();
        Arrays.sort(numbers, Collections.reverseOrder());
        Assert.assertArrayEquals(numbers, result);
    }

    // inserts 100 words and checks to see if they are sorted inside the heap
    @Test
    public void test_insert100NumbersAndCheckIfSorted()
    {
        Max_Heap heap = new Max_Heap(100);
        Random random = new Random();
        Integer[] numbers = new Integer[100];
        for(int i = 0; i < 100; i++){
            numbers[i] = random.nextInt(100);
            heap.add(numbers[i]);
        }

        Integer[] result = heap.getSortedArrayAndEmptyHeap();
        Arrays.sort(numbers, Collections.reverseOrder());
        Assert.assertArrayEquals(numbers, result);
    }
    // inserts 1e6 numbers and checks to see if they are sorted inside the heap
    @Test
    public void test_insert1e6NumbersAndCheckIfSorted()
    {
        Max_Heap heap = new Max_Heap(1000000);
        Random random = new Random();
        Integer[] numbers = new Integer[1000000];
        for(int i = 0; i < 1000000; i++){
            numbers[i] = random.nextInt(1000000);
            heap.add(numbers[i]);
        }

        Integer[] result = heap.getSortedArrayAndEmptyHeap();
        Arrays.sort(numbers, Collections.reverseOrder());
        Assert.assertArrayEquals(numbers, result);
    }

    @Test
    public void test_insertNumbersOrdered(){
        Max_Heap heap = new Max_Heap(1000);
        for(int i = 100; i > 0; i--){
            heap.add(i);
            Assert.assertEquals(100, heap.peek());
        }
    }

    // generated an array and runs the build heap function on it
    @Test
    public void test_buildHeapFromArrayWithRandomOrder(){
        Max_Heap heap = new Max_Heap(10);
        Integer[] numbers = new Integer[]{3,4,2,1,5,9,10,2,9,1};
        heap.build(numbers);
        Integer[] result = heap.getSortedArrayAndEmptyHeap();
        Arrays.sort(numbers, Collections.reverseOrder());
        Assert.assertArrayEquals(numbers, result);
    }

    // generated an array and runs the build heap function on it
    @Test
    public void test_buildHeapFromArrayWithReverseOrder(){
        Max_Heap heap = new Max_Heap(10);
        Integer[] numbers = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        heap.build(numbers);
        Integer[] result = heap.getSortedArrayAndEmptyHeap();
        Arrays.sort(numbers, Collections.reverseOrder());
        Assert.assertArrayEquals(numbers, result);
    }

    // generated an array and runs the build heap function on it
    @Test
    public void test_buildHeapFromArrayWithSize100(){
        Max_Heap heap = new Max_Heap(100);
        Integer[] numbers = new Integer[100];
        for(int i = 0; i < 100; i++){
            numbers[i] = i;
        }
        heap.build(numbers);
        Integer[] result = heap.getSortedArrayAndEmptyHeap();
        Arrays.sort(numbers, Collections.reverseOrder());
        Assert.assertArrayEquals(numbers, result);
    }

    // generated an array and runs the build heap function on it
    @Test
    public void test_buildHeapFromArrayWithSize1e6(){
        Max_Heap heap = new Max_Heap(1000000);
        Integer[] numbers = new Integer[1000000];
        Random random = new Random();
        for(int i = 0; i < 1000000; i++){
            numbers[i] = random.nextInt((int)1e9);
        }
        heap.build(numbers);
        Integer[] result = heap.getSortedArrayAndEmptyHeap();
        Arrays.sort(numbers, Collections.reverseOrder());
        Assert.assertArrayEquals(numbers, result);
    }

    @Test
    public void test_peekFromHeap(){
        Max_Heap heap = new Max_Heap(10);
        Integer[] numbers = new Integer[]{3,4,2,1,5,9,10,2,9,1};
        heap.build(numbers);
        Assert.assertEquals(10, heap.peek());
    }

    @Test
    public void test_peekFromHeap2(){
        Max_Heap heap = new Max_Heap(1000000);
        Random random = new Random();
        int maxNumberInserted = 0;
        for(int i = 0; i < 1000000; i++){
            int num = random.nextInt((int)1e9);
            maxNumberInserted = Math.max(maxNumberInserted, num);
            heap.add(num);
        }
        Assert.assertEquals(maxNumberInserted, heap.peek());
    }

    // generates heap using build heap from array, deletes the root, and checks to see if its correct
    @Test
    public void test_deleteFromHeap(){
        Max_Heap heap = new Max_Heap(10);
        Integer[] numbers = new Integer[]{3,4,2,1,5,9,10,2,9,1};
        heap.build(numbers);
        heap.delete();
        Assert.assertEquals(9, heap.peek());
    }
    // generates heap using basic insertion, deletes the root, and checks to see if its correct
    @Test
    public void test_deleteFromHeap2(){
        Max_Heap heap = new Max_Heap(1000000);
        Random random = new Random();
        Integer[] numbersAdded = new Integer[1000000];
        for(int i = 0; i < 1000000; i++){
            int num = random.nextInt((int)1e9);
            numbersAdded[i] = num;
            heap.add(num);
        }
        Arrays.sort(numbersAdded, Collections.reverseOrder());
        heap.delete();
        Assert.assertEquals((int)numbersAdded[1], heap.peek());
    }

    @Test
    public void test_heapSizeAfterBuild(){
        Max_Heap heap = new Max_Heap(10);
        Integer[] numbers = new Integer[]{3,4,2,1,5,9,10,2,9,1};
        heap.build(numbers);
        Assert.assertEquals(10, heap.getSize());
    }

    @Test
    public void test_heapSizeAfterInsert(){
        Max_Heap heap = new Max_Heap(10);
        Integer[] numbers = new Integer[]{3,4,2,1,5,9,10,2,9,1};
        for(int i = 0; i < 10; i++){
            heap.add(numbers[i]);
        }
        Assert.assertEquals(10, heap.getSize());
    }

    @Test
    public void test_heapSizeAfterDelete(){
        Max_Heap heap = new Max_Heap(10);
        Integer[] numbers = new Integer[]{3,4,2,1,5,9,10,2,9,1};
        for(int i = 0; i < 10; i++){
            heap.add(numbers[i]);
        }
        heap.delete();
        Assert.assertEquals(9, heap.getSize());
    }

}
