import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Algorithms.Sort_Array;
import Algorithms.Sorting_Choice;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Sort_Test {

    private String path = System.getProperty("user.dir") + "\\src\\test\\java";

    private List<Integer> setupExpectedArray(String fileName, int sz){
        path += "\\" + fileName;
        String newPath = path.replace("\"","");
        List<Integer> expectedArray = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream(newPath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(file));
            String line = reader.readLine();
            for(int i = 0; i < sz; i++){
                expectedArray.add(Integer.parseInt(line));
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error happened while setting up file");
        }
        return expectedArray;
    }

    @Test
    public void testSimpleSorting()
    {
        List<Integer> unsorted_Array = new ArrayList<>();
        unsorted_Array.add(5);
        unsorted_Array.add(4);
        unsorted_Array.add(3);
        unsorted_Array.add(8);
        unsorted_Array.add(1);
        Sort_Array sortObject = new Sort_Array(unsorted_Array);
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        Assert.assertArrayEquals(new Integer[]{1, 3, 4, 5, 8}, result.toArray());
    }

    @Test
    public void test_simpleSortingRandomNumbersWithSize100()
    {
        List<Integer> unsorted_Array = new ArrayList<>();
        List<Integer> expected_Array = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            int num = random.nextInt((int)1e9);
            unsorted_Array.add(num);
            expected_Array.add(num);
        }
        Sort_Array sortObject = new Sort_Array(unsorted_Array);
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);
        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }
    @Test
    public void test_simpleSorting10NumbersFromFile()
    {
        Sort_Array sortObject = new Sort_Array(path + "\\10.txt");
        List<Integer> expected_Array = setupExpectedArray("10.txt", 10);
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);

        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }

    @Test
    public void test_simpleSorting1e2NumbersFromFile()
    {
        Sort_Array sortObject = new Sort_Array(path + "\\1e2.txt");
        List<Integer> expected_Array = setupExpectedArray("1e2.txt", 100);
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);

        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }

    @Test
    public void test_simpleSorting1e3NumbersFromFile()
    {
        Sort_Array sortObject = new Sort_Array(path + "\\1e3.txt");
        List<Integer> expected_Array = setupExpectedArray("1e3.txt", 1000);
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);

        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }

    @Test
    public void test_simpleSorting1e4NumbersFromFile()
    {
        Sort_Array sortObject = new Sort_Array(path + "\\1e4.txt");
        List<Integer> expected_Array = setupExpectedArray("1e4.txt", 10000);
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);

        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }

    @Test
    public void test_simpleSorting1e5NumbersFromFile()
    {
        Sort_Array sortObject = new Sort_Array(path + "\\1e5.txt");
        List<Integer> expected_Array = setupExpectedArray("1e5.txt", 100000);
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);

        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }


}