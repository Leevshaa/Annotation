package app;

public class ArrayUtils {

    @Annotation.MethodInfo(name = "arraySum", returnType = "int",
            description = "The method finds the total sum of the array values")
    @Annotation.Author(firstName = "Vitalii", lastName = "Yurchenko")
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

    @Annotation.MethodInfo(name = "maxValueArray", returnType = "int",
            description = "The method finds the maximum value in the array")
    @Annotation.Author(firstName = "Vitalii", lastName = "Yurchenko")
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
