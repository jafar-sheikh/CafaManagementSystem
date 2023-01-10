/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comand;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Babul
 */
public class Open {
     public static void openbyid(String id1){
      try {
          if((new File("E:" +"bill.pdf")).exists()){
          Process p = Runtime
                  .getRuntime()
                  .exec("rundll32 url.dll,FileProtocolHandler E:" +"bill.pdf");
          
          }
          else{
          JOptionPane.showMessageDialog(null, "File is not found");
          }
      } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
      }
  }
    
}
