class Solution {
    public int divide(long dividend, long divisor) {
        if (divisor == 1) {
            return (int) dividend;
        }
        if (divisor == dividend) {
            return 1;
        }
        if ((divisor == 1 && dividend == -1) || (divisor == -1 && dividend == 1)) {
            return -1;
        }
        long times = 0;
        long negdivisor = divisor < 0 ? -1 : 1;

        long negquatient = dividend < 0 ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (dividend > divisor) {
            times = times + 1;
            dividend = dividend - divisor;

        }
        if(negdivisor==-1 && negquatient==-1)
        {
            return (int)(times+1);
        }
        return (int) (times * negquatient * negdivisor);

    }
}