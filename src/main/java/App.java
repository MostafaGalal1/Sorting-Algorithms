import java.util.List;
import java.util.Scanner;

import Algorithms.Sort_Array;
import Algorithms.Sorting_Choice;

public class App
{
     // TODO da 3ndaha
     public void display() {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Enter the file path: ");
          String filePath = scanner.nextLine();

          Sort_Array sortArray = new Sort_Array(filePath);

          while (true) {
               Main_Menu();
               int choice = scanner.nextInt();
               scanner.nextLine();

               switch (choice) {
                    case 0:
                         System.out.println("Exiting...");
                         scanner.close();
                         System.exit(0);
                    case 1:
                         Sort_Menu(scanner, sortArray);
                         break;
                    default:
                         System.out.println("Invalid choice!");
               }
          }
     }

     private static void Sort_Menu(Scanner scanner, Sort_Array sortArray) {
          System.out.println();
          System.out.println("----- Sort Menu -----");
          System.out.println("1. Simple Sort");
          System.out.println("2. Efficient Sort");
          System.out.println("3. Non-Comparison Sort");
          System.out.println("4. Heap Sort");
          System.out.println("0. Back to Main Menu");
          System.out.println("---------------------");
          System.out.print("Enter your choice: ");

          int sortChoice = scanner.nextInt();
          scanner.nextLine();

          System.out.print("Return intermediate arrays? (1: Yes, 2: No): ");
          int isIntermediate = scanner.nextInt();
          scanner.nextLine();
          Sorting_Choice choice = (isIntermediate == 1) ? Sorting_Choice.Intermediate_Results : Sorting_Choice.Final_Result;

          List<List<Integer>> sortedArray;
          switch (sortChoice) {
               case 0:
                    return;
               case 1:
                    sortedArray = sortArray.Simple_Sort(choice);
                    break;
               case 2:
                    sortedArray = sortArray.Efficient_Sort(choice);
                    break;
               case 3:
                    sortedArray = sortArray.Non_Comparison_Sort(choice);
                    break;
               case 4:
                    sortedArray = sortArray.Heap_Sort(choice);
                    break;
               default:
                    System.out.println("Invalid choice!");
                    return;
          }
          System.out.println("Sorted Array:");
          Print_List(sortedArray);
     }

     private static void Print_List(List<List<Integer>> list) {
          for (List<Integer> sublist : list) {
               for (int i = 0; i < sublist.size(); i++) {
                    System.out.print(sublist.get(i));
                    if (i < sublist.size() - 1) {
                         System.out.print(", ");
                    }
               }
               System.out.println();
          }
     }

     private static void Main_Menu() {
          System.out.println();
          System.out.println("----- Menu -----");
          System.out.println("0. Exit");
          System.out.println("1. Sort the list of elements");
          System.out.println("----------------");
          System.out.print("Enter your choice: ");
     }

     public static void main(String[] args) {
          App app = new App();
          app.display();
     }
}