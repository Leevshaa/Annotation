package app;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        int[] array = {5, 34, 23, 82, 1, 78, 60, 9};
        ArrayUtils arrayUtils = new ArrayUtils();
        Class<ArrayUtils> arrayUtilsClass = ArrayUtils.class;
        Method[] declaredMethods = arrayUtilsClass.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {

            Annotation.Author authorAnnotation = declaredMethod.getAnnotation(Annotation.Author.class);
            Annotation.MethodInfo methodInfoAnnotation = declaredMethod.getAnnotation(Annotation.MethodInfo.class);

            if (authorAnnotation != null && methodInfoAnnotation != null) {
                System.out.println("\nМетод: " + methodInfoAnnotation.name() +
                        "\nТип даних: " + methodInfoAnnotation.returnType() +
                        "\nОпис: " + methodInfoAnnotation.description() +
                        "\nАвтор: " + authorAnnotation.firstName() + " " + authorAnnotation.lastName());
                try {
                    Object result = declaredMethod.invoke(arrayUtils, array);
                    System.out.println("Робота методу: " + result);
                } catch (Exception e) {
                    System.out.println("Помилка при виклику методу " + declaredMethod.getName() + ": " +
                            e.getMessage());
                }
            }
        }
    }
}
