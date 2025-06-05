# 💱 Conversor de Monedas en Java

Aplicación de consola en Java que permite convertir entre distintas monedas usando la API [ExchangeRate.host](https://exchangerate.host). 
Incluye historial de conversiones con fecha y hora, guardado en archivo local.

---

## 🚀 Funcionalidades

- ✅ Conversión entre:
  - Dólar (USD)
  - Peso Argentino (ARS)
  - Real Brasileño (BRL)
  - Peso Colombiano (COP)
- 🕒 Historial de conversiones con fecha y hora
- 💾 Guardado de historial en `historial.txt`
- 🧹 Opción para borrar historial
- 📜 Menú interactivo desde la consola

---

## 🛠️ Tecnologías usadas

- Java 17+
- IntelliJ IDEA
- API pública: [https://exchangerate.host](https://exchangerate.host)
- Gson (Google) para manejo de JSON

---

## 📦 Cómo ejecutar
Puedes ejecutar el programa desde tu IDE favorito o por terminal:
javac Conversor.java
o
java ConversorAPI

## 📸 Ejemplo de uso

1. Selecciona una opción para convertir una moneda a otra.
2. Escribe la cantidad a convertir.
3. Luego de la conversion puedes seguir con otra moneda o la opcion que se desee.

**************************************************************
Sea bienvenido/a al conversor de monedas.

1) Dolar => Peso Argentino
2) Peso Argentino => Dolar
3) Dolar => Real Brasileño
4) Real Brasileño => Dolar
5) Dolar => Peso Colombiano
6) Peso Colombiano => Dolar
7) Ver historial
8) Salir
9) Borrar historial

Elija una opción válida:
**************************************************************

Ingrese la cantidad a convertir: 100
💱 100.00 USD son 87325.00 ARS
