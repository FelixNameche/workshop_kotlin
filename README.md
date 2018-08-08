# Workshop Kotlin

![Logo Laravel](kotlin.png)

## Introduction
### Qu'est-ce que Kotlin ?

__**Définition:**__ Kotlin est un langage de programmation orienté objet et fonctionnel, avec un typage statique qui permet de compiler pour la machine virtuelle Java et JavaScript.  
  
C'est le nouveau langage de programmation Open Source supporté par Google pour les applications Android (mais aussi pour le back-end Java et les moteurs JavaScript des navigateurs web). Il a pour but d’améliorer la productivité des développeurs, tout en restant compatible avec le code existant. Il est également possible de le compiler en natif.

Avant Kotlin, Google ne supportait que le langage Java pour développer des applications. Kotlin ne nécessite en aucun cas de réécrire l’ensemble des applications. Il est tout à fait possible de faire cohabiter du code Java et du code Kotlin. C'est pourquoi Google a opté pour cette solution qui offre une transition en douceur. Kotlin est également un langage robuste et éprouvé, puisqu’il est disponible depuis près de six années et qu’il est déjà utilisé en production sur des applications Android. (Flipboard, Pinterest, Expedia, ...)

### Qu’offre Kotlin ?

Il offre beaucoup de fonctionnalités, c'est un language plus riche, flexible et concis. 
Quelques fonctionnalités :   
- ne plus avoir besoin de mettre des points virgules à la fin de chaque instruction
- l’inférence de type (mécanisme qui permet à un compilateur de rechercher automatiquement les types associés à des expressions, sans qu'ils soient indiqués explicitement dans le code source) 
- étendre des classes existantes
- ...

Une page officielle détaille plus précisément les différences que l’on peut trouver avec Java : https://kotlinlang.org/docs/reference/comparison-to-java.html

### Quel avenir pour Java et C/C++ sur Android ?

Google a affirmé haut et fort que le support de Java, C et C++ sera le même qu’aujourd’hui. Kotlin est simplement un nouveau langage supporté pour faciliter la vie des développeurs (un langage plus concis, c’est moins d’erreurs potentielles, et donc moins de crashs à long terme). Le développement des applications étant facilité, si l'on débute dans le développement Android, il faut peut être penser à passer directement à Kotlin !
  
## Bases du langage
### Déclarations de variables
https://try.kotlinlang.org/

En Kotlin, on distingue les variables dont on peut changer la valeur, et les variables immuables :  

- Le mot clé **var** permet, comme en Java, de déclarer une variable ré-assignable.
- Le mot clé **val** rend l’assignation définitive comme final de Java.
```
    val nom:String = "Toto"
    // nom = "Dodo" // Interdit !!! Car nom a été déclaré avec val
    var age = 10
    age += 12 // aucun problème car age est altérable.
    
    println(nom)
    println(age)
```

Il faut préciser le type de variable après le nom, et pas avant comme en Java.

### Types de base

Les types sont équivalents aux types existants en Java : si ce n'est qu'en Kotlin, tout est objet et qu'il existe plus de types. Comme par exemple, le type Range (intervalle), avec lequelle on peut effectuer une boucle :
```
    for (i in 3..7){
      println(i)
    } // Affiche les chiffres de 3 à 7 sur plusieurs lignes.
```
On peut aussi obtenir une intervalle décroissant avec downTo :
```
    for (i in 10 downTo 0) {
      println(i)
    } // Compte à rebours de 10 à 0, sur plusieurs lignes.
```
Il est aussi possible de préciser une progression autre que 1 :
```
    for (i in 2..36 step 3) {
      println(i)
    } // Affiche les nombres 2,5,8,…,35
```
Il est aussi possible de combiner un intervalle décroissant et une progression définie :
```
    for (i in 36 downTo 2 step 3) {
    	println(i) 
    } // Affiche les nombres 36,33,…,3
```

### Les tableaux

Les tableaux sont représentés par la classe générique Array (contenant des valeurs d'un même type).  
On peut construire un Array de deux manières différentes : soit par le constructeur Array, soit par la fonction arrayOf. La fonction arrayOf est plus proche de ce que l'on connaît en Java, tandis que le constructeur Array permet de bénéficier de plus de contrôle sur l'initialisation :
```
    val tableau1 = arrayOf(2,10,-1,4,9)
    val tableau2 = Array(10, { i -> i * 2 })
    tableau1[0] = 99
    
    tableau1.forEach { 
      println(it) 
    }
    tableau2.forEach { 
      println(it) 
    }
```
Plusieurs remarques au sujet de l'initialisation via le constructeur :

- Le premier paramètre décrit le nombre d'éléments du tableau
- Le deuxième est une fonction qui prend l'index de l'élément à initialiser et qui retourne une valeur.

Les tableaux disposent aussi de fonctions supplémentaires par rapport à leur version Java. Parmi la multitude de fonctions :
```
    val tab = arrayOf(7,10,15,3,6,9,12)
    
    println(tab.sum())
    println(tab.reversed())
    println(tab.min())
    println(tab.max())
    println(tab.first())
    println(tab.last())
    println(tab.take(3)) // les 3 premiers éléments du tableau
    println(tab.drop(3)) // le tableau sans ses 3 premiers éléments
```

### Interpolation de chaînes

Cette fonctionnalité nous permet de concaténer des chaînes plus facilement. Si en java nous voulons écrire une séquence du type :
```
  int a = 10;
  int b = 6;
  String c = "abc";
  System.out.println("[" + a + ", " + b*2 + ", " + c + "]");
```
En Kotlin on pourra simplement écrire :
```
  val a = 10
  val b = 6
  val c = "abc"
  println("[$a, ${b*2}, $c]")
```
Ainsi :
- On utilise qu'une seule chaîne de caractères
- $a permet de substituer la valeur de la variable a dans la chaîne, quel que soit son type (souvenez-vous qu'en Kotlin, tout est objet)
- ${b*2} s'écrit avec accolades étant donné qu'il s'agit d'une expression, et non plus d'une simple référence à une variable

### Expressions

Toute instruction qui retourne une valeur constitue une expression : simple valeur littérale (3, « Toto »…), expression arithmétique ou booléenne, appel de fonction (même une fonction ne retournant aucune valeur exploitable : c'est-à-dire une fonction définie comme retournant Unit), déclaration d'une fonction anonyme… Ces expressions peuvent donc être utilisées pour initialiser des variables.
```
  val message = if (age < 18) "C'est un mineur !" else "Il est majeur."
  println(message)
```

### L'instruction while

L'instruction while (ou do ... while) en Kotlin, tout comme en Java, ne retourne pas d'expression. Elle s'utilise aussi comme en Java :
```
  var i = 0
  while (i < 10) {
    i += 1
    println(i)
  }

  var j = 0
  do {
     j += 1
     println(j)
  } while (j < 10)
```
Les mots-clés break et continue fonctionnent comme en Java.

### L'instruction for

Tout comme pour les boucles while (do...while), les mots-clés break et continue fonctionnent comme en Java. Mais l'utilisation de l'instruction for en Java (initialisation/condition/mise à jour accompagnée d'un bloc d'instructions) est strictement interdite en Kotlin. On ne peut utiliser la boucle for que sur des objets « iterable » :
```
  val monTableau = arrayOf(2,3,5,7,11,13)
  for (premier in monTableau) {
      println("$premier est un nombre premier")
  }
```
On peut s'affranchir des accolades si on a besoin que d'une simple expression pour la boucle for.  
  
Si l'on souhaite parcourir un tableau tout en conservant les valeurs des différents index, on peut utilise la méthode withIndex() mais avec une syntaxe un peu particulière pour les variables d'index et de valeur :
```
  val monTableau2 = arrayOf(5,80,78,1,3,16)
  for ((index, valeur) in monTableau2.withIndex()) {
      println("$index: $valeur")
  }
```

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


