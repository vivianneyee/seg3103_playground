
public class Tic {

  private int rows, cols;

  public Tic(int rows, int cols) {
    this.rows = rows;
    this.cols = cols;
  }

  public Tic() {
    this.rows = 3;
    this.cols = 3;
  }

  @Override
  public String toString() {
    String board = "";
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (j == 0) {
          board += "_";
        } else {
          board += "|_";
        }
      }
      if (rows > 1 && i != rows - 1) {
        board += "\n";
      }
    }
    return board;
  }

  public int size() {
    return rows*cols;
  }

  public String showPositions() {
    String board = "";
    int x = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (j == 0) {
          board += x++;
        } else {
          board += "|" + x++;
        }
      }
      if (rows > 1 && i != rows - 1) {
        board += "\n";
      }
    }
    return board;
  }

}
