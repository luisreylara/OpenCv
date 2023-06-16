/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opencv_1;

import java.awt.Image;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

/**
 *
 * @author luisr
 */
public class Opencv_2 {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        System.out.println(Core.VERSION);
        Mat src1, src2, dst = new Mat();
        src1 = Imgcodecs.imread("C:/Users/luisr/OneDrive/Documentos/opencv/A.png");   
        src2 = Imgcodecs.imread("C:/Users/luisr/OneDrive/Documentos/opencv/B.png"); 
        Core.addWeighted(src1, 0.5, src2, 0.5, 0, dst);
        HighGui.imshow("Primer",dst);
        HighGui.waitKey();
        System.exit(0);
        
    }
}
