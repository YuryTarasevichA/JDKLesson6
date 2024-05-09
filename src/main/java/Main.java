import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.ArithmeticUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1.Воспользоваться пакетом org.apache.commons.math3.stat и классом
DescriptiveStatistics.
○ Создать коллекцию из числовых элементов.
○ С помощью объекта DescriptiveStatistics вычислить минимальное и
максимальное значение, сумму и среднее арифметическое.

2. Воспользоваться пакетом org.apache.commons.math3.util. С помощью класса
ArithmeticUtils найти :
○ факториал числа N.
○ Наименьшее общее частное двух чисел
○ Наибольший общий делитель двух чисел
○ Проверить что число N это степень двойки
 */
public class Main {
    public static void main(String[] args) {
        double[] array = {12., 5., 55., 23., 98., 10.};
        DescriptiveStatistics statistics = new DescriptiveStatistics(array);
        System.out.println("min value = " + statistics.getMin());
        System.out.println("max value = " + statistics.getMax());
        System.out.println("sum value = " + statistics.getSum());
        System.out.printf("average value = %.2f ", statistics.getMean());
        System.out.println();

        int n = 5;
        System.out.printf("Factorial of %d = %d", n, ArithmeticUtils.factorial(n));
        System.out.println();
        int a = 21;
        int b = 3;
        int c = 77;
        int d = 35;
        int n2 = 123;
        System.out.printf("Наибольший общий делитель двух чисел %d, %d = %d", a, b, ArithmeticUtils.lcm(a, b));
        System.out.println();
        System.out.printf("Наименьшее общее частное двух чисел %d, %d = %d", c, d, ArithmeticUtils.gcd(c, d));
        System.out.println();
        System.out.println("Проверить что число "+ n2 +" это степень двойки = " + ArithmeticUtils.isPowerOfTwo(n2));
    }
}