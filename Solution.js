
/**
 * @param {number[][]} triangle
 * @return {number}
 */
var minimumTotal = function (triangle) {
    for (let row = triangle.length - 2; row >= 0; --row) {
        for (let column = 0; column < triangle[row].length; ++column) {
            let minValue = triangle[row][column] 
                           + Math.min(triangle[row + 1][column], triangle[row + 1][column + 1]);
            triangle[row][column] = minValue;
        }
    }
    return triangle[0][0];
};
