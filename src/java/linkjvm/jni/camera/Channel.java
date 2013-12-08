/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.jni.camera;

public class Channel {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Channel(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Channel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_cameraJNI.delete_Channel(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Channel(Device device, Config config) {
    this(linkjvm_cameraJNI.new_Channel(Device.getCPtr(device), device, Config.getCPtr(config), config), true);
  }

  public void invalidate() {
    linkjvm_cameraJNI.Channel_invalidate(swigCPtr, this);
  }

  public ObjectVector objects() {
    long cPtr = linkjvm_cameraJNI.Channel_objects(swigCPtr, this);
    return (cPtr == 0) ? null : new ObjectVector(cPtr, false);
  }

  public Device device() {
    long cPtr = linkjvm_cameraJNI.Channel_device(swigCPtr, this);
    return (cPtr == 0) ? null : new Device(cPtr, false);
  }

  public void setConfig(Config config) {
    linkjvm_cameraJNI.Channel_setConfig(swigCPtr, this, Config.getCPtr(config), config);
  }

}
