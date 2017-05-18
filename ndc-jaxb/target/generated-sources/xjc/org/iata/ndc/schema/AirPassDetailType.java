
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * AIR PASS DETAIL representation.
 * 
 * <p>Java class for AirPassDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirPassDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}AirPassCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProgramName"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProgramCode" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="Holder" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}AgencyID"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}PartnerID"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirPassDetailType", propOrder = {
    "programName",
    "programCode",
    "holder"
})
public class AirPassDetailType
    extends AirPassCoreType
{

    @XmlElement(name = "ProgramName", required = true)
    protected AirPassDetailType.ProgramName programName;
    @XmlElement(name = "ProgramCode")
    protected String programCode;
    @XmlElement(name = "Holder")
    protected AirPassDetailType.Holder holder;

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link AirPassDetailType.ProgramName }
     *     
     */
    public AirPassDetailType.ProgramName getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPassDetailType.ProgramName }
     *     
     */
    public void setProgramName(AirPassDetailType.ProgramName value) {
        this.programName = value;
    }

    /**
     * Gets the value of the programCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCode() {
        return programCode;
    }

    /**
     * Sets the value of the programCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCode(String value) {
        this.programCode = value;
    }

    /**
     * Gets the value of the holder property.
     * 
     * @return
     *     possible object is
     *     {@link AirPassDetailType.Holder }
     *     
     */
    public AirPassDetailType.Holder getHolder() {
        return holder;
    }

    /**
     * Sets the value of the holder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPassDetailType.Holder }
     *     
     */
    public void setHolder(AirPassDetailType.Holder value) {
        this.holder = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}AgencyID"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}PartnerID"/&gt;
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
        "agencyID",
        "partnerID"
    })
    public static class Holder {

        @XmlElement(name = "AgencyID")
        protected AgencyIDType agencyID;
        @XmlElement(name = "PartnerID")
        protected PartnerCompanyIDType partnerID;

        /**
         * Gets the value of the agencyID property.
         * 
         * @return
         *     possible object is
         *     {@link AgencyIDType }
         *     
         */
        public AgencyIDType getAgencyID() {
            return agencyID;
        }

        /**
         * Sets the value of the agencyID property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgencyIDType }
         *     
         */
        public void setAgencyID(AgencyIDType value) {
            this.agencyID = value;
        }

        /**
         * Gets the value of the partnerID property.
         * 
         * @return
         *     possible object is
         *     {@link PartnerCompanyIDType }
         *     
         */
        public PartnerCompanyIDType getPartnerID() {
            return partnerID;
        }

        /**
         * Sets the value of the partnerID property.
         * 
         * @param value
         *     allowed object is
         *     {@link PartnerCompanyIDType }
         *     
         */
        public void setPartnerID(PartnerCompanyIDType value) {
            this.partnerID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;ProperNameSimpleType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ProgramName {

        @XmlValue
        protected String value;

        /**
         * A data type for Proper Name size constraint.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
