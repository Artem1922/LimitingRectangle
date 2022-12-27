public class LimitingRectangle {
    int[][] points;


    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    private int getMin(int[] points) {
        int  min = points[0];
        for (int i = 0; i < points.length; i++){
            if (points[i] < min) min = points[i];
        }
        return min;
    }

    private int getMax(int[] points){
        int max = points[0];
        for (int i = 0; i < points.length; i++) {
            if (points[i] > max) max = points[i];
        }
        return max;
        }

    int getWidth() {
        return getMax(points[0]) - getMin(points[0]);
    }

    int getHeight() {
        return getMax(points[1]) - getMin(points[1]);
    }


    String getBorders() {
        return getMin(points[1]) + ", " + getMax(points[1]) + ", " + getMin(points[0]) + ", " + getMax(points[0]);
    }
}
/*      Напишите класс LimitingRectangle (ограничивающий точки прямоугольник), класс принимает точки на
плоскости и строит прямоугольник. Если точка лежит на границе прямоугольника, то считаем, что она в него входит.
 В нем должны быть:

поле points (двумерный массив целых чисел);
конструктор, принимающий двумерный массив целых чисел (массив точек на плоскости вида [[1, 0], [2, 3], ...],
        0 элемент —координата по оси X, 1 элемент — по оси Y);
метод getWidth(), возвращающий целое число (ширину прямоугольника);
метод getHeight(), возвращает целое число (высоту прямоугольника);
метод getBorders, возвращает строку вида {нижняя точка по Y, верхняя точка по Y, левая точка по Х, правая точка по Х}.

-На вход может приходить не только 2 пары координат, но и больше.
-В приходящем массиве точек [[1, 0], [2, 3], ...] в скобках лежат просто отдельные координаты для X и для Y,
а не координаты одной точки (по X и Y).
-Прямоугольник можно построить по двум точкам (min и max).
*/