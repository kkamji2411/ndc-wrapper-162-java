
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * NDC Capability Model: CODESET
 * 
 *  ============
 * Representation(s)
 *  ============
 * • IATA PADIS Encoding
 * • Third-Pary Standard Encoding
 * • Implementer-Proprietary Encoding
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Code value, code definition and code table name may be specified
 * • URI to codeset information source may be specified
 * • Supports Language Localization (Alternate Language Values)
 * • Codeset Source Details (owner, location, etc.) may be specified
 * 
 *  ============
 * Metadata
 *  ============
 * • Yes
 * 
 * <p>Java class for CodesetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodesetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST}CodesetValueSimpleType"/&gt;
 *         &lt;element name="Definition" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="TableName" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="Link" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
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
@XmlType(name = "CodesetType", propOrder = {
    "code",
    "definition",
    "tableName",
    "link"
})
@XmlSeeAlso({
    InstantPurchaseType.class,
    org.iata.ndc.schema.PointOfSaleType.TouchPoint.Device.class,
    org.iata.ndc.schema.Failed.Code.class,
    org.iata.ndc.schema.InvDiscrepencyAlertType.Code.class,
    org.iata.ndc.schema.PaymentRulesNoticeType.FormOfPayment.Results.Code.class,
    FareCodeType.class,
    org.iata.ndc.schema.FareDetailType.FareIndicatorCode.class,
    FlightStatusType.class,
    FlightMealsType.class,
    org.iata.ndc.schema.AircraftFeaturesQueryType.Feature.class,
    org.iata.ndc.schema.SeatLocationType.Characteristic.class,
    RFICType.class,
    InstrSpecialBookingType.class,
    org.iata.ndc.schema.AlliancePreferencesType.Alliance.class,
    org.iata.ndc.schema.FlightPreferencesType.Aircraft.Cabins.Cabin.class,
    org.iata.ndc.schema.FlightPreferencesType.Aircraft.Seats.Characteristic.class,
    org.iata.ndc.schema.FlightPreferencesType.Aircraft.Seats.Position.class,
    org.iata.ndc.schema.FlightPreferencesType.Aircraft.Rows.Feature.class,
    org.iata.ndc.schema.FarePreferencesType.Type.class,
    org.iata.ndc.schema.TransferPreferencesType.Connection.Interline.class,
    AircraftCabinType.class,
    org.iata.ndc.schema.PaymentIssueAlertType.Payment.Failed.Code.class,
    org.iata.ndc.schema.PaymentIssueAlertType.Payment.Incomplete.Code.class,
    org.iata.ndc.schema.DeviceType.Type.class,
    org.iata.ndc.schema.PaymentStatusType.IncompletePayment.StatusCode.class,
    org.iata.ndc.schema.ItinReshopAlertsType.Exception.Code.class,
    CabinType.class
})
public class CodesetType {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Definition")
    protected String definition;
    @XmlElement(name = "TableName")
    protected String tableName;
    @XmlElement(name = "Link")
    @XmlSchemaType(name = "anyURI")
    protected String link;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
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

}
