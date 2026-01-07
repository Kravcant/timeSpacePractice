import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Practice {

  // Time Complexity: O(n), n = array.length
  // Space Complexity: O(n), n = array.length
  public static List<Integer> findEvens(int[] array) {
    List<Integer> evens = new ArrayList<>();
    for (int num : array) {
      if (num % 2 == 0) {
        evens.add(num);
      }
    }
    return evens;
  }

  // Time Complexity: O(n), n = matrix.length
  // Space Complexity: O(1)
  public static int sumDiagonal(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      sum += matrix[i][i];
    }
    return sum;
  }
  

  // Time Complexity: O(n), n = array.length
  // Space Complexity: O(n), n = array.length
  // Does the 'T' look confusing? Consider refreshing on generic methods
  // We'll revisit generics as a class later
  public static <T> Map<T, Integer> countFrequencies(T[] array) {
    HashMap<T, Integer> frequencies = new HashMap<>();
    for (T val : array) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
    }
    return frequencies;
  }

  // Time Complexity: O(n), n = n
  // Space Complexity: O(n)
  public static List<Integer> evensToSquare(int n) {
    List<Integer> evens = new ArrayList<>();
    for(int i = 0; i <= n*n; i+=2) {
      evens.add(i);
    }
    return evens;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST RUN IN O(n) TIME. n = nums.size()
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: O(n), n = nums.length
   * Space Complexity: O(n), n = nums.length
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonTimeEfficient(int[] nums) {
    // complete this method with an implementation that runs in O(n) time. n = nums.size()
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.putIfAbsent(num, 0);
      map.put(num, map.get(num) + 1);
    }
    
    int maxValue = 0;
    for (int value : map.values()) {
      if (value > maxValue) {
        maxValue = value;
      }
    }

    for (int num : nums) {
      if (map.get(num) == maxValue) {
        return num;
      }
    }
    
    return -1;
  }

  /**
   * Returns the integer that shows up most frequently in an array.
   * If there is a tie, tiebreak by returning the one that shows up first
   * in the array.
   * 
   * THIS METHOD MUST USE ONLY O(1) SPACE.
   * 
   * Once you finish, WRITE TESTS FOR IT in PracticeTest.java
   * 
   * Time Complexity: 
   * Space Complexity: 
   * 
   * @param nums An array of integers
   * @return the integer that shows up most commonly
   */
  public static int mostCommonSpaceEfficient(int[] nums) {
    // complete this method with an implementation that runs in 0(1) space.
    Arrays.sort(nums);

    int maxValue = 1;
    int count = 1;
    int maxNum = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums [i - 1]) {
        count++;
      } else {
        count = 1;
      }

      if (count > maxValue) {
        maxValue = count;
        maxNum = nums[i];
      }
    }

    return maxNum;
  }
}