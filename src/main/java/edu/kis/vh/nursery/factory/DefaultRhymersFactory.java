package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.CountingOut;
import edu.kis.vh.nursery.FIFO;
import edu.kis.vh.nursery.Hanoi;

public class DefaultRhymersFactory implements Rhymersfactory {

    @Override
    public CountingOut GetStandardRhymer() {
        return new CountingOut();
    }

    @Override
    public CountingOut GetFalseRhymer() {
        return new CountingOut();
    }

    @Override
    public CountingOut GetFIFORhymer() {
        return new FIFO();
    }

    @Override
    public CountingOut GetHanoiRhymer() {
        return new Hanoi();
    }

}
