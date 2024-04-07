package oop.polynomials;

import java.util.ArrayList;
import java.util.Arrays;

public class ListPoly extends AbstractPoly {
    protected ArrayList<Double> coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<>();
        Arrays.stream(coefficients).forEach(c -> this.coefficients.add(c));
    }

    @Override
    public double coefficient(int c) {
        if(c<coefficients.size()){
            return coefficients.get(c);
        }
        return 0;
    }

    @Override
    public double[] coefficients() {
        return coefficients.stream().mapToDouble(coefficient -> coefficient).toArray();
    }

    @Override
    public int degree() {
        return coefficients.size()-1;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }
}
