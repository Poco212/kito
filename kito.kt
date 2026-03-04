import kotlin.math.PI
import kotlin.math.pow


fun main() {

//debit per detik
var debit = 200.0 

// diameter
val diameter = 4.0    

//tinggi
val tinggi = 6.0 

//total waktu
var waktu = 0.0 //detik 

//radius
val radius = diameter / 2

// volume torrent
val torent = PI * radius.pow(2) * tinggi

println (torent)



}