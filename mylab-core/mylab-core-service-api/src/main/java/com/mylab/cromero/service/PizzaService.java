package com.mylab.cromero.service;

import com.mylab.cromero.repository.dto.PizzaRequest;
import com.mylab.cromero.repository.dto.PizzaResponse;

import java.util.List;

/**
 * <h1>BaseService</h1>
 * BaseService interface definition
 * <p>
 * <b>BaseService</b> definition of methods of interface
 * for sevice layer
 *
 * @author Cristian Romero Matesanz
 */
public interface PizzaService {


    /**
     * list all pizzas from repository
     *
     * @return
     */
    List<PizzaResponse> findAllPizzas();

    /**
     * save a pizza from repository
     *
     * @param base base to save
     */
    void savePizza(final PizzaRequest pizzaRequest);

    /**
     * get a base of pizza from repository
     * @param id base to load
     * @return
     */

}
