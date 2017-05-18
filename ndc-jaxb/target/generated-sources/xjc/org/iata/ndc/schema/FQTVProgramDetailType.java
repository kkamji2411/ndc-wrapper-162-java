
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Detail Frequent Traveler Program.
 * 
 * <p>Java class for FQTV_ProgramDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FQTV_ProgramDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST}FQTV_ProgramSummaryType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alliances" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Alliance" type="{http://www.iata.org/IATA/EDIST}FQTV_AllianceType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "FQTV_ProgramDetailType", propOrder = {
    "alliances"
})
public class FQTVProgramDetailType
    extends FQTVProgramSummaryType
{

    @XmlElementWrapper(name = "Alliances")
    @XmlElement(name = "Alliance", namespace = "http://www.iata.org/IATA/EDIST")
    protected List<FQTVAllianceType> alliances;

    public List<FQTVAllianceType> getAlliances() {
        if (alliances == null) {
            alliances = new ArrayList<FQTVAllianceType>();
        }
        return alliances;
    }

    public void setAlliances(List<FQTVAllianceType> alliances) {
        this.alliances = alliances;
    }

}
