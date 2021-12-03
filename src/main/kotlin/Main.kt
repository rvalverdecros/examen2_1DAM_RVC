import java.lang.Math.pow //Este import sirve para poder calcula una potencia
import kotlin.math.sqrt //Este import sirve para poder calcular la raiz cuadrada

class Punto(var id:String){ //aqui se crea la clase Punto y dentro de ella esta la id
    var x:Int = 0 //Se declara la variable x de clase Int
    var y:Int = 0 //Se declara la variable y de clase Int

    constructor(id:String, x:Int, y:Int) : this(id){
        this.x = x //Aqui es donde se Inicializara el valor x
        this.y = y //Aqui es donde se Inicializara el valor y
    }

    fun obtenerCoordenadas(){
        val(x,y)=Pair(x,y) // Crea un método llamado obtenerCoordenadas que devuelva una instancia de la clase Pair.
    }

    override fun toString(): String { //Crea un método llamado toString que devuelva un objeto de clase String
        return "$id -> [$x,$y]"
    }

    companion object{ //Con esto poodemos crear metodos estaticos
        fun ComponenteDeVector(Punto1:Punto, Punto2:Punto){ //Create un método estático (método de clase) con nombre componenteDeVector que realiza la resta entre dos puntos.
            val sumid=(Punto1.id +Punto2.id)
            val sumx = (Punto2.x - Punto1.x)
            val sumy = (Punto2.y - Punto1.y)
            val res=Punto(sumid,sumx,sumy)
            println(res)

        }

        fun distancia(Punto1: Punto, Punto2: Punto){ //Create un método estático (método de clase) con nombre distancia que obtiene la diferencia entre dos puntos.
            val sumid=(Punto1.id +Punto2.id)
            val op:Double=
                sqrt((pow((Punto2.x-Punto1.x).toDouble(),2.0))+pow((Punto2.y-Punto1.y).toDouble(),2.0))
            println(sumid)
            println(op)

        }
        fun localizacionGeograficaNS(array: ArrayList<Punto>):Map<String, MutableList<Punto>>{ //Create un método estático (método de clase) con nombre localizacionGeograficaNS que clasifica los puntos geográficamente, en Norte y Sur.
            val norte = mutableListOf<Punto>()
            val sur = mutableListOf<Punto>()
            val filtrar = mapOf("Norte" to norte, "Sur" to sur)
            for (i in 0..array.size -1){
                if (array[i].y >= 0) {
                    norte.add(array[i])
                    println("Norte")
                    println(array[i])
                } else {
                    sur.add(array[i])
                    println("Sur")
                    println(array[i])
                }
            }
            return filtrar

        }
            }
        }


fun main() {
    val uno=Punto("uno",3,2) //Valor del Primer Punto
    val dos=Punto("dos",1,3) //Valor del Segundo Punto
    //val tres = Punto.ComponenteDeVector(uno,dos) //Haciendo uso del método componenteDeVector devuelve un tercer punto.
    val cuatro=Punto("cuatro",-4,-9)
    Punto.localizacionGeograficaNS(arrayListOf(uno,dos,cuatro))
}