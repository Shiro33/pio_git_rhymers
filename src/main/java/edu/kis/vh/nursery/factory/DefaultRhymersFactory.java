package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements edu.kis.vh.nursery.factory.RhymersFactory {

	@Override
	public edu.kis.vh.nursery.DefaultCountingOutRhymer getStandardRhymer() {
		return new edu.kis.vh.nursery.DefaultCountingOutRhymer();
	}

	@Override
	public edu.kis.vh.nursery.DefaultCountingOutRhymer getFalseRhymer() {
		return new edu.kis.vh.nursery.DefaultCountingOutRhymer();
	}

	@Override
	public edu.kis.vh.nursery.DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public edu.kis.vh.nursery.DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
