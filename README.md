# Workshop Kotlin

![Logo Laravel](kotlin.png)

## Introduction
### Qu'est-ce que Kotlin ?

__**Définition:**__ Kotlin est un langage de programmation orienté objet et fonctionnel, avec un typage statique qui permet de compiler pour la machine virtuelle Java et JavaScript.  
  
C'est le nouveau langage de programmation Open Source supporté par Google pour les applications Android (mais aussi pour le back-end Java et les moteurs JavaScript des navigateurs web). Il a pour but d’améliorer la productivité des développeurs, tout en restant compatible avec le code existant. Il est également possible de le compiler en natif.

Avant Kotlin, Google ne supportait que le langage Java pour développer les fameuses applications que vous utilisez au quotidien. Kotlin ne nécessite en aucun cas de réécrire l’ensemble des applications. Il est tout à fait possible de faire cohabiter du code Java et du code Kotlin. On comprend aisément pourquoi Google a opté pour cette solution qui offre une transition en douceur. Kotlin est également un langage robuste et éprouvé, puisqu’il est disponible depuis près de six années et qu’il est déjà utilisé en production sur des applications Android.

Quelques exemples : Flipboard, Pinterest ou Expedia.

### Qu’offre Kotlin ?

Il offre beaucoup de fonctionnalités, c'est un language plus riche, flexible et concis. 
Quelques fonctionnalités : ne plus avoir besoin de mettre des points virgules à la fin de chaque instruction, l’inférence de type (mécanisme qui permet à un compilateur de rechercher automatiquement les types associés à des expressions, sans qu'ils soient indiqués explicitement dans le code source), étendre des classes existantes,…  
Une page officielle détaille plus précisément les différences que l’on peut trouver avec Java : https://kotlinlang.org/docs/reference/comparison-to-java.html

### Quel avenir pour Java et C/C++ sur Android ?

Google a affirmé haut et fort que le support de Java, C et C++ sera le même qu’aujourd’hui. Kotlin est simplement un nouveau langage supporté pour faciliter la vie des développeurs (un langage plus concis, c’est moins d’erreurs potentielles, et donc moins de crashs à long terme). Le développement des applications étant facilité, si l'on débute dans le développement Android, il faut peut être penser à passer directement à Kotlin !
  
## Mise en place
### Val et var

 Le mot clé **var** permet, comme en Java, de déclarer une variable ré-assignable.
```console
//Java
String firstName = "Hello world";

//Kotlin
var firstName: String = "Hello world"
```

Le mot clé **val** rend l’assignation définitive comme final de Java.
```shell
//Java
final String firstName = "Hello world";

//Kotlin
val firstName: String = "Hello world"
```

### Data

Le mot clé **data** indique au compilateur que la classe est utilisée pour représenter une entité. Mais il permet aussi de générer un certain nombre de méthodes utiles comme les méthodes **toString()**, **copy()**, **equals()**, **hashCode()** ou les déclarations déstructurées de l’objet par exemple.
.  
.  
.  
.  
.  
.  
.  
.  
.  
.  
### Il vaut mieux utiliser IntelliJ IDEA ou Android Studio pour Kotlin
### Installation
How to install Oracle Java JDK on Ubuntu Linux

Ouvrez le terminal

sudo apt-add-repository ppa:webupd8team/java 

sudo apt-get update 

sudo apt-get install oracle-java8-installer

java -version

clear

sudo gedit /etc/profile

export JAVA_HOME=/usr/lib/jvm/java-8-oracle




How to install Android Studio in Ubuntu Linux

https://developer.android.com/studio/

Ouvrez le terminal dans le dossier bin

sudo chmod 777 -R studio.sh

./studio.sh

Si erreur -> Error:Unable to run mksdcard SDK tool in ubuntu 

sudo apt-get install lib32z1 lib32ncurses5 lib32bz2-1.0 lib32stdc++6 


https://codelabs.developers.google.com/


