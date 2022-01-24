import java.util.Scanner

val theBoard: MutableMap<Int, Char> = mutableMapOf(1 to ' ', 2 to ' ', 3 to ' ', 4  to ' ', 5 to ' ', 6 to ' ', 7 to ' ', 8 to ' ', 9 to ' ')

fun main() {

   var turn = 'X'
   var count = 0
   val reader = Scanner(System.`in`)

   
   for (i in 1..10) {

        printBoard()
        print("It's your turn $turn. Move to which place? ")
        var move:Int = reader.nextInt()

        if (theBoard[move] == ' ') {
         theBoard.put(move, turn)
         count += 1
        }
        else {
           println("That place is already filled. Move to which place?")
           continue
        }

      //   println("You placed it in $move. ")
      //   val square = theBoard[move] 
      //   println("$square")

         if (count >= 5) {
            val one = theBoard[1]
            val two = theBoard[2]
            val three = theBoard[3]
            val four = theBoard[4]
            val five = theBoard[5]
            val six = theBoard[6]
            val seven = theBoard[7]
            val eight = theBoard[8]
            val nine = theBoard[9]

            //Across the top
            if (seven != ' ' && eight != ' ' && nine != ' ') {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Across the middle
            else if (four != ' ' && five != ' ' && six != ' ') {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Across the bottom
            else if (one != ' ' && two != ' ' && three != ' ') {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Down the left
            else if (seven != ' ' && four != ' ' && one != ' ') {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Down the middle
            else if (eight != ' ' && five != ' ' && two != ' ') {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Down the right
            else if (nine != ' ' && six != ' ' && three != ' ') {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Diagonal
            else if (seven != ' ' && five != ' ' && three != ' ') {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Diagonal
            else if (one != ' ' && five != ' ' && nine != ' ') {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
         }

         if (count == 9) {
            println("Game Over.")
            println("It's a Tie!!")
         }

      //   printBoard()

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