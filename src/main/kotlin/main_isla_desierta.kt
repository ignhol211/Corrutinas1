import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex

const val CUBOS_NECESARIOS = 4
const val LENA_NECESARIA  = 2
const val RAMA_NECESARIA  = 1
const val COMIDA_NECESARIA  = 1

fun main(){

    var cubosActuales = 0
    var lenaActual = 0
    var ramasActuales = 0
    var comidaActual = 0

    var amigoA = Amigo ("Pepe")
    var amigoB = Amigo ("Ana")
    var amigoC = Amigo ("Juan")
    
    runBlocking {
        amigoA.recogerAgua()
        amigoA.descansar(1000)
        cubosActuales++
    }



}
