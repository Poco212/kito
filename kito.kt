import kotlin.math.PI
import kotlin.math.pow


fun main() {

//debit per detik
var debit = 200.0 

// diameter
val diameter = 4.0    

//tinggi
val tinggi = 6.0 
 
//radius
val radius = diameter / 2

// volume torrent M3
val torent = PI * radius.pow(2) * tinggi

//konversi M3 ke ML
val torent_ml = torent * 1000000

//total waktu
var waktu = 0.0 //detik

//total air
var air = 0

while ( air ) {
 
 // 5 menit sekali dikali 2
 if ( waktu %300 == 0 ) {
debit *= 2
 }



}

println (torent_ml)

}