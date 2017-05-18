
package org.iata.ndc.schema;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * SEAT MAP COMPONENT definition.
 * 
 * <p>Java class for SeatComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatComponentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Locations"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Location" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="Space"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="RowRange" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;choice maxOccurs="2"&gt;
 *                                                 &lt;element name="Begin" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                                                 &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                                               &lt;/choice&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="ColumnRange"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;choice maxOccurs="2"&gt;
 *                                                 &lt;element name="Begin" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
 *                                                 &lt;element name="End" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
 *                                               &lt;/choice&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Row"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                                         &lt;element name="Orientation" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="Column"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
 *                                         &lt;element name="Orientation" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/choice&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST}CodesetType"/&gt;
 *         &lt;element name="Dimensions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="RowEquivalent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                     &lt;element name="ColumnEquivalent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;element name="ActualSize"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="UOM" type="{http://www.iata.org/IATA/EDIST}SizeUnitSimpleType"/&gt;
 *                             &lt;element name="Length" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
 *                             &lt;element name="Width" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatComponentType", propOrder = {
    "locations",
    "type",
    "dimensions"
})
public class SeatComponentType {

    @XmlElementWrapper(name = "Locations", required = true)
    @XmlElement(name = "Location", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<SeatComponentType.Location> locations;
    @XmlElement(name = "Type", required = true)
    protected CodesetType type;
    @XmlElement(name = "Dimensions")
    protected SeatComponentType.Dimensions dimensions;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setType(CodesetType value) {
        this.type = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link SeatComponentType.Dimensions }
     *     
     */
    public SeatComponentType.Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatComponentType.Dimensions }
     *     
     */
    public void setDimensions(SeatComponentType.Dimensions value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
    }

    public List<SeatComponentType.Location> getLocations() {
        if (locations == null) {
            locations = new ArrayList<SeatComponentType.Location>();
        }
        return locations;
    }

    public void setLocations(List<SeatComponentType.Location> locations) {
        this.locations = locations;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="RowEquivalent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *           &lt;element name="ColumnEquivalent" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;/sequence&gt;
     *         &lt;element name="ActualSize"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="UOM" type="{http://www.iata.org/IATA/EDIST}SizeUnitSimpleType"/&gt;
     *                   &lt;element name="Length" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
     *                   &lt;element name="Width" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rowEquivalent",
        "columnEquivalent",
        "actualSize"
    })
    public static class Dimensions {

        @XmlElement(name = "RowEquivalent")
        protected BigDecimal rowEquivalent;
        @XmlElement(name = "ColumnEquivalent")
        protected BigDecimal columnEquivalent;
        @XmlElement(name = "ActualSize")
        protected SeatComponentType.Dimensions.ActualSize actualSize;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the rowEquivalent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRowEquivalent() {
            return rowEquivalent;
        }

        /**
         * Sets the value of the rowEquivalent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRowEquivalent(BigDecimal value) {
            this.rowEquivalent = value;
        }

        /**
         * Gets the value of the columnEquivalent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getColumnEquivalent() {
            return columnEquivalent;
        }

        /**
         * Sets the value of the columnEquivalent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setColumnEquivalent(BigDecimal value) {
            this.columnEquivalent = value;
        }

        /**
         * Gets the value of the actualSize property.
         * 
         * @return
         *     possible object is
         *     {@link SeatComponentType.Dimensions.ActualSize }
         *     
         */
        public SeatComponentType.Dimensions.ActualSize getActualSize() {
            return actualSize;
        }

        /**
         * Sets the value of the actualSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatComponentType.Dimensions.ActualSize }
         *     
         */
        public void setActualSize(SeatComponentType.Dimensions.ActualSize value) {
            this.actualSize = value;
        }

        /**
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<Object>();
            }
            return this.refs;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="UOM" type="{http://www.iata.org/IATA/EDIST}SizeUnitSimpleType"/&gt;
         *         &lt;element name="Length" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
         *         &lt;element name="Width" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "uom",
            "length",
            "width"
        })
        public static class ActualSize {

            @XmlElement(name = "UOM", required = true)
            @XmlSchemaType(name = "string")
            protected SizeUnitSimpleType uom;
            @XmlElement(name = "Length", required = true)
            protected String length;
            @XmlElement(name = "Width", required = true)
            protected String width;

            /**
             * Gets the value of the uom property.
             * 
             * @return
             *     possible object is
             *     {@link SizeUnitSimpleType }
             *     
             */
            public SizeUnitSimpleType getUOM() {
                return uom;
            }

            /**
             * Sets the value of the uom property.
             * 
             * @param value
             *     allowed object is
             *     {@link SizeUnitSimpleType }
             *     
             */
            public void setUOM(SizeUnitSimpleType value) {
                this.uom = value;
            }

            /**
             * Gets the value of the length property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLength() {
                return length;
            }

            /**
             * Sets the value of the length property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLength(String value) {
                this.length = value;
            }

            /**
             * Gets the value of the width property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWidth() {
                return width;
            }

            /**
             * Sets the value of the width property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWidth(String value) {
                this.width = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="Space"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RowRange" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice maxOccurs="2"&gt;
     *                             &lt;element name="Begin" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *                             &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ColumnRange"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice maxOccurs="2"&gt;
     *                             &lt;element name="Begin" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
     *                             &lt;element name="End" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="Row"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *                     &lt;element name="Orientation" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="Column"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
     *                     &lt;element name="Orientation" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *       &lt;/choice&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "space",
        "row",
        "column"
    })
    public static class Location {

        @XmlElement(name = "Space")
        protected SeatComponentType.Location.Space space;
        @XmlElement(name = "Row")
        protected SeatComponentType.Location.Row row;
        @XmlElement(name = "Column")
        protected SeatComponentType.Location.Column column;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the space property.
         * 
         * @return
         *     possible object is
         *     {@link SeatComponentType.Location.Space }
         *     
         */
        public SeatComponentType.Location.Space getSpace() {
            return space;
        }

        /**
         * Sets the value of the space property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatComponentType.Location.Space }
         *     
         */
        public void setSpace(SeatComponentType.Location.Space value) {
            this.space = value;
        }

        /**
         * Gets the value of the row property.
         * 
         * @return
         *     possible object is
         *     {@link SeatComponentType.Location.Row }
         *     
         */
        public SeatComponentType.Location.Row getRow() {
            return row;
        }

        /**
         * Sets the value of the row property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatComponentType.Location.Row }
         *     
         */
        public void setRow(SeatComponentType.Location.Row value) {
            this.row = value;
        }

        /**
         * Gets the value of the column property.
         * 
         * @return
         *     possible object is
         *     {@link SeatComponentType.Location.Column }
         *     
         */
        public SeatComponentType.Location.Column getColumn() {
            return column;
        }

        /**
         * Sets the value of the column property.
         * 
         * @param value
         *     allowed object is
         *     {@link SeatComponentType.Location.Column }
         *     
         */
        public void setColumn(SeatComponentType.Location.Column value) {
            this.column = value;
        }

        /**
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<Object>();
            }
            return this.refs;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
         *         &lt;element name="Orientation" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "position",
            "orientation"
        })
        public static class Column {

            @XmlElement(name = "Position", required = true)
            protected String position;
            @XmlElement(name = "Orientation")
            protected CodesetType orientation;

            /**
             * Gets the value of the position property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPosition() {
                return position;
            }

            /**
             * Sets the value of the position property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPosition(String value) {
                this.position = value;
            }

            /**
             * Gets the value of the orientation property.
             * 
             * @return
             *     possible object is
             *     {@link CodesetType }
             *     
             */
            public CodesetType getOrientation() {
                return orientation;
            }

            /**
             * Sets the value of the orientation property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodesetType }
             *     
             */
            public void setOrientation(CodesetType value) {
                this.orientation = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Position" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
         *         &lt;element name="Orientation" type="{http://www.iata.org/IATA/EDIST}CodesetType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "position",
            "orientation"
        })
        public static class Row {

            @XmlElement(name = "Position", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger position;
            @XmlElement(name = "Orientation")
            protected CodesetType orientation;

            /**
             * Gets the value of the position property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPosition() {
                return position;
            }

            /**
             * Sets the value of the position property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPosition(BigInteger value) {
                this.position = value;
            }

            /**
             * Gets the value of the orientation property.
             * 
             * @return
             *     possible object is
             *     {@link CodesetType }
             *     
             */
            public CodesetType getOrientation() {
                return orientation;
            }

            /**
             * Sets the value of the orientation property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodesetType }
             *     
             */
            public void setOrientation(CodesetType value) {
                this.orientation = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="RowRange" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice maxOccurs="2"&gt;
         *                   &lt;element name="Begin" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
         *                   &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
         *                 &lt;/choice&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ColumnRange"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice maxOccurs="2"&gt;
         *                   &lt;element name="Begin" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
         *                   &lt;element name="End" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
         *                 &lt;/choice&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "rowRange",
            "columnRange"
        })
        public static class Space {

            @XmlElement(name = "RowRange", required = true)
            protected List<SeatComponentType.Location.Space.RowRange> rowRange;
            @XmlElement(name = "ColumnRange", required = true)
            protected SeatComponentType.Location.Space.ColumnRange columnRange;

            /**
             * Gets the value of the rowRange property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the rowRange property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRowRange().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SeatComponentType.Location.Space.RowRange }
             * 
             * 
             */
            public List<SeatComponentType.Location.Space.RowRange> getRowRange() {
                if (rowRange == null) {
                    rowRange = new ArrayList<SeatComponentType.Location.Space.RowRange>();
                }
                return this.rowRange;
            }

            /**
             * Gets the value of the columnRange property.
             * 
             * @return
             *     possible object is
             *     {@link SeatComponentType.Location.Space.ColumnRange }
             *     
             */
            public SeatComponentType.Location.Space.ColumnRange getColumnRange() {
                return columnRange;
            }

            /**
             * Sets the value of the columnRange property.
             * 
             * @param value
             *     allowed object is
             *     {@link SeatComponentType.Location.Space.ColumnRange }
             *     
             */
            public void setColumnRange(SeatComponentType.Location.Space.ColumnRange value) {
                this.columnRange = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;choice maxOccurs="2"&gt;
             *         &lt;element name="Begin" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
             *         &lt;element name="End" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
             *       &lt;/choice&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "beginOrEnd"
            })
            public static class ColumnRange {

                @XmlElementRefs({
                    @XmlElementRef(name = "Begin", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "End", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false)
                })
                protected List<JAXBElement<String>> beginOrEnd;

                /**
                 * Gets the value of the beginOrEnd property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the beginOrEnd property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBeginOrEnd().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * 
                 * 
                 */
                public List<JAXBElement<String>> getBeginOrEnd() {
                    if (beginOrEnd == null) {
                        beginOrEnd = new ArrayList<JAXBElement<String>>();
                    }
                    return this.beginOrEnd;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;choice maxOccurs="2"&gt;
             *         &lt;element name="Begin" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
             *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
             *       &lt;/choice&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "beginOrEnd"
            })
            public static class RowRange {

                @XmlElementRefs({
                    @XmlElementRef(name = "End", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "Begin", namespace = "http://www.iata.org/IATA/EDIST", type = JAXBElement.class, required = false)
                })
                protected List<JAXBElement<BigInteger>> beginOrEnd;

                /**
                 * Gets the value of the beginOrEnd property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the beginOrEnd property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBeginOrEnd().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
                 * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
                 * 
                 * 
                 */
                public List<JAXBElement<BigInteger>> getBeginOrEnd() {
                    if (beginOrEnd == null) {
                        beginOrEnd = new ArrayList<JAXBElement<BigInteger>>();
                    }
                    return this.beginOrEnd;
                }

            }

        }

    }

}
