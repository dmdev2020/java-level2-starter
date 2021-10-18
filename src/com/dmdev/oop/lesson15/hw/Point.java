package com.dmdev.oop.lesson15.hw;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Проще всего представить две точки как вершины прямоугольного треугольника.
     * Поэтому дистанция определяется по теореме Пифагора: сумма квадратов длин катетов равна квадрату длины гипотенузы.
     * <p>
     * Следовательно необходимо просто найти расстояние между соответствующими двумя точками (это будут катеты),
     * и потом просто по теореме Пифагора извлечь корень из суммы квадратов этих катетов.
     * <p>
     * Здесь нет разницы от какой точки отнимать соответствующие координаты, потому что при возведении в квадрат
     * все равно получится положительное число.
     *
     * @param point точка, до которой нужно высчитать дистанцию
     * @return дистанция до переданной точки
     */
    public double distance(Point point) {
        double xPow = Math.pow(x - point.x, 2.0);
        double yPow = Math.pow(y - point.y, 2.0);
        return Math.sqrt(xPow + yPow);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
