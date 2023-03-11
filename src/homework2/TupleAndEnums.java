package homework2;

public class TupleAndEnums {
    //Ex 1.1
    public static Object[] weatherInfo(
            int temperature,
            String scale,
            double windSpeed
    ) {
        return new Object[] {temperature, scale, windSpeed};
    }

    public static void main(String[] args) {
        {
            //Ex 1.2
            Object[] tuple = weatherInfo(32, "цельсий", 36.4);
            //Ex 1.3
            for (int i = 0; i < tuple.length; i++) {
                System.out.print(tuple[i] + " ");
            }
        }
    }
    //Ex 2.2
    public static void outputOfSeasons(Seasons season) {
        Object[] seasonsTuple = new Object[2];
        switch (season) {
            case WINTER:
                seasonsTuple[0] = "зима";
                seasonsTuple[1] = "winter";
                break;
            case AUTUMN:
                seasonsTuple[0] = "осень";
                seasonsTuple[1] = "autumn";
                break;
            case SPRING:
                seasonsTuple[0] = "весна";
                seasonsTuple[1] = "spring";
                break;
            case SUMMER:
                seasonsTuple[0] = "лето";
                seasonsTuple[1] = "summer";
                break;
        }
    }
    //3.2
    public static double calculatingTheAreaOfAShape (
            int a,
            int b,
            GeometryFigures geometryFigure
    ) {
        double result = 0.0;
        switch (geometryFigure) {
            case прямоугольник:
                result = a * b;
                break;
            case треугольник:
                result = 0.5 * a * b;
                break;
            case равнобедреннаяТрапеция:
                result = 0.5 * a * b;
                break;
            case эллипс:
                result = 3.14 * a * b;
                break;
        }
        System.out.println("Площадь геометрической фигуры " + geometryFigure + " со сторонами " + a + " и " + b + " равна " + result);
        return result;
    }

}
//Ex 2.1
enum Seasons {
    WINTER,
    AUTUMN,
    SPRING,
    SUMMER;
}
//Ex 3.1
enum GeometryFigures {
    прямоугольник,
    треугольник,
    равнобедреннаяТрапеция,
    эллипс;
}
