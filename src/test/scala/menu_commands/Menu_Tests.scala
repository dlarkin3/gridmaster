package menu_commands

import org.scalatest.FunSpec
import org.scalatest.Matchers


class Menu_Test extends FunSpec with Matchers {
  
   describe("The GridMaster Simulation") {
    describe("has a menu") {
      
      //******* SHOW GAME AREA *******
      it("can show the game area, including the 20 x 20 board, player scores, and tiles in each player's hand") {

        val expectedResult = 
            "Board:\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "[ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ][ ]\n" +
            "\n" +
            "Scores:\n" +
            "Orange = 0, Magenta = 0, Lime = 0, Aqua = 0\n" +
            "\n" +
            "Tiles In Hand:\n" +
            "Orange = 100, Magenta = 100, Lime = 100, Aqua = 100\n"
            
        Menu.showGameArea should be(expectedResult)
      }   
      
      //******* SHOW PLAYER ORDER *******
      it("can show the player order") {     
        val expectedResult = "Orange, Magenta, Lime, Aqua"
        Menu.showPlayerOrder should be(expectedResult)  
      }

      //******* ADVANCE ORDER *******
      it("can advance the player order") {     
        val expectedResult_0_advances = "Orange, Magenta, Lime, Aqua"
        val expectedResult_1_advances = "Magenta, Lime, Aqua, Orange"
        val expectedResult_2_advances = "Lime, Aqua, Orange, Magenta"        
        val expectedResult_4_advances = "Orange, Magenta, Lime, Aqua"
        
        Menu.showPlayerOrder should be(expectedResult_0_advances)  
        
        Menu.advancePlayerOrder should be(expectedResult_1_advances)  
        
        Menu.advancePlayerOrder 
        Menu.showPlayerOrder should be(expectedResult_2_advances)
        
        Menu.advancePlayerOrder   // 3 advances
        
        Menu.advancePlayerOrder
        Menu.showPlayerOrder should be(expectedResult_4_advances)
        Menu.showPlayerOrder should be(expectedResult_0_advances)
      }
      
      
    }
  }
}