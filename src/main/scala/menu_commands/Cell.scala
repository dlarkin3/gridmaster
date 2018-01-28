package menu_commands

class Cell {
  var tile : Option[Tile] = None
  
  def show = {
    tile match{
      case Some(tile) => tile.show
      case None => "[ ]"
    }    
  }
}