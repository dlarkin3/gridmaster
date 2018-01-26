package gridmaster

import menu_commands._

object Main {
   def main(args: Array[String]): Unit = {
     println("Use me to test your objects and methods!  :)")     
     println(Menu.showPlayerOrder)
     Menu.advancePlayerOrder 
     println(Menu.showPlayerOrder)
   }
}