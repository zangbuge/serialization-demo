/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package avro;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class DataExample extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8938676757795940042L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataExample\",\"namespace\":\"avro\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"success\",\"type\":\"boolean\"},{\"name\":\"suit\",\"type\":{\"type\":\"enum\",\"name\":\"Suit\",\"symbols\":[\"SPADES\",\"DIAMONDS\",\"CLUBS\",\"HEARTS\"]}},{\"name\":\"addressList\",\"type\":{\"type\":\"array\",\"items\":\"string\",\"javaclass\":\"java.util.ArrayList\"}},{\"name\":\"demoMap\",\"type\":{\"type\":\"map\",\"values\":\"string\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public int age;
  @Deprecated public boolean success;
  @Deprecated public avro.Suit suit;
  @Deprecated public java.util.List<java.lang.CharSequence> addressList;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> demoMap;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DataExample() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param age The new value for age
   * @param success The new value for success
   * @param suit The new value for suit
   * @param addressList The new value for addressList
   * @param demoMap The new value for demoMap
   */
  public DataExample(java.lang.CharSequence name, java.lang.Integer age, java.lang.Boolean success, avro.Suit suit, java.util.List<java.lang.CharSequence> addressList, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> demoMap) {
    this.name = name;
    this.age = age;
    this.success = success;
    this.suit = suit;
    this.addressList = addressList;
    this.demoMap = demoMap;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return age;
    case 2: return success;
    case 3: return suit;
    case 4: return addressList;
    case 5: return demoMap;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: age = (java.lang.Integer)value$; break;
    case 2: success = (java.lang.Boolean)value$; break;
    case 3: suit = (avro.Suit)value$; break;
    case 4: addressList = (java.util.List<java.lang.CharSequence>)value$; break;
    case 5: demoMap = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'success' field.
   * @return The value of the 'success' field.
   */
  public java.lang.Boolean getSuccess() {
    return success;
  }

  /**
   * Sets the value of the 'success' field.
   * @param value the value to set.
   */
  public void setSuccess(java.lang.Boolean value) {
    this.success = value;
  }

  /**
   * Gets the value of the 'suit' field.
   * @return The value of the 'suit' field.
   */
  public avro.Suit getSuit() {
    return suit;
  }

  /**
   * Sets the value of the 'suit' field.
   * @param value the value to set.
   */
  public void setSuit(avro.Suit value) {
    this.suit = value;
  }

  /**
   * Gets the value of the 'addressList' field.
   * @return The value of the 'addressList' field.
   */
  public java.util.List<java.lang.CharSequence> getAddressList() {
    return addressList;
  }

  /**
   * Sets the value of the 'addressList' field.
   * @param value the value to set.
   */
  public void setAddressList(java.util.List<java.lang.CharSequence> value) {
    this.addressList = value;
  }

  /**
   * Gets the value of the 'demoMap' field.
   * @return The value of the 'demoMap' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getDemoMap() {
    return demoMap;
  }

  /**
   * Sets the value of the 'demoMap' field.
   * @param value the value to set.
   */
  public void setDemoMap(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.demoMap = value;
  }

  /**
   * Creates a new DataExample RecordBuilder.
   * @return A new DataExample RecordBuilder
   */
  public static avro.DataExample.Builder newBuilder() {
    return new avro.DataExample.Builder();
  }

  /**
   * Creates a new DataExample RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DataExample RecordBuilder
   */
  public static avro.DataExample.Builder newBuilder(avro.DataExample.Builder other) {
    return new avro.DataExample.Builder(other);
  }

  /**
   * Creates a new DataExample RecordBuilder by copying an existing DataExample instance.
   * @param other The existing instance to copy.
   * @return A new DataExample RecordBuilder
   */
  public static avro.DataExample.Builder newBuilder(avro.DataExample other) {
    return new avro.DataExample.Builder(other);
  }

  /**
   * RecordBuilder for DataExample instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataExample>
    implements org.apache.avro.data.RecordBuilder<DataExample> {

    private java.lang.CharSequence name;
    private int age;
    private boolean success;
    private avro.Suit suit;
    private java.util.List<java.lang.CharSequence> addressList;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> demoMap;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(avro.DataExample.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.success)) {
        this.success = data().deepCopy(fields()[2].schema(), other.success);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.suit)) {
        this.suit = data().deepCopy(fields()[3].schema(), other.suit);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.addressList)) {
        this.addressList = data().deepCopy(fields()[4].schema(), other.addressList);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.demoMap)) {
        this.demoMap = data().deepCopy(fields()[5].schema(), other.demoMap);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing DataExample instance
     * @param other The existing instance to copy.
     */
    private Builder(avro.DataExample other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.success)) {
        this.success = data().deepCopy(fields()[2].schema(), other.success);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.suit)) {
        this.suit = data().deepCopy(fields()[3].schema(), other.suit);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.addressList)) {
        this.addressList = data().deepCopy(fields()[4].schema(), other.addressList);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.demoMap)) {
        this.demoMap = data().deepCopy(fields()[5].schema(), other.demoMap);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public avro.DataExample.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public avro.DataExample.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public avro.DataExample.Builder setAge(int value) {
      validate(fields()[1], value);
      this.age = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public avro.DataExample.Builder clearAge() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'success' field.
      * @return The value.
      */
    public java.lang.Boolean getSuccess() {
      return success;
    }

    /**
      * Sets the value of the 'success' field.
      * @param value The value of 'success'.
      * @return This builder.
      */
    public avro.DataExample.Builder setSuccess(boolean value) {
      validate(fields()[2], value);
      this.success = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'success' field has been set.
      * @return True if the 'success' field has been set, false otherwise.
      */
    public boolean hasSuccess() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'success' field.
      * @return This builder.
      */
    public avro.DataExample.Builder clearSuccess() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'suit' field.
      * @return The value.
      */
    public avro.Suit getSuit() {
      return suit;
    }

    /**
      * Sets the value of the 'suit' field.
      * @param value The value of 'suit'.
      * @return This builder.
      */
    public avro.DataExample.Builder setSuit(avro.Suit value) {
      validate(fields()[3], value);
      this.suit = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'suit' field has been set.
      * @return True if the 'suit' field has been set, false otherwise.
      */
    public boolean hasSuit() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'suit' field.
      * @return This builder.
      */
    public avro.DataExample.Builder clearSuit() {
      suit = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'addressList' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getAddressList() {
      return addressList;
    }

    /**
      * Sets the value of the 'addressList' field.
      * @param value The value of 'addressList'.
      * @return This builder.
      */
    public avro.DataExample.Builder setAddressList(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.addressList = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'addressList' field has been set.
      * @return True if the 'addressList' field has been set, false otherwise.
      */
    public boolean hasAddressList() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'addressList' field.
      * @return This builder.
      */
    public avro.DataExample.Builder clearAddressList() {
      addressList = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'demoMap' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getDemoMap() {
      return demoMap;
    }

    /**
      * Sets the value of the 'demoMap' field.
      * @param value The value of 'demoMap'.
      * @return This builder.
      */
    public avro.DataExample.Builder setDemoMap(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[5], value);
      this.demoMap = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'demoMap' field has been set.
      * @return True if the 'demoMap' field has been set, false otherwise.
      */
    public boolean hasDemoMap() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'demoMap' field.
      * @return This builder.
      */
    public avro.DataExample.Builder clearDemoMap() {
      demoMap = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    public DataExample build() {
      try {
        DataExample record = new DataExample();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.age = fieldSetFlags()[1] ? this.age : (java.lang.Integer) defaultValue(fields()[1]);
        record.success = fieldSetFlags()[2] ? this.success : (java.lang.Boolean) defaultValue(fields()[2]);
        record.suit = fieldSetFlags()[3] ? this.suit : (avro.Suit) defaultValue(fields()[3]);
        record.addressList = fieldSetFlags()[4] ? this.addressList : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[4]);
        record.demoMap = fieldSetFlags()[5] ? this.demoMap : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[5]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
