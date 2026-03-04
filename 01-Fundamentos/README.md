# 🛠 01-Fundamentos
---
***Clase 1-Hola Java***
---
##  🎯 Objetivo
-  📌 *Entender la estructura básica de un programa en Java.*
-  📌 *Compilar y ejecutar desde terminal.*
-  📌 *Hacer el primer commit profesional del módulo..*
---
---
# 📖 TEORÍA
Un programa en Java necesita:
1. *Una clase.*
2. *Un metodo main*
3. *Codigo dentro del main.*

```Java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}
``` 
---
### 🔎 Explicación
- ***public class Main*** → Define la clase.
- ***public static void main → Punto de entrada del programa.***
- ***System.out.println() → Imprime en consola***
---
Ahora desmenicemos algo 📖 *¿Qué significa String[] args?*

### 1️⃣ String
Es el tipo de datos == texto
### 2️⃣ []
Significa que es un **arreglo (array)**
entonces:
```
String[]
``` 
Significa:
***Un arreglo de texto***

### 3️⃣ args
Es simplemente el nombre de la variable. Que podria llamarce:
- String[] datos.
- String[] parametros
- String[] NombrePepito
📝 Pero por convención se usa **args**.
---
Entonces podemos concluir:
***Un arreglo de textos llamado args que contiene los argumentos enviados al programa desde la terminal.***

### 🚀 ¿Qué son los argumentos?
Cuando ejecutas un programa así:
- `java Main hola Java`
Lo que escribes después de Main:
```
args[0] = "hola"
args[1] = "mundo"
``` 



