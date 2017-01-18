//
// This file generated by rdl 1.4.10. Do not modify!
//
package com.yahoo.athenz.zts;

import com.yahoo.rdl.*;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//
// ZTSHandler is the interface that the service implementation must implement
//
public interface ZTSHandler { 
    public ServiceIdentity getServiceIdentity(ResourceContext context, String domainName, String serviceName);
    public ServiceIdentityList getServiceIdentityList(ResourceContext context, String domainName);
    public PublicKeyEntry getPublicKeyEntry(ResourceContext context, String domainName, String serviceName, String keyId);
    public HostServices getHostServices(ResourceContext context, String host);
    public void getDomainSignedPolicyData(ResourceContext context, String domainName, String matchingTag, GetDomainSignedPolicyDataResult result);
    public RoleToken getRoleToken(ResourceContext context, String domainName, String role, Integer minExpiryTime, Integer maxExpiryTime, String proxyForPrincipal);
    public RoleToken postRoleCertificateRequest(ResourceContext context, String domainName, String roleName, RoleCertificateRequest req);
    public Access getAccess(ResourceContext context, String domainName, String roleName, String principal);
    public RoleAccess getRoleAccess(ResourceContext context, String domainName, String principal);
    public TenantDomains getTenantDomains(ResourceContext context, String providerDomainName, String userName, String roleName, String serviceName);
    public Identity postInstanceInformation(ResourceContext context, InstanceInformation info);
    public Identity postInstanceRefreshRequest(ResourceContext context, String domain, String service, InstanceRefreshRequest req);
    public Identity postAWSInstanceInformation(ResourceContext context, AWSInstanceInformation info);
    public Identity postAWSCertificateRequest(ResourceContext context, String domain, String service, AWSCertificateRequest req);
    public AWSTemporaryCredentials getAWSTemporaryCredentials(ResourceContext context, String domainName, String role);
    public DomainMetrics postDomainMetrics(ResourceContext context, String domainName, DomainMetrics req);
    public Schema getRdlSchema(ResourceContext context);
    public ResourceContext newResourceContext(HttpServletRequest request, HttpServletResponse response);
}