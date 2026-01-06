import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

  @Test
  public void mostCommonTimeEfficientOneMax() {
    int[] nums = {0,2,0,5,0,6,0,1,0,2};
    int max = Practice.mostCommonTimeEfficient(nums);
    assertEquals(max, 0);
  }

  @Test
  public void mostCommonSpaceEfficientOneMax() {
    int[] nums = {0,2,0,5,0,6,0,1,0,2};
    int max = Practice.mostCommonSpaceEfficient(nums);
    assertEquals(max, 0);
  }
}