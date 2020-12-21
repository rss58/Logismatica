package estructuras;

import java.io.Serializable;

/**
 *
 * @author David Vergara
 */
public class ArbolBinario implements Serializable
{

    private static long SerialVersionUID = 1L;

    private NodoArbol r = null;

    /**
     * Método que inserta un elemento al arbol binario y que lo va balanceando
     * para mejorar su posterior busqueda
     *
     * @param r El nodo raiz donde parte el arbol
     * @param n El nodo que insertaremos al arbol
     * @return la raiz con el nuevo elemento incluido
     */
    public NodoArbol inserta(NodoArbol r, NodoArbol n)
    {
        if (r == null)
        {
            System.out.println("n: "+n.getEtq());
            return n;
        } else
        {
            if (r.getEtq().compareTo(n.getEtq()) > 0)
            {
                r.setIzq(inserta(r.getIzq(), n));

            } else
            {
                r.setDer(inserta(r.getDer(), n));
            }

            r = balancear(r);
            return r;
        }
    }

    /**
     * Método que elimina un elemento dentro del arbol y al mismo tiempo lo
     * balancea
     *
     * @param r El nodo raiz donde inicia el arbol binario
     * @param etq La etiqueta del objeto para su busqueda y eliminación
     * @param arr Este arreglo devuelve dos datos en la posición [0] el elemento
     * eliminado y en la posición [1] la nueva raiz sin el elemento
     */
    public void elimina(NodoArbol r, String etq, NodoArbol arr[])
    {
        if (r == null)
        {
            arr[0] = null;
            arr[1] = r;
        } else
        {
            if (r.getEtq().equals(etq)) //Encontre el dato a eliminar
            {
                arr[0] = r;
                if (r.getDer() == null && r.getIzq() == null) //No tiene hijos
                {
                    arr[1] = null;
                } else
                {
                    if (!(r.getDer() != null && r.getIzq() != null)) //Tiene un hijo
                    {
                        if (r.getDer() != null)
                        {
                            arr[1] = r.getDer();
                        } else
                        {
                            arr[1] = r.getIzq();
                        }
                        arr[1] = balancear(arr[1]);
                    } else //tiene dos hijos
                    {
                        if (r.getDer().getIzq() == null)
                        {
                            arr[1] = r.getDer();
                            r.getDer().setIzq(r.getIzq());
                        } else
                        {
                            NodoArbol se = sucesorE(r);
                            arr[1] = se.getIzq();
                            se.setIzq(arr[1].getDer());
                            arr[1].setDer(r.getDer());
                            arr[1].setIzq(r.getIzq());
                        }
                        arr[1] = balancear(arr[1]);
                        r.setDer(null);
                        r.setIzq(null);
                    }
                }
            } else
            {
                if (r.getEtq().compareTo(etq) > 0)
                {
                    elimina(r.getIzq(), etq, arr);
                    r.setIzq(arr[1]);
                } else
                {
                    elimina(r.getDer(), etq, arr);
                    r.setDer(arr[1]);
                }
                arr[1] = r;
            }
        }
    }

    /**
     * Método que busca un elemento dentro del arbol y si esta balanceado es
     * considerablemente más rapido
     *
     * @param r El nodo raiz donde inicia el arbol
     * @param etq La etiqueta del objeto a buscar
     * @return El nodo de dicha etiqueta
     */
    public NodoArbol busqueda(NodoArbol r, String etq)
    {
        NodoArbol encontrado = null;
        if (r != null)
        {
            if (r.getEtq().compareTo(etq) == 0)
            {
                encontrado = r;
            } else
            {
                if (r.getEtq().compareTo(etq) > 0)
                {
                    encontrado = busqueda(r.getIzq(), etq);
                } else
                {
                    encontrado = busqueda(r.getDer(), etq);
                }
            }
        } else
        {
            return null;
        }
        return encontrado;
    }

    /**
     * Método que busca al sucedor del nodo raiz
     *
     * @param r El nodo que debe tener hijos para encontrar a su sucesor
     * @return El nodo sucesor de la raiz
     */
    public NodoArbol sucesorE(NodoArbol r)
    {
        if (r.getIzq().getIzq() != null)
        {
            return sucesorE(r.getIzq());
        } else
        {
            return r;
        }
    }

    /**
     * @return the r
     */
    public NodoArbol getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(NodoArbol r)
    {
        this.r = r;
    }

    /**
     * Método que muestra las etiquetas del arbol de forma ordenada
     *
     * @param r El nodo raiz donde inicia el arbol
     * @return Una cadena que contiene todas las etiquetas
     */
    public String enOrden(NodoArbol r)
    {
        String s = "";
        if (r != null)
        {
            s += enOrden(r.getIzq());
            s += r.getEtq();
            s += enOrden(r.getDer());
        }
        return s;
    }

    /**
     * Método que muestra las etiquetas empezando por la raiz y va por las
     * menores a esto y despues por las mayores
     *
     * @param r El nodo raiz donde inicia el arbol
     * @return Una cadena que contiene todas las etiquetas
     */
    public String preOrden(NodoArbol r)
    {
        String s = "\n";
        if (r != null)
        {
            s += r.getEtq() + "\n";
            s += "\t→Hilo: "+r.getHilo().getEtq()+"\n\t→Arriba: "+r.getHilo().getArriba().getEtq()+"\n";
            s += preOrden(r.getIzq()) + " ";
            s += preOrden(r.getDer()) + " ";
        }
        return s;
    }

    /**
     * Método que Muestra las etiquetas empezando por la raiz y va por las
     * mayores a esta y despues por la menores a la raiz
     *
     * @param r El nodo raiz donde inicia el arbol
     * @return Una cadena que contiene todas las etiquetas
     */
    public String postOrden(NodoArbol r)
    {
        String s = "";
        if (r != null)
        {
            s += postOrden(r.getIzq());
            s += postOrden(r.getDer());
            s += r.getEtq();
        }
        return s;
    }

    /**
     * Se encarga de balancear un arbol, se recomienda llamarlo cuando se hizo
     * una inserción o eliminacion del arbol
     *
     * @param r Es el nodo padre con el cual se puede empezar hacer
     * comparaciones para su posterior balanceo
     * @return La raiz modificada para que este balanceado de la mejor forma
     */
    public NodoArbol balancear(NodoArbol r)
    {
        if (r != null)
        {
            if (altura(r.getIzq(), 0) - altura(r.getDer(), 0) == 2)
            {
                /* desequilibrio hacia la izquierda! */
                if (altura(r.getIzq().getIzq(), 0) >= altura(r.getIzq().getDer(), 0))
                /* desequilibrio simple hacia la izquierda */
                {
                    r = rotar_s(r, true);
                } else
                /* desequilibrio doble hacia la izquierda */
                {
                    r = rotar_d(r, true);
                }
            } else if (altura(r.getDer(), 0) - altura(r.getIzq(), 0) == 2)
            {
                /* desequilibrio hacia la derecha! */
                if (altura(r.getDer().getDer(), 0) >= altura(r.getDer().getIzq(), 0))
                /* desequilibrio simple hacia la derecha */
                {
                    r = rotar_s(r, false);
                } else
                /* desequilibrio doble hacia la derecha */
                {
                    r = rotar_d(r, false);
                }
            }
        }
        return r;
    }

    /**
     * Método que rota los nodos a la derecha para balancear los arboles
     *
     * @param r El nodo padre
     * @param izq Tipo booleano que aclara si se hace una rotacion o no
     * @return la raiz ya modificada con la rotación
     */
    public NodoArbol rotar_d(NodoArbol r, boolean izq)
    {
        if (izq)
        /* rotación izquierda */
        {
            r.setIzq(rotar_s(r.getIzq(), false));
            r = rotar_s(r, true);
        } else
        /* rotación derecha */
        {
            r.setDer(rotar_s(r.getDer(), true));
            r = rotar_s(r, false);
        }

        return r;
    }

    /**
     * Cambia de lugar dos nodos para el balance
     *
     * @param r El nodo padre con hijos
     * @param izq El hijo izquierdo del padre
     * @return
     */
    public NodoArbol rotar_s(NodoArbol r, boolean izq)
    {
        NodoArbol tmp;
        if (izq)
        /* rotación izquierda */
        {
            tmp = r.getIzq();
            r.setIzq(tmp.getDer());
            tmp.setDer(r);
        } else
        /* rotación derecha */
        {
            tmp = r.getDer();
            r.setDer(tmp.getIzq());
            tmp.setIzq(r);
        }
        return tmp;
    }

    /**
     * Método que calcula la altura del arbol o apartir de una rama dada
     *
     * @param r El nodo padre
     * @param a La altura del arbol
     * @return
     */
    public int altura(NodoArbol r, int a)
    {
        if (r == null)
        {
            return a;
        } else
        {
            return max(altura(r.getIzq(), a + 1), altura(r.getDer(), a + 1));
        }

    }

    /**
     * Método para ver quien es más grande
     *
     * @param a número
     * @param b número
     * @return quien es más grande
     */
    public int max(int a, int b)
    {
        return a > b ? a : b;
    }

    /**
     * Metodo para buscar un nombre en el árbol binario
     *
     * @param r
     * @param etq
     * @param arr
     */
    public String[] busca(NodoArbol r, String etq, String b[])
    {
        System.out.println("Longitud de mi arreglo en busqueda: " + b.length);
        String bus[] = b;
        if (r == null)
        {
            System.out.println("Null");
            return bus;
        } else
        {
            System.out.println("comparando: " + r.getEtq());
            if (r.getEtq().contains(etq))//encontre el dato buscado
            {
                System.out.println("\n =====================\n");
                System.out.println("Persona encontrada: "+r.getEtq());
                System.out.println("Persona encontrada su hilo: "+r.getHilo().getEtq());
                System.out.println("Persona encontrada su hilo arriba: "+r.getHilo().getArriba().getEtq());
                System.out.println("\n =====================\n");
                String tmp[] = new String[bus.length + 1];
                System.arraycopy(bus, 0, tmp, 0, bus.length);
                tmp[bus.length] = r.getEtq();
                bus = tmp;

                System.out.println("Dato encontrado: " + r.getEtq());

                bus = busca(r.getIzq(), etq, bus);
                bus = busca(r.getDer(), etq, bus);
            } else
            {
                System.out.println("Dato no igual");

                if (r.getEtq().compareTo(etq) > 0)// se va a la izqueirda
                {
                    if (r.getIzq() != null)
                    {
                        System.out.println("Izquierda");
                        bus = busca(r.getIzq(), etq, bus);
                    }
                } else
                {
                    if (r.getDer() != null)
                    {
                        System.out.println("Derecha");
                        bus = busca(r.getDer(), etq, bus);
                    }
                }
            }
            return bus;
        }
    }

}
