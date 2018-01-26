package menu_commands
import scala.collection.mutable.Queue

object Menu {
  val rows = 20
  val cols = 20
  
  var players= Queue("Orange", "Magenta", "Lime", "Aqua")
  
  def showGameArea : String = {
            var board = "Board:\n"
            for (i <- 0 until rows) {
              for (j <- 0 until cols) {
                board += "[ ]"
              }
              board += "\n"
            }
            board += "\n" +
            "Scores:\n" +
            "Orange = 0, Magenta = 0, Lime = 0, Aqua = 0\n" +
            "\n" +
            "Tiles In Hand:\n" +
            "Orange = 100, Magenta = 100, Lime = 100, Aqua = 100\n"
            return board
  }
  
  def showPlayerOrder : String = {
    var result = ""    
    for (p <- players.toArray) 
      result = result + p + ", "
    result.substring(0, result.length-2)  
  }
  
  def advancePlayerOrder : String = {
    players += players.dequeue()
    showPlayerOrder
  }
}