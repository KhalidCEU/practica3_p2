## Practica 3 - Programación 2

> Esta práctica es la misma que las practicas [1](https://github.com/KhalidCEU/practica1_p2) y [2](https://github.com/KhalidCEU/practica2_p2), pero haciendo uso de **streams** y **expresiones lambda**.

En [este fichero](/docs/logs.md) se encuentra una pequeña demonstración de los puntos que generamos mediante el stream.

### Explicación / Teoría

El método usado para obtener la aproximación del numero PI, es el método **Monte-Carlo**.

Estos son los pasos que usamos para generar el una aproximación del número PI **de manera iterativa**:

- Se genera un punto **aleatorio** en un cuadrado **de lado 1** (con ```Math.random```).
- **Verificamos** si el punto esta **dentro de un círculo** de radio 1 (situado en parte dentro del cuadrado)
- **Contamos** los puntos que caen **dentro del círculo**.
- Usamos la **proporción de puntos dentro del círculo respecto al total** para aproximar PI.

<div align="center">
    <img src="https://github.com/user-attachments/assets/d7daf124-b33e-460c-b1d1-29bb39ec308a" style="width: 50%">
</div>

La formula usada para la generación del numero PI es la siguiente:

> **PI ≈ 4 * (puntos dentro del círculo) / (total puntos generados)**

Esto tambien significa que cuanto mas puntos (parametro **"pasos"**) generamos, mas nos aproximaremos al numero PI.

### Uso

Primero compile el programa con el comando :

```
make
```

Lance el programa :

```
./a.out <numeroDePasos>
```

### Output

```
// Input : 1000000000

El número PI es 3.141641064
```

> Nota: Con numeros grandes, la ejecución puede tardar un poco mas en finalizar, ya que el numero de iteraciones es mayor.

### Tiempo de ejecución

Para medir el **tiempo de ejecución**, se puede usar el comando ``time`` de esta manera : `time ./a.out <numeroDePasos>`. Por ejemplo, para el resultado anterior, en un Macbook M1 Pro tomó un total de **31,31s** (varía según el hardware entre otros factores).

![image](https://github.com/user-attachments/assets/e3d022db-5871-4d6d-b55e-4eee2413d0fe)

### Diagrama UML

<br>

<p align="center">
  <img src="http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/KhalidCEU/practica3_p2/refs/heads/main/docs/diagram.puml" alt="Class Diagram" width=30%>
</p>
