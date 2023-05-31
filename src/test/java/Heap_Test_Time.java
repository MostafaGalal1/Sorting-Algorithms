import Algorithms.Max_Heap;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.*;

public class Heap_Test_Time
{
    private String path = System.getProperty("user.dir") + "\\src\\test\\java";
    private List<Integer> setupArrayFromFile(String fileName, int sz){
        path += "\\" + fileName;
        String newPath = path.replace("\"","");
        List<Integer> expectedArray = new ArrayList<>();
        try {
            File file = new File(newPath);
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] elements = line.split(",");

            for (String element : elements) {
                int value = Integer.parseInt(element.trim());
                expectedArray.add(value);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("No such File!");
        }
        return expectedArray;
    }

    @Test
    public void test_heapsort10Elements(){
        List<Integer> arr = setupArrayFromFile("10.txt", 10);
        Max_Heap heap = new Max_Heap(10);
        Long t1 = System.currentTimeMillis() ;
        heap.BUILD_MAX_HEAP(arr.toArray(new Integer[0]));
        heap.Sort();
        Long t2 = System.currentTimeMillis() ;
        System.out.println("sort heap 10 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_heapsort100Elements(){
        List<Integer> arr = setupArrayFromFile("1e2.txt", 100);
        Max_Heap heap = new Max_Heap(100);
        Long t1 = System.currentTimeMillis() ;
        heap.BUILD_MAX_HEAP(arr.toArray(new Integer[0]));
        heap.Sort();
        Long t2 = System.currentTimeMillis() ;
        System.out.println("sort heap 1e2 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_heapsort1e3Elements(){
        List<Integer> arr = setupArrayFromFile("1e3.txt", 1000);
        Max_Heap heap = new Max_Heap(1000);
        Long t1 = System.currentTimeMillis() ;
        heap.BUILD_MAX_HEAP(arr.toArray(new Integer[0]));
        heap.Sort();
        Long t2 = System.currentTimeMillis() ;
        System.out.println("sort heap 1e3 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_heapsort1e4Elements(){
        List<Integer> arr = setupArrayFromFile("1e4.txt", 10000);
        Max_Heap heap = new Max_Heap(10000);
        Long t1 = System.currentTimeMillis() ;
        heap.BUILD_MAX_HEAP(arr.toArray(new Integer[0]));
        heap.Sort();
        Long t2 = System.currentTimeMillis() ;
        System.out.println("sort heap 1e4 elements took : " + (t2-t1) + " ms");
    }

//    @Test
//    public void test_heapsort1e5Elements(){
//        List<Integer> arr = setupArrayFromFile("1e5.txt", 100000);
//        Max_Heap heap = new Max_Heap(100000);
//        Long t1 = System.currentTimeMillis() ;
//        heap.BUILD_MAX_HEAP(arr.toArray(new Integer[0]));
//        heap.Sort();
//        Long t2 = System.currentTimeMillis() ;
//        System.out.println("sort heap 1e5 elements took : " + (t2-t1) + " ms");
//    }

    @Test
    public void test_heapsort500Elements(){
        List<Integer> arr = setupArrayFromFile("500.txt", 500);
        Max_Heap heap = new Max_Heap(500);
        Long t1 = System.currentTimeMillis() ;
        heap.BUILD_MAX_HEAP(arr.toArray(new Integer[0]));
        heap.Sort();
        Long t2 = System.currentTimeMillis() ;
        System.out.println("sort heap 500 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_heapsort5000Elements(){
        List<Integer> arr = setupArrayFromFile("5000.txt", 5000);
        Max_Heap heap = new Max_Heap(5000);
        Long t1 = System.currentTimeMillis() ;
        heap.BUILD_MAX_HEAP(arr.toArray(new Integer[0]));
        heap.Sort();
        Long t2 = System.currentTimeMillis() ;
        System.out.println("sort heap 5000 elements took : " + (t2-t1) + " ms");
    }

//    @Test
//    public void test_heapsort1e6Elements(){
//        List<Integer> arr = setupArrayFromFile("1e6.txt", 1000000);
//        Max_Heap heap = new Max_Heap(1000000);
//        Long t1 = System.currentTimeMillis() ;
//        heap.BUILD_MAX_HEAP(arr.toArray(new Integer[0]));
//        heap.Sort();
//        Long t2 = System.currentTimeMillis() ;
//        System.out.println("sort heap 1e6 elements took : " + (t2-t1) + " ms");
//    }


    @Test
    public void test_heapSortBestCaseFromMaxtoMin(){
        List<Integer> arr = new ArrayList<>();
        for(int i = (int)1e4; i > 0; i--){
            arr.add(i);
        }
        Max_Heap heap = new Max_Heap(10000);
        Long t1 = System.currentTimeMillis() ;
        heap.BUILD_MAX_HEAP(arr.toArray(new Integer[0]));
        heap.Sort();
        Long t2 = System.currentTimeMillis() ;
        System.out.println("heap sort best case 1e4 elements took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_sortHeapWorstCaseFromMinToMax(){
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 1e4; i++){
            arr.add(i);
        }
        Max_Heap heap = new Max_Heap(10000);
        Long t1 = System.currentTimeMillis() ;
        heap.BUILD_MAX_HEAP(arr.toArray(new Integer[0]));
        heap.Sort();
        Long t2 = System.currentTimeMillis() ;
        System.out.println("heap sort worst case 1e4 elements in took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_sortHeapAverageCase(){
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 1e4; i++){
            arr.add(i);
        }
        Collections.shuffle(arr);
        Max_Heap heap = new Max_Heap(10000);
        Long t1 = System.currentTimeMillis() ;
        heap.BUILD_MAX_HEAP(arr.toArray(new Integer[0]));
        heap.Sort();
        Long t2 = System.currentTimeMillis() ;
        System.out.println("heap sort average case 1e4 elements in took : " + (t2-t1) + " ms");
    }

    @Test
    public void test_meanTimeForInsertion(){
        Max_Heap heap = new Max_Heap((int)1e6);
        Random rand = new Random();
        Double totalTime = (double) 0;
        for (int i = 0; i < 1e6; i++){
            Long t1 = System.currentTimeMillis() ;
            heap.MAX_HEAP_INSERT(rand.nextInt((int)1e9));
            Long t2 = System.currentTimeMillis() ;
            totalTime += (t2-t1);
        }
        System.out.println("mean time to insert an element using 1e6 numbers : " + totalTime/1e6  + " ms");
    }

    // generates heap using basic insertion, deletes the root, and checks to see if its correct
    //TODO 2d array heap size out of space
    @Test
    public void test_deleteMeanTime(){
        Max_Heap heap = new Max_Heap(10000);
        Random random = new Random();
        for(int i = 0; i < 10000; i++){
            heap.MAX_HEAP_INSERT(random.nextInt((int)1e9));
        }
        Double totalTime = (double) 0;
        for(int i = 0; i < 10000; i++){
            Long t1 = System.currentTimeMillis() ;
            heap.removeTopElement(new ArrayList<>());
            Long t2 = System.currentTimeMillis() ;
            totalTime += (t2-t1);
        }
        System.out.println("mean time to delete an element using 1e6 numbers : " + totalTime/1e4  + " ms");

    }

}
