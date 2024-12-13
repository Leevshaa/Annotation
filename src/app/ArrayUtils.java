package app;

public class ArrayUtils {

    private int arraySum(int[] array) {
        int result = 0;
        for (int value : array) {
            result += value;
        }
        return result;
    }

    public int getArraySum(int[] array) {
        return arraySum(array);
    }

    private int maxValueArray(int[] array) {
        int maxValue = 0;
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public int getMaxValueArray(int[] array) {
        return maxValueArray(array);
    }
}
