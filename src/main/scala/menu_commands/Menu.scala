package menu_commands
import scala.collection.mutable.Queue

object Menu {
  val rows = 20
  val cols = 20
  
  //var players= Queue("Orange", "Magenta", "Lime", "Aqua")
  //var players= Queue("Orange", "Magenta", "Lime", "Aqua")
  //var players = new PlayerOrder(//var players = new PlayerOrder()
  
  def showGameArea : String = {
    var result = Board.show
    result += Scoreboard.show
    result += TilesRemaining.show
    result
  }
  
  def showPlayerOrder : String = {
    PlayerOrder.show 
  }
  
  def advancePlayerOrder : String = {
    PlayerOrder.advance
  }
}