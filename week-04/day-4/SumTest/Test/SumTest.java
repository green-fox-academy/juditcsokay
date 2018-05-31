import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;

public class SumTest {

  static Sum sum;

  @BeforeClass
  public static void init() {
    sum = new Sum();
  }

  @Test
  public void should_returnSum_when_intArrayInput(){
    int[] inputNumbers = {1,2,3};
    int expectedResult = 6;
    int result = sum.sum(inputNumbers);

    assertEquals(expectedResult, result);
  }

  @Test
  public void should_return0_when_emptyInput(){
    int[] numbers = {};
    int expectedResult = 0;
    int result = sum.sum(numbers);

    assertEquals(expectedResult, result);
  }

  @Test
  public void should_returnElement_when_oneElementIntArrayInput(){
    int[] number = {2};
    int expectedResult = 2;

    int result = sum.sum(number);

    assertEquals(expectedResult,result);
  }

  @Test
  public void should_returnSum_when_moreThenOneElementIntArrayInput(){
    int[] numbers = {1,1,1,1,1};
    int expectedResult = 5;

    int result = sum.sum(numbers);

    assertEquals(expectedResult,result);
  }

  @Test
  public void should_returnNull_when_nullInput(){
    int expectedResult = 0;

    int result = sum.sum(null);

    assertEquals(expectedResult,result);
  }
}