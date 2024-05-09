package edu.kis.vh.nursery;




public class defaultCountingOutRhymer {
    private static final int MAX_SIZE = 12;
    private static final int RETURN = -1;
    private static final int EMPTY = -1;
    private static final int FULL_TOTAL = MAX_SIZE - 1;
    private final int[] NUMBERS = new int[MAX_SIZE];

    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == FULL_TOTAL;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN;
        return NUMBERS[total--];
    }

}
