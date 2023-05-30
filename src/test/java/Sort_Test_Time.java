import Algorithms.Sort_Array;
import Algorithms.Sorting_Choice;
import org.junit.jupiter.api.Test;
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
    public void time_analysis_simpleSort_1e4e4(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e4.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Simple_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting 1e4 elements took : " + (t2-t1) + " ms");
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
        System.out.println("Simple Sorting 10 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_efficientSort_1e2(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e2.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting 1e2 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_efficientSort_1e3(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e3.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting 1e3 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_efficientSort_1e4e4(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e4.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Efficient_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting 1e4 elements took : " + (t2-t1) + " ms");
    }
    @Test
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
        System.out.println("Simple Sorting 10 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_no_comparisontSort_1e2(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e2.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting 1e2 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_no_comparisontSort_1e3(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e3.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting 1e3 elements took : " + (t2-t1) + " ms");
    }
    @Test
    public void time_analysis_no_comparisontSort_1e4e4(){
        Sort_Array sortObject = new Sort_Array(path + "\\1e4.txt");
        Long t1 = System.currentTimeMillis();
        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
        Long t2 = System.currentTimeMillis();
        System.out.println("Simple Sorting 1e4 elements took : " + (t2-t1) + " ms");
    }
//    @Test
//    public void time_analysis_no_comparisontSort_1e5(){
//        Sort_Array sortObject = new Sort_Array(path + "\\1e5.txt");
//        Long t1 = System.currentTimeMillis();
//        List<Integer> result = sortObject.Non_Comparison_Sort(Sorting_Choice.Final_Result).get(0);
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

}
