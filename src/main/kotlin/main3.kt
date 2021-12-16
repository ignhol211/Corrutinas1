import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.atomic.AtomicInteger

fun main(){

    println("Empiezo main3")

    runBlocking {
        println("Entro en el blocking")
        println("Lanzo corrutina")
        launch{
            delay(1000)
            println("Corrutina despierta")
        }
    }

    println("Main3 sigue")
    println("Termina main3")

}