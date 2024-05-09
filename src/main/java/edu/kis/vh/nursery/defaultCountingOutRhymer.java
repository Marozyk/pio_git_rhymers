package edu.kis.vh.nursery;




public class defaultCountingOutRhymer {
    private static final int SIZE = 12;
    private static final int TOTAL = -1;
    private static final int FULL_TOTAL = 11;
    private int[] NUMBERS = new int[SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL;
    }

    public boolean isFull() {
        return total == FULL_TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTAL;
        return NUMBERS[total--];
    }

}
