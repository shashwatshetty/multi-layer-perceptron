package utilities;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ProcessImage {
    public static double[] loadImg(String filePath, int xpx, int ypx, boolean hasColor){
        File path = new File(filePath);
        BufferedImage loadImg, formatImg;
        if(hasColor){
            formatImg = new BufferedImage(xpx, ypx, BufferedImage.TYPE_INT_ARGB);
        }else{
            formatImg = new BufferedImage(xpx,ypx, BufferedImage.TYPE_BYTE_GRAY);
        }
        try{
            loadImg = ImageIO.read(path);
        }catch(IOException ioe){
            String errorMessage = "Image at " + filePath + " not loaded.";
            System.out.println(errorMessage);
            return null;
        }
        Graphics2D gfx = (Graphics2D) formatImg.getGraphics();
        gfx.drawImage(loadImg, 0, 0, null);
        gfx.dispose();
        double[] imgPixels = new double[xpx * ypx];
        for(int x = 0; x < xpx; x++){
            for(int y = 0; y < ypx; y++){
                int[] pixels = new int[3];
                formatImg.getRaster().getPixel(x, y, pixels);
                imgPixels[x * xpx + y] = ((double) pixels[0]) / 255.0;
            }
        }
        return imgPixels;
    }
}
