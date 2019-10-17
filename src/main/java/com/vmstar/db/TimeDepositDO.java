package com.vmstar.db;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author star
 * @Date 2019/10/18.
 * @Description: No Description Yet.
 */
public class TimeDepositDO {
  private long id;
  private int platform;
  private String prodCode;
  private String prodName;

  public long getId() {
    return id;
  }

  public TimeDepositDO setId(long id) {
    this.id = id;
    return this;
  }

  public int getPlatform() {
    return platform;
  }

  public TimeDepositDO setPlatform(int platform) {
    this.platform = platform;
    return this;
  }

  public String getProdCode() {
    return prodCode;
  }

  public TimeDepositDO setProdCode(String prodCode) {
    this.prodCode = prodCode;
    return this;
  }

  public String getProdName() {
    return prodName;
  }

  public TimeDepositDO setProdName(String prodName) {
    this.prodName = prodName;
    return this;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this)
      .append("id", id)
      .append("platform", platform)
      .append("prodCode", prodCode)
      .append("prodName", prodName)
      .toString();
  }
}
