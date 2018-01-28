package menu_commands

object Board {
  var rows = 20
  var cols = 20
  
  var cells = Array.ofDim[Cell](rows,cols)
  for (i <- 0 until rows){
    for (j <- 0 until cols){
      cells(i)(j) = new Cell
    }    
  }
  
  def show = {
      var result = "Board:\n"
      for (i <- 0 until rows){
        for (j <- 0 until cols){
          result += cells(i)(j).show
        }    
        result += "\n"
      }
      result += "\n"
      result
  }
}