import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.IndicativeSentencesGeneration;
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
    public void test_simpleSortingNegativeNumbers(){
        List<Integer> expected = new ArrayList<>();
        for(int i = -100; i <= 100; i++)
            expected.add(i);
        Collections.shuffle(expected);
        Sort_Array sortObject = new Sort_Array(expected);
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        expected.sort(Integer::compareTo);
        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

//    @Test
//    public void test_simpleSorting1e5NumbersFromFile()
//    {
//        Sort_Array sortObject = new Sort_Array(path + "\\1e5.txt");
//        List<Integer> expected_Array = setupExpectedArray("1e5.txt", 100000);
//        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
//        expected_Array.sort(Integer::compareTo);
//
//        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
//    }

    @Test
    public void test_efficientSorting10NumbersFromFile(){
        Sort_Array sortObject = new Sort_Array(path + "\\10.txt");
        List<Integer> expected_Array = setupExpectedArray("10.txt", 10);
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);

        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }

    @Test
    public void test_efficientSorting1e2NumbersFromFile(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e2.txt");
        List<Integer> expected_Array = setupExpectedArray("1e2.txt", 100);
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);

        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }

    @Test
    public void test_efficientSorting1e3NumbersFromFile(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e3.txt");
        List<Integer> expected_Array = setupExpectedArray("1e3.txt", 1000);
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);

        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }

    @Test
    public void test_efficientSorting1e4NumbersFromFile(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e4.txt");
        List<Integer> expected_Array = setupExpectedArray("1e4.txt", 10000);
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);

        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }

    @Test
    public void test_efficientSortingNegativeNumbers(){
        List<Integer> expected = new ArrayList<>();
        for(int i = -100; i <= 100; i++)
            expected.add(i);
        Collections.shuffle(expected);
        Sort_Array sortObject = new Sort_Array(expected);
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        expected.sort(Integer::compareTo);
        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

//    @Test
//    public void test_efficientSorting1e5NumbersFromFile(){
//        Sort_Array sortObject = new Sort_Array(path + "\\1e5.txt");
//        List<Integer> expected_Array = setupExpectedArray("1e5.txt", 100000);
//        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
//        expected_Array.sort(Integer::compareTo);
//
//        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
//    }
//
//    @Test
//    public void test_efficientSorting1e6NumbersFromFile(){
//        Sort_Array sortObject = new Sort_Array(path + "\\1e6.txt");
//        List<Integer> expected_Array = setupExpectedArray("1e6.txt", 1000000);
//        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
//        expected_Array.sort(Integer::compareTo);
//
//        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
//    }

    @Test
    public void test_nonComparisonSorting10NumbersFromFile(){
        Sort_Array sortObject = new Sort_Array(path + "\\10.txt");
        List<Integer> expected_Array = setupExpectedArray("10.txt", 10);
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);

        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }

    @Test
    public void test_nonComparisonSorting1e2NumbersFromFile(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e2.txt");
        List<Integer> expected_Array = setupExpectedArray("1e2.txt", 100);
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);

        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }

    @Test
    public void test_nonComparisonSorting1e3NumbersFromFile(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e3.txt");
        List<Integer> expected_Array = setupExpectedArray("1e3.txt", 1000);
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);

        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }
    @Test
    public void test_nonComparisonSorting1e4NumbersFromFile(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e4.txt");
        List<Integer> expected_Array = setupExpectedArray("1e4.txt", 10000);
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        expected_Array.sort(Integer::compareTo);

        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
    }

    @Test
    public void test_nonComparisonSortingNegativeNumbers(){
        List<Integer> expected = new ArrayList<>();
        for(int i = -100; i <= 100; i++)
            expected.add(i);
        Collections.shuffle(expected);
        Sort_Array sortObject = new Sort_Array(expected);
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        expected.sort(Integer::compareTo);
        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }
//    @Test
//    public void test_nonComparisonSorting1e5NumbersFromFile(){
//        Sort_Array sortObject = new Sort_Array(path + "\\1e5.txt");
//        List<Integer> expected_Array = setupExpectedArray("1e5.txt", (int)1e5);
//        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
//        expected_Array.sort(Integer::compareTo);
//
//        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
//    }
//    @Test
//    public void test_nonComparisonSorting1e6NumbersFromFile(){
//        Sort_Array sortObject = new Sort_Array(path + "\\1e6.txt");
//        List<Integer> expected_Array = setupExpectedArray("1e6.txt", (int)1e6);
//        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
//        expected_Array.sort(Integer::compareTo);
//
//        Assert.assertArrayEquals(expected_Array.toArray(), result.toArray());
//    }

//    @Test
//    public void test_1e5words(){
//        List<Integer> nums = new ArrayList<>();
//        for (int i = 0; i < 1e5; i++){
//            nums.add((int)(Math.random() * 1e5));
//        }
//        Sort_Array sortObject = new Sort_Array(nums);
//        List<Integer> res = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
//        nums.sort(Integer::compareTo);
//        Assert.assertArrayEquals(nums.toArray(), res.toArray());
//    }

    @Test
    public void test_simpleSortingBestCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = 1; i <= 1e4; i++)
            expected.add(i);

        Sort_Array sortObject = new Sort_Array(expected);
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void test_simpleSortingWorstCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = (int)1e4; i > 0; i--)
            expected.add(i);

        Sort_Array sortObject = new Sort_Array(expected);
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        expected.sort(Integer::compareTo);
        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void test_simpleSortingAverageCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = 1; i <= 1e4; i++)
            expected.add(i);
        Collections.shuffle(expected);

        Sort_Array sortObject = new Sort_Array(expected);
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        expected.sort(Integer::compareTo);
        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    // in merge sort, the best case is still O(n lg n)
    @Test
    public void test_efficientSortingBestCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = 1; i <= 1e4; i++)
            expected.add(i);

        Sort_Array sortObject = new Sort_Array(expected);
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    // in merge sort, the worst case is still O(2*n lg n)
    @Test
    public void test_efficientSortingWorstCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = (int)1e4; i > 0; i--)
            expected.add(i);

        Sort_Array sortObject = new Sort_Array(expected);
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        expected.sort(Integer::compareTo);
        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void test_efficientSortingAverageCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = 1; i <= 1e4; i++)
            expected.add(i);
        Collections.shuffle(expected);

        Sort_Array sortObject = new Sort_Array(expected);
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        expected.sort(Integer::compareTo);
        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    // best case in counting sort is still O(n) but it is not dependent on the input
    @Test
    public void test_nonComparsionSortingBestCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = 1; i <= 1e4; i++)
            expected.add(i);

        Sort_Array sortObject = new Sort_Array(expected);
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    // worst case in counting sort is when you give it a large range of numbers
    @Test
    public void test_nonComparsionSortingWorstCase(){
        List<Integer> expected = new ArrayList<>();
        expected.add((int)1e8);
        expected.add((int)-1e7);
        expected.add((int)-1e6);
        expected.add((int)-1e5);
        expected.add((int)-1e4);
        expected.add((int)-1e3);
        expected.add((int)-1e2);
        expected.add((int)-10);
        expected.add((int)1e7);
        expected.add((int)1e6);
        expected.add((int)1e5);
        expected.add((int)1e4);
        expected.add((int)1e3);
        expected.add((int)1e2);
        Sort_Array sortObject = new Sort_Array(expected);
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        expected.sort(Integer::compareTo);
        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

}