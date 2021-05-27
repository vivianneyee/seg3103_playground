import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DateNextDateOkTest
{
  @Test
  void testDate1() {
    Date d = new Date(1700, 6, 20);
    assertNextDate(d, new Date(1700, 6, 21));
  }
  @Test
  void testDate2() {
    Date d = new Date(2005, 4, 15);
    assertNextDate(d, new Date(2005, 4, 16));
  }
  @Test
  void testDate3() {
    Date d = new Date(1901, 7, 20);
    assertNextDate(d, new Date(1901, 7, 21));
  }
  @Test
  void testDate4() {
    Date d = new Date(3456, 3, 27);
    assertNextDate(d, new Date(3456, 3, 28));
  }
  @Test
  void testDate5() {
    Date d = new Date(1500, 2, 17);
    assertNextDate(d, new Date(1500, 2, 18));
  }
  @Test
  void testDate6() {
    Date d = new Date(1700, 6, 29);
    assertNextDate(d, new Date(1700, 6, 30));
  }
  @Test
  void testDate7() {
    Date d = new Date(1800, 11, 29);
    assertNextDate(d, new Date(1800, 11, 30));
  }
  @Test
  void testDate8() {
    Date d = new Date(3453, 1, 29);
    assertNextDate(d, new Date(3453, 1, 30));
  }
  @Test
  void testDate9() {
    Date d = new Date(444, 2, 29);
    assertNextDate(d, new Date(444, 3, 1));
  }
  @Test
  void testDate10() {
    Date d = new Date(2005, 4, 30);
    assertNextDate(d, new Date(2005, 5, 1));
  }
  @Test
  void testDate11() {
    Date d = new Date(3453, 1, 30);
    assertNextDate(d, new Date(3453, 1, 31));
  }
  @Test
  void testDate12() {
    Date d = new Date(3456, 3, 30);
    assertNextDate(d, new Date(3456, 3, 31));
  }
  @Test
  void testDate13() {
    Date d = new Date(1901, 7, 31);
    assertNextDate(d, new Date(1901, 8, 1));
  }
  @Test
  void testDate14() {
    Date d = new Date(3453, 1, 31);
    assertNextDate(d, new Date(3453, 2, 1));
  }
  @Test
  void testDate15() {
    Date d = new Date(3456, 12, 31);
    assertNextDate(d, new Date(3457, 1, 1));
  }
  private void assertNextDate(Date date, Date expectedNewDate) {
    assertEquals(date.nextDate(), expectedNewDate);
  }
}
