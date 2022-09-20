
public class ShapeMaker {
    /**
     * Returns a string that looks like a square with sides of size "size". If size = 5, the square looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param size length of side
     * @return a string that looks like the shape above when printed
     */
    public static String PrintSquare(int size)
    {
        String pattern = "";
        for(int i = 0; i<size; i++) {
            for (int r = 0; r < size; r++) {
                pattern += "* ";
            }
            pattern += "\n";
        }
        return pattern;
    }

    /**
     * Returns a string that looks like a rectangle with sides of size "length" and "width. If length = 5, width = 4 the rectangle looks like this:
     * 
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *     * * * * *
     *
     * @param length the width of the rectangle
     * @param height the height of the rectangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRectangle(int length, int height)
    {
        String pattern = "";
        for(int i = 0; i<height; i++) {
            for (int r = 0; r < length; r++) {
                pattern += "* ";
            }
            pattern += "\n";
        }
        return pattern;
    }

    /**
     * Returns a string that looks like a right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     *
     *     * *
     *     * * *
     *     * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintRightTriangle(int height)
    {
        String result = "";
        for (int i = 0; i < height; i++) {
            for(int j = 0; j <= i; j++) {
                result += "*";
                if (j < i) {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }

    /**
     * Returns a string that looks like an inverted right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *     * * * * *
     *     * * * *
     *     * * *
     *     * *
     *     *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintInvertedRightTriangle(int height)
    {
        String pattern = "";
        for(int i = height; i>0; i--){
            for(int r= 0; r<i; r++){
                pattern +="*";
                if(r < i-1){
                    pattern +=" ";
                }
            }
            pattern += "\n";
        }
        return pattern;
    }

    /**
     * Returns a string that looks like a backwards right triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *             *
     *           * *
     *         * * *
     *       * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */

    public static String PrintBackwardsRightTriangle(int height)
        {
            String result = "";
            for (int i = 0; i < height; i++) {
                for (int s = 0; s < height - i - 1; s++) {
                    result += "  ";
                }
                for (int m = 0; m <= i; m++) {
                    result += "*";
                    if (m < i) {
                        result += " ";
                    }
                }
                result += "\n";
            }
            return result;
        }

    /**
     * Returns a string that looks like an equilateral triangle with sides of size "size". If size = 5, the triangle looks like this:
     * 
     *         *
     *        * *
     *       * * *
     *      * * * *
     *     * * * * *
     *
     * @param height the height of the triangle
     * @return a string that looks like the shape above when printed
     */
    public static String PrintEquilateralTriangle(int height)
    {
            String result = "";
            for (int h = 0; h < height; h++) {
                for (int b = 0; b < height - h - 1; b++) {
                    result += " ";
                }
                for (int m = 0; m <= h; m++) {
                    result += "*";
                    if (m < h) {
                        result += " ";
                    }
                }
                result += "\n";
            }
            return result;
        }
}
