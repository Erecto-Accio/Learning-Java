public class binomial_coefficent {
    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static int binomialCoefficent(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_m_r_fact = factorial(n - r);

        int biCoeff = n_fact / (r_fact * n_m_r_fact);

        return biCoeff;
    }

    public static void main(String[] args) {
        System.out.println(binomialCoefficent(5, 2));
    }
}
