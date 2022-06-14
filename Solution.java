
import java.util.List;

public class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        for (int row = triangle.size() - 2; row >= 0; --row) {
            for (int column = 0; column < triangle.get(row).size(); ++column) {
                int minValue = triangle.get(row).get(column)
                               + Math.min(triangle.get(row + 1).get(column), triangle.get(row + 1).get(column + 1));
                triangle.get(row).set(column, minValue);
            }
        }
        return triangle.get(0).get(0);
    }
}
