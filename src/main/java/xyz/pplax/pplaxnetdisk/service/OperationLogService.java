package xyz.pplax.pplaxnetdisk.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import xyz.pplax.pplaxnetdisk.domain.OperationLog;

import java.util.List;

public interface OperationLogService  extends IService<OperationLog> {
    IPage<OperationLog> selectOperationLogPage(Integer current, Integer size);

    List<OperationLog> selectOperationLog();

    void insertOperationLog(OperationLog operationlogBean);
}
