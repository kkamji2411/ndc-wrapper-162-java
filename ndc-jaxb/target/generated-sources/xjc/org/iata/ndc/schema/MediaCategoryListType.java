
package org.iata.ndc.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaCategoryListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MediaCategoryListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="File_PDF"/&gt;
 *     &lt;enumeration value="File_Other"/&gt;
 *     &lt;enumeration value="Image_GIF"/&gt;
 *     &lt;enumeration value="Image_JPG"/&gt;
 *     &lt;enumeration value="Image_PNG"/&gt;
 *     &lt;enumeration value="Image_Other"/&gt;
 *     &lt;enumeration value="Link_FTP"/&gt;
 *     &lt;enumeration value="Link_MailTo"/&gt;
 *     &lt;enumeration value="Link_URL"/&gt;
 *     &lt;enumeration value="Link_URN"/&gt;
 *     &lt;enumeration value="Multimedia_MP3"/&gt;
 *     &lt;enumeration value="Multimedia_SWF"/&gt;
 *     &lt;enumeration value="Multimedia_Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MediaCategoryListType")
@XmlEnum
public enum MediaCategoryListType {

    @XmlEnumValue("File_PDF")
    FILE_PDF("File_PDF"),
    @XmlEnumValue("File_Other")
    FILE_OTHER("File_Other"),
    @XmlEnumValue("Image_GIF")
    IMAGE_GIF("Image_GIF"),
    @XmlEnumValue("Image_JPG")
    IMAGE_JPG("Image_JPG"),
    @XmlEnumValue("Image_PNG")
    IMAGE_PNG("Image_PNG"),
    @XmlEnumValue("Image_Other")
    IMAGE_OTHER("Image_Other"),
    @XmlEnumValue("Link_FTP")
    LINK_FTP("Link_FTP"),
    @XmlEnumValue("Link_MailTo")
    LINK_MAIL_TO("Link_MailTo"),
    @XmlEnumValue("Link_URL")
    LINK_URL("Link_URL"),
    @XmlEnumValue("Link_URN")
    LINK_URN("Link_URN"),
    @XmlEnumValue("Multimedia_MP3")
    MULTIMEDIA_MP_3("Multimedia_MP3"),
    @XmlEnumValue("Multimedia_SWF")
    MULTIMEDIA_SWF("Multimedia_SWF"),
    @XmlEnumValue("Multimedia_Other")
    MULTIMEDIA_OTHER("Multimedia_Other");
    private final String value;

    MediaCategoryListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaCategoryListType fromValue(String v) {
        for (MediaCategoryListType c: MediaCategoryListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
