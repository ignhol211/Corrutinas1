import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){

    println("Empiezo main2")
    corrutinaEnFuncion("Saludos!")
    println("Main2 sigue")
    Thread.sleep(2000)
    println("Termina main2")

}

fun corrutinaEnFuncion(cadena:String){
    GlobalScope.launch{

        println("Corrutina te saluda: $cadena")
        delay(1000)
        println("Corrutina despierta")

    }
}