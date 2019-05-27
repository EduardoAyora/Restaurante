
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
    
    public GenerarProducto(ControladorProducto controladorProducto){
        this.controladorProducto = controladorProducto;
        crearProductos();
    }
    
    public void crearProductos(){
        
        Categoria categoria = new Categoria();
        categoria.setNombre("Plato");
        Categoria categoria1 = new Categoria();
        categoria1.setNombre("Bebida");
        Producto producto = new Producto();
        producto.setNombre("arroz");
        producto.setPrecio(10);
        producto.setCategoria(categoria);
        controladorProducto.create(producto);
        Producto producto1 = new Producto();
        producto1.setNombre("Atun");
        producto1.setPrecio(2);
        producto1.setCategoria(categoria);
        controladorProducto.create(producto1);
        controladorProducto.delete(2);
        Producto producto2 = new Producto();
        producto2.setNombre("Sandia");
        producto2.setPrecio(4);
        producto2.setCategoria(categoria1);
        controladorProducto.create(producto2);
        Producto producto3 = new Producto();
        producto3.setNombre("Jugo");
        producto3.setPrecio(3);
        producto3.setCategoria(categoria1);
        controladorProducto.create(producto3);
        
        ImageIcon img = new ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/gerenteR.png"));
        producto3.setImgIcon(img);
        
    }
    
}
