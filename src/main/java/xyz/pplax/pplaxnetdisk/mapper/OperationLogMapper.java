package xyz.pplax.pplaxnetdisk.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import xyz.pplax.pplaxnetdisk.domain.OperationLog;

@Mapper
public interface OperationLogMapper extends BaseMapper<OperationLog> {

}
