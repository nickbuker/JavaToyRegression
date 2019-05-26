package main.java;

import Jama.Matrix;

/**
 * Abstract base class for models
 *
 * @author      Nick Buker
 * @version     1.0.0
 * @since       2019-05-24
 */

abstract public class Model {

    /**
     * Abstract method for fitting model
     *
     * @param x     predictor training data
     * @param y     target training data
     */
    abstract public void fit( Matrix x, Matrix y );

    /**
     * Abstract method for making predictions with fitted model
     * @param x     predictor data
     * @return      target predictions
     */
    abstract public Matrix predict( Matrix x );

    /**
     * Abstract method for evaluating fitted model performance
     *
     * @param x     predictor test data
     * @param y     target test data
     * @return      model score
     */
    abstract public double score( Matrix x, Matrix y );
}
