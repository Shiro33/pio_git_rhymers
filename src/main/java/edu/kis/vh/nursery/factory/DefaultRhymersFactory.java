package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements edu.kis.vh.nursery.factory.RhymersFactory {

	@Override
	public edu.kis.vh.nursery.DefaultCountingOutRhymer GetStandardRhymer() {
		return new edu.kis.vh.nursery.DefaultCountingOutRhymer();
	}

	@Override
	public edu.kis.vh.nursery.DefaultCountingOutRhymer GetFalseRhymer() {
		return new edu.kis.vh.nursery.DefaultCountingOutRhymer();
	}

	@Override
	public edu.kis.vh.nursery.DefaultCountingOutRhymer GetFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public edu.kis.vh.nursery.DefaultCountingOutRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
