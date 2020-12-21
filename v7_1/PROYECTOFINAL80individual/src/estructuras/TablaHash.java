package estructuras;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author David Vergara
 */
public class TablaHash implements Serializable
{
    private static long SerialVersionUID = 1L;

    private ArbolBinario[] tabla;

    /**
     * Constructor que recibe el tamaño del arreglo y le crea un arbolbinario a
     * cada elemento
     *
     * @param n
     */
    public TablaHash(int n)
    {
        tabla = new ArbolBinario[n];
        for (int i = 0; i < n; i++)
        {
            tabla[i] = new ArbolBinario();
        }
    }

    public TablaHash()
    {
        int n = 27;
        tabla = new ArbolBinario[n];
        for (int i = 0; i < n; i++)
        {
            tabla[i] = new ArbolBinario();
        }
    }
    /**
     * @return the tabla
     */
    public ArbolBinario[] getTabla()
    {
        return tabla;
    }

    /**
     * @param tabla the tabla to set
     */
    public void setTabla(ArbolBinario[] tabla)
    {
        this.tabla = tabla;
    }

    /**
     * Metodo que regresa la posicion del objeto dentro del arreglo
     *
     * @return la direccion apartir de letras
     */
    public int posicion(char letra)
    {
        int dir = -1;
        
        if (letra >= 97 && letra <= 122)
        {
            letra = (char) (letra - 32);
        }
        if (letra >= 65 && letra <= 90)
        {
            dir = letra - 65;
        } else if (letra == 'ñ' || letra == 'Ñ')
        {
            dir = 26;
        }
        return dir;
    }

    /**
     * Regresa el objeto almacenado dentro de la posicion de la tabla
     *
     * @param n la posicion dentro del arreglo
     * @return el elemento de la tabla que se desee
     */
    public ArbolBinario getTablaPosicion(int n)
    {
        return tabla[n];
    }

    /**
     * Metodo que inserta el nodo a su correspondiente arbol
     *
     * @param etq La persona a insertar en el arbol
     * @param nuevo El nodo que sera insertado al arbol
     */
    public void inserta(String etq, NodoArbol nuevo)
    {
        char letra = etq.charAt(0);
        int pos = posicion(letra);
        if (pos != -1)
        {
            tabla[pos].setR(tabla[pos].inserta(tabla[pos].getR(), nuevo));
        }
    }

    /**
     * Metodo que elimina el nodo de su correspondiente arbol
     *
     * @param etq La persona a eliminar en el arbol
     */
    public void elimina(String etq)
    {
        char letra = etq.charAt(0);
        int pos = posicion(letra);
        if (pos != -1)
        {
            NodoArbol[] aux = new NodoArbol[2];
            tabla[pos].elimina(tabla[pos].getR(), etq, aux);
            tabla[pos].setR(aux[1]);
        }
    }

    /**
     * Método que busca dentro del arreglo y despues dentro del arbol
     *
     * @param etq
     * @return
     */
    public NodoArbol buscarDT(String etq)
    {
        char letra = etq.charAt(0);
        int pos = posicion(letra);
        if (pos == -1)
        {
            return null;
        } else
        {
            System.out.println(tabla[pos]);
            if (tabla[pos] != null)
            {
                NodoArbol encontrado = tabla[pos].busqueda(tabla[pos].getR(), etq);
                return encontrado;
            } else
            {
                return null;
            }
        }
    }
    
    public String[] buscarDTS(String etq)
    {
        char letra = etq.charAt(0);
        int pos = posicion(letra);
        if (pos == -1)
        {
            return null;
        } else
        {
            System.out.println(tabla[pos]);
            if (tabla[pos] != null)
            {
                String encontrado[] = tabla[pos].busca(tabla[pos].getR(), etq,new String[0]);
                return encontrado;
            } else
            {
                return null;
            }
        }
    }

    /**
     * Metodo para ver el contenido de cada arbol
     */
    public void verarboles()
    {
        for (int i = 0; i < tabla.length; i++)
        {
            System.out.println("Arbol [" + i + "] " + tabla[i].preOrden(tabla[i].getR()) + "\n");
        }
    }

}
