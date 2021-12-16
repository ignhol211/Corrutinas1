import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

const val CUBOS_NECESARIOS = 4
const val LENA_NECESARIA  = 2
const val RAMA_NECESARIA  = 1
const val COMIDA_NECESARIA  = 1

fun main(){
    var cubosActuales = 0
    var lenaActual = 0
    var ramasActuales = 0
    var comidaActual = 0

    

    runBlocking {
        comenzar()
    }

}

fun comenzar() {
    TODO("Not yet implemented")
}
