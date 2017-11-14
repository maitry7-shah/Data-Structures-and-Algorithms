import java.util.*;

public class SkyLineProblem {
    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> heights = new ArrayList<>();
        for (int[] b: buildings) {
            heights.add(new int[]{b[0], - b[2]});
            heights.add(new int[]{b[1], b[2]});
        }
        Collections.sort(heights, (a, b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]);
        TreeMap<Integer, Integer> heightMap = new TreeMap<>(Collections.reverseOrder());
        //heightMap.put(heights.get(0)[0],Math.abs(heights.get(0)[1]));
        heightMap.put(0,1);
        
        int prevHeight = 0;
        List<int[]> skyLine = new LinkedList<>();
        for (int[] h: heights) {
            if (h[1] < 0) {
                Integer cnt = heightMap.get(-h[1]);
                cnt = ( cnt == null ) ? 1 : cnt + 1;
                heightMap.put(-h[1], cnt);
            } else {
                Integer cnt = heightMap.get(h[1]);
                if (cnt == 1) {
                    heightMap.remove(h[1]);
                } else {
                    heightMap.put(h[1], cnt - 1);
                }
            }
            int currHeight = heightMap.firstKey();
            if (prevHeight != currHeight) {
                skyLine.add(new int[]{h[0], currHeight});
                prevHeight = currHeight;
            }
        }
        return skyLine;
    }

public static void main(String args[]) {
	SkyLineProblem sk=new SkyLineProblem();
	int[][] arr = {{1, 11, 5}, {2, 6, 7}, {3, 13, 9},
            {12, 7, 16}, {14, 3, 25}, {19, 18, 22},
            {23, 13, 29}, {24, 4, 28}};
	sk.getSkyline(arr);
}
}
