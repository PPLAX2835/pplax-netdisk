package xyz.pplax.netdisk.core.config;

import org.apache.ibatis.mapping.DatabaseIdProvider;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 数据库连接配置
 */
@Component
public class MyDatabaseIdProvider implements DatabaseIdProvider {

    private static final String DATABASE_MYSQL = "MySQL";
    private static final String DATABASE_SQLITE = "SQLite";

    /**
     * 根据数据源连接数据库
     * @param dataSource
     * @return
     * @throws SQLException
     */
    @Override
    public String getDatabaseId(DataSource dataSource) throws SQLException {
        Connection conn = dataSource.getConnection();
        String dbName = conn.getMetaData().getDatabaseProductName();
        String dbAlias = "";
        switch (dbName) {
            case DATABASE_MYSQL:
                dbAlias = "mysql";
                break;
            case DATABASE_SQLITE:
                dbAlias = "sqlite";
                break;
            default:
                break;
        }
        return dbAlias;
    }

}
