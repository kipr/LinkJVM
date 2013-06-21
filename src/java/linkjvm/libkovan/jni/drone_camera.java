/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.libkovan.jni;

public final class drone_camera {
  public final static drone_camera FRONT_CAMERA = new drone_camera("FRONT_CAMERA");
  public final static drone_camera BOTTOM_CAMERA = new drone_camera("BOTTOM_CAMERA");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static drone_camera swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + drone_camera.class + " with value " + swigValue);
  }

  private drone_camera(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private drone_camera(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private drone_camera(String swigName, drone_camera swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static drone_camera[] swigValues = { FRONT_CAMERA, BOTTOM_CAMERA };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

