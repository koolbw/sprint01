import java.util.Scanner

//Initializing the map needed to store the moves on the board
val theBoard: MutableMap<Int, Char> = mutableMapOf(1 to ' ', 2 to ' ', 3 to ' ', 4  to ' ', 5 to ' ', 6 to ' ', 7 to ' ', 8 to ' ', 9 to ' ')

fun main() {

   //Initializing the variables for the game
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

            //Grab the values for the board
            val one = theBoard[1]
            val two = theBoard[2]
            val three = theBoard[3]
            val four = theBoard[4]
            val five = theBoard[5]
            val six = theBoard[6]
            val seven = theBoard[7]
            val eight = theBoard[8]
            val nine = theBoard[9]

            //We will now check for the winner

            //Across the top
            if (seven == eight && eight == nine && seven != ' ') {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Across the middle
            else if (four == five && five == six) {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Across the bottom
            else if (one == two && two == three) {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Down the left
            else if (one == four && four == seven) {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Down the middle
            else if (two == five && five == eight) {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Down the right
            else if (three == six && six == nine) {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Diagonal
            else if (seven == five && five == three) {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
            //Diagonal
            else if (one == five && five == nine) {
               printBoard()
               println("Game Over.")
               println("**** $turn won. ****")
               break
            }
         }

         //If the board is filled it will end the game
         if (count == 9) {
            println("Game Over.")
            println("It's a Tie!!")
            break
         }

      //   printBoard()


        //Switches between players
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