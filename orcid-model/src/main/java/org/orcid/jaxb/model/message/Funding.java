/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2013 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="orcid:funding-type" minOccurs="1" maxOccurs="1" />
 *         &lt;element ref="orcid:organization-defined-type" minOccurs="1" maxOccurs="1" />
 * 		&lt;element ref="orcid:funding-title" minOccurs="0" /> *						
 * 		&lt;element ref="orcid:short-description" minOccurs="0"/>			
 * 		&lt;element ref="orcid:amount" minOccurs="0" maxOccurs="1"/>
 * 		&lt;element ref="orcid:url" minOccurs="0" maxOccurs="1"/>				
 * 		&lt;element name="start-date" type="orcid:fuzzy-date" minOccurs="0" maxOccurs="1" />
 * 		&lt;element name="end-date" type="orcid:fuzzy-date" minOccurs="0" maxOccurs="1" />												
 * 		&lt;element ref="orcid:funding-external-identifiers" minOccurs="0" maxOccurs="1"/>
 * 		&lt;element ref="orcid:funding-contributors" minOccurs="0" maxOccurs="1"/>
 * 		&lt;element ref="orcid:organization" minOccurs="1" maxOccurs="1"/>				
 * 		&lt;element ref="orcid:source" minOccurs="0"  maxOccurs="1" />
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}put-code"/>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "putCode", "type", "organizationDefinedFundingType", "title", "description", "amount", "url", "startDate", "endDate", "fundingExternalIdentifiers", "fundingContributors",
        "organization", "source" })
@XmlRootElement(name = "funding")
public class Funding implements VisibilityType, Activity, Serializable {

    private final static long serialVersionUID = 1L;

    @XmlElement(name = "funding-type", required = true)
    protected FundingType type;
    @XmlElement(name = "organization-defined-type")
    protected OrganizationDefinedFundingType organizationDefinedFundingType;
    @XmlElement(name = "funding-title", required = true)
    protected FundingTitle title;    
    @XmlElement(required = true)
    protected Organization organization;
    @XmlElement(name = "short-description")
    protected String description;
    @XmlElement(name = "amount")
    protected Amount amount;
    @XmlElement
    protected Url url;
    @XmlElement(name = "start-date")
    protected FuzzyDate startDate;
    @XmlElement(name = "end-date")
    protected FuzzyDate endDate;
    @XmlElement(name = "funding-external-identifiers")
    protected FundingExternalIdentifiers fundingExternalIdentifiers;
    @XmlElement(name = "funding-contributors")
    protected FundingContributors fundingContributors;
    protected Source source;
    @XmlAttribute(name = "put-code")
    protected String putCode;
    @XmlAttribute(required = true)
    protected Visibility visibility;

    public FundingTitle getTitle() {
        return title;
    }

    public void setTitle(FundingTitle title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FundingType getType() {
        return type;
    }

    public void setType(FundingType type) {
        this.type = type;
    }

    public OrganizationDefinedFundingType getOrganizationDefinedFundingType() {
        return organizationDefinedFundingType;
    }

    public void setOrganizationDefinedFundingType(OrganizationDefinedFundingType organizationDefinedFundingType) {
        this.organizationDefinedFundingType = organizationDefinedFundingType;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Source getSource() {
        return source;
    }

    @Override
    public String retrieveSourcePath() {
        if (source == null) {
            return null;
        }
        SourceOrcid sourceOrcid = source.getSourceOrcid();
        return sourceOrcid.getPath();
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @Override
    public String getPutCode() {
        return putCode;
    }

    public void setPutCode(String putCode) {
        this.putCode = putCode;
    }

    public FundingExternalIdentifiers getFundingExternalIdentifiers() {
        return fundingExternalIdentifiers;
    }

    public void setFundingExternalIdentifiers(FundingExternalIdentifiers fundingExternalIdentifiers) {
        this.fundingExternalIdentifiers = fundingExternalIdentifiers;
    }

    public FundingContributors getFundingContributors() {
        return fundingContributors;
    }

    public void setFundingContributors(FundingContributors fundingContributors) {
        this.fundingContributors = fundingContributors;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return possible object is {@link FuzzyDate }
     * 
     */
    public FuzzyDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *            allowed object is {@link FuzzyDate }
     * 
     */
    public void setStartDate(FuzzyDate value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return possible object is {@link FuzzyDate }
     * 
     */
    public FuzzyDate getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *            allowed object is {@link FuzzyDate }
     * 
     */
    public void setEndDate(FuzzyDate value) {
        this.endDate = value;
    }

    /**
     * 
     * Note that put-code is not part of hashCode or equals! This is to allow
     * better de-duplication.
     * 
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((organizationDefinedFundingType == null) ? 0 : organizationDefinedFundingType.hashCode());
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        result = prime * result + ((organization == null) ? 0 : organization.hashCode());
        result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + ((fundingExternalIdentifiers == null) ? 0 : fundingExternalIdentifiers.hashCode());
        result = prime * result + ((fundingContributors == null) ? 0 : fundingContributors.hashCode());
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
        return result;
    }

    /**
     * 
     * Note that put-code is not part of hashCode or equals! This is to allow
     * better de-duplication.
     * 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funding other = (Funding) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else {
            if (!title.equals(other.title))
                return false;
        }
        if (description == null) {
            if (other.description != null)
                return false;
        } else {
            if (!description.equals(other.description))
                return false;
        }
        if (organization == null) {
            if (other.organization != null)
                return false;
        } else {
            if (!organization.equals(other.organization))
                return false;
        }
        if (fundingExternalIdentifiers == null) {
            if (other.fundingExternalIdentifiers != null)
                return false;
        } else {
            if (!fundingExternalIdentifiers.equals(other.fundingExternalIdentifiers))
                return false;
        }
        if (fundingContributors == null) {
            if (other.fundingContributors != null)
                return false;
        } else {
            if (!fundingContributors.equals(other.fundingContributors))
                return false;
        }
        if (type == null) {
            if (other.type != null)
                return false;
        } else {
            if (!type.equals(other.type))
                return false;
        }
        
        if(organizationDefinedFundingType == null) {
            if(other.organizationDefinedFundingType != null)
                return false;
        } else {
            if(!organizationDefinedFundingType.equals(other.organizationDefinedFundingType))
                return false;
        }
        if (amount == null) {
            if (other.amount != null)
                return false;
        } else {
            if (!amount.equals(other.amount))
                return false;
        }
        if (url == null) {
            if (other.url != null)
                return false;
        } else {
            if (!url.equals(other.url))
                return false;
        }
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        if (endDate == null) {
            if (other.endDate != null)
                return false;
        } else if (!endDate.equals(other.endDate))
            return false;
        return true;
    }

    /**
     * Indicates if two funding are ORCID duplicated. Two fundings will be
     * duplicated if they have the same type, title, organization, description
     * and amount
     * 
     * @return true if the two fundings are duplicated according to ORCID
     *         requirements
     * */
    public boolean isDuplicated(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funding other = (Funding) obj;

        if (type == null) {
            if (other.type != null)
                return false;
        } else {
            if (!type.equals(other.type))
                return false;
        }

        if(organizationDefinedFundingType == null) {
            if(other.organizationDefinedFundingType != null)
                return false;
        } else {
            if(!organizationDefinedFundingType.equals(other.organizationDefinedFundingType))
                return false;
        }
        
        if (title == null) {
            if (other.title != null)
                return false;
        } else {
            if (!title.equals(other.title))
                return false;
        }

        if (organization == null) {
            if (other.organization != null)
                return false;
        } else {
            if (!organization.equals(other.organization))
                return false;
        }
        if (amount == null) {
            if (other.amount != null)
                return false;
        } else {
            if (!amount.equals(other.amount))
                return false;
        }
        if (description == null) {
            if (other.description != null)
                return false;
        } else {
            if (!description.equals(other.description))
                return false;
        }
        return true;
    }

}
