import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ConvusHull{
	private static boolean isClockwise(Point z, Point a, Point b){
		return (a.x-z.x)*(b.y-z.y)+(a.y-z.y)*(b.x-z.x) > 0;
	}

	public ConvusHull(Point[] points){
		Queue<Point> waiting = new LinkedList<>();
		waiting.add(points[0]);

		Arrays.sort(points, (a, b)->{if(a.x==b.x)return a.y-b.y;return a.x-b.x;});
		
		for(int i=1; i<points.length; i++){
			waiting.add(points[i]);
			while(true);
		}

		System.exit(0);
	}

	public static void main(String[] args) {
		new ConvusHull(new Point[]{new Point(1,1), new Point(1,2), new Point(2,1), new Point(2,2)});
	}
}

class Point{
	public int x;
	public int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString(){
		return "("+x+", "+y+")";
	}
}