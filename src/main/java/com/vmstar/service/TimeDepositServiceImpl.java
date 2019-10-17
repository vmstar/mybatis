package com.vmstar.service;

import com.vmstar.dao.TimeDepositMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author star
 * @Date 2019/10/17.
 * @Description: No Description Yet.
 */
@Service
public class TimeDepositServiceImpl implements ITimeDepositService {

  @Autowired
  private TimeDepositMapper timeDepositMapper;

  @Override
  public void getTimeDeposits() {
   System.out.println(timeDepositMapper.selectOne());
  }
}
