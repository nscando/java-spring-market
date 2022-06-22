package com.nscando.market.persistence.crud;

import com.nscando.market.persistence.entity.Producto;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    // @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true) ->(la forma nativa de hacer el query)
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

}

