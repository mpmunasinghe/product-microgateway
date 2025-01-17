/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.choreo.connect.enforcer.config;

import org.wso2.carbon.apimgt.common.gateway.dto.JWTConfigurationDto;
import org.wso2.carbon.apimgt.common.gateway.jwttransformer.JWTTransformer;
import org.wso2.choreo.connect.enforcer.config.dto.AnalyticsDTO;
import org.wso2.choreo.connect.enforcer.config.dto.AuthServiceConfigurationDto;
import org.wso2.choreo.connect.enforcer.config.dto.CacheDto;
import org.wso2.choreo.connect.enforcer.config.dto.CredentialDto;
import org.wso2.choreo.connect.enforcer.config.dto.EventHubConfigurationDto;
import org.wso2.choreo.connect.enforcer.config.dto.ExtendedTokenIssuerDto;
import org.wso2.choreo.connect.enforcer.config.dto.JWTIssuerConfigurationDto;
import org.wso2.choreo.connect.enforcer.config.dto.ThrottleConfigDto;

import java.util.HashMap;
import java.util.Map;

/**
 * Configuration holder class for Microgateway.
 */
public class EnforcerConfig {

    private AuthServiceConfigurationDto authService;
    private EventHubConfigurationDto eventHub;
    private Map<String, ExtendedTokenIssuerDto> issuersMap = new HashMap<>();
    private CredentialDto apimCredentials;
    private ThrottleConfigDto throttleConfig;
    private JWTConfigurationDto jwtConfigurationDto;
    private CacheDto cacheDto;
    private JWTIssuerConfigurationDto jwtIssuerConfigurationDto;
    private CredentialDto[] jwtUsersCredentials;
    private String publicCertificatePath = "";
    private String privateKeyPath = "";
    private AnalyticsDTO analyticsConfig;
    private Map<String, JWTTransformer> jwtTransformerMap = new HashMap<>();

    public AuthServiceConfigurationDto getAuthService() {
        return authService;
    }

    public void setAuthService(AuthServiceConfigurationDto authService) {
        this.authService = authService;
    }


    public EventHubConfigurationDto getEventHub() {
        return eventHub;
    }

    public void setEventHub(EventHubConfigurationDto eventHub) {
        this.eventHub = eventHub;
    }

    public Map<String, ExtendedTokenIssuerDto> getIssuersMap() {
        return issuersMap;
    }

    public void setIssuersMap(Map<String, ExtendedTokenIssuerDto> issuersMap) {
        this.issuersMap = issuersMap;
    }

    public CredentialDto getApimCredentials() {
        return apimCredentials;
    }

    public void setApimCredentials(CredentialDto apimCredentials) {
        this.apimCredentials = apimCredentials;
    }

    public ThrottleConfigDto getThrottleConfig() {
        return throttleConfig;
    }

    public void setThrottleConfig(ThrottleConfigDto throttleConfig) {
        this.throttleConfig = throttleConfig;
    }

    public void setJwtConfigurationDto(JWTConfigurationDto jwtConfigurationDto) {
        this.jwtConfigurationDto = jwtConfigurationDto;
    }

    public void setJwtIssuerConfigurationDto(JWTIssuerConfigurationDto jwtIssuerConfigurationDto) {
        this.jwtIssuerConfigurationDto = jwtIssuerConfigurationDto;
    }

    public JWTIssuerConfigurationDto getJwtIssuerConfigurationDto() {
        return jwtIssuerConfigurationDto;
    }

    public void setJwtUsersCredentials(CredentialDto[] credentialDtos) {
        this.jwtUsersCredentials = credentialDtos;
    }

    public CredentialDto[] getJwtUsersCredentials() {
        return jwtUsersCredentials;
    }

    public JWTConfigurationDto getJwtConfigurationDto() {
        return jwtConfigurationDto;
    }

    public CacheDto getCacheDto() {
        return cacheDto;
    }

    public void setCacheDto(CacheDto cacheDto) {
        this.cacheDto = cacheDto;
    }

    public void setPublicCertificatePath(String certPath) {
        this.publicCertificatePath = certPath;
    }

    public String getPublicCertificatePath() {
        return publicCertificatePath;
    }

    public void setPrivateKeyPath(String keyPath) {
        this.privateKeyPath = keyPath;
    }

    public String getPrivateKeyPath() {
        return privateKeyPath;
    }

    public AnalyticsDTO getAnalyticsConfig() {
        return analyticsConfig;
    }

    public void setAnalyticsConfig(AnalyticsDTO analyticsConfig) {
        this.analyticsConfig = analyticsConfig;
    }

    public Map<String, JWTTransformer> getJwtTransformerMap() {
        return jwtTransformerMap;
    }

    public void setJwtTransformerMap(Map<String, JWTTransformer> jwtTransformerMap) {
        this.jwtTransformerMap = jwtTransformerMap;
    }
}
