import java.math.BigInteger;

class Solution {
    public BigInteger sum(int a[]) {
        int l = a.length;
        int f = l;
        BigInteger s = BigInteger.ZERO;
        BigInteger prod = BigInteger.ONE;

        for(int i = 0; i < l; i++) {
            BigInteger power = BigInteger.TEN.pow(f - 1);
            prod = BigInteger.valueOf(a[i]).multiply(power);
            s = s.add(prod);
            f--;
        }

        s = s.add(BigInteger.ONE);
        return s;
    }

    public int count(BigInteger i) {
        int cou = 0;

        while(i.compareTo(BigInteger.ZERO) > 0) {
            cou++;
            i = i.divide(BigInteger.TEN);
        }

        return cou;
    }

    public int[] ar(BigInteger digit, int c) {
        int b[] = new int[c];
        int l = b.length;
        BigInteger d;

        while(digit.compareTo(BigInteger.ZERO) > 0) {
            d = digit.mod(BigInteger.TEN);
            b[l - 1] = d.intValue();
            digit = digit.divide(BigInteger.TEN);
            l--;
        }

        return b;
    }

    public int[] plusOne(int[] digits) {
        BigInteger digit = sum(digits);
        int c = count(digit);
        return ar(digit, c);
    }
}