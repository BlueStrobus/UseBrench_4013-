package J0605;
import java.util.HashMap;
import java.util.Map;

public class A06 {

	
 public static void main(String[] args) {
	        Map<String, String> animalMap = new HashMap<>();
	        animalMap.put("호랑이", "tiger");
	        animalMap.put("표범", "leopard");
	        animalMap.put("사자", "Lion");

	        System.out.println("변경 전: " + animalMap);

	        animalMap.replaceAll((k, v) -> v.toUpperCase());

	        System.out.println("변경 후: " + animalMap);
	    }
	}


