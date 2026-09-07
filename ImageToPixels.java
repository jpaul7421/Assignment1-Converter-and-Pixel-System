import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageToPixels {
    public static void main(String[] args) {
        try {
            BufferedImage image =
                    ImageIO.read(new File("smiley.png"));

            int width = image.getWidth();
            int height = image.getHeight();

            System.out.println("Image width: " + width);
            System.out.println("Image height: " + height);
            System.out.println("Pixel values:");

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    Color color =
                            new Color(image.getRGB(x, y));

                    System.out.println(
                            "(" + x + ", " + y + "): "
                                    + "RGB("
                                    + color.getRed() + ", "
                                    + color.getGreen() + ", "
                                    + color.getBlue() + ")"
                    );
                }
            }
        } catch (Exception exception) {
            System.out.println(
                    "Unable to read the image."
            );
        }
    }
}