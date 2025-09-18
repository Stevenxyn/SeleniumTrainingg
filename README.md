
# Configurar el Proyecto

## Descargar Selenium JAR
Descargamos Selenium Server Grid [Selenium Descargas](https://www.selenium.dev/downloads/).

Al descargar iremos al **IDE** en el proyecto donde tenemos creado damos click izquiero en **Build Path > Configure Build Path** y en **Libreries > Classpath** damos en **Add External JARS** y agregamos lo descargado, se agregara en el proyecto SeleniumServer.

## Descargar Browser driver

Ahora vamos a descargar el navegador donde le daremos las instrucciones, podemos usar varios en este caso ocupare Chrome, se debe revisar la version del navegador real que ocupamos y descargar la misma version de ese [En el apartado de Browsers](https://www.selenium.dev/downloads/).

**Lo guardamos en el disco local C dentro de una carpeta nueva, ahi dejaremos los drivers de los navegadores organizaditos**


[REPOSITORIO CON LA ESTRUCTURA USANDO INSTALADORES DEL NAVEGADOR MAS NO MAVEN](https://github.com/Stevenxyn/SeleniumCourse).

## Instalacion de Maven

Maven nos ayuda a gestionar las dependencias del o los proyectos, facilitando la configuracion en el dado caso que trabajemos mas de 1 persona asi todos tenemos las mismas versiones y no existan inconvenientes de que algunas cosas no corran a diferentes personas del equipo

Hay que descargar maven, crear la variable de entorno y configurarlo

 [Descargar Maven, yo descargue **Binary Zip archive**](https://maven.apache.org/download.cgi).

[Video guia de configuracion](https://www.youtube.com/watch?v=4gHSwvs0HiA&list=PLL34mf651faPB-LyEP0-a7Avp_RHO0Lsm&index=7).




## Configuracion proyecto con Maven

De esta manera podemos organizar mas facilmente el proyecto de automatizacion si se trabaja en equipos grandes, ya que en las dependencias llamamos lo que necesitamos y todos tendran lo mismo, sin necesidad de descargar los drivers de cada navegador cuando salgan actualizaciones y demas.

Toda dependencia debe agregarse en el **pom.xml** y el proyecto java debe crearse sobre maven

[Pagina oficial donde buscamos las dependencias](https://mvnrepository.com/).


## Cómo usar WebDriver Manager

Con esta dependencia nos automatiza el proceso de estar descargando las versiones de cada driver por cada proveedor o sea chrome, firefox, edge etc, esto nos quita de encima el tener que descargar cada vez que salga una actualizacion, debemos agregarlo a las dependencias y automaticamente nos lo trae.

Tambien de la forma manual ocupabamos el **System.setProperty** y su webdriver (navegador y su ubicacion)

Ahora con la dependencia unicamente llamamos el driver que queremos usar y ya **WebDriverManager.chromedriver().setup();**

[Dependencia requerida](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager).


