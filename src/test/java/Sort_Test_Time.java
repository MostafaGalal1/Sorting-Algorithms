import Algorithms.Sort_Array;
import Algorithms.Sorting_Choice;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_Test_Time {
    private String path = System.getProperty("user.dir") + "\\src\\test\\java";
    @Test
    public void time_analysis_simpleSort_10(){
        Sort_Array sortObject = new Sort_Array(path + "\\10.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting 10 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_simpleSort_1e2(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e2.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting 1e2 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_simpleSort_1e3(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e3.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting 1e3 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_simpleSort_1e4(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e4.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting 1e4 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void time_analysis_simpleSort_500(){
        Sort_Array sortObject = new Sort_Array(path + "\\500.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting 500 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void time_analysis_simpleSort_5000(){
        Sort_Array sortObject = new Sort_Array(path + "\\5000.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting 5000 elements took : " + (t2-t1) + " ms");
    }

//    @Test
//    public void time_analysis_simpleSort_1e5(){
//        Sort_Array sortObject = new Sort_Array(path + "\\1e5.txt");
//        Long t1 = System.currentTimeMillis();
//        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
//        Long t2 = System.currentTimeMillis();
//        System.out.println("Simple Sorting 1e5 elements took : " + (t2-t1) + " ms");
//    }
//    @Test
//    public void time_analysis_simpleSort_1e6(){
//        Sort_Array sortObject = new Sort_Array(path + "\\1e6.txt");
//        Long t1 = System.currentTimeMillis();
//        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
//        Long t2 = System.currentTimeMillis();
//        System.out.println("Simple Sorting 1e6 elements took : " + (t2-t1) + " ms");
//    }

    @Test
    public void time_analysis_efficientSort_10(){
        Sort_Array sortObject = new Sort_Array(path + "\\10.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Efficient Sorting 10 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_efficientSort_1e2(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e2.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Efficient Sorting 1e2 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_efficientSort_1e3(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e3.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Efficient Sorting 1e3 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_efficientSort_1e4e4(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e4.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Efficient Sorting 1e4 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void time_analysis_efficientSort_5000(){
        Sort_Array sortObject = new Sort_Array(path + "\\5000.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Efficient Sorting 5000 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void time_analysis_efficientSort_500(){
        Sort_Array sortObject = new Sort_Array(path + "\\500.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Efficient Sorting 500 elements took : " + (t2-t1) + " ms");
    }

//    @Test
//    public void time_analysis_efficientSort_1e5(){
//        Sort_Array sortObject = new Sort_Array(path + "\\1e5.txt");
//        Long t1 = System.currentTimeMillis();
//        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
//        Long t2 = System.currentTimeMillis();
//        System.out.println("Simple Sorting 1e5 elements took : " + (t2-t1) + " ms");
//    }
//    @Test
//    public void time_analysis_efficientSort_1e6(){
//        Sort_Array sortObject = new Sort_Array(path + "\\1e6.txt");
//        Long t1 = System.currentTimeMillis();
//        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
//        Long t2 = System.currentTimeMillis();
//        System.out.println("Simple Sorting 1e6 elements took : " + (t2-t1) + " ms");
//    }


    @Test
    public void time_analysis_no_comparisontSort_10(){
        Sort_Array sortObject = new Sort_Array(path + "\\10.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Non comparison Sorting 10 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_no_comparisontSort_1e2(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e2.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Non comparison Sorting 1e2 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_no_comparisontSort_1e3(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e3.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Non comparison Sorting 1e3 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_no_comparisontSort_1e4e4(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e4.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Non comparison Sorting 1e4 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void time_analysis_no_comparisontSort_5000(){
        Sort_Array sortObject = new Sort_Array(path + "\\5000.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Non comparison Sorting 5000 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void time_analysis_no_comparisontSort_500(){
        Sort_Array sortObject = new Sort_Array(path + "\\500.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Non comparison Sorting 500 elements took : " + (t2-t1) + " ms");
    }

//   @Test
//    public void time_analysis_efficientSort_5000(){
//        Sort_Array sortObject = new Sort_Array(path + "\\5000.txt");
//        Long t1 = System.currentTimeMillis();
//        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
//        Long t2 = System.currentTimeMillis();
//        System.out.println("Simple Sorting 1e5 elements took : " + (t2-t1) + " ms");
//    }
//    @Test
//    public void time_analysis_no_comparisontSort_1e6(){
//        Sort_Array sortObject = new Sort_Array(path + "\\1e6.txt");
//        Long t1 = System.currentTimeMillis();
//        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
//        Long t2 = System.currentTimeMillis();
//        System.out.println("Simple Sorting 1e6 elements took : " + (t2-t1) + " ms");
//    }

    @Test
    public void test_simpleSortingBestCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = 1; i <= 1e4; i++)
            expected.add(i);
        Sort_Array sortObject = new Sort_Array(expected);

        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting Best case took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_simpleSortingWorstCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = (int)1e4; i > 0; i--)
            expected.add(i);

        Sort_Array sortObject = new Sort_Array(expected);
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting Worst case took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_simpleSortingAverageCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = 1; i <= 1e4; i++)
            expected.add(i);
        Collections.shuffle(expected);

        Sort_Array sortObject = new Sort_Array(expected);
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting Average case took : " + (t2-t1) + " ms");
    }

    // in merge sort, the best case is still O(n lg n)
    @Test
    public void test_efficientSortingBestCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = 1; i <= 1e4; i++)
            expected.add(i);

        Sort_Array sortObject = new Sort_Array(expected);
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Efficient Sorting Best case took : " + (t2-t1) + " ms");
    }

    // in merge sort, the worst case is still O(2*n lg n)
    @Test
    public void test_efficientSortingWorstCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = (int)1e4; i > 0; i--)
            expected.add(i);

        Sort_Array sortObject = new Sort_Array(expected);
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Efficient Sorting Worst case took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_efficientSortingAverageCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = 1; i <= 1e4; i++)
            expected.add(i);
        Collections.shuffle(expected);

        Sort_Array sortObject = new Sort_Array(expected);
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Efficient Sorting Average case took : " + (t2-t1) + " ms");
    }

    // best case in counting sort is still O(n) but it is not dependent on the input
    @Test
    public void test_nonComparsionSortingBestCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = 1; i <= 1e4; i++)
            expected.add(i);
        Sort_Array sortObject = new Sort_Array(expected);

        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Non comparison Best case took : " + (t2-t1) + " ms");
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
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Non comparison worst case took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_nonComparisonSortingAverageCase(){
        List<Integer> expected = new ArrayList<>();
        for(int i = 1; i <= 1e4; i++)
            expected.add(i);
        Collections.shuffle(expected);

        Sort_Array sortObject = new Sort_Array(expected);
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Non Comparison Sorting Average case took : " + (t2-t1) + " ms");
    }
}
