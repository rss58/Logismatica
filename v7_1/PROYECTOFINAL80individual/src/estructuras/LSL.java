/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author David Vergara
 */
public class LSL
{

    private Nodo r = null;

    /**
     * @return the r
     */
    public Nodo getR()
    {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(Nodo r)
    {
        this.r = r;
    }

    public boolean inserta(Nodo n)
    {
        if (n == null)
        {
            return false;
        } else
        {
            if (r == null)//preguntar si n es el primero de la lista
            {
                //el primero a la lista
                r = n;
            } else
            {
                if (n.getEtq().compareTo(r.getEtq()) < 0)//compareto la primer cadena es menor que la lcadena cuando es mayor a cero es myo que la cadena
                {
                    //aqui es menor al primero
                    n.setSig(r);
                    
                    r = n;
                } else
                {
                    //cuando el dato va enmedio de la lista
                    Nodo aux = r;// r se utiliza para referirse a raiz o root
                    boolean b = true;//identifica si ya se inserto el dato
                    while (aux.getSig() != null && b)
                    {
                        if (n.getEtq().compareTo(aux.getSig().getEtq()) < 0)//lo que esta llegando es menor lo que tien au en etiqueta y aqui ubico a donde tiene que ir el dato
                        {
                            n.setSig(aux.getSig());
                            aux.setSig(n);
                            b = false;
                        } else
                        {
                            aux = aux.getSig();
                        }
                    }
                    /**
                     * cuando al final de la lista cuando la vandera siga en
                     * true entonces namas conecta a aux
                     */
                    if (b)
                    {
                        aux.setSig(n);
                    }

                }
            }
            return true;
        }
    }

    public Nodo eliminar(String etq)
    {
        System.out.println("Apartado de eliminacio LSL: "+etq);
        if (r==null)
        {
            return null;
        } else
        {
            Nodo aux=null;
            if(etq.compareTo(r.getEtq())>=0)
            {
                if (r.getEtq().equals(etq))
                {
                    aux=r;
                    r=r.getSig();
                    aux.setSig(null);
                } else
                {
                    Nodo aux2=r;
                    boolean b=true;
                    while (aux2.getSig() != null && b)
                    {
                        if (aux2.getSig().getEtq().equals(etq))
                        {
                            aux=aux2.getSig();
                            aux2.setSig(aux.getSig());
                            aux.setSig(null);
                            b=false;
                        } else
                        {
                            aux2=aux2.getSig();
                        }
                    }
                }  
            }
            return aux;
        }
    }

    /**
     * cuando esta ne m¿negriot es una variable local
     */
    public String desp(Nodo r)
    {
        String s = "";
        while (r != null)
        {
            s += r.getEtq();
            r = r.getSig();
        }
        return s;
    }

}
