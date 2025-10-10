// Class to represent a Cube or Cuboid with overloaded constructors
class Box {
    double width, height, depth;

    // Constructor for cuboid (different length, width, height)
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor for cube (all sides equal)
    Box(double len) {
        width = height = depth = len;
    }

    // Optional: Constructor with no parameters (default)
    Box() {
        width = height = depth = 0;
    }

    // Method to calculate the volume
    double volume() {
        return width * height * depth;
    }
}

