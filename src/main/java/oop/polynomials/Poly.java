package oop.polynomials;

public interface Poly {
    public double coefficient(int c);
    public double[] coefficients();
    public int degree();
    public Poly derivative();
}
