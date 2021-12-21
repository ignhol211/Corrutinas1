import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

class Amigo (nombre:String) {

    val hacha = Mutex()
    val hamaca = Mutex()

    private var nombre: String

    init {
        this.nombre = nombre
    }

    fun fabricarBalsa(){

    }

    fun recogerComida(){
    }

    fun recogerAgua(){

        GlobalScope.launch{
            println("El "+nombre+" ha ido a recoger agua")
            delay(4000)
        }

    }

    suspend fun descansar(tiempo:Long){
        hamaca.withLock {
            println(nombre+ " ha empezado a usar la hamaca")
            delay(tiempo)
            println(nombre+ " ha dejado de usar la hamaca")

        }
    }

}