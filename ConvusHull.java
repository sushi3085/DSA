public class ConvusHull{
	public ConvusHull(Point[] points){
		ArrayDeque<Point> waiting = new ArrayDeqye<>();
		waiting.add(points[0]);

		Arrays.sort(waiting);
		//
	}
}

class Point{
	public int x;
	public int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}