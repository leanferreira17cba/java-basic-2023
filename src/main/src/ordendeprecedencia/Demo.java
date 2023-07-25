package ordendeprecedencia;

public class Demo {
    public static void main(String[] args) {
        // orden de precedencia -> prioridad
        //()
        // ++ --
        // * / %
        // + -
        // <<, >>, >>>
        // <, >, <=, >=
        // == !=
        // && -> AND
        // || -> OR

        // =

        int resultado = (5 - 6 + 7) * 2 - (4 / 2) + (6 % 2);
        // int resultado = 6 * 2 - 2;
        // int resultado = 12 - 2;
        // int resultado = 10;

        boolean res = 6 - 7 * 3 / 3 % 2 > 2 - 1 * 4;
        boolean result = -15 > -2;

        System.out.println(false || false);

        // false
    }
}
