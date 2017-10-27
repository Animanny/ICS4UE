package hashtables;

import java.util.ArrayList;

/**
 * MyHashTable is a class that will create a hashtable
 * 
 * @author Ani
 *
 */

public class MyHashTable {

	private ArrayList<EmployeeInfo>[] buckets;
	private int k;

	public MyHashTable(int numBuckets) {
		k = numBuckets;
		buckets = new ArrayList[k];
		for (int i = 0; i < k; i++) {
			buckets[i] = new ArrayList<EmployeeInfo>();
		}
	}

	// Methods
	public void addEmployee(EmployeeInfo toAdd) {
		int buck = toAdd.getEmpNumber() % k;
		buckets[buck].add(toAdd);
	}

	public boolean removeEmployee(EmployeeInfo toCut) {
		int buck = toCut.getEmpNumber() % k;
		for (int i = 0; i < buckets[buck].size() - 1; i++) {

			if (buckets[buck].get(i).getEmpNumber() == toCut.getEmpNumber()) {
				buckets[buck].remove(i);
			}
		}

		return true;

	}

	public int search(EmployeeInfo toFind) {
		int buck = toFind.getEmpNumber() % k;
		int position = -1;
		for (int i = 0; i < buckets[buck].size() - 1; i++) {

			if (buckets[buck].get(i).getEmpNumber() == toFind.getEmpNumber()) {
				position = i;
			}
		}
		return position;
	}

	public void showData() {
		System.out.println("Number of buckets: " + k);
	}
}