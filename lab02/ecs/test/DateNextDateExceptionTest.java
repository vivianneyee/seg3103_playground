import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DateNextDateExceptionTest
{
  @Test
  private void testDate16() {
    assertNextDateException(new Date(1500, 02, 31));
  }
  @Test
  private void testDate17() {
    assertNextDateException(new Date(1500, 02, 29));
  }
  @Test
  private void testDate18() {
    assertNextDateException(new Date(-1, 10, 20));
  }
  @Test
  private void testDate19() {
    assertNextDateException(new Date(1458, 15, 12));
  }
  @Test
  private void testDate20() {
    assertNextDateException(new Date(1975, 6, -50));
  }
  private void assertNextDateException(Date date) {
    assertThrows(IllegalArgumentException.class, () -> {
      date.nextDate();
    });
  }
}
