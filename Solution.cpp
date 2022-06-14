
#include <vector>
using namespace std;

class Solution {
    
public:
    int minimumTotal(vector<vector<int>>&triangle) {
        for (int row = triangle.size() - 2; row >= 0; --row) {
            for (int column = 0; column < triangle[row].size(); ++column) {
                int minValue = triangle[row][column] 
                               + min(triangle[row + 1][column], triangle[row + 1][column + 1]);
                triangle[row][column] = minValue;
            }
        }
        return triangle[0][0];
    }
};
