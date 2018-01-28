package menu_commands

class Tile (color : Char, number : Int) {
  def show = {
    var result = color.toString()+number.toString()
    if (result.length < 3){
      result = " "  
    }
    result
  }
}