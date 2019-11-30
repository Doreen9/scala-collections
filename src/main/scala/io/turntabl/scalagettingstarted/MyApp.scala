package io.turntabl.scalagettingstarted


object MyApp extends App {

    val details = ("Doreen", "Scala")

    var (name, language) = details

    val favorite = Map(
        "South Korea" -> "Seoul",
        "USA" -> "Washington DC",
        "France" -> "Paris"
    )


   favorite + ("Ghana" -> "Accra", "Russia" -> "Moscow")

   print(favorite.getOrElse("Norway", "Unknown"))

   val friends = Set("Christiana", "Yaa", "Franklin", "Samuel", "Samuel")

   print(friends.count(_ == "Samuel"))

   List("David", "Doreen","Christiana", "Yaa", "Franklin", "Samuel") foreach(println)

   List("David", "Doreen","Christiana", "Yaa", "Franklin", "Samuel") foreach(n => if(n.length > 6) println(n))

   print(List("David", "Doreen","Christiana", "Yaa", "Franklin", "Samuel") count(_.length > 6))




}
