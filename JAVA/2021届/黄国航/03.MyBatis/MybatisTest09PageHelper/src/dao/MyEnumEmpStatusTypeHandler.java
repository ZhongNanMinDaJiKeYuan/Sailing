package dao;

import bean.EmpStatus;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyEnumEmpStatusTypeHandler implements TypeHandler<EmpStatus> {


    /**
     * 定义当前数据如何保存到数据库中
     */
    @Override
    public void setParameter(PreparedStatement ps, int i, EmpStatus parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.getCode().toString());
    }

    /**
     * getResult()定义从数据库的数据到对象如何生成
     */
    @Override
    public EmpStatus getResult(ResultSet rs, String columnName) throws SQLException {
        int code = rs.getInt(columnName);
        return EmpStatus.getStatusByCode(code);
    }

    @Override
    public EmpStatus getResult(ResultSet rs, int columnIndex) throws SQLException {
        int code = rs.getInt(columnIndex);
        return EmpStatus.getStatusByCode(code);
    }

    @Override
    public EmpStatus getResult(CallableStatement cs, int columnIndex) throws SQLException {
        int code = cs.getInt(columnIndex);
        return EmpStatus.getStatusByCode(code);
    }
}
