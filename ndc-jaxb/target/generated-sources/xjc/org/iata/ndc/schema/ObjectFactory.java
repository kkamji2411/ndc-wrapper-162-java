
package org.iata.ndc.schema;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.iata.ndc.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AugmentationPoint_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AugmentationPoint");
    private final static QName _MetadataKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MetadataKey");
    private final static QName _DateTime_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DateTime");
    private final static QName _Day_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Day");
    private final static QName _MonthYear_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MonthYear");
    private final static QName _Month_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Month");
    private final static QName _ShortDate_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ShortDate");
    private final static QName _Timestamp_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Timestamp");
    private final static QName _Year_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Year");
    private final static QName _YearMonth_QNAME = new QName("http://www.iata.org/IATA/EDIST", "YearMonth");
    private final static QName _DatePeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DatePeriod");
    private final static QName _DateTimePeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DateTimePeriod");
    private final static QName _DayPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DayPeriod");
    private final static QName _MonthPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MonthPeriod");
    private final static QName _QuarterPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "QuarterPeriod");
    private final static QName _TimePeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TimePeriod");
    private final static QName _YearPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "YearPeriod");
    private final static QName _YearMonthPeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "YearMonthPeriod");
    private final static QName _AddressCore_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AddressCore");
    private final static QName _AddressDetail_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AddressDetail");
    private final static QName _PaymentAddress_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PaymentAddress");
    private final static QName _SimpleAddress_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SimpleAddress");
    private final static QName _StructuredAddress_QNAME = new QName("http://www.iata.org/IATA/EDIST", "StructuredAddress");
    private final static QName _AirPassCore_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AirPassCore");
    private final static QName _AirPassDetail_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AirPassDetail");
    private final static QName _Attributes_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Attributes");
    private final static QName _AllowanceDescription_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AllowanceDescription");
    private final static QName _DimensionAllowance_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DimensionAllowance");
    private final static QName _CityName_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CityName");
    private final static QName _AddressContact_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AddressContact");
    private final static QName _EmailContact_QNAME = new QName("http://www.iata.org/IATA/EDIST", "EmailContact");
    private final static QName _EmailAddress_QNAME = new QName("http://www.iata.org/IATA/EDIST", "EmailAddress");
    private final static QName _PhoneContact_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PhoneContact");
    private final static QName _PhoneNumber_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PhoneNumber");
    private final static QName _OtherContactMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OtherContactMethod");
    private final static QName _Commission_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Commission");
    private final static QName _CurrencyAmount_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CurrencyAmount");
    private final static QName _EncodedCurrencyAmount_QNAME = new QName("http://www.iata.org/IATA/EDIST", "EncodedCurrencyAmount");
    private final static QName _OriginDestinationReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OriginDestinationReference");
    private final static QName _DescriptionReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DescriptionReferences");
    private final static QName _MediaID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MediaID");
    private final static QName _MediaAttachment_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MediaAttachment");
    private final static QName _Direction_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Direction");
    private final static QName _DiscountAmount_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DiscountAmount");
    private final static QName _DiscountPercent_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DiscountPercent");
    private final static QName _FQTVProgramCore_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FQTV_ProgramCore");
    private final static QName _FQTVProgramSummary_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FQTV_ProgramSummary");
    private final static QName _FQTVProgramDetail_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FQTV_ProgramDetail");
    private final static QName _FQTVAlliance_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FQTV_Alliance");
    private final static QName _FQTVProgramID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FQTV_ProgramID");
    private final static QName _TravelerFQTVInformation_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TravelerFQTV_Information");
    private final static QName _ParticipatingProgram_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ParticipatingProgram");
    private final static QName _ParticipatingAirline_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ParticipatingAirline");
    private final static QName _InstantPurchase_QNAME = new QName("http://www.iata.org/IATA/EDIST", "InstantPurchase");
    private final static QName _LanguageCode_QNAME = new QName("http://www.iata.org/IATA/EDIST", "LanguageCode");
    private final static QName _CampaignReferral_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CampaignReferral");
    private final static QName _NodePath_QNAME = new QName("http://www.iata.org/IATA/EDIST", "NodePath");
    private final static QName _BankAccount_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BankAccount");
    private final static QName _DirectBill_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DirectBill");
    private final static QName _Remarks_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Remarks");
    private final static QName _PaymentCard_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PaymentCard");
    private final static QName _Penalty_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Penalty");
    private final static QName _DetailCurrencyPrice_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DetailCurrencyPrice");
    private final static QName _AwardPricing_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AwardPricing");
    private final static QName _CombinationPricing_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CombinationPricing");
    private final static QName _EncodedCurrencyPrice_QNAME = new QName("http://www.iata.org/IATA/EDIST", "EncodedCurrencyPrice");
    private final static QName _SimpleCurrencyPrice_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SimpleCurrencyPrice");
    private final static QName _AwardRedemption_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AwardRedemption");
    private final static QName _AdjustedFixedAmount_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AdjustedFixedAmount");
    private final static QName _AdjustedPercentage_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AdjustedPercentage");
    private final static QName _CurrencyAmountValue_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CurrencyAmountValue");
    private final static QName _PercentageValue_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PercentageValue");
    private final static QName _Promos_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Promos");
    private final static QName _ShoppingResponseID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ShoppingResponseID");
    private final static QName _StateProvCode_QNAME = new QName("http://www.iata.org/IATA/EDIST", "StateProvCode");
    private final static QName _StateProvQuery_QNAME = new QName("http://www.iata.org/IATA/EDIST", "StateProvQuery");
    private final static QName _StateCode_QNAME = new QName("http://www.iata.org/IATA/EDIST", "StateCode");
    private final static QName _TaxBreakdown_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TaxBreakdown");
    private final static QName _TaxExemption_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TaxExemption");
    private final static QName _TicketDesig_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TicketDesig");
    private final static QName _BilateralTimeLimits_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BilateralTimeLimits");
    private final static QName _PaymentTimeLimit_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PaymentTimeLimit");
    private final static QName _PriceGuaranteeTimeLimits_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PriceGuaranteeTimeLimits");
    private final static QName _AnonymousTraveler_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AnonymousTraveler");
    private final static QName _RecognizedTraveler_QNAME = new QName("http://www.iata.org/IATA/EDIST", "RecognizedTraveler");
    private final static QName _DetailPassenger_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DetailPassenger");
    private final static QName _SummaryPassenger_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SummaryPassenger");
    private final static QName _RetailerID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "RetailerID");
    private final static QName _MarketingCarrierAirline_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MarketingCarrierAirline");
    private final static QName _OperatingCarrierAirline_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OperatingCarrierAirline");
    private final static QName _RetailPartner_QNAME = new QName("http://www.iata.org/IATA/EDIST", "RetailPartner");
    private final static QName _ValidatingCarrier_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ValidatingCarrier");
    private final static QName _AggregatorID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AggregatorID");
    private final static QName _Aggregator_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Aggregator");
    private final static QName _EnabledSystem_QNAME = new QName("http://www.iata.org/IATA/EDIST", "EnabledSystem");
    private final static QName _RoleOfIntermediaryReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "RoleOfIntermediaryReference");
    private final static QName _SystemID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SystemID");
    private final static QName _AgentUser_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AgentUser");
    private final static QName _AgencyID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AgencyID");
    private final static QName _AgentUserID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AgentUserID");
    private final static QName _PartnerID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PartnerID");
    private final static QName _FulfillmentPartner_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FulfillmentPartner");
    private final static QName _Device_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Device");
    private final static QName _Document_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Document");
    private final static QName _DefaultPolicy_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DefaultPolicy");
    private final static QName _PolicyAugmentation_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PolicyAugmentation");
    private final static QName _PolicyLink_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PolicyLink");
    private final static QName _PointOfSale_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PointOfSale");
    private final static QName _Party_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Party");
    private final static QName _ORASender_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ORA_Sender");
    private final static QName _POASender_QNAME = new QName("http://www.iata.org/IATA/EDIST", "POA_Sender");
    private final static QName _AggregatorSender_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AggregatorSender");
    private final static QName _AgentUserSender_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AgentUserSender");
    private final static QName _EnabledSystemSender_QNAME = new QName("http://www.iata.org/IATA/EDIST", "EnabledSystemSender");
    private final static QName _MarketingCarrierSender_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MarketingCarrierSender");
    private final static QName _OperatingCarrierSender_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OperatingCarrierSender");
    private final static QName _RetailPartnerSender_QNAME = new QName("http://www.iata.org/IATA/EDIST", "RetailPartnerSender");
    private final static QName _TravelAgencySender_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TravelAgencySender");
    private final static QName _AggregatorRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AggregatorRecipient");
    private final static QName _AgentUserRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AgentUserRecipient");
    private final static QName _EnabledSystemRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST", "EnabledSystemRecipient");
    private final static QName _MarketingCarrierRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MarketingCarrierRecipient");
    private final static QName _OperatingCarrierRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OperatingCarrierRecipient");
    private final static QName _ORARecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ORA_Recipient");
    private final static QName _POARecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST", "POA_Recipient");
    private final static QName _RetailPartnerRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST", "RetailPartnerRecipient");
    private final static QName _TravelAgencyRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TravelAgencyRecipient");
    private final static QName _AggregatorParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AggregatorParticipant");
    private final static QName _EnabledSystemParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST", "EnabledSystemParticipant");
    private final static QName _MarketingCarrierParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MarketingCarrierParticipant");
    private final static QName _OperatingCarrierParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OperatingCarrierParticipant");
    private final static QName _ORAParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ORA_Participant");
    private final static QName _POAParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST", "POA_Participant");
    private final static QName _RetailSupplierParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST", "RetailSupplierParticipant");
    private final static QName _TravelAgencyParticipant_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TravelAgencyParticipant");
    private final static QName _Errors_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Errors");
    private final static QName _OtherInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OtherInfo");
    private final static QName _TrxProcessStatus_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TrxProcessStatus");
    private final static QName _TrxPayloadType_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TrxPayloadType");
    private final static QName _Alert_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Alert");
    private final static QName _Alerts_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Alerts");
    private final static QName _Associations_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Associations");
    private final static QName _InventoryDiscrepancyAlert_QNAME = new QName("http://www.iata.org/IATA/EDIST", "InventoryDiscrepancyAlert");
    private final static QName _PINAuthenticationAlert_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PIN_AuthenticationAlert");
    private final static QName _SecurePaymentAlert_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SecurePaymentAlert");
    private final static QName _MerchantName_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MerchantName");
    private final static QName _NoticesGrp_QNAME = new QName("http://www.iata.org/IATA/EDIST", "NoticesGrp");
    private final static QName _InventoryGuaranteeNotif_QNAME = new QName("http://www.iata.org/IATA/EDIST", "InventoryGuaranteeNotif");
    private final static QName _PaymentRulesNotice_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PaymentRulesNotice");
    private final static QName _PricingParametersNotice_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PricingParametersNotice");
    private final static QName _ServiceFilterNotice_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceFilterNotice");
    private final static QName _TaxExemptionNotice_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TaxExemptionNotice");
    private final static QName _BagDisclosureList_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BagDisclosureList");
    private final static QName _CheckedBagAllowanceList_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CheckedBagAllowanceList");
    private final static QName _CarryOnAllowanceList_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CarryOnAllowanceList");
    private final static QName _CompanyList_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CompanyList");
    private final static QName _ContentSourceList_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ContentSourceList");
    private final static QName _DisclosureList_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DisclosureList");
    private final static QName _ClassOfServiceList_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ClassOfServiceList");
    private final static QName _MediaList_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MediaList");
    private final static QName _InstructionsList_QNAME = new QName("http://www.iata.org/IATA/EDIST", "InstructionsList");
    private final static QName _PenaltyList_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PenaltyList");
    private final static QName _TermsList_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TermsList");
    private final static QName _PriceClassList_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PriceClassList");
    private final static QName _ServiceBundleList_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceBundleList");
    private final static QName _FareCode_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareCode");
    private final static QName _FareBasisCode_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareBasisCode");
    private final static QName _Fare_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Fare");
    private final static QName _FareDetail_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareDetail");
    private final static QName _FareCalculation_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareCalculation");
    private final static QName _FareRules_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareRules");
    private final static QName _TourCode_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TourCode");
    private final static QName _FareComponent_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareComponent");
    private final static QName _FareBasisCityPair_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareBasisCityPair");
    private final static QName _PricedMarketName_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PricedMarketName");
    private final static QName _PricedMileageZone_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PricedMileageZone");
    private final static QName _FareFiledIn_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareFiledIn");
    private final static QName _FareInd_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareInd");
    private final static QName _FareRuleCategory_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareRuleCategory");
    private final static QName _FareTextInd_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareTextInd");
    private final static QName _ClassOfService_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ClassOfService");
    private final static QName _StopLocations_QNAME = new QName("http://www.iata.org/IATA/EDIST", "StopLocations");
    private final static QName _Arrival_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Arrival");
    private final static QName _DepartureDate_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DepartureDate");
    private final static QName _FlightDistance_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FlightDistance");
    private final static QName _FlightDuration_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FlightDuration");
    private final static QName _TotalJourney_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TotalJourney");
    private final static QName _FlightStatus_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FlightStatus");
    private final static QName _MealsServed_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MealsServed");
    private final static QName _Frequency_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Frequency");
    private final static QName _FlightMileage_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FlightMileage");
    private final static QName _FlightDisplayPricingMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FlightDisplayPricingMethod");
    private final static QName _FlightSegmentType_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FlightSegmentType");
    private final static QName _AircraftCore_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AircraftCore");
    private final static QName _AircraftSummary_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AircraftSummary");
    private final static QName _Equipment_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Equipment");
    private final static QName _AircraftCodeQuery_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AircraftCodeQuery");
    private final static QName _AircraftFeaturesQuery_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AircraftFeaturesQuery");
    private final static QName _AircraftCabin_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AircraftCabin");
    private final static QName _OriginDestinationReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OriginDestinationReferences");
    private final static QName _Itinerary_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Itinerary");
    private final static QName _OfferItemID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferItemID");
    private final static QName _OrderItemID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderItemID");
    private final static QName _AircraftKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AircraftKey");
    private final static QName _AircraftReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AircraftReference");
    private final static QName _AirportKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AirportKey");
    private final static QName _AirportReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AirportReference");
    private final static QName _BagDisclosureReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BagDisclosureReferences");
    private final static QName _CheckedBagReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CheckedBagReferences");
    private final static QName _CarryOnReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CarryOnReferences");
    private final static QName _BagDisclosureKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BagDisclosureKey");
    private final static QName _BagDisclosureReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BagDisclosureReference");
    private final static QName _CheckedBagKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CheckedBagKey");
    private final static QName _CheckedBagReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CheckedBagReference");
    private final static QName _CarryOnKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CarryOnKey");
    private final static QName _CarryOnReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CarryOnReference");
    private final static QName _ContentSourceKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ContentSourceKey");
    private final static QName _ContentSourceReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ContentSourceReference");
    private final static QName _ContentSourceReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ContentSourceReferences");
    private final static QName _ListKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ListKey");
    private final static QName _DisclosureKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DisclosureKey");
    private final static QName _DisclosureReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DisclosureReference");
    private final static QName _DisclosureReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DisclosureReferences");
    private final static QName _EquivalentIDKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "EquivalentID_Key");
    private final static QName _EquivalentReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "EquivalentReference");
    private final static QName _ExitPosKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ExitPosKey");
    private final static QName _ExitPosReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ExitPosReference");
    private final static QName _ExitPosReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ExitPosReferences");
    private final static QName _FareKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareKey");
    private final static QName _FareReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareReference");
    private final static QName _FareBasisKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareBasisKey");
    private final static QName _FareBasisReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareBasisReference");
    private final static QName _FareBasisReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareBasisReferences");
    private final static QName _MetadataReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MetadataReferences");
    private final static QName _ServiceClassKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceClassKey");
    private final static QName _ServiceClassReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceClassReference");
    private final static QName _ServiceClassReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceClassReferences");
    private final static QName _OriginDestinationKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OriginDestinationKey");
    private final static QName _SegmentKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SegmentKey");
    private final static QName _GroupReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "GroupReference");
    private final static QName _MediaItemKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MediaItemKey");
    private final static QName _MediaGroupKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MediaGroupKey");
    private final static QName _MediaGroupreference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MediaGroupreference");
    private final static QName _MediaItemReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MediaItemReference");
    private final static QName _MediaItemReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MediaItemReferences");
    private final static QName _OfferKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferKey");
    private final static QName _OfferReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferReference");
    private final static QName _OfferReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferReferences");
    private final static QName _OfferInstructionKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferInstructionKey");
    private final static QName _OfferInstructionReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferInstructionReference");
    private final static QName _OfferInstructionReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferInstructionReferences");
    private final static QName _OfferPenaltyKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferPenaltyKey");
    private final static QName _OfferPenaltyReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferPenaltyReferences");
    private final static QName _OfferPenaltyReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferPenaltyReference");
    private final static QName _OfferTermsKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferTermsKey");
    private final static QName _OfferTermReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferTermReference");
    private final static QName _OfferTermReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferTermReferences");
    private final static QName _OrderKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderKey");
    private final static QName _OrderReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderReference");
    private final static QName _OrderReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderReferences");
    private final static QName _OrderItemKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderItemKey");
    private final static QName _OrderItemReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderItemReference");
    private final static QName _OrderItemReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderItemReferences");
    private final static QName _OrderInstructionKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderInstructionKey");
    private final static QName _OrderInstructionReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderInstructionReference");
    private final static QName _OrderInstructionReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderInstructionReferences");
    private final static QName _OrderPenaltyKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderPenaltyKey");
    private final static QName _OrderPenaltyReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderPenaltyReferences");
    private final static QName _OrderPenaltyReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderPenaltyReference");
    private final static QName _PassengerKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PassengerKey");
    private final static QName _PassengerReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PassengerReference");
    private final static QName _PassengerReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PassengerReferences");
    private final static QName _PriceClassKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PriceClassKey");
    private final static QName _PriceClassReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PriceClassReference");
    private final static QName _PriceClassReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PriceClassReferences");
    private final static QName _SeatKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatKey");
    private final static QName _SeatReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatReference");
    private final static QName _SeatReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatReferences");
    private final static QName _SeatDisplayKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatDisplayKey");
    private final static QName _SeatDisplayRef_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatDisplayRef");
    private final static QName _SeatDisplayReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatDisplayReferences");
    private final static QName _ComponentKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ComponentKey");
    private final static QName _ComponentReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ComponentReference");
    private final static QName _ComponentReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ComponentReferences");
    private final static QName _SeatMsgKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatMsgKey");
    private final static QName _SeatMsgReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatMsgReference");
    private final static QName _SeatMsgReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatMsgReferences");
    private final static QName _ServiceKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceKey");
    private final static QName _ServiceReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceReference");
    private final static QName _ServiceReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceReferences");
    private final static QName _BundleKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BundleKey");
    private final static QName _BundleReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BundleReference");
    private final static QName _BundleReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BundleReferences");
    private final static QName _TravelerKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TravelerKey");
    private final static QName _TravelerReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TravelerReference");
    private final static QName _TravelerReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TravelerReferences");
    private final static QName _StateProvKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "StateProvKey");
    private final static QName _StateProvReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "StateProvReference");
    private final static QName _StateProvReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "StateProvReferences");
    private final static QName _WingPosKey_QNAME = new QName("http://www.iata.org/IATA/EDIST", "WingPosKey");
    private final static QName _WingPosReference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "WingPosReference");
    private final static QName _WingPosReferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "WingPosReferences");
    private final static QName _AddressMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AddressMetadata");
    private final static QName _AircraftMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AircraftMetadata");
    private final static QName _AirportMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AirportMetadata");
    private final static QName _CityMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CityMetadata");
    private final static QName _CodesetMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CodesetMetadata");
    private final static QName _ContactMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ContactMetadata");
    private final static QName _ContentMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ContentMetadata");
    private final static QName _CountryMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CountryMetadata");
    private final static QName _DescriptionMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DescriptionMetadata");
    private final static QName _EquivalentIDMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "EquivalentID_Metadata");
    private final static QName _LanguageMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "LanguageMetadata");
    private final static QName _MediaMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MediaMetadata");
    private final static QName _PaymentCardMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PaymentCardMetadata");
    private final static QName _PaymentFormMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PaymentFormMetadata");
    private final static QName _PriceMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PriceMetadata");
    private final static QName _RuleMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "RuleMetadata");
    private final static QName _StateProvMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "StateProvMetadata");
    private final static QName _ZoneMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ZoneMetadata");
    private final static QName _CheckedBagMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CheckedBagMetadata");
    private final static QName _CarryOnBagMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CarryOnBagMetadata");
    private final static QName _BaggageDisclosureMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BaggageDisclosureMetadata");
    private final static QName _BaggageDetailMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BaggageDetailMetadata");
    private final static QName _BaggageQueryMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BaggageQueryMetadata");
    private final static QName _ItineraryMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ItineraryMetadata");
    private final static QName _DirectionMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DirectionMetadata");
    private final static QName _DisclosureMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DisclosureMetadata");
    private final static QName _OfferMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferMetadata");
    private final static QName _OfferInstructionMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferInstructionMetadata");
    private final static QName _OfferPenaltyMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferPenaltyMetadata");
    private final static QName _OfferTermsMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferTermsMetadata");
    private final static QName _DiscountMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DiscountMetadata");
    private final static QName _BaggagePricingQualifier_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BaggagePricingQualifier");
    private final static QName _OrderKeys_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderKeys");
    private final static QName _PaymentCardQualifiers_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PaymentCardQualifiers");
    private final static QName _ServiceQualifier_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceQualifier");
    private final static QName _SocialMediaQualifiers_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SocialMediaQualifiers");
    private final static QName _SpecialFareQualifiers_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SpecialFareQualifiers");
    private final static QName _SpecialNeedQualifiers_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SpecialNeedQualifiers");
    private final static QName _TripPurposeQualifier_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TripPurposeQualifier");
    private final static QName _SeatMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatMetadata");
    private final static QName _SeatMapMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatMapMetadata");
    private final static QName _TravelerMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TravelerMetadata");
    private final static QName _PenaltyMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PenaltyMetadata");
    private final static QName _PassengerMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PassengerMetadata");
    private final static QName _AssociatedService_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AssociatedService");
    private final static QName _AssociatedTraveler_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AssociatedTraveler");
    private final static QName _IncludedService_QNAME = new QName("http://www.iata.org/IATA/EDIST", "IncludedService");
    private final static QName _OfferDetailAssociation_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferDetailAssociation");
    private final static QName _OtherAssociation_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OtherAssociation");
    private final static QName _BaggageOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BaggageOffer");
    private final static QName _FarePriceDetail_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FarePriceDetail");
    private final static QName _FareLeadPrices_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareLeadPrices");
    private final static QName _OtherOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OtherOffer");
    private final static QName _SeatOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatOffer");
    private final static QName _OfferInstructions_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferInstructions");
    private final static QName _ClassOfServiceUpgrade_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ClassOfServiceUpgrade");
    private final static QName _FreeFormTextInstruction_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FreeFormTextInstruction");
    private final static QName _InventoryGuarantee_QNAME = new QName("http://www.iata.org/IATA/EDIST", "InventoryGuarantee");
    private final static QName _Match_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Match");
    private final static QName _PTCPriced_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PTC_Priced");
    private final static QName _OfferPenalty_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferPenalty");
    private final static QName _AllOffersSnapshot_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AllOffersSnapshot");
    private final static QName _AirlineOfferSnapshot_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AirlineOfferSnapshot");
    private final static QName _OfferItemStatus_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OfferItemStatus");
    private final static QName _TicketByTimeLimit_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TicketByTimeLimit");
    private final static QName _OrderAssociations_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderAssociations");
    private final static QName _OrderCommision_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderCommision");
    private final static QName _OrderID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderID");
    private final static QName _BaggageItem_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BaggageItem");
    private final static QName _BaggageOfferItem_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BaggageOfferItem");
    private final static QName _DetailedFlightItem_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DetailedFlightItem");
    private final static QName _FlightItem_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FlightItem");
    private final static QName _OtherItem_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OtherItem");
    private final static QName _OtherOfferItem_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OtherOfferItem");
    private final static QName _PaymentStatus_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PaymentStatus");
    private final static QName _SeatOfferItem_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatOfferItem");
    private final static QName _Status_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Status");
    private final static QName _BankAccountMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BankAccountMethod");
    private final static QName _CashMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CashMethod");
    private final static QName _DirectBillMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DirectBillMethod");
    private final static QName _MiscChargeMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MiscChargeMethod");
    private final static QName _OtherMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OtherMethod");
    private final static QName _PaymentCardMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PaymentCardMethod");
    private final static QName _RedemptionMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "RedemptionMethod");
    private final static QName _VoucherMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "VoucherMethod");
    private final static QName _AltBaggageOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AltBaggageOffer");
    private final static QName _AltPricedFlightOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AltPricedFlightOffer");
    private final static QName _AltOtherOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AltOtherOffer");
    private final static QName _AltSeatOffer_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AltSeatOffer");
    private final static QName _OrderPenalty_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderPenalty");
    private final static QName _ItemStatus_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ItemStatus");
    private final static QName _CarrierFeeInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CarrierFeeInfo");
    private final static QName _CarrierFeeTax_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CarrierFeeTax");
    private final static QName _AddlReferenceID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AddlReferenceID");
    private final static QName _CheckedInAirlineInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CheckedInAirlineInfo");
    private final static QName _CouponInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CouponInfo");
    private final static QName _CouponEffective_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CouponEffective");
    private final static QName _CouponSoldAirline_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CouponSoldAirline");
    private final static QName _CurrentAirlineInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CurrentAirlineInfo");
    private final static QName _FlightSegment_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FlightSegment");
    private final static QName _FlownAirlineInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FlownAirlineInfo");
    private final static QName _InConnectionWithInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST", "InConnectionWithInfo");
    private final static QName _TicketDocQuantity_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TicketDocQuantity");
    private final static QName _Traveller_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Traveller");
    private final static QName _BaseFare_QNAME = new QName("http://www.iata.org/IATA/EDIST", "BaseFare");
    private final static QName _EquivFare_QNAME = new QName("http://www.iata.org/IATA/EDIST", "EquivFare");
    private final static QName _FareInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FareInfo");
    private final static QName _Total_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Total");
    private final static QName _UnstructuredFareCalcInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST", "UnstructuredFareCalcInfo");
    private final static QName _PaymentForm_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PaymentForm");
    private final static QName _PaymentMethod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PaymentMethod");
    private final static QName _ExitRowPosition_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ExitRowPosition");
    private final static QName _WingPosition_QNAME = new QName("http://www.iata.org/IATA/EDIST", "WingPosition");
    private final static QName _SeatData_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SeatData");
    private final static QName _RFIC_QNAME = new QName("http://www.iata.org/IATA/EDIST", "RFIC");
    private final static QName _ServiceCore_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceCore");
    private final static QName _ServiceFilter_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceFilter");
    private final static QName _AirportFulfillmentLocation_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AirportFulfillmentLocation");
    private final static QName _OtherFulfillmentLocation_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OtherFulfillmentLocation");
    private final static QName _ServicePrice_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServicePrice");
    private final static QName _ServiceFulfillment_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceFulfillment");
    private final static QName _ServiceCoupon_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceCoupon");
    private final static QName _ServiceItemQuantityRules_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceItemQuantityRules");
    private final static QName _EligibleServiceClassUpgrades_QNAME = new QName("http://www.iata.org/IATA/EDIST", "EligibleServiceClassUpgrades");
    private final static QName _ServiceCommissionInfo_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceCommissionInfo");
    private final static QName _ServiceFreeFormTextInstruction_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceFreeFormTextInstruction");
    private final static QName _ServiceBookingInstructions_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceBookingInstructions");
    private final static QName _ServiceID_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ServiceID");
    private final static QName _AirportCityDeparture_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AirportCityDeparture");
    private final static QName _AirportCityArrival_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AirportCityArrival");
    private final static QName _CountryDeparture_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CountryDeparture");
    private final static QName _CountryArrival_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CountryArrival");
    private final static QName _ReferencePointDeparture_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ReferencePointDeparture");
    private final static QName _ReferencePointArrival_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ReferencePointArrival");
    private final static QName _StateProvDeparture_QNAME = new QName("http://www.iata.org/IATA/EDIST", "StateProvDeparture");
    private final static QName _StateProvArrival_QNAME = new QName("http://www.iata.org/IATA/EDIST", "StateProvArrival");
    private final static QName _LeadDatePeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "LeadDatePeriod");
    private final static QName _LeadTimePeriod_QNAME = new QName("http://www.iata.org/IATA/EDIST", "LeadTimePeriod");
    private final static QName _DiscountProgramQualifier_QNAME = new QName("http://www.iata.org/IATA/EDIST", "DiscountProgramQualifier");
    private final static QName _StayPeriodDateRange_QNAME = new QName("http://www.iata.org/IATA/EDIST", "StayPeriodDateRange");
    private final static QName _StayPeriodSeason_QNAME = new QName("http://www.iata.org/IATA/EDIST", "StayPeriodSeason");
    private final static QName _GroupBudget_QNAME = new QName("http://www.iata.org/IATA/EDIST", "GroupBudget");
    private final static QName _PerPersonBudget_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PerPersonBudget");
    private final static QName _AirlinePreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AirlinePreferences");
    private final static QName _AlliancePreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AlliancePreferences");
    private final static QName _CabinPreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "CabinPreferences");
    private final static QName _FlightPreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FlightPreferences");
    private final static QName _FarePreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FarePreferences");
    private final static QName _PricingMethodPreference_QNAME = new QName("http://www.iata.org/IATA/EDIST", "PricingMethodPreference");
    private final static QName _SegMaxTimePreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "SegMaxTimePreferences");
    private final static QName _TransferPreferences_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TransferPreferences");
    private final static QName _TripTime_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TripTime");
    private final static QName _TripDistance_QNAME = new QName("http://www.iata.org/IATA/EDIST", "TripDistance");
    private final static QName _Affinity_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Affinity");
    private final static QName _Attribute_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Attribute");
    private final static QName _FlightSpecific_QNAME = new QName("http://www.iata.org/IATA/EDIST", "FlightSpecific");
    private final static QName _AirShoppingProcessing_QNAME = new QName("http://www.iata.org/IATA/EDIST", "AirShoppingProcessing");
    private final static QName _ItinReshopParameters_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ItinReshopParameters");
    private final static QName _ShoppingQueryTypeGroup_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ShoppingQueryTypeGroup");
    private final static QName _Metadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Metadata");
    private final static QName _ItinReshopProcessing_QNAME = new QName("http://www.iata.org/IATA/EDIST", "ItinReshopProcessing");
    private final static QName _OrderCancelParameters_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderCancelParameters");
    private final static QName _OrderCancelProcessing_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderCancelProcessing");
    private final static QName _OrderChangeMetadata_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderChangeMetadata");
    private final static QName _OrderListParameters_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderListParameters");
    private final static QName _OrderListProcessing_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderListProcessing");
    private final static QName _OrderViewProcessing_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderViewProcessing");
    private final static QName _OrderRetrieveParameters_QNAME = new QName("http://www.iata.org/IATA/EDIST", "OrderRetrieveParameters");
    private final static QName _OfferGroupSizeTypeMinimum_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Minimum");
    private final static QName _OfferGroupSizeTypeMaximum_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Maximum");
    private final static QName _SeatComponentTypeLocationsLocationSpaceColumnRangeBegin_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Begin");
    private final static QName _SeatComponentTypeLocationsLocationSpaceColumnRangeEnd_QNAME = new QName("http://www.iata.org/IATA/EDIST", "End");
    private final static QName _ListOfServiceBundleTypeServiceBundleSelectionMinimumQuantity_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MinimumQuantity");
    private final static QName _ListOfServiceBundleTypeServiceBundleSelectionMaximumQuantity_QNAME = new QName("http://www.iata.org/IATA/EDIST", "MaximumQuantity");
    private final static QName _MsgPartiesTypeParticipants_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Participants");
    private final static QName _MsgPartiesTypeRecipient_QNAME = new QName("http://www.iata.org/IATA/EDIST", "Recipient");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.iata.ndc.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CarryOnAllowanceType }
     * 
     */
    public CarryOnAllowanceType createCarryOnAllowanceType() {
        return new CarryOnAllowanceType();
    }

    /**
     * Create an instance of {@link CheckedBagAllowanceType }
     * 
     */
    public CheckedBagAllowanceType createCheckedBagAllowanceType() {
        return new CheckedBagAllowanceType();
    }

    /**
     * Create an instance of {@link BagAllowancePieceType }
     * 
     */
    public BagAllowancePieceType createBagAllowancePieceType() {
        return new BagAllowancePieceType();
    }

    /**
     * Create an instance of {@link BagAllowanceWeightType }
     * 
     */
    public BagAllowanceWeightType createBagAllowanceWeightType() {
        return new BagAllowanceWeightType();
    }

    /**
     * Create an instance of {@link BookingReferenceType }
     * 
     */
    public BookingReferenceType createBookingReferenceType() {
        return new BookingReferenceType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link KeyWordType }
     * 
     */
    public KeyWordType createKeyWordType() {
        return new KeyWordType();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption }
     * 
     */
    public LoyaltyRedemption createLoyaltyRedemption() {
        return new LoyaltyRedemption();
    }

    /**
     * Create an instance of {@link PaymentForms }
     * 
     */
    public PaymentForms createPaymentForms() {
        return new PaymentForms();
    }

    /**
     * Create an instance of {@link Voucher }
     * 
     */
    public Voucher createVoucher() {
        return new Voucher();
    }

    /**
     * Create an instance of {@link PositionType }
     * 
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link TravelerCoreType }
     * 
     */
    public TravelerCoreType createTravelerCoreType() {
        return new TravelerCoreType();
    }

    /**
     * Create an instance of {@link TravelerSummaryType }
     * 
     */
    public TravelerSummaryType createTravelerSummaryType() {
        return new TravelerSummaryType();
    }

    /**
     * Create an instance of {@link PassengerSummaryType }
     * 
     */
    public PassengerSummaryType createPassengerSummaryType() {
        return new PassengerSummaryType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Passenger }
     * 
     */
    public org.iata.ndc.schema.Passenger createPassenger() {
        return new org.iata.ndc.schema.Passenger();
    }

    /**
     * Create an instance of {@link PrimaryContact }
     * 
     */
    public PrimaryContact createPrimaryContact() {
        return new PrimaryContact();
    }

    /**
     * Create an instance of {@link AgencyCoreRepType }
     * 
     */
    public AgencyCoreRepType createAgencyCoreRepType() {
        return new AgencyCoreRepType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Failed }
     * 
     */
    public org.iata.ndc.schema.Failed createFailed() {
        return new org.iata.ndc.schema.Failed();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType }
     * 
     */
    public SecurePaymentPaxInfoType createSecurePaymentPaxInfoType() {
        return new SecurePaymentPaxInfoType();
    }

    /**
     * Create an instance of {@link Warnings }
     * 
     */
    public Warnings createWarnings() {
        return new Warnings();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType }
     * 
     */
    public PriceVarianceRuleNoticeType createPriceVarianceRuleNoticeType() {
        return new PriceVarianceRuleNoticeType();
    }

    /**
     * Create an instance of {@link AdvanceTicketing }
     * 
     */
    public AdvanceTicketing createAdvanceTicketing() {
        return new AdvanceTicketing();
    }

    /**
     * Create an instance of {@link CorporateFare }
     * 
     */
    public CorporateFare createCorporateFare() {
        return new CorporateFare();
    }

    /**
     * Create an instance of {@link MinimumStay }
     * 
     */
    public MinimumStay createMinimumStay() {
        return new MinimumStay();
    }

    /**
     * Create an instance of {@link MaximumStay }
     * 
     */
    public MaximumStay createMaximumStay() {
        return new MaximumStay();
    }

    /**
     * Create an instance of {@link FileFareType }
     * 
     */
    public FileFareType createFileFareType() {
        return new FileFareType();
    }

    /**
     * Create an instance of {@link FlightDepartureType }
     * 
     */
    public FlightDepartureType createFlightDepartureType() {
        return new FlightDepartureType();
    }

    /**
     * Create an instance of {@link ResDateTime }
     * 
     */
    public ResDateTime createResDateTime() {
        return new ResDateTime();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.OriginDestination }
     * 
     */
    public org.iata.ndc.schema.OriginDestination createOriginDestination() {
        return new org.iata.ndc.schema.OriginDestination();
    }

    /**
     * Create an instance of {@link FlightMetadataType }
     * 
     */
    public FlightMetadataType createFlightMetadataType() {
        return new FlightMetadataType();
    }

    /**
     * Create an instance of {@link PromotionType }
     * 
     */
    public PromotionType createPromotionType() {
        return new PromotionType();
    }

    /**
     * Create an instance of {@link OfferAssociationsType }
     * 
     */
    public OfferAssociationsType createOfferAssociationsType() {
        return new OfferAssociationsType();
    }

    /**
     * Create an instance of {@link PricedFlightOfferType }
     * 
     */
    public PricedFlightOfferType createPricedFlightOfferType() {
        return new PricedFlightOfferType();
    }

    /**
     * Create an instance of {@link LeadPrice }
     * 
     */
    public LeadPrice createLeadPrice() {
        return new LeadPrice();
    }

    /**
     * Create an instance of {@link OrderItemDetails }
     * 
     */
    public OrderItemDetails createOrderItemDetails() {
        return new OrderItemDetails();
    }

    /**
     * Create an instance of {@link SeatItemType }
     * 
     */
    public SeatItemType createSeatItemType() {
        return new SeatItemType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.TimeLimits }
     * 
     */
    public org.iata.ndc.schema.TimeLimits createTimeLimits() {
        return new org.iata.ndc.schema.TimeLimits();
    }

    /**
     * Create an instance of {@link CouponAgentType }
     * 
     */
    public CouponAgentType createCouponAgentType() {
        return new CouponAgentType();
    }

    /**
     * Create an instance of {@link CouponTravelerCoreType }
     * 
     */
    public CouponTravelerCoreType createCouponTravelerCoreType() {
        return new CouponTravelerCoreType();
    }

    /**
     * Create an instance of {@link SeatDisplay }
     * 
     */
    public SeatDisplay createSeatDisplay() {
        return new SeatDisplay();
    }

    /**
     * Create an instance of {@link SecurityType }
     * 
     */
    public SecurityType createSecurityType() {
        return new SecurityType();
    }

    /**
     * Create an instance of {@link ServiceCombinationType }
     * 
     */
    public ServiceCombinationType createServiceCombinationType() {
        return new ServiceCombinationType();
    }

    /**
     * Create an instance of {@link IncentiveProgramType }
     * 
     */
    public IncentiveProgramType createIncentiveProgramType() {
        return new IncentiveProgramType();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier }
     * 
     */
    public PrePaidProgramQualifier createPrePaidProgramQualifier() {
        return new PrePaidProgramQualifier();
    }

    /**
     * Create an instance of {@link AirShoppingRQ }
     * 
     */
    public AirShoppingRQ createAirShoppingRQ() {
        return new AirShoppingRQ();
    }

    /**
     * Create an instance of {@link AirShoppingRS }
     * 
     */
    public AirShoppingRS createAirShoppingRS() {
        return new AirShoppingRS();
    }

    /**
     * Create an instance of {@link FlightPriceRQ }
     * 
     */
    public FlightPriceRQ createFlightPriceRQ() {
        return new FlightPriceRQ();
    }

    /**
     * Create an instance of {@link FlightPriceRS }
     * 
     */
    public FlightPriceRS createFlightPriceRS() {
        return new FlightPriceRS();
    }

    /**
     * Create an instance of {@link PricedFlightOffer }
     * 
     */
    public PricedFlightOffer createPricedFlightOffer() {
        return new PricedFlightOffer();
    }

    /**
     * Create an instance of {@link ItinReshopRQ }
     * 
     */
    public ItinReshopRQ createItinReshopRQ() {
        return new ItinReshopRQ();
    }

    /**
     * Create an instance of {@link ItinReshopRS }
     * 
     */
    public ItinReshopRS createItinReshopRS() {
        return new ItinReshopRS();
    }

    /**
     * Create an instance of {@link OrderCancelRQ }
     * 
     */
    public OrderCancelRQ createOrderCancelRQ() {
        return new OrderCancelRQ();
    }

    /**
     * Create an instance of {@link OrderCancelRS }
     * 
     */
    public OrderCancelRS createOrderCancelRS() {
        return new OrderCancelRS();
    }

    /**
     * Create an instance of {@link OrderChangeRQ }
     * 
     */
    public OrderChangeRQ createOrderChangeRQ() {
        return new OrderChangeRQ();
    }

    /**
     * Create an instance of {@link OrderListRQ }
     * 
     */
    public OrderListRQ createOrderListRQ() {
        return new OrderListRQ();
    }

    /**
     * Create an instance of {@link OrderListRS }
     * 
     */
    public OrderListRS createOrderListRS() {
        return new OrderListRS();
    }

    /**
     * Create an instance of {@link OrderCreateRQ }
     * 
     */
    public OrderCreateRQ createOrderCreateRQ() {
        return new OrderCreateRQ();
    }

    /**
     * Create an instance of {@link OrderViewRS }
     * 
     */
    public OrderViewRS createOrderViewRS() {
        return new OrderViewRS();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ }
     * 
     */
    public OrderRetrieveRQ createOrderRetrieveRQ() {
        return new OrderRetrieveRQ();
    }

    /**
     * Create an instance of {@link SeatAvailabilityRQ }
     * 
     */
    public SeatAvailabilityRQ createSeatAvailabilityRQ() {
        return new SeatAvailabilityRQ();
    }

    /**
     * Create an instance of {@link SeatAvailabilityRS }
     * 
     */
    public SeatAvailabilityRS createSeatAvailabilityRS() {
        return new SeatAvailabilityRS();
    }

    /**
     * Create an instance of {@link ServiceListRQ }
     * 
     */
    public ServiceListRQ createServiceListRQ() {
        return new ServiceListRQ();
    }

    /**
     * Create an instance of {@link ServiceListRS }
     * 
     */
    public ServiceListRS createServiceListRS() {
        return new ServiceListRS();
    }

    /**
     * Create an instance of {@link SrvListResMetadataType }
     * 
     */
    public SrvListResMetadataType createSrvListResMetadataType() {
        return new SrvListResMetadataType();
    }

    /**
     * Create an instance of {@link SrvListReqMetadataType }
     * 
     */
    public SrvListReqMetadataType createSrvListReqMetadataType() {
        return new SrvListReqMetadataType();
    }

    /**
     * Create an instance of {@link OrdRetrieveMetadataType }
     * 
     */
    public OrdRetrieveMetadataType createOrdRetrieveMetadataType() {
        return new OrdRetrieveMetadataType();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType }
     * 
     */
    public OrdViewNoticesType createOrdViewNoticesType() {
        return new OrdViewNoticesType();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType.AppliedPriceVariance }
     * 
     */
    public OrdViewNoticesType.AppliedPriceVariance createOrdViewNoticesTypeAppliedPriceVariance() {
        return new OrdViewNoticesType.AppliedPriceVariance();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType.AppliedPriceVariance.PriceVariance }
     * 
     */
    public OrdViewNoticesType.AppliedPriceVariance.PriceVariance createOrdViewNoticesTypeAppliedPriceVariancePriceVariance() {
        return new OrdViewNoticesType.AppliedPriceVariance.PriceVariance();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType.AppliedPriceVariance.PriceVariance.Associations }
     * 
     */
    public OrdViewNoticesType.AppliedPriceVariance.PriceVariance.Associations createOrdViewNoticesTypeAppliedPriceVariancePriceVarianceAssociations() {
        return new OrdViewNoticesType.AppliedPriceVariance.PriceVariance.Associations();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType.AppliedTaxExemption }
     * 
     */
    public OrdViewNoticesType.AppliedTaxExemption createOrdViewNoticesTypeAppliedTaxExemption() {
        return new OrdViewNoticesType.AppliedTaxExemption();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType.AppliedTaxExemption.TaxExemption }
     * 
     */
    public OrdViewNoticesType.AppliedTaxExemption.TaxExemption createOrdViewNoticesTypeAppliedTaxExemptionTaxExemption() {
        return new OrdViewNoticesType.AppliedTaxExemption.TaxExemption();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType.AppliedTaxExemption.TaxExemption.Associations }
     * 
     */
    public OrdViewNoticesType.AppliedTaxExemption.TaxExemption.Associations createOrdViewNoticesTypeAppliedTaxExemptionTaxExemptionAssociations() {
        return new OrdViewNoticesType.AppliedTaxExemption.TaxExemption.Associations();
    }

    /**
     * Create an instance of {@link OrdViewMetadataType }
     * 
     */
    public OrdViewMetadataType createOrdViewMetadataType() {
        return new OrdViewMetadataType();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType }
     * 
     */
    public OrdCreateNoticesType createOrdCreateNoticesType() {
        return new OrdCreateNoticesType();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.TaxExemptionRules }
     * 
     */
    public OrdCreateNoticesType.TaxExemptionRules createOrdCreateNoticesTypeTaxExemptionRules() {
        return new OrdCreateNoticesType.TaxExemptionRules();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.TaxExemptionRules.Named }
     * 
     */
    public OrdCreateNoticesType.TaxExemptionRules.Named createOrdCreateNoticesTypeTaxExemptionRulesNamed() {
        return new OrdCreateNoticesType.TaxExemptionRules.Named();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.PriceVarianceRules }
     * 
     */
    public OrdCreateNoticesType.PriceVarianceRules createOrdCreateNoticesTypePriceVarianceRules() {
        return new OrdCreateNoticesType.PriceVarianceRules();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule }
     * 
     */
    public OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule createOrdCreateNoticesTypePriceVarianceRulesPriceVarianceRule() {
        return new OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Associations }
     * 
     */
    public OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Associations createOrdCreateNoticesTypePriceVarianceRulesPriceVarianceRuleAssociations() {
        return new OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Associations();
    }

    /**
     * Create an instance of {@link OrdCreateMetadataType }
     * 
     */
    public OrdCreateMetadataType createOrdCreateMetadataType() {
        return new OrdCreateMetadataType();
    }

    /**
     * Create an instance of {@link OrderListMetadataType }
     * 
     */
    public OrderListMetadataType createOrderListMetadataType() {
        return new OrderListMetadataType();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType }
     * 
     */
    public OrdChangeNoticesType createOrdChangeNoticesType() {
        return new OrdChangeNoticesType();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.TaxExemptionRules }
     * 
     */
    public OrdChangeNoticesType.TaxExemptionRules createOrdChangeNoticesTypeTaxExemptionRules() {
        return new OrdChangeNoticesType.TaxExemptionRules();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.TaxExemptionRules.Named }
     * 
     */
    public OrdChangeNoticesType.TaxExemptionRules.Named createOrdChangeNoticesTypeTaxExemptionRulesNamed() {
        return new OrdChangeNoticesType.TaxExemptionRules.Named();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.PriceVarianceRules }
     * 
     */
    public OrdChangeNoticesType.PriceVarianceRules createOrdChangeNoticesTypePriceVarianceRules() {
        return new OrdChangeNoticesType.PriceVarianceRules();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule }
     * 
     */
    public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule createOrdChangeNoticesTypePriceVarianceRulesPriceVarianceRule() {
        return new OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations }
     * 
     */
    public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations createOrdChangeNoticesTypePriceVarianceRulesPriceVarianceRuleAssociations() {
        return new OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType }
     * 
     */
    public ItinReshopNoticesType createItinReshopNoticesType() {
        return new ItinReshopNoticesType();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType.AppliedPriceVariance }
     * 
     */
    public ItinReshopNoticesType.AppliedPriceVariance createItinReshopNoticesTypeAppliedPriceVariance() {
        return new ItinReshopNoticesType.AppliedPriceVariance();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance }
     * 
     */
    public ItinReshopNoticesType.AppliedPriceVariance.PriceVariance createItinReshopNoticesTypeAppliedPriceVariancePriceVariance() {
        return new ItinReshopNoticesType.AppliedPriceVariance.PriceVariance();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations }
     * 
     */
    public ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations createItinReshopNoticesTypeAppliedPriceVariancePriceVarianceAssociations() {
        return new ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType.AppliedTaxExemption }
     * 
     */
    public ItinReshopNoticesType.AppliedTaxExemption createItinReshopNoticesTypeAppliedTaxExemption() {
        return new ItinReshopNoticesType.AppliedTaxExemption();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType.AppliedTaxExemption.TaxExemption }
     * 
     */
    public ItinReshopNoticesType.AppliedTaxExemption.TaxExemption createItinReshopNoticesTypeAppliedTaxExemptionTaxExemption() {
        return new ItinReshopNoticesType.AppliedTaxExemption.TaxExemption();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations }
     * 
     */
    public ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations createItinReshopNoticesTypeAppliedTaxExemptionTaxExemptionAssociations() {
        return new ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType }
     * 
     */
    public ItinReshopAlertsType createItinReshopAlertsType() {
        return new ItinReshopAlertsType();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception }
     * 
     */
    public ItinReshopAlertsType.Exception createItinReshopAlertsTypeException() {
        return new ItinReshopAlertsType.Exception();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.Eligibility }
     * 
     */
    public ItinReshopAlertsType.Exception.Eligibility createItinReshopAlertsTypeExceptionEligibility() {
        return new ItinReshopAlertsType.Exception.Eligibility();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.Eligibility.AlternateOffers }
     * 
     */
    public ItinReshopAlertsType.Exception.Eligibility.AlternateOffers createItinReshopAlertsTypeExceptionEligibilityAlternateOffers() {
        return new ItinReshopAlertsType.Exception.Eligibility.AlternateOffers();
    }

    /**
     * Create an instance of {@link OfferItemCoreType }
     * 
     */
    public OfferItemCoreType createOfferItemCoreType() {
        return new OfferItemCoreType();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.Eligibility.Associations }
     * 
     */
    public ItinReshopAlertsType.Exception.Eligibility.Associations createItinReshopAlertsTypeExceptionEligibilityAssociations() {
        return new ItinReshopAlertsType.Exception.Eligibility.Associations();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.PriceVariances }
     * 
     */
    public ItinReshopAlertsType.Exception.PriceVariances createItinReshopAlertsTypeExceptionPriceVariances() {
        return new ItinReshopAlertsType.Exception.PriceVariances();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance }
     * 
     */
    public ItinReshopAlertsType.Exception.PriceVariances.PriceVariance createItinReshopAlertsTypeExceptionPriceVariancesPriceVariance() {
        return new ItinReshopAlertsType.Exception.PriceVariances.PriceVariance();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations }
     * 
     */
    public ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations createItinReshopAlertsTypeExceptionPriceVariancesPriceVarianceAssociations() {
        return new ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.InvDiscrepency }
     * 
     */
    public ItinReshopAlertsType.Exception.InvDiscrepency createItinReshopAlertsTypeExceptionInvDiscrepency() {
        return new ItinReshopAlertsType.Exception.InvDiscrepency();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers }
     * 
     */
    public ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers createItinReshopAlertsTypeExceptionInvDiscrepencyAlternateOffers() {
        return new ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.InvDiscrepency.Associations }
     * 
     */
    public ItinReshopAlertsType.Exception.InvDiscrepency.Associations createItinReshopAlertsTypeExceptionInvDiscrepencyAssociations() {
        return new ItinReshopAlertsType.Exception.InvDiscrepency.Associations();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits }
     * 
     */
    public ItinReshopAlertsType.Exception.ExpiredTimeLimits createItinReshopAlertsTypeExceptionExpiredTimeLimits() {
        return new ItinReshopAlertsType.Exception.ExpiredTimeLimits();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit }
     * 
     */
    public ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit createItinReshopAlertsTypeExceptionExpiredTimeLimitsExpiredTimeLimit() {
        return new ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers }
     * 
     */
    public ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers createItinReshopAlertsTypeExceptionExpiredTimeLimitsExpiredTimeLimitAlternateOffers() {
        return new ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations }
     * 
     */
    public ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations createItinReshopAlertsTypeExceptionExpiredTimeLimitsExpiredTimeLimitAssociations() {
        return new ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations();
    }

    /**
     * Create an instance of {@link FltPriceResMetadataType }
     * 
     */
    public FltPriceResMetadataType createFltPriceResMetadataType() {
        return new FltPriceResMetadataType();
    }

    /**
     * Create an instance of {@link FltPriceReqMetadataType }
     * 
     */
    public FltPriceReqMetadataType createFltPriceReqMetadataType() {
        return new FltPriceReqMetadataType();
    }

    /**
     * Create an instance of {@link MessageParamsBaseType }
     * 
     */
    public MessageParamsBaseType createMessageParamsBaseType() {
        return new MessageParamsBaseType();
    }

    /**
     * Create an instance of {@link AirShopResParamsType }
     * 
     */
    public AirShopResParamsType createAirShopResParamsType() {
        return new AirShopResParamsType();
    }

    /**
     * Create an instance of {@link AirShopResParamsType.Pricing }
     * 
     */
    public AirShopResParamsType.Pricing createAirShopResParamsTypePricing() {
        return new AirShopResParamsType.Pricing();
    }

    /**
     * Create an instance of {@link AirShopResParamsType.Pricing.FeeExemption }
     * 
     */
    public AirShopResParamsType.Pricing.FeeExemption createAirShopResParamsTypePricingFeeExemption() {
        return new AirShopResParamsType.Pricing.FeeExemption();
    }

    /**
     * Create an instance of {@link AirShopResParamsType.Pricing.FeeExemption.Fee }
     * 
     */
    public AirShopResParamsType.Pricing.FeeExemption.Fee createAirShopResParamsTypePricingFeeExemptionFee() {
        return new AirShopResParamsType.Pricing.FeeExemption.Fee();
    }

    /**
     * Create an instance of {@link AirShopReqMetadataType }
     * 
     */
    public AirShopReqMetadataType createAirShopReqMetadataType() {
        return new AirShopReqMetadataType();
    }

    /**
     * Create an instance of {@link FeeDisclosureType }
     * 
     */
    public FeeDisclosureType createFeeDisclosureType() {
        return new FeeDisclosureType();
    }

    /**
     * Create an instance of {@link FeeSurchargeType }
     * 
     */
    public FeeSurchargeType createFeeSurchargeType() {
        return new FeeSurchargeType();
    }

    /**
     * Create an instance of {@link NonGeographicSpecificationType }
     * 
     */
    public NonGeographicSpecificationType createNonGeographicSpecificationType() {
        return new NonGeographicSpecificationType();
    }

    /**
     * Create an instance of {@link GeographicSpecificationType }
     * 
     */
    public GeographicSpecificationType createGeographicSpecificationType() {
        return new GeographicSpecificationType();
    }

    /**
     * Create an instance of {@link GeographicSpecificationType.Coordinates }
     * 
     */
    public GeographicSpecificationType.Coordinates createGeographicSpecificationTypeCoordinates() {
        return new GeographicSpecificationType.Coordinates();
    }

    /**
     * Create an instance of {@link ReissuedFlownType }
     * 
     */
    public ReissuedFlownType createReissuedFlownType() {
        return new ReissuedFlownType();
    }

    /**
     * Create an instance of {@link CouponFlightSegmentType }
     * 
     */
    public CouponFlightSegmentType createCouponFlightSegmentType() {
        return new CouponFlightSegmentType();
    }

    /**
     * Create an instance of {@link ReissuedFlownType.FlightCouponData }
     * 
     */
    public ReissuedFlownType.FlightCouponData createReissuedFlownTypeFlightCouponData() {
        return new ReissuedFlownType.FlightCouponData();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType }
     * 
     */
    public TaxCouponInfoType createTaxCouponInfoType() {
        return new TaxCouponInfoType();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument }
     * 
     */
    public TaxCouponInfoType.TicketDocument createTaxCouponInfoTypeTicketDocument() {
        return new TaxCouponInfoType.TicketDocument();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument.CouponNumber }
     * 
     */
    public TaxCouponInfoType.TicketDocument.CouponNumber createTaxCouponInfoTypeTicketDocumentCouponNumber() {
        return new TaxCouponInfoType.TicketDocument.CouponNumber();
    }

    /**
     * Create an instance of {@link TaxDetailType }
     * 
     */
    public TaxDetailType createTaxDetailType() {
        return new TaxDetailType();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown }
     * 
     */
    public TaxDetailType.Breakdown createTaxDetailTypeBreakdown() {
        return new TaxDetailType.Breakdown();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown.Tax }
     * 
     */
    public TaxDetailType.Breakdown.Tax createTaxDetailTypeBreakdownTax() {
        return new TaxDetailType.Breakdown.Tax();
    }

    /**
     * Create an instance of {@link GroupFarePreferencesType }
     * 
     */
    public GroupFarePreferencesType createGroupFarePreferencesType() {
        return new GroupFarePreferencesType();
    }

    /**
     * Create an instance of {@link GroupFarePreferencesType.GroupFare }
     * 
     */
    public GroupFarePreferencesType.GroupFare createGroupFarePreferencesTypeGroupFare() {
        return new GroupFarePreferencesType.GroupFare();
    }

    /**
     * Create an instance of {@link SocialMediaQualifierType }
     * 
     */
    public SocialMediaQualifierType createSocialMediaQualifierType() {
        return new SocialMediaQualifierType();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType }
     * 
     */
    public ReferencePointQueryType createReferencePointQueryType() {
        return new ReferencePointQueryType();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.Proximity }
     * 
     */
    public ReferencePointQueryType.Proximity createReferencePointQueryTypeProximity() {
        return new ReferencePointQueryType.Proximity();
    }

    /**
     * Create an instance of {@link ServiceFilterType }
     * 
     */
    public ServiceFilterType createServiceFilterType() {
        return new ServiceFilterType();
    }

    /**
     * Create an instance of {@link ServiceDescriptionType }
     * 
     */
    public ServiceDescriptionType createServiceDescriptionType() {
        return new ServiceDescriptionType();
    }

    /**
     * Create an instance of {@link ServiceEncodingType }
     * 
     */
    public ServiceEncodingType createServiceEncodingType() {
        return new ServiceEncodingType();
    }

    /**
     * Create an instance of {@link ServiceOtherAssocTypeOtherAssociation }
     * 
     */
    public ServiceOtherAssocTypeOtherAssociation createServiceOtherAssocTypeOtherAssociation() {
        return new ServiceOtherAssocTypeOtherAssociation();
    }

    /**
     * Create an instance of {@link ServiceAssocType }
     * 
     */
    public ServiceAssocType createServiceAssocType() {
        return new ServiceAssocType();
    }

    /**
     * Create an instance of {@link SeatMapMessageType }
     * 
     */
    public SeatMapMessageType createSeatMapMessageType() {
        return new SeatMapMessageType();
    }

    /**
     * Create an instance of {@link CabinCameraPosType }
     * 
     */
    public CabinCameraPosType createCabinCameraPosType() {
        return new CabinCameraPosType();
    }

    /**
     * Create an instance of {@link OrderPaymentMethodType }
     * 
     */
    public OrderPaymentMethodType createOrderPaymentMethodType() {
        return new OrderPaymentMethodType();
    }

    /**
     * Create an instance of {@link OrderPaymentMethodType.Associations }
     * 
     */
    public OrderPaymentMethodType.Associations createOrderPaymentMethodTypeAssociations() {
        return new OrderPaymentMethodType.Associations();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType }
     * 
     */
    public OrderPaymentFormType createOrderPaymentFormType() {
        return new OrderPaymentFormType();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer }
     * 
     */
    public OrderPaymentFormType.Payer createOrderPaymentFormTypePayer() {
        return new OrderPaymentFormType.Payer();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer.Name }
     * 
     */
    public OrderPaymentFormType.Payer.Name createOrderPaymentFormTypePayerName() {
        return new OrderPaymentFormType.Payer.Name();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Associations }
     * 
     */
    public OrderPaymentFormType.Associations createOrderPaymentFormTypeAssociations() {
        return new OrderPaymentFormType.Associations();
    }

    /**
     * Create an instance of {@link TicketDocumentType }
     * 
     */
    public TicketDocumentType createTicketDocumentType() {
        return new TicketDocumentType();
    }

    /**
     * Create an instance of {@link HistoryCouponInfoType }
     * 
     */
    public HistoryCouponInfoType createHistoryCouponInfoType() {
        return new HistoryCouponInfoType();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType }
     * 
     */
    public CouponSoldAirlineType createCouponSoldAirlineType() {
        return new CouponSoldAirlineType();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType }
     * 
     */
    public DetailCurrencyPriceType createDetailCurrencyPriceType() {
        return new DetailCurrencyPriceType();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Details }
     * 
     */
    public DetailCurrencyPriceType.Details createDetailCurrencyPriceTypeDetails() {
        return new DetailCurrencyPriceType.Details();
    }

    /**
     * Create an instance of {@link FlightPriceType }
     * 
     */
    public FlightPriceType createFlightPriceType() {
        return new FlightPriceType();
    }

    /**
     * Create an instance of {@link PaymentProcessType }
     * 
     */
    public PaymentProcessType createPaymentProcessType() {
        return new PaymentProcessType();
    }

    /**
     * Create an instance of {@link PaymentStatusType }
     * 
     */
    public PaymentStatusType createPaymentStatusType() {
        return new PaymentStatusType();
    }

    /**
     * Create an instance of {@link PaymentStatusType.IncompletePayment }
     * 
     */
    public PaymentStatusType.IncompletePayment createPaymentStatusTypeIncompletePayment() {
        return new PaymentStatusType.IncompletePayment();
    }

    /**
     * Create an instance of {@link FlightItemOfferType }
     * 
     */
    public FlightItemOfferType createFlightItemOfferType() {
        return new FlightItemOfferType();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.Details }
     * 
     */
    public FlightItemOfferType.Details createFlightItemOfferTypeDetails() {
        return new FlightItemOfferType.Details();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.Flight }
     * 
     */
    public FlightItemOfferType.Flight createFlightItemOfferTypeFlight() {
        return new FlightItemOfferType.Flight();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.OrderItem }
     * 
     */
    public org.iata.ndc.schema.OrderItem createOrderItem() {
        return new org.iata.ndc.schema.OrderItem();
    }

    /**
     * Create an instance of {@link OrderItemCoreType }
     * 
     */
    public OrderItemCoreType createOrderItemCoreType() {
        return new OrderItemCoreType();
    }

    /**
     * Create an instance of {@link OrderItemCoreType.OrderItem }
     * 
     */
    public OrderItemCoreType.OrderItem createOrderItemCoreTypeOrderItem() {
        return new OrderItemCoreType.OrderItem();
    }

    /**
     * Create an instance of {@link OrderItemCoreType.OrderItem.Associations }
     * 
     */
    public OrderItemCoreType.OrderItem.Associations createOrderItemCoreTypeOrderItemAssociations() {
        return new OrderItemCoreType.OrderItem.Associations();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType }
     * 
     */
    public OrderCoreChangeType createOrderCoreChangeType() {
        return new OrderCoreChangeType();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details }
     * 
     */
    public OrderCoreChangeType.Details createOrderCoreChangeTypeDetails() {
        return new OrderCoreChangeType.Details();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendment }
     * 
     */
    public OrderCoreChangeType.Details.Amendment createOrderCoreChangeTypeDetailsAmendment() {
        return new OrderCoreChangeType.Details.Amendment();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendment.OrderItem }
     * 
     */
    public OrderCoreChangeType.Details.Amendment.OrderItem createOrderCoreChangeTypeDetailsAmendmentOrderItem() {
        return new OrderCoreChangeType.Details.Amendment.OrderItem();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem }
     * 
     */
    public OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem createOrderCoreChangeTypeDetailsAmendmentOrderItemOfferItem() {
        return new OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services }
     * 
     */
    public OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services createOrderCoreChangeTypeDetailsAmendmentOrderItemOfferItemServices() {
        return new OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendment.TicketDocInfo }
     * 
     */
    public OrderCoreChangeType.Details.Amendment.TicketDocInfo createOrderCoreChangeTypeDetailsAmendmentTicketDocInfo() {
        return new OrderCoreChangeType.Details.Amendment.TicketDocInfo();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.ShoppingResponse }
     * 
     */
    public OrderCoreChangeType.Details.ShoppingResponse createOrderCoreChangeTypeDetailsShoppingResponse() {
        return new OrderCoreChangeType.Details.ShoppingResponse();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Associations }
     * 
     */
    public OrderCoreChangeType.Associations createOrderCoreChangeTypeAssociations() {
        return new OrderCoreChangeType.Associations();
    }

    /**
     * Create an instance of {@link OrderCoreType }
     * 
     */
    public OrderCoreType createOrderCoreType() {
        return new OrderCoreType();
    }

    /**
     * Create an instance of {@link OrderCoreType.TimeLimits }
     * 
     */
    public OrderCoreType.TimeLimits createOrderCoreTypeTimeLimits() {
        return new OrderCoreType.TimeLimits();
    }

    /**
     * Create an instance of {@link OrderCoreType.OriginalOrder }
     * 
     */
    public OrderCoreType.OriginalOrder createOrderCoreTypeOriginalOrder() {
        return new OrderCoreType.OriginalOrder();
    }

    /**
     * Create an instance of {@link OrderCoreType.OriginalOrder.PriceQuote }
     * 
     */
    public OrderCoreType.OriginalOrder.PriceQuote createOrderCoreTypeOriginalOrderPriceQuote() {
        return new OrderCoreType.OriginalOrder.PriceQuote();
    }

    /**
     * Create an instance of {@link OfferValidPeriodType }
     * 
     */
    public OfferValidPeriodType createOfferValidPeriodType() {
        return new OfferValidPeriodType();
    }

    /**
     * Create an instance of {@link AllOffersSnapshotType }
     * 
     */
    public AllOffersSnapshotType createAllOffersSnapshotType() {
        return new AllOffersSnapshotType();
    }

    /**
     * Create an instance of {@link OfferIncentiveType }
     * 
     */
    public OfferIncentiveType createOfferIncentiveType() {
        return new OfferIncentiveType();
    }

    /**
     * Create an instance of {@link OfferIncentiveType.Incentive }
     * 
     */
    public OfferIncentiveType.Incentive createOfferIncentiveTypeIncentive() {
        return new OfferIncentiveType.Incentive();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType }
     * 
     */
    public OfferPriceLeadDetailType createOfferPriceLeadDetailType() {
        return new OfferPriceLeadDetailType();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType.PriceDetail }
     * 
     */
    public OfferPriceLeadDetailType.PriceDetail createOfferPriceLeadDetailTypePriceDetail() {
        return new OfferPriceLeadDetailType.PriceDetail();
    }

    /**
     * Create an instance of {@link SeatOfferCoreType }
     * 
     */
    public SeatOfferCoreType createSeatOfferCoreType() {
        return new SeatOfferCoreType();
    }

    /**
     * Create an instance of {@link PricedFlightOfferCoreType }
     * 
     */
    public PricedFlightOfferCoreType createPricedFlightOfferCoreType() {
        return new PricedFlightOfferCoreType();
    }

    /**
     * Create an instance of {@link OfferPriceLeadType }
     * 
     */
    public OfferPriceLeadType createOfferPriceLeadType() {
        return new OfferPriceLeadType();
    }

    /**
     * Create an instance of {@link OtherOfferCoreType }
     * 
     */
    public OtherOfferCoreType createOtherOfferCoreType() {
        return new OtherOfferCoreType();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType }
     * 
     */
    public BaggageOfferCoreType createBaggageOfferCoreType() {
        return new BaggageOfferCoreType();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType.BagDetail }
     * 
     */
    public BaggageOfferCoreType.BagDetail createBaggageOfferCoreTypeBagDetail() {
        return new BaggageOfferCoreType.BagDetail();
    }

    /**
     * Create an instance of {@link FlightCabinCoreType }
     * 
     */
    public FlightCabinCoreType createFlightCabinCoreType() {
        return new FlightCabinCoreType();
    }

    /**
     * Create an instance of {@link FlightOnlyType }
     * 
     */
    public FlightOnlyType createFlightOnlyType() {
        return new FlightOnlyType();
    }

    /**
     * Create an instance of {@link FlightDetailType }
     * 
     */
    public FlightDetailType createFlightDetailType() {
        return new FlightDetailType();
    }

    /**
     * Create an instance of {@link FlightType }
     * 
     */
    public FlightType createFlightType() {
        return new FlightType();
    }

    /**
     * Create an instance of {@link FlightType.Flight }
     * 
     */
    public FlightType.Flight createFlightTypeFlight() {
        return new FlightType.Flight();
    }

    /**
     * Create an instance of {@link COSOtherAssocType }
     * 
     */
    public COSOtherAssocType createCOSOtherAssocType() {
        return new COSOtherAssocType();
    }

    /**
     * Create an instance of {@link OrderFareRulesType }
     * 
     */
    public OrderFareRulesType createOrderFareRulesType() {
        return new OrderFareRulesType();
    }

    /**
     * Create an instance of {@link FarePriceBaseType }
     * 
     */
    public FarePriceBaseType createFarePriceBaseType() {
        return new FarePriceBaseType();
    }

    /**
     * Create an instance of {@link ListOfServiceType }
     * 
     */
    public ListOfServiceType createListOfServiceType() {
        return new ListOfServiceType();
    }

    /**
     * Create an instance of {@link ListOfServiceType.Service }
     * 
     */
    public ListOfServiceType.Service createListOfServiceTypeService() {
        return new ListOfServiceType.Service();
    }

    /**
     * Create an instance of {@link ListOfFlightSegmentType }
     * 
     */
    public ListOfFlightSegmentType createListOfFlightSegmentType() {
        return new ListOfFlightSegmentType();
    }

    /**
     * Create an instance of {@link LinkFormattedType }
     * 
     */
    public LinkFormattedType createLinkFormattedType() {
        return new LinkFormattedType();
    }

    /**
     * Create an instance of {@link LinkDescriptionType }
     * 
     */
    public LinkDescriptionType createLinkDescriptionType() {
        return new LinkDescriptionType();
    }

    /**
     * Create an instance of {@link PolicyType }
     * 
     */
    public PolicyType createPolicyType() {
        return new PolicyType();
    }

    /**
     * Create an instance of {@link PolicyType.Metadata }
     * 
     */
    public PolicyType.Metadata createPolicyTypeMetadata() {
        return new PolicyType.Metadata();
    }

    /**
     * Create an instance of {@link CorePeriodGrpType }
     * 
     */
    public CorePeriodGrpType createCorePeriodGrpType() {
        return new CorePeriodGrpType();
    }

    /**
     * Create an instance of {@link EncSchemeType }
     * 
     */
    public EncSchemeType createEncSchemeType() {
        return new EncSchemeType();
    }

    /**
     * Create an instance of {@link EncSchemeType.Detail }
     * 
     */
    public EncSchemeType.Detail createEncSchemeTypeDetail() {
        return new EncSchemeType.Detail();
    }

    /**
     * Create an instance of {@link NodePathType }
     * 
     */
    public NodePathType createNodePathType() {
        return new NodePathType();
    }

    /**
     * Create an instance of {@link LocalizationNoticeType }
     * 
     */
    public LocalizationNoticeType createLocalizationNoticeType() {
        return new LocalizationNoticeType();
    }

    /**
     * Create an instance of {@link InfoPolicyNoticeType }
     * 
     */
    public InfoPolicyNoticeType createInfoPolicyNoticeType() {
        return new InfoPolicyNoticeType();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType }
     * 
     */
    public PinPhraseQuestionType createPinPhraseQuestionType() {
        return new PinPhraseQuestionType();
    }

    /**
     * Create an instance of {@link DeviceType }
     * 
     */
    public DeviceType createDeviceType() {
        return new DeviceType();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Challenge }
     * 
     */
    public PinPhraseQuestionType.Challenge createPinPhraseQuestionTypeChallenge() {
        return new PinPhraseQuestionType.Challenge();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Challenge.Parameters }
     * 
     */
    public PinPhraseQuestionType.Challenge.Parameters createPinPhraseQuestionTypeChallengeParameters() {
        return new PinPhraseQuestionType.Challenge.Parameters();
    }

    /**
     * Create an instance of {@link PaymentIssueAlertType }
     * 
     */
    public PaymentIssueAlertType createPaymentIssueAlertType() {
        return new PaymentIssueAlertType();
    }

    /**
     * Create an instance of {@link PaymentIssueAlertType.Payment }
     * 
     */
    public PaymentIssueAlertType.Payment createPaymentIssueAlertTypePayment() {
        return new PaymentIssueAlertType.Payment();
    }

    /**
     * Create an instance of {@link PaymentIssueAlertType.Payment.Incomplete }
     * 
     */
    public PaymentIssueAlertType.Payment.Incomplete createPaymentIssueAlertTypePaymentIncomplete() {
        return new PaymentIssueAlertType.Payment.Incomplete();
    }

    /**
     * Create an instance of {@link PaymentIssueAlertType.Payment.Failed }
     * 
     */
    public PaymentIssueAlertType.Payment.Failed createPaymentIssueAlertTypePaymentFailed() {
        return new PaymentIssueAlertType.Payment.Failed();
    }

    /**
     * Create an instance of {@link PinPhraseAnswerType }
     * 
     */
    public PinPhraseAnswerType createPinPhraseAnswerType() {
        return new PinPhraseAnswerType();
    }

    /**
     * Create an instance of {@link ProcessingErrorType }
     * 
     */
    public ProcessingErrorType createProcessingErrorType() {
        return new ProcessingErrorType();
    }

    /**
     * Create an instance of {@link ProcessingErrorType.Error }
     * 
     */
    public ProcessingErrorType.Error createProcessingErrorTypeError() {
        return new ProcessingErrorType.Error();
    }

    /**
     * Create an instance of {@link MarketMsgAssocType }
     * 
     */
    public MarketMsgAssocType createMarketMsgAssocType() {
        return new MarketMsgAssocType();
    }

    /**
     * Create an instance of {@link MarketingInfoType }
     * 
     */
    public MarketingInfoType createMarketingInfoType() {
        return new MarketingInfoType();
    }

    /**
     * Create an instance of {@link SupplierCoreRepType }
     * 
     */
    public SupplierCoreRepType createSupplierCoreRepType() {
        return new SupplierCoreRepType();
    }

    /**
     * Create an instance of {@link IntermediaryCoreRepType }
     * 
     */
    public IntermediaryCoreRepType createIntermediaryCoreRepType() {
        return new IntermediaryCoreRepType();
    }

    /**
     * Create an instance of {@link AgentUserType }
     * 
     */
    public AgentUserType createAgentUserType() {
        return new AgentUserType();
    }

    /**
     * Create an instance of {@link TravelerFOIDType }
     * 
     */
    public TravelerFOIDType createTravelerFOIDType() {
        return new TravelerFOIDType();
    }

    /**
     * Create an instance of {@link LocationProximityType }
     * 
     */
    public LocationProximityType createLocationProximityType() {
        return new LocationProximityType();
    }

    /**
     * Create an instance of {@link StateProvProximityType }
     * 
     */
    public StateProvProximityType createStateProvProximityType() {
        return new StateProvProximityType();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType }
     * 
     */
    public ShoppingResponseOrderType createShoppingResponseOrderType() {
        return new ShoppingResponseOrderType();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offer }
     * 
     */
    public ShoppingResponseOrderType.Offer createShoppingResponseOrderTypeOffer() {
        return new ShoppingResponseOrderType.Offer();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offer.OfferItem }
     * 
     */
    public ShoppingResponseOrderType.Offer.OfferItem createShoppingResponseOrderTypeOfferOfferItem() {
        return new ShoppingResponseOrderType.Offer.OfferItem();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offer.OfferItem.Details }
     * 
     */
    public ShoppingResponseOrderType.Offer.OfferItem.Details createShoppingResponseOrderTypeOfferOfferItemDetails() {
        return new ShoppingResponseOrderType.Offer.OfferItem.Details();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offer.OfferItem.AssociatedService }
     * 
     */
    public ShoppingResponseOrderType.Offer.OfferItem.AssociatedService createShoppingResponseOrderTypeOfferOfferItemAssociatedService() {
        return new ShoppingResponseOrderType.Offer.OfferItem.AssociatedService();
    }

    /**
     * Create an instance of {@link SpecialType }
     * 
     */
    public SpecialType createSpecialType() {
        return new SpecialType();
    }

    /**
     * Create an instance of {@link RuleSetType }
     * 
     */
    public RuleSetType createRuleSetType() {
        return new RuleSetType();
    }

    /**
     * Create an instance of {@link PenaltyType }
     * 
     */
    public PenaltyType createPenaltyType() {
        return new PenaltyType();
    }

    /**
     * Create an instance of {@link PenaltyType.Detail }
     * 
     */
    public PenaltyType.Detail createPenaltyTypeDetail() {
        return new PenaltyType.Detail();
    }

    /**
     * Create an instance of {@link PenaltyType.Detail.Amount }
     * 
     */
    public PenaltyType.Detail.Amount createPenaltyTypeDetailAmount() {
        return new PenaltyType.Detail.Amount();
    }

    /**
     * Create an instance of {@link RemarkType }
     * 
     */
    public RemarkType createRemarkType() {
        return new RemarkType();
    }

    /**
     * Create an instance of {@link CampaignUTMParameterType }
     * 
     */
    public CampaignUTMParameterType createCampaignUTMParameterType() {
        return new CampaignUTMParameterType();
    }

    /**
     * Create an instance of {@link RenderingParameterType }
     * 
     */
    public RenderingParameterType createRenderingParameterType() {
        return new RenderingParameterType();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType }
     * 
     */
    public RenderingInstructionsType createRenderingInstructionsType() {
        return new RenderingInstructionsType();
    }

    /**
     * Create an instance of {@link CountryQueryType }
     * 
     */
    public CountryQueryType createCountryQueryType() {
        return new CountryQueryType();
    }

    /**
     * Create an instance of {@link NamedAssoc }
     * 
     */
    public NamedAssoc createNamedAssoc() {
        return new NamedAssoc();
    }

    /**
     * Create an instance of {@link AugPointListType }
     * 
     */
    public AugPointListType createAugPointListType() {
        return new AugPointListType();
    }

    /**
     * Create an instance of {@link AugPointListType.List }
     * 
     */
    public AugPointListType.List createAugPointListTypeList() {
        return new AugPointListType.List();
    }

    /**
     * Create an instance of {@link AugPointAssocType }
     * 
     */
    public AugPointAssocType createAugPointAssocType() {
        return new AugPointAssocType();
    }

    /**
     * Create an instance of {@link AugmentationType }
     * 
     */
    public AugmentationType createAugmentationType() {
        return new AugmentationType();
    }

    /**
     * Create an instance of {@link ServiceCoreType }
     * 
     */
    public ServiceCoreType createServiceCoreType() {
        return new ServiceCoreType();
    }

    /**
     * Create an instance of {@link ServiceDetailType }
     * 
     */
    public ServiceDetailType createServiceDetailType() {
        return new ServiceDetailType();
    }

    /**
     * Create an instance of {@link ServiceCoreType.BookingInstructions }
     * 
     */
    public ServiceCoreType.BookingInstructions createServiceCoreTypeBookingInstructions() {
        return new ServiceCoreType.BookingInstructions();
    }

    /**
     * Create an instance of {@link SrvListResParamsType }
     * 
     */
    public SrvListResParamsType createSrvListResParamsType() {
        return new SrvListResParamsType();
    }

    /**
     * Create an instance of {@link SrvListResParamsType.Pricing }
     * 
     */
    public SrvListResParamsType.Pricing createSrvListResParamsTypePricing() {
        return new SrvListResParamsType.Pricing();
    }

    /**
     * Create an instance of {@link SrvListResParamsType.Pricing.FeeExemption }
     * 
     */
    public SrvListResParamsType.Pricing.FeeExemption createSrvListResParamsTypePricingFeeExemption() {
        return new SrvListResParamsType.Pricing.FeeExemption();
    }

    /**
     * Create an instance of {@link SrvListResParamsType.Pricing.FeeExemption.Fee }
     * 
     */
    public SrvListResParamsType.Pricing.FeeExemption.Fee createSrvListResParamsTypePricingFeeExemptionFee() {
        return new SrvListResParamsType.Pricing.FeeExemption.Fee();
    }

    /**
     * Create an instance of {@link ServiceListRQ.Query }
     * 
     */
    public ServiceListRQ.Query createServiceListRQQuery() {
        return new ServiceListRQ.Query();
    }

    /**
     * Create an instance of {@link ServiceListRQ.Query.Offer }
     * 
     */
    public ServiceListRQ.Query.Offer createServiceListRQQueryOffer() {
        return new ServiceListRQ.Query.Offer();
    }

    /**
     * Create an instance of {@link SrvListReqParamsType }
     * 
     */
    public SrvListReqParamsType createSrvListReqParamsType() {
        return new SrvListReqParamsType();
    }

    /**
     * Create an instance of {@link SrvListReqParamsType.Pricing }
     * 
     */
    public SrvListReqParamsType.Pricing createSrvListReqParamsTypePricing() {
        return new SrvListReqParamsType.Pricing();
    }

    /**
     * Create an instance of {@link SrvListReqParamsType.Pricing.FeeExemption }
     * 
     */
    public SrvListReqParamsType.Pricing.FeeExemption createSrvListReqParamsTypePricingFeeExemption() {
        return new SrvListReqParamsType.Pricing.FeeExemption();
    }

    /**
     * Create an instance of {@link SrvListReqParamsType.Pricing.FeeExemption.Fee }
     * 
     */
    public SrvListReqParamsType.Pricing.FeeExemption.Fee createSrvListReqParamsTypePricingFeeExemptionFee() {
        return new SrvListReqParamsType.Pricing.FeeExemption.Fee();
    }

    /**
     * Create an instance of {@link SeatAvailResMetadataType }
     * 
     */
    public SeatAvailResMetadataType createSeatAvailResMetadataType() {
        return new SeatAvailResMetadataType();
    }

    /**
     * Create an instance of {@link SeatAvailabilityRS.Flights }
     * 
     */
    public SeatAvailabilityRS.Flights createSeatAvailabilityRSFlights() {
        return new SeatAvailabilityRS.Flights();
    }

    /**
     * Create an instance of {@link SeatAvailabilityRS.Flights.Cabin }
     * 
     */
    public SeatAvailabilityRS.Flights.Cabin createSeatAvailabilityRSFlightsCabin() {
        return new SeatAvailabilityRS.Flights.Cabin();
    }

    /**
     * Create an instance of {@link SeatAvailResParamsType }
     * 
     */
    public SeatAvailResParamsType createSeatAvailResParamsType() {
        return new SeatAvailResParamsType();
    }

    /**
     * Create an instance of {@link SeatAvailResParamsType.Pricing }
     * 
     */
    public SeatAvailResParamsType.Pricing createSeatAvailResParamsTypePricing() {
        return new SeatAvailResParamsType.Pricing();
    }

    /**
     * Create an instance of {@link SeatAvailResParamsType.Pricing.FeeExemption }
     * 
     */
    public SeatAvailResParamsType.Pricing.FeeExemption createSeatAvailResParamsTypePricingFeeExemption() {
        return new SeatAvailResParamsType.Pricing.FeeExemption();
    }

    /**
     * Create an instance of {@link SeatAvailResParamsType.Pricing.FeeExemption.Fee }
     * 
     */
    public SeatAvailResParamsType.Pricing.FeeExemption.Fee createSeatAvailResParamsTypePricingFeeExemptionFee() {
        return new SeatAvailResParamsType.Pricing.FeeExemption.Fee();
    }

    /**
     * Create an instance of {@link SeatAvailReqMetadataType }
     * 
     */
    public SeatAvailReqMetadataType createSeatAvailReqMetadataType() {
        return new SeatAvailReqMetadataType();
    }

    /**
     * Create an instance of {@link SeatAvailabilityRQ.Query }
     * 
     */
    public SeatAvailabilityRQ.Query createSeatAvailabilityRQQuery() {
        return new SeatAvailabilityRQ.Query();
    }

    /**
     * Create an instance of {@link SeatAvailabilityRQ.Query.Offer }
     * 
     */
    public SeatAvailabilityRQ.Query.Offer createSeatAvailabilityRQQueryOffer() {
        return new SeatAvailabilityRQ.Query.Offer();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType }
     * 
     */
    public SeatAvailReqParamsType createSeatAvailReqParamsType() {
        return new SeatAvailReqParamsType();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.Pricing }
     * 
     */
    public SeatAvailReqParamsType.Pricing createSeatAvailReqParamsTypePricing() {
        return new SeatAvailReqParamsType.Pricing();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.Pricing.FeeExemption }
     * 
     */
    public SeatAvailReqParamsType.Pricing.FeeExemption createSeatAvailReqParamsTypePricingFeeExemption() {
        return new SeatAvailReqParamsType.Pricing.FeeExemption();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.Pricing.FeeExemption.Fee }
     * 
     */
    public SeatAvailReqParamsType.Pricing.FeeExemption.Fee createSeatAvailReqParamsTypePricingFeeExemptionFee() {
        return new SeatAvailReqParamsType.Pricing.FeeExemption.Fee();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query }
     * 
     */
    public OrderRetrieveRQ.Query createOrderRetrieveRQQuery() {
        return new OrderRetrieveRQ.Query();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters }
     * 
     */
    public OrderRetrieveRQ.Query.Filters createOrderRetrieveRQQueryFilters() {
        return new OrderRetrieveRQ.Query.Filters();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Payments }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Payments createOrderRetrieveRQQueryFiltersPayments() {
        return new OrderRetrieveRQ.Query.Filters.Payments();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Payments.Method }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Payments.Method createOrderRetrieveRQQueryFiltersPaymentsMethod() {
        return new OrderRetrieveRQ.Query.Filters.Payments.Method();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Passengers }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Passengers createOrderRetrieveRQQueryFiltersPassengers() {
        return new OrderRetrieveRQ.Query.Filters.Passengers();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo createOrderRetrieveRQQueryFiltersPassengersPassengerIDInfo() {
        return new OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Passengers.Name }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Passengers.Name createOrderRetrieveRQQueryFiltersPassengersName() {
        return new OrderRetrieveRQ.Query.Filters.Passengers.Name();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Flight }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Flight createOrderRetrieveRQQueryFiltersFlight() {
        return new OrderRetrieveRQ.Query.Filters.Flight();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Flight.Segment }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Flight.Segment createOrderRetrieveRQQueryFiltersFlightSegment() {
        return new OrderRetrieveRQ.Query.Filters.Flight.Segment();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival createOrderRetrieveRQQueryFiltersFlightSegmentArrival() {
        return new OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure createOrderRetrieveRQQueryFiltersFlightSegmentDeparture() {
        return new OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Flight.OriginDestination createOrderRetrieveRQQueryFiltersFlightOriginDestination() {
        return new OrderRetrieveRQ.Query.Filters.Flight.OriginDestination();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival createOrderRetrieveRQQueryFiltersFlightOriginDestinationArrival() {
        return new OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure createOrderRetrieveRQQueryFiltersFlightOriginDestinationDeparture() {
        return new OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response }
     * 
     */
    public OrderViewRS.Response createOrderViewRSResponse() {
        return new OrderViewRS.Response();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response.Amendment }
     * 
     */
    public OrderViewRS.Response.Amendment createOrderViewRSResponseAmendment() {
        return new OrderViewRS.Response.Amendment();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response.Amendment.TicketDocInfo }
     * 
     */
    public OrderViewRS.Response.Amendment.TicketDocInfo createOrderViewRSResponseAmendmentTicketDocInfo() {
        return new OrderViewRS.Response.Amendment.TicketDocInfo();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response.Amendment.OfferItem }
     * 
     */
    public OrderViewRS.Response.Amendment.OfferItem createOrderViewRSResponseAmendmentOfferItem() {
        return new OrderViewRS.Response.Amendment.OfferItem();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response.Amendment.OfferItem.Services }
     * 
     */
    public OrderViewRS.Response.Amendment.OfferItem.Services createOrderViewRSResponseAmendmentOfferItemServices() {
        return new OrderViewRS.Response.Amendment.OfferItem.Services();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response.TicketDocInfo }
     * 
     */
    public OrderViewRS.Response.TicketDocInfo createOrderViewRSResponseTicketDocInfo() {
        return new OrderViewRS.Response.TicketDocInfo();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response.Order }
     * 
     */
    public OrderViewRS.Response.Order createOrderViewRSResponseOrder() {
        return new OrderViewRS.Response.Order();
    }

    /**
     * Create an instance of {@link OrderCreateRQ.Query }
     * 
     */
    public OrderCreateRQ.Query createOrderCreateRQQuery() {
        return new OrderCreateRQ.Query();
    }

    /**
     * Create an instance of {@link OrderCreateRQ.Query.Promotion }
     * 
     */
    public OrderCreateRQ.Query.Promotion createOrderCreateRQQueryPromotion() {
        return new OrderCreateRQ.Query.Promotion();
    }

    /**
     * Create an instance of {@link OrderListRS.Response }
     * 
     */
    public OrderListRS.Response createOrderListRSResponse() {
        return new OrderListRS.Response();
    }

    /**
     * Create an instance of {@link OrderListRS.Response.Order }
     * 
     */
    public OrderListRS.Response.Order createOrderListRSResponseOrder() {
        return new OrderListRS.Response.Order();
    }

    /**
     * Create an instance of {@link OrderListRS.Response.Order.Passengers }
     * 
     */
    public OrderListRS.Response.Order.Passengers createOrderListRSResponseOrderPassengers() {
        return new OrderListRS.Response.Order.Passengers();
    }

    /**
     * Create an instance of {@link OrderListRS.Response.Order.Arrival }
     * 
     */
    public OrderListRS.Response.Order.Arrival createOrderListRSResponseOrderArrival() {
        return new OrderListRS.Response.Order.Arrival();
    }

    /**
     * Create an instance of {@link OrderListRS.Response.Order.Departure }
     * 
     */
    public OrderListRS.Response.Order.Departure createOrderListRSResponseOrderDeparture() {
        return new OrderListRS.Response.Order.Departure();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query }
     * 
     */
    public OrderListRQ.Query createOrderListRQQuery() {
        return new OrderListRQ.Query();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters }
     * 
     */
    public OrderListRQ.Query.Filters createOrderListRQQueryFilters() {
        return new OrderListRQ.Query.Filters();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.TicketDocument }
     * 
     */
    public OrderListRQ.Query.Filters.TicketDocument createOrderListRQQueryFiltersTicketDocument() {
        return new OrderListRQ.Query.Filters.TicketDocument();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Payments }
     * 
     */
    public OrderListRQ.Query.Filters.Payments createOrderListRQQueryFiltersPayments() {
        return new OrderListRQ.Query.Filters.Payments();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Payments.Method }
     * 
     */
    public OrderListRQ.Query.Filters.Payments.Method createOrderListRQQueryFiltersPaymentsMethod() {
        return new OrderListRQ.Query.Filters.Payments.Method();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Passengers }
     * 
     */
    public OrderListRQ.Query.Filters.Passengers createOrderListRQQueryFiltersPassengers() {
        return new OrderListRQ.Query.Filters.Passengers();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Passengers.Name }
     * 
     */
    public OrderListRQ.Query.Filters.Passengers.Name createOrderListRQQueryFiltersPassengersName() {
        return new OrderListRQ.Query.Filters.Passengers.Name();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight }
     * 
     */
    public OrderListRQ.Query.Filters.Flight createOrderListRQQueryFiltersFlight() {
        return new OrderListRQ.Query.Filters.Flight();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.Segment }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.Segment createOrderListRQQueryFiltersFlightSegment() {
        return new OrderListRQ.Query.Filters.Flight.Segment();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.Segment.Arrival }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.Segment.Arrival createOrderListRQQueryFiltersFlightSegmentArrival() {
        return new OrderListRQ.Query.Filters.Flight.Segment.Arrival();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.Segment.Departure }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.Segment.Departure createOrderListRQQueryFiltersFlightSegmentDeparture() {
        return new OrderListRQ.Query.Filters.Flight.Segment.Departure();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.OriginDestination }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.OriginDestination createOrderListRQQueryFiltersFlightOriginDestination() {
        return new OrderListRQ.Query.Filters.Flight.OriginDestination();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival createOrderListRQQueryFiltersFlightOriginDestinationArrival() {
        return new OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.OriginDestination.Departure }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.OriginDestination.Departure createOrderListRQQueryFiltersFlightOriginDestinationDeparture() {
        return new OrderListRQ.Query.Filters.Flight.OriginDestination.Departure();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.Departure }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.Departure createOrderListRQQueryFiltersFlightDeparture() {
        return new OrderListRQ.Query.Filters.Flight.Departure();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.Arrival }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.Arrival createOrderListRQQueryFiltersFlightArrival() {
        return new OrderListRQ.Query.Filters.Flight.Arrival();
    }

    /**
     * Create an instance of {@link OrdChangeMetadataType }
     * 
     */
    public OrdChangeMetadataType createOrdChangeMetadataType() {
        return new OrdChangeMetadataType();
    }

    /**
     * Create an instance of {@link OrderChangeRQ.Query }
     * 
     */
    public OrderChangeRQ.Query createOrderChangeRQQuery() {
        return new OrderChangeRQ.Query();
    }

    /**
     * Create an instance of {@link OrderChangeRQ.Query.Payment }
     * 
     */
    public OrderChangeRQ.Query.Payment createOrderChangeRQQueryPayment() {
        return new OrderChangeRQ.Query.Payment();
    }

    /**
     * Create an instance of {@link OrderChangeRQ.Query.Passengers }
     * 
     */
    public OrderChangeRQ.Query.Passengers createOrderChangeRQQueryPassengers() {
        return new OrderChangeRQ.Query.Passengers();
    }

    /**
     * Create an instance of {@link OrderChangeRQ.Query.Passengers.Group }
     * 
     */
    public OrderChangeRQ.Query.Passengers.Group createOrderChangeRQQueryPassengersGroup() {
        return new OrderChangeRQ.Query.Passengers.Group();
    }

    /**
     * Create an instance of {@link OrderChangeRQ.Query.Passengers.Passenger }
     * 
     */
    public OrderChangeRQ.Query.Passengers.Passenger createOrderChangeRQQueryPassengersPassenger() {
        return new OrderChangeRQ.Query.Passengers.Passenger();
    }

    /**
     * Create an instance of {@link OrderCancelRS.Response }
     * 
     */
    public OrderCancelRS.Response createOrderCancelRSResponse() {
        return new OrderCancelRS.Response();
    }

    /**
     * Create an instance of {@link OrderCancelRS.Response.TicketDocInfo }
     * 
     */
    public OrderCancelRS.Response.TicketDocInfo createOrderCancelRSResponseTicketDocInfo() {
        return new OrderCancelRS.Response.TicketDocInfo();
    }

    /**
     * Create an instance of {@link OrderCancelRS.Response.TicketDocInfo.FareInfo }
     * 
     */
    public OrderCancelRS.Response.TicketDocInfo.FareInfo createOrderCancelRSResponseTicketDocInfoFareInfo() {
        return new OrderCancelRS.Response.TicketDocInfo.FareInfo();
    }

    /**
     * Create an instance of {@link ItinReshopMetadataType }
     * 
     */
    public ItinReshopMetadataType createItinReshopMetadataType() {
        return new ItinReshopMetadataType();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response }
     * 
     */
    public ItinReshopRS.Response createItinReshopRSResponse() {
        return new ItinReshopRS.Response();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.Commission }
     * 
     */
    public ItinReshopRS.Response.Commission createItinReshopRSResponseCommission() {
        return new ItinReshopRS.Response.Commission();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.TicketDocInfo }
     * 
     */
    public ItinReshopRS.Response.TicketDocInfo createItinReshopRSResponseTicketDocInfo() {
        return new ItinReshopRS.Response.TicketDocInfo();
    }

    /**
     * Create an instance of {@link PaymentMethodType }
     * 
     */
    public PaymentMethodType createPaymentMethodType() {
        return new PaymentMethodType();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.Payment }
     * 
     */
    public ItinReshopRS.Response.Payment createItinReshopRSResponsePayment() {
        return new ItinReshopRS.Response.Payment();
    }

    /**
     * Create an instance of {@link PaymentMethodType.Method }
     * 
     */
    public PaymentMethodType.Method createPaymentMethodTypeMethod() {
        return new PaymentMethodType.Method();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.ReShopOffer }
     * 
     */
    public ItinReshopRS.Response.ReShopOffer createItinReshopRSResponseReShopOffer() {
        return new ItinReshopRS.Response.ReShopOffer();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential }
     * 
     */
    public ItinReshopRS.Response.ReShopOffer.ReshopDifferential createItinReshopRSResponseReShopOfferReshopDifferential() {
        return new ItinReshopRS.Response.ReShopOffer.ReshopDifferential();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue }
     * 
     */
    public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue createItinReshopRSResponseReShopOfferReshopDifferentialReshopDue() {
        return new ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.Passengers }
     * 
     */
    public ItinReshopRS.Response.Passengers createItinReshopRSResponsePassengers() {
        return new ItinReshopRS.Response.Passengers();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.Passengers.Group }
     * 
     */
    public ItinReshopRS.Response.Passengers.Group createItinReshopRSResponsePassengersGroup() {
        return new ItinReshopRS.Response.Passengers.Group();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.Passengers.Passenger }
     * 
     */
    public ItinReshopRS.Response.Passengers.Passenger createItinReshopRSResponsePassengersPassenger() {
        return new ItinReshopRS.Response.Passengers.Passenger();
    }

    /**
     * Create an instance of {@link ItinReshopRQ.Query }
     * 
     */
    public ItinReshopRQ.Query createItinReshopRQQuery() {
        return new ItinReshopRQ.Query();
    }

    /**
     * Create an instance of {@link ItinReshopRQ.Query.Actions }
     * 
     */
    public ItinReshopRQ.Query.Actions createItinReshopRQQueryActions() {
        return new ItinReshopRQ.Query.Actions();
    }

    /**
     * Create an instance of {@link ItinReshopRQ.Query.RepriceOnly }
     * 
     */
    public ItinReshopRQ.Query.RepriceOnly createItinReshopRQQueryRepriceOnly() {
        return new ItinReshopRQ.Query.RepriceOnly();
    }

    /**
     * Create an instance of {@link ItinReshopParamsType }
     * 
     */
    public ItinReshopParamsType createItinReshopParamsType() {
        return new ItinReshopParamsType();
    }

    /**
     * Create an instance of {@link ItinReshopParamsType.Notices }
     * 
     */
    public ItinReshopParamsType.Notices createItinReshopParamsTypeNotices() {
        return new ItinReshopParamsType.Notices();
    }

    /**
     * Create an instance of {@link OfferTimeLimitSetType }
     * 
     */
    public OfferTimeLimitSetType createOfferTimeLimitSetType() {
        return new OfferTimeLimitSetType();
    }

    /**
     * Create an instance of {@link DataListType }
     * 
     */
    public DataListType createDataListType() {
        return new DataListType();
    }

    /**
     * Create an instance of {@link DataListType.Flight }
     * 
     */
    public DataListType.Flight createDataListTypeFlight() {
        return new DataListType.Flight();
    }

    /**
     * Create an instance of {@link FltPriceResParamsType }
     * 
     */
    public FltPriceResParamsType createFltPriceResParamsType() {
        return new FltPriceResParamsType();
    }

    /**
     * Create an instance of {@link FltPriceResParamsType.Pricing }
     * 
     */
    public FltPriceResParamsType.Pricing createFltPriceResParamsTypePricing() {
        return new FltPriceResParamsType.Pricing();
    }

    /**
     * Create an instance of {@link FltPriceResParamsType.Pricing.FeeExemption }
     * 
     */
    public FltPriceResParamsType.Pricing.FeeExemption createFltPriceResParamsTypePricingFeeExemption() {
        return new FltPriceResParamsType.Pricing.FeeExemption();
    }

    /**
     * Create an instance of {@link FltPriceResParamsType.Pricing.FeeExemption.Fee }
     * 
     */
    public FltPriceResParamsType.Pricing.FeeExemption.Fee createFltPriceResParamsTypePricingFeeExemptionFee() {
        return new FltPriceResParamsType.Pricing.FeeExemption.Fee();
    }

    /**
     * Create an instance of {@link TicketAutoExchangeType }
     * 
     */
    public TicketAutoExchangeType createTicketAutoExchangeType() {
        return new TicketAutoExchangeType();
    }

    /**
     * Create an instance of {@link FlightPriceRQ.Query }
     * 
     */
    public FlightPriceRQ.Query createFlightPriceRQQuery() {
        return new FlightPriceRQ.Query();
    }

    /**
     * Create an instance of {@link FlightPriceRQ.Query.Offer }
     * 
     */
    public FlightPriceRQ.Query.Offer createFlightPriceRQQueryOffer() {
        return new FlightPriceRQ.Query.Offer();
    }

    /**
     * Create an instance of {@link FltPriceReqParamsType }
     * 
     */
    public FltPriceReqParamsType createFltPriceReqParamsType() {
        return new FltPriceReqParamsType();
    }

    /**
     * Create an instance of {@link FltPriceReqParamsType.Pricing }
     * 
     */
    public FltPriceReqParamsType.Pricing createFltPriceReqParamsTypePricing() {
        return new FltPriceReqParamsType.Pricing();
    }

    /**
     * Create an instance of {@link FltPriceReqParamsType.Pricing.FeeExemption }
     * 
     */
    public FltPriceReqParamsType.Pricing.FeeExemption createFltPriceReqParamsTypePricingFeeExemption() {
        return new FltPriceReqParamsType.Pricing.FeeExemption();
    }

    /**
     * Create an instance of {@link FltPriceReqParamsType.Pricing.FeeExemption.Fee }
     * 
     */
    public FltPriceReqParamsType.Pricing.FeeExemption.Fee createFltPriceReqParamsTypePricingFeeExemptionFee() {
        return new FltPriceReqParamsType.Pricing.FeeExemption.Fee();
    }

    /**
     * Create an instance of {@link AirShopResMetadataType }
     * 
     */
    public AirShopResMetadataType createAirShopResMetadataType() {
        return new AirShopResMetadataType();
    }

    /**
     * Create an instance of {@link AirShoppingRS.OffersGroup }
     * 
     */
    public AirShoppingRS.OffersGroup createAirShoppingRSOffersGroup() {
        return new AirShoppingRS.OffersGroup();
    }

    /**
     * Create an instance of {@link AirShoppingRS.OffersGroup.AirlineOffers }
     * 
     */
    public AirShoppingRS.OffersGroup.AirlineOffers createAirShoppingRSOffersGroupAirlineOffers() {
        return new AirShoppingRS.OffersGroup.AirlineOffers();
    }

    /**
     * Create an instance of {@link AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar }
     * 
     */
    public AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar createAirShoppingRSOffersGroupAirlineOffersPriceCalendar() {
        return new AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar();
    }

    /**
     * Create an instance of {@link AirShopFlightSpecificType }
     * 
     */
    public AirShopFlightSpecificType createAirShopFlightSpecificType() {
        return new AirShopFlightSpecificType();
    }

    /**
     * Create an instance of {@link AirShopReqAttributeQueryTypeOriginDestination }
     * 
     */
    public AirShopReqAttributeQueryTypeOriginDestination createAirShopReqAttributeQueryTypeOriginDestination() {
        return new AirShopReqAttributeQueryTypeOriginDestination();
    }

    /**
     * Create an instance of {@link AirShopReqAffinityQueryType }
     * 
     */
    public AirShopReqAffinityQueryType createAirShopReqAffinityQueryType() {
        return new AirShopReqAffinityQueryType();
    }

    /**
     * Create an instance of {@link AirShopReqParamsType }
     * 
     */
    public AirShopReqParamsType createAirShopReqParamsType() {
        return new AirShopReqParamsType();
    }

    /**
     * Create an instance of {@link AirShopReqParamsType.Pricing }
     * 
     */
    public AirShopReqParamsType.Pricing createAirShopReqParamsTypePricing() {
        return new AirShopReqParamsType.Pricing();
    }

    /**
     * Create an instance of {@link AirShopReqParamsType.Pricing.FeeExemption }
     * 
     */
    public AirShopReqParamsType.Pricing.FeeExemption createAirShopReqParamsTypePricingFeeExemption() {
        return new AirShopReqParamsType.Pricing.FeeExemption();
    }

    /**
     * Create an instance of {@link AirShopReqParamsType.Pricing.FeeExemption.Fee }
     * 
     */
    public AirShopReqParamsType.Pricing.FeeExemption.Fee createAirShopReqParamsTypePricingFeeExemptionFee() {
        return new AirShopReqParamsType.Pricing.FeeExemption.Fee();
    }

    /**
     * Create an instance of {@link TransferPreferencesType }
     * 
     */
    public TransferPreferencesType createTransferPreferencesType() {
        return new TransferPreferencesType();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Connection }
     * 
     */
    public TransferPreferencesType.Connection createTransferPreferencesTypeConnection() {
        return new TransferPreferencesType.Connection();
    }

    /**
     * Create an instance of {@link FltSegmentMaxTimePreferencesType }
     * 
     */
    public FltSegmentMaxTimePreferencesType createFltSegmentMaxTimePreferencesType() {
        return new FltSegmentMaxTimePreferencesType();
    }

    /**
     * Create an instance of {@link FarePreferencesType }
     * 
     */
    public FarePreferencesType createFarePreferencesType() {
        return new FarePreferencesType();
    }

    /**
     * Create an instance of {@link FarePreferencesType.TicketDesigs }
     * 
     */
    public FarePreferencesType.TicketDesigs createFarePreferencesTypeTicketDesigs() {
        return new FarePreferencesType.TicketDesigs();
    }

    /**
     * Create an instance of {@link FarePreferencesType.FareCodes }
     * 
     */
    public FarePreferencesType.FareCodes createFarePreferencesTypeFareCodes() {
        return new FarePreferencesType.FareCodes();
    }

    /**
     * Create an instance of {@link FlightPreferencesType }
     * 
     */
    public FlightPreferencesType createFlightPreferencesType() {
        return new FlightPreferencesType();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.WaitListing }
     * 
     */
    public FlightPreferencesType.WaitListing createFlightPreferencesTypeWaitListing() {
        return new FlightPreferencesType.WaitListing();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic }
     * 
     */
    public FlightPreferencesType.Characteristic createFlightPreferencesTypeCharacteristic() {
        return new FlightPreferencesType.Characteristic();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft }
     * 
     */
    public FlightPreferencesType.Aircraft createFlightPreferencesTypeAircraft() {
        return new FlightPreferencesType.Aircraft();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Rows }
     * 
     */
    public FlightPreferencesType.Aircraft.Rows createFlightPreferencesTypeAircraftRows() {
        return new FlightPreferencesType.Aircraft.Rows();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Seats }
     * 
     */
    public FlightPreferencesType.Aircraft.Seats createFlightPreferencesTypeAircraftSeats() {
        return new FlightPreferencesType.Aircraft.Seats();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Classes }
     * 
     */
    public FlightPreferencesType.Aircraft.Classes createFlightPreferencesTypeAircraftClasses() {
        return new FlightPreferencesType.Aircraft.Classes();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Cabins }
     * 
     */
    public FlightPreferencesType.Aircraft.Cabins createFlightPreferencesTypeAircraftCabins() {
        return new FlightPreferencesType.Aircraft.Cabins();
    }

    /**
     * Create an instance of {@link AlliancePreferencesType }
     * 
     */
    public AlliancePreferencesType createAlliancePreferencesType() {
        return new AlliancePreferencesType();
    }

    /**
     * Create an instance of {@link AirlinePreferencesType }
     * 
     */
    public AirlinePreferencesType createAirlinePreferencesType() {
        return new AirlinePreferencesType();
    }

    /**
     * Create an instance of {@link PersonBudgetType }
     * 
     */
    public PersonBudgetType createPersonBudgetType() {
        return new PersonBudgetType();
    }

    /**
     * Create an instance of {@link GroupBudgetType }
     * 
     */
    public GroupBudgetType createGroupBudgetType() {
        return new GroupBudgetType();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail createPrePaidProgramQualifierPrepaidProgramDetail() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.Certificate createPrePaidProgramQualifierPrepaidProgramDetailCertificate() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.Certificate();
    }

    /**
     * Create an instance of {@link DiscountProgramType }
     * 
     */
    public DiscountProgramType createDiscountProgramType() {
        return new DiscountProgramType();
    }

    /**
     * Create an instance of {@link FltArriveQualifiedQueryType }
     * 
     */
    public FltArriveQualifiedQueryType createFltArriveQualifiedQueryType() {
        return new FltArriveQualifiedQueryType();
    }

    /**
     * Create an instance of {@link FltDepartQualifiedQueryType }
     * 
     */
    public FltDepartQualifiedQueryType createFltDepartQualifiedQueryType() {
        return new FltDepartQualifiedQueryType();
    }

    /**
     * Create an instance of {@link InstrClassUpgradeType }
     * 
     */
    public InstrClassUpgradeType createInstrClassUpgradeType() {
        return new InstrClassUpgradeType();
    }

    /**
     * Create an instance of {@link ServiceCouponType }
     * 
     */
    public ServiceCouponType createServiceCouponType() {
        return new ServiceCouponType();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType }
     * 
     */
    public ServiceFulfillmentType createServiceFulfillmentType() {
        return new ServiceFulfillmentType();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.OfferValidDates }
     * 
     */
    public ServiceFulfillmentType.OfferValidDates createServiceFulfillmentTypeOfferValidDates() {
        return new ServiceFulfillmentType.OfferValidDates();
    }

    /**
     * Create an instance of {@link ServicePriceType }
     * 
     */
    public ServicePriceType createServicePriceType() {
        return new ServicePriceType();
    }

    /**
     * Create an instance of {@link ServicePriceType.Details }
     * 
     */
    public ServicePriceType.Details createServicePriceTypeDetails() {
        return new ServicePriceType.Details();
    }

    /**
     * Create an instance of {@link SeatDataType }
     * 
     */
    public SeatDataType createSeatDataType() {
        return new SeatDataType();
    }

    /**
     * Create an instance of {@link SeatComponentType }
     * 
     */
    public SeatComponentType createSeatComponentType() {
        return new SeatComponentType();
    }

    /**
     * Create an instance of {@link SeatComponentType.Dimensions }
     * 
     */
    public SeatComponentType.Dimensions createSeatComponentTypeDimensions() {
        return new SeatComponentType.Dimensions();
    }

    /**
     * Create an instance of {@link SeatComponentType.Location }
     * 
     */
    public SeatComponentType.Location createSeatComponentTypeLocation() {
        return new SeatComponentType.Location();
    }

    /**
     * Create an instance of {@link SeatComponentType.Location.Space }
     * 
     */
    public SeatComponentType.Location.Space createSeatComponentTypeLocationSpace() {
        return new SeatComponentType.Location.Space();
    }

    /**
     * Create an instance of {@link WingPositionType }
     * 
     */
    public WingPositionType createWingPositionType() {
        return new WingPositionType();
    }

    /**
     * Create an instance of {@link ExitPositionType }
     * 
     */
    public ExitPositionType createExitPositionType() {
        return new ExitPositionType();
    }

    /**
     * Create an instance of {@link ExitPositionType.Rows }
     * 
     */
    public ExitPositionType.Rows createExitPositionTypeRows() {
        return new ExitPositionType.Rows();
    }

    /**
     * Create an instance of {@link TotalFareTransactionType }
     * 
     */
    public TotalFareTransactionType createTotalFareTransactionType() {
        return new TotalFareTransactionType();
    }

    /**
     * Create an instance of {@link ETFareInfoType }
     * 
     */
    public ETFareInfoType createETFareInfoType() {
        return new ETFareInfoType();
    }

    /**
     * Create an instance of {@link EquivFareTransactionType }
     * 
     */
    public EquivFareTransactionType createEquivFareTransactionType() {
        return new EquivFareTransactionType();
    }

    /**
     * Create an instance of {@link BaseFareTransactionType }
     * 
     */
    public BaseFareTransactionType createBaseFareTransactionType() {
        return new BaseFareTransactionType();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType }
     * 
     */
    public AddlBaggageInfoType createAddlBaggageInfoType() {
        return new AddlBaggageInfoType();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CheckedChargeableBag }
     * 
     */
    public AddlBaggageInfoType.CheckedChargeableBag createAddlBaggageInfoTypeCheckedChargeableBag() {
        return new AddlBaggageInfoType.CheckedChargeableBag();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CarryOnChargeableBag }
     * 
     */
    public AddlBaggageInfoType.CarryOnChargeableBag createAddlBaggageInfoTypeCarryOnChargeableBag() {
        return new AddlBaggageInfoType.CarryOnChargeableBag();
    }

    /**
     * Create an instance of {@link CouponEffectiveType }
     * 
     */
    public CouponEffectiveType createCouponEffectiveType() {
        return new CouponEffectiveType();
    }

    /**
     * Create an instance of {@link CouponInfoType }
     * 
     */
    public CouponInfoType createCouponInfoType() {
        return new CouponInfoType();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType }
     * 
     */
    public CarrierFeeInfoType createCarrierFeeInfoType() {
        return new CarrierFeeInfoType();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.Fee }
     * 
     */
    public CarrierFeeInfoType.Fee createCarrierFeeInfoTypeFee() {
        return new CarrierFeeInfoType.Fee();
    }

    /**
     * Create an instance of {@link VoucherMethodType }
     * 
     */
    public VoucherMethodType createVoucherMethodType() {
        return new VoucherMethodType();
    }

    /**
     * Create an instance of {@link RedemptionMethodType }
     * 
     */
    public RedemptionMethodType createRedemptionMethodType() {
        return new RedemptionMethodType();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType }
     * 
     */
    public PaymentCardMethodType createPaymentCardMethodType() {
        return new PaymentCardMethodType();
    }

    /**
     * Create an instance of {@link DirectBillMethodType }
     * 
     */
    public DirectBillMethodType createDirectBillMethodType() {
        return new DirectBillMethodType();
    }

    /**
     * Create an instance of {@link CashMethodType }
     * 
     */
    public CashMethodType createCashMethodType() {
        return new CashMethodType();
    }

    /**
     * Create an instance of {@link BankAccountMethodType }
     * 
     */
    public BankAccountMethodType createBankAccountMethodType() {
        return new BankAccountMethodType();
    }

    /**
     * Create an instance of {@link SeatLocationType }
     * 
     */
    public SeatLocationType createSeatLocationType() {
        return new SeatLocationType();
    }

    /**
     * Create an instance of {@link SeatLocationType.Row }
     * 
     */
    public SeatLocationType.Row createSeatLocationTypeRow() {
        return new SeatLocationType.Row();
    }

    /**
     * Create an instance of {@link OtherItemType }
     * 
     */
    public OtherItemType createOtherItemType() {
        return new OtherItemType();
    }

    /**
     * Create an instance of {@link FlightItemType }
     * 
     */
    public FlightItemType createFlightItemType() {
        return new FlightItemType();
    }

    /**
     * Create an instance of {@link BaggageItemType }
     * 
     */
    public BaggageItemType createBaggageItemType() {
        return new BaggageItemType();
    }

    /**
     * Create an instance of {@link BaggageItemType.BagDetail }
     * 
     */
    public BaggageItemType.BagDetail createBaggageItemTypeBagDetail() {
        return new BaggageItemType.BagDetail();
    }

    /**
     * Create an instance of {@link SettlementType }
     * 
     */
    public SettlementType createSettlementType() {
        return new SettlementType();
    }

    /**
     * Create an instance of {@link TicketByTimeLimitType }
     * 
     */
    public TicketByTimeLimitType createTicketByTimeLimitType() {
        return new TicketByTimeLimitType();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType }
     * 
     */
    public AirlineOffersSnapshotType createAirlineOffersSnapshotType() {
        return new AirlineOffersSnapshotType();
    }

    /**
     * Create an instance of {@link OfferMatchType }
     * 
     */
    public OfferMatchType createOfferMatchType() {
        return new OfferMatchType();
    }

    /**
     * Create an instance of {@link InvGuaranteeType }
     * 
     */
    public InvGuaranteeType createInvGuaranteeType() {
        return new InvGuaranteeType();
    }

    /**
     * Create an instance of {@link SeatOfferType }
     * 
     */
    public SeatOfferType createSeatOfferType() {
        return new SeatOfferType();
    }

    /**
     * Create an instance of {@link PricedFlightOfferAssocType }
     * 
     */
    public PricedFlightOfferAssocType createPricedFlightOfferAssocType() {
        return new PricedFlightOfferAssocType();
    }

    /**
     * Create an instance of {@link OtherOfferType }
     * 
     */
    public OtherOfferType createOtherOfferType() {
        return new OtherOfferType();
    }

    /**
     * Create an instance of {@link BaggageOfferType }
     * 
     */
    public BaggageOfferType createBaggageOfferType() {
        return new BaggageOfferType();
    }

    /**
     * Create an instance of {@link BaggageOfferType.BagDetail }
     * 
     */
    public BaggageOfferType.BagDetail createBaggageOfferTypeBagDetail() {
        return new BaggageOfferType.BagDetail();
    }

    /**
     * Create an instance of {@link MediaAssocType }
     * 
     */
    public MediaAssocType createMediaAssocType() {
        return new MediaAssocType();
    }

    /**
     * Create an instance of {@link PassengerMetadataType }
     * 
     */
    public PassengerMetadataType createPassengerMetadataType() {
        return new PassengerMetadataType();
    }

    /**
     * Create an instance of {@link TravelerMetadataType }
     * 
     */
    public TravelerMetadataType createTravelerMetadataType() {
        return new TravelerMetadataType();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType }
     * 
     */
    public ServiceQualifierPriceType createServiceQualifierPriceType() {
        return new ServiceQualifierPriceType();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment createServiceQualifierPriceTypeFulfillment() {
        return new ServiceQualifierPriceType.Fulfillment();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment.OfferValidDates createServiceQualifierPriceTypeFulfillmentOfferValidDates() {
        return new ServiceQualifierPriceType.Fulfillment.OfferValidDates();
    }

    /**
     * Create an instance of {@link OrderKeysType }
     * 
     */
    public OrderKeysType createOrderKeysType() {
        return new OrderKeysType();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType }
     * 
     */
    public OfferItemMetadataType createOfferItemMetadataType() {
        return new OfferItemMetadataType();
    }

    /**
     * Create an instance of {@link BaggageDetailMetadataType }
     * 
     */
    public BaggageDetailMetadataType createBaggageDetailMetadataType() {
        return new BaggageDetailMetadataType();
    }

    /**
     * Create an instance of {@link RuleMetadataType }
     * 
     */
    public RuleMetadataType createRuleMetadataType() {
        return new RuleMetadataType();
    }

    /**
     * Create an instance of {@link RuleMetadataType.Value }
     * 
     */
    public RuleMetadataType.Value createRuleMetadataTypeValue() {
        return new RuleMetadataType.Value();
    }

    /**
     * Create an instance of {@link PaymentCardMetadataType }
     * 
     */
    public PaymentCardMetadataType createPaymentCardMetadataType() {
        return new PaymentCardMetadataType();
    }

    /**
     * Create an instance of {@link MediaMetadataType }
     * 
     */
    public MediaMetadataType createMediaMetadataType() {
        return new MediaMetadataType();
    }

    /**
     * Create an instance of {@link EquivalentIDMetadataType }
     * 
     */
    public EquivalentIDMetadataType createEquivalentIDMetadataType() {
        return new EquivalentIDMetadataType();
    }

    /**
     * Create an instance of {@link CodesetMetadataType }
     * 
     */
    public CodesetMetadataType createCodesetMetadataType() {
        return new CodesetMetadataType();
    }

    /**
     * Create an instance of {@link CodesetMetadataType.Source }
     * 
     */
    public CodesetMetadataType.Source createCodesetMetadataTypeSource() {
        return new CodesetMetadataType.Source();
    }

    /**
     * Create an instance of {@link AirportMetadataType }
     * 
     */
    public AirportMetadataType createAirportMetadataType() {
        return new AirportMetadataType();
    }

    /**
     * Create an instance of {@link AddressMetadataType }
     * 
     */
    public AddressMetadataType createAddressMetadataType() {
        return new AddressMetadataType();
    }

    /**
     * Create an instance of {@link ItineraryType }
     * 
     */
    public ItineraryType createItineraryType() {
        return new ItineraryType();
    }

    /**
     * Create an instance of {@link AircraftFeaturesQueryType }
     * 
     */
    public AircraftFeaturesQueryType createAircraftFeaturesQueryType() {
        return new AircraftFeaturesQueryType();
    }

    /**
     * Create an instance of {@link TotalJourneyType }
     * 
     */
    public TotalJourneyType createTotalJourneyType() {
        return new TotalJourneyType();
    }

    /**
     * Create an instance of {@link FlightArrivalType }
     * 
     */
    public FlightArrivalType createFlightArrivalType() {
        return new FlightArrivalType();
    }

    /**
     * Create an instance of {@link StopLocationType }
     * 
     */
    public StopLocationType createStopLocationType() {
        return new StopLocationType();
    }

    /**
     * Create an instance of {@link FlightCOSCoreType }
     * 
     */
    public FlightCOSCoreType createFlightCOSCoreType() {
        return new FlightCOSCoreType();
    }

    /**
     * Create an instance of {@link FareQualifierType }
     * 
     */
    public FareQualifierType createFareQualifierType() {
        return new FareQualifierType();
    }

    /**
     * Create an instance of {@link FareFilingType }
     * 
     */
    public FareFilingType createFareFilingType() {
        return new FareFilingType();
    }

    /**
     * Create an instance of {@link FareComponentType }
     * 
     */
    public FareComponentType createFareComponentType() {
        return new FareComponentType();
    }

    /**
     * Create an instance of {@link FareRulesType }
     * 
     */
    public FareRulesType createFareRulesType() {
        return new FareRulesType();
    }

    /**
     * Create an instance of {@link FareRulesType.Ticketing }
     * 
     */
    public FareRulesType.Ticketing createFareRulesTypeTicketing() {
        return new FareRulesType.Ticketing();
    }

    /**
     * Create an instance of {@link FareDetailType }
     * 
     */
    public FareDetailType createFareDetailType() {
        return new FareDetailType();
    }

    /**
     * Create an instance of {@link ServiceBundle }
     * 
     */
    public ServiceBundle createServiceBundle() {
        return new ServiceBundle();
    }

    /**
     * Create an instance of {@link FareGroup }
     * 
     */
    public FareGroup createFareGroup() {
        return new FareGroup();
    }

    /**
     * Create an instance of {@link ContentSource }
     * 
     */
    public ContentSource createContentSource() {
        return new ContentSource();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType }
     * 
     */
    public TaxExemptionNoticeType createTaxExemptionNoticeType() {
        return new TaxExemptionNoticeType();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Results }
     * 
     */
    public TaxExemptionNoticeType.Results createTaxExemptionNoticeTypeResults() {
        return new TaxExemptionNoticeType.Results();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Results.TaxExemption }
     * 
     */
    public TaxExemptionNoticeType.Results.TaxExemption createTaxExemptionNoticeTypeResultsTaxExemption() {
        return new TaxExemptionNoticeType.Results.TaxExemption();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query }
     * 
     */
    public TaxExemptionNoticeType.Query createTaxExemptionNoticeTypeQuery() {
        return new TaxExemptionNoticeType.Query();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named }
     * 
     */
    public TaxExemptionNoticeType.Query.Named createTaxExemptionNoticeTypeQueryNamed() {
        return new TaxExemptionNoticeType.Query.Named();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType }
     * 
     */
    public ServiceFilterNoticeType createServiceFilterNoticeType() {
        return new ServiceFilterNoticeType();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results }
     * 
     */
    public ServiceFilterNoticeType.Results createServiceFilterNoticeTypeResults() {
        return new ServiceFilterNoticeType.Results();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilter }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilter createServiceFilterNoticeTypeResultsAppliedFilter() {
        return new ServiceFilterNoticeType.Results.AppliedFilter();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilter.Associations }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilter.Associations createServiceFilterNoticeTypeResultsAppliedFilterAssociations() {
        return new ServiceFilterNoticeType.Results.AppliedFilter.Associations();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilter.Associations.Offer }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilter.Associations.Offer createServiceFilterNoticeTypeResultsAppliedFilterAssociationsOffer() {
        return new ServiceFilterNoticeType.Results.AppliedFilter.Associations.Offer();
    }

    /**
     * Create an instance of {@link PricingParametersNoticeType }
     * 
     */
    public PricingParametersNoticeType createPricingParametersNoticeType() {
        return new PricingParametersNoticeType();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Results }
     * 
     */
    public PriceVarianceRuleNoticeType.Results createPriceVarianceRuleNoticeTypeResults() {
        return new PriceVarianceRuleNoticeType.Results();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Results.PriceVariance }
     * 
     */
    public PriceVarianceRuleNoticeType.Results.PriceVariance createPriceVarianceRuleNoticeTypeResultsPriceVariance() {
        return new PriceVarianceRuleNoticeType.Results.PriceVariance();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query }
     * 
     */
    public PriceVarianceRuleNoticeType.Query createPriceVarianceRuleNoticeTypeQuery() {
        return new PriceVarianceRuleNoticeType.Query();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule createPriceVarianceRuleNoticeTypeQueryPriceVarianceRule() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule();
    }

    /**
     * Create an instance of {@link PaymentRulesNoticeType }
     * 
     */
    public PaymentRulesNoticeType createPaymentRulesNoticeType() {
        return new PaymentRulesNoticeType();
    }

    /**
     * Create an instance of {@link PaymentRulesNoticeType.FormOfPayment }
     * 
     */
    public PaymentRulesNoticeType.FormOfPayment createPaymentRulesNoticeTypeFormOfPayment() {
        return new PaymentRulesNoticeType.FormOfPayment();
    }

    /**
     * Create an instance of {@link PaymentRulesNoticeType.FormOfPayment.Results }
     * 
     */
    public PaymentRulesNoticeType.FormOfPayment.Results createPaymentRulesNoticeTypeFormOfPaymentResults() {
        return new PaymentRulesNoticeType.FormOfPayment.Results();
    }

    /**
     * Create an instance of {@link InvGuaranteeNoticeType }
     * 
     */
    public InvGuaranteeNoticeType createInvGuaranteeNoticeType() {
        return new InvGuaranteeNoticeType();
    }

    /**
     * Create an instance of {@link InvGuaranteeNoticeType.Results }
     * 
     */
    public InvGuaranteeNoticeType.Results createInvGuaranteeNoticeTypeResults() {
        return new InvGuaranteeNoticeType.Results();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType }
     * 
     */
    public SecurePaymentAlertType createSecurePaymentAlertType() {
        return new SecurePaymentAlertType();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.ProcessingInfo }
     * 
     */
    public SecurePaymentAlertType.ProcessingInfo createSecurePaymentAlertTypeProcessingInfo() {
        return new SecurePaymentAlertType.ProcessingInfo();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details }
     * 
     */
    public SecurePaymentAlertType.Details createSecurePaymentAlertTypeDetails() {
        return new SecurePaymentAlertType.Details();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Reference }
     * 
     */
    public SecurePaymentAlertType.Reference createSecurePaymentAlertTypeReference() {
        return new SecurePaymentAlertType.Reference();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Airline }
     * 
     */
    public SecurePaymentAlertType.Airline createSecurePaymentAlertTypeAirline() {
        return new SecurePaymentAlertType.Airline();
    }

    /**
     * Create an instance of {@link PINAuthTravelerType }
     * 
     */
    public PINAuthTravelerType createPINAuthTravelerType() {
        return new PINAuthTravelerType();
    }

    /**
     * Create an instance of {@link InvDiscrepencyAlertType }
     * 
     */
    public InvDiscrepencyAlertType createInvDiscrepencyAlertType() {
        return new InvDiscrepencyAlertType();
    }

    /**
     * Create an instance of {@link InvDiscrepencyAlertType.AlternateOffers }
     * 
     */
    public InvDiscrepencyAlertType.AlternateOffers createInvDiscrepencyAlertTypeAlternateOffers() {
        return new InvDiscrepencyAlertType.AlternateOffers();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType }
     * 
     */
    public OrderItemAssociationType createOrderItemAssociationType() {
        return new OrderItemAssociationType();
    }

    /**
     * Create an instance of {@link MsgPartiesType }
     * 
     */
    public MsgPartiesType createMsgPartiesType() {
        return new MsgPartiesType();
    }

    /**
     * Create an instance of {@link MsgPartiesType.Participants }
     * 
     */
    public MsgPartiesType.Participants createMsgPartiesTypeParticipants() {
        return new MsgPartiesType.Participants();
    }

    /**
     * Create an instance of {@link PointOfSaleType }
     * 
     */
    public PointOfSaleType createPointOfSaleType() {
        return new PointOfSaleType();
    }

    /**
     * Create an instance of {@link PointOfSaleType.TouchPoint }
     * 
     */
    public PointOfSaleType.TouchPoint createPointOfSaleTypeTouchPoint() {
        return new PointOfSaleType.TouchPoint();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType }
     * 
     */
    public FulfillmentPartnerType createFulfillmentPartnerType() {
        return new FulfillmentPartnerType();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillment }
     * 
     */
    public FulfillmentPartnerType.Fulfillment createFulfillmentPartnerTypeFulfillment() {
        return new FulfillmentPartnerType.Fulfillment();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillment.OfferValidDates }
     * 
     */
    public FulfillmentPartnerType.Fulfillment.OfferValidDates createFulfillmentPartnerTypeFulfillmentOfferValidDates() {
        return new FulfillmentPartnerType.Fulfillment.OfferValidDates();
    }

    /**
     * Create an instance of {@link PrimaryContact.Name }
     * 
     */
    public PrimaryContact.Name createPrimaryContactName() {
        return new PrimaryContact.Name();
    }

    /**
     * Create an instance of {@link PassengerSummaryType.PassengerIDInfo }
     * 
     */
    public PassengerSummaryType.PassengerIDInfo createPassengerSummaryTypePassengerIDInfo() {
        return new PassengerSummaryType.PassengerIDInfo();
    }

    /**
     * Create an instance of {@link PassengerSummaryType.PassengerIDInfo.FOID }
     * 
     */
    public PassengerSummaryType.PassengerIDInfo.FOID createPassengerSummaryTypePassengerIDInfoFOID() {
        return new PassengerSummaryType.PassengerIDInfo.FOID();
    }

    /**
     * Create an instance of {@link TravelerSummaryType.Name }
     * 
     */
    public TravelerSummaryType.Name createTravelerSummaryTypeName() {
        return new TravelerSummaryType.Name();
    }

    /**
     * Create an instance of {@link TravelerCoreType.Age }
     * 
     */
    public TravelerCoreType.Age createTravelerCoreTypeAge() {
        return new TravelerCoreType.Age();
    }

    /**
     * Create an instance of {@link TravelerDetailType }
     * 
     */
    public TravelerDetailType createTravelerDetailType() {
        return new TravelerDetailType();
    }

    /**
     * Create an instance of {@link TaxExemptionType }
     * 
     */
    public TaxExemptionType createTaxExemptionType() {
        return new TaxExemptionType();
    }

    /**
     * Create an instance of {@link StateProvQueryType }
     * 
     */
    public StateProvQueryType createStateProvQueryType() {
        return new StateProvQueryType();
    }

    /**
     * Create an instance of {@link ShoppingResponseIDType }
     * 
     */
    public ShoppingResponseIDType createShoppingResponseIDType() {
        return new ShoppingResponseIDType();
    }

    /**
     * Create an instance of {@link RuleType }
     * 
     */
    public RuleType createRuleType() {
        return new RuleType();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleType }
     * 
     */
    public PriceVarianceRuleType createPriceVarianceRuleType() {
        return new PriceVarianceRuleType();
    }

    /**
     * Create an instance of {@link AwardRedemptionType }
     * 
     */
    public AwardRedemptionType createAwardRedemptionType() {
        return new AwardRedemptionType();
    }

    /**
     * Create an instance of {@link CombinationPriceType }
     * 
     */
    public CombinationPriceType createCombinationPriceType() {
        return new CombinationPriceType();
    }

    /**
     * Create an instance of {@link CombinationPriceType.Partial }
     * 
     */
    public CombinationPriceType.Partial createCombinationPriceTypePartial() {
        return new CombinationPriceType.Partial();
    }

    /**
     * Create an instance of {@link Voucher.Name }
     * 
     */
    public Voucher.Name createVoucherName() {
        return new Voucher.Name();
    }

    /**
     * Create an instance of {@link PaymentCardType }
     * 
     */
    public PaymentCardType createPaymentCardType() {
        return new PaymentCardType();
    }

    /**
     * Create an instance of {@link DirectBillType }
     * 
     */
    public DirectBillType createDirectBillType() {
        return new DirectBillType();
    }

    /**
     * Create an instance of {@link BankAccountType }
     * 
     */
    public BankAccountType createBankAccountType() {
        return new BankAccountType();
    }

    /**
     * Create an instance of {@link CampaignReferralType }
     * 
     */
    public CampaignReferralType createCampaignReferralType() {
        return new CampaignReferralType();
    }

    /**
     * Create an instance of {@link CampaignReferralType.UTM }
     * 
     */
    public CampaignReferralType.UTM createCampaignReferralTypeUTM() {
        return new CampaignReferralType.UTM();
    }

    /**
     * Create an instance of {@link TravelerFQTVType }
     * 
     */
    public TravelerFQTVType createTravelerFQTVType() {
        return new TravelerFQTVType();
    }

    /**
     * Create an instance of {@link TravelerFQTVType.Account }
     * 
     */
    public TravelerFQTVType.Account createTravelerFQTVTypeAccount() {
        return new TravelerFQTVType.Account();
    }

    /**
     * Create an instance of {@link FQTVAllianceType }
     * 
     */
    public FQTVAllianceType createFQTVAllianceType() {
        return new FQTVAllianceType();
    }

    /**
     * Create an instance of {@link FQTVProgramCoreType }
     * 
     */
    public FQTVProgramCoreType createFQTVProgramCoreType() {
        return new FQTVProgramCoreType();
    }

    /**
     * Create an instance of {@link FQTVProgramSummaryType }
     * 
     */
    public FQTVProgramSummaryType createFQTVProgramSummaryType() {
        return new FQTVProgramSummaryType();
    }

    /**
     * Create an instance of {@link FQTVProgramDetailType }
     * 
     */
    public FQTVProgramDetailType createFQTVProgramDetailType() {
        return new FQTVProgramDetailType();
    }

    /**
     * Create an instance of {@link FQTVProgramCoreType.Account }
     * 
     */
    public FQTVProgramCoreType.Account createFQTVProgramCoreTypeAccount() {
        return new FQTVProgramCoreType.Account();
    }

    /**
     * Create an instance of {@link DirectionsType }
     * 
     */
    public DirectionsType createDirectionsType() {
        return new DirectionsType();
    }

    /**
     * Create an instance of {@link MediaAttachmentType }
     * 
     */
    public MediaAttachmentType createMediaAttachmentType() {
        return new MediaAttachmentType();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Contact }
     * 
     */
    public org.iata.ndc.schema.Contact createContact() {
        return new org.iata.ndc.schema.Contact();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Contact.Name }
     * 
     */
    public org.iata.ndc.schema.Contact.Name createContactName() {
        return new org.iata.ndc.schema.Contact.Name();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType }
     * 
     */
    public BagAllowanceDimensionType createBagAllowanceDimensionType() {
        return new BagAllowanceDimensionType();
    }

    /**
     * Create an instance of {@link AttributesType }
     * 
     */
    public AttributesType createAttributesType() {
        return new AttributesType();
    }

    /**
     * Create an instance of {@link AirPassCoreType }
     * 
     */
    public AirPassCoreType createAirPassCoreType() {
        return new AirPassCoreType();
    }

    /**
     * Create an instance of {@link AirPassDetailType }
     * 
     */
    public AirPassDetailType createAirPassDetailType() {
        return new AirPassDetailType();
    }

    /**
     * Create an instance of {@link AirPassCoreType.Certificate }
     * 
     */
    public AirPassCoreType.Certificate createAirPassCoreTypeCertificate() {
        return new AirPassCoreType.Certificate();
    }

    /**
     * Create an instance of {@link PaymentAddrType }
     * 
     */
    public PaymentAddrType createPaymentAddrType() {
        return new PaymentAddrType();
    }

    /**
     * Create an instance of {@link AddressCoreType }
     * 
     */
    public AddressCoreType createAddressCoreType() {
        return new AddressCoreType();
    }

    /**
     * Create an instance of {@link AddressDetailType }
     * 
     */
    public AddressDetailType createAddressDetailType() {
        return new AddressDetailType();
    }

    /**
     * Create an instance of {@link AugPointInfoType }
     * 
     */
    public AugPointInfoType createAugPointInfoType() {
        return new AugPointInfoType();
    }

    /**
     * Create an instance of {@link DateTimeRepType }
     * 
     */
    public DateTimeRepType createDateTimeRepType() {
        return new DateTimeRepType();
    }

    /**
     * Create an instance of {@link DayRepType }
     * 
     */
    public DayRepType createDayRepType() {
        return new DayRepType();
    }

    /**
     * Create an instance of {@link MonthYearRepType }
     * 
     */
    public MonthYearRepType createMonthYearRepType() {
        return new MonthYearRepType();
    }

    /**
     * Create an instance of {@link MonthRepType }
     * 
     */
    public MonthRepType createMonthRepType() {
        return new MonthRepType();
    }

    /**
     * Create an instance of {@link DateRepType }
     * 
     */
    public DateRepType createDateRepType() {
        return new DateRepType();
    }

    /**
     * Create an instance of {@link TimestampType }
     * 
     */
    public TimestampType createTimestampType() {
        return new TimestampType();
    }

    /**
     * Create an instance of {@link YearRepType }
     * 
     */
    public YearRepType createYearRepType() {
        return new YearRepType();
    }

    /**
     * Create an instance of {@link YearMonthRepType }
     * 
     */
    public YearMonthRepType createYearMonthRepType() {
        return new YearMonthRepType();
    }

    /**
     * Create an instance of {@link DatePeriodRepType }
     * 
     */
    public DatePeriodRepType createDatePeriodRepType() {
        return new DatePeriodRepType();
    }

    /**
     * Create an instance of {@link DateTimePeriodRepType }
     * 
     */
    public DateTimePeriodRepType createDateTimePeriodRepType() {
        return new DateTimePeriodRepType();
    }

    /**
     * Create an instance of {@link DayPeriodRepType }
     * 
     */
    public DayPeriodRepType createDayPeriodRepType() {
        return new DayPeriodRepType();
    }

    /**
     * Create an instance of {@link MonthPeriodRepType }
     * 
     */
    public MonthPeriodRepType createMonthPeriodRepType() {
        return new MonthPeriodRepType();
    }

    /**
     * Create an instance of {@link QuarterPeriodRepType }
     * 
     */
    public QuarterPeriodRepType createQuarterPeriodRepType() {
        return new QuarterPeriodRepType();
    }

    /**
     * Create an instance of {@link TimePeriodRepType }
     * 
     */
    public TimePeriodRepType createTimePeriodRepType() {
        return new TimePeriodRepType();
    }

    /**
     * Create an instance of {@link YearPeriodRepType }
     * 
     */
    public YearPeriodRepType createYearPeriodRepType() {
        return new YearPeriodRepType();
    }

    /**
     * Create an instance of {@link YearMonthPeriodRepType }
     * 
     */
    public YearMonthPeriodRepType createYearMonthPeriodRepType() {
        return new YearMonthPeriodRepType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Address }
     * 
     */
    public org.iata.ndc.schema.Address createAddress() {
        return new org.iata.ndc.schema.Address();
    }

    /**
     * Create an instance of {@link SimpleAddrType }
     * 
     */
    public SimpleAddrType createSimpleAddrType() {
        return new SimpleAddrType();
    }

    /**
     * Create an instance of {@link StructuredAddrType }
     * 
     */
    public StructuredAddrType createStructuredAddrType() {
        return new StructuredAddrType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.AirportCode }
     * 
     */
    public org.iata.ndc.schema.AirportCode createAirportCode() {
        return new org.iata.ndc.schema.AirportCode();
    }

    /**
     * Create an instance of {@link BagAllowanceDescType }
     * 
     */
    public BagAllowanceDescType createBagAllowanceDescType() {
        return new BagAllowanceDescType();
    }

    /**
     * Create an instance of {@link CarryOnBags }
     * 
     */
    public CarryOnBags createCarryOnBags() {
        return new CarryOnBags();
    }

    /**
     * Create an instance of {@link CarryOnAllowanceType.CarryOnBag }
     * 
     */
    public CarryOnAllowanceType.CarryOnBag createCarryOnAllowanceTypeCarryOnBag() {
        return new CarryOnAllowanceType.CarryOnBag();
    }

    /**
     * Create an instance of {@link CheckedBags }
     * 
     */
    public CheckedBags createCheckedBags() {
        return new CheckedBags();
    }

    /**
     * Create an instance of {@link CheckedBagAllowanceType.CheckedBag }
     * 
     */
    public CheckedBagAllowanceType.CheckedBag createCheckedBagAllowanceTypeCheckedBag() {
        return new CheckedBagAllowanceType.CheckedBag();
    }

    /**
     * Create an instance of {@link PieceAllowance }
     * 
     */
    public PieceAllowance createPieceAllowance() {
        return new PieceAllowance();
    }

    /**
     * Create an instance of {@link BagAllowancePieceType.PieceMeasurements }
     * 
     */
    public BagAllowancePieceType.PieceMeasurements createBagAllowancePieceTypePieceMeasurements() {
        return new BagAllowancePieceType.PieceMeasurements();
    }

    /**
     * Create an instance of {@link WeightAllowance }
     * 
     */
    public WeightAllowance createWeightAllowance() {
        return new WeightAllowance();
    }

    /**
     * Create an instance of {@link BagAllowanceWeightType.MaximumWeight }
     * 
     */
    public BagAllowanceWeightType.MaximumWeight createBagAllowanceWeightTypeMaximumWeight() {
        return new BagAllowanceWeightType.MaximumWeight();
    }

    /**
     * Create an instance of {@link BookingReference }
     * 
     */
    public BookingReference createBookingReference() {
        return new BookingReference();
    }

    /**
     * Create an instance of {@link CodesetType }
     * 
     */
    public CodesetType createCodesetType() {
        return new CodesetType();
    }

    /**
     * Create an instance of {@link BookingReferenceType.AirlineID }
     * 
     */
    public BookingReferenceType.AirlineID createBookingReferenceTypeAirlineID() {
        return new BookingReferenceType.AirlineID();
    }

    /**
     * Create an instance of {@link BookingReferenceType.OtherID }
     * 
     */
    public BookingReferenceType.OtherID createBookingReferenceTypeOtherID() {
        return new BookingReferenceType.OtherID();
    }

    /**
     * Create an instance of {@link CityCode }
     * 
     */
    public CityCode createCityCode() {
        return new CityCode();
    }

    /**
     * Create an instance of {@link CityCodeType }
     * 
     */
    public CityCodeType createCityCodeType() {
        return new CityCodeType();
    }

    /**
     * Create an instance of {@link AddressContactType }
     * 
     */
    public AddressContactType createAddressContactType() {
        return new AddressContactType();
    }

    /**
     * Create an instance of {@link PhoneContactType }
     * 
     */
    public PhoneContactType createPhoneContactType() {
        return new PhoneContactType();
    }

    /**
     * Create an instance of {@link OtherContactMethodType }
     * 
     */
    public OtherContactMethodType createOtherContactMethodType() {
        return new OtherContactMethodType();
    }

    /**
     * Create an instance of {@link CommissionType }
     * 
     */
    public CommissionType createCommissionType() {
        return new CommissionType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.CountryCode }
     * 
     */
    public org.iata.ndc.schema.CountryCode createCountryCode() {
        return new org.iata.ndc.schema.CountryCode();
    }

    /**
     * Create an instance of {@link CountryCodeType }
     * 
     */
    public CountryCodeType createCountryCodeType() {
        return new CountryCodeType();
    }

    /**
     * Create an instance of {@link CurrencyAmountOptType }
     * 
     */
    public CurrencyAmountOptType createCurrencyAmountOptType() {
        return new CurrencyAmountOptType();
    }

    /**
     * Create an instance of {@link CurrCode }
     * 
     */
    public CurrCode createCurrCode() {
        return new CurrCode();
    }

    /**
     * Create an instance of {@link CurrencyAmountEncodedType }
     * 
     */
    public CurrencyAmountEncodedType createCurrencyAmountEncodedType() {
        return new CurrencyAmountEncodedType();
    }

    /**
     * Create an instance of {@link ISOCurrencyCode }
     * 
     */
    public ISOCurrencyCode createISOCurrencyCode() {
        return new ISOCurrencyCode();
    }

    /**
     * Create an instance of {@link CurrencyCodeType }
     * 
     */
    public CurrencyCodeType createCurrencyCodeType() {
        return new CurrencyCodeType();
    }

    /**
     * Create an instance of {@link MessageCurrencies }
     * 
     */
    public MessageCurrencies createMessageCurrencies() {
        return new MessageCurrencies();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Description }
     * 
     */
    public org.iata.ndc.schema.Description createDescription() {
        return new org.iata.ndc.schema.Description();
    }

    /**
     * Create an instance of {@link DescriptionType.Text }
     * 
     */
    public DescriptionType.Text createDescriptionTypeText() {
        return new DescriptionType.Text();
    }

    /**
     * Create an instance of {@link DescriptionType.Media }
     * 
     */
    public DescriptionType.Media createDescriptionTypeMedia() {
        return new DescriptionType.Media();
    }

    /**
     * Create an instance of {@link MediaIDType }
     * 
     */
    public MediaIDType createMediaIDType() {
        return new MediaIDType();
    }

    /**
     * Create an instance of {@link MediaLink }
     * 
     */
    public MediaLink createMediaLink() {
        return new MediaLink();
    }

    /**
     * Create an instance of {@link Disclosures }
     * 
     */
    public Disclosures createDisclosures() {
        return new Disclosures();
    }

    /**
     * Create an instance of {@link DisclosureType }
     * 
     */
    public DisclosureType createDisclosureType() {
        return new DisclosureType();
    }

    /**
     * Create an instance of {@link FQTVProgramIDType }
     * 
     */
    public FQTVProgramIDType createFQTVProgramIDType() {
        return new FQTVProgramIDType();
    }

    /**
     * Create an instance of {@link AllianceProgramType }
     * 
     */
    public AllianceProgramType createAllianceProgramType() {
        return new AllianceProgramType();
    }

    /**
     * Create an instance of {@link AllianceAirlinePartyType }
     * 
     */
    public AllianceAirlinePartyType createAllianceAirlinePartyType() {
        return new AllianceAirlinePartyType();
    }

    /**
     * Create an instance of {@link InstantPurchaseType }
     * 
     */
    public InstantPurchaseType createInstantPurchaseType() {
        return new InstantPurchaseType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.KeyWord }
     * 
     */
    public org.iata.ndc.schema.KeyWord createKeyWord() {
        return new org.iata.ndc.schema.KeyWord();
    }

    /**
     * Create an instance of {@link KeyWordType.Word }
     * 
     */
    public KeyWordType.Word createKeyWordTypeWord() {
        return new KeyWordType.Word();
    }

    /**
     * Create an instance of {@link KeyWordType.Value }
     * 
     */
    public KeyWordType.Value createKeyWordTypeValue() {
        return new KeyWordType.Value();
    }

    /**
     * Create an instance of {@link LanguageCodeType }
     * 
     */
    public LanguageCodeType createLanguageCodeType() {
        return new LanguageCodeType();
    }

    /**
     * Create an instance of {@link Languages }
     * 
     */
    public Languages createLanguages() {
        return new Languages();
    }

    /**
     * Create an instance of {@link Cash }
     * 
     */
    public Cash createCash() {
        return new Cash();
    }

    /**
     * Create an instance of {@link Check }
     * 
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption.MemberNumber }
     * 
     */
    public LoyaltyRedemption.MemberNumber createLoyaltyRedemptionMemberNumber() {
        return new LoyaltyRedemption.MemberNumber();
    }

    /**
     * Create an instance of {@link MiscChargeOrder }
     * 
     */
    public MiscChargeOrder createMiscChargeOrder() {
        return new MiscChargeOrder();
    }

    /**
     * Create an instance of {@link Other }
     * 
     */
    public Other createOther() {
        return new Other();
    }

    /**
     * Create an instance of {@link PaymentForms.PaymentForm }
     * 
     */
    public PaymentForms.PaymentForm createPaymentFormsPaymentForm() {
        return new PaymentForms.PaymentForm();
    }

    /**
     * Create an instance of {@link Voucher.EffectiveExpireDate }
     * 
     */
    public Voucher.EffectiveExpireDate createVoucherEffectiveExpireDate() {
        return new Voucher.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link PenaltyDetailType }
     * 
     */
    public PenaltyDetailType createPenaltyDetailType() {
        return new PenaltyDetailType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Position }
     * 
     */
    public org.iata.ndc.schema.Position createPosition() {
        return new org.iata.ndc.schema.Position();
    }

    /**
     * Create an instance of {@link PositionType.Latitude }
     * 
     */
    public PositionType.Latitude createPositionTypeLatitude() {
        return new PositionType.Latitude();
    }

    /**
     * Create an instance of {@link PositionType.Longitude }
     * 
     */
    public PositionType.Longitude createPositionTypeLongitude() {
        return new PositionType.Longitude();
    }

    /**
     * Create an instance of {@link PositionType.Altitude }
     * 
     */
    public PositionType.Altitude createPositionTypeAltitude() {
        return new PositionType.Altitude();
    }

    /**
     * Create an instance of {@link AwardPriceUnitType }
     * 
     */
    public AwardPriceUnitType createAwardPriceUnitType() {
        return new AwardPriceUnitType();
    }

    /**
     * Create an instance of {@link EncodedPriceType }
     * 
     */
    public EncodedPriceType createEncodedPriceType() {
        return new EncodedPriceType();
    }

    /**
     * Create an instance of {@link SimpleCurrencyPriceType }
     * 
     */
    public SimpleCurrencyPriceType createSimpleCurrencyPriceType() {
        return new SimpleCurrencyPriceType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.PriceVarianceRules }
     * 
     */
    public org.iata.ndc.schema.PriceVarianceRules createPriceVarianceRules() {
        return new org.iata.ndc.schema.PriceVarianceRules();
    }

    /**
     * Create an instance of {@link Rules }
     * 
     */
    public Rules createRules() {
        return new Rules();
    }

    /**
     * Create an instance of {@link StateProvCodeType }
     * 
     */
    public StateProvCodeType createStateProvCodeType() {
        return new StateProvCodeType();
    }

    /**
     * Create an instance of {@link TicketDesignatorType }
     * 
     */
    public TicketDesignatorType createTicketDesignatorType() {
        return new TicketDesignatorType();
    }

    /**
     * Create an instance of {@link DepositTimeLimit }
     * 
     */
    public DepositTimeLimit createDepositTimeLimit() {
        return new DepositTimeLimit();
    }

    /**
     * Create an instance of {@link DepositTimeLimitType }
     * 
     */
    public DepositTimeLimitType createDepositTimeLimitType() {
        return new DepositTimeLimitType();
    }

    /**
     * Create an instance of {@link InventoryGuaranteeTimeLimits }
     * 
     */
    public InventoryGuaranteeTimeLimits createInventoryGuaranteeTimeLimits() {
        return new InventoryGuaranteeTimeLimits();
    }

    /**
     * Create an instance of {@link CoreDateGrpType }
     * 
     */
    public CoreDateGrpType createCoreDateGrpType() {
        return new CoreDateGrpType();
    }

    /**
     * Create an instance of {@link NamingTimeLimit }
     * 
     */
    public NamingTimeLimit createNamingTimeLimit() {
        return new NamingTimeLimit();
    }

    /**
     * Create an instance of {@link NamingTimeLimitType }
     * 
     */
    public NamingTimeLimitType createNamingTimeLimitType() {
        return new NamingTimeLimitType();
    }

    /**
     * Create an instance of {@link PaymentTimeLimitType }
     * 
     */
    public PaymentTimeLimitType createPaymentTimeLimitType() {
        return new PaymentTimeLimitType();
    }

    /**
     * Create an instance of {@link PriceGuaranteeTimeLimitType }
     * 
     */
    public PriceGuaranteeTimeLimitType createPriceGuaranteeTimeLimitType() {
        return new PriceGuaranteeTimeLimitType();
    }

    /**
     * Create an instance of {@link TicketingTimeLimits }
     * 
     */
    public TicketingTimeLimits createTicketingTimeLimits() {
        return new TicketingTimeLimits();
    }

    /**
     * Create an instance of {@link TicketingTimeLimitType }
     * 
     */
    public TicketingTimeLimitType createTicketingTimeLimitType() {
        return new TicketingTimeLimitType();
    }

    /**
     * Create an instance of {@link AnonymousTravelerType }
     * 
     */
    public AnonymousTravelerType createAnonymousTravelerType() {
        return new AnonymousTravelerType();
    }

    /**
     * Create an instance of {@link PassengerDetailType }
     * 
     */
    public PassengerDetailType createPassengerDetailType() {
        return new PassengerDetailType();
    }

    /**
     * Create an instance of {@link KeyObjectBaseType }
     * 
     */
    public KeyObjectBaseType createKeyObjectBaseType() {
        return new KeyObjectBaseType();
    }

    /**
     * Create an instance of {@link TravelerCoreType.PTC }
     * 
     */
    public TravelerCoreType.PTC createTravelerCoreTypePTC() {
        return new TravelerCoreType.PTC();
    }

    /**
     * Create an instance of {@link TravelerCoreType.ResidenceCode }
     * 
     */
    public TravelerCoreType.ResidenceCode createTravelerCoreTypeResidenceCode() {
        return new TravelerCoreType.ResidenceCode();
    }

    /**
     * Create an instance of {@link TravelerCoreType.CitizenshipCountryCode }
     * 
     */
    public TravelerCoreType.CitizenshipCountryCode createTravelerCoreTypeCitizenshipCountryCode() {
        return new TravelerCoreType.CitizenshipCountryCode();
    }

    /**
     * Create an instance of {@link TravelerSummaryType.ProfileID }
     * 
     */
    public TravelerSummaryType.ProfileID createTravelerSummaryTypeProfileID() {
        return new TravelerSummaryType.ProfileID();
    }

    /**
     * Create an instance of {@link PassengerSummaryType.FQTVs }
     * 
     */
    public PassengerSummaryType.FQTVs createPassengerSummaryTypeFQTVs() {
        return new PassengerSummaryType.FQTVs();
    }

    /**
     * Create an instance of {@link PassengerSummaryType.Gender }
     * 
     */
    public PassengerSummaryType.Gender createPassengerSummaryTypeGender() {
        return new PassengerSummaryType.Gender();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Passenger.AdditionalRoles }
     * 
     */
    public org.iata.ndc.schema.Passenger.AdditionalRoles createPassengerAdditionalRoles() {
        return new org.iata.ndc.schema.Passenger.AdditionalRoles();
    }

    /**
     * Create an instance of {@link PrimaryContact.Contact }
     * 
     */
    public PrimaryContact.Contact createPrimaryContactContact() {
        return new PrimaryContact.Contact();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.AirlineID }
     * 
     */
    public org.iata.ndc.schema.AirlineID createAirlineID() {
        return new org.iata.ndc.schema.AirlineID();
    }

    /**
     * Create an instance of {@link AirlineIDType }
     * 
     */
    public AirlineIDType createAirlineIDType() {
        return new AirlineIDType();
    }

    /**
     * Create an instance of {@link RetailerIDType }
     * 
     */
    public RetailerIDType createRetailerIDType() {
        return new RetailerIDType();
    }

    /**
     * Create an instance of {@link MarketingCarrierType }
     * 
     */
    public MarketingCarrierType createMarketingCarrierType() {
        return new MarketingCarrierType();
    }

    /**
     * Create an instance of {@link OperatingCarrierType }
     * 
     */
    public OperatingCarrierType createOperatingCarrierType() {
        return new OperatingCarrierType();
    }

    /**
     * Create an instance of {@link RetailerType }
     * 
     */
    public RetailerType createRetailerType() {
        return new RetailerType();
    }

    /**
     * Create an instance of {@link AggregatorIDType }
     * 
     */
    public AggregatorIDType createAggregatorIDType() {
        return new AggregatorIDType();
    }

    /**
     * Create an instance of {@link AggregatorType }
     * 
     */
    public AggregatorType createAggregatorType() {
        return new AggregatorType();
    }

    /**
     * Create an instance of {@link EnabledSystemType }
     * 
     */
    public EnabledSystemType createEnabledSystemType() {
        return new EnabledSystemType();
    }

    /**
     * Create an instance of {@link RoleOfIntermediaryReferenceType }
     * 
     */
    public RoleOfIntermediaryReferenceType createRoleOfIntermediaryReferenceType() {
        return new RoleOfIntermediaryReferenceType();
    }

    /**
     * Create an instance of {@link SystemIDType }
     * 
     */
    public SystemIDType createSystemIDType() {
        return new SystemIDType();
    }

    /**
     * Create an instance of {@link AgencyIDType }
     * 
     */
    public AgencyIDType createAgencyIDType() {
        return new AgencyIDType();
    }

    /**
     * Create an instance of {@link AgentUserIDType }
     * 
     */
    public AgentUserIDType createAgentUserIDType() {
        return new AgentUserIDType();
    }

    /**
     * Create an instance of {@link TravelAgency }
     * 
     */
    public TravelAgency createTravelAgency() {
        return new TravelAgency();
    }

    /**
     * Create an instance of {@link TravelAgencyType }
     * 
     */
    public TravelAgencyType createTravelAgencyType() {
        return new TravelAgencyType();
    }

    /**
     * Create an instance of {@link SellerCoreRepType }
     * 
     */
    public SellerCoreRepType createSellerCoreRepType() {
        return new SellerCoreRepType();
    }

    /**
     * Create an instance of {@link ActorObjectType }
     * 
     */
    public ActorObjectType createActorObjectType() {
        return new ActorObjectType();
    }

    /**
     * Create an instance of {@link AgencyCoreRepType.PseudoCity }
     * 
     */
    public AgencyCoreRepType.PseudoCity createAgencyCoreRepTypePseudoCity() {
        return new AgencyCoreRepType.PseudoCity();
    }

    /**
     * Create an instance of {@link PartnerCompanyIDType }
     * 
     */
    public PartnerCompanyIDType createPartnerCompanyIDType() {
        return new PartnerCompanyIDType();
    }

    /**
     * Create an instance of {@link MsgDocumentType }
     * 
     */
    public MsgDocumentType createMsgDocumentType() {
        return new MsgDocumentType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Policy }
     * 
     */
    public org.iata.ndc.schema.Policy createPolicy() {
        return new org.iata.ndc.schema.Policy();
    }

    /**
     * Create an instance of {@link ORAAirlineSenderType }
     * 
     */
    public ORAAirlineSenderType createORAAirlineSenderType() {
        return new ORAAirlineSenderType();
    }

    /**
     * Create an instance of {@link POAAirlineSenderType }
     * 
     */
    public POAAirlineSenderType createPOAAirlineSenderType() {
        return new POAAirlineSenderType();
    }

    /**
     * Create an instance of {@link AggregatorSenderType }
     * 
     */
    public AggregatorSenderType createAggregatorSenderType() {
        return new AggregatorSenderType();
    }

    /**
     * Create an instance of {@link AgentUserSenderType }
     * 
     */
    public AgentUserSenderType createAgentUserSenderType() {
        return new AgentUserSenderType();
    }

    /**
     * Create an instance of {@link EnabledSysSenderType }
     * 
     */
    public EnabledSysSenderType createEnabledSysSenderType() {
        return new EnabledSysSenderType();
    }

    /**
     * Create an instance of {@link MarketingCarrierSenderType }
     * 
     */
    public MarketingCarrierSenderType createMarketingCarrierSenderType() {
        return new MarketingCarrierSenderType();
    }

    /**
     * Create an instance of {@link OperatingCarrierSenderType }
     * 
     */
    public OperatingCarrierSenderType createOperatingCarrierSenderType() {
        return new OperatingCarrierSenderType();
    }

    /**
     * Create an instance of {@link RetailSupplierSenderType }
     * 
     */
    public RetailSupplierSenderType createRetailSupplierSenderType() {
        return new RetailSupplierSenderType();
    }

    /**
     * Create an instance of {@link TravelAgencySenderType }
     * 
     */
    public TravelAgencySenderType createTravelAgencySenderType() {
        return new TravelAgencySenderType();
    }

    /**
     * Create an instance of {@link CorporateSender }
     * 
     */
    public CorporateSender createCorporateSender() {
        return new CorporateSender();
    }

    /**
     * Create an instance of {@link CorporateParticipant }
     * 
     */
    public CorporateParticipant createCorporateParticipant() {
        return new CorporateParticipant();
    }

    /**
     * Create an instance of {@link AggregatorRecipientType }
     * 
     */
    public AggregatorRecipientType createAggregatorRecipientType() {
        return new AggregatorRecipientType();
    }

    /**
     * Create an instance of {@link AgentUserRecipientType }
     * 
     */
    public AgentUserRecipientType createAgentUserRecipientType() {
        return new AgentUserRecipientType();
    }

    /**
     * Create an instance of {@link EnabledSysRecipientType }
     * 
     */
    public EnabledSysRecipientType createEnabledSysRecipientType() {
        return new EnabledSysRecipientType();
    }

    /**
     * Create an instance of {@link MarketingCarrierRecipientType }
     * 
     */
    public MarketingCarrierRecipientType createMarketingCarrierRecipientType() {
        return new MarketingCarrierRecipientType();
    }

    /**
     * Create an instance of {@link OperatingCarrierRecipientType }
     * 
     */
    public OperatingCarrierRecipientType createOperatingCarrierRecipientType() {
        return new OperatingCarrierRecipientType();
    }

    /**
     * Create an instance of {@link ORAAirlineRecipientType }
     * 
     */
    public ORAAirlineRecipientType createORAAirlineRecipientType() {
        return new ORAAirlineRecipientType();
    }

    /**
     * Create an instance of {@link POAAirlineRecipientType }
     * 
     */
    public POAAirlineRecipientType createPOAAirlineRecipientType() {
        return new POAAirlineRecipientType();
    }

    /**
     * Create an instance of {@link RetailSupplierRecipientType }
     * 
     */
    public RetailSupplierRecipientType createRetailSupplierRecipientType() {
        return new RetailSupplierRecipientType();
    }

    /**
     * Create an instance of {@link TravelAgencyRecipientType }
     * 
     */
    public TravelAgencyRecipientType createTravelAgencyRecipientType() {
        return new TravelAgencyRecipientType();
    }

    /**
     * Create an instance of {@link AggregatorParticipantType }
     * 
     */
    public AggregatorParticipantType createAggregatorParticipantType() {
        return new AggregatorParticipantType();
    }

    /**
     * Create an instance of {@link EnabledSysParticipantType }
     * 
     */
    public EnabledSysParticipantType createEnabledSysParticipantType() {
        return new EnabledSysParticipantType();
    }

    /**
     * Create an instance of {@link MarketingCarrierParticipantType }
     * 
     */
    public MarketingCarrierParticipantType createMarketingCarrierParticipantType() {
        return new MarketingCarrierParticipantType();
    }

    /**
     * Create an instance of {@link OperatingCarrierParticipantType }
     * 
     */
    public OperatingCarrierParticipantType createOperatingCarrierParticipantType() {
        return new OperatingCarrierParticipantType();
    }

    /**
     * Create an instance of {@link ORAAirlineParticipantType }
     * 
     */
    public ORAAirlineParticipantType createORAAirlineParticipantType() {
        return new ORAAirlineParticipantType();
    }

    /**
     * Create an instance of {@link POAAirlineParticipantType }
     * 
     */
    public POAAirlineParticipantType createPOAAirlineParticipantType() {
        return new POAAirlineParticipantType();
    }

    /**
     * Create an instance of {@link RetailSupplierParticipantType }
     * 
     */
    public RetailSupplierParticipantType createRetailSupplierParticipantType() {
        return new RetailSupplierParticipantType();
    }

    /**
     * Create an instance of {@link TravelAgencyParticipantType }
     * 
     */
    public TravelAgencyParticipantType createTravelAgencyParticipantType() {
        return new TravelAgencyParticipantType();
    }

    /**
     * Create an instance of {@link ProcessingResultType }
     * 
     */
    public ProcessingResultType createProcessingResultType() {
        return new ProcessingResultType();
    }

    /**
     * Create an instance of {@link AlertType }
     * 
     */
    public AlertType createAlertType() {
        return new AlertType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Failed.Code }
     * 
     */
    public org.iata.ndc.schema.Failed.Code createFailedCode() {
        return new org.iata.ndc.schema.Failed.Code();
    }

    /**
     * Create an instance of {@link ACSTxnReference }
     * 
     */
    public ACSTxnReference createACSTxnReference() {
        return new ACSTxnReference();
    }

    /**
     * Create an instance of {@link ReservationInfo }
     * 
     */
    public ReservationInfo createReservationInfo() {
        return new ReservationInfo();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.ResidenceCode }
     * 
     */
    public SecurePaymentPaxInfoType.ResidenceCode createSecurePaymentPaxInfoTypeResidenceCode() {
        return new SecurePaymentPaxInfoType.ResidenceCode();
    }

    /**
     * Create an instance of {@link SPMTxnReference }
     * 
     */
    public SPMTxnReference createSPMTxnReference() {
        return new SPMTxnReference();
    }

    /**
     * Create an instance of {@link MarketMessage }
     * 
     */
    public MarketMessage createMarketMessage() {
        return new MarketMessage();
    }

    /**
     * Create an instance of {@link Warnings.Warning }
     * 
     */
    public Warnings.Warning createWarningsWarning() {
        return new Warnings.Warning();
    }

    /**
     * Create an instance of {@link Notice }
     * 
     */
    public Notice createNotice() {
        return new Notice();
    }

    /**
     * Create an instance of {@link PriceVarianceNotice }
     * 
     */
    public PriceVarianceNotice createPriceVarianceNotice() {
        return new PriceVarianceNotice();
    }

    /**
     * Create an instance of {@link TrxProcessObjectBaseType }
     * 
     */
    public TrxProcessObjectBaseType createTrxProcessObjectBaseType() {
        return new TrxProcessObjectBaseType();
    }

    /**
     * Create an instance of {@link ListOfOfferTermsType }
     * 
     */
    public ListOfOfferTermsType createListOfOfferTermsType() {
        return new ListOfOfferTermsType();
    }

    /**
     * Create an instance of {@link FareCodeType }
     * 
     */
    public FareCodeType createFareCodeType() {
        return new FareCodeType();
    }

    /**
     * Create an instance of {@link FareBasisCodeType }
     * 
     */
    public FareBasisCodeType createFareBasisCodeType() {
        return new FareBasisCodeType();
    }

    /**
     * Create an instance of {@link FareType }
     * 
     */
    public FareType createFareType() {
        return new FareType();
    }

    /**
     * Create an instance of {@link AdvancePurchase }
     * 
     */
    public AdvancePurchase createAdvancePurchase() {
        return new AdvancePurchase();
    }

    /**
     * Create an instance of {@link AdvanceTicketing.AdvanceReservation }
     * 
     */
    public AdvanceTicketing.AdvanceReservation createAdvanceTicketingAdvanceReservation() {
        return new AdvanceTicketing.AdvanceReservation();
    }

    /**
     * Create an instance of {@link AdvanceTicketing.AdvanceDeparture }
     * 
     */
    public AdvanceTicketing.AdvanceDeparture createAdvanceTicketingAdvanceDeparture() {
        return new AdvanceTicketing.AdvanceDeparture();
    }

    /**
     * Create an instance of {@link CorporateFare.CompanyIndex }
     * 
     */
    public CorporateFare.CompanyIndex createCorporateFareCompanyIndex() {
        return new CorporateFare.CompanyIndex();
    }

    /**
     * Create an instance of {@link CorporateFare.Contract }
     * 
     */
    public CorporateFare.Contract createCorporateFareContract() {
        return new CorporateFare.Contract();
    }

    /**
     * Create an instance of {@link CorporateFare.Account }
     * 
     */
    public CorporateFare.Account createCorporateFareAccount() {
        return new CorporateFare.Account();
    }

    /**
     * Create an instance of {@link MinimumStay.DayQuantity }
     * 
     */
    public MinimumStay.DayQuantity createMinimumStayDayQuantity() {
        return new MinimumStay.DayQuantity();
    }

    /**
     * Create an instance of {@link MaximumStay.DayQuantity }
     * 
     */
    public MaximumStay.DayQuantity createMaximumStayDayQuantity() {
        return new MaximumStay.DayQuantity();
    }

    /**
     * Create an instance of {@link FareRulesRemark }
     * 
     */
    public FareRulesRemark createFareRulesRemark() {
        return new FareRulesRemark();
    }

    /**
     * Create an instance of {@link FiledFare }
     * 
     */
    public FiledFare createFiledFare() {
        return new FiledFare();
    }

    /**
     * Create an instance of {@link FileFareType.FareIndicatorCode }
     * 
     */
    public FileFareType.FareIndicatorCode createFileFareTypeFareIndicatorCode() {
        return new FileFareType.FareIndicatorCode();
    }

    /**
     * Create an instance of {@link FareCacheKey }
     * 
     */
    public FareCacheKey createFareCacheKey() {
        return new FareCacheKey();
    }

    /**
     * Create an instance of {@link FareQualifierCodes }
     * 
     */
    public FareQualifierCodes createFareQualifierCodes() {
        return new FareQualifierCodes();
    }

    /**
     * Create an instance of {@link FareReferenceKey }
     * 
     */
    public FareReferenceKey createFareReferenceKey() {
        return new FareReferenceKey();
    }

    /**
     * Create an instance of {@link FlightNumber }
     * 
     */
    public FlightNumber createFlightNumber() {
        return new FlightNumber();
    }

    /**
     * Create an instance of {@link ArrivalCode }
     * 
     */
    public ArrivalCode createArrivalCode() {
        return new ArrivalCode();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Departure }
     * 
     */
    public org.iata.ndc.schema.Departure createDeparture() {
        return new org.iata.ndc.schema.Departure();
    }

    /**
     * Create an instance of {@link FlightDepartureType.AirportCode }
     * 
     */
    public FlightDepartureType.AirportCode createFlightDepartureTypeAirportCode() {
        return new FlightDepartureType.AirportCode();
    }

    /**
     * Create an instance of {@link FlightDepartureType.Terminal }
     * 
     */
    public FlightDepartureType.Terminal createFlightDepartureTypeTerminal() {
        return new FlightDepartureType.Terminal();
    }

    /**
     * Create an instance of {@link DepartureCode }
     * 
     */
    public DepartureCode createDepartureCode() {
        return new DepartureCode();
    }

    /**
     * Create an instance of {@link FlightDistanceType }
     * 
     */
    public FlightDistanceType createFlightDistanceType() {
        return new FlightDistanceType();
    }

    /**
     * Create an instance of {@link FlightDurationType }
     * 
     */
    public FlightDurationType createFlightDurationType() {
        return new FlightDurationType();
    }

    /**
     * Create an instance of {@link FlightStatusType }
     * 
     */
    public FlightStatusType createFlightStatusType() {
        return new FlightStatusType();
    }

    /**
     * Create an instance of {@link FlightMealsType }
     * 
     */
    public FlightMealsType createFlightMealsType() {
        return new FlightMealsType();
    }

    /**
     * Create an instance of {@link FlightFrequencyType }
     * 
     */
    public FlightFrequencyType createFlightFrequencyType() {
        return new FlightFrequencyType();
    }

    /**
     * Create an instance of {@link OnTimePerformance }
     * 
     */
    public OnTimePerformance createOnTimePerformance() {
        return new OnTimePerformance();
    }

    /**
     * Create an instance of {@link FlightMileageType }
     * 
     */
    public FlightMileageType createFlightMileageType() {
        return new FlightMileageType();
    }

    /**
     * Create an instance of {@link ResDateTime.Date }
     * 
     */
    public ResDateTime.Date createResDateTimeDate() {
        return new ResDateTime.Date();
    }

    /**
     * Create an instance of {@link AircraftCode }
     * 
     */
    public AircraftCode createAircraftCode() {
        return new AircraftCode();
    }

    /**
     * Create an instance of {@link AircraftCodeType }
     * 
     */
    public AircraftCodeType createAircraftCodeType() {
        return new AircraftCodeType();
    }

    /**
     * Create an instance of {@link AircraftCoreType }
     * 
     */
    public AircraftCoreType createAircraftCoreType() {
        return new AircraftCoreType();
    }

    /**
     * Create an instance of {@link AircraftSummaryType }
     * 
     */
    public AircraftSummaryType createAircraftSummaryType() {
        return new AircraftSummaryType();
    }

    /**
     * Create an instance of {@link AircraftCodeQueryType }
     * 
     */
    public AircraftCodeQueryType createAircraftCodeQueryType() {
        return new AircraftCodeQueryType();
    }

    /**
     * Create an instance of {@link AircraftCabinType }
     * 
     */
    public AircraftCabinType createAircraftCabinType() {
        return new AircraftCabinType();
    }

    /**
     * Create an instance of {@link CabinType }
     * 
     */
    public CabinType createCabinType() {
        return new CabinType();
    }

    /**
     * Create an instance of {@link OriginDestinationType }
     * 
     */
    public OriginDestinationType createOriginDestinationType() {
        return new OriginDestinationType();
    }

    /**
     * Create an instance of {@link FlightReferences }
     * 
     */
    public FlightReferences createFlightReferences() {
        return new FlightReferences();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.OriginDestination.CheckedBag }
     * 
     */
    public org.iata.ndc.schema.OriginDestination.CheckedBag createOriginDestinationCheckedBag() {
        return new org.iata.ndc.schema.OriginDestination.CheckedBag();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.OriginDestination.CarryOnBag }
     * 
     */
    public org.iata.ndc.schema.OriginDestination.CarryOnBag createOriginDestinationCarryOnBag() {
        return new org.iata.ndc.schema.OriginDestination.CarryOnBag();
    }

    /**
     * Create an instance of {@link ItemIDType }
     * 
     */
    public ItemIDType createItemIDType() {
        return new ItemIDType();
    }

    /**
     * Create an instance of {@link BagDetailAssociation }
     * 
     */
    public BagDetailAssociation createBagDetailAssociation() {
        return new BagDetailAssociation();
    }

    /**
     * Create an instance of {@link FlightSegmentReference }
     * 
     */
    public FlightSegmentReference createFlightSegmentReference() {
        return new FlightSegmentReference();
    }

    /**
     * Create an instance of {@link SimpleAircraftCabinType }
     * 
     */
    public SimpleAircraftCabinType createSimpleAircraftCabinType() {
        return new SimpleAircraftCabinType();
    }

    /**
     * Create an instance of {@link SegmentReference }
     * 
     */
    public SegmentReference createSegmentReference() {
        return new SegmentReference();
    }

    /**
     * Create an instance of {@link SegmentReferences }
     * 
     */
    public SegmentReferences createSegmentReferences() {
        return new SegmentReferences();
    }

    /**
     * Create an instance of {@link AircraftMetadataType }
     * 
     */
    public AircraftMetadataType createAircraftMetadataType() {
        return new AircraftMetadataType();
    }

    /**
     * Create an instance of {@link CityMetadataType }
     * 
     */
    public CityMetadataType createCityMetadataType() {
        return new CityMetadataType();
    }

    /**
     * Create an instance of {@link ContactMetadataType }
     * 
     */
    public ContactMetadataType createContactMetadataType() {
        return new ContactMetadataType();
    }

    /**
     * Create an instance of {@link ContentMetadataType }
     * 
     */
    public ContentMetadataType createContentMetadataType() {
        return new ContentMetadataType();
    }

    /**
     * Create an instance of {@link CountryMetadataType }
     * 
     */
    public CountryMetadataType createCountryMetadataType() {
        return new CountryMetadataType();
    }

    /**
     * Create an instance of {@link CurrencyMetadata }
     * 
     */
    public CurrencyMetadata createCurrencyMetadata() {
        return new CurrencyMetadata();
    }

    /**
     * Create an instance of {@link CurrencyMetadataType }
     * 
     */
    public CurrencyMetadataType createCurrencyMetadataType() {
        return new CurrencyMetadataType();
    }

    /**
     * Create an instance of {@link MetadataObjectBaseType }
     * 
     */
    public MetadataObjectBaseType createMetadataObjectBaseType() {
        return new MetadataObjectBaseType();
    }

    /**
     * Create an instance of {@link DescriptionMetadataType }
     * 
     */
    public DescriptionMetadataType createDescriptionMetadataType() {
        return new DescriptionMetadataType();
    }

    /**
     * Create an instance of {@link LanguageMetadataType }
     * 
     */
    public LanguageMetadataType createLanguageMetadataType() {
        return new LanguageMetadataType();
    }

    /**
     * Create an instance of {@link MediaMetadatas }
     * 
     */
    public MediaMetadatas createMediaMetadatas() {
        return new MediaMetadatas();
    }

    /**
     * Create an instance of {@link PaymentFormMetadataType }
     * 
     */
    public PaymentFormMetadataType createPaymentFormMetadataType() {
        return new PaymentFormMetadataType();
    }

    /**
     * Create an instance of {@link PriceMetadataType }
     * 
     */
    public PriceMetadataType createPriceMetadataType() {
        return new PriceMetadataType();
    }

    /**
     * Create an instance of {@link StateProvMetadataType }
     * 
     */
    public StateProvMetadataType createStateProvMetadataType() {
        return new StateProvMetadataType();
    }

    /**
     * Create an instance of {@link ZoneMetadataType }
     * 
     */
    public ZoneMetadataType createZoneMetadataType() {
        return new ZoneMetadataType();
    }

    /**
     * Create an instance of {@link CheckedBagMetadatas }
     * 
     */
    public CheckedBagMetadatas createCheckedBagMetadatas() {
        return new CheckedBagMetadatas();
    }

    /**
     * Create an instance of {@link BaggageCheckedMetadataType }
     * 
     */
    public BaggageCheckedMetadataType createBaggageCheckedMetadataType() {
        return new BaggageCheckedMetadataType();
    }

    /**
     * Create an instance of {@link CarryOnBagMetadatas }
     * 
     */
    public CarryOnBagMetadatas createCarryOnBagMetadatas() {
        return new CarryOnBagMetadatas();
    }

    /**
     * Create an instance of {@link BaggageCarryOnMetadataType }
     * 
     */
    public BaggageCarryOnMetadataType createBaggageCarryOnMetadataType() {
        return new BaggageCarryOnMetadataType();
    }

    /**
     * Create an instance of {@link BaggageDisclosureMetadatas }
     * 
     */
    public BaggageDisclosureMetadatas createBaggageDisclosureMetadatas() {
        return new BaggageDisclosureMetadatas();
    }

    /**
     * Create an instance of {@link BaggageDisclosureMetadataType }
     * 
     */
    public BaggageDisclosureMetadataType createBaggageDisclosureMetadataType() {
        return new BaggageDisclosureMetadataType();
    }

    /**
     * Create an instance of {@link BaggageQueryMetadataType }
     * 
     */
    public BaggageQueryMetadataType createBaggageQueryMetadataType() {
        return new BaggageQueryMetadataType();
    }

    /**
     * Create an instance of {@link FlightMetadatas }
     * 
     */
    public FlightMetadatas createFlightMetadatas() {
        return new FlightMetadatas();
    }

    /**
     * Create an instance of {@link FlightMetadata }
     * 
     */
    public FlightMetadata createFlightMetadata() {
        return new FlightMetadata();
    }

    /**
     * Create an instance of {@link ItineraryMetadataType }
     * 
     */
    public ItineraryMetadataType createItineraryMetadataType() {
        return new ItineraryMetadataType();
    }

    /**
     * Create an instance of {@link DirectionMetadatas }
     * 
     */
    public DirectionMetadatas createDirectionMetadatas() {
        return new DirectionMetadatas();
    }

    /**
     * Create an instance of {@link DirectionsMetadataType }
     * 
     */
    public DirectionsMetadataType createDirectionsMetadataType() {
        return new DirectionsMetadataType();
    }

    /**
     * Create an instance of {@link DisclosureMetadatas }
     * 
     */
    public DisclosureMetadatas createDisclosureMetadatas() {
        return new DisclosureMetadatas();
    }

    /**
     * Create an instance of {@link DisclosureMetadataType }
     * 
     */
    public DisclosureMetadataType createDisclosureMetadataType() {
        return new DisclosureMetadataType();
    }

    /**
     * Create an instance of {@link OfferMetadatas }
     * 
     */
    public OfferMetadatas createOfferMetadatas() {
        return new OfferMetadatas();
    }

    /**
     * Create an instance of {@link OfferInstructionMetadatas }
     * 
     */
    public OfferInstructionMetadatas createOfferInstructionMetadatas() {
        return new OfferInstructionMetadatas();
    }

    /**
     * Create an instance of {@link OfferInstructionMetadataType }
     * 
     */
    public OfferInstructionMetadataType createOfferInstructionMetadataType() {
        return new OfferInstructionMetadataType();
    }

    /**
     * Create an instance of {@link OfferPenaltyMetadatas }
     * 
     */
    public OfferPenaltyMetadatas createOfferPenaltyMetadatas() {
        return new OfferPenaltyMetadatas();
    }

    /**
     * Create an instance of {@link PenaltyMetadataType }
     * 
     */
    public PenaltyMetadataType createPenaltyMetadataType() {
        return new PenaltyMetadataType();
    }

    /**
     * Create an instance of {@link OfferTermsMetadatas }
     * 
     */
    public OfferTermsMetadatas createOfferTermsMetadatas() {
        return new OfferTermsMetadatas();
    }

    /**
     * Create an instance of {@link OfferTermsMetadataType }
     * 
     */
    public OfferTermsMetadataType createOfferTermsMetadataType() {
        return new OfferTermsMetadataType();
    }

    /**
     * Create an instance of {@link DiscountMetadatas }
     * 
     */
    public DiscountMetadatas createDiscountMetadatas() {
        return new DiscountMetadatas();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Qualifier }
     * 
     */
    public org.iata.ndc.schema.Qualifier createQualifier() {
        return new org.iata.ndc.schema.Qualifier();
    }

    /**
     * Create an instance of {@link BaggagePricingQualifierType }
     * 
     */
    public BaggagePricingQualifierType createBaggagePricingQualifierType() {
        return new BaggagePricingQualifierType();
    }

    /**
     * Create an instance of {@link ExistingOrderQualifier }
     * 
     */
    public ExistingOrderQualifier createExistingOrderQualifier() {
        return new ExistingOrderQualifier();
    }

    /**
     * Create an instance of {@link OrderQualiferType }
     * 
     */
    public OrderQualiferType createOrderQualiferType() {
        return new OrderQualiferType();
    }

    /**
     * Create an instance of {@link CardQualifierType }
     * 
     */
    public CardQualifierType createCardQualifierType() {
        return new CardQualifierType();
    }

    /**
     * Create an instance of {@link ProgramQualifiers }
     * 
     */
    public ProgramQualifiers createProgramQualifiers() {
        return new ProgramQualifiers();
    }

    /**
     * Create an instance of {@link ProgramQualifierType }
     * 
     */
    public ProgramQualifierType createProgramQualifierType() {
        return new ProgramQualifierType();
    }

    /**
     * Create an instance of {@link PromotionQualifiers }
     * 
     */
    public PromotionQualifiers createPromotionQualifiers() {
        return new PromotionQualifiers();
    }

    /**
     * Create an instance of {@link PromoQualifierType }
     * 
     */
    public PromoQualifierType createPromoQualifierType() {
        return new PromoQualifierType();
    }

    /**
     * Create an instance of {@link PromotionType.Code }
     * 
     */
    public PromotionType.Code createPromotionTypeCode() {
        return new PromotionType.Code();
    }

    /**
     * Create an instance of {@link PromotionType.Issuer }
     * 
     */
    public PromotionType.Issuer createPromotionTypeIssuer() {
        return new PromotionType.Issuer();
    }

    /**
     * Create an instance of {@link Assignment }
     * 
     */
    public Assignment createAssignment() {
        return new Assignment();
    }

    /**
     * Create an instance of {@link SocialQualiferType }
     * 
     */
    public SocialQualiferType createSocialQualiferType() {
        return new SocialQualiferType();
    }

    /**
     * Create an instance of {@link SpecialQualiferType }
     * 
     */
    public SpecialQualiferType createSpecialQualiferType() {
        return new SpecialQualiferType();
    }

    /**
     * Create an instance of {@link SeatMetadatas }
     * 
     */
    public SeatMetadatas createSeatMetadatas() {
        return new SeatMetadatas();
    }

    /**
     * Create an instance of {@link SeatMetadataType }
     * 
     */
    public SeatMetadataType createSeatMetadataType() {
        return new SeatMetadataType();
    }

    /**
     * Create an instance of {@link SeatMapMetadatas }
     * 
     */
    public SeatMapMetadatas createSeatMapMetadatas() {
        return new SeatMapMetadatas();
    }

    /**
     * Create an instance of {@link SeatMapMetadataType }
     * 
     */
    public SeatMapMetadataType createSeatMapMetadataType() {
        return new SeatMapMetadataType();
    }

    /**
     * Create an instance of {@link ShopMetadataGroup }
     * 
     */
    public ShopMetadataGroup createShopMetadataGroup() {
        return new ShopMetadataGroup();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Traveler }
     * 
     */
    public org.iata.ndc.schema.Traveler createTraveler() {
        return new org.iata.ndc.schema.Traveler();
    }

    /**
     * Create an instance of {@link PenaltyMetadatas }
     * 
     */
    public PenaltyMetadatas createPenaltyMetadatas() {
        return new PenaltyMetadatas();
    }

    /**
     * Create an instance of {@link ApplicableFlight }
     * 
     */
    public ApplicableFlight createApplicableFlight() {
        return new ApplicableFlight();
    }

    /**
     * Create an instance of {@link FlightInfoAssocType }
     * 
     */
    public FlightInfoAssocType createFlightInfoAssocType() {
        return new FlightInfoAssocType();
    }

    /**
     * Create an instance of {@link ServiceInfoAssocType }
     * 
     */
    public ServiceInfoAssocType createServiceInfoAssocType() {
        return new ServiceInfoAssocType();
    }

    /**
     * Create an instance of {@link TravelerInfoAssocType }
     * 
     */
    public TravelerInfoAssocType createTravelerInfoAssocType() {
        return new TravelerInfoAssocType();
    }

    /**
     * Create an instance of {@link OfferDetailInfoAssocType }
     * 
     */
    public OfferDetailInfoAssocType createOfferDetailInfoAssocType() {
        return new OfferDetailInfoAssocType();
    }

    /**
     * Create an instance of {@link OfferAssociations }
     * 
     */
    public OfferAssociations createOfferAssociations() {
        return new OfferAssociations();
    }

    /**
     * Create an instance of {@link ShopperInfoAssocType }
     * 
     */
    public ShopperInfoAssocType createShopperInfoAssocType() {
        return new ShopperInfoAssocType();
    }

    /**
     * Create an instance of {@link OfferAssociationsType.PriceClass }
     * 
     */
    public OfferAssociationsType.PriceClass createOfferAssociationsTypePriceClass() {
        return new OfferAssociationsType.PriceClass();
    }

    /**
     * Create an instance of {@link BagDetailAssocType }
     * 
     */
    public BagDetailAssocType createBagDetailAssocType() {
        return new BagDetailAssocType();
    }

    /**
     * Create an instance of {@link FarePriceDetailType }
     * 
     */
    public FarePriceDetailType createFarePriceDetailType() {
        return new FarePriceDetailType();
    }

    /**
     * Create an instance of {@link PricedOffer }
     * 
     */
    public PricedOffer createPricedOffer() {
        return new PricedOffer();
    }

    /**
     * Create an instance of {@link KeyWithMetaOfferBaseType }
     * 
     */
    public KeyWithMetaOfferBaseType createKeyWithMetaOfferBaseType() {
        return new KeyWithMetaOfferBaseType();
    }

    /**
     * Create an instance of {@link PricedFlightOfferType.OfferPrice }
     * 
     */
    public PricedFlightOfferType.OfferPrice createPricedFlightOfferTypeOfferPrice() {
        return new PricedFlightOfferType.OfferPrice();
    }

    /**
     * Create an instance of {@link SeatCharacteristics }
     * 
     */
    public SeatCharacteristics createSeatCharacteristics() {
        return new SeatCharacteristics();
    }

    /**
     * Create an instance of {@link SeatCharacteristicType }
     * 
     */
    public SeatCharacteristicType createSeatCharacteristicType() {
        return new SeatCharacteristicType();
    }

    /**
     * Create an instance of {@link OfferInstructionType }
     * 
     */
    public OfferInstructionType createOfferInstructionType() {
        return new OfferInstructionType();
    }

    /**
     * Create an instance of {@link OfferClassUpgradeType }
     * 
     */
    public OfferClassUpgradeType createOfferClassUpgradeType() {
        return new OfferClassUpgradeType();
    }

    /**
     * Create an instance of {@link FreeFormInstructionsType }
     * 
     */
    public FreeFormInstructionsType createFreeFormInstructionsType() {
        return new FreeFormInstructionsType();
    }

    /**
     * Create an instance of {@link LeadPrice.TotalAmount }
     * 
     */
    public LeadPrice.TotalAmount createLeadPriceTotalAmount() {
        return new LeadPrice.TotalAmount();
    }

    /**
     * Create an instance of {@link PTCQuantity }
     * 
     */
    public PTCQuantity createPTCQuantity() {
        return new PTCQuantity();
    }

    /**
     * Create an instance of {@link PTCQuantityType }
     * 
     */
    public PTCQuantityType createPTCQuantityType() {
        return new PTCQuantityType();
    }

    /**
     * Create an instance of {@link PTCQuantityPricedType }
     * 
     */
    public PTCQuantityPricedType createPTCQuantityPricedType() {
        return new PTCQuantityPricedType();
    }

    /**
     * Create an instance of {@link OfferPenaltyType }
     * 
     */
    public OfferPenaltyType createOfferPenaltyType() {
        return new OfferPenaltyType();
    }

    /**
     * Create an instance of {@link OfferStatusType }
     * 
     */
    public OfferStatusType createOfferStatusType() {
        return new OfferStatusType();
    }

    /**
     * Create an instance of {@link PriceGuaranteeTimeLimit }
     * 
     */
    public PriceGuaranteeTimeLimit createPriceGuaranteeTimeLimit() {
        return new PriceGuaranteeTimeLimit();
    }

    /**
     * Create an instance of {@link PriceGuarTimeLimitType }
     * 
     */
    public PriceGuarTimeLimitType createPriceGuarTimeLimitType() {
        return new PriceGuarTimeLimitType();
    }

    /**
     * Create an instance of {@link KeyWithMetaObjectBaseType }
     * 
     */
    public KeyWithMetaObjectBaseType createKeyWithMetaObjectBaseType() {
        return new KeyWithMetaObjectBaseType();
    }

    /**
     * Create an instance of {@link OrderItemDetails.OrderItemDetail }
     * 
     */
    public OrderItemDetails.OrderItemDetail createOrderItemDetailsOrderItemDetail() {
        return new OrderItemDetails.OrderItemDetail();
    }

    /**
     * Create an instance of {@link OrderInstructions }
     * 
     */
    public OrderInstructions createOrderInstructions() {
        return new OrderInstructions();
    }

    /**
     * Create an instance of {@link OrderInstructionType }
     * 
     */
    public OrderInstructionType createOrderInstructionType() {
        return new OrderInstructionType();
    }

    /**
     * Create an instance of {@link SpecialBookingInstrType }
     * 
     */
    public SpecialBookingInstrType createSpecialBookingInstrType() {
        return new SpecialBookingInstrType();
    }

    /**
     * Create an instance of {@link OrderCommissionType }
     * 
     */
    public OrderCommissionType createOrderCommissionType() {
        return new OrderCommissionType();
    }

    /**
     * Create an instance of {@link OrderIDType }
     * 
     */
    public OrderIDType createOrderIDType() {
        return new OrderIDType();
    }

    /**
     * Create an instance of {@link OfferItemType }
     * 
     */
    public OfferItemType createOfferItemType() {
        return new OfferItemType();
    }

    /**
     * Create an instance of {@link SeatItem }
     * 
     */
    public SeatItem createSeatItem() {
        return new SeatItem();
    }

    /**
     * Create an instance of {@link SeatItemType.Price }
     * 
     */
    public SeatItemType.Price createSeatItemTypePrice() {
        return new SeatItemType.Price();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.TimeLimits.PaymentTimeLimit }
     * 
     */
    public org.iata.ndc.schema.TimeLimits.PaymentTimeLimit createTimeLimitsPaymentTimeLimit() {
        return new org.iata.ndc.schema.TimeLimits.PaymentTimeLimit();
    }

    /**
     * Create an instance of {@link MiscChargeMethodType }
     * 
     */
    public MiscChargeMethodType createMiscChargeMethodType() {
        return new MiscChargeMethodType();
    }

    /**
     * Create an instance of {@link OtherMethodType }
     * 
     */
    public OtherMethodType createOtherMethodType() {
        return new OtherMethodType();
    }

    /**
     * Create an instance of {@link AltBaggageOfferType }
     * 
     */
    public AltBaggageOfferType createAltBaggageOfferType() {
        return new AltBaggageOfferType();
    }

    /**
     * Create an instance of {@link AltPricedFlightOfferType }
     * 
     */
    public AltPricedFlightOfferType createAltPricedFlightOfferType() {
        return new AltPricedFlightOfferType();
    }

    /**
     * Create an instance of {@link AltOtherOfferType }
     * 
     */
    public AltOtherOfferType createAltOtherOfferType() {
        return new AltOtherOfferType();
    }

    /**
     * Create an instance of {@link AltSeatOfferType }
     * 
     */
    public AltSeatOfferType createAltSeatOfferType() {
        return new AltSeatOfferType();
    }

    /**
     * Create an instance of {@link OrderPenaltyType }
     * 
     */
    public OrderPenaltyType createOrderPenaltyType() {
        return new OrderPenaltyType();
    }

    /**
     * Create an instance of {@link OrderTimeLimits }
     * 
     */
    public OrderTimeLimits createOrderTimeLimits() {
        return new OrderTimeLimits();
    }

    /**
     * Create an instance of {@link OrderTimeLimitsType }
     * 
     */
    public OrderTimeLimitsType createOrderTimeLimitsType() {
        return new OrderTimeLimitsType();
    }

    /**
     * Create an instance of {@link OrderItemTimeLimits }
     * 
     */
    public OrderItemTimeLimits createOrderItemTimeLimits() {
        return new OrderItemTimeLimits();
    }

    /**
     * Create an instance of {@link OrderItemTimeLimitsType }
     * 
     */
    public OrderItemTimeLimitsType createOrderItemTimeLimitsType() {
        return new OrderItemTimeLimitsType();
    }

    /**
     * Create an instance of {@link AdditionalReferenceType }
     * 
     */
    public AdditionalReferenceType createAdditionalReferenceType() {
        return new AdditionalReferenceType();
    }

    /**
     * Create an instance of {@link AgentID }
     * 
     */
    public AgentID createAgentID() {
        return new AgentID();
    }

    /**
     * Create an instance of {@link CouponAgentType.ID }
     * 
     */
    public CouponAgentType.ID createCouponAgentTypeID() {
        return new CouponAgentType.ID();
    }

    /**
     * Create an instance of {@link InConnectionWithType }
     * 
     */
    public InConnectionWithType createInConnectionWithType() {
        return new InConnectionWithType();
    }

    /**
     * Create an instance of {@link IssuingAirlineInfo }
     * 
     */
    public IssuingAirlineInfo createIssuingAirlineInfo() {
        return new IssuingAirlineInfo();
    }

    /**
     * Create an instance of {@link AirlineIssuanceType }
     * 
     */
    public AirlineIssuanceType createAirlineIssuanceType() {
        return new AirlineIssuanceType();
    }

    /**
     * Create an instance of {@link OriginalIssueInfo }
     * 
     */
    public OriginalIssueInfo createOriginalIssueInfo() {
        return new OriginalIssueInfo();
    }

    /**
     * Create an instance of {@link OriginalIssueType }
     * 
     */
    public OriginalIssueType createOriginalIssueType() {
        return new OriginalIssueType();
    }

    /**
     * Create an instance of {@link PricingInfo }
     * 
     */
    public PricingInfo createPricingInfo() {
        return new PricingInfo();
    }

    /**
     * Create an instance of {@link PricingInfoType }
     * 
     */
    public PricingInfoType createPricingInfoType() {
        return new PricingInfoType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.TicketDocument }
     * 
     */
    public org.iata.ndc.schema.TicketDocument createTicketDocument() {
        return new org.iata.ndc.schema.TicketDocument();
    }

    /**
     * Create an instance of {@link CouponTicketDocType }
     * 
     */
    public CouponTicketDocType createCouponTicketDocType() {
        return new CouponTicketDocType();
    }

    /**
     * Create an instance of {@link TravelerInfo }
     * 
     */
    public TravelerInfo createTravelerInfo() {
        return new TravelerInfo();
    }

    /**
     * Create an instance of {@link CouponTravelerDetailType }
     * 
     */
    public CouponTravelerDetailType createCouponTravelerDetailType() {
        return new CouponTravelerDetailType();
    }

    /**
     * Create an instance of {@link CouponTravelerCoreType.Surname }
     * 
     */
    public CouponTravelerCoreType.Surname createCouponTravelerCoreTypeSurname() {
        return new CouponTravelerCoreType.Surname();
    }

    /**
     * Create an instance of {@link CouponTravelerCoreType.Given }
     * 
     */
    public CouponTravelerCoreType.Given createCouponTravelerCoreTypeGiven() {
        return new CouponTravelerCoreType.Given();
    }

    /**
     * Create an instance of {@link UnstructuredFareCalcType }
     * 
     */
    public UnstructuredFareCalcType createUnstructuredFareCalcType() {
        return new UnstructuredFareCalcType();
    }

    /**
     * Create an instance of {@link AcceptedPaymentFormType }
     * 
     */
    public AcceptedPaymentFormType createAcceptedPaymentFormType() {
        return new AcceptedPaymentFormType();
    }

    /**
     * Create an instance of {@link SeatDisplay.Columns }
     * 
     */
    public SeatDisplay.Columns createSeatDisplayColumns() {
        return new SeatDisplay.Columns();
    }

    /**
     * Create an instance of {@link SeatDisplay.Rows }
     * 
     */
    public SeatDisplay.Rows createSeatDisplayRows() {
        return new SeatDisplay.Rows();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link SecurityType.PseudoCityCode }
     * 
     */
    public SecurityType.PseudoCityCode createSecurityTypePseudoCityCode() {
        return new SecurityType.PseudoCityCode();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.BundleID }
     * 
     */
    public org.iata.ndc.schema.BundleID createBundleID() {
        return new org.iata.ndc.schema.BundleID();
    }

    /**
     * Create an instance of {@link RFICType }
     * 
     */
    public RFICType createRFICType() {
        return new RFICType();
    }

    /**
     * Create an instance of {@link SrvcLocationAirportType }
     * 
     */
    public SrvcLocationAirportType createSrvcLocationAirportType() {
        return new SrvcLocationAirportType();
    }

    /**
     * Create an instance of {@link SrvcLocationAddressType }
     * 
     */
    public SrvcLocationAddressType createSrvcLocationAddressType() {
        return new SrvcLocationAddressType();
    }

    /**
     * Create an instance of {@link ServiceCombinations }
     * 
     */
    public ServiceCombinations createServiceCombinations() {
        return new ServiceCombinations();
    }

    /**
     * Create an instance of {@link ServiceCombinationType.Combination }
     * 
     */
    public ServiceCombinationType.Combination createServiceCombinationTypeCombination() {
        return new ServiceCombinationType.Combination();
    }

    /**
     * Create an instance of {@link ServiceItemQuantityType }
     * 
     */
    public ServiceItemQuantityType createServiceItemQuantityType() {
        return new ServiceItemQuantityType();
    }

    /**
     * Create an instance of {@link InstrCommissionType }
     * 
     */
    public InstrCommissionType createInstrCommissionType() {
        return new InstrCommissionType();
    }

    /**
     * Create an instance of {@link InstrRemarkType }
     * 
     */
    public InstrRemarkType createInstrRemarkType() {
        return new InstrRemarkType();
    }

    /**
     * Create an instance of {@link InstrSpecialBookingType }
     * 
     */
    public InstrSpecialBookingType createInstrSpecialBookingType() {
        return new InstrSpecialBookingType();
    }

    /**
     * Create an instance of {@link ServiceIDType }
     * 
     */
    public ServiceIDType createServiceIDType() {
        return new ServiceIDType();
    }

    /**
     * Create an instance of {@link AffinityCountryDepartType }
     * 
     */
    public AffinityCountryDepartType createAffinityCountryDepartType() {
        return new AffinityCountryDepartType();
    }

    /**
     * Create an instance of {@link AffinityCountryArriveType }
     * 
     */
    public AffinityCountryArriveType createAffinityCountryArriveType() {
        return new AffinityCountryArriveType();
    }

    /**
     * Create an instance of {@link AffinityReferencePointDepartType }
     * 
     */
    public AffinityReferencePointDepartType createAffinityReferencePointDepartType() {
        return new AffinityReferencePointDepartType();
    }

    /**
     * Create an instance of {@link AffinityReferencePointArriveType }
     * 
     */
    public AffinityReferencePointArriveType createAffinityReferencePointArriveType() {
        return new AffinityReferencePointArriveType();
    }

    /**
     * Create an instance of {@link AffinityStateProvDepartType }
     * 
     */
    public AffinityStateProvDepartType createAffinityStateProvDepartType() {
        return new AffinityStateProvDepartType();
    }

    /**
     * Create an instance of {@link AffinityStateProvArriveType }
     * 
     */
    public AffinityStateProvArriveType createAffinityStateProvArriveType() {
        return new AffinityStateProvArriveType();
    }

    /**
     * Create an instance of {@link LeadDatePeriodType }
     * 
     */
    public LeadDatePeriodType createLeadDatePeriodType() {
        return new LeadDatePeriodType();
    }

    /**
     * Create an instance of {@link LeadTimePeriodType }
     * 
     */
    public LeadTimePeriodType createLeadTimePeriodType() {
        return new LeadTimePeriodType();
    }

    /**
     * Create an instance of {@link TravelersTraveler }
     * 
     */
    public TravelersTraveler createTravelersTraveler() {
        return new TravelersTraveler();
    }

    /**
     * Create an instance of {@link IncentiveProgramQualifier }
     * 
     */
    public IncentiveProgramQualifier createIncentiveProgramQualifier() {
        return new IncentiveProgramQualifier();
    }

    /**
     * Create an instance of {@link IncentiveProgramType.AccountID }
     * 
     */
    public IncentiveProgramType.AccountID createIncentiveProgramTypeAccountID() {
        return new IncentiveProgramType.AccountID();
    }

    /**
     * Create an instance of {@link IncentiveProgramType.MemberStatus }
     * 
     */
    public IncentiveProgramType.MemberStatus createIncentiveProgramTypeMemberStatus() {
        return new IncentiveProgramType.MemberStatus();
    }

    /**
     * Create an instance of {@link ProgramStatusQualifier }
     * 
     */
    public ProgramStatusQualifier createProgramStatusQualifier() {
        return new ProgramStatusQualifier();
    }

    /**
     * Create an instance of {@link StayPeriodDateRangeType }
     * 
     */
    public StayPeriodDateRangeType createStayPeriodDateRangeType() {
        return new StayPeriodDateRangeType();
    }

    /**
     * Create an instance of {@link StayPeriodSeasonType }
     * 
     */
    public StayPeriodSeasonType createStayPeriodSeasonType() {
        return new StayPeriodSeasonType();
    }

    /**
     * Create an instance of {@link SeatAssociation }
     * 
     */
    public SeatAssociation createSeatAssociation() {
        return new SeatAssociation();
    }

    /**
     * Create an instance of {@link CabinPreferencesType }
     * 
     */
    public CabinPreferencesType createCabinPreferencesType() {
        return new CabinPreferencesType();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Preference }
     * 
     */
    public org.iata.ndc.schema.Preference createPreference() {
        return new org.iata.ndc.schema.Preference();
    }

    /**
     * Create an instance of {@link BestPricingPreferencesType }
     * 
     */
    public BestPricingPreferencesType createBestPricingPreferencesType() {
        return new BestPricingPreferencesType();
    }

    /**
     * Create an instance of {@link ServicePricingOnlyPreference }
     * 
     */
    public ServicePricingOnlyPreference createServicePricingOnlyPreference() {
        return new ServicePricingOnlyPreference();
    }

    /**
     * Create an instance of {@link TravelTimePreferencesType }
     * 
     */
    public TravelTimePreferencesType createTravelTimePreferencesType() {
        return new TravelTimePreferencesType();
    }

    /**
     * Create an instance of {@link TravelDistancePreferencesType }
     * 
     */
    public TravelDistancePreferencesType createTravelDistancePreferencesType() {
        return new TravelDistancePreferencesType();
    }

    /**
     * Create an instance of {@link GeoSpecCode }
     * 
     */
    public GeoSpecCode createGeoSpecCode() {
        return new GeoSpecCode();
    }

    /**
     * Create an instance of {@link ImageID }
     * 
     */
    public ImageID createImageID() {
        return new ImageID();
    }

    /**
     * Create an instance of {@link AirShoppingRQ.CoreQuery }
     * 
     */
    public AirShoppingRQ.CoreQuery createAirShoppingRQCoreQuery() {
        return new AirShoppingRQ.CoreQuery();
    }

    /**
     * Create an instance of {@link AirShoppingRQ.Qualifier }
     * 
     */
    public AirShoppingRQ.Qualifier createAirShoppingRQQualifier() {
        return new AirShoppingRQ.Qualifier();
    }

    /**
     * Create an instance of {@link AirShoppingRQ.Preference }
     * 
     */
    public AirShoppingRQ.Preference createAirShoppingRQPreference() {
        return new AirShoppingRQ.Preference();
    }

    /**
     * Create an instance of {@link AirShoppingRQ.Metadata }
     * 
     */
    public AirShoppingRQ.Metadata createAirShoppingRQMetadata() {
        return new AirShoppingRQ.Metadata();
    }

    /**
     * Create an instance of {@link SuccessType }
     * 
     */
    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    /**
     * Create an instance of {@link OrdViewProcessType }
     * 
     */
    public OrdViewProcessType createOrdViewProcessType() {
        return new OrdViewProcessType();
    }

    /**
     * Create an instance of {@link AirShoppingRS.DataLists }
     * 
     */
    public AirShoppingRS.DataLists createAirShoppingRSDataLists() {
        return new AirShoppingRS.DataLists();
    }

    /**
     * Create an instance of {@link FlightPriceRQ.DataLists }
     * 
     */
    public FlightPriceRQ.DataLists createFlightPriceRQDataLists() {
        return new FlightPriceRQ.DataLists();
    }

    /**
     * Create an instance of {@link FlightPriceRQ.Metadata }
     * 
     */
    public FlightPriceRQ.Metadata createFlightPriceRQMetadata() {
        return new FlightPriceRQ.Metadata();
    }

    /**
     * Create an instance of {@link FlightPriceRS.Metadata }
     * 
     */
    public FlightPriceRS.Metadata createFlightPriceRSMetadata() {
        return new FlightPriceRS.Metadata();
    }

    /**
     * Create an instance of {@link PricedFlightOffer.Parameters }
     * 
     */
    public PricedFlightOffer.Parameters createPricedFlightOfferParameters() {
        return new PricedFlightOffer.Parameters();
    }

    /**
     * Create an instance of {@link ItinReshopProcessType }
     * 
     */
    public ItinReshopProcessType createItinReshopProcessType() {
        return new ItinReshopProcessType();
    }

    /**
     * Create an instance of {@link OrderCancelRQ.Query }
     * 
     */
    public OrderCancelRQ.Query createOrderCancelRQQuery() {
        return new OrderCancelRQ.Query();
    }

    /**
     * Create an instance of {@link OrdCancelParamsType }
     * 
     */
    public OrdCancelParamsType createOrdCancelParamsType() {
        return new OrdCancelParamsType();
    }

    /**
     * Create an instance of {@link OrdCancelProcessType }
     * 
     */
    public OrdCancelProcessType createOrdCancelProcessType() {
        return new OrdCancelProcessType();
    }

    /**
     * Create an instance of {@link OrderChangeParameters }
     * 
     */
    public OrderChangeParameters createOrderChangeParameters() {
        return new OrderChangeParameters();
    }

    /**
     * Create an instance of {@link OrdChangeParamsType }
     * 
     */
    public OrdChangeParamsType createOrdChangeParamsType() {
        return new OrdChangeParamsType();
    }

    /**
     * Create an instance of {@link OrderListParamsType }
     * 
     */
    public OrderListParamsType createOrderListParamsType() {
        return new OrderListParamsType();
    }

    /**
     * Create an instance of {@link OrderListProcessType }
     * 
     */
    public OrderListProcessType createOrderListProcessType() {
        return new OrderListProcessType();
    }

    /**
     * Create an instance of {@link OrderCreateParameters }
     * 
     */
    public OrderCreateParameters createOrderCreateParameters() {
        return new OrderCreateParameters();
    }

    /**
     * Create an instance of {@link OrdCreateParamsType }
     * 
     */
    public OrdCreateParamsType createOrdCreateParamsType() {
        return new OrdCreateParamsType();
    }

    /**
     * Create an instance of {@link OrderViewProcessType }
     * 
     */
    public OrderViewProcessType createOrderViewProcessType() {
        return new OrderViewProcessType();
    }

    /**
     * Create an instance of {@link OrdRetrieveParamsType }
     * 
     */
    public OrdRetrieveParamsType createOrdRetrieveParamsType() {
        return new OrdRetrieveParamsType();
    }

    /**
     * Create an instance of {@link ServiceListRQ.Metadata }
     * 
     */
    public ServiceListRQ.Metadata createServiceListRQMetadata() {
        return new ServiceListRQ.Metadata();
    }

    /**
     * Create an instance of {@link ServiceListRS.OfferExpiration }
     * 
     */
    public ServiceListRS.OfferExpiration createServiceListRSOfferExpiration() {
        return new ServiceListRS.OfferExpiration();
    }

    /**
     * Create an instance of {@link ServiceListRS.Metadata }
     * 
     */
    public ServiceListRS.Metadata createServiceListRSMetadata() {
        return new ServiceListRS.Metadata();
    }

    /**
     * Create an instance of {@link CoreBaseType }
     * 
     */
    public CoreBaseType createCoreBaseType() {
        return new CoreBaseType();
    }

    /**
     * Create an instance of {@link ListBaseType }
     * 
     */
    public ListBaseType createListBaseType() {
        return new ListBaseType();
    }

    /**
     * Create an instance of {@link MetaBaseType }
     * 
     */
    public MetaBaseType createMetaBaseType() {
        return new MetaBaseType();
    }

    /**
     * Create an instance of {@link AssociatedObjectBaseType }
     * 
     */
    public AssociatedObjectBaseType createAssociatedObjectBaseType() {
        return new AssociatedObjectBaseType();
    }

    /**
     * Create an instance of {@link AugPointType }
     * 
     */
    public AugPointType createAugPointType() {
        return new AugPointType();
    }

    /**
     * Create an instance of {@link DataListObjectBaseType }
     * 
     */
    public DataListObjectBaseType createDataListObjectBaseType() {
        return new DataListObjectBaseType();
    }

    /**
     * Create an instance of {@link IdentifierObjectBaseType }
     * 
     */
    public IdentifierObjectBaseType createIdentifierObjectBaseType() {
        return new IdentifierObjectBaseType();
    }

    /**
     * Create an instance of {@link AllDateGrpType }
     * 
     */
    public AllDateGrpType createAllDateGrpType() {
        return new AllDateGrpType();
    }

    /**
     * Create an instance of {@link DayOfWeekIndType }
     * 
     */
    public DayOfWeekIndType createDayOfWeekIndType() {
        return new DayOfWeekIndType();
    }

    /**
     * Create an instance of {@link UniqueIDContextType }
     * 
     */
    public UniqueIDContextType createUniqueIDContextType() {
        return new UniqueIDContextType();
    }

    /**
     * Create an instance of {@link UriContextType }
     * 
     */
    public UriContextType createUriContextType() {
        return new UriContextType();
    }

    /**
     * Create an instance of {@link DateTimePeriodType }
     * 
     */
    public DateTimePeriodType createDateTimePeriodType() {
        return new DateTimePeriodType();
    }

    /**
     * Create an instance of {@link DatePeriodType }
     * 
     */
    public DatePeriodType createDatePeriodType() {
        return new DatePeriodType();
    }

    /**
     * Create an instance of {@link TimestampRepType }
     * 
     */
    public TimestampRepType createTimestampRepType() {
        return new TimestampRepType();
    }

    /**
     * Create an instance of {@link S5Type }
     * 
     */
    public S5Type createS5Type() {
        return new S5Type();
    }

    /**
     * Create an instance of {@link S7Type }
     * 
     */
    public S7Type createS7Type() {
        return new S7Type();
    }

    /**
     * Create an instance of {@link BagDisclosureType }
     * 
     */
    public BagDisclosureType createBagDisclosureType() {
        return new BagDisclosureType();
    }

    /**
     * Create an instance of {@link ContactCoreType }
     * 
     */
    public ContactCoreType createContactCoreType() {
        return new ContactCoreType();
    }

    /**
     * Create an instance of {@link EmailIDType }
     * 
     */
    public EmailIDType createEmailIDType() {
        return new EmailIDType();
    }

    /**
     * Create an instance of {@link CountryProximityType }
     * 
     */
    public CountryProximityType createCountryProximityType() {
        return new CountryProximityType();
    }

    /**
     * Create an instance of {@link DiscountType }
     * 
     */
    public DiscountType createDiscountType() {
        return new DiscountType();
    }

    /**
     * Create an instance of {@link PriceCoreType }
     * 
     */
    public PriceCoreType createPriceCoreType() {
        return new PriceCoreType();
    }

    /**
     * Create an instance of {@link TaxCoreType }
     * 
     */
    public TaxCoreType createTaxCoreType() {
        return new TaxCoreType();
    }

    /**
     * Create an instance of {@link GroupType }
     * 
     */
    public GroupType createGroupType() {
        return new GroupType();
    }

    /**
     * Create an instance of {@link AirlineCoreRepType }
     * 
     */
    public AirlineCoreRepType createAirlineCoreRepType() {
        return new AirlineCoreRepType();
    }

    /**
     * Create an instance of {@link MarketingCarrierFlightType }
     * 
     */
    public MarketingCarrierFlightType createMarketingCarrierFlightType() {
        return new MarketingCarrierFlightType();
    }

    /**
     * Create an instance of {@link OperatingCarrierFlightType }
     * 
     */
    public OperatingCarrierFlightType createOperatingCarrierFlightType() {
        return new OperatingCarrierFlightType();
    }

    /**
     * Create an instance of {@link PartnerCoreRepType }
     * 
     */
    public PartnerCoreRepType createPartnerCoreRepType() {
        return new PartnerCoreRepType();
    }

    /**
     * Create an instance of {@link AgentUserMsgPartyCoreType }
     * 
     */
    public AgentUserMsgPartyCoreType createAgentUserMsgPartyCoreType() {
        return new AgentUserMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link AggregatorMsgPartyCoreType }
     * 
     */
    public AggregatorMsgPartyCoreType createAggregatorMsgPartyCoreType() {
        return new AggregatorMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link AirlineMsgPartyCoreType }
     * 
     */
    public AirlineMsgPartyCoreType createAirlineMsgPartyCoreType() {
        return new AirlineMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link EnabledSysMsgPartyCoreType }
     * 
     */
    public EnabledSysMsgPartyCoreType createEnabledSysMsgPartyCoreType() {
        return new EnabledSysMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link RetailerMsgPartyCoreType }
     * 
     */
    public RetailerMsgPartyCoreType createRetailerMsgPartyCoreType() {
        return new RetailerMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link TrvlAgencyMsgPartyCoreType }
     * 
     */
    public TrvlAgencyMsgPartyCoreType createTrvlAgencyMsgPartyCoreType() {
        return new TrvlAgencyMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link FreeTextType }
     * 
     */
    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    /**
     * Create an instance of {@link MultiAssociationType }
     * 
     */
    public MultiAssociationType createMultiAssociationType() {
        return new MultiAssociationType();
    }

    /**
     * Create an instance of {@link SecurePaymentUrlType }
     * 
     */
    public SecurePaymentUrlType createSecurePaymentUrlType() {
        return new SecurePaymentUrlType();
    }

    /**
     * Create an instance of {@link AuthAccountType }
     * 
     */
    public AuthAccountType createAuthAccountType() {
        return new AuthAccountType();
    }

    /**
     * Create an instance of {@link NoticeBaseType }
     * 
     */
    public NoticeBaseType createNoticeBaseType() {
        return new NoticeBaseType();
    }

    /**
     * Create an instance of {@link COSAssocType }
     * 
     */
    public COSAssocType createCOSAssocType() {
        return new COSAssocType();
    }

    /**
     * Create an instance of {@link FlightPerformanceType }
     * 
     */
    public FlightPerformanceType createFlightPerformanceType() {
        return new FlightPerformanceType();
    }

    /**
     * Create an instance of {@link AircraftTailNmbrQueryType }
     * 
     */
    public AircraftTailNmbrQueryType createAircraftTailNmbrQueryType() {
        return new AircraftTailNmbrQueryType();
    }

    /**
     * Create an instance of {@link BagOfferAssocType }
     * 
     */
    public BagOfferAssocType createBagOfferAssocType() {
        return new BagOfferAssocType();
    }

    /**
     * Create an instance of {@link SeatOfferAssocType }
     * 
     */
    public SeatOfferAssocType createSeatOfferAssocType() {
        return new SeatOfferAssocType();
    }

    /**
     * Create an instance of {@link SimpleFlightAssocType }
     * 
     */
    public SimpleFlightAssocType createSimpleFlightAssocType() {
        return new SimpleFlightAssocType();
    }

    /**
     * Create an instance of {@link OfferType }
     * 
     */
    public OfferType createOfferType() {
        return new OfferType();
    }

    /**
     * Create an instance of {@link OfferItemDetailType }
     * 
     */
    public OfferItemDetailType createOfferItemDetailType() {
        return new OfferItemDetailType();
    }

    /**
     * Create an instance of {@link OfferTermsType }
     * 
     */
    public OfferTermsType createOfferTermsType() {
        return new OfferTermsType();
    }

    /**
     * Create an instance of {@link OfferOrderQuantityType }
     * 
     */
    public OfferOrderQuantityType createOfferOrderQuantityType() {
        return new OfferOrderQuantityType();
    }

    /**
     * Create an instance of {@link OrderItemDetailType }
     * 
     */
    public OrderItemDetailType createOrderItemDetailType() {
        return new OrderItemDetailType();
    }

    /**
     * Create an instance of {@link OrderOfferItemType }
     * 
     */
    public OrderOfferItemType createOrderOfferItemType() {
        return new OrderOfferItemType();
    }

    /**
     * Create an instance of {@link OrderPriceType }
     * 
     */
    public OrderPriceType createOrderPriceType() {
        return new OrderPriceType();
    }

    /**
     * Create an instance of {@link OrderProcessResultType }
     * 
     */
    public OrderProcessResultType createOrderProcessResultType() {
        return new OrderProcessResultType();
    }

    /**
     * Create an instance of {@link CouponOrderKeyType }
     * 
     */
    public CouponOrderKeyType createCouponOrderKeyType() {
        return new CouponOrderKeyType();
    }

    /**
     * Create an instance of {@link TicketType }
     * 
     */
    public TicketType createTicketType() {
        return new TicketType();
    }

    /**
     * Create an instance of {@link TicketDocHistoryType }
     * 
     */
    public TicketDocHistoryType createTicketDocHistoryType() {
        return new TicketDocHistoryType();
    }

    /**
     * Create an instance of {@link PriceClassType }
     * 
     */
    public PriceClassType createPriceClassType() {
        return new PriceClassType();
    }

    /**
     * Create an instance of {@link ListOfSeatType }
     * 
     */
    public ListOfSeatType createListOfSeatType() {
        return new ListOfSeatType();
    }

    /**
     * Create an instance of {@link SeatCoreType }
     * 
     */
    public SeatCoreType createSeatCoreType() {
        return new SeatCoreType();
    }

    /**
     * Create an instance of {@link SeatDetailType }
     * 
     */
    public SeatDetailType createSeatDetailType() {
        return new SeatDetailType();
    }

    /**
     * Create an instance of {@link SeatMapRowNbrType }
     * 
     */
    public SeatMapRowNbrType createSeatMapRowNbrType() {
        return new SeatMapRowNbrType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link OfferGeographicSpecificationType }
     * 
     */
    public OfferGeographicSpecificationType createOfferGeographicSpecificationType() {
        return new OfferGeographicSpecificationType();
    }

    /**
     * Create an instance of {@link ProfileOwnerType }
     * 
     */
    public ProfileOwnerType createProfileOwnerType() {
        return new ProfileOwnerType();
    }

    /**
     * Create an instance of {@link BaggageDeterminingCarrierType }
     * 
     */
    public BaggageDeterminingCarrierType createBaggageDeterminingCarrierType() {
        return new BaggageDeterminingCarrierType();
    }

    /**
     * Create an instance of {@link TicketIdentificationType }
     * 
     */
    public TicketIdentificationType createTicketIdentificationType() {
        return new TicketIdentificationType();
    }

    /**
     * Create an instance of {@link ItinShopAction }
     * 
     */
    public ItinShopAction createItinShopAction() {
        return new ItinShopAction();
    }

    /**
     * Create an instance of {@link OrdCancelNoticesType }
     * 
     */
    public OrdCancelNoticesType createOrdCancelNoticesType() {
        return new OrdCancelNoticesType();
    }

    /**
     * Create an instance of {@link OrdChangeAlertsType }
     * 
     */
    public OrdChangeAlertsType createOrdChangeAlertsType() {
        return new OrdChangeAlertsType();
    }

    /**
     * Create an instance of {@link OrderListAlertsType }
     * 
     */
    public OrderListAlertsType createOrderListAlertsType() {
        return new OrderListAlertsType();
    }

    /**
     * Create an instance of {@link OrderListNoticesType }
     * 
     */
    public OrderListNoticesType createOrderListNoticesType() {
        return new OrderListNoticesType();
    }

    /**
     * Create an instance of {@link OrdCreateAlertsType }
     * 
     */
    public OrdCreateAlertsType createOrdCreateAlertsType() {
        return new OrdCreateAlertsType();
    }

    /**
     * Create an instance of {@link OrdRetrieveAlertsType }
     * 
     */
    public OrdRetrieveAlertsType createOrdRetrieveAlertsType() {
        return new OrdRetrieveAlertsType();
    }

    /**
     * Create an instance of {@link OrdRetrieveNoticesType }
     * 
     */
    public OrdRetrieveNoticesType createOrdRetrieveNoticesType() {
        return new OrdRetrieveNoticesType();
    }

    /**
     * Create an instance of {@link SrvListResMetadataType.Shopping }
     * 
     */
    public SrvListResMetadataType.Shopping createSrvListResMetadataTypeShopping() {
        return new SrvListResMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link SrvListResMetadataType.Traveler }
     * 
     */
    public SrvListResMetadataType.Traveler createSrvListResMetadataTypeTraveler() {
        return new SrvListResMetadataType.Traveler();
    }

    /**
     * Create an instance of {@link SrvListResMetadataType.OtherMetadata }
     * 
     */
    public SrvListResMetadataType.OtherMetadata createSrvListResMetadataTypeOtherMetadata() {
        return new SrvListResMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link SrvListReqMetadataType.Shopping }
     * 
     */
    public SrvListReqMetadataType.Shopping createSrvListReqMetadataTypeShopping() {
        return new SrvListReqMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link SrvListReqMetadataType.Traveler }
     * 
     */
    public SrvListReqMetadataType.Traveler createSrvListReqMetadataTypeTraveler() {
        return new SrvListReqMetadataType.Traveler();
    }

    /**
     * Create an instance of {@link SrvListReqMetadataType.OtherMetadata }
     * 
     */
    public SrvListReqMetadataType.OtherMetadata createSrvListReqMetadataTypeOtherMetadata() {
        return new SrvListReqMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link OrdRetrieveMetadataType.OtherMetadata }
     * 
     */
    public OrdRetrieveMetadataType.OtherMetadata createOrdRetrieveMetadataTypeOtherMetadata() {
        return new OrdRetrieveMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType.AppliedPriceVariance.PriceVariance.RuleID }
     * 
     */
    public OrdViewNoticesType.AppliedPriceVariance.PriceVariance.RuleID createOrdViewNoticesTypeAppliedPriceVariancePriceVarianceRuleID() {
        return new OrdViewNoticesType.AppliedPriceVariance.PriceVariance.RuleID();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType.AppliedPriceVariance.PriceVariance.Amount }
     * 
     */
    public OrdViewNoticesType.AppliedPriceVariance.PriceVariance.Amount createOrdViewNoticesTypeAppliedPriceVariancePriceVarianceAmount() {
        return new OrdViewNoticesType.AppliedPriceVariance.PriceVariance.Amount();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType.AppliedPriceVariance.PriceVariance.Associations.Passengers }
     * 
     */
    public OrdViewNoticesType.AppliedPriceVariance.PriceVariance.Associations.Passengers createOrdViewNoticesTypeAppliedPriceVariancePriceVarianceAssociationsPassengers() {
        return new OrdViewNoticesType.AppliedPriceVariance.PriceVariance.Associations.Passengers();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType.AppliedPriceVariance.PriceVariance.Associations.OtherAssociation }
     * 
     */
    public OrdViewNoticesType.AppliedPriceVariance.PriceVariance.Associations.OtherAssociation createOrdViewNoticesTypeAppliedPriceVariancePriceVarianceAssociationsOtherAssociation() {
        return new OrdViewNoticesType.AppliedPriceVariance.PriceVariance.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType.AppliedTaxExemption.TaxExemption.RuleID }
     * 
     */
    public OrdViewNoticesType.AppliedTaxExemption.TaxExemption.RuleID createOrdViewNoticesTypeAppliedTaxExemptionTaxExemptionRuleID() {
        return new OrdViewNoticesType.AppliedTaxExemption.TaxExemption.RuleID();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType.AppliedTaxExemption.TaxExemption.Associations.Passengers }
     * 
     */
    public OrdViewNoticesType.AppliedTaxExemption.TaxExemption.Associations.Passengers createOrdViewNoticesTypeAppliedTaxExemptionTaxExemptionAssociationsPassengers() {
        return new OrdViewNoticesType.AppliedTaxExemption.TaxExemption.Associations.Passengers();
    }

    /**
     * Create an instance of {@link OrdViewNoticesType.AppliedTaxExemption.TaxExemption.Associations.OtherAssociation }
     * 
     */
    public OrdViewNoticesType.AppliedTaxExemption.TaxExemption.Associations.OtherAssociation createOrdViewNoticesTypeAppliedTaxExemptionTaxExemptionAssociationsOtherAssociation() {
        return new OrdViewNoticesType.AppliedTaxExemption.TaxExemption.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrdViewMetadataType.OtherMetadata }
     * 
     */
    public OrdViewMetadataType.OtherMetadata createOrdViewMetadataTypeOtherMetadata() {
        return new OrdViewMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.PaymentRules }
     * 
     */
    public OrdCreateNoticesType.PaymentRules createOrdCreateNoticesTypePaymentRules() {
        return new OrdCreateNoticesType.PaymentRules();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.PricingParameters }
     * 
     */
    public OrdCreateNoticesType.PricingParameters createOrdCreateNoticesTypePricingParameters() {
        return new OrdCreateNoticesType.PricingParameters();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.TaxExemptionRules.Named.TaxCode }
     * 
     */
    public OrdCreateNoticesType.TaxExemptionRules.Named.TaxCode createOrdCreateNoticesTypeTaxExemptionRulesNamedTaxCode() {
        return new OrdCreateNoticesType.TaxExemptionRules.Named.TaxCode();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.RuleID }
     * 
     */
    public OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.RuleID createOrdCreateNoticesTypePriceVarianceRulesPriceVarianceRuleRuleID() {
        return new OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.RuleID();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.AcceptableVariance }
     * 
     */
    public OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.AcceptableVariance createOrdCreateNoticesTypePriceVarianceRulesPriceVarianceRuleAcceptableVariance() {
        return new OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.AcceptableVariance();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Name }
     * 
     */
    public OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Name createOrdCreateNoticesTypePriceVarianceRulesPriceVarianceRuleName() {
        return new OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Name();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.RuleValid }
     * 
     */
    public OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.RuleValid createOrdCreateNoticesTypePriceVarianceRulesPriceVarianceRuleRuleValid() {
        return new OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.RuleValid();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Currencies }
     * 
     */
    public OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Currencies createOrdCreateNoticesTypePriceVarianceRulesPriceVarianceRuleCurrencies() {
        return new OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Currencies();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.Passengers }
     * 
     */
    public OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.Passengers createOrdCreateNoticesTypePriceVarianceRulesPriceVarianceRuleAssociationsPassengers() {
        return new OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.Passengers();
    }

    /**
     * Create an instance of {@link OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.OtherAssociation }
     * 
     */
    public OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.OtherAssociation createOrdCreateNoticesTypePriceVarianceRulesPriceVarianceRuleAssociationsOtherAssociation() {
        return new OrdCreateNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrdCreateMetadataType.OtherMetadata }
     * 
     */
    public OrdCreateMetadataType.OtherMetadata createOrdCreateMetadataTypeOtherMetadata() {
        return new OrdCreateMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link OrderListMetadataType.OtherMetadata }
     * 
     */
    public OrderListMetadataType.OtherMetadata createOrderListMetadataTypeOtherMetadata() {
        return new OrderListMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.PaymentRules }
     * 
     */
    public OrdChangeNoticesType.PaymentRules createOrdChangeNoticesTypePaymentRules() {
        return new OrdChangeNoticesType.PaymentRules();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.PricingParameters }
     * 
     */
    public OrdChangeNoticesType.PricingParameters createOrdChangeNoticesTypePricingParameters() {
        return new OrdChangeNoticesType.PricingParameters();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.TaxExemptionRules.Named.TaxCode }
     * 
     */
    public OrdChangeNoticesType.TaxExemptionRules.Named.TaxCode createOrdChangeNoticesTypeTaxExemptionRulesNamedTaxCode() {
        return new OrdChangeNoticesType.TaxExemptionRules.Named.TaxCode();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleID }
     * 
     */
    public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleID createOrdChangeNoticesTypePriceVarianceRulesPriceVarianceRuleRuleID() {
        return new OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleID();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.AcceptableVariance }
     * 
     */
    public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.AcceptableVariance createOrdChangeNoticesTypePriceVarianceRulesPriceVarianceRuleAcceptableVariance() {
        return new OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.AcceptableVariance();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Name }
     * 
     */
    public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Name createOrdChangeNoticesTypePriceVarianceRulesPriceVarianceRuleName() {
        return new OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Name();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleValid }
     * 
     */
    public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleValid createOrdChangeNoticesTypePriceVarianceRulesPriceVarianceRuleRuleValid() {
        return new OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.RuleValid();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Currencies }
     * 
     */
    public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Currencies createOrdChangeNoticesTypePriceVarianceRulesPriceVarianceRuleCurrencies() {
        return new OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Currencies();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.Passengers }
     * 
     */
    public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.Passengers createOrdChangeNoticesTypePriceVarianceRulesPriceVarianceRuleAssociationsPassengers() {
        return new OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.Passengers();
    }

    /**
     * Create an instance of {@link OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.OtherAssociation }
     * 
     */
    public OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.OtherAssociation createOrdChangeNoticesTypePriceVarianceRulesPriceVarianceRuleAssociationsOtherAssociation() {
        return new OrdChangeNoticesType.PriceVarianceRules.PriceVarianceRule.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.RuleID }
     * 
     */
    public ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.RuleID createItinReshopNoticesTypeAppliedPriceVariancePriceVarianceRuleID() {
        return new ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.RuleID();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Amount }
     * 
     */
    public ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Amount createItinReshopNoticesTypeAppliedPriceVariancePriceVarianceAmount() {
        return new ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Amount();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.Passengers }
     * 
     */
    public ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.Passengers createItinReshopNoticesTypeAppliedPriceVariancePriceVarianceAssociationsPassengers() {
        return new ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.Passengers();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.OtherAssociation }
     * 
     */
    public ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.OtherAssociation createItinReshopNoticesTypeAppliedPriceVariancePriceVarianceAssociationsOtherAssociation() {
        return new ItinReshopNoticesType.AppliedPriceVariance.PriceVariance.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.RuleID }
     * 
     */
    public ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.RuleID createItinReshopNoticesTypeAppliedTaxExemptionTaxExemptionRuleID() {
        return new ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.RuleID();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.Passengers }
     * 
     */
    public ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.Passengers createItinReshopNoticesTypeAppliedTaxExemptionTaxExemptionAssociationsPassengers() {
        return new ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.Passengers();
    }

    /**
     * Create an instance of {@link ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.OtherAssociation }
     * 
     */
    public ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.OtherAssociation createItinReshopNoticesTypeAppliedTaxExemptionTaxExemptionAssociationsOtherAssociation() {
        return new ItinReshopNoticesType.AppliedTaxExemption.TaxExemption.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.Code }
     * 
     */
    public ItinReshopAlertsType.Exception.Code createItinReshopAlertsTypeExceptionCode() {
        return new ItinReshopAlertsType.Exception.Code();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.Eligibility.AlternateOffers.AlternateOffer }
     * 
     */
    public ItinReshopAlertsType.Exception.Eligibility.AlternateOffers.AlternateOffer createItinReshopAlertsTypeExceptionEligibilityAlternateOffersAlternateOffer() {
        return new ItinReshopAlertsType.Exception.Eligibility.AlternateOffers.AlternateOffer();
    }

    /**
     * Create an instance of {@link OfferItemCoreType.Parameters }
     * 
     */
    public OfferItemCoreType.Parameters createOfferItemCoreTypeParameters() {
        return new OfferItemCoreType.Parameters();
    }

    /**
     * Create an instance of {@link OfferItemCoreType.TotalPrice }
     * 
     */
    public OfferItemCoreType.TotalPrice createOfferItemCoreTypeTotalPrice() {
        return new OfferItemCoreType.TotalPrice();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.Eligibility.Associations.Passengers }
     * 
     */
    public ItinReshopAlertsType.Exception.Eligibility.Associations.Passengers createItinReshopAlertsTypeExceptionEligibilityAssociationsPassengers() {
        return new ItinReshopAlertsType.Exception.Eligibility.Associations.Passengers();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.Eligibility.Associations.OtherAssociation }
     * 
     */
    public ItinReshopAlertsType.Exception.Eligibility.Associations.OtherAssociation createItinReshopAlertsTypeExceptionEligibilityAssociationsOtherAssociation() {
        return new ItinReshopAlertsType.Exception.Eligibility.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.Eligibility.Promotion }
     * 
     */
    public ItinReshopAlertsType.Exception.Eligibility.Promotion createItinReshopAlertsTypeExceptionEligibilityPromotion() {
        return new ItinReshopAlertsType.Exception.Eligibility.Promotion();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.RuleID }
     * 
     */
    public ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.RuleID createItinReshopAlertsTypeExceptionPriceVariancesPriceVarianceRuleID() {
        return new ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.RuleID();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Amount }
     * 
     */
    public ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Amount createItinReshopAlertsTypeExceptionPriceVariancesPriceVarianceAmount() {
        return new ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Amount();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.Passengers }
     * 
     */
    public ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.Passengers createItinReshopAlertsTypeExceptionPriceVariancesPriceVarianceAssociationsPassengers() {
        return new ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.Passengers();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.OtherAssociation }
     * 
     */
    public ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.OtherAssociation createItinReshopAlertsTypeExceptionPriceVariancesPriceVarianceAssociationsOtherAssociation() {
        return new ItinReshopAlertsType.Exception.PriceVariances.PriceVariance.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers.AlternateOffer }
     * 
     */
    public ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers.AlternateOffer createItinReshopAlertsTypeExceptionInvDiscrepencyAlternateOffersAlternateOffer() {
        return new ItinReshopAlertsType.Exception.InvDiscrepency.AlternateOffers.AlternateOffer();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.InvDiscrepency.Associations.Passengers }
     * 
     */
    public ItinReshopAlertsType.Exception.InvDiscrepency.Associations.Passengers createItinReshopAlertsTypeExceptionInvDiscrepencyAssociationsPassengers() {
        return new ItinReshopAlertsType.Exception.InvDiscrepency.Associations.Passengers();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.InvDiscrepency.Associations.OtherAssociation }
     * 
     */
    public ItinReshopAlertsType.Exception.InvDiscrepency.Associations.OtherAssociation createItinReshopAlertsTypeExceptionInvDiscrepencyAssociationsOtherAssociation() {
        return new ItinReshopAlertsType.Exception.InvDiscrepency.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers.AlternateOffer }
     * 
     */
    public ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers.AlternateOffer createItinReshopAlertsTypeExceptionExpiredTimeLimitsExpiredTimeLimitAlternateOffersAlternateOffer() {
        return new ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.AlternateOffers.AlternateOffer();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.Passengers }
     * 
     */
    public ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.Passengers createItinReshopAlertsTypeExceptionExpiredTimeLimitsExpiredTimeLimitAssociationsPassengers() {
        return new ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.Passengers();
    }

    /**
     * Create an instance of {@link ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.OtherAssociation }
     * 
     */
    public ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.OtherAssociation createItinReshopAlertsTypeExceptionExpiredTimeLimitsExpiredTimeLimitAssociationsOtherAssociation() {
        return new ItinReshopAlertsType.Exception.ExpiredTimeLimits.ExpiredTimeLimit.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link FltPriceResMetadataType.Shopping }
     * 
     */
    public FltPriceResMetadataType.Shopping createFltPriceResMetadataTypeShopping() {
        return new FltPriceResMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link FltPriceResMetadataType.Traveler }
     * 
     */
    public FltPriceResMetadataType.Traveler createFltPriceResMetadataTypeTraveler() {
        return new FltPriceResMetadataType.Traveler();
    }

    /**
     * Create an instance of {@link FltPriceResMetadataType.OtherMetadata }
     * 
     */
    public FltPriceResMetadataType.OtherMetadata createFltPriceResMetadataTypeOtherMetadata() {
        return new FltPriceResMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link FltPriceReqMetadataType.Shopping }
     * 
     */
    public FltPriceReqMetadataType.Shopping createFltPriceReqMetadataTypeShopping() {
        return new FltPriceReqMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link FltPriceReqMetadataType.Traveler }
     * 
     */
    public FltPriceReqMetadataType.Traveler createFltPriceReqMetadataTypeTraveler() {
        return new FltPriceReqMetadataType.Traveler();
    }

    /**
     * Create an instance of {@link FltPriceReqMetadataType.OtherMetadata }
     * 
     */
    public FltPriceReqMetadataType.OtherMetadata createFltPriceReqMetadataTypeOtherMetadata() {
        return new FltPriceReqMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link AirShopResParamsType.Group }
     * 
     */
    public AirShopResParamsType.Group createAirShopResParamsTypeGroup() {
        return new AirShopResParamsType.Group();
    }

    /**
     * Create an instance of {@link AirShopResParamsType.Pricing.FeeExemption.Fee.Code }
     * 
     */
    public AirShopResParamsType.Pricing.FeeExemption.Fee.Code createAirShopResParamsTypePricingFeeExemptionFeeCode() {
        return new AirShopResParamsType.Pricing.FeeExemption.Fee.Code();
    }

    /**
     * Create an instance of {@link AirShopReqMetadataType.Shopping }
     * 
     */
    public AirShopReqMetadataType.Shopping createAirShopReqMetadataTypeShopping() {
        return new AirShopReqMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link AirShopReqMetadataType.Traveler }
     * 
     */
    public AirShopReqMetadataType.Traveler createAirShopReqMetadataTypeTraveler() {
        return new AirShopReqMetadataType.Traveler();
    }

    /**
     * Create an instance of {@link AirShopReqMetadataType.OtherMetadata }
     * 
     */
    public AirShopReqMetadataType.OtherMetadata createAirShopReqMetadataTypeOtherMetadata() {
        return new AirShopReqMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link FeeDisclosureType.Fees }
     * 
     */
    public FeeDisclosureType.Fees createFeeDisclosureTypeFees() {
        return new FeeDisclosureType.Fees();
    }

    /**
     * Create an instance of {@link FeeSurchargeType.Total }
     * 
     */
    public FeeSurchargeType.Total createFeeSurchargeTypeTotal() {
        return new FeeSurchargeType.Total();
    }

    /**
     * Create an instance of {@link FeeSurchargeType.Fee }
     * 
     */
    public FeeSurchargeType.Fee createFeeSurchargeTypeFee() {
        return new FeeSurchargeType.Fee();
    }

    /**
     * Create an instance of {@link NonGeographicSpecificationType.PointOfSaleCode }
     * 
     */
    public NonGeographicSpecificationType.PointOfSaleCode createNonGeographicSpecificationTypePointOfSaleCode() {
        return new NonGeographicSpecificationType.PointOfSaleCode();
    }

    /**
     * Create an instance of {@link GeographicSpecificationType.Coordinates.CoordinateRadius }
     * 
     */
    public GeographicSpecificationType.Coordinates.CoordinateRadius createGeographicSpecificationTypeCoordinatesCoordinateRadius() {
        return new GeographicSpecificationType.Coordinates.CoordinateRadius();
    }

    /**
     * Create an instance of {@link CouponFlightSegmentType.DepartureDateTime }
     * 
     */
    public CouponFlightSegmentType.DepartureDateTime createCouponFlightSegmentTypeDepartureDateTime() {
        return new CouponFlightSegmentType.DepartureDateTime();
    }

    /**
     * Create an instance of {@link CouponFlightSegmentType.OperatingCarrier }
     * 
     */
    public CouponFlightSegmentType.OperatingCarrier createCouponFlightSegmentTypeOperatingCarrier() {
        return new CouponFlightSegmentType.OperatingCarrier();
    }

    /**
     * Create an instance of {@link ReissuedFlownType.FlightCouponData.IntermediateStop }
     * 
     */
    public ReissuedFlownType.FlightCouponData.IntermediateStop createReissuedFlownTypeFlightCouponDataIntermediateStop() {
        return new ReissuedFlownType.FlightCouponData.IntermediateStop();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo }
     * 
     */
    public TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo createTaxCouponInfoTypeTicketDocumentCouponNumberTaxCouponInfo() {
        return new TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument.CouponNumber.Tax }
     * 
     */
    public TaxCouponInfoType.TicketDocument.CouponNumber.Tax createTaxCouponInfoTypeTicketDocumentCouponNumberTax() {
        return new TaxCouponInfoType.TicketDocument.CouponNumber.Tax();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument.CouponNumber.UnticketedPointInfo }
     * 
     */
    public TaxCouponInfoType.TicketDocument.CouponNumber.UnticketedPointInfo createTaxCouponInfoTypeTicketDocumentCouponNumberUnticketedPointInfo() {
        return new TaxCouponInfoType.TicketDocument.CouponNumber.UnticketedPointInfo();
    }

    /**
     * Create an instance of {@link TaxDetailType.Total }
     * 
     */
    public TaxDetailType.Total createTaxDetailTypeTotal() {
        return new TaxDetailType.Total();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown.Tax.CollectionPoint }
     * 
     */
    public TaxDetailType.Breakdown.Tax.CollectionPoint createTaxDetailTypeBreakdownTaxCollectionPoint() {
        return new TaxDetailType.Breakdown.Tax.CollectionPoint();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown.Tax.Conversion }
     * 
     */
    public TaxDetailType.Breakdown.Tax.Conversion createTaxDetailTypeBreakdownTaxConversion() {
        return new TaxDetailType.Breakdown.Tax.Conversion();
    }

    /**
     * Create an instance of {@link GroupFarePreferencesType.GroupFare.FareBasis }
     * 
     */
    public GroupFarePreferencesType.GroupFare.FareBasis createGroupFarePreferencesTypeGroupFareFareBasis() {
        return new GroupFarePreferencesType.GroupFare.FareBasis();
    }

    /**
     * Create an instance of {@link SocialMediaQualifierType.Service }
     * 
     */
    public SocialMediaQualifierType.Service createSocialMediaQualifierTypeService() {
        return new SocialMediaQualifierType.Service();
    }

    /**
     * Create an instance of {@link SocialMediaQualifierType.User }
     * 
     */
    public SocialMediaQualifierType.User createSocialMediaQualifierTypeUser() {
        return new SocialMediaQualifierType.User();
    }

    /**
     * Create an instance of {@link SocialMediaQualifierType.EmailAddress }
     * 
     */
    public SocialMediaQualifierType.EmailAddress createSocialMediaQualifierTypeEmailAddress() {
        return new SocialMediaQualifierType.EmailAddress();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.Proximity.ReferencePoint }
     * 
     */
    public ReferencePointQueryType.Proximity.ReferencePoint createReferencePointQueryTypeProximityReferencePoint() {
        return new ReferencePointQueryType.Proximity.ReferencePoint();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.Proximity.AreaValue }
     * 
     */
    public ReferencePointQueryType.Proximity.AreaValue createReferencePointQueryTypeProximityAreaValue() {
        return new ReferencePointQueryType.Proximity.AreaValue();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.ReferencePoint }
     * 
     */
    public ReferencePointQueryType.ReferencePoint createReferencePointQueryTypeReferencePoint() {
        return new ReferencePointQueryType.ReferencePoint();
    }

    /**
     * Create an instance of {@link ServiceFilterType.GroupCode }
     * 
     */
    public ServiceFilterType.GroupCode createServiceFilterTypeGroupCode() {
        return new ServiceFilterType.GroupCode();
    }

    /**
     * Create an instance of {@link ServiceFilterType.SubGroupCode }
     * 
     */
    public ServiceFilterType.SubGroupCode createServiceFilterTypeSubGroupCode() {
        return new ServiceFilterType.SubGroupCode();
    }

    /**
     * Create an instance of {@link ServiceDescriptionType.Description }
     * 
     */
    public ServiceDescriptionType.Description createServiceDescriptionTypeDescription() {
        return new ServiceDescriptionType.Description();
    }

    /**
     * Create an instance of {@link ServiceEncodingType.Code }
     * 
     */
    public ServiceEncodingType.Code createServiceEncodingTypeCode() {
        return new ServiceEncodingType.Code();
    }

    /**
     * Create an instance of {@link ServiceEncodingType.SubCode }
     * 
     */
    public ServiceEncodingType.SubCode createServiceEncodingTypeSubCode() {
        return new ServiceEncodingType.SubCode();
    }

    /**
     * Create an instance of {@link ServiceOtherAssocTypeOtherAssociation.Type }
     * 
     */
    public ServiceOtherAssocTypeOtherAssociation.Type createServiceOtherAssocTypeOtherAssociationType() {
        return new ServiceOtherAssocTypeOtherAssociation.Type();
    }

    /**
     * Create an instance of {@link ServiceAssocType.Traveler }
     * 
     */
    public ServiceAssocType.Traveler createServiceAssocTypeTraveler() {
        return new ServiceAssocType.Traveler();
    }

    /**
     * Create an instance of {@link ServiceAssocType.Flight }
     * 
     */
    public ServiceAssocType.Flight createServiceAssocTypeFlight() {
        return new ServiceAssocType.Flight();
    }

    /**
     * Create an instance of {@link SeatMapMessageType.Images }
     * 
     */
    public SeatMapMessageType.Images createSeatMapMessageTypeImages() {
        return new SeatMapMessageType.Images();
    }

    /**
     * Create an instance of {@link SeatMapMessageType.Links }
     * 
     */
    public SeatMapMessageType.Links createSeatMapMessageTypeLinks() {
        return new SeatMapMessageType.Links();
    }

    /**
     * Create an instance of {@link CabinCameraPosType.Row }
     * 
     */
    public CabinCameraPosType.Row createCabinCameraPosTypeRow() {
        return new CabinCameraPosType.Row();
    }

    /**
     * Create an instance of {@link CabinCameraPosType.Column }
     * 
     */
    public CabinCameraPosType.Column createCabinCameraPosTypeColumn() {
        return new CabinCameraPosType.Column();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Association }
     * 
     */
    public org.iata.ndc.schema.Association createAssociation() {
        return new org.iata.ndc.schema.Association();
    }

    /**
     * Create an instance of {@link OrderPaymentMethodType.Method }
     * 
     */
    public OrderPaymentMethodType.Method createOrderPaymentMethodTypeMethod() {
        return new OrderPaymentMethodType.Method();
    }

    /**
     * Create an instance of {@link OrderPaymentMethodType.Associations.Passengers }
     * 
     */
    public OrderPaymentMethodType.Associations.Passengers createOrderPaymentMethodTypeAssociationsPassengers() {
        return new OrderPaymentMethodType.Associations.Passengers();
    }

    /**
     * Create an instance of {@link OrderPaymentMethodType.Associations.OtherAssociation }
     * 
     */
    public OrderPaymentMethodType.Associations.OtherAssociation createOrderPaymentMethodTypeAssociationsOtherAssociation() {
        return new OrderPaymentMethodType.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrderPaymentMethodType.Promotion }
     * 
     */
    public OrderPaymentMethodType.Promotion createOrderPaymentMethodTypePromotion() {
        return new OrderPaymentMethodType.Promotion();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Method }
     * 
     */
    public OrderPaymentFormType.Method createOrderPaymentFormTypeMethod() {
        return new OrderPaymentFormType.Method();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer.Name.Surname }
     * 
     */
    public OrderPaymentFormType.Payer.Name.Surname createOrderPaymentFormTypePayerNameSurname() {
        return new OrderPaymentFormType.Payer.Name.Surname();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer.Name.Given }
     * 
     */
    public OrderPaymentFormType.Payer.Name.Given createOrderPaymentFormTypePayerNameGiven() {
        return new OrderPaymentFormType.Payer.Name.Given();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer.Name.Middle }
     * 
     */
    public OrderPaymentFormType.Payer.Name.Middle createOrderPaymentFormTypePayerNameMiddle() {
        return new OrderPaymentFormType.Payer.Name.Middle();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Associations.Passengers }
     * 
     */
    public OrderPaymentFormType.Associations.Passengers createOrderPaymentFormTypeAssociationsPassengers() {
        return new OrderPaymentFormType.Associations.Passengers();
    }

    /**
     * Create an instance of {@link HistoryCouponInfoType.SoldAirlineInfo }
     * 
     */
    public HistoryCouponInfoType.SoldAirlineInfo createHistoryCouponInfoTypeSoldAirlineInfo() {
        return new HistoryCouponInfoType.SoldAirlineInfo();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType.DepartureDateTime }
     * 
     */
    public CouponSoldAirlineType.DepartureDateTime createCouponSoldAirlineTypeDepartureDateTime() {
        return new CouponSoldAirlineType.DepartureDateTime();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType.ArrivalDateTime }
     * 
     */
    public CouponSoldAirlineType.ArrivalDateTime createCouponSoldAirlineTypeArrivalDateTime() {
        return new CouponSoldAirlineType.ArrivalDateTime();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType.Stops }
     * 
     */
    public CouponSoldAirlineType.Stops createCouponSoldAirlineTypeStops() {
        return new CouponSoldAirlineType.Stops();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType.OperatingCarrier }
     * 
     */
    public CouponSoldAirlineType.OperatingCarrier createCouponSoldAirlineTypeOperatingCarrier() {
        return new CouponSoldAirlineType.OperatingCarrier();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Taxes }
     * 
     */
    public DetailCurrencyPriceType.Taxes createDetailCurrencyPriceTypeTaxes() {
        return new DetailCurrencyPriceType.Taxes();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Fees }
     * 
     */
    public DetailCurrencyPriceType.Fees createDetailCurrencyPriceTypeFees() {
        return new DetailCurrencyPriceType.Fees();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Details.Detail }
     * 
     */
    public DetailCurrencyPriceType.Details.Detail createDetailCurrencyPriceTypeDetail() {
        return new DetailCurrencyPriceType.Details.Detail();
    }

    /**
     * Create an instance of {@link FlightPriceType.Fees }
     * 
     */
    public FlightPriceType.Fees createFlightPriceTypeFees() {
        return new FlightPriceType.Fees();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Status }
     * 
     */
    public PaymentProcessType.Status createPaymentProcessTypeStatus() {
        return new PaymentProcessType.Status();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Amount }
     * 
     */
    public PaymentProcessType.Amount createPaymentProcessTypeAmount() {
        return new PaymentProcessType.Amount();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Method }
     * 
     */
    public PaymentProcessType.Method createPaymentProcessTypeMethod() {
        return new PaymentProcessType.Method();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Variance }
     * 
     */
    public PaymentProcessType.Variance createPaymentProcessTypeVariance() {
        return new PaymentProcessType.Variance();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Promotion }
     * 
     */
    public PaymentProcessType.Promotion createPaymentProcessTypePromotion() {
        return new PaymentProcessType.Promotion();
    }

    /**
     * Create an instance of {@link PaymentStatusType.IncompletePayment.StatusCode }
     * 
     */
    public PaymentStatusType.IncompletePayment.StatusCode createPaymentStatusTypeIncompletePaymentStatusCode() {
        return new PaymentStatusType.IncompletePayment.StatusCode();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.Pricing }
     * 
     */
    public FlightItemOfferType.Pricing createFlightItemOfferTypePricing() {
        return new FlightItemOfferType.Pricing();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.AircraftEquipment }
     * 
     */
    public FlightItemOfferType.AircraftEquipment createFlightItemOfferTypeAircraftEquipment() {
        return new FlightItemOfferType.AircraftEquipment();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.Passengers }
     * 
     */
    public FlightItemOfferType.Passengers createFlightItemOfferTypePassengers() {
        return new FlightItemOfferType.Passengers();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.Details.InventoryGuarantee }
     * 
     */
    public FlightItemOfferType.Details.InventoryGuarantee createFlightItemOfferTypeDetailsInventoryGuarantee() {
        return new FlightItemOfferType.Details.InventoryGuarantee();
    }

    /**
     * Create an instance of {@link FlightItemOfferType.Flight.OperatingCarrier }
     * 
     */
    public FlightItemOfferType.Flight.OperatingCarrier createFlightItemOfferTypeFlightOperatingCarrier() {
        return new FlightItemOfferType.Flight.OperatingCarrier();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.OrderItem.InventoryGuarantee }
     * 
     */
    public org.iata.ndc.schema.OrderItem.InventoryGuarantee createOrderItemInventoryGuarantee() {
        return new org.iata.ndc.schema.OrderItem.InventoryGuarantee();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.OrderItem.ActionType }
     * 
     */
    public org.iata.ndc.schema.OrderItem.ActionType createOrderItemActionType() {
        return new org.iata.ndc.schema.OrderItem.ActionType();
    }

    /**
     * Create an instance of {@link OrderItemCoreType.OrderItem.InventoryGuarantee }
     * 
     */
    public OrderItemCoreType.OrderItem.InventoryGuarantee createOrderItemCoreTypeOrderItemInventoryGuarantee() {
        return new OrderItemCoreType.OrderItem.InventoryGuarantee();
    }

    /**
     * Create an instance of {@link OrderItemCoreType.OrderItem.Associations.Passengers }
     * 
     */
    public OrderItemCoreType.OrderItem.Associations.Passengers createOrderItemCoreTypeOrderItemAssociationsPassengers() {
        return new OrderItemCoreType.OrderItem.Associations.Passengers();
    }

    /**
     * Create an instance of {@link OrderItemCoreType.OrderItem.Associations.OtherAssociation }
     * 
     */
    public OrderItemCoreType.OrderItem.Associations.OtherAssociation createOrderItemCoreTypeOrderItemAssociationsOtherAssociation() {
        return new OrderItemCoreType.OrderItem.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.TimeLimits }
     * 
     */
    public OrderCoreChangeType.TimeLimits createOrderCoreChangeTypeTimeLimits() {
        return new OrderCoreChangeType.TimeLimits();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.ActionType }
     * 
     */
    public OrderCoreChangeType.ActionType createOrderCoreChangeTypeActionType() {
        return new OrderCoreChangeType.ActionType();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendment.ActionType }
     * 
     */
    public OrderCoreChangeType.Details.Amendment.ActionType createOrderCoreChangeTypeDetailsAmendmentActionType() {
        return new OrderCoreChangeType.Details.Amendment.ActionType();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendment.OrderItem.Passengers }
     * 
     */
    public OrderCoreChangeType.Details.Amendment.OrderItem.Passengers createOrderCoreChangeTypeDetailsAmendmentOrderItemPassengers() {
        return new OrderCoreChangeType.Details.Amendment.OrderItem.Passengers();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendment.OrderItem.OtherAssociation }
     * 
     */
    public OrderCoreChangeType.Details.Amendment.OrderItem.OtherAssociation createOrderCoreChangeTypeDetailsAmendmentOrderItemOtherAssociation() {
        return new OrderCoreChangeType.Details.Amendment.OrderItem.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Passengers }
     * 
     */
    public OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Passengers createOrderCoreChangeTypeDetailsAmendmentOrderItemOfferItemPassengers() {
        return new OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Passengers();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.OtherAssociation }
     * 
     */
    public OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.OtherAssociation createOrderCoreChangeTypeDetailsAmendmentOrderItemOfferItemOtherAssociation() {
        return new OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services.Passengers }
     * 
     */
    public OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services.Passengers createOrderCoreChangeTypeDetailsAmendmentOrderItemOfferItemServicesPassengers() {
        return new OrderCoreChangeType.Details.Amendment.OrderItem.OfferItem.Services.Passengers();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.Amendment.TicketDocInfo.Passengers }
     * 
     */
    public OrderCoreChangeType.Details.Amendment.TicketDocInfo.Passengers createOrderCoreChangeTypeDetailsAmendmentTicketDocInfoPassengers() {
        return new OrderCoreChangeType.Details.Amendment.TicketDocInfo.Passengers();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.ShoppingResponse.ResponseID }
     * 
     */
    public OrderCoreChangeType.Details.ShoppingResponse.ResponseID createOrderCoreChangeTypeDetailsShoppingResponseResponseID() {
        return new OrderCoreChangeType.Details.ShoppingResponse.ResponseID();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Details.ShoppingResponse.OfferItem }
     * 
     */
    public OrderCoreChangeType.Details.ShoppingResponse.OfferItem createOrderCoreChangeTypeDetailsShoppingResponseOfferItem() {
        return new OrderCoreChangeType.Details.ShoppingResponse.OfferItem();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Associations.Passengers }
     * 
     */
    public OrderCoreChangeType.Associations.Passengers createOrderCoreChangeTypeAssociationsPassengers() {
        return new OrderCoreChangeType.Associations.Passengers();
    }

    /**
     * Create an instance of {@link OrderCoreChangeType.Associations.OtherAssociation }
     * 
     */
    public OrderCoreChangeType.Associations.OtherAssociation createOrderCoreChangeTypeAssociationsOtherAssociation() {
        return new OrderCoreChangeType.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrderCoreType.TotalOrderPrice }
     * 
     */
    public OrderCoreType.TotalOrderPrice createOrderCoreTypeTotalOrderPrice() {
        return new OrderCoreType.TotalOrderPrice();
    }

    /**
     * Create an instance of {@link OrderCoreType.Status }
     * 
     */
    public OrderCoreType.Status createOrderCoreTypeStatus() {
        return new OrderCoreType.Status();
    }

    /**
     * Create an instance of {@link OrderCoreType.TimeLimits.PaymentTimeLimit }
     * 
     */
    public OrderCoreType.TimeLimits.PaymentTimeLimit createOrderCoreTypeTimeLimitsPaymentTimeLimit() {
        return new OrderCoreType.TimeLimits.PaymentTimeLimit();
    }

    /**
     * Create an instance of {@link OrderCoreType.OriginalOrder.PriceQuote.Amount }
     * 
     */
    public OrderCoreType.OriginalOrder.PriceQuote.Amount createOrderCoreTypeOriginalOrderPriceQuoteAmount() {
        return new OrderCoreType.OriginalOrder.PriceQuote.Amount();
    }

    /**
     * Create an instance of {@link OrderCoreType.OriginalOrder.PriceQuote.Source }
     * 
     */
    public OrderCoreType.OriginalOrder.PriceQuote.Source createOrderCoreTypeOriginalOrderPriceQuoteSource() {
        return new OrderCoreType.OriginalOrder.PriceQuote.Source();
    }

    /**
     * Create an instance of {@link OtherOrderAssocTypeOtherAssociation }
     * 
     */
    public OtherOrderAssocTypeOtherAssociation createOtherOrderAssocTypeOtherAssociation() {
        return new OtherOrderAssocTypeOtherAssociation();
    }

    /**
     * Create an instance of {@link TimeLimit }
     * 
     */
    public TimeLimit createTimeLimit() {
        return new TimeLimit();
    }

    /**
     * Create an instance of {@link OfferValidPeriodType.Earliest }
     * 
     */
    public OfferValidPeriodType.Earliest createOfferValidPeriodTypeEarliest() {
        return new OfferValidPeriodType.Earliest();
    }

    /**
     * Create an instance of {@link OfferValidPeriodType.Latest }
     * 
     */
    public OfferValidPeriodType.Latest createOfferValidPeriodTypeLatest() {
        return new OfferValidPeriodType.Latest();
    }

    /**
     * Create an instance of {@link AllOffersSnapshotType.SubTotal }
     * 
     */
    public AllOffersSnapshotType.SubTotal createAllOffersSnapshotTypeSubTotal() {
        return new AllOffersSnapshotType.SubTotal();
    }

    /**
     * Create an instance of {@link AllOffersSnapshotType.Highest }
     * 
     */
    public AllOffersSnapshotType.Highest createAllOffersSnapshotTypeHighest() {
        return new AllOffersSnapshotType.Highest();
    }

    /**
     * Create an instance of {@link AllOffersSnapshotType.Lowest }
     * 
     */
    public AllOffersSnapshotType.Lowest createAllOffersSnapshotTypeLowest() {
        return new AllOffersSnapshotType.Lowest();
    }

    /**
     * Create an instance of {@link OfferIncentiveType.Incentive.ExpirationDate }
     * 
     */
    public OfferIncentiveType.Incentive.ExpirationDate createOfferIncentiveTypeIncentiveExpirationDate() {
        return new OfferIncentiveType.Incentive.ExpirationDate();
    }

    /**
     * Create an instance of {@link OfferIncentiveType.Incentive.OfferSubCode }
     * 
     */
    public OfferIncentiveType.Incentive.OfferSubCode createOfferIncentiveTypeIncentiveOfferSubCode() {
        return new OfferIncentiveType.Incentive.OfferSubCode();
    }

    /**
     * Create an instance of {@link OfferIncentiveType.Incentive.DiscountLevel }
     * 
     */
    public OfferIncentiveType.Incentive.DiscountLevel createOfferIncentiveTypeIncentiveDiscountLevel() {
        return new OfferIncentiveType.Incentive.DiscountLevel();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType.PriceDetail.TotalAmount }
     * 
     */
    public OfferPriceLeadDetailType.PriceDetail.TotalAmount createOfferPriceLeadDetailTypePriceDetailTotalAmount() {
        return new OfferPriceLeadDetailType.PriceDetail.TotalAmount();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType.PriceDetail.Fees }
     * 
     */
    public OfferPriceLeadDetailType.PriceDetail.Fees createOfferPriceLeadDetailTypePriceDetailFees() {
        return new OfferPriceLeadDetailType.PriceDetail.Fees();
    }

    /**
     * Create an instance of {@link SeatOfferCoreType.OfferPrice }
     * 
     */
    public SeatOfferCoreType.OfferPrice createSeatOfferCoreTypeOfferPrice() {
        return new SeatOfferCoreType.OfferPrice();
    }

    /**
     * Create an instance of {@link PricedFlightOfferCoreType.OfferPrice }
     * 
     */
    public PricedFlightOfferCoreType.OfferPrice createPricedFlightOfferCoreTypeOfferPrice() {
        return new PricedFlightOfferCoreType.OfferPrice();
    }

    /**
     * Create an instance of {@link OfferPriceLeadType.RequestedDate }
     * 
     */
    public OfferPriceLeadType.RequestedDate createOfferPriceLeadTypeRequestedDate() {
        return new OfferPriceLeadType.RequestedDate();
    }

    /**
     * Create an instance of {@link OtherOfferCoreType.OfferPrice }
     * 
     */
    public OtherOfferCoreType.OfferPrice createOtherOfferCoreTypeOfferPrice() {
        return new OtherOfferCoreType.OfferPrice();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType.TotalPrice }
     * 
     */
    public BaggageOfferCoreType.TotalPrice createBaggageOfferCoreTypeTotalPrice() {
        return new BaggageOfferCoreType.TotalPrice();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType.BagDetail.Price }
     * 
     */
    public BaggageOfferCoreType.BagDetail.Price createBaggageOfferCoreTypeBagDetailPrice() {
        return new BaggageOfferCoreType.BagDetail.Price();
    }

    /**
     * Create an instance of {@link FlightCabinCoreType.CabinDesignator }
     * 
     */
    public FlightCabinCoreType.CabinDesignator createFlightCabinCoreTypeCabinDesignator() {
        return new FlightCabinCoreType.CabinDesignator();
    }

    /**
     * Create an instance of {@link FlightCabinCoreType.MarketingName }
     * 
     */
    public FlightCabinCoreType.MarketingName createFlightCabinCoreTypeMarketingName() {
        return new FlightCabinCoreType.MarketingName();
    }

    /**
     * Create an instance of {@link FlightOnlyType.OperatingCarrier }
     * 
     */
    public FlightOnlyType.OperatingCarrier createFlightOnlyTypeOperatingCarrier() {
        return new FlightOnlyType.OperatingCarrier();
    }

    /**
     * Create an instance of {@link FlightDetailType.Stops }
     * 
     */
    public FlightDetailType.Stops createFlightDetailTypeStops() {
        return new FlightDetailType.Stops();
    }

    /**
     * Create an instance of {@link FlightType.Flight.Indicators }
     * 
     */
    public FlightType.Flight.Indicators createFlightTypeFlightIndicators() {
        return new FlightType.Flight.Indicators();
    }

    /**
     * Create an instance of {@link FlightType.Flight.Status }
     * 
     */
    public FlightType.Flight.Status createFlightTypeFlightStatus() {
        return new FlightType.Flight.Status();
    }

    /**
     * Create an instance of {@link FlightType.Flight.OperatingCarrier }
     * 
     */
    public FlightType.Flight.OperatingCarrier createFlightTypeFlightOperatingCarrier() {
        return new FlightType.Flight.OperatingCarrier();
    }

    /**
     * Create an instance of {@link COSOtherAssocType.OtherAssociation }
     * 
     */
    public COSOtherAssocType.OtherAssociation createCOSOtherAssocTypeOtherAssociation() {
        return new COSOtherAssocType.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrderFareRulesType.AdvanceStay }
     * 
     */
    public OrderFareRulesType.AdvanceStay createOrderFareRulesTypeAdvanceStay() {
        return new OrderFareRulesType.AdvanceStay();
    }

    /**
     * Create an instance of {@link ListOfServiceType.Service.Name }
     * 
     */
    public ListOfServiceType.Service.Name createListOfServiceTypeServiceName() {
        return new ListOfServiceType.Service.Name();
    }

    /**
     * Create an instance of {@link ListOfServiceType.Service.FeeMethod }
     * 
     */
    public ListOfServiceType.Service.FeeMethod createListOfServiceTypeServiceFeeMethod() {
        return new ListOfServiceType.Service.FeeMethod();
    }

    /**
     * Create an instance of {@link ListOfServiceType.Service.Settlement }
     * 
     */
    public ListOfServiceType.Service.Settlement createListOfServiceTypeServiceSettlement() {
        return new ListOfServiceType.Service.Settlement();
    }

    /**
     * Create an instance of {@link ListOfFlightSegmentType.OperatingCarrier }
     * 
     */
    public ListOfFlightSegmentType.OperatingCarrier createListOfFlightSegmentTypeOperatingCarrier() {
        return new ListOfFlightSegmentType.OperatingCarrier();
    }

    /**
     * Create an instance of {@link ListOfFlightSegmentType.Settlement }
     * 
     */
    public ListOfFlightSegmentType.Settlement createListOfFlightSegmentTypeSettlement() {
        return new ListOfFlightSegmentType.Settlement();
    }

    /**
     * Create an instance of {@link LinkFormattedType.Link }
     * 
     */
    public LinkFormattedType.Link createLinkFormattedTypeLink() {
        return new LinkFormattedType.Link();
    }

    /**
     * Create an instance of {@link PolicyType.Metadata.EncodingScheme }
     * 
     */
    public PolicyType.Metadata.EncodingScheme createPolicyTypeMetadataEncodingScheme() {
        return new PolicyType.Metadata.EncodingScheme();
    }

    /**
     * Create an instance of {@link PolicyType.Metadata.ValidPeriod }
     * 
     */
    public PolicyType.Metadata.ValidPeriod createPolicyTypeMetadataValidPeriod() {
        return new PolicyType.Metadata.ValidPeriod();
    }

    /**
     * Create an instance of {@link CorePeriodGrpType.TimeStamp }
     * 
     */
    public CorePeriodGrpType.TimeStamp createCorePeriodGrpTypeTimeStamp() {
        return new CorePeriodGrpType.TimeStamp();
    }

    /**
     * Create an instance of {@link EncSchemeType.Metadata }
     * 
     */
    public EncSchemeType.Metadata createEncSchemeTypeMetadata() {
        return new EncSchemeType.Metadata();
    }

    /**
     * Create an instance of {@link EncSchemeType.Detail.SupportedDomain }
     * 
     */
    public EncSchemeType.Detail.SupportedDomain createEncSchemeTypeDetailSupportedDomain() {
        return new EncSchemeType.Detail.SupportedDomain();
    }

    /**
     * Create an instance of {@link PolicyType.Node }
     * 
     */
    public PolicyType.Node createPolicyTypeNode() {
        return new PolicyType.Node();
    }

    /**
     * Create an instance of {@link NodePathType.Path }
     * 
     */
    public NodePathType.Path createNodePathTypePath() {
        return new NodePathType.Path();
    }

    /**
     * Create an instance of {@link NodePathType.TagName }
     * 
     */
    public NodePathType.TagName createNodePathTypeTagName() {
        return new NodePathType.TagName();
    }

    /**
     * Create an instance of {@link InfoPolicyNoticeType.Policy }
     * 
     */
    public InfoPolicyNoticeType.Policy createInfoPolicyNoticeTypePolicy() {
        return new InfoPolicyNoticeType.Policy();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Status }
     * 
     */
    public PinPhraseQuestionType.Status createPinPhraseQuestionTypeStatus() {
        return new PinPhraseQuestionType.Status();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Device }
     * 
     */
    public PinPhraseQuestionType.Device createPinPhraseQuestionTypeDevice() {
        return new PinPhraseQuestionType.Device();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.OriginalTransactionID }
     * 
     */
    public PinPhraseQuestionType.OriginalTransactionID createPinPhraseQuestionTypeOriginalTransactionID() {
        return new PinPhraseQuestionType.OriginalTransactionID();
    }

    /**
     * Create an instance of {@link DeviceType.Type }
     * 
     */
    public DeviceType.Type createDeviceTypeType() {
        return new DeviceType.Type();
    }

    /**
     * Create an instance of {@link PaymentIssueAlertType.Payment.InfoURL }
     * 
     */
    public PaymentIssueAlertType.Payment.InfoURL createPaymentIssueAlertTypePaymentInfoURL() {
        return new PaymentIssueAlertType.Payment.InfoURL();
    }

    /**
     * Create an instance of {@link PaymentIssueAlertType.Payment.Status }
     * 
     */
    public PaymentIssueAlertType.Payment.Status createPaymentIssueAlertTypePaymentStatus() {
        return new PaymentIssueAlertType.Payment.Status();
    }

    /**
     * Create an instance of {@link PaymentIssueAlertType.Payment.Incomplete.Code }
     * 
     */
    public PaymentIssueAlertType.Payment.Incomplete.Code createPaymentIssueAlertTypePaymentIncompleteCode() {
        return new PaymentIssueAlertType.Payment.Incomplete.Code();
    }

    /**
     * Create an instance of {@link PaymentIssueAlertType.Payment.Failed.Code }
     * 
     */
    public PaymentIssueAlertType.Payment.Failed.Code createPaymentIssueAlertTypePaymentFailedCode() {
        return new PaymentIssueAlertType.Payment.Failed.Code();
    }

    /**
     * Create an instance of {@link PinPhraseAnswerType.Status }
     * 
     */
    public PinPhraseAnswerType.Status createPinPhraseAnswerTypeStatus() {
        return new PinPhraseAnswerType.Status();
    }

    /**
     * Create an instance of {@link PinPhraseAnswerType.Device }
     * 
     */
    public PinPhraseAnswerType.Device createPinPhraseAnswerTypeDevice() {
        return new PinPhraseAnswerType.Device();
    }

    /**
     * Create an instance of {@link PinPhraseAnswerType.OriginalTransactionID }
     * 
     */
    public PinPhraseAnswerType.OriginalTransactionID createPinPhraseAnswerTypeOriginalTransactionID() {
        return new PinPhraseAnswerType.OriginalTransactionID();
    }

    /**
     * Create an instance of {@link ProcessingErrorType.Error.Code }
     * 
     */
    public ProcessingErrorType.Error.Code createProcessingErrorTypeErrorCode() {
        return new ProcessingErrorType.Error.Code();
    }

    /**
     * Create an instance of {@link ProcessingErrorType.Error.InfoURL }
     * 
     */
    public ProcessingErrorType.Error.InfoURL createProcessingErrorTypeErrorInfoURL() {
        return new ProcessingErrorType.Error.InfoURL();
    }

    /**
     * Create an instance of {@link MarketMsgAssocType.Association }
     * 
     */
    public MarketMsgAssocType.Association createMarketMsgAssocTypeAssociation() {
        return new MarketMsgAssocType.Association();
    }

    /**
     * Create an instance of {@link MarketingInfoType.Message }
     * 
     */
    public MarketingInfoType.Message createMarketingInfoTypeMessage() {
        return new MarketingInfoType.Message();
    }

    /**
     * Create an instance of {@link SupplierCoreRepType.OtherID }
     * 
     */
    public SupplierCoreRepType.OtherID createSupplierCoreRepTypeOtherID() {
        return new SupplierCoreRepType.OtherID();
    }

    /**
     * Create an instance of {@link IntermediaryCoreRepType.Contact }
     * 
     */
    public IntermediaryCoreRepType.Contact createIntermediaryCoreRepTypeContact() {
        return new IntermediaryCoreRepType.Contact();
    }

    /**
     * Create an instance of {@link AgentUserType.AgentUserID }
     * 
     */
    public AgentUserType.AgentUserID createAgentUserTypeAgentUserID() {
        return new AgentUserType.AgentUserID();
    }

    /**
     * Create an instance of {@link TravelerFOIDType.FOID }
     * 
     */
    public TravelerFOIDType.FOID createTravelerFOIDTypeFOID() {
        return new TravelerFOIDType.FOID();
    }

    /**
     * Create an instance of {@link LocationProximityType.AreaValue }
     * 
     */
    public LocationProximityType.AreaValue createLocationProximityTypeAreaValue() {
        return new LocationProximityType.AreaValue();
    }

    /**
     * Create an instance of {@link StateProvProximityType.StateCode }
     * 
     */
    public StateProvProximityType.StateCode createStateProvProximityTypeStateCode() {
        return new StateProvProximityType.StateCode();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.ResponseID }
     * 
     */
    public ShoppingResponseOrderType.ResponseID createShoppingResponseOrderTypeResponseID() {
        return new ShoppingResponseOrderType.ResponseID();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offer.TotalPrice }
     * 
     */
    public ShoppingResponseOrderType.Offer.TotalPrice createShoppingResponseOrderTypeOfferTotalPrice() {
        return new ShoppingResponseOrderType.Offer.TotalPrice();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offer.OfferItem.TotalPrice }
     * 
     */
    public ShoppingResponseOrderType.Offer.OfferItem.TotalPrice createShoppingResponseOrderTypeOfferOfferItemTotalPrice() {
        return new ShoppingResponseOrderType.Offer.OfferItem.TotalPrice();
    }

    /**
     * Create an instance of {@link ShoppingResponseOrderType.Offer.OfferItem.Details.InventoryGuarantee }
     * 
     */
    public ShoppingResponseOrderType.Offer.OfferItem.Details.InventoryGuarantee createShoppingResponseOrderTypeOfferOfferItemDetailsInventoryGuarantee() {
        return new ShoppingResponseOrderType.Offer.OfferItem.Details.InventoryGuarantee();
    }

    /**
     * Create an instance of {@link SpecialType.Code }
     * 
     */
    public SpecialType.Code createSpecialTypeCode() {
        return new SpecialType.Code();
    }

    /**
     * Create an instance of {@link SpecialType.Description }
     * 
     */
    public SpecialType.Description createSpecialTypeDescription() {
        return new SpecialType.Description();
    }

    /**
     * Create an instance of {@link RuleSetType.RuleSetID }
     * 
     */
    public RuleSetType.RuleSetID createRuleSetTypeRuleSetID() {
        return new RuleSetType.RuleSetID();
    }

    /**
     * Create an instance of {@link RuleSetType.RuleValid }
     * 
     */
    public RuleSetType.RuleValid createRuleSetTypeRuleValid() {
        return new RuleSetType.RuleValid();
    }

    /**
     * Create an instance of {@link PenaltyType.ApplicableFeeRemarks }
     * 
     */
    public PenaltyType.ApplicableFeeRemarks createPenaltyTypeApplicableFeeRemarks() {
        return new PenaltyType.ApplicableFeeRemarks();
    }

    /**
     * Create an instance of {@link PenaltyType.Detail.Amount.ApplicableFeeRemarks }
     * 
     */
    public PenaltyType.Detail.Amount.ApplicableFeeRemarks createPenaltyTypeDetailAmountApplicableFeeRemarks() {
        return new PenaltyType.Detail.Amount.ApplicableFeeRemarks();
    }

    /**
     * Create an instance of {@link RemarkType.Remark }
     * 
     */
    public RemarkType.Remark createRemarkTypeRemark() {
        return new RemarkType.Remark();
    }

    /**
     * Create an instance of {@link CampaignUTMParameterType.OtherUTM }
     * 
     */
    public CampaignUTMParameterType.OtherUTM createCampaignUTMParameterTypeOtherUTM() {
        return new CampaignUTMParameterType.OtherUTM();
    }

    /**
     * Create an instance of {@link RenderingParameterType.Parameter }
     * 
     */
    public RenderingParameterType.Parameter createRenderingParameterTypeParameter() {
        return new RenderingParameterType.Parameter();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType.OutputFormat }
     * 
     */
    public RenderingInstructionsType.OutputFormat createRenderingInstructionsTypeOutputFormat() {
        return new RenderingInstructionsType.OutputFormat();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType.AttachmentURI }
     * 
     */
    public RenderingInstructionsType.AttachmentURI createRenderingInstructionsTypeAttachmentURI() {
        return new RenderingInstructionsType.AttachmentURI();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType.Parameters }
     * 
     */
    public RenderingInstructionsType.Parameters createRenderingInstructionsTypeParameters() {
        return new RenderingInstructionsType.Parameters();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType.Overview }
     * 
     */
    public RenderingInstructionsType.Overview createRenderingInstructionsTypeOverview() {
        return new RenderingInstructionsType.Overview();
    }

    /**
     * Create an instance of {@link NamedAssoc.Group }
     * 
     */
    public NamedAssoc.Group createNamedAssocGroup() {
        return new NamedAssoc.Group();
    }

    /**
     * Create an instance of {@link NamedAssoc.List }
     * 
     */
    public NamedAssoc.List createNamedAssocList() {
        return new NamedAssoc.List();
    }

    /**
     * Create an instance of {@link NamedAssoc.UniqueKeyID }
     * 
     */
    public NamedAssoc.UniqueKeyID createNamedAssocUniqueKeyID() {
        return new NamedAssoc.UniqueKeyID();
    }

    /**
     * Create an instance of {@link AugPointListType.List.AugPointAssoc }
     * 
     */
    public AugPointListType.List.AugPointAssoc createAugPointListTypeListAugPointAssoc() {
        return new AugPointListType.List.AugPointAssoc();
    }

    /**
     * Create an instance of {@link AugPointAssocType.AugPointAssoc }
     * 
     */
    public AugPointAssocType.AugPointAssoc createAugPointAssocTypeAugPointAssoc() {
        return new AugPointAssocType.AugPointAssoc();
    }

    /**
     * Create an instance of {@link AugmentationType.Augmentations }
     * 
     */
    public AugmentationType.Augmentations createAugmentationTypeAugmentations() {
        return new AugmentationType.Augmentations();
    }

    /**
     * Create an instance of {@link ServiceListRS.Service }
     * 
     */
    public ServiceListRS.Service createServiceListRSService() {
        return new ServiceListRS.Service();
    }

    /**
     * Create an instance of {@link ServiceCoreType.Name }
     * 
     */
    public ServiceCoreType.Name createServiceCoreTypeName() {
        return new ServiceCoreType.Name();
    }

    /**
     * Create an instance of {@link ServiceCoreType.FeeMethod }
     * 
     */
    public ServiceCoreType.FeeMethod createServiceCoreTypeFeeMethod() {
        return new ServiceCoreType.FeeMethod();
    }

    /**
     * Create an instance of {@link ServiceCoreType.Settlement }
     * 
     */
    public ServiceCoreType.Settlement createServiceCoreTypeSettlement() {
        return new ServiceCoreType.Settlement();
    }

    /**
     * Create an instance of {@link ServiceCoreType.Associations }
     * 
     */
    public ServiceCoreType.Associations createServiceCoreTypeAssociations() {
        return new ServiceCoreType.Associations();
    }

    /**
     * Create an instance of {@link ServiceDetailType.Detail }
     * 
     */
    public ServiceDetailType.Detail createServiceDetailTypeDetail() {
        return new ServiceDetailType.Detail();
    }

    /**
     * Create an instance of {@link ServiceCoreType.BookingInstructions.UpgradeMethod }
     * 
     */
    public ServiceCoreType.BookingInstructions.UpgradeMethod createServiceCoreTypeBookingInstructionsUpgradeMethod() {
        return new ServiceCoreType.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link SrvListResParamsType.Group }
     * 
     */
    public SrvListResParamsType.Group createSrvListResParamsTypeGroup() {
        return new SrvListResParamsType.Group();
    }

    /**
     * Create an instance of {@link SrvListResParamsType.Pricing.FeeExemption.Fee.Code }
     * 
     */
    public SrvListResParamsType.Pricing.FeeExemption.Fee.Code createSrvListResParamsTypePricingFeeExemptionFeeCode() {
        return new SrvListResParamsType.Pricing.FeeExemption.Fee.Code();
    }

    /**
     * Create an instance of {@link ServiceListRQ.Query.OriginDestination }
     * 
     */
    public ServiceListRQ.Query.OriginDestination createServiceListRQQueryOriginDestination() {
        return new ServiceListRQ.Query.OriginDestination();
    }

    /**
     * Create an instance of {@link SrvListReqParamsType.Inventory }
     * 
     */
    public SrvListReqParamsType.Inventory createSrvListReqParamsTypeInventory() {
        return new SrvListReqParamsType.Inventory();
    }

    /**
     * Create an instance of {@link SrvListReqParamsType.ServiceFilters }
     * 
     */
    public SrvListReqParamsType.ServiceFilters createSrvListReqParamsTypeServiceFilters() {
        return new SrvListReqParamsType.ServiceFilters();
    }

    /**
     * Create an instance of {@link SrvListReqParamsType.Group }
     * 
     */
    public SrvListReqParamsType.Group createSrvListReqParamsTypeGroup() {
        return new SrvListReqParamsType.Group();
    }

    /**
     * Create an instance of {@link SrvListReqParamsType.Pricing.FeeExemption.Fee.Code }
     * 
     */
    public SrvListReqParamsType.Pricing.FeeExemption.Fee.Code createSrvListReqParamsTypePricingFeeExemptionFeeCode() {
        return new SrvListReqParamsType.Pricing.FeeExemption.Fee.Code();
    }

    /**
     * Create an instance of {@link SeatAvailResMetadataType.Shopping }
     * 
     */
    public SeatAvailResMetadataType.Shopping createSeatAvailResMetadataTypeShopping() {
        return new SeatAvailResMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link SeatAvailResMetadataType.Traveler }
     * 
     */
    public SeatAvailResMetadataType.Traveler createSeatAvailResMetadataTypeTraveler() {
        return new SeatAvailResMetadataType.Traveler();
    }

    /**
     * Create an instance of {@link SeatAvailResMetadataType.OtherMetadata }
     * 
     */
    public SeatAvailResMetadataType.OtherMetadata createSeatAvailResMetadataTypeOtherMetadata() {
        return new SeatAvailResMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link SeatAvailabilityRS.Service }
     * 
     */
    public SeatAvailabilityRS.Service createSeatAvailabilityRSService() {
        return new SeatAvailabilityRS.Service();
    }

    /**
     * Create an instance of {@link SeatAvailabilityRS.Flights.Cabin.CabinLayout }
     * 
     */
    public SeatAvailabilityRS.Flights.Cabin.CabinLayout createSeatAvailabilityRSFlightsCabinCabinLayout() {
        return new SeatAvailabilityRS.Flights.Cabin.CabinLayout();
    }

    /**
     * Create an instance of {@link SeatAvailResParamsType.Group }
     * 
     */
    public SeatAvailResParamsType.Group createSeatAvailResParamsTypeGroup() {
        return new SeatAvailResParamsType.Group();
    }

    /**
     * Create an instance of {@link SeatAvailResParamsType.Pricing.FeeExemption.Fee.Code }
     * 
     */
    public SeatAvailResParamsType.Pricing.FeeExemption.Fee.Code createSeatAvailResParamsTypePricingFeeExemptionFeeCode() {
        return new SeatAvailResParamsType.Pricing.FeeExemption.Fee.Code();
    }

    /**
     * Create an instance of {@link SeatAvailReqMetadataType.Shopping }
     * 
     */
    public SeatAvailReqMetadataType.Shopping createSeatAvailReqMetadataTypeShopping() {
        return new SeatAvailReqMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link SeatAvailReqMetadataType.Traveler }
     * 
     */
    public SeatAvailReqMetadataType.Traveler createSeatAvailReqMetadataTypeTraveler() {
        return new SeatAvailReqMetadataType.Traveler();
    }

    /**
     * Create an instance of {@link SeatAvailReqMetadataType.OtherMetadata }
     * 
     */
    public SeatAvailReqMetadataType.OtherMetadata createSeatAvailReqMetadataTypeOtherMetadata() {
        return new SeatAvailReqMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link QualifiersTypeQualifier }
     * 
     */
    public QualifiersTypeQualifier createQualifiersTypeQualifier() {
        return new QualifiersTypeQualifier();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.Inventory }
     * 
     */
    public SeatAvailReqParamsType.Inventory createSeatAvailReqParamsTypeInventory() {
        return new SeatAvailReqParamsType.Inventory();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.ServiceFilters }
     * 
     */
    public SeatAvailReqParamsType.ServiceFilters createSeatAvailReqParamsTypeServiceFilters() {
        return new SeatAvailReqParamsType.ServiceFilters();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.Group }
     * 
     */
    public SeatAvailReqParamsType.Group createSeatAvailReqParamsTypeGroup() {
        return new SeatAvailReqParamsType.Group();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.Pricing.FeeExemption.Fee.Code }
     * 
     */
    public SeatAvailReqParamsType.Pricing.FeeExemption.Fee.Code createSeatAvailReqParamsTypePricingFeeExemptionFeeCode() {
        return new SeatAvailReqParamsType.Pricing.FeeExemption.Fee.Code();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.TicketDocument }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.TicketDocument createOrderRetrieveRQQueryFiltersTicketDocument() {
        return new OrderRetrieveRQ.Query.Filters.TicketDocument();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Group }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Group createOrderRetrieveRQQueryFiltersGroup() {
        return new OrderRetrieveRQ.Query.Filters.Group();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Payments.Method.MaskedCardNumber }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Payments.Method.MaskedCardNumber createOrderRetrieveRQQueryFiltersPaymentsMethodMaskedCardNumber() {
        return new OrderRetrieveRQ.Query.Filters.Payments.Method.MaskedCardNumber();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Payments.Method.EffectiveExpireDate }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Payments.Method.EffectiveExpireDate createOrderRetrieveRQQueryFiltersPaymentsMethodEffectiveExpireDate() {
        return new OrderRetrieveRQ.Query.Filters.Payments.Method.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Payments.Method.CardHolderName }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Payments.Method.CardHolderName createOrderRetrieveRQQueryFiltersPaymentsMethodCardHolderName() {
        return new OrderRetrieveRQ.Query.Filters.Payments.Method.CardHolderName();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Passengers.ProfileID }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Passengers.ProfileID createOrderRetrieveRQQueryFiltersPassengersProfileID() {
        return new OrderRetrieveRQ.Query.Filters.Passengers.ProfileID();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo.FOID }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo.FOID createOrderRetrieveRQQueryFiltersPassengersPassengerIDInfoFOID() {
        return new OrderRetrieveRQ.Query.Filters.Passengers.PassengerIDInfo.FOID();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Passengers.Name.Surname }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Passengers.Name.Surname createOrderRetrieveRQQueryFiltersPassengersNameSurname() {
        return new OrderRetrieveRQ.Query.Filters.Passengers.Name.Surname();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Passengers.Name.Given }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Passengers.Name.Given createOrderRetrieveRQQueryFiltersPassengersNameGiven() {
        return new OrderRetrieveRQ.Query.Filters.Passengers.Name.Given();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Passengers.Name.Middle }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Passengers.Name.Middle createOrderRetrieveRQQueryFiltersPassengersNameMiddle() {
        return new OrderRetrieveRQ.Query.Filters.Passengers.Name.Middle();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival.AirportCode }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival.AirportCode createOrderRetrieveRQQueryFiltersFlightSegmentArrivalAirportCode() {
        return new OrderRetrieveRQ.Query.Filters.Flight.Segment.Arrival.AirportCode();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure.AirportCode }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure.AirportCode createOrderRetrieveRQQueryFiltersFlightSegmentDepartureAirportCode() {
        return new OrderRetrieveRQ.Query.Filters.Flight.Segment.Departure.AirportCode();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode createOrderRetrieveRQQueryFiltersFlightOriginDestinationArrivalAirportCode() {
        return new OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode();
    }

    /**
     * Create an instance of {@link OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode }
     * 
     */
    public OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode createOrderRetrieveRQQueryFiltersFlightOriginDestinationDepartureAirportCode() {
        return new OrderRetrieveRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response.Passengers }
     * 
     */
    public OrderViewRS.Response.Passengers createOrderViewRSResponsePassengers() {
        return new OrderViewRS.Response.Passengers();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response.Amendment.ActionType }
     * 
     */
    public OrderViewRS.Response.Amendment.ActionType createOrderViewRSResponseAmendmentActionType() {
        return new OrderViewRS.Response.Amendment.ActionType();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response.Amendment.TicketDocInfo.Passengers }
     * 
     */
    public OrderViewRS.Response.Amendment.TicketDocInfo.Passengers createOrderViewRSResponseAmendmentTicketDocInfoPassengers() {
        return new OrderViewRS.Response.Amendment.TicketDocInfo.Passengers();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response.Amendment.OfferItem.Passengers }
     * 
     */
    public OrderViewRS.Response.Amendment.OfferItem.Passengers createOrderViewRSResponseAmendmentOfferItemPassengers() {
        return new OrderViewRS.Response.Amendment.OfferItem.Passengers();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response.Amendment.OfferItem.OtherAssociation }
     * 
     */
    public OrderViewRS.Response.Amendment.OfferItem.OtherAssociation createOrderViewRSResponseAmendmentOfferItemOtherAssociation() {
        return new OrderViewRS.Response.Amendment.OfferItem.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response.Amendment.OfferItem.Services.Passengers }
     * 
     */
    public OrderViewRS.Response.Amendment.OfferItem.Services.Passengers createOrderViewRSResponseAmendmentOfferItemServicesPassengers() {
        return new OrderViewRS.Response.Amendment.OfferItem.Services.Passengers();
    }

    /**
     * Create an instance of {@link OrderViewRS.Response.Order.OrderItems }
     * 
     */
    public OrderViewRS.Response.Order.OrderItems createOrderViewRSResponseOrderOrderItems() {
        return new OrderViewRS.Response.Order.OrderItems();
    }

    /**
     * Create an instance of {@link OrderCreateRQ.Query.Passengers }
     * 
     */
    public OrderCreateRQ.Query.Passengers createOrderCreateRQQueryPassengers() {
        return new OrderCreateRQ.Query.Passengers();
    }

    /**
     * Create an instance of {@link OrderCreateRQ.Query.OrderItems }
     * 
     */
    public OrderCreateRQ.Query.OrderItems createOrderCreateRQQueryOrderItems() {
        return new OrderCreateRQ.Query.OrderItems();
    }

    /**
     * Create an instance of {@link OrderCreateRQ.Query.Promotion.Passengers }
     * 
     */
    public OrderCreateRQ.Query.Promotion.Passengers createOrderCreateRQQueryPromotionPassengers() {
        return new OrderCreateRQ.Query.Promotion.Passengers();
    }

    /**
     * Create an instance of {@link OrderListRS.Response.Order.Agency }
     * 
     */
    public OrderListRS.Response.Order.Agency createOrderListRSResponseOrderAgency() {
        return new OrderListRS.Response.Order.Agency();
    }

    /**
     * Create an instance of {@link OrderListRS.Response.Order.NbrInParty }
     * 
     */
    public OrderListRS.Response.Order.NbrInParty createOrderListRSResponseOrderNbrInParty() {
        return new OrderListRS.Response.Order.NbrInParty();
    }

    /**
     * Create an instance of {@link OrderListRS.Response.Order.TicketingStatus }
     * 
     */
    public OrderListRS.Response.Order.TicketingStatus createOrderListRSResponseOrderTicketingStatus() {
        return new OrderListRS.Response.Order.TicketingStatus();
    }

    /**
     * Create an instance of {@link OrderListRS.Response.Order.Status }
     * 
     */
    public OrderListRS.Response.Order.Status createOrderListRSResponseOrderStatus() {
        return new OrderListRS.Response.Order.Status();
    }

    /**
     * Create an instance of {@link OrderListRS.Response.Order.Passengers.FullName }
     * 
     */
    public OrderListRS.Response.Order.Passengers.FullName createOrderListRSResponseOrderPassengersFullName() {
        return new OrderListRS.Response.Order.Passengers.FullName();
    }

    /**
     * Create an instance of {@link OrderListRS.Response.Order.Arrival.AirportCode }
     * 
     */
    public OrderListRS.Response.Order.Arrival.AirportCode createOrderListRSResponseOrderArrivalAirportCode() {
        return new OrderListRS.Response.Order.Arrival.AirportCode();
    }

    /**
     * Create an instance of {@link OrderListRS.Response.Order.Departure.AirportCode }
     * 
     */
    public OrderListRS.Response.Order.Departure.AirportCode createOrderListRSResponseOrderDepartureAirportCode() {
        return new OrderListRS.Response.Order.Departure.AirportCode();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Agency }
     * 
     */
    public OrderListRQ.Query.Filters.Agency createOrderListRQQueryFiltersAgency() {
        return new OrderListRQ.Query.Filters.Agency();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Airline }
     * 
     */
    public OrderListRQ.Query.Filters.Airline createOrderListRQQueryFiltersAirline() {
        return new OrderListRQ.Query.Filters.Airline();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.CancelDateRange }
     * 
     */
    public OrderListRQ.Query.Filters.CancelDateRange createOrderListRQQueryFiltersCancelDateRange() {
        return new OrderListRQ.Query.Filters.CancelDateRange();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.CreateDateRange }
     * 
     */
    public OrderListRQ.Query.Filters.CreateDateRange createOrderListRQQueryFiltersCreateDateRange() {
        return new OrderListRQ.Query.Filters.CreateDateRange();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Group }
     * 
     */
    public OrderListRQ.Query.Filters.Group createOrderListRQQueryFiltersGroup() {
        return new OrderListRQ.Query.Filters.Group();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.TravelDateRange }
     * 
     */
    public OrderListRQ.Query.Filters.TravelDateRange createOrderListRQQueryFiltersTravelDateRange() {
        return new OrderListRQ.Query.Filters.TravelDateRange();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Service }
     * 
     */
    public OrderListRQ.Query.Filters.Service createOrderListRQQueryFiltersService() {
        return new OrderListRQ.Query.Filters.Service();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.TicketDocument.IssueDateRange }
     * 
     */
    public OrderListRQ.Query.Filters.TicketDocument.IssueDateRange createOrderListRQQueryFiltersTicketDocumentIssueDateRange() {
        return new OrderListRQ.Query.Filters.TicketDocument.IssueDateRange();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.TicketDocument.Status }
     * 
     */
    public OrderListRQ.Query.Filters.TicketDocument.Status createOrderListRQQueryFiltersTicketDocumentStatus() {
        return new OrderListRQ.Query.Filters.TicketDocument.Status();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Payments.Status }
     * 
     */
    public OrderListRQ.Query.Filters.Payments.Status createOrderListRQQueryFiltersPaymentsStatus() {
        return new OrderListRQ.Query.Filters.Payments.Status();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Payments.Method.MaskedCardNumber }
     * 
     */
    public OrderListRQ.Query.Filters.Payments.Method.MaskedCardNumber createOrderListRQQueryFiltersPaymentsMethodMaskedCardNumber() {
        return new OrderListRQ.Query.Filters.Payments.Method.MaskedCardNumber();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Payments.Method.EffectiveExpireDate }
     * 
     */
    public OrderListRQ.Query.Filters.Payments.Method.EffectiveExpireDate createOrderListRQQueryFiltersPaymentsMethodEffectiveExpireDate() {
        return new OrderListRQ.Query.Filters.Payments.Method.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Payments.Method.CardHolderName }
     * 
     */
    public OrderListRQ.Query.Filters.Payments.Method.CardHolderName createOrderListRQQueryFiltersPaymentsMethodCardHolderName() {
        return new OrderListRQ.Query.Filters.Payments.Method.CardHolderName();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Passengers.ProfileID }
     * 
     */
    public OrderListRQ.Query.Filters.Passengers.ProfileID createOrderListRQQueryFiltersPassengersProfileID() {
        return new OrderListRQ.Query.Filters.Passengers.ProfileID();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Passengers.FOID }
     * 
     */
    public OrderListRQ.Query.Filters.Passengers.FOID createOrderListRQQueryFiltersPassengersFOID() {
        return new OrderListRQ.Query.Filters.Passengers.FOID();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Passengers.PhoneNbrValue }
     * 
     */
    public OrderListRQ.Query.Filters.Passengers.PhoneNbrValue createOrderListRQQueryFiltersPassengersPhoneNbrValue() {
        return new OrderListRQ.Query.Filters.Passengers.PhoneNbrValue();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Passengers.Name.Surname }
     * 
     */
    public OrderListRQ.Query.Filters.Passengers.Name.Surname createOrderListRQQueryFiltersPassengersNameSurname() {
        return new OrderListRQ.Query.Filters.Passengers.Name.Surname();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Passengers.Name.Given }
     * 
     */
    public OrderListRQ.Query.Filters.Passengers.Name.Given createOrderListRQQueryFiltersPassengersNameGiven() {
        return new OrderListRQ.Query.Filters.Passengers.Name.Given();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Passengers.Name.Middle }
     * 
     */
    public OrderListRQ.Query.Filters.Passengers.Name.Middle createOrderListRQQueryFiltersPassengersNameMiddle() {
        return new OrderListRQ.Query.Filters.Passengers.Name.Middle();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.Segment.Arrival.AirportCode }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.Segment.Arrival.AirportCode createOrderListRQQueryFiltersFlightSegmentArrivalAirportCode() {
        return new OrderListRQ.Query.Filters.Flight.Segment.Arrival.AirportCode();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.Segment.Departure.AirportCode }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.Segment.Departure.AirportCode createOrderListRQQueryFiltersFlightSegmentDepartureAirportCode() {
        return new OrderListRQ.Query.Filters.Flight.Segment.Departure.AirportCode();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode createOrderListRQQueryFiltersFlightOriginDestinationArrivalAirportCode() {
        return new OrderListRQ.Query.Filters.Flight.OriginDestination.Arrival.AirportCode();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode createOrderListRQQueryFiltersFlightOriginDestinationDepartureAirportCode() {
        return new OrderListRQ.Query.Filters.Flight.OriginDestination.Departure.AirportCode();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.Departure.AirportCode }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.Departure.AirportCode createOrderListRQQueryFiltersFlightDepartureAirportCode() {
        return new OrderListRQ.Query.Filters.Flight.Departure.AirportCode();
    }

    /**
     * Create an instance of {@link OrderListRQ.Query.Filters.Flight.Arrival.AirportCode }
     * 
     */
    public OrderListRQ.Query.Filters.Flight.Arrival.AirportCode createOrderListRQQueryFiltersFlightArrivalAirportCode() {
        return new OrderListRQ.Query.Filters.Flight.Arrival.AirportCode();
    }

    /**
     * Create an instance of {@link OrdChangeMetadataType.OtherMetadata }
     * 
     */
    public OrdChangeMetadataType.OtherMetadata createOrdChangeMetadataTypeOtherMetadata() {
        return new OrdChangeMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link OrderChangeRQ.Query.Order }
     * 
     */
    public OrderChangeRQ.Query.Order createOrderChangeRQQueryOrder() {
        return new OrderChangeRQ.Query.Order();
    }

    /**
     * Create an instance of {@link OrderChangeRQ.Query.Payment.ActionType }
     * 
     */
    public OrderChangeRQ.Query.Payment.ActionType createOrderChangeRQQueryPaymentActionType() {
        return new OrderChangeRQ.Query.Payment.ActionType();
    }

    /**
     * Create an instance of {@link OrderChangeRQ.Query.Passengers.Group.ActionType }
     * 
     */
    public OrderChangeRQ.Query.Passengers.Group.ActionType createOrderChangeRQQueryPassengersGroupActionType() {
        return new OrderChangeRQ.Query.Passengers.Group.ActionType();
    }

    /**
     * Create an instance of {@link OrderChangeRQ.Query.Passengers.Passenger.ActionType }
     * 
     */
    public OrderChangeRQ.Query.Passengers.Passenger.ActionType createOrderChangeRQQueryPassengersPassengerActionType() {
        return new OrderChangeRQ.Query.Passengers.Passenger.ActionType();
    }

    /**
     * Create an instance of {@link OrderChangeRQ.Query.Passengers.Passenger.AdditionalRoles }
     * 
     */
    public OrderChangeRQ.Query.Passengers.Passenger.AdditionalRoles createOrderChangeRQQueryPassengersPassengerAdditionalRoles() {
        return new OrderChangeRQ.Query.Passengers.Passenger.AdditionalRoles();
    }

    /**
     * Create an instance of {@link OrderCancelRS.Response.ChangeFees }
     * 
     */
    public OrderCancelRS.Response.ChangeFees createOrderCancelRSResponseChangeFees() {
        return new OrderCancelRS.Response.ChangeFees();
    }

    /**
     * Create an instance of {@link OrderCancelRS.Response.TicketDocInfo.OriginDestination }
     * 
     */
    public OrderCancelRS.Response.TicketDocInfo.OriginDestination createOrderCancelRSResponseTicketDocInfoOriginDestination() {
        return new OrderCancelRS.Response.TicketDocInfo.OriginDestination();
    }

    /**
     * Create an instance of {@link OrderCancelRS.Response.TicketDocInfo.FareInfo.Taxes }
     * 
     */
    public OrderCancelRS.Response.TicketDocInfo.FareInfo.Taxes createOrderCancelRSResponseTicketDocInfoFareInfoTaxes() {
        return new OrderCancelRS.Response.TicketDocInfo.FareInfo.Taxes();
    }

    /**
     * Create an instance of {@link ItinReshopMetadataType.OtherMetadata }
     * 
     */
    public ItinReshopMetadataType.OtherMetadata createItinReshopMetadataTypeOtherMetadata() {
        return new ItinReshopMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.Order }
     * 
     */
    public ItinReshopRS.Response.Order createItinReshopRSResponseOrder() {
        return new ItinReshopRS.Response.Order();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.Commission.ActionType }
     * 
     */
    public ItinReshopRS.Response.Commission.ActionType createItinReshopRSResponseCommissionActionType() {
        return new ItinReshopRS.Response.Commission.ActionType();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.TicketDocInfo.ActionType }
     * 
     */
    public ItinReshopRS.Response.TicketDocInfo.ActionType createItinReshopRSResponseTicketDocInfoActionType() {
        return new ItinReshopRS.Response.TicketDocInfo.ActionType();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.Payment.ActionType }
     * 
     */
    public ItinReshopRS.Response.Payment.ActionType createItinReshopRSResponsePaymentActionType() {
        return new ItinReshopRS.Response.Payment.ActionType();
    }

    /**
     * Create an instance of {@link PaymentMethodType.Method.Promotion }
     * 
     */
    public PaymentMethodType.Method.Promotion createPaymentMethodTypeMethodPromotion() {
        return new PaymentMethodType.Method.Promotion();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.OriginalOrder }
     * 
     */
    public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.OriginalOrder createItinReshopRSResponseReShopOfferReshopDifferentialOriginalOrder() {
        return new ItinReshopRS.Response.ReShopOffer.ReshopDifferential.OriginalOrder();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.NewOffer }
     * 
     */
    public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.NewOffer createItinReshopRSResponseReShopOfferReshopDifferentialNewOffer() {
        return new ItinReshopRS.Response.ReShopOffer.ReshopDifferential.NewOffer();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.PenaltyAmount }
     * 
     */
    public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.PenaltyAmount createItinReshopRSResponseReShopOfferReshopDifferentialPenaltyAmount() {
        return new ItinReshopRS.Response.ReShopOffer.ReshopDifferential.PenaltyAmount();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.FeesAmount }
     * 
     */
    public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.FeesAmount createItinReshopRSResponseReShopOfferReshopDifferentialFeesAmount() {
        return new ItinReshopRS.Response.ReShopOffer.ReshopDifferential.FeesAmount();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByPassenger }
     * 
     */
    public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByPassenger createItinReshopRSResponseReShopOfferReshopDifferentialReshopDueByPassenger() {
        return new ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByPassenger();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByAirline }
     * 
     */
    public ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByAirline createItinReshopRSResponseReShopOfferReshopDifferentialReshopDueByAirline() {
        return new ItinReshopRS.Response.ReShopOffer.ReshopDifferential.ReshopDue.ByAirline();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.Passengers.Group.ActionType }
     * 
     */
    public ItinReshopRS.Response.Passengers.Group.ActionType createItinReshopRSResponsePassengersGroupActionType() {
        return new ItinReshopRS.Response.Passengers.Group.ActionType();
    }

    /**
     * Create an instance of {@link ItinReshopRS.Response.Passengers.Passenger.ActionType }
     * 
     */
    public ItinReshopRS.Response.Passengers.Passenger.ActionType createItinReshopRSResponsePassengersPassengerActionType() {
        return new ItinReshopRS.Response.Passengers.Passenger.ActionType();
    }

    /**
     * Create an instance of {@link ItinReshopRQ.Query.Actions.ActionType }
     * 
     */
    public ItinReshopRQ.Query.Actions.ActionType createItinReshopRQQueryActionsActionType() {
        return new ItinReshopRQ.Query.Actions.ActionType();
    }

    /**
     * Create an instance of {@link ItinReshopRQ.Query.Actions.OrderItems }
     * 
     */
    public ItinReshopRQ.Query.Actions.OrderItems createItinReshopRQQueryActionsOrderItems() {
        return new ItinReshopRQ.Query.Actions.OrderItems();
    }

    /**
     * Create an instance of {@link ItinReshopRQ.Query.Actions.Passengers }
     * 
     */
    public ItinReshopRQ.Query.Actions.Passengers createItinReshopRQQueryActionsPassengers() {
        return new ItinReshopRQ.Query.Actions.Passengers();
    }

    /**
     * Create an instance of {@link ItinReshopRQ.Query.Actions.Qualifier }
     * 
     */
    public ItinReshopRQ.Query.Actions.Qualifier createItinReshopRQQueryActionsQualifier() {
        return new ItinReshopRQ.Query.Actions.Qualifier();
    }

    /**
     * Create an instance of {@link ItinReshopRQ.Query.Actions.Preference }
     * 
     */
    public ItinReshopRQ.Query.Actions.Preference createItinReshopRQQueryActionsPreference() {
        return new ItinReshopRQ.Query.Actions.Preference();
    }

    /**
     * Create an instance of {@link ItinReshopRQ.Query.Actions.OfferItemSet }
     * 
     */
    public ItinReshopRQ.Query.Actions.OfferItemSet createItinReshopRQQueryActionsOfferItemSet() {
        return new ItinReshopRQ.Query.Actions.OfferItemSet();
    }

    /**
     * Create an instance of {@link ItinReshopRQ.Query.RepriceOnly.OrderItems }
     * 
     */
    public ItinReshopRQ.Query.RepriceOnly.OrderItems createItinReshopRQQueryRepriceOnlyOrderItems() {
        return new ItinReshopRQ.Query.RepriceOnly.OrderItems();
    }

    /**
     * Create an instance of {@link ItinReshopParamsType.Alerts }
     * 
     */
    public ItinReshopParamsType.Alerts createItinReshopParamsTypeAlerts() {
        return new ItinReshopParamsType.Alerts();
    }

    /**
     * Create an instance of {@link ItinReshopParamsType.Notices.PricingParameters }
     * 
     */
    public ItinReshopParamsType.Notices.PricingParameters createItinReshopParamsTypeNoticesPricingParameters() {
        return new ItinReshopParamsType.Notices.PricingParameters();
    }

    /**
     * Create an instance of {@link OfferTimeLimitSetType.OfferExpiration }
     * 
     */
    public OfferTimeLimitSetType.OfferExpiration createOfferTimeLimitSetTypeOfferExpiration() {
        return new OfferTimeLimitSetType.OfferExpiration();
    }

    /**
     * Create an instance of {@link OfferTimeLimitSetType.OtherLimit }
     * 
     */
    public OfferTimeLimitSetType.OtherLimit createOfferTimeLimitSetTypeOtherLimit() {
        return new OfferTimeLimitSetType.OtherLimit();
    }

    /**
     * Create an instance of {@link DataListType.DescriptionList }
     * 
     */
    public DataListType.DescriptionList createDataListTypeDescriptionList() {
        return new DataListType.DescriptionList();
    }

    /**
     * Create an instance of {@link DataListType.Flight.Settlement }
     * 
     */
    public DataListType.Flight.Settlement createDataListTypeFlightSettlement() {
        return new DataListType.Flight.Settlement();
    }

    /**
     * Create an instance of {@link FlightPriceRS.AirlineOffer }
     * 
     */
    public FlightPriceRS.AirlineOffer createFlightPriceRSAirlineOffer() {
        return new FlightPriceRS.AirlineOffer();
    }

    /**
     * Create an instance of {@link FltPriceResParamsType.Pricing.FeeExemption.Fee.Code }
     * 
     */
    public FltPriceResParamsType.Pricing.FeeExemption.Fee.Code createFltPriceResParamsTypePricingFeeExemptionFeeCode() {
        return new FltPriceResParamsType.Pricing.FeeExemption.Fee.Code();
    }

    /**
     * Create an instance of {@link TicketAutoExchangeType.Penalty }
     * 
     */
    public TicketAutoExchangeType.Penalty createTicketAutoExchangeTypePenalty() {
        return new TicketAutoExchangeType.Penalty();
    }

    /**
     * Create an instance of {@link TicketAutoExchangeType.TicketNumber }
     * 
     */
    public TicketAutoExchangeType.TicketNumber createTicketAutoExchangeTypeTicketNumber() {
        return new TicketAutoExchangeType.TicketNumber();
    }

    /**
     * Create an instance of {@link FlightPriceRQ.Query.OriginDestination }
     * 
     */
    public FlightPriceRQ.Query.OriginDestination createFlightPriceRQQueryOriginDestination() {
        return new FlightPriceRQ.Query.OriginDestination();
    }

    /**
     * Create an instance of {@link FltPriceReqParamsType.ServiceFilters }
     * 
     */
    public FltPriceReqParamsType.ServiceFilters createFltPriceReqParamsTypeServiceFilters() {
        return new FltPriceReqParamsType.ServiceFilters();
    }

    /**
     * Create an instance of {@link FltPriceReqParamsType.Pricing.FeeExemption.Fee.Code }
     * 
     */
    public FltPriceReqParamsType.Pricing.FeeExemption.Fee.Code createFltPriceReqParamsTypePricingFeeExemptionFeeCode() {
        return new FltPriceReqParamsType.Pricing.FeeExemption.Fee.Code();
    }

    /**
     * Create an instance of {@link AirShopResMetadataType.Shopping }
     * 
     */
    public AirShopResMetadataType.Shopping createAirShopResMetadataTypeShopping() {
        return new AirShopResMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link AirShopResMetadataType.Traveler }
     * 
     */
    public AirShopResMetadataType.Traveler createAirShopResMetadataTypeTraveler() {
        return new AirShopResMetadataType.Traveler();
    }

    /**
     * Create an instance of {@link AirShopResMetadataType.OtherMetadata }
     * 
     */
    public AirShopResMetadataType.OtherMetadata createAirShopResMetadataTypeOtherMetadata() {
        return new AirShopResMetadataType.OtherMetadata();
    }

    /**
     * Create an instance of {@link AirShoppingRS.OffersGroup.AirlineOffers.AirlineOffer }
     * 
     */
    public AirShoppingRS.OffersGroup.AirlineOffers.AirlineOffer createAirShoppingRSOffersGroupAirlineOffer() {
        return new AirShoppingRS.OffersGroup.AirlineOffers.AirlineOffer();
    }

    /**
     * Create an instance of {@link AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PriceCalendarDate }
     * 
     */
    public AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PriceCalendarDate createAirShoppingRSOffersGroupAirlineOffersPriceCalendarPriceCalendarDate() {
        return new AirShoppingRS.OffersGroup.AirlineOffers.PriceCalendar.PriceCalendarDate();
    }

    /**
     * Create an instance of {@link AirShopFlightSpecificType.FlightSegment }
     * 
     */
    public AirShopFlightSpecificType.FlightSegment createAirShopFlightSpecificTypeFlightSegment() {
        return new AirShopFlightSpecificType.FlightSegment();
    }

    /**
     * Create an instance of {@link AirShopFlightSpecificType.Flight }
     * 
     */
    public AirShopFlightSpecificType.Flight createAirShopFlightSpecificTypeFlight() {
        return new AirShopFlightSpecificType.Flight();
    }

    /**
     * Create an instance of {@link AirShopReqAttributeQueryTypeOriginDestination.CalendarDates }
     * 
     */
    public AirShopReqAttributeQueryTypeOriginDestination.CalendarDates createAirShopReqAttributeQueryTypeOriginDestinationCalendarDates() {
        return new AirShopReqAttributeQueryTypeOriginDestination.CalendarDates();
    }

    /**
     * Create an instance of {@link AirShopReqAffinityQueryType.OriginDestination }
     * 
     */
    public AirShopReqAffinityQueryType.OriginDestination createAirShopReqAffinityQueryTypeOriginDestination() {
        return new AirShopReqAffinityQueryType.OriginDestination();
    }

    /**
     * Create an instance of {@link AirShopReqAffinityQueryType.Budget }
     * 
     */
    public AirShopReqAffinityQueryType.Budget createAirShopReqAffinityQueryTypeBudget() {
        return new AirShopReqAffinityQueryType.Budget();
    }

    /**
     * Create an instance of {@link AirShopReqAffinityQueryType.KeywordPreference }
     * 
     */
    public AirShopReqAffinityQueryType.KeywordPreference createAirShopReqAffinityQueryTypeKeywordPreference() {
        return new AirShopReqAffinityQueryType.KeywordPreference();
    }

    /**
     * Create an instance of {@link AirShopReqParamsType.Inventory }
     * 
     */
    public AirShopReqParamsType.Inventory createAirShopReqParamsTypeInventory() {
        return new AirShopReqParamsType.Inventory();
    }

    /**
     * Create an instance of {@link AirShopReqParamsType.ServiceFilters }
     * 
     */
    public AirShopReqParamsType.ServiceFilters createAirShopReqParamsTypeServiceFilters() {
        return new AirShopReqParamsType.ServiceFilters();
    }

    /**
     * Create an instance of {@link AirShopReqParamsType.Group }
     * 
     */
    public AirShopReqParamsType.Group createAirShopReqParamsTypeGroup() {
        return new AirShopReqParamsType.Group();
    }

    /**
     * Create an instance of {@link AirShopReqParamsType.Pricing.FeeExemption.Fee.Code }
     * 
     */
    public AirShopReqParamsType.Pricing.FeeExemption.Fee.Code createAirShopReqParamsTypePricingFeeExemptionFeeCode() {
        return new AirShopReqParamsType.Pricing.FeeExemption.Fee.Code();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Pricing }
     * 
     */
    public TransferPreferencesType.Pricing createTransferPreferencesTypePricing() {
        return new TransferPreferencesType.Pricing();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Connection.Interline }
     * 
     */
    public TransferPreferencesType.Connection.Interline createTransferPreferencesTypeConnectionInterline() {
        return new TransferPreferencesType.Connection.Interline();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Connection.Code }
     * 
     */
    public TransferPreferencesType.Connection.Code createTransferPreferencesTypeConnectionCode() {
        return new TransferPreferencesType.Connection.Code();
    }

    /**
     * Create an instance of {@link FltSegmentMaxTimePreferencesType.MaxFlightTime }
     * 
     */
    public FltSegmentMaxTimePreferencesType.MaxFlightTime createFltSegmentMaxTimePreferencesTypeMaxFlightTime() {
        return new FltSegmentMaxTimePreferencesType.MaxFlightTime();
    }

    /**
     * Create an instance of {@link FarePreferencesType.Exclusion }
     * 
     */
    public FarePreferencesType.Exclusion createFarePreferencesTypeExclusion() {
        return new FarePreferencesType.Exclusion();
    }

    /**
     * Create an instance of {@link FarePreferencesType.TicketDesigs.TicketDesig }
     * 
     */
    public FarePreferencesType.TicketDesigs.TicketDesig createFarePreferencesTypeTicketDesigsTicketDesig() {
        return new FarePreferencesType.TicketDesigs.TicketDesig();
    }

    /**
     * Create an instance of {@link FarePreferencesType.FareCodes.Code }
     * 
     */
    public FarePreferencesType.FareCodes.Code createFarePreferencesTypeFareCode() {
        return new FarePreferencesType.FareCodes.Code();
    }

    /**
     * Create an instance of {@link FarePreferencesType.Type }
     * 
     */
    public FarePreferencesType.Type createFarePreferencesTypeType() {
        return new FarePreferencesType.Type();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.WaitListing.WaitListPreferences }
     * 
     */
    public FlightPreferencesType.WaitListing.WaitListPreferences createFlightPreferencesTypeWaitListingWaitListPreferences() {
        return new FlightPreferencesType.WaitListing.WaitListPreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.NonStopPreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.NonStopPreferences createFlightPreferencesTypeCharacteristicNonStopPreferences() {
        return new FlightPreferencesType.Characteristic.NonStopPreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.DirectPreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.DirectPreferences createFlightPreferencesTypeCharacteristicDirectPreferences() {
        return new FlightPreferencesType.Characteristic.DirectPreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.OvernightStopPreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.OvernightStopPreferences createFlightPreferencesTypeCharacteristicOvernightStopPreferences() {
        return new FlightPreferencesType.Characteristic.OvernightStopPreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.AirportChangePreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.AirportChangePreferences createFlightPreferencesTypeCharacteristicAirportChangePreferences() {
        return new FlightPreferencesType.Characteristic.AirportChangePreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.RedEyePreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.RedEyePreferences createFlightPreferencesTypeCharacteristicRedEyePreferences() {
        return new FlightPreferencesType.Characteristic.RedEyePreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Equipment }
     * 
     */
    public FlightPreferencesType.Aircraft.Equipment createFlightPreferencesTypeAircraftEquipment() {
        return new FlightPreferencesType.Aircraft.Equipment();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Rows.Feature }
     * 
     */
    public FlightPreferencesType.Aircraft.Rows.Feature createFlightPreferencesTypeAircraftRowsFeature() {
        return new FlightPreferencesType.Aircraft.Rows.Feature();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Rows.Number }
     * 
     */
    public FlightPreferencesType.Aircraft.Rows.Number createFlightPreferencesTypeAircraftRowsNumber() {
        return new FlightPreferencesType.Aircraft.Rows.Number();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Seats.Characteristic }
     * 
     */
    public FlightPreferencesType.Aircraft.Seats.Characteristic createFlightPreferencesTypeAircraftSeatsCharacteristic() {
        return new FlightPreferencesType.Aircraft.Seats.Characteristic();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Seats.Position }
     * 
     */
    public FlightPreferencesType.Aircraft.Seats.Position createFlightPreferencesTypeAircraftSeatsPosition() {
        return new FlightPreferencesType.Aircraft.Seats.Position();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Classes.Class }
     * 
     */
    public FlightPreferencesType.Aircraft.Classes.Class createFlightPreferencesTypeAircraftClassesClass() {
        return new FlightPreferencesType.Aircraft.Classes.Class();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Cabins.Cabin }
     * 
     */
    public FlightPreferencesType.Aircraft.Cabins.Cabin createFlightPreferencesTypeAircraftCabinsCabin() {
        return new FlightPreferencesType.Aircraft.Cabins.Cabin();
    }

    /**
     * Create an instance of {@link AlliancePreferencesType.Alliance }
     * 
     */
    public AlliancePreferencesType.Alliance createAlliancePreferencesTypeAlliance() {
        return new AlliancePreferencesType.Alliance();
    }

    /**
     * Create an instance of {@link AirlinePreferencesType.Airline }
     * 
     */
    public AirlinePreferencesType.Airline createAirlinePreferencesTypeAirline() {
        return new AirlinePreferencesType.Airline();
    }

    /**
     * Create an instance of {@link PersonBudgetType.Amount }
     * 
     */
    public PersonBudgetType.Amount createPersonBudgetTypeAmount() {
        return new PersonBudgetType.Amount();
    }

    /**
     * Create an instance of {@link GroupBudgetType.Amount }
     * 
     */
    public GroupBudgetType.Amount createGroupBudgetTypeAmount() {
        return new GroupBudgetType.Amount();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName createPrePaidProgramQualifierPrepaidProgramDetailProgramName() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.Holder }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.Holder createPrePaidProgramQualifierPrepaidProgramDetailHolder() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.Holder();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number createPrePaidProgramQualifierPrepaidProgramDetailCertificateNumber() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod createPrePaidProgramQualifierPrepaidProgramDetailCertificateEffectivePeriod() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod();
    }

    /**
     * Create an instance of {@link DiscountProgramType.Account }
     * 
     */
    public DiscountProgramType.Account createDiscountProgramTypeAccount() {
        return new DiscountProgramType.Account();
    }

    /**
     * Create an instance of {@link DiscountProgramType.AssocCode }
     * 
     */
    public DiscountProgramType.AssocCode createDiscountProgramTypeAssocCode() {
        return new DiscountProgramType.AssocCode();
    }

    /**
     * Create an instance of {@link DiscountProgramType.Name }
     * 
     */
    public DiscountProgramType.Name createDiscountProgramTypeName() {
        return new DiscountProgramType.Name();
    }

    /**
     * Create an instance of {@link FltArriveQualifiedQueryType.LocationCode }
     * 
     */
    public FltArriveQualifiedQueryType.LocationCode createFltArriveQualifiedQueryTypeLocationCode() {
        return new FltArriveQualifiedQueryType.LocationCode();
    }

    /**
     * Create an instance of {@link FltDepartQualifiedQueryType.LocationCode }
     * 
     */
    public FltDepartQualifiedQueryType.LocationCode createFltDepartQualifiedQueryTypeLocationCode() {
        return new FltDepartQualifiedQueryType.LocationCode();
    }

    /**
     * Create an instance of {@link ServiceCouponType.CouponType }
     * 
     */
    public ServiceCouponType.CouponType createServiceCouponTypeCouponType() {
        return new ServiceCouponType.CouponType();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.Location }
     * 
     */
    public ServiceFulfillmentType.Location createServiceFulfillmentTypeLocation() {
        return new ServiceFulfillmentType.Location();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.OfferValidDates.Start }
     * 
     */
    public ServiceFulfillmentType.OfferValidDates.Start createServiceFulfillmentTypeOfferValidDatesStart() {
        return new ServiceFulfillmentType.OfferValidDates.Start();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.OfferValidDates.End }
     * 
     */
    public ServiceFulfillmentType.OfferValidDates.End createServiceFulfillmentTypeOfferValidDatesEnd() {
        return new ServiceFulfillmentType.OfferValidDates.End();
    }

    /**
     * Create an instance of {@link ServicePriceType.RefundableValue }
     * 
     */
    public ServicePriceType.RefundableValue createServicePriceTypeRefundableValue() {
        return new ServicePriceType.RefundableValue();
    }

    /**
     * Create an instance of {@link ServicePriceType.Details.SubTotal }
     * 
     */
    public ServicePriceType.Details.SubTotal createServicePriceTypeDetailsSubTotal() {
        return new ServicePriceType.Details.SubTotal();
    }

    /**
     * Create an instance of {@link ServicePriceType.Details.Detail }
     * 
     */
    public ServicePriceType.Details.Detail createServicePriceTypeDetail() {
        return new ServicePriceType.Details.Detail();
    }

    /**
     * Create an instance of {@link SeatDataType.Marketing }
     * 
     */
    public SeatDataType.Marketing createSeatDataTypeMarketing() {
        return new SeatDataType.Marketing();
    }

    /**
     * Create an instance of {@link SeatComponentType.Dimensions.ActualSize }
     * 
     */
    public SeatComponentType.Dimensions.ActualSize createSeatComponentTypeDimensionsActualSize() {
        return new SeatComponentType.Dimensions.ActualSize();
    }

    /**
     * Create an instance of {@link SeatComponentType.Location.Row }
     * 
     */
    public SeatComponentType.Location.Row createSeatComponentTypeLocationRow() {
        return new SeatComponentType.Location.Row();
    }

    /**
     * Create an instance of {@link SeatComponentType.Location.Column }
     * 
     */
    public SeatComponentType.Location.Column createSeatComponentTypeLocationColumn() {
        return new SeatComponentType.Location.Column();
    }

    /**
     * Create an instance of {@link SeatComponentType.Location.Space.RowRange }
     * 
     */
    public SeatComponentType.Location.Space.RowRange createSeatComponentTypeLocationSpaceRowRange() {
        return new SeatComponentType.Location.Space.RowRange();
    }

    /**
     * Create an instance of {@link SeatComponentType.Location.Space.ColumnRange }
     * 
     */
    public SeatComponentType.Location.Space.ColumnRange createSeatComponentTypeLocationSpaceColumnRange() {
        return new SeatComponentType.Location.Space.ColumnRange();
    }

    /**
     * Create an instance of {@link WingPositionType.Rows }
     * 
     */
    public WingPositionType.Rows createWingPositionTypeRows() {
        return new WingPositionType.Rows();
    }

    /**
     * Create an instance of {@link ExitPositionType.Rows.First }
     * 
     */
    public ExitPositionType.Rows.First createExitPositionTypeRowsFirst() {
        return new ExitPositionType.Rows.First();
    }

    /**
     * Create an instance of {@link ExitPositionType.Rows.Last }
     * 
     */
    public ExitPositionType.Rows.Last createExitPositionTypeRowsLast() {
        return new ExitPositionType.Rows.Last();
    }

    /**
     * Create an instance of {@link TotalFareTransactionType.Amount }
     * 
     */
    public TotalFareTransactionType.Amount createTotalFareTransactionTypeAmount() {
        return new TotalFareTransactionType.Amount();
    }

    /**
     * Create an instance of {@link ETFareInfoType.Waiver }
     * 
     */
    public ETFareInfoType.Waiver createETFareInfoTypeWaiver() {
        return new ETFareInfoType.Waiver();
    }

    /**
     * Create an instance of {@link ETFareInfoType.RuleInd }
     * 
     */
    public ETFareInfoType.RuleInd createETFareInfoTypeRuleInd() {
        return new ETFareInfoType.RuleInd();
    }

    /**
     * Create an instance of {@link ETFareInfoType.Detail }
     * 
     */
    public ETFareInfoType.Detail createETFareInfoTypeDetail() {
        return new ETFareInfoType.Detail();
    }

    /**
     * Create an instance of {@link EquivFareTransactionType.Amount }
     * 
     */
    public EquivFareTransactionType.Amount createEquivFareTransactionTypeAmount() {
        return new EquivFareTransactionType.Amount();
    }

    /**
     * Create an instance of {@link BaseFareTransactionType.Amount }
     * 
     */
    public BaseFareTransactionType.Amount createBaseFareTransactionTypeAmount() {
        return new BaseFareTransactionType.Amount();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.AllowableBag }
     * 
     */
    public AddlBaggageInfoType.AllowableBag createAddlBaggageInfoTypeAllowableBag() {
        return new AddlBaggageInfoType.AllowableBag();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.BagCharge }
     * 
     */
    public AddlBaggageInfoType.BagCharge createAddlBaggageInfoTypeBagCharge() {
        return new AddlBaggageInfoType.BagCharge();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CarryOnAllowableBag }
     * 
     */
    public AddlBaggageInfoType.CarryOnAllowableBag createAddlBaggageInfoTypeCarryOnAllowableBag() {
        return new AddlBaggageInfoType.CarryOnAllowableBag();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CarryOnFree }
     * 
     */
    public AddlBaggageInfoType.CarryOnFree createAddlBaggageInfoTypeCarryOnFree() {
        return new AddlBaggageInfoType.CarryOnFree();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CheckedFree }
     * 
     */
    public AddlBaggageInfoType.CheckedFree createAddlBaggageInfoTypeCheckedFree() {
        return new AddlBaggageInfoType.CheckedFree();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CheckedChargeableBag.Embargo }
     * 
     */
    public AddlBaggageInfoType.CheckedChargeableBag.Embargo createAddlBaggageInfoTypeCheckedChargeableBagEmbargo() {
        return new AddlBaggageInfoType.CheckedChargeableBag.Embargo();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CarryOnChargeableBag.Embargo }
     * 
     */
    public AddlBaggageInfoType.CarryOnChargeableBag.Embargo createAddlBaggageInfoTypeCarryOnChargeableBagEmbargo() {
        return new AddlBaggageInfoType.CarryOnChargeableBag.Embargo();
    }

    /**
     * Create an instance of {@link CouponEffectiveType.EffectiveDatePeriod }
     * 
     */
    public CouponEffectiveType.EffectiveDatePeriod createCouponEffectiveTypeEffectiveDatePeriod() {
        return new CouponEffectiveType.EffectiveDatePeriod();
    }

    /**
     * Create an instance of {@link CouponEffectiveType.EffectiveDateTimePeriod }
     * 
     */
    public CouponEffectiveType.EffectiveDateTimePeriod createCouponEffectiveTypeEffectiveDateTimePeriod() {
        return new CouponEffectiveType.EffectiveDateTimePeriod();
    }

    /**
     * Create an instance of {@link CouponInfoType.SoldAirlineInfo }
     * 
     */
    public CouponInfoType.SoldAirlineInfo createCouponInfoTypeSoldAirlineInfo() {
        return new CouponInfoType.SoldAirlineInfo();
    }

    /**
     * Create an instance of {@link CouponInfoType.PresentInfo }
     * 
     */
    public CouponInfoType.PresentInfo createCouponInfoTypePresentInfo() {
        return new CouponInfoType.PresentInfo();
    }

    /**
     * Create an instance of {@link CouponInfoType.ReasonForIssuance }
     * 
     */
    public CouponInfoType.ReasonForIssuance createCouponInfoTypeReasonForIssuance() {
        return new CouponInfoType.ReasonForIssuance();
    }

    /**
     * Create an instance of {@link CouponInfoType.FiledFeeInfo }
     * 
     */
    public CouponInfoType.FiledFeeInfo createCouponInfoTypeFiledFeeInfo() {
        return new CouponInfoType.FiledFeeInfo();
    }

    /**
     * Create an instance of {@link CouponInfoType.ProductCharacteristic }
     * 
     */
    public CouponInfoType.ProductCharacteristic createCouponInfoTypeProductCharacteristic() {
        return new CouponInfoType.ProductCharacteristic();
    }

    /**
     * Create an instance of {@link CouponInfoType.AdditionalServicesInfo }
     * 
     */
    public CouponInfoType.AdditionalServicesInfo createCouponInfoTypeAdditionalServicesInfo() {
        return new CouponInfoType.AdditionalServicesInfo();
    }

    /**
     * Create an instance of {@link CouponInfoType.ExcessBaggage }
     * 
     */
    public CouponInfoType.ExcessBaggage createCouponInfoTypeExcessBaggage() {
        return new CouponInfoType.ExcessBaggage();
    }

    /**
     * Create an instance of {@link CouponInfoType.ResAirlineDesig }
     * 
     */
    public CouponInfoType.ResAirlineDesig createCouponInfoTypeResAirlineDesig() {
        return new CouponInfoType.ResAirlineDesig();
    }

    /**
     * Create an instance of {@link CouponInfoType.ResDesigAirportCityCode }
     * 
     */
    public CouponInfoType.ResDesigAirportCityCode createCouponInfoTypeResDesigAirportCityCode() {
        return new CouponInfoType.ResDesigAirportCityCode();
    }

    /**
     * Create an instance of {@link CouponInfoType.ResFlightDepartureTime }
     * 
     */
    public CouponInfoType.ResFlightDepartureTime createCouponInfoTypeResFlightDepartureTime() {
        return new CouponInfoType.ResFlightDepartureTime();
    }

    /**
     * Create an instance of {@link CouponInfoType.ResFlightNumber }
     * 
     */
    public CouponInfoType.ResFlightNumber createCouponInfoTypeResFlightNumber() {
        return new CouponInfoType.ResFlightNumber();
    }

    /**
     * Create an instance of {@link CouponInfoType.ResOriginAirportCityCode }
     * 
     */
    public CouponInfoType.ResOriginAirportCityCode createCouponInfoTypeResOriginAirportCityCode() {
        return new CouponInfoType.ResOriginAirportCityCode();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.Taxes }
     * 
     */
    public CarrierFeeInfoType.Taxes createCarrierFeeInfoTypeTaxes() {
        return new CarrierFeeInfoType.Taxes();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.Fee.FeeAmount }
     * 
     */
    public CarrierFeeInfoType.Fee.FeeAmount createCarrierFeeInfoTypeFeeFeeAmount() {
        return new CarrierFeeInfoType.Fee.FeeAmount();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.Fee.Taxes }
     * 
     */
    public CarrierFeeInfoType.Fee.Taxes createCarrierFeeInfoTypeFeeTaxes() {
        return new CarrierFeeInfoType.Fee.Taxes();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.Fee.FareComponent }
     * 
     */
    public CarrierFeeInfoType.Fee.FareComponent createCarrierFeeInfoTypeFeeFareComponent() {
        return new CarrierFeeInfoType.Fee.FareComponent();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.Fee.AirlineID }
     * 
     */
    public CarrierFeeInfoType.Fee.AirlineID createCarrierFeeInfoTypeFeeAirlineID() {
        return new CarrierFeeInfoType.Fee.AirlineID();
    }

    /**
     * Create an instance of {@link VoucherMethodType.EffectiveExpireDate }
     * 
     */
    public VoucherMethodType.EffectiveExpireDate createVoucherMethodTypeEffectiveExpireDate() {
        return new VoucherMethodType.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link RedemptionMethodType.MemberNumber }
     * 
     */
    public RedemptionMethodType.MemberNumber createRedemptionMethodTypeMemberNumber() {
        return new RedemptionMethodType.MemberNumber();
    }

    /**
     * Create an instance of {@link RedemptionMethodType.CertificateNumber }
     * 
     */
    public RedemptionMethodType.CertificateNumber createRedemptionMethodTypeCertificateNumber() {
        return new RedemptionMethodType.CertificateNumber();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.MaskedCardNumber }
     * 
     */
    public PaymentCardMethodType.MaskedCardNumber createPaymentCardMethodTypeMaskedCardNumber() {
        return new PaymentCardMethodType.MaskedCardNumber();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.CardHolderName }
     * 
     */
    public PaymentCardMethodType.CardHolderName createPaymentCardMethodTypeCardHolderName() {
        return new PaymentCardMethodType.CardHolderName();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.CardIssuerName }
     * 
     */
    public PaymentCardMethodType.CardIssuerName createPaymentCardMethodTypeCardIssuerName() {
        return new PaymentCardMethodType.CardIssuerName();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.CardholderAddress }
     * 
     */
    public PaymentCardMethodType.CardholderAddress createPaymentCardMethodTypeCardholderAddress() {
        return new PaymentCardMethodType.CardholderAddress();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.EffectiveExpireDate }
     * 
     */
    public PaymentCardMethodType.EffectiveExpireDate createPaymentCardMethodTypeEffectiveExpireDate() {
        return new PaymentCardMethodType.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link DirectBillMethodType.Address }
     * 
     */
    public DirectBillMethodType.Address createDirectBillMethodTypeAddress() {
        return new DirectBillMethodType.Address();
    }

    /**
     * Create an instance of {@link CashMethodType.Address }
     * 
     */
    public CashMethodType.Address createCashMethodTypeAddress() {
        return new CashMethodType.Address();
    }

    /**
     * Create an instance of {@link BankAccountMethodType.Name }
     * 
     */
    public BankAccountMethodType.Name createBankAccountMethodTypeName() {
        return new BankAccountMethodType.Name();
    }

    /**
     * Create an instance of {@link SeatLocationType.Characteristic }
     * 
     */
    public SeatLocationType.Characteristic createSeatLocationTypeCharacteristic() {
        return new SeatLocationType.Characteristic();
    }

    /**
     * Create an instance of {@link SeatLocationType.Row.SeatData }
     * 
     */
    public SeatLocationType.Row.SeatData createSeatLocationTypeRowSeatData() {
        return new SeatLocationType.Row.SeatData();
    }

    /**
     * Create an instance of {@link OtherItemType.Price }
     * 
     */
    public OtherItemType.Price createOtherItemTypePrice() {
        return new OtherItemType.Price();
    }

    /**
     * Create an instance of {@link FlightItemType.Price }
     * 
     */
    public FlightItemType.Price createFlightItemTypePrice() {
        return new FlightItemType.Price();
    }

    /**
     * Create an instance of {@link BaggageItemType.Price }
     * 
     */
    public BaggageItemType.Price createBaggageItemTypePrice() {
        return new BaggageItemType.Price();
    }

    /**
     * Create an instance of {@link BaggageItemType.BagDetail.Price }
     * 
     */
    public BaggageItemType.BagDetail.Price createBaggageItemTypeBagDetailPrice() {
        return new BaggageItemType.BagDetail.Price();
    }

    /**
     * Create an instance of {@link SettlementType.Fees }
     * 
     */
    public SettlementType.Fees createSettlementTypeFees() {
        return new SettlementType.Fees();
    }

    /**
     * Create an instance of {@link TicketByTimeLimitType.TicketBy }
     * 
     */
    public TicketByTimeLimitType.TicketBy createTicketByTimeLimitTypeTicketBy() {
        return new TicketByTimeLimitType.TicketBy();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType.TravelerQuantity }
     * 
     */
    public AirlineOffersSnapshotType.TravelerQuantity createAirlineOffersSnapshotTypeTravelerQuantity() {
        return new AirlineOffersSnapshotType.TravelerQuantity();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType.SubTotal }
     * 
     */
    public AirlineOffersSnapshotType.SubTotal createAirlineOffersSnapshotTypeSubTotal() {
        return new AirlineOffersSnapshotType.SubTotal();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType.Highest }
     * 
     */
    public AirlineOffersSnapshotType.Highest createAirlineOffersSnapshotTypeHighest() {
        return new AirlineOffersSnapshotType.Highest();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType.Lowest }
     * 
     */
    public AirlineOffersSnapshotType.Lowest createAirlineOffersSnapshotTypeLowest() {
        return new AirlineOffersSnapshotType.Lowest();
    }

    /**
     * Create an instance of {@link OfferMatchType.MatchResult }
     * 
     */
    public OfferMatchType.MatchResult createOfferMatchTypeMatchResult() {
        return new OfferMatchType.MatchResult();
    }

    /**
     * Create an instance of {@link InvGuaranteeType.InvGuaranteeTimeLimit }
     * 
     */
    public InvGuaranteeType.InvGuaranteeTimeLimit createInvGuaranteeTypeInvGuaranteeTimeLimit() {
        return new InvGuaranteeType.InvGuaranteeTimeLimit();
    }

    /**
     * Create an instance of {@link SeatOfferType.OfferPrice }
     * 
     */
    public SeatOfferType.OfferPrice createSeatOfferTypeOfferPrice() {
        return new SeatOfferType.OfferPrice();
    }

    /**
     * Create an instance of {@link PricedFlightOfferAssocType.PriceClass }
     * 
     */
    public PricedFlightOfferAssocType.PriceClass createPricedFlightOfferAssocTypePriceClass() {
        return new PricedFlightOfferAssocType.PriceClass();
    }

    /**
     * Create an instance of {@link OtherOfferType.OfferPrice }
     * 
     */
    public OtherOfferType.OfferPrice createOtherOfferTypeOfferPrice() {
        return new OtherOfferType.OfferPrice();
    }

    /**
     * Create an instance of {@link BaggageOfferType.TotalPrice }
     * 
     */
    public BaggageOfferType.TotalPrice createBaggageOfferTypeTotalPrice() {
        return new BaggageOfferType.TotalPrice();
    }

    /**
     * Create an instance of {@link BaggageOfferType.BagDetail.Price }
     * 
     */
    public BaggageOfferType.BagDetail.Price createBaggageOfferTypeBagDetailPrice() {
        return new BaggageOfferType.BagDetail.Price();
    }

    /**
     * Create an instance of {@link MediaAssocType.MediaItems }
     * 
     */
    public MediaAssocType.MediaItems createMediaAssocTypeMediaItems() {
        return new MediaAssocType.MediaItems();
    }

    /**
     * Create an instance of {@link OfferAssociationsType.Service }
     * 
     */
    public OfferAssociationsType.Service createOfferAssociationsTypeService() {
        return new OfferAssociationsType.Service();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.OtherAssociation }
     * 
     */
    public org.iata.ndc.schema.OtherAssociation createOtherAssociation() {
        return new org.iata.ndc.schema.OtherAssociation();
    }

    /**
     * Create an instance of {@link PassengerMetadataType.NameDetail }
     * 
     */
    public PassengerMetadataType.NameDetail createPassengerMetadataTypeNameDetail() {
        return new PassengerMetadataType.NameDetail();
    }

    /**
     * Create an instance of {@link TravelerMetadataType.NameDetail }
     * 
     */
    public TravelerMetadataType.NameDetail createTravelerMetadataTypeNameDetail() {
        return new TravelerMetadataType.NameDetail();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment.Location }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment.Location createServiceQualifierPriceTypeFulfillmentLocation() {
        return new ServiceQualifierPriceType.Fulfillment.Location();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start createServiceQualifierPriceTypeFulfillmentOfferValidDatesStart() {
        return new ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates.End }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment.OfferValidDates.End createServiceQualifierPriceTypeFulfillmentOfferValidDatesEnd() {
        return new ServiceQualifierPriceType.Fulfillment.OfferValidDates.End();
    }

    /**
     * Create an instance of {@link OrderKeysType.AssociatedID }
     * 
     */
    public OrderKeysType.AssociatedID createOrderKeysTypeAssociatedID() {
        return new OrderKeysType.AssociatedID();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.ATPCO }
     * 
     */
    public OfferItemMetadataType.ATPCO createOfferItemMetadataTypeATPCO() {
        return new OfferItemMetadataType.ATPCO();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Incentives }
     * 
     */
    public OfferItemMetadataType.Incentives createOfferItemMetadataTypeIncentives() {
        return new OfferItemMetadataType.Incentives();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Terms }
     * 
     */
    public OfferItemMetadataType.Terms createOfferItemMetadataTypeTerms() {
        return new OfferItemMetadataType.Terms();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.TimeLimits }
     * 
     */
    public OfferItemMetadataType.TimeLimits createOfferItemMetadataTypeTimeLimits() {
        return new OfferItemMetadataType.TimeLimits();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Rule }
     * 
     */
    public OfferItemMetadataType.Rule createOfferItemMetadataTypeRule() {
        return new OfferItemMetadataType.Rule();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Match }
     * 
     */
    public OfferItemMetadataType.Match createOfferItemMetadataTypeMatch() {
        return new OfferItemMetadataType.Match();
    }

    /**
     * Create an instance of {@link BaggageDetailMetadataType.FareTariff }
     * 
     */
    public BaggageDetailMetadataType.FareTariff createBaggageDetailMetadataTypeFareTariff() {
        return new BaggageDetailMetadataType.FareTariff();
    }

    /**
     * Create an instance of {@link RuleMetadataType.RuleID }
     * 
     */
    public RuleMetadataType.RuleID createRuleMetadataTypeRuleID() {
        return new RuleMetadataType.RuleID();
    }

    /**
     * Create an instance of {@link RuleMetadataType.Status }
     * 
     */
    public RuleMetadataType.Status createRuleMetadataTypeStatus() {
        return new RuleMetadataType.Status();
    }

    /**
     * Create an instance of {@link RuleMetadataType.Value.Instruction }
     * 
     */
    public RuleMetadataType.Value.Instruction createRuleMetadataTypeValueInstruction() {
        return new RuleMetadataType.Value.Instruction();
    }

    /**
     * Create an instance of {@link PaymentCardMetadataType.Surcharge }
     * 
     */
    public PaymentCardMetadataType.Surcharge createPaymentCardMetadataTypeSurcharge() {
        return new PaymentCardMetadataType.Surcharge();
    }

    /**
     * Create an instance of {@link PaymentCardMetadataType.FieldName }
     * 
     */
    public PaymentCardMetadataType.FieldName createPaymentCardMetadataTypeFieldName() {
        return new PaymentCardMetadataType.FieldName();
    }

    /**
     * Create an instance of {@link MediaMetadataType.Dimensions }
     * 
     */
    public MediaMetadataType.Dimensions createMediaMetadataTypeDimensions() {
        return new MediaMetadataType.Dimensions();
    }

    /**
     * Create an instance of {@link MediaMetadataType.MediaSource }
     * 
     */
    public MediaMetadataType.MediaSource createMediaMetadataTypeMediaSource() {
        return new MediaMetadataType.MediaSource();
    }

    /**
     * Create an instance of {@link EquivalentIDMetadataType.EquivID }
     * 
     */
    public EquivalentIDMetadataType.EquivID createEquivalentIDMetadataTypeEquivID() {
        return new EquivalentIDMetadataType.EquivID();
    }

    /**
     * Create an instance of {@link CodesetMetadataType.OtherLanguage }
     * 
     */
    public CodesetMetadataType.OtherLanguage createCodesetMetadataTypeOtherLanguage() {
        return new CodesetMetadataType.OtherLanguage();
    }

    /**
     * Create an instance of {@link CodesetMetadataType.Source.OwnerID }
     * 
     */
    public CodesetMetadataType.Source.OwnerID createCodesetMetadataTypeSourceOwnerID() {
        return new CodesetMetadataType.Source.OwnerID();
    }

    /**
     * Create an instance of {@link AddressMetadataType.FieldName }
     * 
     */
    public AddressMetadataType.FieldName createAddressMetadataTypeFieldName() {
        return new AddressMetadataType.FieldName();
    }

    /**
     * Create an instance of {@link ItineraryType.Flight }
     * 
     */
    public ItineraryType.Flight createItineraryTypeFlight() {
        return new ItineraryType.Flight();
    }

    /**
     * Create an instance of {@link AircraftFeaturesQueryType.Feature }
     * 
     */
    public AircraftFeaturesQueryType.Feature createAircraftFeaturesQueryTypeFeature() {
        return new AircraftFeaturesQueryType.Feature();
    }

    /**
     * Create an instance of {@link TotalJourneyType.Distance }
     * 
     */
    public TotalJourneyType.Distance createTotalJourneyTypeDistance() {
        return new TotalJourneyType.Distance();
    }

    /**
     * Create an instance of {@link FlightArrivalType.AirportCode }
     * 
     */
    public FlightArrivalType.AirportCode createFlightArrivalTypeAirportCode() {
        return new FlightArrivalType.AirportCode();
    }

    /**
     * Create an instance of {@link FlightArrivalType.Terminal }
     * 
     */
    public FlightArrivalType.Terminal createFlightArrivalTypeTerminal() {
        return new FlightArrivalType.Terminal();
    }

    /**
     * Create an instance of {@link StopLocationType.StopLocation }
     * 
     */
    public StopLocationType.StopLocation createStopLocationTypeStopLocation() {
        return new StopLocationType.StopLocation();
    }

    /**
     * Create an instance of {@link FlightCOSCoreType.Code }
     * 
     */
    public FlightCOSCoreType.Code createFlightCOSCoreTypeCode() {
        return new FlightCOSCoreType.Code();
    }

    /**
     * Create an instance of {@link FlightCOSCoreType.MarketingName }
     * 
     */
    public FlightCOSCoreType.MarketingName createFlightCOSCoreTypeMarketingName() {
        return new FlightCOSCoreType.MarketingName();
    }

    /**
     * Create an instance of {@link FareQualifierType.CompanyIndex }
     * 
     */
    public FareQualifierType.CompanyIndex createFareQualifierTypeCompanyIndex() {
        return new FareQualifierType.CompanyIndex();
    }

    /**
     * Create an instance of {@link FareQualifierType.Contract }
     * 
     */
    public FareQualifierType.Contract createFareQualifierTypeContract() {
        return new FareQualifierType.Contract();
    }

    /**
     * Create an instance of {@link FareQualifierType.Account }
     * 
     */
    public FareQualifierType.Account createFareQualifierTypeAccount() {
        return new FareQualifierType.Account();
    }

    /**
     * Create an instance of {@link FareFilingType.NUCAmount }
     * 
     */
    public FareFilingType.NUCAmount createFareFilingTypeNUCAmount() {
        return new FareFilingType.NUCAmount();
    }

    /**
     * Create an instance of {@link FareComponentType.Parameters }
     * 
     */
    public FareComponentType.Parameters createFareComponentTypeParameters() {
        return new FareComponentType.Parameters();
    }

    /**
     * Create an instance of {@link FareComponentType.PriceBreakdown }
     * 
     */
    public FareComponentType.PriceBreakdown createFareComponentTypePriceBreakdown() {
        return new FareComponentType.PriceBreakdown();
    }

    /**
     * Create an instance of {@link FareComponentType.FareBasis }
     * 
     */
    public FareComponentType.FareBasis createFareComponentTypeFareBasis() {
        return new FareComponentType.FareBasis();
    }

    /**
     * Create an instance of {@link FareRulesType.AdvanceStay }
     * 
     */
    public FareRulesType.AdvanceStay createFareRulesTypeAdvanceStay() {
        return new FareRulesType.AdvanceStay();
    }

    /**
     * Create an instance of {@link FareDetailType.FareIndicatorCode }
     * 
     */
    public FareDetailType.FareIndicatorCode createFareDetailTypeFareIndicatorCode() {
        return new FareDetailType.FareIndicatorCode();
    }

    /**
     * Create an instance of {@link ServiceBundle.Associations }
     * 
     */
    public ServiceBundle.Associations createServiceBundleAssociations() {
        return new ServiceBundle.Associations();
    }

    /**
     * Create an instance of {@link ServiceBundle.Selection }
     * 
     */
    public ServiceBundle.Selection createServiceBundleSelection() {
        return new ServiceBundle.Selection();
    }

    /**
     * Create an instance of {@link ServiceBundle.BundleID }
     * 
     */
    public ServiceBundle.BundleID createServiceBundleBundleID() {
        return new ServiceBundle.BundleID();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Penalty }
     * 
     */
    public org.iata.ndc.schema.Penalty createPenalty() {
        return new org.iata.ndc.schema.Penalty();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Instruction }
     * 
     */
    public org.iata.ndc.schema.Instruction createInstruction() {
        return new org.iata.ndc.schema.Instruction();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Media }
     * 
     */
    public org.iata.ndc.schema.Media createMedia() {
        return new org.iata.ndc.schema.Media();
    }

    /**
     * Create an instance of {@link ServiceClass }
     * 
     */
    public ServiceClass createServiceClass() {
        return new ServiceClass();
    }

    /**
     * Create an instance of {@link FareGroup.Fare }
     * 
     */
    public FareGroup.Fare createFareGroupFare() {
        return new FareGroup.Fare();
    }

    /**
     * Create an instance of {@link FareGroup.FareBasisCode }
     * 
     */
    public FareGroup.FareBasisCode createFareGroupFareBasisCode() {
        return new FareGroup.FareBasisCode();
    }

    /**
     * Create an instance of {@link ListOfDisclosureTypeDisclosures }
     * 
     */
    public ListOfDisclosureTypeDisclosures createListOfDisclosureTypeDisclosures() {
        return new ListOfDisclosureTypeDisclosures();
    }

    /**
     * Create an instance of {@link ContentSource.OtherID }
     * 
     */
    public ContentSource.OtherID createContentSourceOtherID() {
        return new ContentSource.OtherID();
    }

    /**
     * Create an instance of {@link CarryOnAllowance }
     * 
     */
    public CarryOnAllowance createCarryOnAllowance() {
        return new CarryOnAllowance();
    }

    /**
     * Create an instance of {@link CheckedBagAllowance }
     * 
     */
    public CheckedBagAllowance createCheckedBagAllowance() {
        return new CheckedBagAllowance();
    }

    /**
     * Create an instance of {@link BagDisclosure }
     * 
     */
    public BagDisclosure createBagDisclosure() {
        return new BagDisclosure();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Results.TaxExemption.RuleID }
     * 
     */
    public TaxExemptionNoticeType.Results.TaxExemption.RuleID createTaxExemptionNoticeTypeResultsTaxExemptionRuleID() {
        return new TaxExemptionNoticeType.Results.TaxExemption.RuleID();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named.TaxCode }
     * 
     */
    public TaxExemptionNoticeType.Query.Named.TaxCode createTaxExemptionNoticeTypeQueryNamedTaxCode() {
        return new TaxExemptionNoticeType.Query.Named.TaxCode();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilter.Associations.Offer.PriceClass }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilter.Associations.Offer.PriceClass createServiceFilterNoticeTypeResultsAppliedFilterAssociationsOfferPriceClass() {
        return new ServiceFilterNoticeType.Results.AppliedFilter.Associations.Offer.PriceClass();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilter.Associations.Offer.OtherAssociation }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilter.Associations.Offer.OtherAssociation createServiceFilterNoticeTypeResultsAppliedFilterAssociationsOfferOtherAssociation() {
        return new ServiceFilterNoticeType.Results.AppliedFilter.Associations.Offer.OtherAssociation();
    }

    /**
     * Create an instance of {@link PricingParametersNoticeType.Query }
     * 
     */
    public PricingParametersNoticeType.Query createPricingParametersNoticeTypeQuery() {
        return new PricingParametersNoticeType.Query();
    }

    /**
     * Create an instance of {@link PricingParametersNoticeType.Results }
     * 
     */
    public PricingParametersNoticeType.Results createPricingParametersNoticeTypeResults() {
        return new PricingParametersNoticeType.Results();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID }
     * 
     */
    public PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID createPriceVarianceRuleNoticeTypeResultsPriceVarianceRuleID() {
        return new PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Results.PriceVariance.Amount }
     * 
     */
    public PriceVarianceRuleNoticeType.Results.PriceVariance.Amount createPriceVarianceRuleNoticeTypeResultsPriceVarianceAmount() {
        return new PriceVarianceRuleNoticeType.Results.PriceVariance.Amount();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleRuleID() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleAcceptableVariance() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleName() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleRuleValid() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleCurrencies() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies();
    }

    /**
     * Create an instance of {@link PaymentRulesNoticeType.FormOfPayment.Query }
     * 
     */
    public PaymentRulesNoticeType.FormOfPayment.Query createPaymentRulesNoticeTypeFormOfPaymentQuery() {
        return new PaymentRulesNoticeType.FormOfPayment.Query();
    }

    /**
     * Create an instance of {@link PaymentRulesNoticeType.FormOfPayment.Results.Code }
     * 
     */
    public PaymentRulesNoticeType.FormOfPayment.Results.Code createPaymentRulesNoticeTypeFormOfPaymentResultsCode() {
        return new PaymentRulesNoticeType.FormOfPayment.Results.Code();
    }

    /**
     * Create an instance of {@link InvGuaranteeNoticeType.Query }
     * 
     */
    public InvGuaranteeNoticeType.Query createInvGuaranteeNoticeTypeQuery() {
        return new InvGuaranteeNoticeType.Query();
    }

    /**
     * Create an instance of {@link InvGuaranteeNoticeType.Results.InventoryGuarantee }
     * 
     */
    public InvGuaranteeNoticeType.Results.InventoryGuarantee createInvGuaranteeNoticeTypeResultsInventoryGuarantee() {
        return new InvGuaranteeNoticeType.Results.InventoryGuarantee();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.StopLocation }
     * 
     */
    public SecurePaymentPaxInfoType.StopLocation createSecurePaymentPaxInfoTypeStopLocation() {
        return new SecurePaymentPaxInfoType.StopLocation();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.DateTime }
     * 
     */
    public SecurePaymentPaxInfoType.DateTime createSecurePaymentPaxInfoTypeDateTime() {
        return new SecurePaymentPaxInfoType.DateTime();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.Carrier }
     * 
     */
    public SecurePaymentPaxInfoType.Carrier createSecurePaymentPaxInfoTypeCarrier() {
        return new SecurePaymentPaxInfoType.Carrier();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.PayerAuth }
     * 
     */
    public SecurePaymentAlertType.PayerAuth createSecurePaymentAlertTypePayerAuth() {
        return new SecurePaymentAlertType.PayerAuth();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.TransactionType }
     * 
     */
    public SecurePaymentAlertType.TransactionType createSecurePaymentAlertTypeTransactionType() {
        return new SecurePaymentAlertType.TransactionType();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.EnrollmentStatus }
     * 
     */
    public SecurePaymentAlertType.EnrollmentStatus createSecurePaymentAlertTypeEnrollmentStatus() {
        return new SecurePaymentAlertType.EnrollmentStatus();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.URLs }
     * 
     */
    public SecurePaymentAlertType.URLs createSecurePaymentAlertTypeURLs() {
        return new SecurePaymentAlertType.URLs();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.ProcessingInfo.AddrVerification }
     * 
     */
    public SecurePaymentAlertType.ProcessingInfo.AddrVerification createSecurePaymentAlertTypeProcessingInfoAddrVerification() {
        return new SecurePaymentAlertType.ProcessingInfo.AddrVerification();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.ProcessingInfo.CustomerAuthStatus }
     * 
     */
    public SecurePaymentAlertType.ProcessingInfo.CustomerAuthStatus createSecurePaymentAlertTypeProcessingInfoCustomerAuthStatus() {
        return new SecurePaymentAlertType.ProcessingInfo.CustomerAuthStatus();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details.ClientType }
     * 
     */
    public SecurePaymentAlertType.Details.ClientType createSecurePaymentAlertTypeDetailsClientType() {
        return new SecurePaymentAlertType.Details.ClientType();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details.CustomerDevice }
     * 
     */
    public SecurePaymentAlertType.Details.CustomerDevice createSecurePaymentAlertTypeDetailsCustomerDevice() {
        return new SecurePaymentAlertType.Details.CustomerDevice();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details.Currency }
     * 
     */
    public SecurePaymentAlertType.Details.Currency createSecurePaymentAlertTypeDetailsCurrency() {
        return new SecurePaymentAlertType.Details.Currency();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Reference.OriginalTransactionID }
     * 
     */
    public SecurePaymentAlertType.Reference.OriginalTransactionID createSecurePaymentAlertTypeReferenceOriginalTransactionID() {
        return new SecurePaymentAlertType.Reference.OriginalTransactionID();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Airline.ID }
     * 
     */
    public SecurePaymentAlertType.Airline.ID createSecurePaymentAlertTypeAirlineID() {
        return new SecurePaymentAlertType.Airline.ID();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Airline.Name }
     * 
     */
    public SecurePaymentAlertType.Airline.Name createSecurePaymentAlertTypeAirlineName() {
        return new SecurePaymentAlertType.Airline.Name();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Airline.CountryCode }
     * 
     */
    public SecurePaymentAlertType.Airline.CountryCode createSecurePaymentAlertTypeAirlineCountryCode() {
        return new SecurePaymentAlertType.Airline.CountryCode();
    }

    /**
     * Create an instance of {@link PINAuthTravelerType.AuthRequest }
     * 
     */
    public PINAuthTravelerType.AuthRequest createPINAuthTravelerTypeAuthRequest() {
        return new PINAuthTravelerType.AuthRequest();
    }

    /**
     * Create an instance of {@link InvDiscrepencyAlertType.Code }
     * 
     */
    public InvDiscrepencyAlertType.Code createInvDiscrepencyAlertTypeCode() {
        return new InvDiscrepencyAlertType.Code();
    }

    /**
     * Create an instance of {@link InvDiscrepencyAlertType.AlternateOffers.AlternateOffer }
     * 
     */
    public InvDiscrepencyAlertType.AlternateOffers.AlternateOffer createInvDiscrepencyAlertTypeAlternateOffersAlternateOffer() {
        return new InvDiscrepencyAlertType.AlternateOffers.AlternateOffer();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType.Flight }
     * 
     */
    public OrderItemAssociationType.Flight createOrderItemAssociationTypeFlight() {
        return new OrderItemAssociationType.Flight();
    }

    /**
     * Create an instance of {@link Alert }
     * 
     */
    public Alert createAlert() {
        return new Alert();
    }

    /**
     * Create an instance of {@link MsgPartiesType.Sender }
     * 
     */
    public MsgPartiesType.Sender createMsgPartiesTypeSender() {
        return new MsgPartiesType.Sender();
    }

    /**
     * Create an instance of {@link MsgPartiesType.Recipient }
     * 
     */
    public MsgPartiesType.Recipient createMsgPartiesTypeRecipient() {
        return new MsgPartiesType.Recipient();
    }

    /**
     * Create an instance of {@link MsgPartiesType.Participants.Participant }
     * 
     */
    public MsgPartiesType.Participants.Participant createMsgPartiesTypeParticipant() {
        return new MsgPartiesType.Participants.Participant();
    }

    /**
     * Create an instance of {@link PointOfSaleType.Location }
     * 
     */
    public PointOfSaleType.Location createPointOfSaleTypeLocation() {
        return new PointOfSaleType.Location();
    }

    /**
     * Create an instance of {@link PointOfSaleType.RequestTime }
     * 
     */
    public PointOfSaleType.RequestTime createPointOfSaleTypeRequestTime() {
        return new PointOfSaleType.RequestTime();
    }

    /**
     * Create an instance of {@link PointOfSaleType.TouchPoint.Device }
     * 
     */
    public PointOfSaleType.TouchPoint.Device createPointOfSaleTypeTouchPointDevice() {
        return new PointOfSaleType.TouchPoint.Device();
    }

    /**
     * Create an instance of {@link PolicyAugmentationTypePolicy }
     * 
     */
    public PolicyAugmentationTypePolicy createPolicyAugmentationTypePolicy() {
        return new PolicyAugmentationTypePolicy();
    }

    /**
     * Create an instance of {@link PolicyDefaultTypePolicy }
     * 
     */
    public PolicyDefaultTypePolicy createPolicyDefaultTypePolicy() {
        return new PolicyDefaultTypePolicy();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillment.Location }
     * 
     */
    public FulfillmentPartnerType.Fulfillment.Location createFulfillmentPartnerTypeFulfillmentLocation() {
        return new FulfillmentPartnerType.Fulfillment.Location();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillment.OfferValidDates.Start }
     * 
     */
    public FulfillmentPartnerType.Fulfillment.OfferValidDates.Start createFulfillmentPartnerTypeFulfillmentOfferValidDatesStart() {
        return new FulfillmentPartnerType.Fulfillment.OfferValidDates.Start();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillment.OfferValidDates.End }
     * 
     */
    public FulfillmentPartnerType.Fulfillment.OfferValidDates.End createFulfillmentPartnerTypeFulfillmentOfferValidDatesEnd() {
        return new FulfillmentPartnerType.Fulfillment.OfferValidDates.End();
    }

    /**
     * Create an instance of {@link AgencyCoreRepType.OtherID }
     * 
     */
    public AgencyCoreRepType.OtherID createAgencyCoreRepTypeOtherID() {
        return new AgencyCoreRepType.OtherID();
    }

    /**
     * Create an instance of {@link PrimaryContact.Name.Surname }
     * 
     */
    public PrimaryContact.Name.Surname createPrimaryContactNameSurname() {
        return new PrimaryContact.Name.Surname();
    }

    /**
     * Create an instance of {@link PrimaryContact.Name.Given }
     * 
     */
    public PrimaryContact.Name.Given createPrimaryContactNameGiven() {
        return new PrimaryContact.Name.Given();
    }

    /**
     * Create an instance of {@link PrimaryContact.Name.Middle }
     * 
     */
    public PrimaryContact.Name.Middle createPrimaryContactNameMiddle() {
        return new PrimaryContact.Name.Middle();
    }

    /**
     * Create an instance of {@link PassengerSummaryType.PassengerIDInfo.PassengerDocument }
     * 
     */
    public PassengerSummaryType.PassengerIDInfo.PassengerDocument createPassengerSummaryTypePassengerIDInfoPassengerDocument() {
        return new PassengerSummaryType.PassengerIDInfo.PassengerDocument();
    }

    /**
     * Create an instance of {@link PassengerSummaryType.PassengerIDInfo.FOID.ID }
     * 
     */
    public PassengerSummaryType.PassengerIDInfo.FOID.ID createPassengerSummaryTypePassengerIDInfoFOIDID() {
        return new PassengerSummaryType.PassengerIDInfo.FOID.ID();
    }

    /**
     * Create an instance of {@link TravelerSummaryType.Name.Surname }
     * 
     */
    public TravelerSummaryType.Name.Surname createTravelerSummaryTypeNameSurname() {
        return new TravelerSummaryType.Name.Surname();
    }

    /**
     * Create an instance of {@link TravelerSummaryType.Name.Given }
     * 
     */
    public TravelerSummaryType.Name.Given createTravelerSummaryTypeNameGiven() {
        return new TravelerSummaryType.Name.Given();
    }

    /**
     * Create an instance of {@link TravelerSummaryType.Name.Middle }
     * 
     */
    public TravelerSummaryType.Name.Middle createTravelerSummaryTypeNameMiddle() {
        return new TravelerSummaryType.Name.Middle();
    }

    /**
     * Create an instance of {@link TravelerCoreType.Age.Value }
     * 
     */
    public TravelerCoreType.Age.Value createTravelerCoreTypeAgeValue() {
        return new TravelerCoreType.Age.Value();
    }

    /**
     * Create an instance of {@link TravelerCoreType.Age.BirthDate }
     * 
     */
    public TravelerCoreType.Age.BirthDate createTravelerCoreTypeAgeBirthDate() {
        return new TravelerCoreType.Age.BirthDate();
    }

    /**
     * Create an instance of {@link TravelerDetailType.Gender }
     * 
     */
    public TravelerDetailType.Gender createTravelerDetailTypeGender() {
        return new TravelerDetailType.Gender();
    }

    /**
     * Create an instance of {@link BilateralTimeLimit }
     * 
     */
    public BilateralTimeLimit createBilateralTimeLimit() {
        return new BilateralTimeLimit();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Total }
     * 
     */
    public TaxExemptionType.Total createTaxExemptionTypeTotal() {
        return new TaxExemptionType.Total();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Tax }
     * 
     */
    public TaxExemptionType.Tax createTaxExemptionTypeTax() {
        return new TaxExemptionType.Tax();
    }

    /**
     * Create an instance of {@link StateProvQueryType.KeyWord }
     * 
     */
    public StateProvQueryType.KeyWord createStateProvQueryTypeKeyWord() {
        return new StateProvQueryType.KeyWord();
    }

    /**
     * Create an instance of {@link StateProvQueryType.StateCode }
     * 
     */
    public StateProvQueryType.StateCode createStateProvQueryTypeStateCode() {
        return new StateProvQueryType.StateCode();
    }

    /**
     * Create an instance of {@link ShoppingResponseIDType.ResponseID }
     * 
     */
    public ShoppingResponseIDType.ResponseID createShoppingResponseIDTypeResponseID() {
        return new ShoppingResponseIDType.ResponseID();
    }

    /**
     * Create an instance of {@link RuleType.Value }
     * 
     */
    public RuleType.Value createRuleTypeValue() {
        return new RuleType.Value();
    }

    /**
     * Create an instance of {@link RuleType.Name }
     * 
     */
    public RuleType.Name createRuleTypeName() {
        return new RuleType.Name();
    }

    /**
     * Create an instance of {@link RuleType.EffectivePeriod }
     * 
     */
    public RuleType.EffectivePeriod createRuleTypeEffectivePeriod() {
        return new RuleType.EffectivePeriod();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleType.AcceptableVariance }
     * 
     */
    public PriceVarianceRuleType.AcceptableVariance createPriceVarianceRuleTypeAcceptableVariance() {
        return new PriceVarianceRuleType.AcceptableVariance();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleType.Name }
     * 
     */
    public PriceVarianceRuleType.Name createPriceVarianceRuleTypeName() {
        return new PriceVarianceRuleType.Name();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleType.EffectivePeriod }
     * 
     */
    public PriceVarianceRuleType.EffectivePeriod createPriceVarianceRuleTypeEffectivePeriod() {
        return new PriceVarianceRuleType.EffectivePeriod();
    }

    /**
     * Create an instance of {@link AwardRedemptionType.Unit }
     * 
     */
    public AwardRedemptionType.Unit createAwardRedemptionTypeUnit() {
        return new AwardRedemptionType.Unit();
    }

    /**
     * Create an instance of {@link AwardRedemptionType.Conversion }
     * 
     */
    public AwardRedemptionType.Conversion createAwardRedemptionTypeConversion() {
        return new AwardRedemptionType.Conversion();
    }

    /**
     * Create an instance of {@link CombinationPriceType.Partial.Currency }
     * 
     */
    public CombinationPriceType.Partial.Currency createCombinationPriceTypePartialCurrency() {
        return new CombinationPriceType.Partial.Currency();
    }

    /**
     * Create an instance of {@link Voucher.Name.Surname }
     * 
     */
    public Voucher.Name.Surname createVoucherNameSurname() {
        return new Voucher.Name.Surname();
    }

    /**
     * Create an instance of {@link Voucher.Name.Given }
     * 
     */
    public Voucher.Name.Given createVoucherNameGiven() {
        return new Voucher.Name.Given();
    }

    /**
     * Create an instance of {@link Voucher.Name.Middle }
     * 
     */
    public Voucher.Name.Middle createVoucherNameMiddle() {
        return new Voucher.Name.Middle();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardNumber }
     * 
     */
    public PaymentCardType.CardNumber createPaymentCardTypeCardNumber() {
        return new PaymentCardType.CardNumber();
    }

    /**
     * Create an instance of {@link PaymentCardType.SeriesCode }
     * 
     */
    public PaymentCardType.SeriesCode createPaymentCardTypeSeriesCode() {
        return new PaymentCardType.SeriesCode();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardHolderName }
     * 
     */
    public PaymentCardType.CardHolderName createPaymentCardTypeCardHolderName() {
        return new PaymentCardType.CardHolderName();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardIssuerName }
     * 
     */
    public PaymentCardType.CardIssuerName createPaymentCardTypeCardIssuerName() {
        return new PaymentCardType.CardIssuerName();
    }

    /**
     * Create an instance of {@link PaymentCardType.CardHolderBillingAddress }
     * 
     */
    public PaymentCardType.CardHolderBillingAddress createPaymentCardTypeCardHolderBillingAddress() {
        return new PaymentCardType.CardHolderBillingAddress();
    }

    /**
     * Create an instance of {@link PaymentCardType.MaskedCardNumber }
     * 
     */
    public PaymentCardType.MaskedCardNumber createPaymentCardTypeMaskedCardNumber() {
        return new PaymentCardType.MaskedCardNumber();
    }

    /**
     * Create an instance of {@link PaymentCardType.Surcharge }
     * 
     */
    public PaymentCardType.Surcharge createPaymentCardTypeSurcharge() {
        return new PaymentCardType.Surcharge();
    }

    /**
     * Create an instance of {@link PaymentCardType.EffectiveExpireDate }
     * 
     */
    public PaymentCardType.EffectiveExpireDate createPaymentCardTypeEffectiveExpireDate() {
        return new PaymentCardType.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption.CertificateNumber }
     * 
     */
    public LoyaltyRedemption.CertificateNumber createLoyaltyRedemptionCertificateNumber() {
        return new LoyaltyRedemption.CertificateNumber();
    }

    /**
     * Create an instance of {@link DirectBillType.Address }
     * 
     */
    public DirectBillType.Address createDirectBillTypeAddress() {
        return new DirectBillType.Address();
    }

    /**
     * Create an instance of {@link BankAccountType.Name }
     * 
     */
    public BankAccountType.Name createBankAccountTypeName() {
        return new BankAccountType.Name();
    }

    /**
     * Create an instance of {@link BankAccountType.BankID }
     * 
     */
    public BankAccountType.BankID createBankAccountTypeBankID() {
        return new BankAccountType.BankID();
    }

    /**
     * Create an instance of {@link BankAccountType.AccountNumber }
     * 
     */
    public BankAccountType.AccountNumber createBankAccountTypeAccountNumber() {
        return new BankAccountType.AccountNumber();
    }

    /**
     * Create an instance of {@link CampaignReferralType.Localization }
     * 
     */
    public CampaignReferralType.Localization createCampaignReferralTypeLocalization() {
        return new CampaignReferralType.Localization();
    }

    /**
     * Create an instance of {@link CampaignReferralType.UTM.OtherUTMs }
     * 
     */
    public CampaignReferralType.UTM.OtherUTMs createCampaignReferralTypeUTMOtherUTMs() {
        return new CampaignReferralType.UTM.OtherUTMs();
    }

    /**
     * Create an instance of {@link TravelerFQTVType.Account.SignInID }
     * 
     */
    public TravelerFQTVType.Account.SignInID createTravelerFQTVTypeAccountSignInID() {
        return new TravelerFQTVType.Account.SignInID();
    }

    /**
     * Create an instance of {@link TravelerFQTVType.Account.Number }
     * 
     */
    public TravelerFQTVType.Account.Number createTravelerFQTVTypeAccountNumber() {
        return new TravelerFQTVType.Account.Number();
    }

    /**
     * Create an instance of {@link FQTVAllianceType.Code }
     * 
     */
    public FQTVAllianceType.Code createFQTVAllianceTypeCode() {
        return new FQTVAllianceType.Code();
    }

    /**
     * Create an instance of {@link FQTVAllianceType.URL }
     * 
     */
    public FQTVAllianceType.URL createFQTVAllianceTypeURL() {
        return new FQTVAllianceType.URL();
    }

    /**
     * Create an instance of {@link FQTVAllianceType.Participant }
     * 
     */
    public FQTVAllianceType.Participant createFQTVAllianceTypeParticipant() {
        return new FQTVAllianceType.Participant();
    }

    /**
     * Create an instance of {@link FQTVProgramCoreType.ProviderID }
     * 
     */
    public FQTVProgramCoreType.ProviderID createFQTVProgramCoreTypeProviderID() {
        return new FQTVProgramCoreType.ProviderID();
    }

    /**
     * Create an instance of {@link FQTVProgramCoreType.Tier }
     * 
     */
    public FQTVProgramCoreType.Tier createFQTVProgramCoreTypeTier() {
        return new FQTVProgramCoreType.Tier();
    }

    /**
     * Create an instance of {@link FQTVProgramSummaryType.URL }
     * 
     */
    public FQTVProgramSummaryType.URL createFQTVProgramSummaryTypeURL() {
        return new FQTVProgramSummaryType.URL();
    }

    /**
     * Create an instance of {@link FQTVProgramCoreType.Account.SignInID }
     * 
     */
    public FQTVProgramCoreType.Account.SignInID createFQTVProgramCoreTypeAccountSignInID() {
        return new FQTVProgramCoreType.Account.SignInID();
    }

    /**
     * Create an instance of {@link FQTVProgramCoreType.Account.Number }
     * 
     */
    public FQTVProgramCoreType.Account.Number createFQTVProgramCoreTypeAccountNumber() {
        return new FQTVProgramCoreType.Account.Number();
    }

    /**
     * Create an instance of {@link DirectionsType.Text }
     * 
     */
    public DirectionsType.Text createDirectionsTypeText() {
        return new DirectionsType.Text();
    }

    /**
     * Create an instance of {@link MediaAttachmentType.AttachmentURI }
     * 
     */
    public MediaAttachmentType.AttachmentURI createMediaAttachmentTypeAttachmentURI() {
        return new MediaAttachmentType.AttachmentURI();
    }

    /**
     * Create an instance of {@link PhoneType.Number }
     * 
     */
    public PhoneType.Number createPhoneTypeNumber() {
        return new PhoneType.Number();
    }

    /**
     * Create an instance of {@link EmailType.Address }
     * 
     */
    public EmailType.Address createEmailTypeAddress() {
        return new EmailType.Address();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Contact.Name.Surname }
     * 
     */
    public org.iata.ndc.schema.Contact.Name.Surname createContactNameSurname() {
        return new org.iata.ndc.schema.Contact.Name.Surname();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Contact.Name.Given }
     * 
     */
    public org.iata.ndc.schema.Contact.Name.Given createContactNameGiven() {
        return new org.iata.ndc.schema.Contact.Name.Given();
    }

    /**
     * Create an instance of {@link org.iata.ndc.schema.Contact.Name.Middle }
     * 
     */
    public org.iata.ndc.schema.Contact.Name.Middle createContactNameMiddle() {
        return new org.iata.ndc.schema.Contact.Name.Middle();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType.MaxLinear }
     * 
     */
    public BagAllowanceDimensionType.MaxLinear createBagAllowanceDimensionTypeMaxLinear() {
        return new BagAllowanceDimensionType.MaxLinear();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType.MinLinear }
     * 
     */
    public BagAllowanceDimensionType.MinLinear createBagAllowanceDimensionTypeMinLinear() {
        return new BagAllowanceDimensionType.MinLinear();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType.Dimensions }
     * 
     */
    public BagAllowanceDimensionType.Dimensions createBagAllowanceDimensionTypeDimensions() {
        return new BagAllowanceDimensionType.Dimensions();
    }

    /**
     * Create an instance of {@link AttributesType.Group }
     * 
     */
    public AttributesType.Group createAttributesTypeGroup() {
        return new AttributesType.Group();
    }

    /**
     * Create an instance of {@link AttributesType.SubGroup }
     * 
     */
    public AttributesType.SubGroup createAttributesTypeSubGroup() {
        return new AttributesType.SubGroup();
    }

    /**
     * Create an instance of {@link AttributesType.Desc1 }
     * 
     */
    public AttributesType.Desc1 createAttributesTypeDesc1() {
        return new AttributesType.Desc1();
    }

    /**
     * Create an instance of {@link AttributesType.Desc2 }
     * 
     */
    public AttributesType.Desc2 createAttributesTypeDesc2() {
        return new AttributesType.Desc2();
    }

    /**
     * Create an instance of {@link AirPassDetailType.ProgramName }
     * 
     */
    public AirPassDetailType.ProgramName createAirPassDetailTypeProgramName() {
        return new AirPassDetailType.ProgramName();
    }

    /**
     * Create an instance of {@link AirPassDetailType.Holder }
     * 
     */
    public AirPassDetailType.Holder createAirPassDetailTypeHolder() {
        return new AirPassDetailType.Holder();
    }

    /**
     * Create an instance of {@link AirPassCoreType.Certificate.Number }
     * 
     */
    public AirPassCoreType.Certificate.Number createAirPassCoreTypeCertificateNumber() {
        return new AirPassCoreType.Certificate.Number();
    }

    /**
     * Create an instance of {@link AirPassCoreType.Certificate.EffectivePeriod }
     * 
     */
    public AirPassCoreType.Certificate.EffectivePeriod createAirPassCoreTypeCertificateEffectivePeriod() {
        return new AirPassCoreType.Certificate.EffectivePeriod();
    }

    /**
     * Create an instance of {@link PaymentAddrType.City }
     * 
     */
    public PaymentAddrType.City createPaymentAddrTypeCity() {
        return new PaymentAddrType.City();
    }

    /**
     * Create an instance of {@link AddressCoreType.Address }
     * 
     */
    public AddressCoreType.Address createAddressCoreTypeAddress() {
        return new AddressCoreType.Address();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AugPointInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AugmentationPoint")
    public JAXBElement<AugPointInfoType> createAugmentationPoint(AugPointInfoType value) {
        return new JAXBElement<AugPointInfoType>(_AugmentationPoint_QNAME, AugPointInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MetadataKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createMetadataKey(String value) {
        return new JAXBElement<String>(_MetadataKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DateTime")
    public JAXBElement<DateTimeRepType> createDateTime(DateTimeRepType value) {
        return new JAXBElement<DateTimeRepType>(_DateTime_QNAME, DateTimeRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Day")
    public JAXBElement<DayRepType> createDay(DayRepType value) {
        return new JAXBElement<DayRepType>(_Day_QNAME, DayRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthYearRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MonthYear")
    public JAXBElement<MonthYearRepType> createMonthYear(MonthYearRepType value) {
        return new JAXBElement<MonthYearRepType>(_MonthYear_QNAME, MonthYearRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Month")
    public JAXBElement<MonthRepType> createMonth(MonthRepType value) {
        return new JAXBElement<MonthRepType>(_Month_QNAME, MonthRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ShortDate")
    public JAXBElement<DateRepType> createShortDate(DateRepType value) {
        return new JAXBElement<DateRepType>(_ShortDate_QNAME, DateRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimestampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Timestamp")
    public JAXBElement<TimestampType> createTimestamp(TimestampType value) {
        return new JAXBElement<TimestampType>(_Timestamp_QNAME, TimestampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Year")
    public JAXBElement<YearRepType> createYear(YearRepType value) {
        return new JAXBElement<YearRepType>(_Year_QNAME, YearRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearMonthRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "YearMonth")
    public JAXBElement<YearMonthRepType> createYearMonth(YearMonthRepType value) {
        return new JAXBElement<YearMonthRepType>(_YearMonth_QNAME, YearMonthRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatePeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DatePeriod")
    public JAXBElement<DatePeriodRepType> createDatePeriod(DatePeriodRepType value) {
        return new JAXBElement<DatePeriodRepType>(_DatePeriod_QNAME, DatePeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimePeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DateTimePeriod")
    public JAXBElement<DateTimePeriodRepType> createDateTimePeriod(DateTimePeriodRepType value) {
        return new JAXBElement<DateTimePeriodRepType>(_DateTimePeriod_QNAME, DateTimePeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayPeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DayPeriod")
    public JAXBElement<DayPeriodRepType> createDayPeriod(DayPeriodRepType value) {
        return new JAXBElement<DayPeriodRepType>(_DayPeriod_QNAME, DayPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthPeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MonthPeriod")
    public JAXBElement<MonthPeriodRepType> createMonthPeriod(MonthPeriodRepType value) {
        return new JAXBElement<MonthPeriodRepType>(_MonthPeriod_QNAME, MonthPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuarterPeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "QuarterPeriod")
    public JAXBElement<QuarterPeriodRepType> createQuarterPeriod(QuarterPeriodRepType value) {
        return new JAXBElement<QuarterPeriodRepType>(_QuarterPeriod_QNAME, QuarterPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TimePeriod")
    public JAXBElement<TimePeriodRepType> createTimePeriod(TimePeriodRepType value) {
        return new JAXBElement<TimePeriodRepType>(_TimePeriod_QNAME, TimePeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearPeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "YearPeriod")
    public JAXBElement<YearPeriodRepType> createYearPeriod(YearPeriodRepType value) {
        return new JAXBElement<YearPeriodRepType>(_YearPeriod_QNAME, YearPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearMonthPeriodRepType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "YearMonthPeriod")
    public JAXBElement<YearMonthPeriodRepType> createYearMonthPeriod(YearMonthPeriodRepType value) {
        return new JAXBElement<YearMonthPeriodRepType>(_YearMonthPeriod_QNAME, YearMonthPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressCoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AddressCore")
    public JAXBElement<AddressCoreType> createAddressCore(AddressCoreType value) {
        return new JAXBElement<AddressCoreType>(_AddressCore_QNAME, AddressCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AddressDetail")
    public JAXBElement<AddressDetailType> createAddressDetail(AddressDetailType value) {
        return new JAXBElement<AddressDetailType>(_AddressDetail_QNAME, AddressDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PaymentAddress")
    public JAXBElement<PaymentAddrType> createPaymentAddress(PaymentAddrType value) {
        return new JAXBElement<PaymentAddrType>(_PaymentAddress_QNAME, PaymentAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SimpleAddress")
    public JAXBElement<SimpleAddrType> createSimpleAddress(SimpleAddrType value) {
        return new JAXBElement<SimpleAddrType>(_SimpleAddress_QNAME, SimpleAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredAddrType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "StructuredAddress")
    public JAXBElement<StructuredAddrType> createStructuredAddress(StructuredAddrType value) {
        return new JAXBElement<StructuredAddrType>(_StructuredAddress_QNAME, StructuredAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirPassCoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AirPassCore")
    public JAXBElement<AirPassCoreType> createAirPassCore(AirPassCoreType value) {
        return new JAXBElement<AirPassCoreType>(_AirPassCore_QNAME, AirPassCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirPassDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AirPassDetail")
    public JAXBElement<AirPassDetailType> createAirPassDetail(AirPassDetailType value) {
        return new JAXBElement<AirPassDetailType>(_AirPassDetail_QNAME, AirPassDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Attributes")
    public JAXBElement<AttributesType> createAttributes(AttributesType value) {
        return new JAXBElement<AttributesType>(_Attributes_QNAME, AttributesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BagAllowanceDescType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AllowanceDescription")
    public JAXBElement<BagAllowanceDescType> createAllowanceDescription(BagAllowanceDescType value) {
        return new JAXBElement<BagAllowanceDescType>(_AllowanceDescription_QNAME, BagAllowanceDescType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BagAllowanceDimensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DimensionAllowance")
    public JAXBElement<BagAllowanceDimensionType> createDimensionAllowance(BagAllowanceDimensionType value) {
        return new JAXBElement<BagAllowanceDimensionType>(_DimensionAllowance_QNAME, BagAllowanceDimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CityName")
    public JAXBElement<String> createCityName(String value) {
        return new JAXBElement<String>(_CityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AddressContact")
    public JAXBElement<AddressContactType> createAddressContact(AddressContactType value) {
        return new JAXBElement<AddressContactType>(_AddressContact_QNAME, AddressContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "EmailContact")
    public JAXBElement<EmailType> createEmailContact(EmailType value) {
        return new JAXBElement<EmailType>(_EmailContact_QNAME, EmailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "EmailAddress")
    public JAXBElement<EmailType> createEmailAddress(EmailType value) {
        return new JAXBElement<EmailType>(_EmailAddress_QNAME, EmailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneContactType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PhoneContact")
    public JAXBElement<PhoneContactType> createPhoneContact(PhoneContactType value) {
        return new JAXBElement<PhoneContactType>(_PhoneContact_QNAME, PhoneContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PhoneNumber")
    public JAXBElement<PhoneType> createPhoneNumber(PhoneType value) {
        return new JAXBElement<PhoneType>(_PhoneNumber_QNAME, PhoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherContactMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OtherContactMethod")
    public JAXBElement<OtherContactMethodType> createOtherContactMethod(OtherContactMethodType value) {
        return new JAXBElement<OtherContactMethodType>(_OtherContactMethod_QNAME, OtherContactMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommissionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Commission")
    public JAXBElement<CommissionType> createCommission(CommissionType value) {
        return new JAXBElement<CommissionType>(_Commission_QNAME, CommissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CurrencyAmount")
    public JAXBElement<CurrencyAmountOptType> createCurrencyAmount(CurrencyAmountOptType value) {
        return new JAXBElement<CurrencyAmountOptType>(_CurrencyAmount_QNAME, CurrencyAmountOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountEncodedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "EncodedCurrencyAmount")
    public JAXBElement<CurrencyAmountEncodedType> createEncodedCurrencyAmount(CurrencyAmountEncodedType value) {
        return new JAXBElement<CurrencyAmountEncodedType>(_EncodedCurrencyAmount_QNAME, CurrencyAmountEncodedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OriginDestinationReference")
    @XmlIDREF
    public JAXBElement<Object> createOriginDestinationReference(Object value) {
        return new JAXBElement<Object>(_OriginDestinationReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DescriptionReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createDescriptionReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_DescriptionReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MediaID")
    public JAXBElement<MediaIDType> createMediaID(MediaIDType value) {
        return new JAXBElement<MediaIDType>(_MediaID_QNAME, MediaIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaAttachmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MediaAttachment")
    public JAXBElement<MediaAttachmentType> createMediaAttachment(MediaAttachmentType value) {
        return new JAXBElement<MediaAttachmentType>(_MediaAttachment_QNAME, MediaAttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Direction")
    public JAXBElement<DirectionsType> createDirection(DirectionsType value) {
        return new JAXBElement<DirectionsType>(_Direction_QNAME, DirectionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DiscountAmount")
    public JAXBElement<CurrencyAmountOptType> createDiscountAmount(CurrencyAmountOptType value) {
        return new JAXBElement<CurrencyAmountOptType>(_DiscountAmount_QNAME, CurrencyAmountOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DiscountPercent")
    public JAXBElement<Integer> createDiscountPercent(Integer value) {
        return new JAXBElement<Integer>(_DiscountPercent_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FQTVProgramCoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FQTV_ProgramCore")
    public JAXBElement<FQTVProgramCoreType> createFQTVProgramCore(FQTVProgramCoreType value) {
        return new JAXBElement<FQTVProgramCoreType>(_FQTVProgramCore_QNAME, FQTVProgramCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FQTVProgramSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FQTV_ProgramSummary")
    public JAXBElement<FQTVProgramSummaryType> createFQTVProgramSummary(FQTVProgramSummaryType value) {
        return new JAXBElement<FQTVProgramSummaryType>(_FQTVProgramSummary_QNAME, FQTVProgramSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FQTVProgramDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FQTV_ProgramDetail")
    public JAXBElement<FQTVProgramDetailType> createFQTVProgramDetail(FQTVProgramDetailType value) {
        return new JAXBElement<FQTVProgramDetailType>(_FQTVProgramDetail_QNAME, FQTVProgramDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FQTVAllianceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FQTV_Alliance")
    public JAXBElement<FQTVAllianceType> createFQTVAlliance(FQTVAllianceType value) {
        return new JAXBElement<FQTVAllianceType>(_FQTVAlliance_QNAME, FQTVAllianceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FQTVProgramIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FQTV_ProgramID")
    public JAXBElement<FQTVProgramIDType> createFQTVProgramID(FQTVProgramIDType value) {
        return new JAXBElement<FQTVProgramIDType>(_FQTVProgramID_QNAME, FQTVProgramIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelerFQTVType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TravelerFQTV_Information")
    public JAXBElement<TravelerFQTVType> createTravelerFQTVInformation(TravelerFQTVType value) {
        return new JAXBElement<TravelerFQTVType>(_TravelerFQTVInformation_QNAME, TravelerFQTVType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllianceProgramType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ParticipatingProgram")
    public JAXBElement<AllianceProgramType> createParticipatingProgram(AllianceProgramType value) {
        return new JAXBElement<AllianceProgramType>(_ParticipatingProgram_QNAME, AllianceProgramType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllianceAirlinePartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ParticipatingAirline")
    public JAXBElement<AllianceAirlinePartyType> createParticipatingAirline(AllianceAirlinePartyType value) {
        return new JAXBElement<AllianceAirlinePartyType>(_ParticipatingAirline_QNAME, AllianceAirlinePartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstantPurchaseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "InstantPurchase")
    public JAXBElement<InstantPurchaseType> createInstantPurchase(InstantPurchaseType value) {
        return new JAXBElement<InstantPurchaseType>(_InstantPurchase_QNAME, InstantPurchaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "LanguageCode")
    public JAXBElement<LanguageCodeType> createLanguageCode(LanguageCodeType value) {
        return new JAXBElement<LanguageCodeType>(_LanguageCode_QNAME, LanguageCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CampaignReferralType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CampaignReferral")
    public JAXBElement<CampaignReferralType> createCampaignReferral(CampaignReferralType value) {
        return new JAXBElement<CampaignReferralType>(_CampaignReferral_QNAME, CampaignReferralType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodePathType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "NodePath")
    public JAXBElement<NodePathType> createNodePath(NodePathType value) {
        return new JAXBElement<NodePathType>(_NodePath_QNAME, NodePathType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BankAccount")
    public JAXBElement<BankAccountType> createBankAccount(BankAccountType value) {
        return new JAXBElement<BankAccountType>(_BankAccount_QNAME, BankAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectBillType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DirectBill")
    public JAXBElement<DirectBillType> createDirectBill(DirectBillType value) {
        return new JAXBElement<DirectBillType>(_DirectBill_QNAME, DirectBillType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemarkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Remarks")
    public JAXBElement<RemarkType> createRemarks(RemarkType value) {
        return new JAXBElement<RemarkType>(_Remarks_QNAME, RemarkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PaymentCard")
    public JAXBElement<PaymentCardType> createPaymentCard(PaymentCardType value) {
        return new JAXBElement<PaymentCardType>(_PaymentCard_QNAME, PaymentCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PenaltyDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Penalty")
    public JAXBElement<PenaltyDetailType> createPenalty(PenaltyDetailType value) {
        return new JAXBElement<PenaltyDetailType>(_Penalty_QNAME, PenaltyDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailCurrencyPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DetailCurrencyPrice")
    public JAXBElement<DetailCurrencyPriceType> createDetailCurrencyPrice(DetailCurrencyPriceType value) {
        return new JAXBElement<DetailCurrencyPriceType>(_DetailCurrencyPrice_QNAME, DetailCurrencyPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AwardPriceUnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AwardPricing")
    public JAXBElement<AwardPriceUnitType> createAwardPricing(AwardPriceUnitType value) {
        return new JAXBElement<AwardPriceUnitType>(_AwardPricing_QNAME, AwardPriceUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombinationPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CombinationPricing")
    public JAXBElement<CombinationPriceType> createCombinationPricing(CombinationPriceType value) {
        return new JAXBElement<CombinationPriceType>(_CombinationPricing_QNAME, CombinationPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncodedPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "EncodedCurrencyPrice")
    public JAXBElement<EncodedPriceType> createEncodedCurrencyPrice(EncodedPriceType value) {
        return new JAXBElement<EncodedPriceType>(_EncodedCurrencyPrice_QNAME, EncodedPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleCurrencyPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SimpleCurrencyPrice")
    public JAXBElement<SimpleCurrencyPriceType> createSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
        return new JAXBElement<SimpleCurrencyPriceType>(_SimpleCurrencyPrice_QNAME, SimpleCurrencyPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AwardRedemptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AwardRedemption")
    public JAXBElement<AwardRedemptionType> createAwardRedemption(AwardRedemptionType value) {
        return new JAXBElement<AwardRedemptionType>(_AwardRedemption_QNAME, AwardRedemptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AdjustedFixedAmount")
    public JAXBElement<CurrencyAmountOptType> createAdjustedFixedAmount(CurrencyAmountOptType value) {
        return new JAXBElement<CurrencyAmountOptType>(_AdjustedFixedAmount_QNAME, CurrencyAmountOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AdjustedPercentage")
    public JAXBElement<BigDecimal> createAdjustedPercentage(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AdjustedPercentage_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CurrencyAmountValue")
    public JAXBElement<CurrencyAmountOptType> createCurrencyAmountValue(CurrencyAmountOptType value) {
        return new JAXBElement<CurrencyAmountOptType>(_CurrencyAmountValue_QNAME, CurrencyAmountOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PercentageValue")
    public JAXBElement<BigDecimal> createPercentageValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PercentageValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PromotionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Promos")
    public JAXBElement<PromotionType> createPromos(PromotionType value) {
        return new JAXBElement<PromotionType>(_Promos_QNAME, PromotionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingResponseIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ShoppingResponseID")
    public JAXBElement<ShoppingResponseIDType> createShoppingResponseID(ShoppingResponseIDType value) {
        return new JAXBElement<ShoppingResponseIDType>(_ShoppingResponseID_QNAME, ShoppingResponseIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateProvCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "StateProvCode")
    public JAXBElement<StateProvCodeType> createStateProvCode(StateProvCodeType value) {
        return new JAXBElement<StateProvCodeType>(_StateProvCode_QNAME, StateProvCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateProvQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "StateProvQuery")
    public JAXBElement<StateProvQueryType> createStateProvQuery(StateProvQueryType value) {
        return new JAXBElement<StateProvQueryType>(_StateProvQuery_QNAME, StateProvQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateProvCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "StateCode")
    public JAXBElement<StateProvCodeType> createStateCode(StateProvCodeType value) {
        return new JAXBElement<StateProvCodeType>(_StateCode_QNAME, StateProvCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TaxBreakdown")
    public JAXBElement<TaxDetailType> createTaxBreakdown(TaxDetailType value) {
        return new JAXBElement<TaxDetailType>(_TaxBreakdown_QNAME, TaxDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxExemptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TaxExemption")
    public JAXBElement<TaxExemptionType> createTaxExemption(TaxExemptionType value) {
        return new JAXBElement<TaxExemptionType>(_TaxExemption_QNAME, TaxExemptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketDesignatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TicketDesig")
    public JAXBElement<TicketDesignatorType> createTicketDesig(TicketDesignatorType value) {
        return new JAXBElement<TicketDesignatorType>(_TicketDesig_QNAME, TicketDesignatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTimeLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PaymentTimeLimit")
    public JAXBElement<PaymentTimeLimitType> createPaymentTimeLimit(PaymentTimeLimitType value) {
        return new JAXBElement<PaymentTimeLimitType>(_PaymentTimeLimit_QNAME, PaymentTimeLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceGuaranteeTimeLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PriceGuaranteeTimeLimits")
    public JAXBElement<PriceGuaranteeTimeLimitType> createPriceGuaranteeTimeLimits(PriceGuaranteeTimeLimitType value) {
        return new JAXBElement<PriceGuaranteeTimeLimitType>(_PriceGuaranteeTimeLimits_QNAME, PriceGuaranteeTimeLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnonymousTravelerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AnonymousTraveler")
    public JAXBElement<AnonymousTravelerType> createAnonymousTraveler(AnonymousTravelerType value) {
        return new JAXBElement<AnonymousTravelerType>(_AnonymousTraveler_QNAME, AnonymousTravelerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelerDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "RecognizedTraveler")
    public JAXBElement<TravelerDetailType> createRecognizedTraveler(TravelerDetailType value) {
        return new JAXBElement<TravelerDetailType>(_RecognizedTraveler_QNAME, TravelerDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DetailPassenger")
    public JAXBElement<PassengerDetailType> createDetailPassenger(PassengerDetailType value) {
        return new JAXBElement<PassengerDetailType>(_DetailPassenger_QNAME, PassengerDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SummaryPassenger")
    public JAXBElement<PassengerSummaryType> createSummaryPassenger(PassengerSummaryType value) {
        return new JAXBElement<PassengerSummaryType>(_SummaryPassenger_QNAME, PassengerSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailerIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "RetailerID")
    public JAXBElement<RetailerIDType> createRetailerID(RetailerIDType value) {
        return new JAXBElement<RetailerIDType>(_RetailerID_QNAME, RetailerIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingCarrierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MarketingCarrierAirline")
    public JAXBElement<MarketingCarrierType> createMarketingCarrierAirline(MarketingCarrierType value) {
        return new JAXBElement<MarketingCarrierType>(_MarketingCarrierAirline_QNAME, MarketingCarrierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingCarrierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OperatingCarrierAirline")
    public JAXBElement<OperatingCarrierType> createOperatingCarrierAirline(OperatingCarrierType value) {
        return new JAXBElement<OperatingCarrierType>(_OperatingCarrierAirline_QNAME, OperatingCarrierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "RetailPartner")
    public JAXBElement<RetailerType> createRetailPartner(RetailerType value) {
        return new JAXBElement<RetailerType>(_RetailPartner_QNAME, RetailerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ValidatingCarrier")
    public JAXBElement<String> createValidatingCarrier(String value) {
        return new JAXBElement<String>(_ValidatingCarrier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AggregatorID")
    public JAXBElement<AggregatorIDType> createAggregatorID(AggregatorIDType value) {
        return new JAXBElement<AggregatorIDType>(_AggregatorID_QNAME, AggregatorIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Aggregator")
    public JAXBElement<AggregatorType> createAggregator(AggregatorType value) {
        return new JAXBElement<AggregatorType>(_Aggregator_QNAME, AggregatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledSystemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "EnabledSystem")
    public JAXBElement<EnabledSystemType> createEnabledSystem(EnabledSystemType value) {
        return new JAXBElement<EnabledSystemType>(_EnabledSystem_QNAME, EnabledSystemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleOfIntermediaryReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "RoleOfIntermediaryReference")
    public JAXBElement<RoleOfIntermediaryReferenceType> createRoleOfIntermediaryReference(RoleOfIntermediaryReferenceType value) {
        return new JAXBElement<RoleOfIntermediaryReferenceType>(_RoleOfIntermediaryReference_QNAME, RoleOfIntermediaryReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SystemID")
    public JAXBElement<SystemIDType> createSystemID(SystemIDType value) {
        return new JAXBElement<SystemIDType>(_SystemID_QNAME, SystemIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentUserType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AgentUser")
    public JAXBElement<AgentUserType> createAgentUser(AgentUserType value) {
        return new JAXBElement<AgentUserType>(_AgentUser_QNAME, AgentUserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgencyIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AgencyID")
    public JAXBElement<AgencyIDType> createAgencyID(AgencyIDType value) {
        return new JAXBElement<AgencyIDType>(_AgencyID_QNAME, AgencyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentUserIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AgentUserID")
    public JAXBElement<AgentUserIDType> createAgentUserID(AgentUserIDType value) {
        return new JAXBElement<AgentUserIDType>(_AgentUserID_QNAME, AgentUserIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerCompanyIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PartnerID")
    public JAXBElement<PartnerCompanyIDType> createPartnerID(PartnerCompanyIDType value) {
        return new JAXBElement<PartnerCompanyIDType>(_PartnerID_QNAME, PartnerCompanyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FulfillmentPartnerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FulfillmentPartner")
    public JAXBElement<FulfillmentPartnerType> createFulfillmentPartner(FulfillmentPartnerType value) {
        return new JAXBElement<FulfillmentPartnerType>(_FulfillmentPartner_QNAME, FulfillmentPartnerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Device")
    public JAXBElement<DeviceType> createDevice(DeviceType value) {
        return new JAXBElement<DeviceType>(_Device_QNAME, DeviceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgDocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Document")
    public JAXBElement<MsgDocumentType> createDocument(MsgDocumentType value) {
        return new JAXBElement<MsgDocumentType>(_Document_QNAME, MsgDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PolicyLink")
    public JAXBElement<String> createPolicyLink(String value) {
        return new JAXBElement<String>(_PolicyLink_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointOfSaleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PointOfSale")
    public JAXBElement<PointOfSaleType> createPointOfSale(PointOfSaleType value) {
        return new JAXBElement<PointOfSaleType>(_PointOfSale_QNAME, PointOfSaleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgPartiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Party")
    public JAXBElement<MsgPartiesType> createParty(MsgPartiesType value) {
        return new JAXBElement<MsgPartiesType>(_Party_QNAME, MsgPartiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ORAAirlineSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ORA_Sender")
    public JAXBElement<ORAAirlineSenderType> createORASender(ORAAirlineSenderType value) {
        return new JAXBElement<ORAAirlineSenderType>(_ORASender_QNAME, ORAAirlineSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POAAirlineSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "POA_Sender")
    public JAXBElement<POAAirlineSenderType> createPOASender(POAAirlineSenderType value) {
        return new JAXBElement<POAAirlineSenderType>(_POASender_QNAME, POAAirlineSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AggregatorSender")
    public JAXBElement<AggregatorSenderType> createAggregatorSender(AggregatorSenderType value) {
        return new JAXBElement<AggregatorSenderType>(_AggregatorSender_QNAME, AggregatorSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentUserSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AgentUserSender")
    public JAXBElement<AgentUserSenderType> createAgentUserSender(AgentUserSenderType value) {
        return new JAXBElement<AgentUserSenderType>(_AgentUserSender_QNAME, AgentUserSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledSysSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "EnabledSystemSender")
    public JAXBElement<EnabledSysSenderType> createEnabledSystemSender(EnabledSysSenderType value) {
        return new JAXBElement<EnabledSysSenderType>(_EnabledSystemSender_QNAME, EnabledSysSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingCarrierSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MarketingCarrierSender")
    public JAXBElement<MarketingCarrierSenderType> createMarketingCarrierSender(MarketingCarrierSenderType value) {
        return new JAXBElement<MarketingCarrierSenderType>(_MarketingCarrierSender_QNAME, MarketingCarrierSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingCarrierSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OperatingCarrierSender")
    public JAXBElement<OperatingCarrierSenderType> createOperatingCarrierSender(OperatingCarrierSenderType value) {
        return new JAXBElement<OperatingCarrierSenderType>(_OperatingCarrierSender_QNAME, OperatingCarrierSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailSupplierSenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "RetailPartnerSender")
    public JAXBElement<RetailSupplierSenderType> createRetailPartnerSender(RetailSupplierSenderType value) {
        return new JAXBElement<RetailSupplierSenderType>(_RetailPartnerSender_QNAME, RetailSupplierSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelAgencySenderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TravelAgencySender")
    public JAXBElement<TravelAgencySenderType> createTravelAgencySender(TravelAgencySenderType value) {
        return new JAXBElement<TravelAgencySenderType>(_TravelAgencySender_QNAME, TravelAgencySenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AggregatorRecipient")
    public JAXBElement<AggregatorRecipientType> createAggregatorRecipient(AggregatorRecipientType value) {
        return new JAXBElement<AggregatorRecipientType>(_AggregatorRecipient_QNAME, AggregatorRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentUserRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AgentUserRecipient")
    public JAXBElement<AgentUserRecipientType> createAgentUserRecipient(AgentUserRecipientType value) {
        return new JAXBElement<AgentUserRecipientType>(_AgentUserRecipient_QNAME, AgentUserRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledSysRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "EnabledSystemRecipient")
    public JAXBElement<EnabledSysRecipientType> createEnabledSystemRecipient(EnabledSysRecipientType value) {
        return new JAXBElement<EnabledSysRecipientType>(_EnabledSystemRecipient_QNAME, EnabledSysRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingCarrierRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MarketingCarrierRecipient")
    public JAXBElement<MarketingCarrierRecipientType> createMarketingCarrierRecipient(MarketingCarrierRecipientType value) {
        return new JAXBElement<MarketingCarrierRecipientType>(_MarketingCarrierRecipient_QNAME, MarketingCarrierRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingCarrierRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OperatingCarrierRecipient")
    public JAXBElement<OperatingCarrierRecipientType> createOperatingCarrierRecipient(OperatingCarrierRecipientType value) {
        return new JAXBElement<OperatingCarrierRecipientType>(_OperatingCarrierRecipient_QNAME, OperatingCarrierRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ORAAirlineRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ORA_Recipient")
    public JAXBElement<ORAAirlineRecipientType> createORARecipient(ORAAirlineRecipientType value) {
        return new JAXBElement<ORAAirlineRecipientType>(_ORARecipient_QNAME, ORAAirlineRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POAAirlineRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "POA_Recipient")
    public JAXBElement<POAAirlineRecipientType> createPOARecipient(POAAirlineRecipientType value) {
        return new JAXBElement<POAAirlineRecipientType>(_POARecipient_QNAME, POAAirlineRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailSupplierRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "RetailPartnerRecipient")
    public JAXBElement<RetailSupplierRecipientType> createRetailPartnerRecipient(RetailSupplierRecipientType value) {
        return new JAXBElement<RetailSupplierRecipientType>(_RetailPartnerRecipient_QNAME, RetailSupplierRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelAgencyRecipientType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TravelAgencyRecipient")
    public JAXBElement<TravelAgencyRecipientType> createTravelAgencyRecipient(TravelAgencyRecipientType value) {
        return new JAXBElement<TravelAgencyRecipientType>(_TravelAgencyRecipient_QNAME, TravelAgencyRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AggregatorParticipant")
    public JAXBElement<AggregatorParticipantType> createAggregatorParticipant(AggregatorParticipantType value) {
        return new JAXBElement<AggregatorParticipantType>(_AggregatorParticipant_QNAME, AggregatorParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledSysParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "EnabledSystemParticipant")
    public JAXBElement<EnabledSysParticipantType> createEnabledSystemParticipant(EnabledSysParticipantType value) {
        return new JAXBElement<EnabledSysParticipantType>(_EnabledSystemParticipant_QNAME, EnabledSysParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingCarrierParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MarketingCarrierParticipant")
    public JAXBElement<MarketingCarrierParticipantType> createMarketingCarrierParticipant(MarketingCarrierParticipantType value) {
        return new JAXBElement<MarketingCarrierParticipantType>(_MarketingCarrierParticipant_QNAME, MarketingCarrierParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingCarrierParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OperatingCarrierParticipant")
    public JAXBElement<OperatingCarrierParticipantType> createOperatingCarrierParticipant(OperatingCarrierParticipantType value) {
        return new JAXBElement<OperatingCarrierParticipantType>(_OperatingCarrierParticipant_QNAME, OperatingCarrierParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ORAAirlineParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ORA_Participant")
    public JAXBElement<ORAAirlineParticipantType> createORAParticipant(ORAAirlineParticipantType value) {
        return new JAXBElement<ORAAirlineParticipantType>(_ORAParticipant_QNAME, ORAAirlineParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POAAirlineParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "POA_Participant")
    public JAXBElement<POAAirlineParticipantType> createPOAParticipant(POAAirlineParticipantType value) {
        return new JAXBElement<POAAirlineParticipantType>(_POAParticipant_QNAME, POAAirlineParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailSupplierParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "RetailSupplierParticipant")
    public JAXBElement<RetailSupplierParticipantType> createRetailSupplierParticipant(RetailSupplierParticipantType value) {
        return new JAXBElement<RetailSupplierParticipantType>(_RetailSupplierParticipant_QNAME, RetailSupplierParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelAgencyParticipantType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TravelAgencyParticipant")
    public JAXBElement<TravelAgencyParticipantType> createTravelAgencyParticipant(TravelAgencyParticipantType value) {
        return new JAXBElement<TravelAgencyParticipantType>(_TravelAgencyParticipant_QNAME, TravelAgencyParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OtherInfo")
    public JAXBElement<ProcessingResultType> createOtherInfo(ProcessingResultType value) {
        return new JAXBElement<ProcessingResultType>(_OtherInfo_QNAME, ProcessingResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TrxProcessStatus")
    public JAXBElement<String> createTrxProcessStatus(String value) {
        return new JAXBElement<String>(_TrxProcessStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodesetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TrxPayloadType")
    public JAXBElement<CodesetType> createTrxPayloadType(CodesetType value) {
        return new JAXBElement<CodesetType>(_TrxPayloadType_QNAME, CodesetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Alert")
    public JAXBElement<AlertType> createAlert(AlertType value) {
        return new JAXBElement<AlertType>(_Alert_QNAME, AlertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Associations")
    public JAXBElement<OrderItemAssociationType> createAssociations(OrderItemAssociationType value) {
        return new JAXBElement<OrderItemAssociationType>(_Associations_QNAME, OrderItemAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvDiscrepencyAlertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "InventoryDiscrepancyAlert")
    public JAXBElement<InvDiscrepencyAlertType> createInventoryDiscrepancyAlert(InvDiscrepencyAlertType value) {
        return new JAXBElement<InvDiscrepencyAlertType>(_InventoryDiscrepancyAlert_QNAME, InvDiscrepencyAlertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PINAuthTravelerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PIN_AuthenticationAlert")
    public JAXBElement<PINAuthTravelerType> createPINAuthenticationAlert(PINAuthTravelerType value) {
        return new JAXBElement<PINAuthTravelerType>(_PINAuthenticationAlert_QNAME, PINAuthTravelerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurePaymentAlertType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SecurePaymentAlert")
    public JAXBElement<SecurePaymentAlertType> createSecurePaymentAlert(SecurePaymentAlertType value) {
        return new JAXBElement<SecurePaymentAlertType>(_SecurePaymentAlert_QNAME, SecurePaymentAlertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MerchantName")
    public JAXBElement<String> createMerchantName(String value) {
        return new JAXBElement<String>(_MerchantName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "NoticesGrp")
    public JAXBElement<Object> createNoticesGrp(Object value) {
        return new JAXBElement<Object>(_NoticesGrp_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvGuaranteeNoticeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "InventoryGuaranteeNotif")
    public JAXBElement<InvGuaranteeNoticeType> createInventoryGuaranteeNotif(InvGuaranteeNoticeType value) {
        return new JAXBElement<InvGuaranteeNoticeType>(_InventoryGuaranteeNotif_QNAME, InvGuaranteeNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentRulesNoticeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PaymentRulesNotice")
    public JAXBElement<PaymentRulesNoticeType> createPaymentRulesNotice(PaymentRulesNoticeType value) {
        return new JAXBElement<PaymentRulesNoticeType>(_PaymentRulesNotice_QNAME, PaymentRulesNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingParametersNoticeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PricingParametersNotice")
    public JAXBElement<PricingParametersNoticeType> createPricingParametersNotice(PricingParametersNoticeType value) {
        return new JAXBElement<PricingParametersNoticeType>(_PricingParametersNotice_QNAME, PricingParametersNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFilterNoticeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceFilterNotice")
    public JAXBElement<ServiceFilterNoticeType> createServiceFilterNotice(ServiceFilterNoticeType value) {
        return new JAXBElement<ServiceFilterNoticeType>(_ServiceFilterNotice_QNAME, ServiceFilterNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxExemptionNoticeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TaxExemptionNotice")
    public JAXBElement<TaxExemptionNoticeType> createTaxExemptionNotice(TaxExemptionNoticeType value) {
        return new JAXBElement<TaxExemptionNoticeType>(_TaxExemptionNotice_QNAME, TaxExemptionNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CompanyList")
    public JAXBElement<Object> createCompanyList(Object value) {
        return new JAXBElement<Object>(_CompanyList_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfOfferTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TermsList")
    public JAXBElement<ListOfOfferTermsType> createTermsList(ListOfOfferTermsType value) {
        return new JAXBElement<ListOfOfferTermsType>(_TermsList_QNAME, ListOfOfferTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareCode")
    public JAXBElement<FareCodeType> createFareCode(FareCodeType value) {
        return new JAXBElement<FareCodeType>(_FareCode_QNAME, FareCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareBasisCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareBasisCode")
    public JAXBElement<FareBasisCodeType> createFareBasisCode(FareBasisCodeType value) {
        return new JAXBElement<FareBasisCodeType>(_FareBasisCode_QNAME, FareBasisCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Fare")
    public JAXBElement<FareType> createFare(FareType value) {
        return new JAXBElement<FareType>(_Fare_QNAME, FareType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareDetail")
    public JAXBElement<FareDetailType> createFareDetail(FareDetailType value) {
        return new JAXBElement<FareDetailType>(_FareDetail_QNAME, FareDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareCalculation")
    public JAXBElement<String> createFareCalculation(String value) {
        return new JAXBElement<String>(_FareCalculation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareRulesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareRules")
    public JAXBElement<FareRulesType> createFareRules(FareRulesType value) {
        return new JAXBElement<FareRulesType>(_FareRules_QNAME, FareRulesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TourCode")
    public JAXBElement<String> createTourCode(String value) {
        return new JAXBElement<String>(_TourCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareComponentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareComponent")
    public JAXBElement<FareComponentType> createFareComponent(FareComponentType value) {
        return new JAXBElement<FareComponentType>(_FareComponent_QNAME, FareComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareBasisCityPair")
    public JAXBElement<String> createFareBasisCityPair(String value) {
        return new JAXBElement<String>(_FareBasisCityPair_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PricedMarketName")
    public JAXBElement<String> createPricedMarketName(String value) {
        return new JAXBElement<String>(_PricedMarketName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PricedMileageZone")
    public JAXBElement<String> createPricedMileageZone(String value) {
        return new JAXBElement<String>(_PricedMileageZone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareFilingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareFiledIn")
    public JAXBElement<FareFilingType> createFareFiledIn(FareFilingType value) {
        return new JAXBElement<FareFilingType>(_FareFiledIn_QNAME, FareFilingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodesetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareInd")
    public JAXBElement<CodesetType> createFareInd(CodesetType value) {
        return new JAXBElement<CodesetType>(_FareInd_QNAME, CodesetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodesetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareRuleCategory")
    public JAXBElement<CodesetType> createFareRuleCategory(CodesetType value) {
        return new JAXBElement<CodesetType>(_FareRuleCategory_QNAME, CodesetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareTextInd")
    public JAXBElement<String> createFareTextInd(String value) {
        return new JAXBElement<String>(_FareTextInd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightCOSCoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ClassOfService")
    public JAXBElement<FlightCOSCoreType> createClassOfService(FlightCOSCoreType value) {
        return new JAXBElement<FlightCOSCoreType>(_ClassOfService_QNAME, FlightCOSCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "StopLocations")
    public JAXBElement<StopLocationType> createStopLocations(StopLocationType value) {
        return new JAXBElement<StopLocationType>(_StopLocations_QNAME, StopLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightArrivalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Arrival")
    public JAXBElement<FlightArrivalType> createArrival(FlightArrivalType value) {
        return new JAXBElement<FlightArrivalType>(_Arrival_QNAME, FlightArrivalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DepartureDate")
    public JAXBElement<XMLGregorianCalendar> createDepartureDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DepartureDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDistanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FlightDistance")
    public JAXBElement<FlightDistanceType> createFlightDistance(FlightDistanceType value) {
        return new JAXBElement<FlightDistanceType>(_FlightDistance_QNAME, FlightDistanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDurationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FlightDuration")
    public JAXBElement<FlightDurationType> createFlightDuration(FlightDurationType value) {
        return new JAXBElement<FlightDurationType>(_FlightDuration_QNAME, FlightDurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalJourneyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TotalJourney")
    public JAXBElement<TotalJourneyType> createTotalJourney(TotalJourneyType value) {
        return new JAXBElement<TotalJourneyType>(_TotalJourney_QNAME, TotalJourneyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FlightStatus")
    public JAXBElement<FlightStatusType> createFlightStatus(FlightStatusType value) {
        return new JAXBElement<FlightStatusType>(_FlightStatus_QNAME, FlightStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightMealsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MealsServed")
    public JAXBElement<FlightMealsType> createMealsServed(FlightMealsType value) {
        return new JAXBElement<FlightMealsType>(_MealsServed_QNAME, FlightMealsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFrequencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Frequency")
    public JAXBElement<FlightFrequencyType> createFrequency(FlightFrequencyType value) {
        return new JAXBElement<FlightFrequencyType>(_Frequency_QNAME, FlightFrequencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightMileageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FlightMileage")
    public JAXBElement<FlightMileageType> createFlightMileage(FlightMileageType value) {
        return new JAXBElement<FlightMileageType>(_FlightMileage_QNAME, FlightMileageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FlightDisplayPricingMethod")
    public JAXBElement<Object> createFlightDisplayPricingMethod(Object value) {
        return new JAXBElement<Object>(_FlightDisplayPricingMethod_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodesetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FlightSegmentType")
    public JAXBElement<CodesetType> createFlightSegmentType(CodesetType value) {
        return new JAXBElement<CodesetType>(_FlightSegmentType_QNAME, CodesetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftCoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AircraftCore")
    public JAXBElement<AircraftCoreType> createAircraftCore(AircraftCoreType value) {
        return new JAXBElement<AircraftCoreType>(_AircraftCore_QNAME, AircraftCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AircraftSummary")
    public JAXBElement<AircraftSummaryType> createAircraftSummary(AircraftSummaryType value) {
        return new JAXBElement<AircraftSummaryType>(_AircraftSummary_QNAME, AircraftSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftSummaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Equipment")
    public JAXBElement<AircraftSummaryType> createEquipment(AircraftSummaryType value) {
        return new JAXBElement<AircraftSummaryType>(_Equipment_QNAME, AircraftSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftCodeQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AircraftCodeQuery")
    public JAXBElement<AircraftCodeQueryType> createAircraftCodeQuery(AircraftCodeQueryType value) {
        return new JAXBElement<AircraftCodeQueryType>(_AircraftCodeQuery_QNAME, AircraftCodeQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftFeaturesQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AircraftFeaturesQuery")
    public JAXBElement<AircraftFeaturesQueryType> createAircraftFeaturesQuery(AircraftFeaturesQueryType value) {
        return new JAXBElement<AircraftFeaturesQueryType>(_AircraftFeaturesQuery_QNAME, AircraftFeaturesQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftCabinType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AircraftCabin")
    public JAXBElement<AircraftCabinType> createAircraftCabin(AircraftCabinType value) {
        return new JAXBElement<AircraftCabinType>(_AircraftCabin_QNAME, AircraftCabinType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OriginDestinationReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createOriginDestinationReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_OriginDestinationReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Itinerary")
    public JAXBElement<ItineraryType> createItinerary(ItineraryType value) {
        return new JAXBElement<ItineraryType>(_Itinerary_QNAME, ItineraryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferItemID")
    public JAXBElement<ItemIDType> createOfferItemID(ItemIDType value) {
        return new JAXBElement<ItemIDType>(_OfferItemID_QNAME, ItemIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderItemID")
    public JAXBElement<ItemIDType> createOrderItemID(ItemIDType value) {
        return new JAXBElement<ItemIDType>(_OrderItemID_QNAME, ItemIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AircraftKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createAircraftKey(String value) {
        return new JAXBElement<String>(_AircraftKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AircraftReference")
    @XmlIDREF
    public JAXBElement<Object> createAircraftReference(Object value) {
        return new JAXBElement<Object>(_AircraftReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AirportKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createAirportKey(String value) {
        return new JAXBElement<String>(_AirportKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AirportReference")
    @XmlIDREF
    public JAXBElement<Object> createAirportReference(Object value) {
        return new JAXBElement<Object>(_AirportReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BagDisclosureReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createBagDisclosureReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_BagDisclosureReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CheckedBagReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createCheckedBagReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_CheckedBagReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CarryOnReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createCarryOnReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_CarryOnReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BagDisclosureKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createBagDisclosureKey(String value) {
        return new JAXBElement<String>(_BagDisclosureKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BagDisclosureReference")
    @XmlIDREF
    public JAXBElement<Object> createBagDisclosureReference(Object value) {
        return new JAXBElement<Object>(_BagDisclosureReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CheckedBagKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createCheckedBagKey(String value) {
        return new JAXBElement<String>(_CheckedBagKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CheckedBagReference")
    @XmlIDREF
    public JAXBElement<Object> createCheckedBagReference(Object value) {
        return new JAXBElement<Object>(_CheckedBagReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CarryOnKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createCarryOnKey(String value) {
        return new JAXBElement<String>(_CarryOnKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CarryOnReference")
    @XmlIDREF
    public JAXBElement<Object> createCarryOnReference(Object value) {
        return new JAXBElement<Object>(_CarryOnReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ContentSourceKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createContentSourceKey(String value) {
        return new JAXBElement<String>(_ContentSourceKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ContentSourceReference")
    @XmlIDREF
    public JAXBElement<Object> createContentSourceReference(Object value) {
        return new JAXBElement<Object>(_ContentSourceReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ContentSourceReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createContentSourceReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_ContentSourceReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ListKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createListKey(String value) {
        return new JAXBElement<String>(_ListKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DisclosureKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createDisclosureKey(String value) {
        return new JAXBElement<String>(_DisclosureKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DisclosureReference")
    @XmlIDREF
    public JAXBElement<Object> createDisclosureReference(Object value) {
        return new JAXBElement<Object>(_DisclosureReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DisclosureReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createDisclosureReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_DisclosureReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "EquivalentID_Key")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createEquivalentIDKey(String value) {
        return new JAXBElement<String>(_EquivalentIDKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "EquivalentReference")
    @XmlIDREF
    public JAXBElement<Object> createEquivalentReference(Object value) {
        return new JAXBElement<Object>(_EquivalentReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ExitPosKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createExitPosKey(String value) {
        return new JAXBElement<String>(_ExitPosKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ExitPosReference")
    @XmlIDREF
    public JAXBElement<Object> createExitPosReference(Object value) {
        return new JAXBElement<Object>(_ExitPosReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ExitPosReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createExitPosReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_ExitPosReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createFareKey(String value) {
        return new JAXBElement<String>(_FareKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareReference")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createFareReference(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_FareReference_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareBasisKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createFareBasisKey(String value) {
        return new JAXBElement<String>(_FareBasisKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareBasisReference")
    @XmlIDREF
    public JAXBElement<Object> createFareBasisReference(Object value) {
        return new JAXBElement<Object>(_FareBasisReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareBasisReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createFareBasisReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_FareBasisReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MetadataReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createMetadataReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_MetadataReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceClassKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createServiceClassKey(String value) {
        return new JAXBElement<String>(_ServiceClassKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceClassReference")
    @XmlIDREF
    public JAXBElement<Object> createServiceClassReference(Object value) {
        return new JAXBElement<Object>(_ServiceClassReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceClassReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createServiceClassReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_ServiceClassReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OriginDestinationKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createOriginDestinationKey(String value) {
        return new JAXBElement<String>(_OriginDestinationKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SegmentKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createSegmentKey(String value) {
        return new JAXBElement<String>(_SegmentKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "GroupReference")
    @XmlIDREF
    public JAXBElement<Object> createGroupReference(Object value) {
        return new JAXBElement<Object>(_GroupReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MediaItemKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createMediaItemKey(String value) {
        return new JAXBElement<String>(_MediaItemKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MediaGroupKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createMediaGroupKey(String value) {
        return new JAXBElement<String>(_MediaGroupKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MediaGroupreference")
    @XmlIDREF
    public JAXBElement<Object> createMediaGroupreference(Object value) {
        return new JAXBElement<Object>(_MediaGroupreference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MediaItemReference")
    @XmlIDREF
    public JAXBElement<Object> createMediaItemReference(Object value) {
        return new JAXBElement<Object>(_MediaItemReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MediaItemReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createMediaItemReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_MediaItemReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createOfferKey(String value) {
        return new JAXBElement<String>(_OfferKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferReference")
    @XmlIDREF
    public JAXBElement<Object> createOfferReference(Object value) {
        return new JAXBElement<Object>(_OfferReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createOfferReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_OfferReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferInstructionKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createOfferInstructionKey(String value) {
        return new JAXBElement<String>(_OfferInstructionKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferInstructionReference")
    @XmlIDREF
    public JAXBElement<Object> createOfferInstructionReference(Object value) {
        return new JAXBElement<Object>(_OfferInstructionReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferInstructionReferences")
    @XmlIDREF
    public JAXBElement<Object> createOfferInstructionReferences(Object value) {
        return new JAXBElement<Object>(_OfferInstructionReferences_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferPenaltyKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createOfferPenaltyKey(String value) {
        return new JAXBElement<String>(_OfferPenaltyKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferPenaltyReferences")
    @XmlIDREF
    public JAXBElement<Object> createOfferPenaltyReferences(Object value) {
        return new JAXBElement<Object>(_OfferPenaltyReferences_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferPenaltyReference")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createOfferPenaltyReference(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_OfferPenaltyReference_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferTermsKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createOfferTermsKey(String value) {
        return new JAXBElement<String>(_OfferTermsKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferTermReference")
    @XmlIDREF
    public JAXBElement<Object> createOfferTermReference(Object value) {
        return new JAXBElement<Object>(_OfferTermReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferTermReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createOfferTermReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_OfferTermReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createOrderKey(String value) {
        return new JAXBElement<String>(_OrderKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderReference")
    @XmlIDREF
    public JAXBElement<Object> createOrderReference(Object value) {
        return new JAXBElement<Object>(_OrderReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createOrderReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_OrderReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderItemKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createOrderItemKey(String value) {
        return new JAXBElement<String>(_OrderItemKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderItemReference")
    @XmlIDREF
    public JAXBElement<Object> createOrderItemReference(Object value) {
        return new JAXBElement<Object>(_OrderItemReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderItemReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createOrderItemReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_OrderItemReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderInstructionKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createOrderInstructionKey(String value) {
        return new JAXBElement<String>(_OrderInstructionKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderInstructionReference")
    @XmlIDREF
    public JAXBElement<Object> createOrderInstructionReference(Object value) {
        return new JAXBElement<Object>(_OrderInstructionReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderInstructionReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createOrderInstructionReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_OrderInstructionReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderPenaltyKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createOrderPenaltyKey(String value) {
        return new JAXBElement<String>(_OrderPenaltyKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderPenaltyReferences")
    @XmlIDREF
    public JAXBElement<Object> createOrderPenaltyReferences(Object value) {
        return new JAXBElement<Object>(_OrderPenaltyReferences_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderPenaltyReference")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createOrderPenaltyReference(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_OrderPenaltyReference_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PassengerKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createPassengerKey(String value) {
        return new JAXBElement<String>(_PassengerKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PassengerReference")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createPassengerReference(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_PassengerReference_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PassengerReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createPassengerReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_PassengerReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PriceClassKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createPriceClassKey(String value) {
        return new JAXBElement<String>(_PriceClassKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PriceClassReference")
    @XmlIDREF
    public JAXBElement<Object> createPriceClassReference(Object value) {
        return new JAXBElement<Object>(_PriceClassReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PriceClassReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createPriceClassReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_PriceClassReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createSeatKey(String value) {
        return new JAXBElement<String>(_SeatKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatReference")
    @XmlIDREF
    public JAXBElement<Object> createSeatReference(Object value) {
        return new JAXBElement<Object>(_SeatReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createSeatReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_SeatReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatDisplayKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createSeatDisplayKey(String value) {
        return new JAXBElement<String>(_SeatDisplayKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatDisplayRef")
    @XmlIDREF
    public JAXBElement<Object> createSeatDisplayRef(Object value) {
        return new JAXBElement<Object>(_SeatDisplayRef_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatDisplayReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createSeatDisplayReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_SeatDisplayReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ComponentKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createComponentKey(String value) {
        return new JAXBElement<String>(_ComponentKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ComponentReference")
    @XmlIDREF
    public JAXBElement<Object> createComponentReference(Object value) {
        return new JAXBElement<Object>(_ComponentReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ComponentReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createComponentReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_ComponentReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatMsgKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createSeatMsgKey(String value) {
        return new JAXBElement<String>(_SeatMsgKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatMsgReference")
    @XmlIDREF
    public JAXBElement<Object> createSeatMsgReference(Object value) {
        return new JAXBElement<Object>(_SeatMsgReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatMsgReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createSeatMsgReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_SeatMsgReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createServiceKey(String value) {
        return new JAXBElement<String>(_ServiceKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceReference")
    @XmlIDREF
    public JAXBElement<Object> createServiceReference(Object value) {
        return new JAXBElement<Object>(_ServiceReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createServiceReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_ServiceReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BundleKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createBundleKey(String value) {
        return new JAXBElement<String>(_BundleKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BundleReference")
    @XmlIDREF
    public JAXBElement<Object> createBundleReference(Object value) {
        return new JAXBElement<Object>(_BundleReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BundleReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createBundleReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_BundleReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TravelerKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createTravelerKey(String value) {
        return new JAXBElement<String>(_TravelerKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TravelerReference")
    @XmlIDREF
    public JAXBElement<Object> createTravelerReference(Object value) {
        return new JAXBElement<Object>(_TravelerReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TravelerReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createTravelerReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_TravelerReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "StateProvKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createStateProvKey(String value) {
        return new JAXBElement<String>(_StateProvKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "StateProvReference")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createStateProvReference(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_StateProvReference_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "StateProvReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createStateProvReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_StateProvReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "WingPosKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createWingPosKey(String value) {
        return new JAXBElement<String>(_WingPosKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "WingPosReference")
    @XmlIDREF
    public JAXBElement<Object> createWingPosReference(Object value) {
        return new JAXBElement<Object>(_WingPosReference_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link java.util.List }{@code <}{@link Object }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "WingPosReferences")
    @XmlIDREF
    public JAXBElement<java.util.List<Object>> createWingPosReferences(java.util.List<Object> value) {
        return new JAXBElement<java.util.List<Object>>(_WingPosReferences_QNAME, ((java.lang.Class) java.util.List.class), null, ((java.util.List<Object> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AddressMetadata")
    public JAXBElement<AddressMetadataType> createAddressMetadata(AddressMetadataType value) {
        return new JAXBElement<AddressMetadataType>(_AddressMetadata_QNAME, AddressMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AircraftMetadata")
    public JAXBElement<AircraftMetadataType> createAircraftMetadata(AircraftMetadataType value) {
        return new JAXBElement<AircraftMetadataType>(_AircraftMetadata_QNAME, AircraftMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AirportMetadata")
    public JAXBElement<AirportMetadataType> createAirportMetadata(AirportMetadataType value) {
        return new JAXBElement<AirportMetadataType>(_AirportMetadata_QNAME, AirportMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CityMetadata")
    public JAXBElement<CityMetadataType> createCityMetadata(CityMetadataType value) {
        return new JAXBElement<CityMetadataType>(_CityMetadata_QNAME, CityMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodesetMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CodesetMetadata")
    public JAXBElement<CodesetMetadataType> createCodesetMetadata(CodesetMetadataType value) {
        return new JAXBElement<CodesetMetadataType>(_CodesetMetadata_QNAME, CodesetMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ContactMetadata")
    public JAXBElement<ContactMetadataType> createContactMetadata(ContactMetadataType value) {
        return new JAXBElement<ContactMetadataType>(_ContactMetadata_QNAME, ContactMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ContentMetadata")
    public JAXBElement<ContentMetadataType> createContentMetadata(ContentMetadataType value) {
        return new JAXBElement<ContentMetadataType>(_ContentMetadata_QNAME, ContentMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CountryMetadata")
    public JAXBElement<CountryMetadataType> createCountryMetadata(CountryMetadataType value) {
        return new JAXBElement<CountryMetadataType>(_CountryMetadata_QNAME, CountryMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DescriptionMetadata")
    public JAXBElement<DescriptionMetadataType> createDescriptionMetadata(DescriptionMetadataType value) {
        return new JAXBElement<DescriptionMetadataType>(_DescriptionMetadata_QNAME, DescriptionMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquivalentIDMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "EquivalentID_Metadata")
    public JAXBElement<EquivalentIDMetadataType> createEquivalentIDMetadata(EquivalentIDMetadataType value) {
        return new JAXBElement<EquivalentIDMetadataType>(_EquivalentIDMetadata_QNAME, EquivalentIDMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "LanguageMetadata")
    public JAXBElement<LanguageMetadataType> createLanguageMetadata(LanguageMetadataType value) {
        return new JAXBElement<LanguageMetadataType>(_LanguageMetadata_QNAME, LanguageMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MediaMetadata")
    public JAXBElement<MediaMetadataType> createMediaMetadata(MediaMetadataType value) {
        return new JAXBElement<MediaMetadataType>(_MediaMetadata_QNAME, MediaMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCardMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PaymentCardMetadata")
    public JAXBElement<PaymentCardMetadataType> createPaymentCardMetadata(PaymentCardMetadataType value) {
        return new JAXBElement<PaymentCardMetadataType>(_PaymentCardMetadata_QNAME, PaymentCardMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentFormMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PaymentFormMetadata")
    public JAXBElement<PaymentFormMetadataType> createPaymentFormMetadata(PaymentFormMetadataType value) {
        return new JAXBElement<PaymentFormMetadataType>(_PaymentFormMetadata_QNAME, PaymentFormMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PriceMetadata")
    public JAXBElement<PriceMetadataType> createPriceMetadata(PriceMetadataType value) {
        return new JAXBElement<PriceMetadataType>(_PriceMetadata_QNAME, PriceMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "RuleMetadata")
    public JAXBElement<RuleMetadataType> createRuleMetadata(RuleMetadataType value) {
        return new JAXBElement<RuleMetadataType>(_RuleMetadata_QNAME, RuleMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateProvMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "StateProvMetadata")
    public JAXBElement<StateProvMetadataType> createStateProvMetadata(StateProvMetadataType value) {
        return new JAXBElement<StateProvMetadataType>(_StateProvMetadata_QNAME, StateProvMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ZoneMetadata")
    public JAXBElement<ZoneMetadataType> createZoneMetadata(ZoneMetadataType value) {
        return new JAXBElement<ZoneMetadataType>(_ZoneMetadata_QNAME, ZoneMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageCheckedMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CheckedBagMetadata")
    public JAXBElement<BaggageCheckedMetadataType> createCheckedBagMetadata(BaggageCheckedMetadataType value) {
        return new JAXBElement<BaggageCheckedMetadataType>(_CheckedBagMetadata_QNAME, BaggageCheckedMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageCarryOnMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CarryOnBagMetadata")
    public JAXBElement<BaggageCarryOnMetadataType> createCarryOnBagMetadata(BaggageCarryOnMetadataType value) {
        return new JAXBElement<BaggageCarryOnMetadataType>(_CarryOnBagMetadata_QNAME, BaggageCarryOnMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageDisclosureMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BaggageDisclosureMetadata")
    public JAXBElement<BaggageDisclosureMetadataType> createBaggageDisclosureMetadata(BaggageDisclosureMetadataType value) {
        return new JAXBElement<BaggageDisclosureMetadataType>(_BaggageDisclosureMetadata_QNAME, BaggageDisclosureMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageDetailMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BaggageDetailMetadata")
    public JAXBElement<BaggageDetailMetadataType> createBaggageDetailMetadata(BaggageDetailMetadataType value) {
        return new JAXBElement<BaggageDetailMetadataType>(_BaggageDetailMetadata_QNAME, BaggageDetailMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageQueryMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BaggageQueryMetadata")
    public JAXBElement<BaggageQueryMetadataType> createBaggageQueryMetadata(BaggageQueryMetadataType value) {
        return new JAXBElement<BaggageQueryMetadataType>(_BaggageQueryMetadata_QNAME, BaggageQueryMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ItineraryMetadata")
    public JAXBElement<ItineraryMetadataType> createItineraryMetadata(ItineraryMetadataType value) {
        return new JAXBElement<ItineraryMetadataType>(_ItineraryMetadata_QNAME, ItineraryMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionsMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DirectionMetadata")
    public JAXBElement<DirectionsMetadataType> createDirectionMetadata(DirectionsMetadataType value) {
        return new JAXBElement<DirectionsMetadataType>(_DirectionMetadata_QNAME, DirectionsMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisclosureMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DisclosureMetadata")
    public JAXBElement<DisclosureMetadataType> createDisclosureMetadata(DisclosureMetadataType value) {
        return new JAXBElement<DisclosureMetadataType>(_DisclosureMetadata_QNAME, DisclosureMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferItemMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferMetadata")
    public JAXBElement<OfferItemMetadataType> createOfferMetadata(OfferItemMetadataType value) {
        return new JAXBElement<OfferItemMetadataType>(_OfferMetadata_QNAME, OfferItemMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferInstructionMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferInstructionMetadata")
    public JAXBElement<OfferInstructionMetadataType> createOfferInstructionMetadata(OfferInstructionMetadataType value) {
        return new JAXBElement<OfferInstructionMetadataType>(_OfferInstructionMetadata_QNAME, OfferInstructionMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PenaltyMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferPenaltyMetadata")
    public JAXBElement<PenaltyMetadataType> createOfferPenaltyMetadata(PenaltyMetadataType value) {
        return new JAXBElement<PenaltyMetadataType>(_OfferPenaltyMetadata_QNAME, PenaltyMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferTermsMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferTermsMetadata")
    public JAXBElement<OfferTermsMetadataType> createOfferTermsMetadata(OfferTermsMetadataType value) {
        return new JAXBElement<OfferTermsMetadataType>(_OfferTermsMetadata_QNAME, OfferTermsMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisclosureMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DiscountMetadata")
    public JAXBElement<DisclosureMetadataType> createDiscountMetadata(DisclosureMetadataType value) {
        return new JAXBElement<DisclosureMetadataType>(_DiscountMetadata_QNAME, DisclosureMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggagePricingQualifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BaggagePricingQualifier")
    public JAXBElement<BaggagePricingQualifierType> createBaggagePricingQualifier(BaggagePricingQualifierType value) {
        return new JAXBElement<BaggagePricingQualifierType>(_BaggagePricingQualifier_QNAME, BaggagePricingQualifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderKeysType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderKeys")
    public JAXBElement<OrderKeysType> createOrderKeys(OrderKeysType value) {
        return new JAXBElement<OrderKeysType>(_OrderKeys_QNAME, OrderKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardQualifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PaymentCardQualifiers")
    public JAXBElement<CardQualifierType> createPaymentCardQualifiers(CardQualifierType value) {
        return new JAXBElement<CardQualifierType>(_PaymentCardQualifiers_QNAME, CardQualifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceQualifierPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceQualifier")
    public JAXBElement<ServiceQualifierPriceType> createServiceQualifier(ServiceQualifierPriceType value) {
        return new JAXBElement<ServiceQualifierPriceType>(_ServiceQualifier_QNAME, ServiceQualifierPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialQualiferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SocialMediaQualifiers")
    public JAXBElement<SocialQualiferType> createSocialMediaQualifiers(SocialQualiferType value) {
        return new JAXBElement<SocialQualiferType>(_SocialMediaQualifiers_QNAME, SocialQualiferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareQualifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SpecialFareQualifiers")
    public JAXBElement<FareQualifierType> createSpecialFareQualifiers(FareQualifierType value) {
        return new JAXBElement<FareQualifierType>(_SpecialFareQualifiers_QNAME, FareQualifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialQualiferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SpecialNeedQualifiers")
    public JAXBElement<SpecialQualiferType> createSpecialNeedQualifiers(SpecialQualiferType value) {
        return new JAXBElement<SpecialQualiferType>(_SpecialNeedQualifiers_QNAME, SpecialQualiferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripPurposeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TripPurposeQualifier")
    public JAXBElement<TripPurposeListType> createTripPurposeQualifier(TripPurposeListType value) {
        return new JAXBElement<TripPurposeListType>(_TripPurposeQualifier_QNAME, TripPurposeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatMetadata")
    public JAXBElement<SeatMetadataType> createSeatMetadata(SeatMetadataType value) {
        return new JAXBElement<SeatMetadataType>(_SeatMetadata_QNAME, SeatMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatMapMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatMapMetadata")
    public JAXBElement<SeatMapMetadataType> createSeatMapMetadata(SeatMapMetadataType value) {
        return new JAXBElement<SeatMapMetadataType>(_SeatMapMetadata_QNAME, SeatMapMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelerMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TravelerMetadata")
    public JAXBElement<TravelerMetadataType> createTravelerMetadata(TravelerMetadataType value) {
        return new JAXBElement<TravelerMetadataType>(_TravelerMetadata_QNAME, TravelerMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PenaltyMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PenaltyMetadata")
    public JAXBElement<PenaltyMetadataType> createPenaltyMetadata(PenaltyMetadataType value) {
        return new JAXBElement<PenaltyMetadataType>(_PenaltyMetadata_QNAME, PenaltyMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PassengerMetadata")
    public JAXBElement<PassengerMetadataType> createPassengerMetadata(PassengerMetadataType value) {
        return new JAXBElement<PassengerMetadataType>(_PassengerMetadata_QNAME, PassengerMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceInfoAssocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AssociatedService")
    public JAXBElement<ServiceInfoAssocType> createAssociatedService(ServiceInfoAssocType value) {
        return new JAXBElement<ServiceInfoAssocType>(_AssociatedService_QNAME, ServiceInfoAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelerInfoAssocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AssociatedTraveler")
    public JAXBElement<TravelerInfoAssocType> createAssociatedTraveler(TravelerInfoAssocType value) {
        return new JAXBElement<TravelerInfoAssocType>(_AssociatedTraveler_QNAME, TravelerInfoAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceInfoAssocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "IncludedService")
    public JAXBElement<ServiceInfoAssocType> createIncludedService(ServiceInfoAssocType value) {
        return new JAXBElement<ServiceInfoAssocType>(_IncludedService_QNAME, ServiceInfoAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferDetailInfoAssocType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferDetailAssociation")
    public JAXBElement<OfferDetailInfoAssocType> createOfferDetailAssociation(OfferDetailInfoAssocType value) {
        return new JAXBElement<OfferDetailInfoAssocType>(_OfferDetailAssociation_QNAME, OfferDetailInfoAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BaggageOffer")
    public JAXBElement<BaggageOfferType> createBaggageOffer(BaggageOfferType value) {
        return new JAXBElement<BaggageOfferType>(_BaggageOffer_QNAME, BaggageOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarePriceDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FarePriceDetail")
    public JAXBElement<FarePriceDetailType> createFarePriceDetail(FarePriceDetailType value) {
        return new JAXBElement<FarePriceDetailType>(_FarePriceDetail_QNAME, FarePriceDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferPriceLeadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareLeadPrices")
    public JAXBElement<OfferPriceLeadType> createFareLeadPrices(OfferPriceLeadType value) {
        return new JAXBElement<OfferPriceLeadType>(_FareLeadPrices_QNAME, OfferPriceLeadType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OtherOffer")
    public JAXBElement<OtherOfferType> createOtherOffer(OtherOfferType value) {
        return new JAXBElement<OtherOfferType>(_OtherOffer_QNAME, OtherOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatOffer")
    public JAXBElement<SeatOfferType> createSeatOffer(SeatOfferType value) {
        return new JAXBElement<SeatOfferType>(_SeatOffer_QNAME, SeatOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferInstructionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferInstructions")
    public JAXBElement<OfferInstructionType> createOfferInstructions(OfferInstructionType value) {
        return new JAXBElement<OfferInstructionType>(_OfferInstructions_QNAME, OfferInstructionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferClassUpgradeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ClassOfServiceUpgrade")
    public JAXBElement<OfferClassUpgradeType> createClassOfServiceUpgrade(OfferClassUpgradeType value) {
        return new JAXBElement<OfferClassUpgradeType>(_ClassOfServiceUpgrade_QNAME, OfferClassUpgradeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeFormInstructionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FreeFormTextInstruction")
    public JAXBElement<FreeFormInstructionsType> createFreeFormTextInstruction(FreeFormInstructionsType value) {
        return new JAXBElement<FreeFormInstructionsType>(_FreeFormTextInstruction_QNAME, FreeFormInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvGuaranteeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "InventoryGuarantee")
    public JAXBElement<InvGuaranteeType> createInventoryGuarantee(InvGuaranteeType value) {
        return new JAXBElement<InvGuaranteeType>(_InventoryGuarantee_QNAME, InvGuaranteeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferMatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Match")
    public JAXBElement<OfferMatchType> createMatch(OfferMatchType value) {
        return new JAXBElement<OfferMatchType>(_Match_QNAME, OfferMatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PTCQuantityPricedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PTC_Priced")
    public JAXBElement<PTCQuantityPricedType> createPTCPriced(PTCQuantityPricedType value) {
        return new JAXBElement<PTCQuantityPricedType>(_PTCPriced_QNAME, PTCQuantityPricedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferPenaltyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferPenalty")
    public JAXBElement<OfferPenaltyType> createOfferPenalty(OfferPenaltyType value) {
        return new JAXBElement<OfferPenaltyType>(_OfferPenalty_QNAME, OfferPenaltyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlineOffersSnapshotType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AllOffersSnapshot")
    public JAXBElement<AirlineOffersSnapshotType> createAllOffersSnapshot(AirlineOffersSnapshotType value) {
        return new JAXBElement<AirlineOffersSnapshotType>(_AllOffersSnapshot_QNAME, AirlineOffersSnapshotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlineOffersSnapshotType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AirlineOfferSnapshot")
    public JAXBElement<AirlineOffersSnapshotType> createAirlineOfferSnapshot(AirlineOffersSnapshotType value) {
        return new JAXBElement<AirlineOffersSnapshotType>(_AirlineOfferSnapshot_QNAME, AirlineOffersSnapshotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OfferItemStatus")
    public JAXBElement<OfferStatusType> createOfferItemStatus(OfferStatusType value) {
        return new JAXBElement<OfferStatusType>(_OfferItemStatus_QNAME, OfferStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketByTimeLimitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TicketByTimeLimit")
    public JAXBElement<TicketByTimeLimitType> createTicketByTimeLimit(TicketByTimeLimitType value) {
        return new JAXBElement<TicketByTimeLimitType>(_TicketByTimeLimit_QNAME, TicketByTimeLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderAssociations")
    public JAXBElement<OrderItemAssociationType> createOrderAssociations(OrderItemAssociationType value) {
        return new JAXBElement<OrderItemAssociationType>(_OrderAssociations_QNAME, OrderItemAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderCommissionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderCommision")
    public JAXBElement<OrderCommissionType> createOrderCommision(OrderCommissionType value) {
        return new JAXBElement<OrderCommissionType>(_OrderCommision_QNAME, OrderCommissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderID")
    public JAXBElement<OrderIDType> createOrderID(OrderIDType value) {
        return new JAXBElement<OrderIDType>(_OrderID_QNAME, OrderIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BaggageItem")
    public JAXBElement<BaggageItemType> createBaggageItem(BaggageItemType value) {
        return new JAXBElement<BaggageItemType>(_BaggageItem_QNAME, BaggageItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BaggageOfferItem")
    public JAXBElement<BaggageItemType> createBaggageOfferItem(BaggageItemType value) {
        return new JAXBElement<BaggageItemType>(_BaggageOfferItem_QNAME, BaggageItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DetailedFlightItem")
    public JAXBElement<FlightItemType> createDetailedFlightItem(FlightItemType value) {
        return new JAXBElement<FlightItemType>(_DetailedFlightItem_QNAME, FlightItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FlightItem")
    public JAXBElement<FlightItemType> createFlightItem(FlightItemType value) {
        return new JAXBElement<FlightItemType>(_FlightItem_QNAME, FlightItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OtherItem")
    public JAXBElement<OtherItemType> createOtherItem(OtherItemType value) {
        return new JAXBElement<OtherItemType>(_OtherItem_QNAME, OtherItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OtherOfferItem")
    public JAXBElement<OtherItemType> createOtherOfferItem(OtherItemType value) {
        return new JAXBElement<OtherItemType>(_OtherOfferItem_QNAME, OtherItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PaymentStatus")
    public JAXBElement<PaymentStatusType> createPaymentStatus(PaymentStatusType value) {
        return new JAXBElement<PaymentStatusType>(_PaymentStatus_QNAME, PaymentStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatOfferItem")
    public JAXBElement<SeatItemType> createSeatOfferItem(SeatItemType value) {
        return new JAXBElement<SeatItemType>(_SeatOfferItem_QNAME, SeatItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodesetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Status")
    public JAXBElement<CodesetType> createStatus(CodesetType value) {
        return new JAXBElement<CodesetType>(_Status_QNAME, CodesetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankAccountMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BankAccountMethod")
    public JAXBElement<BankAccountMethodType> createBankAccountMethod(BankAccountMethodType value) {
        return new JAXBElement<BankAccountMethodType>(_BankAccountMethod_QNAME, BankAccountMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CashMethod")
    public JAXBElement<CashMethodType> createCashMethod(CashMethodType value) {
        return new JAXBElement<CashMethodType>(_CashMethod_QNAME, CashMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectBillMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DirectBillMethod")
    public JAXBElement<DirectBillMethodType> createDirectBillMethod(DirectBillMethodType value) {
        return new JAXBElement<DirectBillMethodType>(_DirectBillMethod_QNAME, DirectBillMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiscChargeMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MiscChargeMethod")
    public JAXBElement<MiscChargeMethodType> createMiscChargeMethod(MiscChargeMethodType value) {
        return new JAXBElement<MiscChargeMethodType>(_MiscChargeMethod_QNAME, MiscChargeMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OtherMethod")
    public JAXBElement<OtherMethodType> createOtherMethod(OtherMethodType value) {
        return new JAXBElement<OtherMethodType>(_OtherMethod_QNAME, OtherMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCardMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PaymentCardMethod")
    public JAXBElement<PaymentCardMethodType> createPaymentCardMethod(PaymentCardMethodType value) {
        return new JAXBElement<PaymentCardMethodType>(_PaymentCardMethod_QNAME, PaymentCardMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "RedemptionMethod")
    public JAXBElement<RedemptionMethodType> createRedemptionMethod(RedemptionMethodType value) {
        return new JAXBElement<RedemptionMethodType>(_RedemptionMethod_QNAME, RedemptionMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoucherMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "VoucherMethod")
    public JAXBElement<VoucherMethodType> createVoucherMethod(VoucherMethodType value) {
        return new JAXBElement<VoucherMethodType>(_VoucherMethod_QNAME, VoucherMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltBaggageOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AltBaggageOffer")
    public JAXBElement<AltBaggageOfferType> createAltBaggageOffer(AltBaggageOfferType value) {
        return new JAXBElement<AltBaggageOfferType>(_AltBaggageOffer_QNAME, AltBaggageOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltPricedFlightOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AltPricedFlightOffer")
    public JAXBElement<AltPricedFlightOfferType> createAltPricedFlightOffer(AltPricedFlightOfferType value) {
        return new JAXBElement<AltPricedFlightOfferType>(_AltPricedFlightOffer_QNAME, AltPricedFlightOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltOtherOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AltOtherOffer")
    public JAXBElement<AltOtherOfferType> createAltOtherOffer(AltOtherOfferType value) {
        return new JAXBElement<AltOtherOfferType>(_AltOtherOffer_QNAME, AltOtherOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltSeatOfferType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AltSeatOffer")
    public JAXBElement<AltSeatOfferType> createAltSeatOffer(AltSeatOfferType value) {
        return new JAXBElement<AltSeatOfferType>(_AltSeatOffer_QNAME, AltSeatOfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderPenaltyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderPenalty")
    public JAXBElement<OrderPenaltyType> createOrderPenalty(OrderPenaltyType value) {
        return new JAXBElement<OrderPenaltyType>(_OrderPenalty_QNAME, OrderPenaltyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodesetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ItemStatus")
    public JAXBElement<CodesetType> createItemStatus(CodesetType value) {
        return new JAXBElement<CodesetType>(_ItemStatus_QNAME, CodesetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierFeeInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CarrierFeeInfo")
    public JAXBElement<CarrierFeeInfoType> createCarrierFeeInfo(CarrierFeeInfoType value) {
        return new JAXBElement<CarrierFeeInfoType>(_CarrierFeeInfo_QNAME, CarrierFeeInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CarrierFeeTax")
    public JAXBElement<TaxDetailType> createCarrierFeeTax(TaxDetailType value) {
        return new JAXBElement<TaxDetailType>(_CarrierFeeTax_QNAME, TaxDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AddlReferenceID")
    public JAXBElement<AdditionalReferenceType> createAddlReferenceID(AdditionalReferenceType value) {
        return new JAXBElement<AdditionalReferenceType>(_AddlReferenceID_QNAME, AdditionalReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponSoldAirlineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CheckedInAirlineInfo")
    public JAXBElement<CouponSoldAirlineType> createCheckedInAirlineInfo(CouponSoldAirlineType value) {
        return new JAXBElement<CouponSoldAirlineType>(_CheckedInAirlineInfo_QNAME, CouponSoldAirlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CouponInfo")
    public JAXBElement<CouponInfoType> createCouponInfo(CouponInfoType value) {
        return new JAXBElement<CouponInfoType>(_CouponInfo_QNAME, CouponInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponEffectiveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CouponEffective")
    public JAXBElement<CouponEffectiveType> createCouponEffective(CouponEffectiveType value) {
        return new JAXBElement<CouponEffectiveType>(_CouponEffective_QNAME, CouponEffectiveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponSoldAirlineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CouponSoldAirline")
    public JAXBElement<CouponSoldAirlineType> createCouponSoldAirline(CouponSoldAirlineType value) {
        return new JAXBElement<CouponSoldAirlineType>(_CouponSoldAirline_QNAME, CouponSoldAirlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponSoldAirlineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CurrentAirlineInfo")
    public JAXBElement<CouponSoldAirlineType> createCurrentAirlineInfo(CouponSoldAirlineType value) {
        return new JAXBElement<CouponSoldAirlineType>(_CurrentAirlineInfo_QNAME, CouponSoldAirlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponFlightSegmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FlightSegment")
    public JAXBElement<CouponFlightSegmentType> createFlightSegment(CouponFlightSegmentType value) {
        return new JAXBElement<CouponFlightSegmentType>(_FlightSegment_QNAME, CouponFlightSegmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponSoldAirlineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FlownAirlineInfo")
    public JAXBElement<CouponSoldAirlineType> createFlownAirlineInfo(CouponSoldAirlineType value) {
        return new JAXBElement<CouponSoldAirlineType>(_FlownAirlineInfo_QNAME, CouponSoldAirlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InConnectionWithType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "InConnectionWithInfo")
    public JAXBElement<InConnectionWithType> createInConnectionWithInfo(InConnectionWithType value) {
        return new JAXBElement<InConnectionWithType>(_InConnectionWithInfo_QNAME, InConnectionWithType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TicketDocQuantity")
    public JAXBElement<BigInteger> createTicketDocQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_TicketDocQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponTravelerCoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Traveller")
    public JAXBElement<CouponTravelerCoreType> createTraveller(CouponTravelerCoreType value) {
        return new JAXBElement<CouponTravelerCoreType>(_Traveller_QNAME, CouponTravelerCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFareTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "BaseFare")
    public JAXBElement<BaseFareTransactionType> createBaseFare(BaseFareTransactionType value) {
        return new JAXBElement<BaseFareTransactionType>(_BaseFare_QNAME, BaseFareTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquivFareTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "EquivFare")
    public JAXBElement<EquivFareTransactionType> createEquivFare(EquivFareTransactionType value) {
        return new JAXBElement<EquivFareTransactionType>(_EquivFare_QNAME, EquivFareTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ETFareInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FareInfo")
    public JAXBElement<ETFareInfoType> createFareInfo(ETFareInfoType value) {
        return new JAXBElement<ETFareInfoType>(_FareInfo_QNAME, ETFareInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalFareTransactionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Total")
    public JAXBElement<TotalFareTransactionType> createTotal(TotalFareTransactionType value) {
        return new JAXBElement<TotalFareTransactionType>(_Total_QNAME, TotalFareTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnstructuredFareCalcType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "UnstructuredFareCalcInfo")
    public JAXBElement<UnstructuredFareCalcType> createUnstructuredFareCalcInfo(UnstructuredFareCalcType value) {
        return new JAXBElement<UnstructuredFareCalcType>(_UnstructuredFareCalcInfo_QNAME, UnstructuredFareCalcType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptedPaymentFormType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PaymentForm")
    public JAXBElement<AcceptedPaymentFormType> createPaymentForm(AcceptedPaymentFormType value) {
        return new JAXBElement<AcceptedPaymentFormType>(_PaymentForm_QNAME, AcceptedPaymentFormType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMethodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PaymentMethod")
    public JAXBElement<PaymentMethodType> createPaymentMethod(PaymentMethodType value) {
        return new JAXBElement<PaymentMethodType>(_PaymentMethod_QNAME, PaymentMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExitPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ExitRowPosition")
    public JAXBElement<ExitPositionType> createExitRowPosition(ExitPositionType value) {
        return new JAXBElement<ExitPositionType>(_ExitRowPosition_QNAME, ExitPositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WingPositionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "WingPosition")
    public JAXBElement<WingPositionType> createWingPosition(WingPositionType value) {
        return new JAXBElement<WingPositionType>(_WingPosition_QNAME, WingPositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatDataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SeatData")
    public JAXBElement<SeatDataType> createSeatData(SeatDataType value) {
        return new JAXBElement<SeatDataType>(_SeatData_QNAME, SeatDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RFICType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "RFIC")
    public JAXBElement<RFICType> createRFIC(RFICType value) {
        return new JAXBElement<RFICType>(_RFIC_QNAME, RFICType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCoreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceCore")
    public JAXBElement<ServiceCoreType> createServiceCore(ServiceCoreType value) {
        return new JAXBElement<ServiceCoreType>(_ServiceCore_QNAME, ServiceCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceFilter")
    public JAXBElement<Object> createServiceFilter(Object value) {
        return new JAXBElement<Object>(_ServiceFilter_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SrvcLocationAirportType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AirportFulfillmentLocation")
    public JAXBElement<SrvcLocationAirportType> createAirportFulfillmentLocation(SrvcLocationAirportType value) {
        return new JAXBElement<SrvcLocationAirportType>(_AirportFulfillmentLocation_QNAME, SrvcLocationAirportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SrvcLocationAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OtherFulfillmentLocation")
    public JAXBElement<SrvcLocationAddressType> createOtherFulfillmentLocation(SrvcLocationAddressType value) {
        return new JAXBElement<SrvcLocationAddressType>(_OtherFulfillmentLocation_QNAME, SrvcLocationAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServicePriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServicePrice")
    public JAXBElement<ServicePriceType> createServicePrice(ServicePriceType value) {
        return new JAXBElement<ServicePriceType>(_ServicePrice_QNAME, ServicePriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFulfillmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceFulfillment")
    public JAXBElement<ServiceFulfillmentType> createServiceFulfillment(ServiceFulfillmentType value) {
        return new JAXBElement<ServiceFulfillmentType>(_ServiceFulfillment_QNAME, ServiceFulfillmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCouponType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceCoupon")
    public JAXBElement<ServiceCouponType> createServiceCoupon(ServiceCouponType value) {
        return new JAXBElement<ServiceCouponType>(_ServiceCoupon_QNAME, ServiceCouponType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceItemQuantityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceItemQuantityRules")
    public JAXBElement<ServiceItemQuantityType> createServiceItemQuantityRules(ServiceItemQuantityType value) {
        return new JAXBElement<ServiceItemQuantityType>(_ServiceItemQuantityRules_QNAME, ServiceItemQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstrClassUpgradeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "EligibleServiceClassUpgrades")
    public JAXBElement<InstrClassUpgradeType> createEligibleServiceClassUpgrades(InstrClassUpgradeType value) {
        return new JAXBElement<InstrClassUpgradeType>(_EligibleServiceClassUpgrades_QNAME, InstrClassUpgradeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstrCommissionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceCommissionInfo")
    public JAXBElement<InstrCommissionType> createServiceCommissionInfo(InstrCommissionType value) {
        return new JAXBElement<InstrCommissionType>(_ServiceCommissionInfo_QNAME, InstrCommissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstrRemarkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceFreeFormTextInstruction")
    public JAXBElement<InstrRemarkType> createServiceFreeFormTextInstruction(InstrRemarkType value) {
        return new JAXBElement<InstrRemarkType>(_ServiceFreeFormTextInstruction_QNAME, InstrRemarkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstrSpecialBookingType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceBookingInstructions")
    public JAXBElement<InstrSpecialBookingType> createServiceBookingInstructions(InstrSpecialBookingType value) {
        return new JAXBElement<InstrSpecialBookingType>(_ServiceBookingInstructions_QNAME, InstrSpecialBookingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceIDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ServiceID")
    public JAXBElement<ServiceIDType> createServiceID(ServiceIDType value) {
        return new JAXBElement<ServiceIDType>(_ServiceID_QNAME, ServiceIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FltDepartQualifiedQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AirportCityDeparture")
    public JAXBElement<FltDepartQualifiedQueryType> createAirportCityDeparture(FltDepartQualifiedQueryType value) {
        return new JAXBElement<FltDepartQualifiedQueryType>(_AirportCityDeparture_QNAME, FltDepartQualifiedQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FltArriveQualifiedQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AirportCityArrival")
    public JAXBElement<FltArriveQualifiedQueryType> createAirportCityArrival(FltArriveQualifiedQueryType value) {
        return new JAXBElement<FltArriveQualifiedQueryType>(_AirportCityArrival_QNAME, FltArriveQualifiedQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityCountryDepartType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CountryDeparture")
    public JAXBElement<AffinityCountryDepartType> createCountryDeparture(AffinityCountryDepartType value) {
        return new JAXBElement<AffinityCountryDepartType>(_CountryDeparture_QNAME, AffinityCountryDepartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityCountryArriveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CountryArrival")
    public JAXBElement<AffinityCountryArriveType> createCountryArrival(AffinityCountryArriveType value) {
        return new JAXBElement<AffinityCountryArriveType>(_CountryArrival_QNAME, AffinityCountryArriveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityReferencePointDepartType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ReferencePointDeparture")
    public JAXBElement<AffinityReferencePointDepartType> createReferencePointDeparture(AffinityReferencePointDepartType value) {
        return new JAXBElement<AffinityReferencePointDepartType>(_ReferencePointDeparture_QNAME, AffinityReferencePointDepartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityReferencePointArriveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ReferencePointArrival")
    public JAXBElement<AffinityReferencePointArriveType> createReferencePointArrival(AffinityReferencePointArriveType value) {
        return new JAXBElement<AffinityReferencePointArriveType>(_ReferencePointArrival_QNAME, AffinityReferencePointArriveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityStateProvDepartType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "StateProvDeparture")
    public JAXBElement<AffinityStateProvDepartType> createStateProvDeparture(AffinityStateProvDepartType value) {
        return new JAXBElement<AffinityStateProvDepartType>(_StateProvDeparture_QNAME, AffinityStateProvDepartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityStateProvArriveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "StateProvArrival")
    public JAXBElement<AffinityStateProvArriveType> createStateProvArrival(AffinityStateProvArriveType value) {
        return new JAXBElement<AffinityStateProvArriveType>(_StateProvArrival_QNAME, AffinityStateProvArriveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeadDatePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "LeadDatePeriod")
    public JAXBElement<LeadDatePeriodType> createLeadDatePeriod(LeadDatePeriodType value) {
        return new JAXBElement<LeadDatePeriodType>(_LeadDatePeriod_QNAME, LeadDatePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeadTimePeriodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "LeadTimePeriod")
    public JAXBElement<LeadTimePeriodType> createLeadTimePeriod(LeadTimePeriodType value) {
        return new JAXBElement<LeadTimePeriodType>(_LeadTimePeriod_QNAME, LeadTimePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountProgramType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "DiscountProgramQualifier")
    public JAXBElement<DiscountProgramType> createDiscountProgramQualifier(DiscountProgramType value) {
        return new JAXBElement<DiscountProgramType>(_DiscountProgramQualifier_QNAME, DiscountProgramType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StayPeriodDateRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "StayPeriodDateRange")
    public JAXBElement<StayPeriodDateRangeType> createStayPeriodDateRange(StayPeriodDateRangeType value) {
        return new JAXBElement<StayPeriodDateRangeType>(_StayPeriodDateRange_QNAME, StayPeriodDateRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StayPeriodSeasonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "StayPeriodSeason")
    public JAXBElement<StayPeriodSeasonType> createStayPeriodSeason(StayPeriodSeasonType value) {
        return new JAXBElement<StayPeriodSeasonType>(_StayPeriodSeason_QNAME, StayPeriodSeasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupBudgetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "GroupBudget")
    public JAXBElement<GroupBudgetType> createGroupBudget(GroupBudgetType value) {
        return new JAXBElement<GroupBudgetType>(_GroupBudget_QNAME, GroupBudgetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonBudgetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PerPersonBudget")
    public JAXBElement<PersonBudgetType> createPerPersonBudget(PersonBudgetType value) {
        return new JAXBElement<PersonBudgetType>(_PerPersonBudget_QNAME, PersonBudgetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlinePreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AirlinePreferences")
    public JAXBElement<AirlinePreferencesType> createAirlinePreferences(AirlinePreferencesType value) {
        return new JAXBElement<AirlinePreferencesType>(_AirlinePreferences_QNAME, AirlinePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlliancePreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AlliancePreferences")
    public JAXBElement<AlliancePreferencesType> createAlliancePreferences(AlliancePreferencesType value) {
        return new JAXBElement<AlliancePreferencesType>(_AlliancePreferences_QNAME, AlliancePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CabinPreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "CabinPreferences")
    public JAXBElement<CabinPreferencesType> createCabinPreferences(CabinPreferencesType value) {
        return new JAXBElement<CabinPreferencesType>(_CabinPreferences_QNAME, CabinPreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightPreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FlightPreferences")
    public JAXBElement<FlightPreferencesType> createFlightPreferences(FlightPreferencesType value) {
        return new JAXBElement<FlightPreferencesType>(_FlightPreferences_QNAME, FlightPreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarePreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FarePreferences")
    public JAXBElement<FarePreferencesType> createFarePreferences(FarePreferencesType value) {
        return new JAXBElement<FarePreferencesType>(_FarePreferences_QNAME, FarePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestPricingPreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "PricingMethodPreference")
    public JAXBElement<BestPricingPreferencesType> createPricingMethodPreference(BestPricingPreferencesType value) {
        return new JAXBElement<BestPricingPreferencesType>(_PricingMethodPreference_QNAME, BestPricingPreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FltSegmentMaxTimePreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "SegMaxTimePreferences")
    public JAXBElement<FltSegmentMaxTimePreferencesType> createSegMaxTimePreferences(FltSegmentMaxTimePreferencesType value) {
        return new JAXBElement<FltSegmentMaxTimePreferencesType>(_SegMaxTimePreferences_QNAME, FltSegmentMaxTimePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferPreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TransferPreferences")
    public JAXBElement<TransferPreferencesType> createTransferPreferences(TransferPreferencesType value) {
        return new JAXBElement<TransferPreferencesType>(_TransferPreferences_QNAME, TransferPreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelTimePreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TripTime")
    public JAXBElement<TravelTimePreferencesType> createTripTime(TravelTimePreferencesType value) {
        return new JAXBElement<TravelTimePreferencesType>(_TripTime_QNAME, TravelTimePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelDistancePreferencesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "TripDistance")
    public JAXBElement<TravelDistancePreferencesType> createTripDistance(TravelDistancePreferencesType value) {
        return new JAXBElement<TravelDistancePreferencesType>(_TripDistance_QNAME, TravelDistancePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirShopReqAffinityQueryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Affinity")
    public JAXBElement<AirShopReqAffinityQueryType> createAffinity(AirShopReqAffinityQueryType value) {
        return new JAXBElement<AirShopReqAffinityQueryType>(_Affinity_QNAME, AirShopReqAffinityQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirShopFlightSpecificType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "FlightSpecific")
    public JAXBElement<AirShopFlightSpecificType> createFlightSpecific(AirShopFlightSpecificType value) {
        return new JAXBElement<AirShopFlightSpecificType>(_FlightSpecific_QNAME, AirShopFlightSpecificType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdViewProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "AirShoppingProcessing")
    public JAXBElement<OrdViewProcessType> createAirShoppingProcessing(OrdViewProcessType value) {
        return new JAXBElement<OrdViewProcessType>(_AirShoppingProcessing_QNAME, OrdViewProcessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItinReshopParamsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ItinReshopParameters")
    public JAXBElement<ItinReshopParamsType> createItinReshopParameters(ItinReshopParamsType value) {
        return new JAXBElement<ItinReshopParamsType>(_ItinReshopParameters_QNAME, ItinReshopParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ShoppingQueryTypeGroup")
    public JAXBElement<Object> createShoppingQueryTypeGroup(Object value) {
        return new JAXBElement<Object>(_ShoppingQueryTypeGroup_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItinReshopMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Metadata")
    public JAXBElement<ItinReshopMetadataType> createMetadata(ItinReshopMetadataType value) {
        return new JAXBElement<ItinReshopMetadataType>(_Metadata_QNAME, ItinReshopMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItinReshopProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "ItinReshopProcessing")
    public JAXBElement<ItinReshopProcessType> createItinReshopProcessing(ItinReshopProcessType value) {
        return new JAXBElement<ItinReshopProcessType>(_ItinReshopProcessing_QNAME, ItinReshopProcessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdCancelParamsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderCancelParameters")
    public JAXBElement<OrdCancelParamsType> createOrderCancelParameters(OrdCancelParamsType value) {
        return new JAXBElement<OrdCancelParamsType>(_OrderCancelParameters_QNAME, OrdCancelParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdCancelProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderCancelProcessing")
    public JAXBElement<OrdCancelProcessType> createOrderCancelProcessing(OrdCancelProcessType value) {
        return new JAXBElement<OrdCancelProcessType>(_OrderCancelProcessing_QNAME, OrdCancelProcessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdChangeMetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderChangeMetadata")
    public JAXBElement<OrdChangeMetadataType> createOrderChangeMetadata(OrdChangeMetadataType value) {
        return new JAXBElement<OrdChangeMetadataType>(_OrderChangeMetadata_QNAME, OrdChangeMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderListParamsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderListParameters")
    public JAXBElement<OrderListParamsType> createOrderListParameters(OrderListParamsType value) {
        return new JAXBElement<OrderListParamsType>(_OrderListParameters_QNAME, OrderListParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderListProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderListProcessing")
    public JAXBElement<OrderListProcessType> createOrderListProcessing(OrderListProcessType value) {
        return new JAXBElement<OrderListProcessType>(_OrderListProcessing_QNAME, OrderListProcessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderViewProcessType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderViewProcessing")
    public JAXBElement<OrderViewProcessType> createOrderViewProcessing(OrderViewProcessType value) {
        return new JAXBElement<OrderViewProcessType>(_OrderViewProcessing_QNAME, OrderViewProcessType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdRetrieveParamsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "OrderRetrieveParameters")
    public JAXBElement<OrdRetrieveParamsType> createOrderRetrieveParameters(OrdRetrieveParamsType value) {
        return new JAXBElement<OrdRetrieveParamsType>(_OrderRetrieveParameters_QNAME, OrdRetrieveParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Begin", scope = SeatComponentType.Location.Space.ColumnRange.class)
    public JAXBElement<String> createSeatComponentTypeLocationSpaceColumnRangeBegin(String value) {
        return new JAXBElement<String>(_SeatComponentTypeLocationsLocationSpaceColumnRangeBegin_QNAME, String.class, SeatComponentType.Location.Space.ColumnRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "End", scope = SeatComponentType.Location.Space.ColumnRange.class)
    public JAXBElement<String> createSeatComponentTypeLocationSpaceColumnRangeEnd(String value) {
        return new JAXBElement<String>(_SeatComponentTypeLocationsLocationSpaceColumnRangeEnd_QNAME, String.class, SeatComponentType.Location.Space.ColumnRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Begin", scope = SeatComponentType.Location.Space.RowRange.class)
    public JAXBElement<BigInteger> createSeatComponentTypeLocationSpaceRowRangeBegin(BigInteger value) {
        return new JAXBElement<BigInteger>(_SeatComponentTypeLocationsLocationSpaceColumnRangeBegin_QNAME, BigInteger.class, SeatComponentType.Location.Space.RowRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "End", scope = SeatComponentType.Location.Space.RowRange.class)
    public JAXBElement<BigInteger> createSeatComponentTypeLocationSpaceRowRangeEnd(BigInteger value) {
        return new JAXBElement<BigInteger>(_SeatComponentTypeLocationsLocationSpaceColumnRangeEnd_QNAME, BigInteger.class, SeatComponentType.Location.Space.RowRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MinimumQuantity", scope = ServiceBundle.Selection.class)
    public JAXBElement<BigInteger> createServiceBundleSelectionMinimumQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_ListOfServiceBundleTypeServiceBundleSelectionMinimumQuantity_QNAME, BigInteger.class, ServiceBundle.Selection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "MaximumQuantity", scope = ServiceBundle.Selection.class)
    public JAXBElement<BigInteger> createServiceBundleSelectionMaximumQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_ListOfServiceBundleTypeServiceBundleSelectionMaximumQuantity_QNAME, BigInteger.class, ServiceBundle.Selection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgPartiesType.Participants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Participants", scope = MsgPartiesType.class)
    public JAXBElement<MsgPartiesType.Participants> createMsgPartiesTypeParticipants(MsgPartiesType.Participants value) {
        return new JAXBElement<MsgPartiesType.Participants>(_MsgPartiesTypeParticipants_QNAME, MsgPartiesType.Participants.class, MsgPartiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgPartiesType.Recipient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Recipient", scope = MsgPartiesType.class)
    public JAXBElement<MsgPartiesType.Recipient> createMsgPartiesTypeRecipient(MsgPartiesType.Recipient value) {
        return new JAXBElement<MsgPartiesType.Recipient>(_MsgPartiesTypeRecipient_QNAME, MsgPartiesType.Recipient.class, MsgPartiesType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Minimum", scope = OfferTermsType.class)
    public JAXBElement<BigInteger> createOfferTermsTypeMinimum(BigInteger value) {
        return new JAXBElement<BigInteger>(new QName("http://www.iata.org/IATA/EDIST", "Minimum"), BigInteger.class, OfferTermsType.class, value);
    }

    @XmlElementDecl(namespace = "http://www.iata.org/IATA/EDIST", name = "Maximum", scope = OfferTermsType.class)
    public JAXBElement<BigInteger> createOfferTermsTypeMaximum(BigInteger value) {
        return new JAXBElement<BigInteger>(new QName("http://www.iata.org/IATA/EDIST", "Maximum"), BigInteger.class, OfferTermsType.class, value);
    }

}
