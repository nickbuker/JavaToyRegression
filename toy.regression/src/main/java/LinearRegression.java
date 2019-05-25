import Jama.Matrix;

/**
 * TODO
 */

public class LinearRegression extends Model {

    /**
     * TODO
     *
     * @param x     predictor training data
     * @param y     target training data
     */
    @Override
    public void fit(Matrix x, Matrix y) {
        System.out.println("Not yet implemented.");
    }

    /**
     * TODO
     *
     * @param x     predictor data
     * @return
     */
    @Override
    public Matrix predict(Matrix x) {
        System.out.println("Not yet implemented.");
        return new Matrix(1, 1);
    }

    /**
     * TODO
     *
     * @param x     predictor test data
     * @param y     target test data
     * @return
     */
    @Override
    public double score(Matrix x, Matrix y) {
        System.out.println("Not yet implemented.");
        return 0;
    }
}
