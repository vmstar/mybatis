package com.vmstar.controller;

import com.vmstar.service.ITimeDepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author star
 * @Date 2019/10/17.
 * @Description: No Description Yet.
 */
@RestController
public class TimeDepositController {

  @Autowired
  private ITimeDepositService timeDepositService;

  @RequestMapping("/time_deposit")
  public String index() {
    timeDepositService.getTimeDeposits();
    return "";
  }

}
