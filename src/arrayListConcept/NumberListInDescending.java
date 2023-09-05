package arrayListConcept;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberListInDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer num[]= {1,4,11,22,2,34};
		List<Integer> numList=Arrays.asList(num);
		System.out.println(numList);
		Collections.sort(numList);
		System.out.println(numList);
		Collections.reverse(numList);
		System.out.println(numList);

	}

}
