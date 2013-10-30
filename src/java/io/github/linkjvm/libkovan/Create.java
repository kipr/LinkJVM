/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.libkovan;

public class Create {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Create(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Create obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LinkJVMJNI.delete_Create(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean connect() {
    return LinkJVMJNI.Create_connect(swigCPtr, this);
  }

  public boolean disconnect() {
    return LinkJVMJNI.Create_disconnect(swigCPtr, this);
  }

  public boolean isConnected() {
    return LinkJVMJNI.Create_isConnected(swigCPtr, this);
  }

  public void setPassiveMode() {
    LinkJVMJNI.Create_setPassiveMode(swigCPtr, this);
  }

  public void setSafeMode() {
    LinkJVMJNI.Create_setSafeMode(swigCPtr, this);
  }

  public void setFullMode() {
    LinkJVMJNI.Create_setFullMode(swigCPtr, this);
  }

  public void setMode(Create.Mode mode) {
    LinkJVMJNI.Create_setMode(swigCPtr, this, mode.swigValue());
  }

  public Create.Mode mode() {
    return Create.Mode.swigToEnum(LinkJVMJNI.Create_mode(swigCPtr, this));
  }

  public void send(CreateScript script) {
    LinkJVMJNI.Create_send(swigCPtr, this, CreateScript.getCPtr(script), script);
  }

  public boolean write(short c) {
    return LinkJVMJNI.Create_write__SWIG_0(swigCPtr, this, c);
  }

  public boolean write(SWIGTYPE_p_unsigned_char data, long len) {
    return LinkJVMJNI.Create_write__SWIG_1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data), len);
  }

  public void flush() {
    LinkJVMJNI.Create_flush(swigCPtr, this);
  }

  public short read() {
    return LinkJVMJNI.Create_read__SWIG_0(swigCPtr, this);
  }

  public int read(SWIGTYPE_p_unsigned_char data, long len) {
    return LinkJVMJNI.Create_read__SWIG_1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data), len);
  }

  public boolean blockingRead(SWIGTYPE_p_unsigned_char data, long size, long timeout) {
    return LinkJVMJNI.Create_blockingRead__SWIG_0(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data), size, timeout);
  }

  public boolean blockingRead(SWIGTYPE_p_unsigned_char data, long size) {
    return LinkJVMJNI.Create_blockingRead__SWIG_1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(data), size);
  }

  public void setLeds(boolean advance, boolean play, short color, short brightness) {
    LinkJVMJNI.Create_setLeds(swigCPtr, this, advance, play, color, brightness);
  }

  public void drive(short velocity, short radius) {
    LinkJVMJNI.Create_drive(swigCPtr, this, velocity, radius);
  }

  public void driveDirect(short left, short right) {
    LinkJVMJNI.Create_driveDirect(swigCPtr, this, left, right);
  }

  public void driveStraight(short speed) {
    LinkJVMJNI.Create_driveStraight(swigCPtr, this, speed);
  }

  public void stop() {
    LinkJVMJNI.Create_stop(swigCPtr, this);
  }

  public void turn(short angle, int speed) {
    LinkJVMJNI.Create_turn(swigCPtr, this, angle, speed);
  }

  public void move(short millimeters, int speed) {
    LinkJVMJNI.Create_move(swigCPtr, this, millimeters, speed);
  }

  public void spin(short speed) {
    LinkJVMJNI.Create_spin(swigCPtr, this, speed);
  }

  public short angularVelocity() {
    return LinkJVMJNI.Create_angularVelocity(swigCPtr, this);
  }

  public void spinClockwise(short speed) {
    LinkJVMJNI.Create_spinClockwise(swigCPtr, this, speed);
  }

  public void spinCounterClockwise(short speed) {
    LinkJVMJNI.Create_spinCounterClockwise(swigCPtr, this, speed);
  }

  public boolean setBaudRate(short baudCode) {
    return LinkJVMJNI.Create_setBaudRate(swigCPtr, this, baudCode);
  }

  public void setDistance(int distance) {
    LinkJVMJNI.Create_setDistance(swigCPtr, this, distance);
  }

  public void setAngle(int angle) {
    LinkJVMJNI.Create_setAngle(swigCPtr, this, angle);
  }

  public AbstractButton playButton() {
    long cPtr = LinkJVMJNI.Create_playButton(swigCPtr, this);
    return (cPtr == 0) ? null : new AbstractButton(cPtr, false);
  }

  public AbstractButton advanceButton() {
    long cPtr = LinkJVMJNI.Create_advanceButton(swigCPtr, this);
    return (cPtr == 0) ? null : new AbstractButton(cPtr, false);
  }

  public boolSensor wall() {
    long cPtr = LinkJVMJNI.Create_wall(swigCPtr, this);
    return (cPtr == 0) ? null : new boolSensor(cPtr, false);
  }

  public boolSensor cliffLeft() {
    long cPtr = LinkJVMJNI.Create_cliffLeft(swigCPtr, this);
    return (cPtr == 0) ? null : new boolSensor(cPtr, false);
  }

  public boolSensor cliffFrontLeft() {
    long cPtr = LinkJVMJNI.Create_cliffFrontLeft(swigCPtr, this);
    return (cPtr == 0) ? null : new boolSensor(cPtr, false);
  }

  public boolSensor cliffFrontRight() {
    long cPtr = LinkJVMJNI.Create_cliffFrontRight(swigCPtr, this);
    return (cPtr == 0) ? null : new boolSensor(cPtr, false);
  }

  public boolSensor cliffRight() {
    long cPtr = LinkJVMJNI.Create_cliffRight(swigCPtr, this);
    return (cPtr == 0) ? null : new boolSensor(cPtr, false);
  }

  public boolSensor virtualWall() {
    long cPtr = LinkJVMJNI.Create_virtualWall(swigCPtr, this);
    return (cPtr == 0) ? null : new boolSensor(cPtr, false);
  }

  public unsingnedShortSensor wallSignal() {
    long cPtr = LinkJVMJNI.Create_wallSignal(swigCPtr, this);
    return (cPtr == 0) ? null : new unsingnedShortSensor(cPtr, false);
  }

  public unsingnedShortSensor cliffLeftSignal() {
    long cPtr = LinkJVMJNI.Create_cliffLeftSignal(swigCPtr, this);
    return (cPtr == 0) ? null : new unsingnedShortSensor(cPtr, false);
  }

  public unsingnedShortSensor cliffFrontLeftSignal() {
    long cPtr = LinkJVMJNI.Create_cliffFrontLeftSignal(swigCPtr, this);
    return (cPtr == 0) ? null : new unsingnedShortSensor(cPtr, false);
  }

  public unsingnedShortSensor cliffFrontRightSignal() {
    long cPtr = LinkJVMJNI.Create_cliffFrontRightSignal(swigCPtr, this);
    return (cPtr == 0) ? null : new unsingnedShortSensor(cPtr, false);
  }

  public unsingnedShortSensor cliffRightSignal() {
    long cPtr = LinkJVMJNI.Create_cliffRightSignal(swigCPtr, this);
    return (cPtr == 0) ? null : new unsingnedShortSensor(cPtr, false);
  }

  public unsingnedShortSensor cargoBayAnalogSignal() {
    long cPtr = LinkJVMJNI.Create_cargoBayAnalogSignal(swigCPtr, this);
    return (cPtr == 0) ? null : new unsingnedShortSensor(cPtr, false);
  }

  public unsignedCharSensor cargoBayDigitalInputs() {
    long cPtr = LinkJVMJNI.Create_cargoBayDigitalInputs(swigCPtr, this);
    return (cPtr == 0) ? null : new unsignedCharSensor(cPtr, false);
  }

  public unsignedCharSensor ir() {
    long cPtr = LinkJVMJNI.Create_ir(swigCPtr, this);
    return (cPtr == 0) ? null : new unsignedCharSensor(cPtr, false);
  }

  public unsignedCharSensor chargingState() {
    long cPtr = LinkJVMJNI.Create_chargingState(swigCPtr, this);
    return (cPtr == 0) ? null : new unsignedCharSensor(cPtr, false);
  }

  public charSensor batteryTemperature() {
    long cPtr = LinkJVMJNI.Create_batteryTemperature(swigCPtr, this);
    return (cPtr == 0) ? null : new charSensor(cPtr, false);
  }

  public unsingnedShortSensor batteryCharge() {
    long cPtr = LinkJVMJNI.Create_batteryCharge(swigCPtr, this);
    return (cPtr == 0) ? null : new unsingnedShortSensor(cPtr, false);
  }

  public unsingnedShortSensor batteryCapacity() {
    long cPtr = LinkJVMJNI.Create_batteryCapacity(swigCPtr, this);
    return (cPtr == 0) ? null : new unsingnedShortSensor(cPtr, false);
  }

  public intSensor angle() {
    long cPtr = LinkJVMJNI.Create_angle(swigCPtr, this);
    return (cPtr == 0) ? null : new intSensor(cPtr, false);
  }

  public intSensor distance() {
    long cPtr = LinkJVMJNI.Create_distance(swigCPtr, this);
    return (cPtr == 0) ? null : new intSensor(cPtr, false);
  }

  public boolSensor bumpLeft() {
    long cPtr = LinkJVMJNI.Create_bumpLeft(swigCPtr, this);
    return (cPtr == 0) ? null : new boolSensor(cPtr, false);
  }

  public boolSensor bumpRight() {
    long cPtr = LinkJVMJNI.Create_bumpRight(swigCPtr, this);
    return (cPtr == 0) ? null : new boolSensor(cPtr, false);
  }

  public boolSensor wheelDropLeft() {
    long cPtr = LinkJVMJNI.Create_wheelDropLeft(swigCPtr, this);
    return (cPtr == 0) ? null : new boolSensor(cPtr, false);
  }

  public boolSensor wheelDropRight() {
    long cPtr = LinkJVMJNI.Create_wheelDropRight(swigCPtr, this);
    return (cPtr == 0) ? null : new boolSensor(cPtr, false);
  }

  public boolSensor wheelDropCaster() {
    long cPtr = LinkJVMJNI.Create_wheelDropCaster(swigCPtr, this);
    return (cPtr == 0) ? null : new boolSensor(cPtr, false);
  }

  public void setRefreshRate(int refreshRate) {
    LinkJVMJNI.Create_setRefreshRate(swigCPtr, this, refreshRate);
  }

  public int refreshRate() {
    return LinkJVMJNI.Create_refreshRate(swigCPtr, this);
  }

  public static Create instance() {
    long cPtr = LinkJVMJNI.Create_instance();
    return (cPtr == 0) ? null : new Create(cPtr, false);
  }

  public CreateState state() {
    long cPtr = LinkJVMJNI.Create_state(swigCPtr, this);
    return (cPtr == 0) ? null : new CreateState(cPtr, false);
  }

  public _1 sensorPacket1() {
    long cPtr = LinkJVMJNI.Create_sensorPacket1(swigCPtr, this);
    return (cPtr == 0) ? null : new _1(cPtr, false);
  }

  public _2 sensorPacket2() {
    long cPtr = LinkJVMJNI.Create_sensorPacket2(swigCPtr, this);
    return (cPtr == 0) ? null : new _2(cPtr, false);
  }

  public _3 sensorPacket3() {
    long cPtr = LinkJVMJNI.Create_sensorPacket3(swigCPtr, this);
    return (cPtr == 0) ? null : new _3(cPtr, false);
  }

  public _4 sensorPacket4() {
    long cPtr = LinkJVMJNI.Create_sensorPacket4(swigCPtr, this);
    return (cPtr == 0) ? null : new _4(cPtr, false);
  }

  public _5 sensorPacket5() {
    long cPtr = LinkJVMJNI.Create_sensorPacket5(swigCPtr, this);
    return (cPtr == 0) ? null : new _5(cPtr, false);
  }

  public void beginAtomicOperation() {
    LinkJVMJNI.Create_beginAtomicOperation(swigCPtr, this);
  }

  public void endAtomicOperation() {
    LinkJVMJNI.Create_endAtomicOperation(swigCPtr, this);
  }

  public final static class Mode {
    public final static Create.Mode OffMode = new Create.Mode("OffMode");
    public final static Create.Mode PassiveMode = new Create.Mode("PassiveMode");
    public final static Create.Mode SafeMode = new Create.Mode("SafeMode");
    public final static Create.Mode FullMode = new Create.Mode("FullMode");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Mode swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Mode.class + " with value " + swigValue);
    }

    private Mode(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Mode(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Mode(String swigName, Mode swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Mode[] swigValues = { OffMode, PassiveMode, SafeMode, FullMode };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
