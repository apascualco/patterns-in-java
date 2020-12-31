package com.apascualco.pattern.creational.prototype.domain;

public interface OperationSystem extends Cloneable {

    Object clone() throws CloneNotSupportedException;
}
