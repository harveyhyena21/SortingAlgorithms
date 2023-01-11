/**
 * Avticity 3.7.6
 */
import java.util.ArrayList;

public class SortingAlgorithms
{
  /**
   * Perform a selection sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList)
  {
    /* your code goes here */
    for (int i = 0; i < intList.size(); i++) {
      int minIndex = i;
      for (int j = i + 1; j < intList.size(); j++) {
        if (intList.get(j) < intList.get(minIndex)) minIndex = j;
      }

      int minValue = intList.get(minIndex);
      int temp = intList.get(i);
      
      if (minValue < temp) {
        intList.set(i, minValue);
        intList.set(minIndex, temp);
      }
      
    }
    return intList;
  }

  /**
   * Perform an insertion sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList)
  {
    /* your code goes here */
    for (int i = 1; i < intList.size(); i++) {
      int unsortedValue = intList.get(i);
      int prevIndex = i - 1;

      while (prevIndex >= 0) {
        int prevNumber = intList.get(prevIndex);
        if (unsortedValue < prevNumber) {
          intList.set(i, unsortedValue);
          intList.set(prevIndex, prevNumber);
        }
        prevIndex--;
      }
    }
    return intList;
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 
  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList)
  {
    /* your code goes here */
    for (int i = 0; i < doubleList.size(); i++) {
      int minIndex = i;
      for (int j = i + 1; j < doubleList.size(); j++) {
        if (doubleList.get(j) < doubleList.get(minIndex)) minIndex = j;
      }

      double minValue = doubleList.get(minIndex);
      double temp = doubleList.get(i);
      
      if (minValue < temp) {
        doubleList.set(i, minValue);
        doubleList.set(minIndex, temp);
      }
      
    }
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList)
  {
    /* your code goes here */
    for (int i = 1; i < doubleList.size(); i++) {
      double unsortedValue = doubleList.get(i);
      int prevIndex = i - 1;

      while (prevIndex >= 0) {
        double prevNumber = doubleList.get(prevIndex);
        if (unsortedValue < prevNumber) {
          doubleList.set(i, unsortedValue);
          doubleList.set(prevIndex, prevNumber);
        }
        prevIndex--;
      }
    }
    return doubleList;
  }

}