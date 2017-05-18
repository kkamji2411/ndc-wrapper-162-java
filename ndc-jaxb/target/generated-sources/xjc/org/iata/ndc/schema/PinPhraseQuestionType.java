
package org.iata.ndc.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Traveler Authentication Challenge Question definition.
 * 
 * <p>Java class for PinPhraseQuestionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinPhraseQuestionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;CustomerAuthStatusSimpleType"&gt;
 *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Challenge"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="SourceURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *                   &lt;element name="Parameters"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ChallengeQuestion" type="{http://www.iata.org/IATA/EDIST}ShortDescSimpleType" minOccurs="0"/&gt;
 *                             &lt;element name="PhrasePrompt" type="{http://www.iata.org/IATA/EDIST}ShortDescSimpleType" minOccurs="0"/&gt;
 *                             &lt;element name="Positions" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Position" maxOccurs="unbounded"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                             &lt;minInclusive value="1"/&gt;
 *                                             &lt;maxInclusive value="100"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Associations" type="{http://www.iata.org/IATA/EDIST}MultiAssociationType"/&gt;
 *         &lt;element name="AuthAccount" type="{http://www.iata.org/IATA/EDIST}AuthAccountType" minOccurs="0"/&gt;
 *         &lt;element name="Device" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST}DeviceType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST}Position" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OriginalTransactionID" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="source" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
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
@XmlType(name = "PinPhraseQuestionType", propOrder = {
    "status",
    "challenge",
    "associations",
    "authAccount",
    "device",
    "originalTransactionID"
})
@XmlSeeAlso({
    org.iata.ndc.schema.PINAuthTravelerType.AuthRequest.class
})
public class PinPhraseQuestionType {

    @XmlElement(name = "Status")
    protected PinPhraseQuestionType.Status status;
    @XmlElement(name = "Challenge", required = true)
    protected PinPhraseQuestionType.Challenge challenge;
    @XmlElement(name = "Associations", required = true)
    protected MultiAssociationType associations;
    @XmlElement(name = "AuthAccount")
    protected AuthAccountType authAccount;
    @XmlElement(name = "Device")
    protected PinPhraseQuestionType.Device device;
    @XmlElement(name = "OriginalTransactionID")
    protected PinPhraseQuestionType.OriginalTransactionID originalTransactionID;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseQuestionType.Status }
     *     
     */
    public PinPhraseQuestionType.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseQuestionType.Status }
     *     
     */
    public void setStatus(PinPhraseQuestionType.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the challenge property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseQuestionType.Challenge }
     *     
     */
    public PinPhraseQuestionType.Challenge getChallenge() {
        return challenge;
    }

    /**
     * Sets the value of the challenge property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseQuestionType.Challenge }
     *     
     */
    public void setChallenge(PinPhraseQuestionType.Challenge value) {
        this.challenge = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link MultiAssociationType }
     *     
     */
    public MultiAssociationType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiAssociationType }
     *     
     */
    public void setAssociations(MultiAssociationType value) {
        this.associations = value;
    }

    /**
     * Gets the value of the authAccount property.
     * 
     * @return
     *     possible object is
     *     {@link AuthAccountType }
     *     
     */
    public AuthAccountType getAuthAccount() {
        return authAccount;
    }

    /**
     * Sets the value of the authAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthAccountType }
     *     
     */
    public void setAuthAccount(AuthAccountType value) {
        this.authAccount = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseQuestionType.Device }
     *     
     */
    public PinPhraseQuestionType.Device getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseQuestionType.Device }
     *     
     */
    public void setDevice(PinPhraseQuestionType.Device value) {
        this.device = value;
    }

    /**
     * Gets the value of the originalTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link PinPhraseQuestionType.OriginalTransactionID }
     *     
     */
    public PinPhraseQuestionType.OriginalTransactionID getOriginalTransactionID() {
        return originalTransactionID;
    }

    /**
     * Sets the value of the originalTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PinPhraseQuestionType.OriginalTransactionID }
     *     
     */
    public void setOriginalTransactionID(PinPhraseQuestionType.OriginalTransactionID value) {
        this.originalTransactionID = value;
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
     *         &lt;element name="SourceURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
     *         &lt;element name="Parameters"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ChallengeQuestion" type="{http://www.iata.org/IATA/EDIST}ShortDescSimpleType" minOccurs="0"/&gt;
     *                   &lt;element name="PhrasePrompt" type="{http://www.iata.org/IATA/EDIST}ShortDescSimpleType" minOccurs="0"/&gt;
     *                   &lt;element name="Positions" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Position" maxOccurs="unbounded"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                   &lt;minInclusive value="1"/&gt;
     *                                   &lt;maxInclusive value="100"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
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
    @XmlType(name = "", propOrder = {
        "sourceURL",
        "parameters"
    })
    public static class Challenge {

        @XmlElement(name = "SourceURL")
        @XmlSchemaType(name = "anyURI")
        protected String sourceURL;
        @XmlElement(name = "Parameters")
        protected PinPhraseQuestionType.Challenge.Parameters parameters;

        /**
         * Gets the value of the sourceURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceURL() {
            return sourceURL;
        }

        /**
         * Sets the value of the sourceURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceURL(String value) {
            this.sourceURL = value;
        }

        /**
         * Gets the value of the parameters property.
         * 
         * @return
         *     possible object is
         *     {@link PinPhraseQuestionType.Challenge.Parameters }
         *     
         */
        public PinPhraseQuestionType.Challenge.Parameters getParameters() {
            return parameters;
        }

        /**
         * Sets the value of the parameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link PinPhraseQuestionType.Challenge.Parameters }
         *     
         */
        public void setParameters(PinPhraseQuestionType.Challenge.Parameters value) {
            this.parameters = value;
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
         *         &lt;element name="ChallengeQuestion" type="{http://www.iata.org/IATA/EDIST}ShortDescSimpleType" minOccurs="0"/&gt;
         *         &lt;element name="PhrasePrompt" type="{http://www.iata.org/IATA/EDIST}ShortDescSimpleType" minOccurs="0"/&gt;
         *         &lt;element name="Positions" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Position" maxOccurs="unbounded"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                         &lt;minInclusive value="1"/&gt;
         *                         &lt;maxInclusive value="100"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
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
            "challengeQuestion",
            "phrasePrompt",
            "positions"
        })
        public static class Parameters {

            @XmlElement(name = "ChallengeQuestion")
            protected String challengeQuestion;
            @XmlElement(name = "PhrasePrompt")
            protected String phrasePrompt;
            @XmlElementWrapper(name = "Positions")
            @XmlElement(name = "Position", namespace = "http://www.iata.org/IATA/EDIST", type = Integer.class)
            protected List<Integer> positions;

            /**
             * Gets the value of the challengeQuestion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChallengeQuestion() {
                return challengeQuestion;
            }

            /**
             * Sets the value of the challengeQuestion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChallengeQuestion(String value) {
                this.challengeQuestion = value;
            }

            /**
             * Gets the value of the phrasePrompt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhrasePrompt() {
                return phrasePrompt;
            }

            /**
             * Sets the value of the phrasePrompt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhrasePrompt(String value) {
                this.phrasePrompt = value;
            }

            public List<Integer> getPositions() {
                if (positions == null) {
                    positions = new ArrayList<Integer>();
                }
                return positions;
            }

            public void setPositions(List<Integer> positions) {
                this.positions = positions;
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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST}DeviceType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST}Position" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "position"
    })
    public static class Device
        extends DeviceType
    {

        @XmlElement(name = "Position")
        protected Position position;

        /**
         * Device Location geocoding information.
         * 
         * @return
         *     possible object is
         *     {@link Position }
         *     
         */
        public Position getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link Position }
         *     
         */
        public void setPosition(Position value) {
            this.position = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="source" type="{http://www.iata.org/IATA/EDIST}ProperNameSimpleType" /&gt;
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
    public static class OriginalTransactionID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "source")
        protected String source;

        /**
         * Gets the value of the value property.
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

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
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
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST&gt;CustomerAuthStatusSimpleType"&gt;
     *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST}ContextSimpleType" /&gt;
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
    public static class Status {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * 
         *         A data type for 3DS Program ACS Customer Authentication status. Examples: Y- Customer authenticated N- Customer not authenticated A- An authentication attempt occurred but could not be completed U- Unable to perform authentication
         *       
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

        /**
         * Gets the value of the context property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContext() {
            return context;
        }

        /**
         * Sets the value of the context property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContext(String value) {
            this.context = value;
        }

    }

}
