/*;
 * Created :  By Ahmed Seada.

 */
package empolyeewithtable;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author ahmed
 */
public class EmpolyeeWithTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       form1 f=new form1();
       f.setVisible(true);
       f.setLocationRelativeTo(null);
       Image img =ImageIO.read(EmpolyeeWithTable.class.getResource("emp.png"));
       f.setIconImage(img);
     
         f.setTitle("Employees Regsetration");
       
}
}
