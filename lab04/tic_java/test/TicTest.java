import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {
  Tic tic = new Tic();

  @Test
  void test_emptyBoard_1x1() {
    assertEquals("_", tic.emptyBoard(1,1));
  }
}
