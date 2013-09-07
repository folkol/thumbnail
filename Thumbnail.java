import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;


public class Thumbnail {
    public static void main(String[] args) throws Exception {
        BufferedImage read = ImageIO.read(new File(args[0]));
        int thumb_width = read.getWidth();
        int thumb_height = read.getHeight();
        BufferedImage bufferedImage = new BufferedImage(thumb_width, thumb_height, read.getType());
        Graphics graphics = bufferedImage.getGraphics();
        graphics.drawImage(read, 0, 0, thumb_width, thumb_height, null);
        graphics.dispose();
        ImageIO.write(bufferedImage, "jpg", new File("thumb.jpg"));
    }
}
