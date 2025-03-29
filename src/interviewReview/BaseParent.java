package interviewReview;

import java.util.ArrayList;

public class BaseParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// method to eliminate duplicates and print unique number from array

	public void findduplicatesanduniquenumber() {

		int a[] = { 3, 4, 3, 4, 4, 3, 1, 4, 5, 6, 9, 1 };

		// empty arrat list - check whether the number alreadt present in arraylist - if
		// not add it to arraylist

		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!ab.contains(a[i])) {

				ab.add(a[i]);

				k++;

				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {

						k++;

					}
				}

				System.out.println(a[i]);
				System.out.println(k + "is value ok k");
				
				if(k==1) {
					
					System.out.println(a[i]+"is unique number");
				}
			}

		}

	}

}
