/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.openbravo.pos.ticket;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.ImageUtils;
import com.openbravo.data.loader.SerializerRead;
import java.io.Serializable;

/**
 *
 * @author spawn
 */
public class ProductAux implements Serializable{
    
    private static final long serialVersionUID = 2587696873036L;
    
    protected String m_ID;
    protected String m_Product;
    protected String m_ProducAux;
    protected String m_referencia;
    protected String m_codeBar;
    protected String m_name;

    public ProductAux() {
        this.m_ID = null;
        this.m_Product = null;
        this.m_ProducAux = null;
        this.m_codeBar = null;
        this.m_name = null;
        this.m_referencia = null;
    }
    
    public ProductAux(String id, String idProduct, String idProductAux, String codeBar, String name, String referencia) {
        this.m_ID = id;
        this.m_Product = idProduct;
        this.m_ProducAux = idProductAux;
        this.m_codeBar = codeBar;
        this.m_name = name;
        this.m_referencia = referencia;
    }

    public String getID() {
        return m_ID;
    }

    public void setID(String ID) {
        this.m_ID = ID;
    }

    public String getProduct() {
        return m_Product;
    }

    public void setProduct(String product) {
        this.m_Product = product;
    }

    public String getProducAux() {
        return m_ProducAux;
    }

    public void setProducAux(String producAux) {
        this.m_ProducAux = producAux;
    }

    public String getReferencia() {
        return m_referencia;
    }

    public void setReferencia(String referencia) {
        this.m_referencia = referencia;
    }

    public String getCodeBar() {
        return m_codeBar;
    }

    public void setCodeBar(String codeBar) {
        this.m_codeBar = codeBar;
    }

    public String getName() {
        return m_name;
    }

    public void setName(String name) {
        this.m_name = name;
    }
    
    
    
    
    /**
     *
     * @return
     */
    public static SerializerRead getSerializerRead() {
        return new SerializerRead() {
            @Override
            public Object readValues(DataRead dr) throws BasicException {
                ProductAux productAux = new ProductAux();
                productAux.m_ID = dr.getString(1);                                 
                productAux.m_Product = dr.getString(2);                               
                productAux.m_ProducAux = dr.getString(3);                              
                productAux.m_name = dr.getString(4);                              
                productAux.m_referencia = dr.getString(5);                              
                productAux.m_codeBar = dr.getString(6);                              
                return productAux;
            }
        };
    }
    
}
