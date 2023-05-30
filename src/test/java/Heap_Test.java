import Algorithms.Max_Heap;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Heap_Test
{
    private Max_Heap heap;

    @Test
    public void Test_Sorting()
    {
        this.heap = new Max_Heap(6);
        heap.add(1);
        heap.add(3);
        heap.add(2);

        Integer[] sorted_array = heap.getSortedArrayAndEmptyHeap();
        Integer[] expedted_array = new Integer[]{3, 2, 1};
        Assertions.assertEquals(true, checkTwoArrayEqual(expedted_array, sorted_array));
    }

    private boolean checkTwoArrayEqual(Integer[] a1, Integer[] a2)
    {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++)
            if (a1[i] != a2[i]) return false;
        return true;
    }
}
