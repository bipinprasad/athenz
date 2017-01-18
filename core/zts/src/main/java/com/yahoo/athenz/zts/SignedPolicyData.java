//
// This file generated by rdl 1.4.10. Do not modify!
//

package com.yahoo.athenz.zts;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// SignedPolicyData - A representation of policies object defined in a given
// server.
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class SignedPolicyData {
    public PolicyData policyData;
    public String zmsSignature;
    public String zmsKeyId;
    public Timestamp modified;
    public Timestamp expires;

    public SignedPolicyData setPolicyData(PolicyData policyData) {
        this.policyData = policyData;
        return this;
    }
    public PolicyData getPolicyData() {
        return policyData;
    }
    public SignedPolicyData setZmsSignature(String zmsSignature) {
        this.zmsSignature = zmsSignature;
        return this;
    }
    public String getZmsSignature() {
        return zmsSignature;
    }
    public SignedPolicyData setZmsKeyId(String zmsKeyId) {
        this.zmsKeyId = zmsKeyId;
        return this;
    }
    public String getZmsKeyId() {
        return zmsKeyId;
    }
    public SignedPolicyData setModified(Timestamp modified) {
        this.modified = modified;
        return this;
    }
    public Timestamp getModified() {
        return modified;
    }
    public SignedPolicyData setExpires(Timestamp expires) {
        this.expires = expires;
        return this;
    }
    public Timestamp getExpires() {
        return expires;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != SignedPolicyData.class) {
                return false;
            }
            SignedPolicyData a = (SignedPolicyData) another;
            if (policyData == null ? a.policyData != null : !policyData.equals(a.policyData)) {
                return false;
            }
            if (zmsSignature == null ? a.zmsSignature != null : !zmsSignature.equals(a.zmsSignature)) {
                return false;
            }
            if (zmsKeyId == null ? a.zmsKeyId != null : !zmsKeyId.equals(a.zmsKeyId)) {
                return false;
            }
            if (modified == null ? a.modified != null : !modified.equals(a.modified)) {
                return false;
            }
            if (expires == null ? a.expires != null : !expires.equals(a.expires)) {
                return false;
            }
        }
        return true;
    }
}