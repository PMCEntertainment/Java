abstract class EquationSolver {
    public abstract void solve(double a1, double b1, double c1, double a2, double b2, double c2);
}

class LinearEquationSolver extends EquationSolver {
    @Override
    public void solve(double a1, double b1, double c1, double a2, double b2, double c2) {
        double determinant = a1 * b2 - a2 * b1;

        if (determinant == 0) {
            System.out.println("The equation has no solution.");
        } else {
            double x = (b2 * c1 - b1 * c2) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            System.out.println("The solution is: x = " + x + ", y = " + y);
        }
    }
}

class QuadraticEquationSolver extends EquationSolver {
    @Override
    public void solve(double a, double b, double c, double d, double e, double f) {
        double determinant = a * e - b * d;

        if (determinant == 0) {
            System.out.println("The equation has no solution.");
        } else {
            double x = (c * e - b * f) / determinant;
            double y = (a * f - c * d) / determinant;
            System.out.println("The solution is: x = " + x + ", y = " + y);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EquationSolver linearSolver = new LinearEquationSolver();
        linearSolver.solve(2, 3, 7, 4, -1, 1);

        EquationSolver quadraticSolver = new QuadraticEquationSolver();
        quadraticSolver.solve(2, 3, 1, 4, -1, 2);
    }
}
