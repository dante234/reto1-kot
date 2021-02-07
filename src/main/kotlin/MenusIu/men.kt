package MenusIu

import sun.plugin2.main.server.WindowsHelper
val receta = mutableMapOf<String?, Any>()
public fun iuMenu(){
    val ing = arrayListOf<String>("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
    var reciP : MutableList<String?> = mutableListOf()
    do {

    var nombre : String = ""

        System.out.println("SELECIONE UNA OPCION")
        System.out.println("1.- VER INGREDIENTES ")
        System.out.println("2.- GUARDAR RECETA")
        System.out.println("3.- SALIR")

        var response:String? = readLine()
        if(response.equals("")){
            response = "1"
        }
        val opti = response?.toInt()

        when(opti){
            1 -> {
                do{

                for ((index,i) in ing.withIndex()){
                    println("$index.- $i")
                }
                var response2:String? = readLine()
                if(response2.equals("")){
                    response2 = "1"
                }
                val opti2 = response2?.toInt()
                when(opti2) {

                            1 -> { reciP.add("Leche")
                            println("leche añadido")
                            }
                            2 -> reciP.add("Carne")
                            3 -> reciP.add("Verduras")
                            4 -> reciP.add("Frutas")
                            5 -> reciP.add("Cereal")
                            6 -> reciP.add("Huevos")
                            7 -> reciP.add("Aceite")
                         else -> println("SELECCIONE UNA OPCION DEL 1 AL 7 0 es para salir")
                }

            }while (opti2 != 0)}
            2 -> {
                println("Recesta para guardar")
                println("nombre de la receta")
                nombre = readLine().toString()
                receta.put(nombre,reciP)
             println(receta)
            }
            else -> println("SELECCIONE UNA OPCION DEL 1 AL 3")
        }


    }while(opti != 3)

    reciP = mutableListOf()
}
public fun iuVer(){
    do {
        System.out.println("SELECCIONE UN OPCION")
        System.out.println("1.- VER RECETAS GUARDADAS")
        System.out.println("2.- SALIR")

        var response:String? = readLine()
        if(response.equals("")){
            response = "1"
        }
        val opti = response?.toInt()

        when(opti){
            1 -> println(receta)
            else -> println("SELECCIONE UNA OPCION DEL 1 AL 2")
        }

    }while(opti != 2)
}