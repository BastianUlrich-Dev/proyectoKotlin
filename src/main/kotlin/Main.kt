import java.lang.Exception
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
//    var nombre : String? = null;
//    try {
//        throw NullPointerException("Ha ocurrido un error");
//
//    }catch (exception: NullPointerException){
//        println("ERROR.")
//    }finally {
//        println("Ha ocurrido un error. Cerrando aplicacion.")
//    }
//
//    val primerValor = 10;
//    val segundoValor = 0;
//
//    val resultado : Int = try {
//        primerValor / segundoValor
//    }catch (e: Exception){
//        0
//    }
//
//    println(resultado)

//    ***OPERADOR ELVIS***
//        var nombre : String? = null;
//        val caracteresDeNombre : Int = nombre?.length ?: 0
//        println(caracteresDeNombre)

//    **LISTOF**
//    lista inmutable
//    val listaDeNombre = listOf("Bastian","Enrique","Camila")
//    println(listaDeNombre)
//
////    lista mutable
//    val listaVacia = mutableListOf<String>()
//    println(listaVacia);
//
//    listaVacia.add("Bastian")
//    println(listaVacia)
//
////    obtener datos de la lista con get
//    val valorUsandoGet = listaVacia.get(0)
//    println(valorUsandoGet)
//
////    obtener datos mediante operador de index
//    val valorUsandoOperador = listaVacia[0]
//    println(valorUsandoOperador)
//
////    obtener el primer valor con operador first
//    val primerValor: String? = listaDeNombre.firstOrNull()
//    println(primerValor)
//
//    listaVacia.removeAt(0)
//    println(listaVacia)
//
//    listaVacia.add("Pedro")
//    println(listaVacia)
//    listaVacia.removeIf{caracteres -> caracteres.length>3}
//    println(listaVacia)
//
//    val myArray = arrayOf(1,2,3,4,)
//    println("Mi array ${myArray.toList()}")

////    ORDENAR LISTAS
//    val numerosDeLoteria = listOf(11,22,43,56,78,66)
//
//    val numerosSorted = numerosDeLoteria.sorted()
//    println(numerosSorted)
//
//    val numerosDeLoteriaDescendientes = numerosDeLoteria.sortedDescending()
//    println(numerosDeLoteriaDescendientes)
//
//    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
//    println(ordenarPorMultiplos)
//
////    lista random
//    val numerosAleatorios = numerosDeLoteria.shuffled()
//    println(numerosAleatorios)
//
////    lista inversa
//    val numerosEnReversa = numerosDeLoteria.reversed()
//    println(numerosEnReversa)
//
//    val mensajesDeNumeros = numerosDeLoteria.map { numero -> "Tu numero de loteria es: $numero" }
//    println(mensajesDeNumeros)
//
//    val numerosFiltrados = numerosDeLoteria.filter { numero -> numero > 50 }
//    println(numerosFiltrados)

////    ***MAPS***
//    val edadSuperheroes = mapOf(
//        "Ironman" to 35,
//        "Spiderman" to 23,
//        "Capitan America" to 99
//    )
//    println(edadSuperheroes)
//
//    val edadSuperHeroesMutable = mutableMapOf(
//        "Ironman" to 35,
//        "Spiderman" to 23,
//        "Capitan America" to 99
//    )
//
//    println(edadSuperHeroesMutable)
//
//    edadSuperHeroesMutable.put("wolverine", 45)
//    println(edadSuperHeroesMutable)
//
//    edadSuperHeroesMutable["Storm"] = 30
//
//    println(edadSuperHeroesMutable)
//
//    val edadIronman = edadSuperHeroesMutable["Ironman"]
//
//    println(edadIronman)
//
//    edadSuperHeroesMutable.remove("wolverine")
//    println(edadSuperHeroesMutable)
//
////  Muestra solo las keys
//    println(edadSuperHeroesMutable.keys)
////  Muestra solo los valores
//    println(edadSuperHeroesMutable.values)

//    ***SETS***
//    Para eliminar duplicados
//    INMUTABLE
//    val vocalesRepetidas = setOf("a","e","i","o","u","a","e","i","o","u");
//    println(vocalesRepetidas)
//
////    MUTABLE
//    val numeroFavoritos = mutableSetOf(1,2,3,4)
//    println(numeroFavoritos)
//    numeroFavoritos.add(5)
//    numeroFavoritos.add(5)
//    numeroFavoritos.add(5)
//    println(numeroFavoritos)
////    ELIMINAR ELEMENTOS
////    SE LE ENTREGA EL VALOR. NO EL ID O LA KEY.
//    numeroFavoritos.remove(5)
//    println(numeroFavoritos)
//
//
//    val valoresDelSet: Int? = numeroFavoritos.firstOrNull(){numero -> numero > 2}
//    println(valoresDelSet)

////    ***FUNCIONES***
//
//    val fraseAleatoria = "En platzi nunca se para de aprender.".randomCase()
//    imprimirFrase(fraseAleatoria)

//    imprimirNombre(nombre = "Bastian",apellido = "Jorquera")


//    ***LAMBDAS***
//
//    val myLambda : (String) -> Int = {valor -> valor.length}
//    val lambdaEjecutada = myLambda("Hola mundo");
//    println(lambdaEjecutada)
//
//    val saludos = listOf("hola","hello")
//    val longitud = saludos.map(myLambda)
//    println(longitud)

////    ***FUNCION LET***
//    var nombre : String? = null
//    nombre?.let{
//        valor -> println("El nombre no es nulo. es $valor")
//    }
//    nombre = "Bastian"
//    nombre?.let {
//        valor -> println("El nombre no es nulo, es $valor")
//    }

//    ***FUNCION WIDTH***
        val colores = listOf("azul","amarillo","rojo")
    with(colores){
        println("Nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores de $size")
    }

}


//FUNCIONES
fun imprimirFrase(frase: String) : Unit {
    println("tu fase es: $frase")
}
fun String.randomCase() : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random();
    return if (resultadoAleatorio.rem(2) == 0) {
        this.uppercase()
    }else{
        this.lowercase()
    }
}

//TIPOS DE PARÁMETROS PARA FUNCIONES
fun imprimirNombre(nombre: String, segundoNombre: String = "", apellido: String){
    println("Mi nombre completo es: $nombre $segundoNombre $apellido")
}


