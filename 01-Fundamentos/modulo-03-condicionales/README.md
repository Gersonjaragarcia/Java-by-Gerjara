# 🟢 Módulo 01: 01-Fundamentos
---  
## 📍 Clase 3: Condicionales
---
## 🧮 Módulo 03 – Condicionales
---
## 📌 Descripción
El Módulo 03 introduce las estructuras condicionales en Java, fundamentales para el control del flujo de ejecución de un programa.

En este módulo se estudia cómo un programa puede tomar decisiones mediante el uso de expresiones lógicas y operadores relacionales, permitiendo ejecutar diferentes bloques de código según se cumplan determinadas condiciones.

Se abordan las estructuras if, if-else y if-else if, así como el uso de operadores lógicos (&&, ||, !) y relacionales (>, <, ==, !=, >=, <=).

El enfoque del módulo es práctico, orientado a la resolución de problemas de nivel intermedio, donde se aplican múltiples condiciones, validaciones y lógica compuesta.
---
---
## 🎯 Objetivos del Módulo

Comprender y aplicar estructuras condicionales en Java para controlar el flujo de ejecución de un programa, permitiendo la toma de decisiones basadas en condiciones lógicas y relacionales.
---
## 📖 Teoría
---
Las estructuras condicionales permiten que un programa ejecute diferentes bloques de código dependiendo de si una condición es verdadera (true) o falsa (false).

En Java, las principales estructuras condicionales son:
## 🔹 1.1 Estructura if
Ejecuta un bloque de código solo si la condición es verdadera.
```
 if (condicion) {
    // código a ejecutar
} 
``` 
## 🔹 1.2 Estructura if - else
Permite ejecutar un bloque si la condición es verdadera y otro si es falsa.
```
  if (condicion) {
    // verdadero
} else {
    // falso
}
``` 

## 🔹 1.3 Estructura if - else if - else 
Se utiliza cuando existen múltiples condiciones.
```
  if (condicion1) {
    // bloque 1
} else if (condicion2) {
    // bloque 2
} else {
    // bloque final
}
``` 
Ejemplo:
```
  if (edad >= 18 && tieneLicencia) {
    System.out.println("Puede conducir");
}
``` 
---
### 🧪 Ejercicio 1 – Sistema de Clasificación de Notas
## 🎯 Objetivo 
Determinar el nivel de rendimiento de un estudiante según su nota. 

## 📖 Descripción
El programa debe:

 1. Solicitar una nota (0–100).

 2. Mostrar:
    - 90–100 → Excelente

    - 70–89 → Aprobado

    - 50–69 → Regular

    - 0–49 → Reprobado

3. Validar que la nota esté en el rango correcto.
---
## 🧩 Ejercicio 2 – Comparador de Tres Números
## 🎯 Objetivo
Aplicar múltiples condiciones para comparar valores. 
## 📖 Descripción 
El programa debe:

1. Solicitar tres números.

2. Determinar:

      - Cuál es el mayor.

      - Cuál es el menor.

      - Si alguno es igual.

3. Mostrar los resultados correctamente.
---
## 🧩 Ejercicio 3 – Sistema de Descuento
## 🎯 Objetivo
Usar operadores lógicos y condicionales compuestas. 
## 📖 Descripción
Una tienda aplica descuentos según el monto de compra:

  - Más de 1000 → 20% descuento

  - Entre 500 y 1000 → 10%

  - Menos de 500 → Sin descuento

El programa debe:

 1. Solicitar el monto.

 2. Calcular el descuento.

 3. Mostrar:

    - Total sin descuento

    - Descuento aplicado

    - Total final
---

## 💼 Autor **GerJara**
Desarrollado como parte del curso estructurado de Java.