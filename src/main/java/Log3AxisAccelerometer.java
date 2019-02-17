import edu.wpi.first.wpilibj.interfaces.Accelerometer;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Displays a 3-axis accelerometer with a number bar for each axis' accleration.
 * <br>Supported types:
 * <ul>
 * <li>{@link edu.wpi.first.wpilibj.ADXL345_I2C}</li>
 * <li>{@link edu.wpi.first.wpilibj.ADXL345_SPI}</li>
 * <li>{@link edu.wpi.first.wpilibj.ADXL362}</li>
 * </ul>
 * <br>Custom properties:
 * <table>
 * <tr><th>Name</th><th>Type</th><th>Default Value</th><th>Notes</th></tr>
 * <tr><td>Range</td><td>{@link Accelerometer.Range}</td><td>k16G</td><td>The accelerometer range</td></tr>
 * <tr><td>Show value</td><td>Boolean</td><td>true</td>
 * <td>Show or hide the acceleration values</td></tr>
 * <tr><td>Precision</td><td>Number</td><td>2</td>
 * <td>How many numbers to display after the decimal point</td></tr>
 * <tr><td>Show tick marks</td><td>Boolean</td><td>false</td>
 * <td>Show or hide the tick marks on the number bars</td></tr>
 * </table>
 */

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Log3AxisAccelerometer {
    //The name of the value on Shuffleboard; defaults to field or method name.
    String name() default "NO_NAME";

    //The range of the accelerometer.
    Accelerometer.Range range() default Accelerometer.Range.k16G;

    //Whether to show or hide the acceleration values.
    boolean showValue() default true;

    //How many digits to display after the decimal point.
    int precision() default 2;

    //Whether to show the tick marks on the number bars.
    boolean showTicks() default false;
}