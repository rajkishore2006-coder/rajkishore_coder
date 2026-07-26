import java.util.HashMap;

class Solution {

    public int maxPoints(int[][] points) {

        int n = points.length;
        if (n <= 2) return n;

        int max = 0;

        for (int i = 0; i < n; i++) {

            HashMap<String, Integer> map = new HashMap<>();

            for (int j = i + 1; j < n; j++) {

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dx == 0) {
                    dy = 1;
                } else if (dy == 0) {
                    dx = 1;
                } else {
                    if (dx < 0) {
                        dx = -dx;
                        dy = -dy;
                    }

                    int g = gcd(Math.abs(dx), Math.abs(dy));
                    dx /= g;
                    dy /= g;
                }

                String slope = dx + "," + dy;

                map.put(slope, map.getOrDefault(slope, 1) + 1);

                max = Math.max(max, map.get(slope));
            }
        }

        return max;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
 
        
    
