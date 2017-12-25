package com.ucloudlink.serializer.kryo;

import java.util.HashMap;

import com.ucloudlink.serializer.kryo.domain.BalanceBO;
import com.ucloudlink.serializer.kryo.domain.Segment;

public class SegmentMap {

	private static final int MAX_SEGMENTS = 1 << 16; // slightly conservative
	private static final int DEFAULT_CONCURRENCY = 16;

	protected final Segment[] segments;
	private final int segmentShift;
	private final int segmentMask;

	public SegmentMap(int concurrency) {
		if (concurrency <= 0) {
			throw new IllegalArgumentException("Concurrency must be positive [was: " + concurrency + "]");
		}

		if (concurrency > MAX_SEGMENTS) {
			concurrency = MAX_SEGMENTS;
		}

		// Find power-of-two sizes best matching arguments
		int sshift = 0;
		int ssize = 1;
		while (ssize < concurrency) {
			++sshift;
			ssize <<= 1;
		}
		segmentShift = 32 - sshift;
		segmentMask = ssize - 1;
		this.segments = new Segment[ssize];

		for (int i = 0; i < this.segments.length; ++i) {
			Segment segment = new Segment();
			segment.setIndex(i);
			segment.setDataMap(new HashMap<String, BalanceBO>());
			this.segments[i] = segment;
		}

	}

	protected Segment segmentFor(Object key) {
		return segmentFor(key.hashCode());
	}

	protected Segment segmentFor(int hash) {
		return segments[getIndexFor(hash)];
	}

	public int getIndexFor(int hash) {
		return (spread(hash) >>> segmentShift) & segmentMask;
	}

	private static int spread(int hash) {
		int h = hash;
		h += (h << 15) ^ 0xffffcd7d;
		h ^= (h >>> 10);
		h += (h << 3);
		h ^= (h >>> 6);
		h += (h << 2) + (h << 14);
		return h ^ (h >>> 16);
	}
	
	public BalanceBO get(String key) {
		return segmentFor(key).getDataMap().get(key);
	}
	
	public void put(String key,BalanceBO value)
	{
		segmentFor(key).getDataMap().put(key, value);
	}

	public Segment[] getSegments() {
		return segments;
	}
	
	public void putSegment(Segment sgt,int index)
	{
		segments[index] = sgt;
	}

}
