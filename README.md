# STRUCTURAL-CP-Proxy

> Reducir la funcionalidad. <br>
> Controles que restringen el sistema.

Nos propone no modificar el tipo actual, si no crear un objeto nuevo. 
Los clientes tendrán acceso al nuevo, que será quien realice los controles necesarios: delegando las llamadas al objeto original (si así ha sido determinado).

La composición para extender nuestro sistema.

## Virtual Proxy
No intenta restringir acceso al objeto real, retrasa al max la creacción del mismo.
Cuando la creación real es costosa.
