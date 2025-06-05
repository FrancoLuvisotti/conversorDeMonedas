public class Menu {
    public static void exibirMenu() {
        System.out.println(
                """
                **************************************************************
                Sea bienvenido/a al conversor de monedas.

                1) Dolar => Peso Argentino
                2) Peso Argentino => Dolar
                3) Dolar => Real Brasileño
                4) Real Brasileño => Dolar
                5) Dolar => Peso Colombiano
                6) Peso colombiano => Dolar
                7) Ver historial
                8) Salir
                9) Borrar historial

                Elija una opción válida:
                **************************************************************
                """
        );
    }
}
