package Algorithms;

import java.io.*;
import java.util.*;

import static Algorithms.Sorting_Choice.*;

public class Sort_Array {
    List<Integer> unsorted_Array;
    int size;

   /* public Sort_Array(String file_path)
    {
        this.unsorted_Array = new ArrayList<>();
        String path = file_path.replace("\"","");

        try {
            File file = new File(file_path);
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] elements = line.split(",");

            for (String element : elements) {
                int value = Integer.parseInt(element.trim());
                this.unsorted_Array.add(value);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("No such File!");
        }

        this.size = this.unsorted_Array.size();
    }*/

    public Sort_Array(String file_path)
    {
        this.unsorted_Array = new ArrayList<>();
        String path = file_path.replace("\"","");

        try {
            FileInputStream file = new FileInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(file));
            String line = reader.readLine();
            while (line != null) {
                this.unsorted_Array.add(Integer.parseInt(line));
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("No such File!");
        }

        this.size = this.unsorted_Array.size();
    }

    public Sort_Array(List<Integer> unsorted_Array)
    {
        this.unsorted_Array = unsorted_Array;
        this.size = this.unsorted_Array.size();
    }

    public List<List<Integer>> Simple_Sort(Sorting_Choice choice) {
        boolean swapped;
        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < this.size - 1; i++) {
            swapped = false;
            for (int j = 0; j < this.size - i - 1; j++) {
                if (this.unsorted_Array.get(j).compareTo(this.unsorted_Array.get(j + 1)) > 0) {
                    int tmp = this.unsorted_Array.get(j);
                    this.unsorted_Array.set(j, this.unsorted_Array.get(j+1));
                    this.unsorted_Array.set(j+1, tmp);
                    swapped = true;
                }
            }

            results.add(new ArrayList<>(this.unsorted_Array));
            if (!swapped)
                break;
        }

        if (choice == Final_Result){
            List<List<Integer>> res = new ArrayList<>();
            res.add(results.get(results.size() - 1));
            return res;
        }
        return results;
    }

    public List<List<Integer>> Efficient_Sort(Sorting_Choice choice)  {
        List<List<Integer>> results = new ArrayList<>();
        Sort(results, this.unsorted_Array, 0, this.size-1);

        if (choice == Final_Result){
            List<List<Integer>> res = new ArrayList<>();
            res.add(results.get(results.size() - 1));
            return res;
        }
        return results;
    }
    private void Sort(List<List<Integer>> results, List<Integer> array, int start, int end) {
        if (start >= end)
            return;
        int mid = (start + end) / 2;

        Sort(results, array, start, mid);
        Sort(results, array, mid + 1, end);

        merge(array, start, end);
        results.add(new ArrayList<>(array));
    }
    
    private void merge(List<Integer> array, int start, int end) {
        int mid = (start + end) / 2;
        List<Integer> temp = new ArrayList<>(end - start + 1);
        int l1 = start, l2 = mid + 1;

        while (l1 <= mid && l2 <= end)
        {
            if (array.get(l1).compareTo(array.get(l2)) < 0) {
                temp.add(array.get(l1++));
            } else {
                temp.add(array.get(l2++));
            }
        }

        while (l1 <= mid) {
            temp.add(array.get(l1++));
        }
        while (l2 <= end) {
            temp.add(array.get(l2++));
        }
        
        for (int i = 0; i + start <= end; i++) {
            array.set(i + start, temp.get(i));
        }
    }

    public List<List<Integer>> Non_Comparison_Sort(Sorting_Choice choice){
        List<List<Integer>> results = new ArrayList<>();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < this.size; i++){
            if (this.unsorted_Array.get(i) < min){
                min = this.unsorted_Array.get(i);
            }
            if (this.unsorted_Array.get(i) > max){
                max = this.unsorted_Array.get(i);
            }
        }

        int [] frequency_Array = new int[max - min + 1];
        for (int i = 0; i < this.size; i++){
            frequency_Array[this.unsorted_Array.get(i) - min]++;
        }

        int ind = 0;
        for (int i = 1; i < frequency_Array.length; i++){
            frequency_Array[i] += frequency_Array[i-1];
            int temp = frequency_Array[i-1];
            frequency_Array[i-1] = ind;
            ind = temp;
        }
        frequency_Array[frequency_Array.length - 1] = ind;

        List<Integer> auxiliary_Array = new ArrayList<>(Collections.nCopies(this.size, null));

        for (int i = 0; i < this.size; i++) {
            auxiliary_Array.set(frequency_Array[this.unsorted_Array.get(i) - min]++, this.unsorted_Array.get(i));
            results.add(new ArrayList<>(auxiliary_Array));
        }

        if (choice == Final_Result){
            List<List<Integer>> res = new ArrayList<>();
            res.add(results.get(results.size() - 1));
            return res;
        }
        return results;
    }

    public List<List<Integer>> Heap_Sort(Sorting_Choice choice) {
        Integer[] auxiliary_Array = new Integer[this.size];
        Max_Heap maxHeap = new Max_Heap(this.unsorted_Array.toArray(auxiliary_Array));

        List<List<Integer>> results = maxHeap.Sort();

        if (choice == Final_Result){
            List<List<Integer>> res = new ArrayList<>();
            res.add(results.get(results.size() - 1));
            return res;
        }
        return results;
    }
}
