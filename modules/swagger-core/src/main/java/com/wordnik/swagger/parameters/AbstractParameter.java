package com.wordnik.swagger.parameters;

import com.wordnik.swagger.models.properties.*;

public abstract class AbstractParameter {
  Property type;
  String in;
  String name;
  String description;
  boolean required = false;

  public String getIn() {
    return in;
  }
  public void setIn(String in) {
    this.in = in;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public boolean getRequired() {
    return required;
  }
  public void setRequired(boolean required) {
    this.required = required;
  }

  public Property getType() {
    return type;
  }
  public void setType(Property type) {
    this.type = type;
  }
}