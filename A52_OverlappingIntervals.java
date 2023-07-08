// Overlapping intervals
public class A52_OverlappingIntervals{
	public class Interval{
		private int start;
		private int end;
		public Interval(int start, int end){
			this.start = start; 
			this.end = end;
		}
	}
	public List<Interval> merge(List<Interval> intervals){
		if(intervals.size()<2) return intervals;
		intervals.sort(comparingInt(in => in.start));
		List<Intervals> result = new LinkedList<>();
		Interval first = intervals.get(0);
		int start = first.start;
		int end = first.end;
		for(int i=1; i<intervals.size(); i++){
			Interval current = intervals.get(i);
			if(current.start <= end){
				end = Math.max(current.end, end);
			} else {
				result.add(new Interval(start, end));
				start = current.start;
				end = current.end;
			}
		}
		result.add(new Interval(start,end)); 
		return result;
	}
	public List<Interval> insert(List<Interval> intervals, Intervl newInterval){
		if(intervals == null || intervals.isEmpty()) return intervals;
		List<Intervals> result = new LinkedList<>();
		int i = 0;
		while(i<intervals.size() && intervals.get(i).end < newInterval.start){
			result.add(intervals.get(i));
			i++;
		}
		while(i<intervals.size() && intervals.get(i).start <= newInterval.end){
			Interval current - intervals.get(i);
			newInterval.start = Math.min(current.start, newInterval.start);
			newInterval.end = Math.max(current.end, newInterval.end);
			i++;
		}
		result.add(newInterval);
		while(i<intervals.size()){
			result.add(intervals.get(i));
			i++;
		}
		return result;
	}
	public static void main(String[] args){
		A52_OverlappingIntervals oli = new A52_OverlappingIntervals();
		
	}
}