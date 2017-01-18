//
// This file generated by rdl 1.4.10. Do not modify!
//

package com.yahoo.athenz.zts;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// AWSCertificateRequest - AWSCertificateRequest - a certificate signing
// request
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class AWSCertificateRequest {
    public String csr;

    public AWSCertificateRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return csr;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != AWSCertificateRequest.class) {
                return false;
            }
            AWSCertificateRequest a = (AWSCertificateRequest) another;
            if (csr == null ? a.csr != null : !csr.equals(a.csr)) {
                return false;
            }
        }
        return true;
    }
}