/*
 * This file is part of Hopsworks
 * Copyright (C) 2019, Logical Clocks AB. All rights reserved
 *
 * Hopsworks is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Hopsworks is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 * PURPOSE.  See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package io.hops.util.featurestore.dtos.storageconnector;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * DTO containing the human-readable information of a S3 connection for a feature store, can be converted to JSON or
 * XML representation using jaxb.
 */
@XmlRootElement
public class FeaturestoreS3ConnectorDTO extends FeaturestoreStorageConnectorDTO {
  
  private String accessKey;
  private String secretKey;
  private String bucket;
  
  public FeaturestoreS3ConnectorDTO() {
    super();
  }

  public FeaturestoreS3ConnectorDTO(String accessKey, String secretKey, String bucket) {
    super();
    this.accessKey = accessKey;
    this.secretKey = secretKey;
    this.bucket = bucket;
  }

  @XmlElement
  public String getAccessKey() {
    return accessKey;
  }
  
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }
  
  @XmlElement
  public String getSecretKey() {
    return secretKey;
  }
  
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }
  
  @XmlElement
  public String getBucket() {
    return bucket;
  }
  
  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  @Override
  public String toString() {
    return "FeaturestoreS3ConnectorDTO{" +
        "accessKey='" + accessKey + '\'' +
        ", secretKey='" + secretKey + '\'' +
        ", bucket='" + bucket + '\'' +
        '}';
  }
}