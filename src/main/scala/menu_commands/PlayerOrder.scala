package menu_commands

object PlayerOrder extends scala.collection.mutable.Queue[Player]{
  this.enqueue(new Player("Orange"))
  this.enqueue(new Player("Magenta"))
  this.enqueue(new Player("Lime"))
  this.enqueue(new Player("Aqua"))

  def show : String = {
    var result = ""    
    for (p <- this.toArray) 
      result = result + p.name + ", "
    result.substring(0, result.length-2)  
  }  
  
  def advance : String = {
    this += this.dequeue()
    this.show
  }
  
}