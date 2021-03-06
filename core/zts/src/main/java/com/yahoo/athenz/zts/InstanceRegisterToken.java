//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zts;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;
import com.yahoo.rdl.*;

//
// InstanceRegisterToken -
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstanceRegisterToken {
    public String provider;
    public String domain;
    public String service;
    public String attestationData;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, String> attributes;

    public InstanceRegisterToken setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return provider;
    }
    public InstanceRegisterToken setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return domain;
    }
    public InstanceRegisterToken setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return service;
    }
    public InstanceRegisterToken setAttestationData(String attestationData) {
        this.attestationData = attestationData;
        return this;
    }
    public String getAttestationData() {
        return attestationData;
    }
    public InstanceRegisterToken setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public Map<String, String> getAttributes() {
        return attributes;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != InstanceRegisterToken.class) {
                return false;
            }
            InstanceRegisterToken a = (InstanceRegisterToken) another;
            if (provider == null ? a.provider != null : !provider.equals(a.provider)) {
                return false;
            }
            if (domain == null ? a.domain != null : !domain.equals(a.domain)) {
                return false;
            }
            if (service == null ? a.service != null : !service.equals(a.service)) {
                return false;
            }
            if (attestationData == null ? a.attestationData != null : !attestationData.equals(a.attestationData)) {
                return false;
            }
            if (attributes == null ? a.attributes != null : !attributes.equals(a.attributes)) {
                return false;
            }
        }
        return true;
    }
}
