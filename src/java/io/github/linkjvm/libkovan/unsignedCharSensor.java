/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.libkovan;

public class unsignedCharSensor {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected unsignedCharSensor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(unsignedCharSensor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LinkJVMJNI.delete_unsignedCharSensor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public short value() {
    return LinkJVMJNI.unsignedCharSensor_value(swigCPtr, this);
  }

}
