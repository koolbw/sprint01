import java.util.Scanner

val theBoard: MutableMap<Int, Char> = mutableMapOf(1 to ' ', 2 to ' ', 3 to ' ', 4  to ' ', 5 to ' ', 6 to ' ', 7 to ' ', 8 to ' ', 9 to ' ')

fun main() {

   var turn = 'X'
   var count = 0
   val reader = Scanner(System.`in`)

   printBoard()
   
   for (i in 1..10) {
        print("It's your turn $turn. Move to which place? ")
        var move:Int = reader.nextInt()

        if (theBoard[move] == ' ') {
         theBoard.put(move, turn)
         count += 1
        }
        else {
           println("That place is already filled.")
        }
      //   println("You placed it in $move. ")
      //   val square = theBoard[move] 
      //   println("$square")
        printBoard()

        if (turn == 'X') {
           turn = 'O'
        }
        else {
           turn = 'X'
        }

    }

}

//This function will print the updated board after each move. 
fun printBoard() {
   val one = theBoard[1]
   val two = theBoard[2]
   val three = theBoard[3]
   val four = theBoard[4]
   val five = theBoard[5]
   val six = theBoard[6]
   val seven = theBoard[7]
   val eight = theBoard[8]
   val nine = theBoard[9]

   println("$seven|$eight|$nine")
   println("-+-+-")
   println("$four|$five|$six")
   println("-+-+-")
   println("$one|$two|$three")
}