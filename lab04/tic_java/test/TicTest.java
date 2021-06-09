import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {

  @Test
  void test_toString_1x1() {
    Tic t = new Tic(1,1);
    assertEquals("_", t.toString());
  }

  @Test
  void test_toString_1xn() {
    Tic t1 = new Tic(1,2);
    Tic t2 = new Tic(1,3);
    Tic t3 = new Tic(1,7);
    String e1, e2, e3;
    e1 = "_|_";
    e2 = "_|_|_";
    e3 = "_|_|_|_|_|_|_";
    assertEquals(e1, t1.toString());
    assertEquals(e2, t2.toString());
    assertEquals(e3, t3.toString());
  }

  @Test
  void test_toString_nx1() {
    Tic t1 = new Tic(2,1);
    Tic t2 = new Tic(3,1);
    Tic t3 = new Tic(7,1);
    String e1, e2, e3;
    e1 = "_\n_";
    e2 = "_\n_\n_";
    e3 = "_\n_\n_\n_\n_\n_\n_";
    assertEquals(e1, t1.toString());
    assertEquals(e2, t2.toString());
    assertEquals(e3, t3.toString());
  }

  @Test
  void test_toString_nxm() {
    Tic t1 = new Tic(3,4);
    Tic t2 = new Tic(4,3);
    String e1, e2, e3;
    e1 = "_|_|_|_\n_|_|_|_\n_|_|_|_";
    e2 = "_|_|_\n_|_|_\n_|_|_\n_|_|_";
    assertEquals(e1, t1.toString());
    assertEquals(e2, t2.toString());
  }

  @Test
  void test_size_default() {
    Tic t = new Tic();
    assertEquals(9, t.size());
  }

  @Test
  void test_size_1xn() {
    Tic t1 = new Tic(1,2);
    Tic t2 = new Tic(1,3);
    Tic t3 = new Tic(1,7);
    assertEquals(2, t1.size());
    assertEquals(3, t2.size());
    assertEquals(7, t3.size());
  }

  @Test
  void test_size_nx1() {
    Tic t1 = new Tic(2,1);
    Tic t2 = new Tic(3,1);
    Tic t3 = new Tic(7,1);
    assertEquals(2, t1.size());
    assertEquals(3, t2.size());
    assertEquals(7, t3.size());
  }

  @Test
  void test_size_nxm() {
    Tic t1 = new Tic(3,4);
    Tic t2 = new Tic(5,6);
    assertEquals(12, t1.size());
    assertEquals(30, t2.size());
  }

  @Test
  void test_showPositions() {
    Tic t = new Tic(3,4);
    String e = "0|1|2|3\n4|5|6|7\n8|9|10|11";
    assertEquals(e,t.showPositions());
  }
}
