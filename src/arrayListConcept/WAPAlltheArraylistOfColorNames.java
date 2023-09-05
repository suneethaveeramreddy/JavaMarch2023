package arrayListConcept;

import java.util.ArrayList;
import java.util.Collections;

public class WAPAlltheArraylistOfColorNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors=new ArrayList<>();
		colors.add("Blue");
		colors.add("Green");
		colors.add("Violet");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add("Indigo");
		
		for(int i=0;i<colors.size();i++) {
			System.out.println(colors.get(i));
			//Collections.sort(colors);
		}
		
	}

}
