fun main() {
    menu()
}

fun menu() {
    LimpiarPantalla()
    println(inicio())
    val num: String? = readLine()
    loop@ do {
        when (num) {
            "1" -> {
                LimpiarPantalla()
                makeRecipe()
                break@loop
            }
            "2" -> {
                LimpiarPantalla()
                viewRecipe()
                break@loop
            }
            "3" -> println("Hasta luego")
            else -> println("Opción no válida")
        }
    } while (num?.toInt() != 3)
}

fun makeRecipe() {
    val make = """
        Hacer receta
        Selecciona por categoría el ingrediente que buscas
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceites
        
        0. Regresar
    """.trimIndent()

    do {
        println(make)
        val makeNum: String? = readLine()
        if (makeNum == "0") {
            menu()
            break
        }
    } while (makeNum?.toInt() == 0)
}


fun viewRecipe() {
    val view = """
        Ver mis recetas
        
        0. Regresar
    """.trimIndent()
    do {
        println(view)
        val viewNum: String? = readLine()
        if (viewNum == "0") {
            menu()
            break
        }
    } while (viewNum?.toInt() == 0)
}

fun inicio() {
    val menu: String = """
        **************************************
        *    Selecciona la opción deseada    *
        **************************************
        *                                    *
        *   1. Hacer una receta              *
        *   2. Ver mis recetas               *
        *   3. Salir                         *
        *                                    *
        **************************************
    """.trimIndent()
    println(menu)
}

fun LimpiarPantalla() {
    println()
    println()
    println()
    println()
    println()
    println()
    println()
    println()
    println()
    println()
    println()
    println()
}