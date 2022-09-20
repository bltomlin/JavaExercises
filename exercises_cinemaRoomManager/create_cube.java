/* You need to implement the createCube method. It should create a 3x3x3 three-dimensional array with the following content:
* [0, 1, 2] 	[3, 4, 5] 	[6, 7, 8]
* [0, 1, 2] 	[3, 4, 5] 	[6, 7, 8]
* [0, 1, 2] 	[3, 4, 5] 	[6, 7, 8]
*
* The elements should be of type int. 
*/


class ArrayOperations {
    public static int[][][] createCube() {
        int[][][] threeDimArray = new int[3][3][3];
        int element = 0;
        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray[i].length; j++) {
                for (int k = 0; k < threeDimArray[i][j].length; k++) {
                    threeDimArray[i][j][k] = element;
                    element++;
                }
            } element = 0;
        }
        return threeDimArray;
    }
}
