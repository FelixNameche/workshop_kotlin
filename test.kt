/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    
    val nom:String = "Toto"
	// nom = "Dodo" // Interdit !!! Car nom a été déclaré avec val
	var age = 10
	age += 12 // aucun problème car age est altérable.
    
    //println(nom)
    //println(age)
    
    for (i in 3..7){
        //println(i)
    } // Affiche les chiffres de 3 à 7 sur plusieurs lignes.

    for (i in 10 downTo 0) {
        //println(i)
    } // Compte à rebours de 10 à 0, sur plusieurs lignes.
    
    for (i in 2..36 step 3) {
        //println(i)
    } // Affiche les nombres 2,5,8,…,35
    
    for (i in 36 downTo 2 step 3) {
    	//println(i) 
	} // Affiche les nombres 36,33,…,3
    
    val tableau1 = arrayOf(2,10,-1,4,9)
	val tableau2 = Array(10, { i -> i * 2 })
    //tableau1[0] = 99
    
	//tableau1.forEach { println(it) }
    //tableau2.forEach { println(it) }
    
    val tab = arrayOf(7,10,15,3,6,9,12)
    
    //println(tab.sum())
    //println(tab.reversed())
    //println(tab.min())
    //println(tab.max())
    //println(tab.first())
    //println(tab.last())
    //println(tab.take(3)) // les 3 premiers éléments du tableau
    //println(tab.drop(3)) // le tableau sans ses 3 premiers éléments
    
      val a = 10
      val b = 6
      val c = "abc"
      //println("[$a, ${b*2}, $c]")
      
        val message = if (age < 18) "C'est un mineur !" else "Il est majeur."
        //println(message)

        var i = 0
    		while (i < 10) {
      			i += 1
      			//println(i)
    		}

    	var j = 0
    		do {
       			j += 1
       			//println(j)
    		} while (j < 10)
    
        val monTableau = arrayOf(2,3,5,7,11,13)
    		for (premier in monTableau) {
        		//println("$premier est un nombre premier")
    		}
    
    val monTableau2 = arrayOf(5,80,78,1,3,16)
		for ((index, valeur) in monTableau2.withIndex()) {
   			//println("$index: $valeur")
		}
}