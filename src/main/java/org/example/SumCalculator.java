package org.example;

public class SumCalculator {
    public int sum(int n){
        if(n <= 0) throw new IllegalArgumentException();

        int summ = 0;
        for (int i = 0; i <= n; i++) {
            summ += i;
        }
        return summ;
    }
}
