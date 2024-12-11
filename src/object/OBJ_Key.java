package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Key extends SuperObject{
    public  OBJ_Key(){
        name="Key";
        collision = false;
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/key.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
