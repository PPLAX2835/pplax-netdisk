package xyz.pplax.pplaxnetdisk.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.pplax.pplaxnetdisk.service.OperationLogService;
import xyz.pplax.pplaxnetdisk.domain.OperationLog;
import xyz.pplax.pplaxnetdisk.mapper.OperationLogMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional(rollbackFor=Exception.class)
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements OperationLogService {

    @Autowired
    OperationLogMapper operationLogMapper;

    @Override
    public IPage<OperationLog> selectOperationLogPage(Integer current, Integer size) {
        IPage<OperationLog> page = new Page<>(current, size);
        IPage<OperationLog> list = operationLogMapper.selectPage(page, null);
        return list;
    }

    @Override
    public List<OperationLog> selectOperationLog() {
        List<OperationLog> result = operationLogMapper.selectList(null);
        return result;
    }

    @Override
    public void insertOperationLog(OperationLog operationlog) {
        operationLogMapper.insert(operationlog);

    }


}
