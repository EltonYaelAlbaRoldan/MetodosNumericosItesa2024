# MetodosNumericosItesa2024
>Divide y venceras

## Índice
* [Tema 2](#Tema_2)
   * [Bisección](#Bisección)
   * [Regla falsa](#Regla_Falsa)
   * [Secante](#Secante)
   * [Newton Rapson](#Newton_Rapson)
* [Tema 3](#Tema_3)
   * [Metodo de eliminación gaussiana](#MÉTODO_DE_ELIMINACIÓN_GAUSSIANA)
   * [Metodo de Gauss Jordan](#MÉTODO_DE_GAUSS_JORDAN)
   * [Metodo de Gauss Seidel](#Metodo_de_Gauss-Seidel)
   * [Metodo de Jacobi](#Metodo_de_Jacobi)
 * [Tema 4](#Tema_4)
   * [Metodos de diferencición](#Metodos_de_diferenciacióm)
     * [Regla de tres puntos](#Regla_de_tres_puntos)
     * [Regla de cinco puntos](#Regla_de_cinco_puntos)
   * [Metodos de integración](#Metodos_de_integraación)
     * [Metodo del Trapecio](#Metodo_del_Trapecio)
     * [Regla de Simpson](#Regla_de_Simpson)
     * [Método de la cuadratura gaussiana](#Método_de_la_cuadratura_gaussiana)
  * [Tema 5](#Tema_5)
    * [Metodos de interpolación](#Metodos_de_interpolación)
      * [Lineal](#Lineal)
      * [Cuadratica](#Cuadratica)
    * [Metodos de extrapolación](#Metodos_de_extrapolación)


# Tema_2

## Bisección

### Concepto
El método de bisección es un algoritmo utilizado para encontrar las raíces de una función en un intervalo dado.


### Algoritmo
1. Entrada de datos: Toma como entrada una función f(x) continua en un intervalo [a, b], donde f(a) y f(b) tienen signos opuestos (es decir, f(a) * f(b) < 0), y una tolerancia tol que determina la precisión deseada.

2. Inicialización: Define los límites del intervalo [a, b] y establece un contador de iteraciones.

3. Bucle de iteración:

   - Mientras el tamaño del intervalo (b - a) sea mayor que la tolerancia tol:
   
   - Calcula el punto medio c = (a + b) / 2.
   
   - Evalúa la función f(c).
   
       - Si f(c) es igual a cero (o está suficientemente cerca de cero según la tolerancia), devuelve c como la raíz.
   
       - Si f(c) tiene el mismo signo que f(a), actualiza a = c.
   
       - Si f(c) tiene el mismo signo que f(b), actualiza b = c.
   
    - Incrementa el contador de iteraciones.

5. Salida: Devuelve el punto medio c como la aproximación de la raíz.

### Implementación

* [Ejemplo](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/db4fa5e81cc0fbc41ad02d7fb25ee52ff1e5fb6e/Tema%202%20Metodos/Bisecci%C3%B3n/Biseccion/src/biseccion/Biseccion.java)


### Ejercicios

* [Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/db4fa5e81cc0fbc41ad02d7fb25ee52ff1e5fb6e/Tema%202%20Metodos/Bisecci%C3%B3n/Biseccion/src/biseccion/Biseccion.java)

* [Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/6fa31e21461ec8570b82768f7f0e989b51baa5a4/Tema%202%20Metodos/Bisecci%C3%B3n/Biseccion2/src/biseccion2/Biseccion2.java)

* [Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/6fa31e21461ec8570b82768f7f0e989b51baa5a4/Tema%202%20Metodos/Bisecci%C3%B3n/Biseccion3/src/biseccion3/Biseccion3.java)

* [Ejercicio4](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/6fa31e21461ec8570b82768f7f0e989b51baa5a4/Tema%202%20Metodos/Bisecci%C3%B3n/Biseccion4/src/biseccion4/Biseccion4.java)

* [Ejercicio5](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/6fa31e21461ec8570b82768f7f0e989b51baa5a4/Tema%202%20Metodos/Bisecci%C3%B3n/Biseccion5/src/biseccion5/Biseccion5.java)

---

## Regla_Falsa

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Concepto</span></b></p>

Algoritmo utilizado para encontrar aproximaciones de las raíces de una función continua en un intervalo dado. A diferencia del método de bisección, el método de la regla falsa utiliza una interpolación lineal para estimar la ubicación de la raíz en cada iteración.


<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Algoritmo</span></b></p>

1. Entrada de datos: Toma como entrada una función  f(x)  continua en un intervalo [a, b], donde  f(a) y f(b) tienen signos opuestos, y una tolerancia text{tol}  que determina la precisión deseada.

2. Inicialización: Define a  y  b  como los límites del intervalo, y calcula  f(a)  y  f(b).

3. Bucle de iteración:
     - Mientras el tamaño del intervalo (b - a) / 2 sea mayor que la tolerancia  text{tol} :
       - Calcula el punto c de intersección con el eje x utilizando la interpolación lineal:
       c = b - ((f(b)*(b - a))/(f(b) - f(a))
       - Evalúa f(c).
       - Si  f(c) es igual a cero (o está suficientemente cerca de cero según la tolerancia), devuelve c como la raíz.
       - Si f(a)/f(c) < 0, actualiza b = c.
       - De lo contrario, actualiza a = c.

4. Salida: Devuelve c como la aproximación de la raíz.


<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Implementación</span></b></p>

* [Ejemplo](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Regla%20falsa/Regla%20Falsa/src/regla/falsa/ReglaFalsa.java)

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

* [Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Regla%20falsa/Regla%20Falsa/src/regla/falsa/ReglaFalsa.java)

* [Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Regla%20falsa/Regla%20Falsa%202/src/regla/falsa/pkg2/ReglaFalsa2.java)

* [Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Regla%20falsa/Regla%20Falsa%203/src/regla/falsa/pkg3/ReglaFalsa3.java)

* [Ejercicio4](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Regla%20falsa/Regla%20Falsa%204/src/regla/falsa/pkg4/ReglaFalsa4.java)

* [Ejercicio5](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Regla%20falsa/Regla%20Falsa%205/src/regla/falsa/pkg5/ReglaFalsa5.java)

---

## Secante

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Concepto</span></b></p>

A diferencia de los métodos de intervalos como la regla falsa o la bisección, el método de la secante no requiere que la función cambie de signo en el intervalo dado. En cambio, utiliza dos aproximaciones iniciales para la raíz y calcula iterativamente una nueva aproximación utilizando una interpolación lineal entre los puntos definidos por las aproximaciones iniciales.


<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Algoritmo</span></b></p>

1. Entrada de datos: Toma como entrada una función f(x)continua, dos aproximaciones iniciales x_0 y x_1  para la raíz, y una tolerancia tol que determina la precisión deseada.

2. Inicialización: Define x_0 y x_1 como las aproximaciones iniciales para la raíz.

3. Bucle de iteración:
   - Mientras no se alcance la tolerancia tol o un número máximo de iteraciones:
     - Calcula la siguiente aproximación de la raíz utilizando la fórmula:
       x_{n+1} = x_n - (f(x_n)*(x_n - x_{n-1})/(f(x_n) - f(x_{n-1})))
     - Comprueba si f(x_{n+1} < tol. Si es así, la aproximación x_{n+1} es aceptable y se detiene el algoritmo.
     - Actualiza x_{n-1} y x_n para la siguiente iteración.

4. Salida: Devuelve x{n+1} como la aproximación de la raíz.

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Implementación</span></b></p>

* [Ejemplo](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/4e544780137a2cd5085ecf8b36fb8d4a5a825163/Tema%202%20Metodos/Secante/Secante/src/secante/Secante.java)

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

* [Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/4e544780137a2cd5085ecf8b36fb8d4a5a825163/Tema%202%20Metodos/Secante/Secante/src/secante/Secante.java)

* [Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Secante/Secante%202/src/secante/pkg2/Secante2.java)

* [Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Secante/Secante%203/src/secante/pkg3/Secante3.java)

* [Ejercicio4](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/4e544780137a2cd5085ecf8b36fb8d4a5a825163/Tema%202%20Metodos/Secante/Secante%204/src/secante/pkg4/Secante4.java)

* [Ejercicio5](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Secante/Secante%205/src/secante/pkg5/Secante5.java)

---

## Newton_Rapson

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Concepto</span></b></p>

El método de Newton-Raphson, también conocido como el método de Newton, es un algoritmo utilizado para encontrar raíces de funciones. Es un método iterativo que utiliza la derivada de la función para aproximarse a la raíz.
El concepto básico detrás del método de Newton-Raphson es usar la tangente a la curva de la función en un punto inicial como una aproximación lineal de la función. Luego, se encuentra la intersección de esta tangente con el eje 
x, que proporciona una mejor aproximación de la raíz de la función. Este proceso se repite iterativamente hasta que se alcance la precisión deseada.

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Algoritmo</span></b></p>

1. Entrada de datos: Toma como entrada una función  f(x) continua y diferenciable, una aproximación inicial  x_0 para la raíz, y una tolerancia tol que determina la precisión deseada.

2. Bucle de iteración:
   - Calcula la siguiente aproximación de la raíz utilizando la fórmula:
     x_{n+1} = x_n - (f(x_n)/f'(x_n))
     donde f'(x_n) es la derivada de f(x) evaluada en x_n.
   - Repite este paso hasta que |f(x_{n+1})| < tol, o hasta que se alcance un número máximo de iteraciones.

3. Salida: Devuelve x_{n+1} como la aproximación de la raíz.

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Implementación</span></b></p>

* [Ejemplo](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/20f0284da0e174237ed13c5d613a99c82c14daa5/Tema%202%20Metodos/Newton/Newton/src/newton/Newton.java)

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

* [Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/20f0284da0e174237ed13c5d613a99c82c14daa5/Tema%202%20Metodos/Newton/Newton/src/newton/Newton.java)

* [Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/20f0284da0e174237ed13c5d613a99c82c14daa5/Tema%202%20Metodos/Newton/Newton2/src/newton2/Newton2.java)

* [Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/20f0284da0e174237ed13c5d613a99c82c14daa5/Tema%202%20Metodos/Newton/Newton3/src/newton3/Newton3.java)

* [Ejercicio4](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/20f0284da0e174237ed13c5d613a99c82c14daa5/Tema%202%20Metodos/Newton/Newton4/src/newton4/Newton4.java)

* [Ejercicio5](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/20f0284da0e174237ed13c5d613a99c82c14daa5/Tema%202%20Metodos/Newton/Newton5/src/newton5/Newton5.java)

---

# Tema_3

## MÉTODO_DE_ELIMINACIÓN_GAUSSIANA

 ###                                         Concepto

El objetivo del método de Gauss es transformar un sistema de ecuaciones lineales en otro equivalente pero más fácil de resolver, como un sistema triangular o diagonal con ceros bajo la diagonal.

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Algoritmo</span></b></p>

1. Pivoteo:
   
   - En esta fase, se elige un elemento pivotante en cada iteración del algoritmo. El pivote es crucial porque guía el proceso de simplificación del sistema.
   
   - El pivote se selecciona para minimizar los errores numéricos y facilitar los cálculos. En el método de Gauss original, se elige como el primer elemento no nulo en cada columna, pero existen variantes como el pivoteo parcial o completo para mejorar la precisión numérica.
   
2. Eliminación:
   
   - Después de seleccionar el pivote, se utiliza para eliminar los coeficientes debajo de él en la misma columna, haciendo que sean cero. Esto simplifica el sistema al eliminar incógnitas de ecuaciones adicionales.
   
   - La eliminación se realiza restando múltiplos adecuados de la fila del pivote a otras filas. Esto se repite hasta que la matriz se convierte en una forma triangular superior, donde todos los elementos debajo de la diagonal principal son ceros.
   
3. Sustitución hacia atrás:
   
   - Con la matriz en forma triangular superior, se pueden resolver las incógnitas fácilmente utilizando el método de sustitución hacia atrás.
   
   - Comenzando desde la última fila, las soluciones de las variables se calculan sucesivamente utilizando los valores ya calculados de las variables hacia abajo en la matriz.

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Implementación</span></b></p>

* [Ejemplo](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b2f3163fecaf2cea5e85c59e5c7bb572ce4b9b95/Tema%203%20Metodos/ELIMINACI%C3%93N%20GAUSSIANA/Eliminacion%20Gaussiana/src/eliminacion/gaussiana/EliminacionGaussiana.java)

Por ultimo se muestran los resultados obtenidos

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/eba1d99b-87ca-4888-b26a-85f136e2415c)


<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

* [Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b2f3163fecaf2cea5e85c59e5c7bb572ce4b9b95/Tema%203%20Metodos/ELIMINACI%C3%93N%20GAUSSIANA/Eliminacion%20Gaussiana/src/eliminacion/gaussiana/EliminacionGaussiana.java)

* [Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/75fd44dc9d8bfacb7aae359557abffd0ba463001/Tema%203%20Metodos/ELIMINACI%C3%93N%20GAUSSIANA/Eliminaci%C3%B3nGaussiana2/src/eliminaci%C3%B3ngaussiana2/Eliminaci%C3%B3nGaussiana2.java)

* [Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/c52eeeb06ef40b47154c58731297ca446c59d0ec/Tema%203%20Metodos/ELIMINACI%C3%93N%20GAUSSIANA/Eliminacion%20Gaussiana%203/src/eliminacion/gaussiana/pkg3/EliminacionGaussiana3.java)

---

## MÉTODO_DE_GAUSS_JORDAN

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Concepto</span></b></p>

El método de Gauss-Jordan es un algoritmo numérico utilizado para resolver sistemas de ecuaciones lineales. Su objetivo principal es llevar una matriz aumentada que representa el sistema de ecuaciones a su forma escalonada reducida por filas, obteniendo una matrz identidad. 

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Algoritmo</span></b></p>

1. Pivoteo Parcial:
   
   - Selecciona el pivote actual como el elemento más grande en valor absoluto en la columna actual, comenzando desde la fila actual y hacia abajo.
  
   - Intercambia las filas de tal manera que la fila del pivote (la fila actual) se coloque en la posición donde se encuentra el máximo elemento.

2. Hacer el Pivote Igual a 1:
   
    - Divide toda la fila del pivote por el valor del pivote para hacer que el elemento diagonal (el pivote) sea igual a 1.

3.  Hacer Ceros por Debajo y por encima del Pivote:
   
    - Para cada fila que esté debajo y por encima del pivote, resta múltiplos adecuados de la fila del pivote para hacer cero los elementos en la columna actual.

4. Repetición:

   - Repite los pasos anteriores para el siguiente pivote y continúa hasta que se hayan procesado todas las filas y columnas.

5. Solución:

   - Una vez que la matriz está en su forma escalonada reducida, las últimas columnas representan las soluciones del sistema de ecuaciones lineales.
   
<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Implementación</span></b></p>

* [Ejemplo](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/48fdcf6c77afb44befcc3a774d33c857aeccad83/Tema%203%20Metodos/GAUSS%20JORDAN/Gauss%20Jordan/src/gauss/jordan/GaussJordan.java)

Aquí se percibe la continuación del metodo y tambien el resultado obtenido

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/2f23bb22-afda-483e-b8bb-2436277eba8c)

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

* [Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/48fdcf6c77afb44befcc3a774d33c857aeccad83/Tema%203%20Metodos/GAUSS%20JORDAN/Gauss%20Jordan/src/gauss/jordan/GaussJordan.java)

* [Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/48fdcf6c77afb44befcc3a774d33c857aeccad83/Tema%203%20Metodos/GAUSS%20JORDAN/Gauss%20Jordan%202/src/gauss/jordan/pkg2/GaussJordan2.java)

* [Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/48fdcf6c77afb44befcc3a774d33c857aeccad83/Tema%203%20Metodos/GAUSS%20JORDAN/Gauss%20Jordan%203/src/gauss/jordan/pkg3/GaussJordan3.java)

---

## Metodo_de_Gauss-Seidel

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Concepto</span></b></p>

El método de Gauss-Seidel es una técnica iterativa para resolver sistemas de ecuaciones lineales. En lugar de calcular todas las incógnitas simultáneamente como en el método de eliminación gaussiana, Gauss-Seidel calcula cada incógnita secuencialmente utilizando valores actualizados a medida que avanza en las iteraciones. Esto hace que el método sea especialmente útil para matrices grandes y dispersas.

El proceso comienza con una aproximación inicial de las soluciones del sistema. Luego, en cada iteración, Gauss-Seidel actualiza las soluciones basándose en las estimaciones previas, utilizando los valores recientemente calculados para las incógnitas. Este enfoque iterativo continúa hasta que se alcanza un cierto criterio de convergencia, como una tolerancia predefinida o un número máximo de iteraciones.


<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Algoritmo</span></b></p>


1. Descomposición de la matriz: Dada una matriz A de coeficientes y un vector b de términos independientes, se descompone A en dos matrices: L, la parte triangular inferior de A (incluida la diagonal); y U, la parte triangular superior de A sin incluir la diagonal.

2. Inicialización: Se elige una estimación inicial x^(0).

3. Iteraciones: Se itera el proceso hasta que se alcance una precisión deseada o un número máximo de iteraciones. En cada iteración:

   a. Se actualiza cada componente de x utilizando la fórmula iterativa:
   
       x_i^(k+1) = 1/a_ij (b_i − ∑_j=1^i−1 a_ij*x_j^(k+1) −∑_j=i+1^n a _ij*x_j^(k))

   b. Se comprueba si se ha alcanzado la precisión deseada. Si es así, se detiene el proceso. Si no, se continúa a la siguiente iteración.

4. Salida: La solución aproximada x ^(k) se toma como la solución del sistema de ecuaciones lineales Ax=b.


<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Implementación</span></b></p>

* [Ejemplo](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/c82e34780f891315f1dd2dac51ec03eb2bff69da/Tema%203%20Metodos/GAUSS%20SEIDEL/Gauss-Seidel/src/gauss/seidel/GaussSeidel.java)

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/cec924b4-4df4-45fa-a9cc-5c5df746f090)


<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

* [Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/c82e34780f891315f1dd2dac51ec03eb2bff69da/Tema%203%20Metodos/GAUSS%20SEIDEL/Gauss-Seidel/src/gauss/seidel/GaussSeidel.java)

* [Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/c82e34780f891315f1dd2dac51ec03eb2bff69da/Tema%203%20Metodos/GAUSS%20SEIDEL/Gauss-Seidel%202/src/gauss/seidel/pkg2/GaussSeidel2.java)

* [Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/c82e34780f891315f1dd2dac51ec03eb2bff69da/Tema%203%20Metodos/GAUSS%20SEIDEL/Gauss-Seidel%203/src/gauss/seidel/pkg3/GaussSeidel3.java)

---

## Metodo_de_Jacobi

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Concepto</span></b></p>

El método de Jacobi es un algoritmo utilizado para resolver sistemas de ecuaciones lineales. Es uno de los métodos iterativos más simples y antiguos para resolver este tipo de problemas. Fue desarrollado por el matemático alemán Carl Gustav Jacobi en el siglo XIX.

La idea básica detrás del método de Jacobi es descomponer el sistema de ecuaciones lineales Ax=b en una suma de dos matrices: una matriz diagonal D y una matriz no diagonal R. Entonces, el sistema se convierte en dos ecuaciones:
Dx=(L+U)x=b

El método de Jacobi es un algoritmo utilizado para resolver sistemas de ecuaciones lineales. Es uno de los métodos iterativos más simples y antiguos para resolver este tipo de problemas. Fue desarrollado por el matemático alemán Carl Gustav Jacobi en el siglo XIX.

Donde L es la parte triangular inferior de A (con todos los elementos por encima de la diagonal principal iguales a cero) y U es la parte triangular superior de A (con todos los elementos por debajo de la diagonal principal iguales a cero).

El método de Jacobi procede iterativamente a partir de una estimación inicial 
x^(0). En cada iteración, calcula una nueva estimación x^(k+1) utilizando la siguiente fórmula:

    x^(k+1) = D^−1 (b−Rx^(k))

Donde D^−1 es la matriz inversa de D.

El proceso se repite hasta que se alcanza una precisión deseada o hasta que se alcanza un número máximo de iteraciones.

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Algoritmo</span></b></p>

1. Descomposición de la matriz: Dada una matriz A de coeficientes y un vector b de términos independientes, se descompone A en tres matrices: D, la matriz diagonal de A; L, la parte triangular inferior de A; y U, la parte triangular superior de A.

2. Inicialización: Se elige una estimación inicial x^(0).

3. Iteraciones: Se itera el proceso hasta que se alcance una precisión deseada o un número máximo de iteraciones. En cada iteración:
   
    a. Se calcula x^(k+1) utilizando la fórmula iterativa:

       x^(k+1) = D^−1 (b−Rx^(k))

    b. Se comprueba si se ha alcanzado la precisión deseada. Si es así, se detiene el proceso. Si no, se continúa a la siguiente iteración.

4. Salida: La solución aproximada x^(k) se toma como la solución del sistema de ecuaciones lineales Ax=b.

   
<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Implementación</span></b></p>

* [Ejemplo](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/dedef44be82adfdba1f13639f48310d320af37ff/Tema%203%20Metodos/JACOBI/Jacobi%203/src/jacobi/pkg3/Jacobi3.java)

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/dfda0ab6-3841-45c9-91f7-1c9dc023953e)


<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

* [Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/dedef44be82adfdba1f13639f48310d320af37ff/Tema%203%20Metodos/JACOBI/Jacobi/src/jacobi/Jacobi.java)

* [Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/dedef44be82adfdba1f13639f48310d320af37ff/Tema%203%20Metodos/JACOBI/Jacobi%202/src/jacobi/pkg2/Jacobi2.java)

* [Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/dedef44be82adfdba1f13639f48310d320af37ff/Tema%203%20Metodos/JACOBI/Jacobi%203/src/jacobi/pkg3/Jacobi3.java)

---

# Tema_4

## Metodos_de_diferenciacióm

### Regla_de_tres_puntos

#### Concepto

La regla de los tres puntos de diferenciación es una técnica utilizada en métodos numéricos para calcular aproximaciones de derivadas de una función. La idea básica detrás de esta regla es utilizar los valores de la función en tres puntos cercanos para estimar la derivada en un punto específico.
Formula:

    F′( X )≈ (− f ( x + 2 h ) + 4 f ( x + h ) − 3 f ( x ))/2 horas

#### Algoritmo

El algoritmo para aplicar esta regla en un conjunto de datos sería:

  1. Escoger un valor pequeño para ℎ.
  2. Para cada punto en los datos, calcular la aproximación de la derivada utilizando la fórmula mencionada anteriormente.
  3. Repetir el paso 2 para todos los puntos en los datos.

#### Implementación

* [Ejemplo](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/d23c710bac81cd00d0f2b1215cc1a6a92dfbeef4/Tema%204/diferenciaci%C3%B3n/Regla%20de%20los%203%20puntos/ejemplo%20regla%20de%20los%203%20puntos/src/ejemplo/regla/de/los/pkg3/puntos/EjemploReglaDeLos3Puntos.java)

#### Ejercicios

* [Ejercicio1](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/5069cbc64ec169ed4acdd98977ce5e6193e6fa64/Tema%204/diferenciaci%C3%B3n/Regla%20de%20los%203%20puntos/Regla%20de%20los%203%20puntos/src/regla/de/los/pkg3/puntos/ReglaDeLos3Puntos.java)
* [Ejercicio2](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/37f5daf29f6ad3c72e61c0469a345fa47f200e75/Tema%204/diferenciaci%C3%B3n/Regla%20de%20los%203%20puntos/regla%20de%20los%203%20puntos%202/src/regla/de/los/pkg3/puntos/pkg2/ReglaDeLos3Puntos2.java)
* [Ejercicio3](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/8147fcec229dd5331dcb75e395fd9efc2b94dfd9/Tema%204/diferenciaci%C3%B3n/Regla%20de%20los%203%20puntos/regla%20de%20los%203%20puntos%203/src/regla/de/los/pkg3/puntos/pkg3/ReglaDeLos3Puntos3.java)
---

### Regla_de_cinco_puntos

#### Concepto

La regla de los cinco puntos es otra técnica utilizada en métodos numéricos para aproximar la derivada de una función en un punto específico. Al igual que la regla de los tres puntos, esta regla también utiliza los valores de la función en Múltiples puntos cercanos para calcular la derivada. La principal diferencia es que la regla de los cinco puntos utiliza cinco puntos en lugar de tres, lo que puede proporcionar una aproximación más precisa de la derivada.
Formula:

    F′( X )≈ (− f ( x + 2 h ) + 8 f ( x + h ) − 8 f ( x − h ) + f ( x − 2 h ))/12 horas

#### Algoritmo

  1. Escoger un valor pequeño para ℎ
  2. Para cada punto en los datos, calcular la aproximación de la derivada utilizando la fórmula mencionada anteriormente.
  3. Repetir el paso 2 para todos los puntos en los datos.
     
Al igual que con la regla de los tres puntos, la precisión de esta aproximación depende del tamaño de ℎ
Se debe encontrar un valor óptimo para ℎ dependiendo de la función y los datos específicos.

#### Implementación

* [Ejemplo](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/a7b748d020c6f320b8cda3708d4323471beffccc/Tema%204/diferenciaci%C3%B3n/Regla%20de%20los%205%20puntos/ejemplo%20regla%20de%20los%205%20puntos/src/ejemplo/regla/de/los/pkg5/puntos/EjemploReglaDeLos5Puntos.java)

#### Ejercicios

* [Ejercicio1](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/1b7bf167cadb7caf5f5891e8e0446d431961a543/Tema%204/diferenciaci%C3%B3n/Regla%20de%20los%205%20puntos/regla%20de%20los%205%20puntos/src/regla/de/los/pkg5/puntos/ReglaDeLos5Puntos.java)
* [Ejercicio2](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/8dfc43d59702e8881f86434ee290ec7412d2b799/Tema%204/diferenciaci%C3%B3n/Regla%20de%20los%205%20puntos/regla%20de%20los%205%20puntos%202/src/regla/de/los/pkg5/puntos/pkg2/ReglaDeLos5Puntos2.java)
* [Ejercicio3](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/cfaf4b0fa369eb87a66a81407202e4bf134d92d6/Tema%204/diferenciaci%C3%B3n/Regla%20de%20los%205%20puntos/regla%20de%20los%205%20puntos%203/src/regla/de/los/pkg5/puntos/pkg3/ReglaDeLos5Puntos3.java)
---

## Metodos_de_integraación

### Metodo_del_Trapecio

#### Concepto

La regla del trapecio es la primera de las fórmulas cerradas de integración de Newton-Cotes, Geométricamente, la regla del trapecio es equivalente a
aproximar el área del trapecio bajo la línea recta que une f(a) y
f(b).
Formula: 

    I = (b-a)((f(a)+f(b))/2)

#### Algoritmo

  1. Definir la función 𝑓(𝑥) que se desea integrar.
  2. Especificar los límites de integración 𝑎 y 𝑏.
  3. Elegir el número de subintervalos 𝑛.
  4. Calcular ℎ = 𝑏−𝑎/𝑛.
  5. Calcular 𝑓(𝑎) y 𝑓(𝑏)
  6. Para cada 𝑖 = 1, 2,..., 𝑛−1.
    * Calcular 𝑥𝑖 = 𝑎 + 𝑖 ⋅ ℎ.
    * Calcular 𝑓(𝑥𝑖).
  7. Sumar 𝑓(𝑎), 2∑𝑖=1, 𝑛−1,𝑓(𝑥𝑖) y 𝑓(𝑏).
  8. Multiplicar la suma por ℎ/2 para obtener la aproximación de la integral.

#### Implementación

* [Ejemplo](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/36dbf343b30fdf5b31158b2a2b2948b40fa14455/Tema%204%20Metodos/integraci%C3%B3n/Trapecio/ejemplo%20metodo%20del%20trapecio/src/ejemplo/metodo/del/trapecio/EjemploMetodoDelTrapecio.java)

#### Ejercicios

* [Ejercicio1](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/defb8dab6c136c898d9e33e2f04ac7ecac5255e3/Tema%204%20Metodos/integraci%C3%B3n/Trapecio/metodo%20del%20trapecio/src/metodo/del/trapecio/MetodoDelTrapecio.java)
* [Ejercicio2](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/a0f69edd41998b1bd769faf61d3fdf80e5a706f5/Tema%204%20Metodos/integraci%C3%B3n/Trapecio/metodo%20del%20trapecio%201/src/metodo/del/trapecio/pkg1/MetodoDelTrapecio2.java)
* [Ejercicio3](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/54dc18f519740e3477acdc89c2798e783fbd6105/Tema%204%20Metodos/integraci%C3%B3n/Trapecio/Metodo%20del%20trapecio%203/src/metodo/del/trapecio/pkg3/MetodoDelTrapecio3.java)
---

### Regla_de_Simpson

#### Concepto

La regla de Simpson es un método de cálculo numérico utilizado para aproximar el valor de una integral definida. Este método utiliza polinomios de segundo grado (también conocidos como parábolas) para aproximar la función integrada en cada subintervalo del intervalo dado. La regla de Simpson es más precisa que el método del trapecio, especialmente para funciones que son relativamente suaves o que se pueden aproximar segundo bien con polinomios de grado.
Formula:

    I ≅ (b–a)((f(x0)+4f(x)+f(x2))/6)

#### Algoritmo

  1. Definir la función 𝑓(𝑥) que se desea integrar.
  2. Especificar los límites de integración 𝑎 y 𝑏.
  3. Elegir el número de puntos de integración 𝑛 (debe ser par).
  4. Calcular ℎ = 𝑏−𝑎/𝑛.
  5. Calcular 𝑓(𝑎) y 𝑓(𝑏)
  6. Para cada 𝑖 = 1, 2,..., 𝑛−1.
    * Calcular 𝑥𝑖 = 𝑎 + 𝑖 ⋅ ℎ.
    * Calcular 𝑓(𝑥𝑖).
  7. Sumar 𝑓(𝑎), 4∑𝑖=1, 𝑛/2, 𝑓(𝑥2𝑖-1), 2∑𝑖=1, 𝑛/2-1, 𝑓(𝑥2𝑖) y 𝑓(𝑏).
  8. Multiplicar la suma por ℎ/3 para obtener la aproximación de la integral.

#### Implementación

* [Ejemplo](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/075a4b05779fb3cb59d4a2b7728fbe26c8923b3e/Tema%204/integraci%C3%B3n/Simpson/ejemplo%20simpson/src/ejemplo/simpson/EjemploSimpson.java)


#### Ejercicios

* [Ejercicio1](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/f0929829701fe97553a3ffd7bacaf9c975db09eb/Tema%204%20Metodos/integraci%C3%B3n/Simpson/simpson%201/src/simpson/pkg1/Simpson1.java)
* [Ejercicio2](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/05b05ac18b7ecf49417eace9cdacfaa0ad3042d3/Tema%204%20Metodos/integraci%C3%B3n/Simpson/simpson%202/src/simpson/pkg2/Simpson2.java)
* [Ejercicio3](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/90d4f7c4018f6bde6d6a9070f6d6e98b4f3b5354/Tema%204%20Metodos/integraci%C3%B3n/Simpson/simpson%203/src/simpson/pkg3/Simpson3.java)
---

### Método_de_la_cuadratura_gaussiana

#### Concepto

El método de cuadratura gaussiana, o simplemente cuadratura gaussiana, es una técnica utilizada en el cálculo numérico para aproximar el valor de una integral definida. La cuadratura gaussiana se basa en la idea de seleccionar cuidadosamente los puntos de evaluación y los pesos asociados para lograr una alta precisión en la aproximación de la integral.
Formula:

    ∫a,b f(x)dx≈∑i=1,n; wi ⋅ f(xi)


#### Algoritmo

  1. Selección de los puntos de integración y sus pesos:
    Este paso implica elegir los puntos de integración 𝑥𝑖 y los pesos 𝑤𝑖 adecuados para la función y el intervalo dados. La elección de estos puntos y pesos depende del grado del polinomio que se desea integrar de manera exacta.
  2. Cálculo de la aproximación de la integral:
     Una vez que se han determinado los puntos de integración y sus pesos, la aproximación de la integral se calcula evaluando la función 𝑓(𝑥) en estos puntos y multiplicándola por los pesos correspondientes, y luego sumando estos productos.

#### Implementación

* [Ejemplo](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/7950471be563b1a8b5c4299ec931874ae8f61a91/Tema%204/integraci%C3%B3n/Cuadratura%20Gausiana/Cuadratura%20gausiana/src/cuadratura/gausiana/CuadraturaGausiana.java)

#### Ejercicios

* [Ejercicio1](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/f680bcd3b74c36b7170162b0043a80e1a88d4a92/Tema%204%20Metodos/integraci%C3%B3n/Cuadratura%20Gausiana/cuadratura%20guassiana%201/src/cuadratura/guassiana/pkg1/CuadraturaGuassiana1.java)
* [Ejercicio2](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/52d4b83c568f5d3c4a534c6c7bdcf2faba220bd5/Tema%204%20Metodos/integraci%C3%B3n/Cuadratura%20Gausiana/cuadratura%20gausiana%202/src/cuadratura/gausiana/pkg2/CuadraturaGausiana2.java)
* [Ejercicio3](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/6e7b44440758b73e2848de216cfa7149307290d1/Tema%204%20Metodos/integraci%C3%B3n/Cuadratura%20Gausiana/cuadratura%20gausiana%203/src/cuadratura/gausiana/pkg3/CuadraturaGausiana3.java)
---
# Tema_5
## Metodos_de_interpolación

#### Consepto

La interpolación en métodos numéricos es una técnica utilizada para aproximar valores de una función desconocida a partir de un conjunto discreto de puntos conocidos. Básicamente, consiste en encontrar una función que pase exactamente por los puntos dados. Esto es útil cuando se tiene un conjunto de datos discretos y se necesita estimar los valores de la función en puntos intermedios.

### Lineal
#### Consepto

El concepto básico de la interpolación lineal implica trazar una línea recta entre dos puntos conocidos en un gráfico, y luego utilizar esta línea para estimar el valor de la función en un punto que se encuentra entre estos dos puntos conocidos.

Formula:
<p align="center"><img src="https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/assets/147437882/3dc32a22-a555-4738-8a33-f4eead358e80" width="400" height="100" />

#### Algoritmo

  1. Obtener los puntos conocidos: Identifica los puntos conocidos (x0, y0) y (x1, y1) de los cuales deseas interpolar un valor en un punto x.
  2. Sustituir valores en la fórmula: Una vez que tengas los puntos conocidos y el punto en el que deseas interpolar (x), sustituye estos valores en la fórmula.
  3. Calcular el valor de y: Utiliza la fórmula para calcular el valor de y correspondiente al punto x utilizando los valores de x0, y0, x1, y1 y x.
  4. Resultado: El valor calculado de y es el resultado de la interpolación lineal en el punto x.

#### Implementación

<p align="center"><img src="https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/assets/147437882/939300e0-73ea-4187-ac52-2dc8f1cb9c82" width="600" height="200" />

#### Ejercicios
* [Ejercicio 1 de clase](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/66df0399fe851b6dfcd0d977c006fe53a2296b7d/Tema%205%20Metodos/Interpolaci%C3%B3n/Lineal/ejemplo%20lineal/src/ejemplo/lineal/EjemploLineal.java)
* [Ejercicio 2](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/e8e56d3c5d3b4a7d20a4de6afb1ca51c40ea2e47/Tema%205%20Metodos/Interpolaci%C3%B3n/Lineal/ejercicio2lineal/src/ejercicio2lineal/Ejercicio2lineal.java)
* [Ejercicio 3](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/8172654d2a9ecbc68ed5d5f1a4085f7510ed92be/Tema%205%20Metodos/Interpolaci%C3%B3n/Lineal/ejercicio3lineal/src/ejercicio3lineal/Ejercicio3lineal.java)
* [Ejercicio 4](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/f4c9034d2e2068b4118a0c2575bb53a77ac250c1/Tema%205%20Metodos/Interpolaci%C3%B3n/Lineal/ejercicio4lineal/src/ejercicio4lineal/Ejercicio4lineal.java)
* [Ejercicio 5](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/7d2ef493daa7d01b897ada29ae0a3921f9955994/Tema%205%20Metodos/Interpolaci%C3%B3n/Lineal/ejercicio5lineal/src/ejercicio5lineal/Ejercicio5lineal.java)

### Cuadratica
#### Concepto

El concepto básico de la interpolación cuadrática implica seleccionar tres puntos de datos conocidos (x0, y0), (x1, y1) y (x2, y2)  y encontrar una parábola que pase exactamente a través de estos tres puntos.

Formula:
<p align="center"><img src="https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/assets/147437882/02296822-fded-4449-b7b3-27c52293188c" width="400" height="100" />

donde se puede encontrar a con la siguiente formula:
<p align="center"><img src="https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/assets/147437882/6108fefe-88da-4d53-80ee-2d676eff3474" width="400" height="100" />

donde se puede encontrar b con la siguiente formula:
<p align="center"><img src="https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/assets/147437882/1b258b83-aa52-4d7d-a53f-b673bc73980d" width="400" height="100" />

donde se puede encontrar c con la siguiente formula:
<p align="center"><img src="https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/assets/147437882/48f26425-510c-436e-8f2c-609a3b763d8e" width="400" height="100" />

#### Algoritmo
  1. Obtener los puntos conocidos: Identifica los tres puntos conocidos (x0, y0), (x1, y1) y (x2, y2) que utilizarás para realizar la interpolación cuadrática.
  2. Calcular el coeficiente cuadrático (𝑎): Utiliza la fórmula para calcular el coeficiente cuadrático 𝑎 utilizando los valores de los puntos conocidos.
  3. Calcular el coeficiente lineal (𝑏): Utiliza la fórmula para calcular el coeficiente lineal 𝑏 utilizando 𝑎 y los valores de los puntos conocidos.
  4. Calcular el término independiente (𝑐): Utiliza la fórmula para calcular el término independiente 𝑐 utilizando 𝑎, 𝑏 y los valores de los puntos conocidos.
  5. Evaluar el polinomio cuadrático: Utiliza el polinomio cuadrático 𝑦 = 𝑎𝑥^2 + 𝑏𝑥 + 𝑐 con los coeficientes calculados para evaluar el valor de 𝑦 en el punto de interés 𝑥.
  6. Mostrar el resultado: Muestra el valor interpolado de 𝑦 en el punto 𝑥.

#### Implementación
<p align="center"><img src="https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/assets/147437882/7dd585cf-a76a-4f7e-a333-c9b826cd3621" width="600" height="250" />

* [Ejercicio 1](https://github.com/EltonYaelAlbaRoldan/MetodosNumericosItesa2024/blob/51f8077474a117e8192cd2d5aaaa472149e5b2bc/Tema%205%20Metodos/Interpolaci%C3%B3n/Cuadratica/cuadratica1/src/cuadratica1/Cuadratica1.java)


## Metodos_de_extrapolación
