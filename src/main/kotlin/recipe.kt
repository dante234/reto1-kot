import MenusIu.iuMenu
import MenusIu.iuVer

fun main(args : Array <String>){
    do {
       System.out.println("SELECIONE UNA OPCION")
        System.out.println("1.- HACER UNA RECETA")
        System.out.println("2.- VER MIS RECETAS")
        System.out.println("3.- SALIR")

        var response:String? = readLine()
        if(response.equals("")){
            response = "1"
        }
        val opti = response?.toInt()

        when(opti){
            1  -> iuMenu()
            2  -> iuVer()
            3  -> print("""SALIENDO.........
               |GRACIAS POR USAR NUETRO SISTEMA
           """.trimMargin())
            else -> print("un nuemro del 1 al 3 por favor")
       }
    }while (opti != 3)

}

