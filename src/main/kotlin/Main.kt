import java.lang.NullPointerException

fun main(args: Array<String>) {

////    ********ESTRUCTURA IF*********
//    val nombre = "Bastian";
//    if (nombre.isNotEmpty()){
//        println("El largo de nuestra variable es ${nombre.length}")
//    }else{
//        println("Error. la variable esta vacía")
//    }
//
//
////    var mensaje : String;
////    if (nombre.length>4){
////        mensaje = "Tu nombre es largo";
////    }else{
////        mensaje = "Tienes un nombre corto";
////
////    ES LO MISMO DE ARRIBA PERO MÁS LEGIBLE
//
//    val mensaje : String = if (nombre.length > 4){
//        "Tu nombre es largo";
//    } else if(nombre.isEmpty()){
//        "Nombre esta vacío"
//    }
//    else{
//        "Tienes un nombre corto";
//    }
//
//    //SE CREA LA VARIABLE "MENSAJE2" Y DENTRO SE CREA LA CONDICION IF Y SEGUN EL TAMAÑO
//    //DEL NOMBRE SE LE ASIGNARA UN MENSANSAJE A LA VARIABLE "MENSAJE2"
//    val mensaje2 = if (nombre.length>5){
//        //SI EL VALOR DE LA VARIABLE NOMBRE ES MAYOR A 5 CARACTERES.
//        // A LA VARIABLE "MENSAJE2" SE LE ENTREGA EL VALOR "EL NOMBRE ES MUY LARGO"
//        "EL NOMBRE ES MUY LARGO. Y EL NOMBRE ES: $nombre";
//    } else if(nombre.isEmpty()){
//        //SI EL VALOR DE LA VARIABLE NOMBRE ESTA VACÍO.
//        //SE LE ASIGNA EL VALOR "DEBES INGRESAR UN NOMBRE" A LA VARIABLE MENSAJE2
//        "DEBES INGRESAR UN NOMBRE";
//    }
//    else{
//        //DE LO CONTRARIO. SI LA VARIABLE NOMBRE ES MENOR A 5 CARACTERES.
//        //MOSTRARA EL VALOR DE LA VARIABLE NOMBRE Y DIRÁ QUE ES CORTO.
//        "TU NOMBRE ES CORTO. Y EL NOMBRE ES: $nombre";
//    }
//
//    println(mensaje)
//    println(mensaje2);
//    println("\n")
//
//
//
//    //********ESTRUCTURA WHEN******
//    val nombreColor = "Amarillo";
//
//    when(nombreColor){
//        "Amarillo" -> {
//            println("El amarillo es el color de la alegría")
//        }
//        "Rojo","Carmesí" -> {
//            println("El rojo simboliza el calor")
//        }
//        else ->{
//            println("Error. No tengo registros de este color.")
//        }
//    }
//
//    val code = 404
//    when(code){
////        LOS RANGOS SE INDICAN CON DOS PUNTOS '..'
//        in 200..299 -> {
//            println("Todo esta bien")
//        }
//        in 400..500 ->{
//            println("algo ha fallado")
//        }
//        else ->{
//            println("Codigo desconocido")
//        }
//    }
//
//    val tallaDeZapatos = 50;
//    val mensaje3 = when (tallaDeZapatos){
////    SI SE LE ASIGNA UN VALOR A UNA VARIABLE CON UN WHEN, SE DEBE UTILIZAR ELSE. SINO INDICA ERROR
//        41,43 -> "Tenemos disponibles"
//        42,44 -> "Pocas unidades"
//        45 -> "No hay disponibles"
//        else -> "Estos números no existe."
//    }
//    println(mensaje3);
//
//    //*** WHILE Y DO WHILE***
//
//    var contador = 10;
//    while(contador > 0){
//        println("el valor de contador es: $contador");
//        contador--
//    }
//
//    do {
//        println("Generando numero aleatorio...")
//        val numeroAleatorio = (0..100).random();
//        println("El numero generado es $numeroAleatorio")
//    }while (numeroAleatorio > 50)
//
//    println("\n\n")
//
////    **FOR**
//    println("***CICLO FOR***");
//    var listaDeFruta = listOf("manzana", "pera", "durazno", "uva")
//    for (fruta in listaDeFruta){
//        println("Hoy comere una fruta llamada: $fruta")
//    }
//
////  **FOREACH**
//    listaDeFruta.forEach{fruta -> println("La fruta es: $fruta") }
//
////  **MAP**
//    val caracteresDeFruta: List<Int> = listaDeFruta.map { fruta -> fruta.length }
//    println(caracteresDeFruta)
//
//    println("Lista de frutas map")
//    val listaDeFrutasMap = listaDeFruta.map { f -> println("Fruta: $f") }
//    println(listaDeFrutasMap)
//
////  **FILTER**
//    val listaFiltrada = caracteresDeFruta.filter { frutaCaracter -> frutaCaracter > 5 }
//    println(listaFiltrada)
    var nombre : String? = null;
    try {
        nombre!!.length
    }catch (exception: NullPointerException){
        println("ERROR.")
    }finally {
        println("Ha ocurrido un error. Cerrando aplicacion.")
    }
}


