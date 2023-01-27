package edu.kis.vh.nursery.factory;

public interface RhymersFactory {
	
	public edu.kis.vh.nursery.DefaultCountingOutRhymer GetStandardRhymer();
		
	public edu.kis.vh.nursery.DefaultCountingOutRhymer GetFalseRhymer();
		
	public edu.kis.vh.nursery.DefaultCountingOutRhymer GetFIFORhymer();
		
	public edu.kis.vh.nursery.DefaultCountingOutRhymer GetHanoiRhymer();

}
