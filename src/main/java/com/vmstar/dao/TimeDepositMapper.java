package com.vmstar.dao;

import com.vmstar.db.TimeDepositDO;
import org.springframework.stereotype.Repository;

/**
 * @author star
 * @Date 2019/10/18.
 * @Description: No Description Yet.
 */
@Repository
public interface TimeDepositMapper {
  TimeDepositDO selectOne();
}
