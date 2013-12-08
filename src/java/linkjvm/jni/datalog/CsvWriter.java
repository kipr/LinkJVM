/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.jni.datalog;

public class CsvWriter extends DataLogWriter {
  private long swigCPtr;

  protected CsvWriter(long cPtr, boolean cMemoryOwn) {
    super(linkjvm_datalogJNI.CsvWriter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CsvWriter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_datalogJNI.delete_CsvWriter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CsvWriter(String path) {
    this(linkjvm_datalogJNI.new_CsvWriter(path), true);
  }

  public boolean write(DataLog dataLog) {
    return linkjvm_datalogJNI.CsvWriter_write(swigCPtr, this, DataLog.getCPtr(dataLog), dataLog);
  }

}
