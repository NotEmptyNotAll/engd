package com.vshvet.firstrelease.Entity;

import com.vshvet.firstrelease.ConstValue;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "parameters", schema = ConstValue.SCHEMA_NAME )
public class Parameters {
    private int paramId;
    private int elemFk;
    private int measurementUnitsFk;
    private Integer integerMin;
    private Integer integerMax;
    private Integer integerNum;
    private Double doubleMin;
    private Double doubleMax;
    private Double doubleNum;
    private String textData;
    private Byte logic;
    private String recordStatus;
    private String author;
    private String source;
    private Date date;
    private Elements elementsByElemFk;
    private MeasurementUnits measurementUnitsByMeasurementUnitsFk;

    @Id
    @Column(name = "param_Id", nullable = false)
    public int getParamId() {
        return paramId;
    }

    public void setParamId(int paramId) {
        this.paramId = paramId;
    }

    @Basic
    @Column(name = "elem_fk", insertable = false,updatable = false,nullable = false)
    public int getElemFk() {
        return elemFk;
    }

    public void setElemFk(int elemFk) {
        this.elemFk = elemFk;
    }

    @Basic
    @Column(name = "measurement_units_fk",insertable = false,updatable = false, nullable = false)
    public int getMeasurementUnitsFk() {
        return measurementUnitsFk;
    }

    public void setMeasurementUnitsFk(int measurementUnitsFk) {
        this.measurementUnitsFk = measurementUnitsFk;
    }

    @Basic
    @Column(name = "integer_min", nullable = true)
    public Integer getIntegerMin() {
        return integerMin;
    }

    public void setIntegerMin(Integer integerMin) {
        this.integerMin = integerMin;
    }

    @Basic
    @Column(name = "integer_max", nullable = true)
    public Integer getIntegerMax() {
        return integerMax;
    }

    public void setIntegerMax(Integer integerMax) {
        this.integerMax = integerMax;
    }

    @Basic
    @Column(name = "integer_num", nullable = true)
    public Integer getIntegerNum() {
        return integerNum;
    }

    public void setIntegerNum(Integer integerNum) {
        this.integerNum = integerNum;
    }

    @Basic
    @Column(name = "double_min", nullable = true)
    public Double getDoubleMin() {
        return doubleMin;
    }

    public void setDoubleMin(Double doubleMin) {
        this.doubleMin = doubleMin;
    }

    @Basic
    @Column(name = "double_max", nullable = true)
    public Double getDoubleMax() {
        return doubleMax;
    }

    public void setDoubleMax(Double doubleMax) {
        this.doubleMax = doubleMax;
    }

    @Basic
    @Column(name = "double_num", nullable = true)
    public Double getDoubleNum() {
        return doubleNum;
    }

    public void setDoubleNum(Double doubleNum) {
        this.doubleNum = doubleNum;
    }

    @Basic
    @Column(name = "text_data", nullable = true, length = 255)
    public String getTextData() {
        return textData;
    }

    public void setTextData(String textData) {
        this.textData = textData;
    }

    @Basic
    @Column(name = "logic", nullable = true)
    public Byte getLogic() {
        return logic;
    }

    public void setLogic(Byte logic) {
        this.logic = logic;
    }

    @Basic
    @Column(name = "record_status", nullable = false, length = 64)
    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    @Basic
    @Column(name = "author", nullable = false, length = 64)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "source", nullable = false, length = 64)
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parameters that = (Parameters) o;

        if (paramId != that.paramId) return false;
        if (elemFk != that.elemFk) return false;
        if (measurementUnitsFk != that.measurementUnitsFk) return false;
        if (integerMin != null ? !integerMin.equals(that.integerMin) : that.integerMin != null) return false;
        if (integerMax != null ? !integerMax.equals(that.integerMax) : that.integerMax != null) return false;
        if (integerNum != null ? !integerNum.equals(that.integerNum) : that.integerNum != null) return false;
        if (doubleMin != null ? !doubleMin.equals(that.doubleMin) : that.doubleMin != null) return false;
        if (doubleMax != null ? !doubleMax.equals(that.doubleMax) : that.doubleMax != null) return false;
        if (doubleNum != null ? !doubleNum.equals(that.doubleNum) : that.doubleNum != null) return false;
        if (textData != null ? !textData.equals(that.textData) : that.textData != null) return false;
        if (logic != null ? !logic.equals(that.logic) : that.logic != null) return false;
        if (recordStatus != null ? !recordStatus.equals(that.recordStatus) : that.recordStatus != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = paramId;
        result = 31 * result + elemFk;
        result = 31 * result + measurementUnitsFk;
        result = 31 * result + (integerMin != null ? integerMin.hashCode() : 0);
        result = 31 * result + (integerMax != null ? integerMax.hashCode() : 0);
        result = 31 * result + (integerNum != null ? integerNum.hashCode() : 0);
        result = 31 * result + (doubleMin != null ? doubleMin.hashCode() : 0);
        result = 31 * result + (doubleMax != null ? doubleMax.hashCode() : 0);
        result = 31 * result + (doubleNum != null ? doubleNum.hashCode() : 0);
        result = 31 * result + (textData != null ? textData.hashCode() : 0);
        result = 31 * result + (logic != null ? logic.hashCode() : 0);
        result = 31 * result + (recordStatus != null ? recordStatus.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "elem_fk", referencedColumnName = "elemID", nullable = false)
    public Elements getElementsByElemFk() {
        return elementsByElemFk;
    }

    public void setElementsByElemFk(Elements elementsByElemFk) {
        this.elementsByElemFk = elementsByElemFk;
    }

    @ManyToOne
    @JoinColumn(name = "measurement_units_fk", referencedColumnName = "id", nullable = false)
    public MeasurementUnits getMeasurementUnitsByMeasurementUnitsFk() {
        return measurementUnitsByMeasurementUnitsFk;
    }

    public void setMeasurementUnitsByMeasurementUnitsFk(MeasurementUnits measurementUnitsByMeasurementUnitsFk) {
        this.measurementUnitsByMeasurementUnitsFk = measurementUnitsByMeasurementUnitsFk;
    }
}
