fun main(){
    var listaPC: MutableList<PC> = mutableListOf()
    TerminarCiclo@ do{

        println("""¿Que desea hacer? 
1.- Armar un nuevo equipo
2.- Ver equipos armados
3.- Salir""".trimMargin())
        var resp: String? = readLine()

         when (resp){
             "1"       -> {
                 var Procesador: String = ""
                 var MemoriaRam: String = ""
                 var DiscoDuro: String = ""
                 var TarjetaGrafica: String = ""
                 println("¿Que procesador quiere? \n1.-Intel Core i3 \n2.-Intel Core i5 \n3.-Intel Core i7");
                 var proc: String? = readLine()
                 when (proc){
                     "1"    -> Procesador = "Intel Core i3"
                     "2"    -> Procesador = "Intel Core i5"
                     "3"    -> Procesador = "Intel Core i7"
                 }

                 println("¿Cuanta memoria RAM quiere? \n1.-4GB \n2.-8GB \n3.-16GB");
                 var memr: String? = readLine()
                 when (memr){
                     "1"    -> MemoriaRam = "4GB RAM"
                     "2"    -> MemoriaRam = "8GB RAM"
                     "3"    -> MemoriaRam = "16GB RAM"
                 }

                 println("¿Que tanto almacenamiento quiere? \n1.-500GB \n2.-1TB \n3.-2TB");
                 var disc: String? = readLine()
                 when (disc){
                     "1"    -> DiscoDuro = "500GB Almacenamiento"
                     "2"    -> DiscoDuro = "1TB Almacenamiento"
                     "3"    -> DiscoDuro = "2TB Almacenamiento"
                 }

                 println("¿Que Tarjeta Gráfica desea? \n1.-NVidia GTX 1050  \n2.-NVidia GTX 1060 \n3.-NVidia GTX 1080");
                 var tarj: String? = readLine()
                 when (tarj){
                     "1"    -> TarjetaGrafica = "NVidia GTX 1050"
                     "2"    -> TarjetaGrafica = "NVidia GTX 1060"
                     "3"    -> TarjetaGrafica = "NVidia GTX 1080"
                 }

                 val PC = PC(Procesador, MemoriaRam, DiscoDuro, TarjetaGrafica)
                 listaPC.add(PC)
             }
             "2"       -> {
                 if (listaPC.none()){
                     println("No ha creado ninguna computadora")
                 } else{
                     var c:Int = 0
                     for (pc in listaPC){
                         c++
                         println("\nComputadora " +c +"\nProcesador: "+pc.Procesador+"\nMemoria RAM: "+pc.MemoriaRam
                                 +"\nAlmacenamiento: "+pc.DiscoDuro+"\nTarjeta gráfica: "+pc.TarjetaGrafica)
                     }
                 }
             }
             "3"    ->  break@TerminarCiclo;
        }
    }while (resp != "3")
}
