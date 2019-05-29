package ec.edu.ups.datoscreados;

import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Categoria;
import ec.edu.ups.modelo.Producto;
import javax.swing.ImageIcon;

/**
 *
 * @author
 */
public class GenerarProducto {

    private ControladorProducto controladorProducto;

    public GenerarProducto(ControladorProducto controladorProducto) {
        this.controladorProducto = controladorProducto;
        crearProductos();
    }

    public void crearProductos() {

        Categoria categoriaPlato = new Categoria();
        categoriaPlato.setNombre("Plato");
        Categoria categoriaBebida = new Categoria();
        categoriaBebida.setNombre("Bebida");
        Categoria categoriaEntrada = new Categoria();
        categoriaEntrada.setNombre("Entrada");
        Categoria categoriaPostre = new Categoria();
        categoriaPostre.setNombre("Postre");

        //Bebidas, te, cafe, cafe hel, ceveza, limonada, yogurt
        Producto productoB1 = new Producto();
        productoB1.setNombre("Té");
        productoB1.setPrecio(1.5);
        productoB1.setCategoria(categoriaBebida);
        productoB1.setDescripcion("Té verde");
        productoB1.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/te.png")));
        controladorProducto.create(productoB1);

        Producto productoB2 = new Producto();
        productoB2.setNombre("Café");
        productoB2.setPrecio(1);
        productoB2.setCategoria(categoriaBebida);
        productoB2.setDescripcion("Café caliente");
        productoB2.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/cafe.png")));
        controladorProducto.create(productoB2);

        Producto productoB3 = new Producto();
        productoB3.setNombre("Café helado");
        productoB3.setPrecio(1);
        productoB3.setCategoria(categoriaBebida);
        productoB3.setDescripcion("Café frio");
        productoB3.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/cafehelado.png")));
        controladorProducto.create(productoB3);

        Producto productoB4 = new Producto();
        productoB4.setNombre("Cerveza");
        productoB4.setPrecio(3);
        productoB4.setCategoria(categoriaBebida);
        productoB4.setDescripcion("Cerveza Brahma");
        productoB4.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/cerveza.png")));
        controladorProducto.create(productoB4);

        Producto productoPrueba1 = new Producto();
        Producto productoPrueba2 = new Producto();
        controladorProducto.create(productoPrueba1);
        controladorProducto.create(productoPrueba2);
        controladorProducto.delete(5);
        controladorProducto.delete(6);

        Producto productoB5 = new Producto();
        productoB5.setNombre("Limonada");
        productoB5.setPrecio(2);
        productoB5.setCategoria(categoriaBebida);
        productoB5.setDescripcion("Vaso de limonada");
        productoB5.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/limonada.png")));
        controladorProducto.create(productoB5);

        Producto productoB6 = new Producto();
        productoB6.setNombre("Yogurt");
        productoB6.setPrecio(2);
        productoB6.setCategoria(categoriaBebida);
        productoB6.setDescripcion("Vaso de yogurt");
        productoB6.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/yogurt.png")));
        controladorProducto.create(productoB6);

        //platos, hamburguesa, desayuno
        Producto productoP1 = new Producto();
        productoP1.setNombre("Hamburguesa");
        productoP1.setPrecio(5);
        productoP1.setCategoria(categoriaPlato);
        productoP1.setDescripcion("Hamburguesa de tamaño grande");
        productoP1.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/hamburguesa.png")));
        controladorProducto.create(productoP1);

        Producto productoP2 = new Producto();
        productoP2.setNombre("Desayuno");
        productoP2.setPrecio(4);
        productoP2.setCategoria(categoriaPlato);
        productoP2.setDescripcion("Incluye café, jugo, huevo y tocino");
        productoP2.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/desayuno.png")));
        controladorProducto.create(productoP2);

        //postres, helado, pie, dona, cake
        Producto productoPo1 = new Producto();
        productoPo1.setNombre("Helado");
        productoPo1.setPrecio(2.5);
        productoPo1.setCategoria(categoriaPostre);
        productoPo1.setDescripcion("Helado con sabores a escoger");
        productoPo1.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/helado.png")));
        controladorProducto.create(productoPo1);

        Producto productoPo2 = new Producto();
        productoPo2.setNombre("Pie");
        productoPo2.setPrecio(3);
        productoPo2.setCategoria(categoriaPostre);
        productoPo2.setDescripcion("Torta con mora");
        productoPo2.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/pie.png")));
        controladorProducto.create(productoPo2);

        Producto productoPo3 = new Producto();
        productoPo3.setNombre("Dona");
        productoPo3.setPrecio(0.75);
        productoPo3.setCategoria(categoriaPostre);
        productoPo3.setDescripcion("Dona cubierta de chocolate");
        productoPo3.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/dona.png")));
        controladorProducto.create(productoPo3);

        Producto productoPo4 = new Producto();
        productoPo4.setNombre("Cake");
        productoPo4.setPrecio(1.5);
        productoPo4.setCategoria(categoriaPostre);
        productoPo4.setDescripcion("Cake de chocolate");
        productoPo4.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/cake.png")));
        controladorProducto.create(productoPo4);

        Producto productoPo5 = new Producto();
        productoPo5.setNombre("Pudin");
        productoPo5.setPrecio(2);
        productoPo5.setCategoria(categoriaPostre);
        productoPo5.setDescripcion("Pudin de fresa y chocolate");
        productoPo5.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/pudin.png")));
        controladorProducto.create(productoPo5);

        //entradas, pan, empanada, papas fritas
        Producto entrada1 = new Producto();
        entrada1.setNombre("Pan");
        entrada1.setPrecio(0.5);
        entrada1.setCategoria(categoriaEntrada);
        entrada1.setDescripcion("Pan blanco");
        entrada1.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/pan.png")));
        controladorProducto.create(entrada1);

        Producto entrada2 = new Producto();
        entrada2.setNombre("Empanada");
        entrada2.setPrecio(1.5);
        entrada2.setCategoria(categoriaEntrada);
        entrada2.setDescripcion("Empanada de verde");
        entrada2.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/empanada1.png")));
        controladorProducto.create(entrada2);

        Producto entrada3 = new Producto();
        entrada3.setNombre("Papas");
        entrada3.setPrecio(2.5);
        entrada3.setCategoria(categoriaEntrada);
        entrada3.setDescripcion("Papas fritas");
        entrada3.setImgIcon(new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/png/papas1.png")));
        controladorProducto.create(entrada3);

    }

}
