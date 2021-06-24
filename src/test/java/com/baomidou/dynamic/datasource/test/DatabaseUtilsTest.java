package com.baomidou.dynamic.datasource.test;

import com.baomidou.dynamic.datasource.toolkit.DataBaseUtils;
import org.junit.Test;

public class DatabaseUtilsTest {

    @Test
    public void testMysql() {
        boolean b = DataBaseUtils.validConnection("jdbc:mysql://39.108.158.138:3306/seata_order?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true&useSSL=false",
                "root", "123456", "com.mysql.jdbc.Driver", "select 1");
    }
}
