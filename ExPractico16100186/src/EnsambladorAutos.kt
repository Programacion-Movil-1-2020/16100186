import javafx.beans.binding.When

fun main()
{
    var miListaAutos:MutableList<Auto> = mutableListOf()
    do{

        println("\n¿Qué desea hacer?\n1.- Ensamblar auto nuevo\n2.- Ver autos ensamblados\n3.- Salir")
        var res:String? = readLine()

        if (res == "1" || res == "2" || res == "3")
        {
            when(res){
                "1" -> miListaAutos.add(ensamblarAuto())
                "2" -> verAutos(miListaAutos)
                "3" -> println("Saliendo\nCantidad de autos ensamblados total: " + miListaAutos.size)
            }
        }
        else
        {
            println("Respuesta invalida")
        }
    }while (res != "3")
}

data class Auto(val marca:String?, val modelo:String?, var caracteristicas:MutableList<String>, var caracteristicasEsp:MutableList<String>)

fun ensamblarAuto() : Auto
{
    println("¿Qué marca es el auto?")
    var marca:String? = readLine() as String

    println("¿Qué modelo es el auto?")
    var modelo:String? = readLine() as String

    var listCaracteristicas:MutableList<String> = mutableListOf()
    println("--- Caracteristicas ---\nTipo de transmision\n1.-Transmisión manual\n2.- Transmisión automática")
    var car:String? = readLine()
    if (car == "1")
    {
        listCaracteristicas.add("Transmisión manual")
    }
    else
    {
        listCaracteristicas.add("Transmisión automática")
    }

    println("Aire acondicionado\n1.-Con aire acondicionado\n2.- Sin aire acondicionado")
    car = readLine()
    if (car == "1")
    {
        listCaracteristicas.add("Con aire acondicionado")
    }
    else
    {
        listCaracteristicas.add("Sin aire acondicionado")
    }

    println("Frenos ABS\n1.-Tiene frenos ABS\n2.- No tiene frenos ABS")
    car = readLine()
    if (car == "1")
    {
        listCaracteristicas.add("Frenos ABS")
    }
    else
    {
        listCaracteristicas.add("No tiene frenos ABS")
    }

    var listCarEspeciales:MutableList<String> = mutableListOf()
    println("---Caracteristicas especiales---\n¿Tiene faros de niebla?\n1.-Si tiene faros de niebla\n2.- No tiene faros de niebla")
    var carEsp:String? = readLine()
    if (carEsp == "1")
    {
        listCarEspeciales.add("Con faros de niebla")
    }
    else
    {
        listCarEspeciales.add("Sin faros de niebla")
    }

    println("Tiene faros LED\n1.-Cuenta con faros LED\n2.-No cuenta con faros LED")
    carEsp = readLine()
    if (carEsp =="1")
    {
        listCarEspeciales.add("Con faros LED")
    }
    else
    {
        listCarEspeciales.add("Sin faros LED")
    }

    println("Asientos de piel\n1.-Cuenta con asientos de piel\n2.-No cuenta con asientos de piel")
    carEsp = readLine()
    if (carEsp =="1")
    {
        listCarEspeciales.add("Con asientos de piel")
    }
    else
    {
        listCarEspeciales.add("Sin asientos de piel")
    }

    val miAuto = Auto(marca, modelo,listCaracteristicas, listCarEspeciales)

    return miAuto
}

fun verAutos(listaAutos:MutableList<Auto>)
{
    for (auto in listaAutos)
    {
        println("\nMarca: " + auto.marca)
        println("\nModelo: " + auto.modelo)
        println("\nCaracteristicas: " + auto.caracteristicas)
        println("\nCaracteristicas especiales: " + auto.caracteristicasEsp)
    }

    println("La cantidad de autos en la lista es de: " + listaAutos.size)
}