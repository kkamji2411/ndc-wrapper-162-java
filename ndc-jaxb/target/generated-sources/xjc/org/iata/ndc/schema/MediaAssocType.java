
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Associated Media definition.
 * 
 * <p>Java class for MediaAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MediaGroupreference"/&gt;
 *         &lt;element name="MediaItems" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}MediaItemReference"/&gt;
 *                   &lt;element name="MediaLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAssocType", propOrder = {
    "mediaGroupreference",
    "mediaItems"
})
public class MediaAssocType {

    @XmlElement(name = "MediaGroupreference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object mediaGroupreference;
    @XmlElement(name = "MediaItems")
    protected List<MediaAssocType.MediaItems> mediaItems;

    /**
     * Gets the value of the mediaGroupreference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMediaGroupreference() {
        return mediaGroupreference;
    }

    /**
     * Sets the value of the mediaGroupreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMediaGroupreference(Object value) {
        this.mediaGroupreference = value;
    }

    /**
     * Gets the value of the mediaItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaAssocType.MediaItems }
     * 
     * 
     */
    public List<MediaAssocType.MediaItems> getMediaItems() {
        if (mediaItems == null) {
            mediaItems = new ArrayList<MediaAssocType.MediaItems>();
        }
        return this.mediaItems;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}MediaItemReference"/&gt;
     *         &lt;element name="MediaLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
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
        "mediaItemReference",
        "mediaLink"
    })
    public static class MediaItems {

        @XmlElement(name = "MediaItemReference")
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object mediaItemReference;
        @XmlElement(name = "MediaLink")
        @XmlSchemaType(name = "anyURI")
        protected String mediaLink;

        /**
         * Gets the value of the mediaItemReference property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMediaItemReference() {
            return mediaItemReference;
        }

        /**
         * Sets the value of the mediaItemReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMediaItemReference(Object value) {
            this.mediaItemReference = value;
        }

        /**
         * Gets the value of the mediaLink property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMediaLink() {
            return mediaLink;
        }

        /**
         * Sets the value of the mediaLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMediaLink(String value) {
            this.mediaLink = value;
        }

    }

}
