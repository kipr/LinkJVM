/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.jni.sensors;

public class CharSensor {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CharSensor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CharSensor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_sensorJNI.delete_CharSensor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public char value() {
    return linkjvm_sensorJNI.CharSensor_value(swigCPtr, this);
  }

}
