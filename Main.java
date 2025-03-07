import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class Main
{
  public static void main(String[] args)
  {
    String[] arr = {"forest", "apple", "willow", "lake", "trees"};
    sortAndPrintDescending(arr);

    ArrayList<Integer> list = new ArrayList<>();
      list.add(4);
      list.add(6);
      list.add(3);
      list.add(7);
      selectSortDescending(list);
      System.out.println(list);

  }


  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  public static void sortAndPrintDescending(String[] arr)
  {
    for (int i = 0; i < arr.length - 1; i++)
    {
      int max = i;
      for (int j = i+1; j < arr.length; j++)
      {
        if (arr[j].substring(0,1).compareTo(arr[max].substring(0,1)) > 0)
      {
        max = j;
      }
      }
      String temp = arr[i];
      arr[i] = arr[max];
      arr[max] = temp;
    }
    String arrayString = Arrays.toString(arr);
    System.out.println(arrayString);
    }
  }

  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  
   public static void selectSortDescending(ArrayList<Integer> list) {
        int n = list.size();
        
        // Selection sort in descending order
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) > list.get(maxIndex)) {
                    maxIndex = j;
                }
            }
            // Swap the found maximum element with the first element
            int temp = list.get(i);
            list.set(i, list.get(maxIndex));
            list.set(maxIndex, temp);
        }
    }

