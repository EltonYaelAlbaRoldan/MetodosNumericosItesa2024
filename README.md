# MetodosNumericosItesa2024
>Divide y venceras

# Tema 2
---

## Bisección
---

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

![imagen](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/aeabc4ed694e637782d23d3604462fac874f9aab/Bisecci%C3%B3n/Implementaci%C3%B3n%20Bisecci%C3%B3n/Captura%20de%20pantalla%202024-03-13%20224218.png)


### Ejercicios

[Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/db4fa5e81cc0fbc41ad02d7fb25ee52ff1e5fb6e/Tema%202%20Metodos/Bisecci%C3%B3n/Biseccion/src/biseccion/Biseccion.java)

[Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/6fa31e21461ec8570b82768f7f0e989b51baa5a4/Tema%202%20Metodos/Bisecci%C3%B3n/Biseccion2/src/biseccion2/Biseccion2.java)

[Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/6fa31e21461ec8570b82768f7f0e989b51baa5a4/Tema%202%20Metodos/Bisecci%C3%B3n/Biseccion3/src/biseccion3/Biseccion3.java)

[Ejercicio4](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/6fa31e21461ec8570b82768f7f0e989b51baa5a4/Tema%202%20Metodos/Bisecci%C3%B3n/Biseccion4/src/biseccion4/Biseccion4.java)

[Ejercicio5](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/6fa31e21461ec8570b82768f7f0e989b51baa5a4/Tema%202%20Metodos/Bisecci%C3%B3n/Biseccion5/src/biseccion5/Biseccion5.java)

*Regla Falsa*
---

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

![imagen](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/655365dd8a77458a6803a14cb14d856920f41493/Regla%20falsa/Implementaci%C3%B3n/Captura%20de%20pantalla%202024-03-14%20010446.png)

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

[Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Regla%20falsa/Regla%20Falsa/src/regla/falsa/ReglaFalsa.java)

[Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Regla%20falsa/Regla%20Falsa%202/src/regla/falsa/pkg2/ReglaFalsa2.java)

[Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Regla%20falsa/Regla%20Falsa%203/src/regla/falsa/pkg3/ReglaFalsa3.java)

[Ejercicio4](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Regla%20falsa/Regla%20Falsa%204/src/regla/falsa/pkg4/ReglaFalsa4.java)

[Ejercicio5](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Regla%20falsa/Regla%20Falsa%205/src/regla/falsa/pkg5/ReglaFalsa5.java)


*Secante*
---

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

![Imagen](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/edae64d9ff4ae50f30e451812899b3f21bdc8234/Secante/Implementaci%C3%B3n/Captura%20de%20pantalla%202024-03-14%20013305.png)
![Imagen](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/61408b9919ad19a4aa7af6c657381009398b7433/Secante/Implementaci%C3%B3n/Captura%20de%20pantalla%202024-03-14%20013517.png)

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

[Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/4e544780137a2cd5085ecf8b36fb8d4a5a825163/Tema%202%20Metodos/Secante/Secante/src/secante/Secante.java)

[Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Secante/Secante%202/src/secante/pkg2/Secante2.java)

[Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Secante/Secante%203/src/secante/pkg3/Secante3.java)

[Ejercicio4](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/4e544780137a2cd5085ecf8b36fb8d4a5a825163/Tema%202%20Metodos/Secante/Secante%204/src/secante/pkg4/Secante4.java)

[Ejercicio5](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b0b29b93a8da0fc6eea07efea91e8951d63635cf/Tema%202%20Metodos/Secante/Secante%205/src/secante/pkg5/Secante5.java)

*Newton Rapson*
---

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

![Imagen](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/e4498cc9d917acdae94f63ae211d9333f509d18a/Newton/Implementaci%C3%B3n/Captura%20de%20pantalla%202024-03-14%20093128.png)

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

[Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/20f0284da0e174237ed13c5d613a99c82c14daa5/Tema%202%20Metodos/Newton/Newton/src/newton/Newton.java)

[Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/20f0284da0e174237ed13c5d613a99c82c14daa5/Tema%202%20Metodos/Newton/Newton2/src/newton2/Newton2.java)

[Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/20f0284da0e174237ed13c5d613a99c82c14daa5/Tema%202%20Metodos/Newton/Newton3/src/newton3/Newton3.java)

[Ejercicio4](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/20f0284da0e174237ed13c5d613a99c82c14daa5/Tema%202%20Metodos/Newton/Newton4/src/newton4/Newton4.java)

[Ejercicio5](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/20f0284da0e174237ed13c5d613a99c82c14daa5/Tema%202%20Metodos/Newton/Newton5/src/newton5/Newton5.java)

**TEMA 3**
---

*MÉTODO DE ELIMINACIÓN GAUSSIANA*
---

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Concepto</span></b></p>

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

En esta imagen se observa el inicio del codigo, dentro del main se encuentra la parte donde se pone el sistema de ecuaciones y donde se imprimen los resultados, despues del main aparece la funecion que va a crear la matriz, 

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/6c89e917-ee1e-4f48-bb84-478e3087193a)

En esta parte se observa el metodo que se esta implementando, con cada uno de los pasos que se deben seguir, los pasos estan escritos dentro de la imagen como comentarios

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/2ee444c3-a5b7-4632-b0f3-f4e258e4319e)

Por ultimo se muestran los resultados obtenidos

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/eba1d99b-87ca-4888-b26a-85f136e2415c)


<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

[Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/b2f3163fecaf2cea5e85c59e5c7bb572ce4b9b95/Tema%203%20Metodos/ELIMINACI%C3%93N%20GAUSSIANA/Eliminacion%20Gaussiana/src/eliminacion/gaussiana/EliminacionGaussiana.java)

[Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/75fd44dc9d8bfacb7aae359557abffd0ba463001/Tema%203%20Metodos/ELIMINACI%C3%93N%20GAUSSIANA/Eliminaci%C3%B3nGaussiana2/src/eliminaci%C3%B3ngaussiana2/Eliminaci%C3%B3nGaussiana2.java)

[Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/c52eeeb06ef40b47154c58731297ca446c59d0ec/Tema%203%20Metodos/ELIMINACI%C3%93N%20GAUSSIANA/Eliminacion%20Gaussiana%203/src/eliminacion/gaussiana/pkg3/EliminacionGaussiana3.java)

*MÉTODO DE GAUSS JORDAN*
---

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

En esta imagen se observa el inicio del codigo, dentro del main se encuentra la parte donde se pone el sistema de ecuaciones y se imprimen los resultados, Tambien se muestra el metodo que estamos aplicando

![imagen](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/8a3421b5-63e1-4e8f-b399-dba8ebc74e40)

Aquí se percibe la continuación del metodo y tambien el resultado obtenido

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/2f23bb22-afda-483e-b8bb-2436277eba8c)

<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

[Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/48fdcf6c77afb44befcc3a774d33c857aeccad83/Tema%203%20Metodos/GAUSS%20JORDAN/Gauss%20Jordan/src/gauss/jordan/GaussJordan.java)

[Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/48fdcf6c77afb44befcc3a774d33c857aeccad83/Tema%203%20Metodos/GAUSS%20JORDAN/Gauss%20Jordan%202/src/gauss/jordan/pkg2/GaussJordan2.java)

[Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/48fdcf6c77afb44befcc3a774d33c857aeccad83/Tema%203%20Metodos/GAUSS%20JORDAN/Gauss%20Jordan%203/src/gauss/jordan/pkg3/GaussJordan3.java)

**Metodo de Gauss-Seidel**
---

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

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/accce071-ffec-493e-8e96-44c4781c1ef9)

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/c08a3c99-b09b-4a49-bc77-60f8062bb89f)

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/cec924b4-4df4-45fa-a9cc-5c5df746f090)


<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

[Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/c82e34780f891315f1dd2dac51ec03eb2bff69da/Tema%203%20Metodos/GAUSS%20SEIDEL/Gauss-Seidel/src/gauss/seidel/GaussSeidel.java)

[Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/c82e34780f891315f1dd2dac51ec03eb2bff69da/Tema%203%20Metodos/GAUSS%20SEIDEL/Gauss-Seidel%202/src/gauss/seidel/pkg2/GaussSeidel2.java)

[Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/c82e34780f891315f1dd2dac51ec03eb2bff69da/Tema%203%20Metodos/GAUSS%20SEIDEL/Gauss-Seidel%203/src/gauss/seidel/pkg3/GaussSeidel3.java)

**Metodo de JACOBI**
---

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

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/905fb93e-650f-4dcc-a68c-2c656f98e4bd)

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/a4ec0fb7-1337-49f0-b9a1-3843d271e47f)

![image](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/assets/147437882/dfda0ab6-3841-45c9-91f7-1c9dc023953e)


<p align="center"><b><span style="font-family: Negrita; font-size: 200px;">Ejercicios</span></b></p>

[Ejercicio1](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/dedef44be82adfdba1f13639f48310d320af37ff/Tema%203%20Metodos/JACOBI/Jacobi/src/jacobi/Jacobi.java)

[Ejercicio2](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/dedef44be82adfdba1f13639f48310d320af37ff/Tema%203%20Metodos/JACOBI/Jacobi%202/src/jacobi/pkg2/Jacobi2.java)

[Ejercicio3](https://github.com/Eltonvamosporla14/MetodosNumericosItesa2024/blob/dedef44be82adfdba1f13639f48310d320af37ff/Tema%203%20Metodos/JACOBI/Jacobi%203/src/jacobi/pkg3/Jacobi3.java)
