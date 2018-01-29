package menu_commands

object Scoreboard {
  
  def show ={
    var result = "Scores:\n"
    for (p <- PlayerOrder){
      result += p.name + " = " + p.score + ", "
    }
    result.substring(0, result.length-2)+"\n\n"
  }
}