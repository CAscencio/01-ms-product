package com.msproduct.msproduct.web.message;

import java.math.BigDecimal;

public class ProductoMessage {
    private final Long categoriaId;
    private final String sku;
    private final String nombre;
    private final String descripcion;
    private final BigDecimal precioVenta;
    private final Integer stock;
    private final boolean estado;

    public ProductoMessage(Long categoriaId, String sku, String nombre, String descripcion, BigDecimal precioVenta, Integer stock, boolean estado) {
        this.categoriaId = categoriaId;
        this.sku = sku;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.estado = estado;
    }

    public Long getCategoriaId() {
        return categoriaId;
    }

    public String getSku() {
        return sku;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public Integer getStock() {
        return stock;
    }

    public boolean isEstado() {
        return estado;
    }
}
