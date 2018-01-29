package menu_commands

object TilesRemaining {

  def show ={
    var result = "Tiles In Hand:\n"
    for (p <- PlayerOrder){
      result += p.name + " = " + p.tiles + ", "
    }
    result.substring(0, result.length-2)+"\n"
  }
}