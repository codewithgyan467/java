public class Box {
  int volume;

  Box(int side) {
    volume = side * side * side;
  }

  Box(int length, int width, int height) {
    volume = length * width * height;
  }
}
