import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){

    println("Empiezo main_isla_desierta")

    GlobalScope.launch{

        println("Corrutina a dormir")
        delay(1000)
        println("Corrutina despierta")

    }

    println("Main sigue")
    Thread.sleep(2000)
    println("Termina")

}