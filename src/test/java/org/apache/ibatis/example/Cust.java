package org.apache.ibatis.example;

/**
 * @author xiaodong.chang
 * @date 2022-02-18 16:34
 */
public class Cust {

  private String id;

  private String custname;

  /**
   * 证件号码
   */
  private String certNo;

  public String getId()
  {
    return id;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public String getCustname()
  {
    return custname;
  }

  public void setCustname(String custname)
  {
    this.custname = custname;
  }

  public String getCertNo()
  {
    return certNo;
  }

  public void setCertNo(String certNo)
  {
    this.certNo = certNo;
  }
}
