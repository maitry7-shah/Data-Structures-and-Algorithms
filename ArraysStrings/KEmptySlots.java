package ArraysStrings;

import java.util.TreeSet;

public class KEmptySlots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = {1,3,2};
		int k =1;
		
		KEmptySlots e = new KEmptySlots();
		System.out.println(e.kEmptySlots(input, k));
	}

    public int kEmptySlots(int[] flowers, int k) {
        TreeSet<Integer> treeSet = new TreeSet<>();
	for (int i = 0; i < flowers.length; i++) {
		int current = flowers[i];
		Integer next = treeSet.higher(current);
		if (next != null && next - current == k + 1) {
			return i + 1;
		}
		Integer pre = treeSet.lower(current);
		if (pre != null && current - pre == k + 1) {
			return i + 1;
		}
		treeSet.add(current);
	}
	return -1;
    }
}
