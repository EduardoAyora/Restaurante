/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *
 * @author DELL
 */
public class ImagenFondoMain implements Border {

    private BufferedImage fondo;

    public ImagenFondoMain() {
        try {
            URL imagePath = new URL(getClass().getResource("/ec/edu/ups/imagenes/backrestaurant2.jpg").toString());
            fondo = ImageIO.read(imagePath);
        } catch (Exception ex) {

        }
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if (fondo != null) {
            g.drawImage(fondo, 0, 0, width, height, null);
        }
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }

}
