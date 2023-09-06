package xyz.pplax.pplaxnetdisk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.pplax.pplaxnetdisk.service.FilePermissionService;
import xyz.pplax.pplaxnetdisk.domain.FilePermission;
import xyz.pplax.pplaxnetdisk.mapper.FilePermissionMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional(rollbackFor=Exception.class)
public class FilePermissionServiceImpl extends ServiceImpl<FilePermissionMapper, FilePermission> implements FilePermissionService {

}
