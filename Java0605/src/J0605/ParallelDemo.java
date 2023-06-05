package J0605;
import java.util.stream.IntStream;

public class ParallelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start, end, total;
		
		IntStream sequantial = IntStream.rangeClosed(1, 1000000000);
		start = System.currentTimeMillis();
		total = sequantial.sum();
		end = System.currentTimeMillis();
				
				

	}

}
