package oop.basic;

import lombok.Getter;

import java.util.Objects;

@Getter
public class RationalNumber {
    private final int numerator;
    private final int denominator;

    public static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(Math.abs(a), Math.abs(b));
        int min = Math.min(Math.abs(a), Math.abs(b));

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    public RationalNumber(int numerator, int denominator){
        int div = greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator / div;
        this.denominator = denominator / div;
    }

    public RationalNumber add(RationalNumber o){
        int mcm = leastCommonMultiple(denominator, o.getDenominator());
        int num = mcm / denominator * numerator + mcm / o.getDenominator() * o.getNumerator();
        return new RationalNumber(num, mcm);
    }

    public RationalNumber multiply(RationalNumber o){
        return new RationalNumber(o.getNumerator() * numerator, o.getDenominator() * denominator);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String   toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
