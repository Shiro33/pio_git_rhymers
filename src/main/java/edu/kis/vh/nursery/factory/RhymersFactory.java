package edu.kis.vh.nursery.factory;

public interface RhymersFactory {
	
	public edu.kis.vh.nursery.DefaultCountingOutRhymer getStandardRhymer();
		
	public edu.kis.vh.nursery.DefaultCountingOutRhymer getFalseRhymer();
		
	public edu.kis.vh.nursery.DefaultCountingOutRhymer getFIFORhymer();
		
	public edu.kis.vh.nursery.DefaultCountingOutRhymer getHanoiRhymer();

}
