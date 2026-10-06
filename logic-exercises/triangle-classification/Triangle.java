public class Triangle {
    /**
     *  Classifies a triangle based on the length of its three sides.
     *
     * @param a the length of the first side
     * @param b the length of the second side
     * @param c the length of the third side
     * @return "INVALID" if the sides don't satisfy the triangle inequality;
     *         "EQUILATERAL" if all three sides are equal;
     *         "ISOSCELES" if exactly two sides are equal;
     *         "SCALENE" if all three sides are different
     */
    String classifyTriangle(double a, double b, double c) {
        if (a + b <= c || b + c <= a || c + a <= b) { return "INVALID";}
        else if (a == b && b == c) { return "EQUILATERAL"; }
        else if (a == b || b == c || c == a) { return "ISOSCELES"; }
        else { return "SCALENE"; }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        System.out.println(triangle.classifyTriangle(1, 1, 10));
        System.out.println(triangle.classifyTriangle(5, 5, 5));
        System.out.println(triangle.classifyTriangle(3, 4, 5));
        System.out.println(triangle.classifyTriangle(3, 5, 5));
        System.out.println(triangle.classifyTriangle(1, 2, 3));
    }
}