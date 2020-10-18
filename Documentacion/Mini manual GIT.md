# Nociones sobre GIT y GITHUB
----
## 1. Flujos de trabajo
----
<span style="color:red">**Working Dir**</span> ---add---> <span style="color:blue">**Index**</span> ---commit---> <span style="color:green">**HEAD**</span> ---push---> <span style="color:purple">**Remote**</span>

<span style="color:red">**Working Dir**</span> <---checkout--- <span style="color:blue">**Index**</span> <---reset--- <span style="color:green">**HEAD**</span> <---pull--- <span style="color:purple">**Remote**</span>

- <span style="color:red">**Working dir**</span> ---> _Directorio local de trabajo_
- <span style="color:blue">**Index**</span> ---> _Actua como zona intermedia_
- <span style="color:green">**HEAD**</span> ---> _Apunta al último commit_
- <span style="color:purple">**Remote**</span> ---> _Es la versión en remoto (Lo que vemos en github)_
----
## 2. Gestion de ramas
----
### 2.1 Listado de ramas
---
- <span style="color:#bf8a3d">**git brach**</span>---> _Muestra las ramas y marca con * la que está en head_
- <span style="color:#bf8a3d">**grafico**</span>---> _Muestra el estado de las ramas de forma gráfica (Alias incluido por mi)_
----
### 2.2 Cambios de ramas
----
- <span style="color:#bf8a3d">**git checkout @NombreRama**</span>--->_Ponemos el HEAD en el último commit de la rama indicada_
- <span style="color:#bf8a3d">**git checkout -b @NombreRama**</span>--->_Crea una rama y la activa, es como hacer branch y despues checkout_
----
### 2.3 Fusión, reorganización y eliminación de ramas
----
- <span style="color:#bf8a3d">**git merge @NombreRama**</span>--->_Integra los cambios de la rama @NombreRama en la rama en la que se encuentra el HEAD_
- <span style="color:#bf8a3d">**git rebase @NombreRama1 @NombreRama2**</span>--->_Replica los cambios de la rama 2 en la rama 1 partiendo del ancestro común de ambas. La rama 2 desaparece porque sus commit pasan a estar en la rama 1_
- <span style="color:#bf8a3d">**git branch -d @NombreRama**</span>--->_Elimina @NombreRama siempre y cuando haya sido fusionada previamente, si queremos obviar este detalle escribimos la D en mayuscula_

