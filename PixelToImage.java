import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class PixelToImage {
    public static void main(String[] args) {
        try {
            int Y = new Color(255, 242, 0).getRGB();
            int B = new Color(0, 0, 0).getRGB();

            int[][] pixelValues = {
                    {Y, Y, Y, Y, Y, Y, Y},
                    {Y, Y, B, Y, B, Y, Y},
                    {Y, Y, Y, Y, Y, Y, Y},
                    {Y, B, Y, Y, Y, B, Y},
                    {Y, B, B, B, B, B, Y},
                    {Y, Y, Y, Y, Y, Y, Y}
            };

            int width = 7;
            int height = 6;

            BufferedImage image =
                    new BufferedImage(
                            width,
                            height,
                            BufferedImage.TYPE_INT_RGB
                    );

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    image.setRGB(
                            x,
                            y,
                            pixelValues[y][x]
                    );
                }
            }

            ImageIO.write(
                    image,
                    "png",
                    new File("generatedSmiley.png")
            );

            System.out.println(
                    "Image created: generatedSmiley.png"
            );
            System.out.println("Image width: " + width);
            System.out.println("Image height: " + height);
            System.out.println("Pixels written: "
                    + (width * height));

        } catch (Exception exception) {
            System.out.println(
                    "Unable to create the image."
            );
        }
    }
}