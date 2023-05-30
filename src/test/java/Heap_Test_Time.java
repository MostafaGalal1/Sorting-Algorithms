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

public class Heap_Test_Time
{
    @Test
    public void Test_Sorting()
    {
        Long t1 = System.currentTimeMillis();
        Max_Heap heap = new Max_Heap(6);
        heap.add(1);
        heap.add(3);
        heap.add(2);

        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void test_insert10NumbersAndCheckIfSorted()
    {
        Long t1 = System.currentTimeMillis();
        Max_Heap heap = new Max_Heap(10);
        Random random = new Random();
        Integer[] numbers = new Integer[10];
        for(int i = 0; i < 10; i++){
            numbers[i] = random.nextInt(100);
            heap.add(numbers[i]);
        }
        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }

    // inserts 100 words and checks to see if they are sorted inside the heap
    @Test
    public void test_insert100NumbersAndCheckIfSorted()
    {
        Max_Heap heap = new Max_Heap(100);
        Long t1 = System.currentTimeMillis();
        Random random = new Random();
        Integer[] numbers = new Integer[100];
        for(int i = 0; i < 100; i++){
            numbers[i] = random.nextInt(100);
            heap.add(numbers[i]);
        }
        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }

    // inserts 1e6 numbers and checks to see if they are sorted inside the heap
    @Test
    public void test_insert1e6NumbersAndCheckIfSorted()
    {
        Long t1 = System.currentTimeMillis();
        Max_Heap heap = new Max_Heap(1000000);
        Random random = new Random();
        Integer[] numbers = new Integer[1000000];
        for(int i = 0; i < 1000000; i++){
            numbers[i] = random.nextInt(1000000);
            heap.add(numbers[i]);
        }

        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_insertNumbersOrdered(){
        Long t1 = System.currentTimeMillis();
        Max_Heap heap = new Max_Heap(1000);
        for(int i = 100; i > 0; i--){
            heap.add(i);
        }
        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }

    // generated an array and runs the build heap function on it
    @Test
    public void test_buildHeapFromArrayWithRandomOrder(){
        Long t1 = System.currentTimeMillis();
        Max_Heap heap = new Max_Heap(10);
        Integer[] numbers = new Integer[]{3,4,2,1,5,9,10,2,9,1};
        heap.build(numbers);
        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }

    // generated an array and runs the build heap function on it
    @Test
    public void test_buildHeapFromArrayWithReverseOrder(){
        Long t1 = System.currentTimeMillis();
        Max_Heap heap = new Max_Heap(10);
        Integer[] numbers = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        heap.build(numbers);
        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }

    // generated an array and runs the build heap function on it
    @Test
    public void test_buildHeapFromArrayWithSize100(){
        Long t1 = System.currentTimeMillis();
        Max_Heap heap = new Max_Heap(100);
        Integer[] numbers = new Integer[100];
        for(int i = 0; i < 100; i++){
            numbers[i] = i;
        }
        heap.build(numbers);
        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }

    // generated an array and runs the build heap function on it
    @Test
    public void test_buildHeapFromArrayWithSize1e6(){
        Long t1 = System.currentTimeMillis();
        Max_Heap heap = new Max_Heap(1000000);
        Integer[] numbers = new Integer[1000000];
        Random random = new Random();
        for(int i = 0; i < 1000000; i++){
            numbers[i] = random.nextInt((int)1e9);
        }
        heap.build(numbers);
        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_peekFromHeap(){
        Long t1 = System.currentTimeMillis();
        Max_Heap heap = new Max_Heap(10);
        Integer[] numbers = new Integer[]{3,4,2,1,5,9,10,2,9,1};
        heap.build(numbers);
        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_peekFromHeap2(){
        Max_Heap heap = new Max_Heap(1000000);
        Random random = new Random();
        Long t1 = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            int num = random.nextInt((int)1e9);
            heap.add(num);
        }
        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }

    // generates heap using build heap from array, deletes the root, and checks to see if its correct
    @Test
    public void test_deleteFromHeap(){
        Long t1 = System.currentTimeMillis();
        Max_Heap heap = new Max_Heap(10);
        Integer[] numbers = new Integer[]{3,4,2,1,5,9,10,2,9,1};
        heap.build(numbers);
        heap.delete();
        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }
    // generates heap using basic insertion, deletes the root, and checks to see if its correct
    @Test
    public void test_deleteFromHeap2(){
        Long t1 = System.currentTimeMillis();
        Max_Heap heap = new Max_Heap(1000000);
        Random random = new Random();
        Integer[] numbersAdded = new Integer[1000000];
        for(int i = 0; i < 1000000; i++){
            int num = random.nextInt((int)1e9);
            numbersAdded[i] = num;
            heap.add(num);
        }
        heap.delete();
        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_heapSizeAfterBuild(){
        Long t1 = System.currentTimeMillis();
        Max_Heap heap = new Max_Heap(10);
        Integer[] numbers = new Integer[]{3,4,2,1,5,9,10,2,9,1};
        heap.build(numbers);
        Long t2 = System.currentTimeMillis();
        System.out.println("inserting 10 elements took : " + (t2-t1) + " ms");
    }

}
